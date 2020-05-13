package com.wymall.test.utils.commons.xml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.dom4j.tree.DefaultAttribute;

public class XmlHander {
    private Logger log = Logger.getLogger(XmlHander.class);
    private Document doc;
    private Element currentElement;

    public Document getDoc() {
        return this.doc;
    }

    public Element getEle() {
        return this.currentElement;
    }

    public XmlHander createXML() {
        this.doc = DocumentHelper.createDocument();
        return this;
    }

    public XmlHander loadXML(String XML) {
        this.doc = buildDoc(XML);
        return this;
    }

    public XmlHander loadXML(InputStream is) {
        this.doc = buildDoc(is);
        return this;
    }

    private Document buildDoc(String XML) {
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(XML);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return doc;
    }

    private Document buildDoc(InputStream is) {
        Document doc = null;
        try {
            doc = new SAXReader().read(is);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public List<Element> getNodes(String xpath) {
        List list = null;
        try {
            list = this.doc.selectNodes(xpath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public XmlHander visitNode(String xpath) {
        try {
            this.currentElement = ((Element) this.doc.selectSingleNode(xpath));
        } catch (Exception e) {
            this.currentElement = null;
            e.printStackTrace();
        } finally {
            if (this.currentElement == null) {
                this.log.error("访问XML节点失败,xpath:" + xpath);
            }
        }
        return this;
    }

    public String getAttr(String attrName) {
        String value = null;
        try {
            value = this.currentElement.attributeValue(attrName);
        } catch (Exception e) {
            this.log.error("当前无访问节点,先调用visitNode定位要访问的节点!");
            e.printStackTrace();
        }
        return value;
    }

    public Map<String, String> getAttrs(String[] attrNames) {
        Map map = null;
        if ((attrNames != null) && (attrNames.length > 0)) {
            map = new LinkedHashMap();
            for (String attrName : attrNames) {
                String value = getAttr(attrName);
                map.put(attrName, value);
            }
        }
        return map;
    }

    public Map<String, String> getAllAttrs() {
        Map map = null;
        try {
            map = new LinkedHashMap();
            Iterator i;
            for (i = this.currentElement.attributes().iterator(); i.hasNext(); ) {
                Object attrObj = i.next();
                DefaultAttribute attr = (DefaultAttribute) attrObj;
                String attrName = attr.getName();
                String value = attr.getValue();
                map.put(attrName, value);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
        return map;
    }

    public String getText() {
        String val = null;
        val = this.currentElement.getText();
        return val;
    }

    public String getTextTrim() {
        String val = null;
        val = this.currentElement.getTextTrim();
        return val;
    }

    public void outPutXML(String savePath, String encode) {
        try {
            encode = (encode == null) || ("".equals(encode)) ? "UTF-8" : encode;
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(savePath), encode));

            getDoc().write(bw);
            bw.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outPutXMLPretty(String savePath, String encode) {
        try {
            OutputStream os = null;
            XMLWriter writer = null;
            try {
                File phyPath = new File(savePath);
                File folder = phyPath.getParentFile();
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                os = new FileOutputStream(savePath);

                OutputFormat format = OutputFormat.createPrettyPrint();
                encode = (encode == null) || ("".equals(encode)) ? "UTF-8" : encode;
                format.setEncoding(encode);
                format.setIndent(true);
                writer = new XMLWriter(os, format);
                writer.write(this.doc);
            } finally {
                if (writer != null) writer.close();
                if (os != null) os.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void outPutXMLCompact(String savePath, String encode) {
        try {
            OutputStream os = null;
            XMLWriter writer = null;
            try {
                File phyPath = new File(savePath);
                File folder = phyPath.getParentFile();
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                os = new FileOutputStream(savePath);

                OutputFormat format = OutputFormat.createCompactFormat();
                encode = (encode == null) || ("".equals(encode)) ? "UTF-8" : encode;
                format.setEncoding(encode);
                writer = new XMLWriter(os, format);
                writer.write(this.doc);
            } finally {
                if (writer != null) writer.close();
                if (os != null) os.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setDoc(Document doc) {
        // TODO Auto-generated method stub
        this.doc = doc;
    }
}
