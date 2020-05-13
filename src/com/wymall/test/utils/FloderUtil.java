package com.wymall.test.utils;

import java.io.File;
import java.util.LinkedList;
import java.util.List;


/**
 * 文件夹及里面文件删除
 *
 * @author ISSUSER
 */
public class FloderUtil {
    public boolean delAllFile(String pathname) {
        boolean flag = false;
        File file = new File(pathname);
        if (!file.exists()) {
            return flag;
        }
        if (!file.isDirectory()) {
            return flag;
        }
        String[] tempList = file.list();
        File temp = null;
        for (int i = 0; i < tempList.length; i++) {
            if (pathname.endsWith(File.separator)) {
                temp = new File(pathname + tempList[i]);
            } else {
                temp = new File(pathname + File.separator + tempList[i]);
            }
            if (temp.isFile()) {
                temp.delete();
            }
            if (temp.isDirectory()) {
                delAllFile(pathname + "/" + tempList[i]);
                delFolder(pathname + "/" + tempList[i]);
                flag = true;

            }
        }
        return flag;
    }

    public void delFolder(String folderPath) {
        try {
            delAllFile(folderPath);
            String filePath = folderPath;
            filePath = filePath.toString();
            java.io.File myFilePath = new java.io.File(filePath);
            myFilePath.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件夹递归，返回文件
     *
     * @return
     */
    LinkedList<String> list = new LinkedList<String>();

    public List<String> getListFloder(String path) {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            for (File file2 : files) {
                if (file2.isFile()) {
                    //System.out.println("文件夹:" + file2.getAbsolutePath());
                    list.add(file2.toString());
                } else {
                    getListFloder(file2.toString());
                    //	System.out.println("文件:" + file2.getAbsolutePath());
                }
            }
        } else {
            System.out.println("文件不存在...");
        }
        return list;
    }

    public static String getLastFloder(String filePath) {
        String newPath = filePath.replaceAll("\\\\", "/");

        int index = newPath.lastIndexOf('/');

        if (index != -1) {
            return newPath.substring(index + 1);
        }
        return newPath;
    }
}
