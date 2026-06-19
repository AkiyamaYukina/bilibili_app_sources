package com.bilibili.studio.centerplus.util;

import com.bilibili.studio.material.util.UtilsKt;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/util/c.class */
public final class c {
    public static void a(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        a(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static String b(String str) {
        if (str == null || str.isEmpty() || !str.contains("/")) {
            return "";
        }
        String strSubstring = str.substring(str.lastIndexOf("/") + 1);
        String strSubstring2 = strSubstring;
        if (strSubstring.contains(UtilsKt.DOT)) {
            strSubstring2 = strSubstring.substring(0, strSubstring.indexOf(UtilsKt.DOT));
        }
        return strSubstring2;
    }

    public static void c(File file, String str) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            byte[] bArr = new byte[65536];
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                File file2 = new File(new File(str), zipEntryNextElement.getName());
                if (zipEntryNextElement.isDirectory()) {
                    if (file2.isFile()) {
                        file2.delete();
                    }
                    file2.mkdirs();
                } else {
                    File parentFile = file2.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                        while (true) {
                            try {
                                int i7 = bufferedInputStream.read(bArr, 0, 65536);
                                if (i7 == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream.write(bArr, 0, i7);
                                }
                            } finally {
                            }
                        }
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                    } finally {
                    }
                }
            }
            zipFile.close();
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
