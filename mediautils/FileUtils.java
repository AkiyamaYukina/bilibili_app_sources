package com.bilibili.mediautils;

import C80.D;
import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/FileUtils.class */
public class FileUtils {
    private static final long MAX_SIZE = 10485760;
    public static final String SCHEME_ASSET = "assets:/";
    public static final String SCHEME_FILE = "file://";
    public static final int SIZE_TYPE_B = 1;
    public static final int SIZE_TYPE_GB = 4;
    public static final int SIZE_TYPE_KB = 2;
    public static final int SIZE_TYPE_MB = 3;
    public static final String SUFFIX_JSON = ".json";
    public static final String SUFFIX_ZIP = ".zip";

    /* JADX WARN: Removed duplicated region for block: B:82:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00be -> B:92:0x012c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void appendText(java.lang.String r5, java.lang.String r6, boolean r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mediautils.FileUtils.appendText(java.lang.String, java.lang.String, boolean):void");
    }

    public static boolean appendText(String str, String str2) throws Throwable {
        FileWriter fileWriter;
        if (!existsFile(str)) {
            createFile(str);
        }
        checkFileSize(str);
        FileWriter fileWriter2 = null;
        try {
            try {
                FileWriter fileWriter3 = new FileWriter(new File(str), true);
                try {
                    fileWriter3.write(str2);
                    try {
                        fileWriter3.close();
                        return true;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return true;
                    }
                } catch (IOException e8) {
                    e = e8;
                    fileWriter = fileWriter3;
                    e.printStackTrace();
                    if (fileWriter == null) {
                        return false;
                    }
                    try {
                        fileWriter.close();
                        return false;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter3;
                    if (fileWriter2 != null) {
                        try {
                            fileWriter2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                fileWriter = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long checkFileSize(String str) {
        long length = getLength(str);
        if (length >= MAX_SIZE) {
            deleteFile(str);
            createFile(str);
        }
        return length;
    }

    public static boolean createFile(File file) {
        boolean zCreateNewFile = false;
        if (!file.exists()) {
            try {
                zCreateNewFile = file.createNewFile();
            } catch (IOException e7) {
                e7.printStackTrace();
                zCreateNewFile = false;
            }
        }
        return zCreateNewFile;
    }

    public static boolean createFile(String str) {
        File file = new File(str);
        boolean zCreateNewFile = false;
        if (!file.exists()) {
            try {
                zCreateNewFile = file.createNewFile();
            } catch (IOException e7) {
                e7.printStackTrace();
                zCreateNewFile = false;
            }
        }
        return zCreateNewFile;
    }

    public static boolean createFile(String str, String str2) {
        File file = new File(str, str2);
        boolean zCreateNewFile = false;
        if (!file.exists()) {
            try {
                zCreateNewFile = file.createNewFile();
            } catch (IOException e7) {
                e7.printStackTrace();
                zCreateNewFile = false;
            }
        }
        return zCreateNewFile;
    }

    public static boolean deleteDir(String str) {
        return deleteDirWithFile(new File(str));
    }

    public static boolean deleteDirWithFile(File file) {
        boolean zDelete = false;
        if (file != null) {
            zDelete = false;
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    zDelete = false;
                    if (fileArrListFiles != null) {
                        zDelete = false;
                        for (File file2 : fileArrListFiles) {
                            if (file2.isFile()) {
                                file2.delete();
                            } else if (file2.isDirectory()) {
                                deleteDirWithFile(file2);
                            }
                            zDelete = file.delete();
                        }
                    }
                } else {
                    zDelete = false;
                }
            }
        }
        return zDelete;
    }

    public static boolean deleteFile(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : file.delete();
    }

    public static boolean deleteFile(String str) {
        File file = new File(str);
        return (!file.exists() || file.isDirectory()) ? false : file.delete();
    }

    public static boolean deleteFile(String str, String str2) {
        File file = new File(str, str2);
        return (!file.exists() || file.isDirectory()) ? false : file.delete();
    }

    public static boolean existsFile(File file) {
        return file != null && file.exists() && file.isFile();
    }

    public static boolean existsFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return existsFile(new File(str));
    }

    private static String formatFileSize(long j7) {
        String strA;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j7 == 0) {
            return "0B";
        }
        if (j7 < 1024) {
            strA = D.a(decimalFormat, j7, new StringBuilder(), "B");
        } else if (j7 < 1048576) {
            strA = D.a(decimalFormat, j7 / 1024.0d, new StringBuilder(), "KB");
        } else if (j7 < 1073741824) {
            strA = D.a(decimalFormat, j7 / 1048576.0d, new StringBuilder(), "MB");
        } else {
            strA = D.a(decimalFormat, j7 / 1.073741824E9d, new StringBuilder(), "GB");
        }
        return strA;
    }

    private static double formetFileSize(long j7, int i7) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? 0.0d : Double.valueOf(decimalFormat.format(j7 / 1.073741824E9d)).doubleValue() : Double.valueOf(decimalFormat.format(j7 / 1048576.0d)).doubleValue() : Double.valueOf(decimalFormat.format(j7 / 1024.0d)).doubleValue() : Double.valueOf(decimalFormat.format(j7)).doubleValue();
    }

    public static long getLength(File file) {
        if (file.exists()) {
            return file.length();
        }
        return -1L;
    }

    public static long getLength(String str) {
        return getLength(new File(str));
    }

    public static byte[] readByteFromAsset(String str, AssetManager assetManager) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStreamOpen;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        try {
            inputStreamOpen = assetManager.open(str.replace(SCHEME_ASSET, ""));
            try {
                byteArrayOutputStream3 = new ByteArrayOutputStream();
            } catch (IOException e7) {
                byteArrayOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                byteArrayOutputStream = null;
            }
        } catch (IOException e8) {
            inputStreamOpen = null;
            byteArrayOutputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[512];
            while (true) {
                int i7 = inputStreamOpen.read(bArr);
                if (i7 == -1) {
                    break;
                }
                byteArrayOutputStream3.write(bArr, 0, i7);
            }
            byte[] byteArray = byteArrayOutputStream3.toByteArray();
            try {
                byteArrayOutputStream3.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
            try {
                inputStreamOpen.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            return byteArray;
        } catch (IOException e11) {
            byteArrayOutputStream2 = byteArrayOutputStream3;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            if (inputStreamOpen == null) {
                return null;
            }
            try {
                inputStreamOpen.close();
                return null;
            } catch (IOException e13) {
                e13.printStackTrace();
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = inputStreamOpen;
            byteArrayOutputStream = byteArrayOutputStream3;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static byte[] readByteFromFile(String str) throws Throwable {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream2;
        try {
            fileInputStream2 = new FileInputStream(new File(str));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[512];
                    while (true) {
                        int i7 = fileInputStream2.read(bArr);
                        if (i7 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i7);
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return byteArray;
                } catch (IOException e9) {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (fileInputStream2 == null) {
                        return null;
                    }
                    try {
                        fileInputStream2.close();
                        return null;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        return null;
                    }
                } catch (Throwable th) {
                    fileInputStream = fileInputStream2;
                    th = th;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e14) {
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                byteArrayOutputStream = null;
                fileInputStream = fileInputStream2;
                th = th2;
            }
        } catch (IOException e15) {
            byteArrayOutputStream = null;
            fileInputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            byteArrayOutputStream = null;
        }
    }

    public static String readStringFromAsset(String str, AssetManager assetManager) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStreamOpen;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        try {
            inputStreamOpen = assetManager.open(str.replace(SCHEME_ASSET, ""));
            try {
                byteArrayOutputStream3 = new ByteArrayOutputStream();
            } catch (IOException e7) {
                byteArrayOutputStream2 = null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                byteArrayOutputStream = null;
            }
        } catch (IOException e8) {
            inputStreamOpen = null;
            byteArrayOutputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[512];
            while (true) {
                int i7 = inputStreamOpen.read(bArr);
                if (i7 == -1) {
                    break;
                }
                byteArrayOutputStream3.write(bArr, 0, i7);
            }
            String string = byteArrayOutputStream3.toString();
            try {
                byteArrayOutputStream3.close();
            } catch (IOException e9) {
                e9.printStackTrace();
            }
            try {
                inputStreamOpen.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            return string;
        } catch (IOException e11) {
            byteArrayOutputStream2 = byteArrayOutputStream3;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            if (inputStreamOpen == null) {
                return null;
            }
            try {
                inputStreamOpen.close();
                return null;
            } catch (IOException e13) {
                e13.printStackTrace();
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = inputStreamOpen;
            byteArrayOutputStream = byteArrayOutputStream3;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static String readStringFromFile(String str) throws Throwable {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream2;
        try {
            fileInputStream2 = new FileInputStream(new File(str));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[512];
                    while (true) {
                        int i7 = fileInputStream2.read(bArr);
                        if (i7 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i7);
                    }
                    String string = byteArrayOutputStream.toString();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return string;
                } catch (IOException e9) {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (fileInputStream2 == null) {
                        return null;
                    }
                    try {
                        fileInputStream2.close();
                        return null;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        return null;
                    }
                } catch (Throwable th) {
                    fileInputStream = fileInputStream2;
                    th = th;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e14) {
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                byteArrayOutputStream = null;
                fileInputStream = fileInputStream2;
                th = th2;
            }
        } catch (IOException e15) {
            byteArrayOutputStream = null;
            fileInputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            byteArrayOutputStream = null;
        }
    }

    public static boolean unzip(String str, String str2) throws Throwable {
        ZipFile zipFile;
        InputStream inputStream;
        File file = new File(str2);
        if (!file.isDirectory()) {
            file.delete();
            if (!file.mkdirs()) {
                return false;
            }
        }
        byte[] bArr = new byte[32768];
        FileOutputStream fileOutputStream = null;
        try {
            zipFile = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                long size = -1;
                inputStream = null;
                fileOutputStream = null;
                while (enumerationEntries.hasMoreElements()) {
                    try {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        if (zipEntryNextElement != null) {
                            String name = zipEntryNextElement.getName();
                            String str3 = File.separator;
                            if (name.endsWith(str3)) {
                                continue;
                            } else {
                                size += zipEntryNextElement.getSize();
                                if (size == file.length()) {
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e7) {
                                        }
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e8) {
                                        }
                                    }
                                    try {
                                        zipFile.close();
                                        return true;
                                    } catch (IOException e9) {
                                        return true;
                                    }
                                }
                                inputStream = zipFile.getInputStream(zipEntryNextElement);
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(str3);
                                sb.append(zipEntryNextElement.getName());
                                File file2 = new File(sb.toString());
                                if (!file2.exists()) {
                                    String[] strArrSplit = zipEntryNextElement.getName().split(str3);
                                    String string = "";
                                    for (int i7 = 0; i7 < strArrSplit.length - 1; i7++) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(string);
                                        sb2.append(File.separator);
                                        sb2.append(strArrSplit[i7]);
                                        string = sb2.toString();
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(str2);
                                        sb3.append(string);
                                        File file3 = new File(sb3.toString());
                                        if (!file3.exists()) {
                                            file3.mkdir();
                                        }
                                    }
                                    file2.createNewFile();
                                }
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                while (true) {
                                    try {
                                        int i8 = inputStream.read(bArr);
                                        if (i8 <= 0) {
                                            break;
                                        }
                                        fileOutputStream2.write(bArr, 0, i8);
                                    } catch (IOException e10) {
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e11) {
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException e12) {
                                            }
                                        }
                                        if (zipFile == null) {
                                            return false;
                                        }
                                        try {
                                            zipFile.close();
                                            return false;
                                        } catch (IOException e13) {
                                            return false;
                                        }
                                    } catch (IllegalArgumentException e14) {
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e15) {
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException e16) {
                                            }
                                        }
                                        if (zipFile == null) {
                                            return false;
                                        }
                                        try {
                                            zipFile.close();
                                            return false;
                                        } catch (IOException e17) {
                                            return false;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e18) {
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException e19) {
                                            }
                                        }
                                        if (zipFile != null) {
                                            try {
                                                zipFile.close();
                                            } catch (IOException e20) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                                fileOutputStream = fileOutputStream2;
                            }
                        }
                    } catch (IOException e21) {
                        inputStream = inputStream;
                    } catch (IllegalArgumentException e22) {
                        inputStream = inputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream;
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e23) {
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e24) {
                    }
                }
                try {
                    zipFile.close();
                    return true;
                } catch (IOException e25) {
                    return true;
                }
            } catch (IOException e26) {
                inputStream = null;
                fileOutputStream = null;
            } catch (IllegalArgumentException e27) {
                inputStream = null;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (IOException e28) {
            zipFile = null;
            inputStream = null;
            fileOutputStream = null;
        } catch (IllegalArgumentException e29) {
            zipFile = null;
            inputStream = null;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            zipFile = null;
            inputStream = null;
        }
    }

    public static boolean writeByteArrayToFile(byte[] bArr, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str).getCanonicalPath());
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return true;
        } catch (Exception e7) {
            return false;
        }
    }

    public static boolean writeText(String str, String str2) throws Throwable {
        BufferedWriter bufferedWriter;
        if (!existsFile(str)) {
            createFile(str);
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                BufferedWriter bufferedWriter3 = new BufferedWriter(new FileWriter(str));
                try {
                    bufferedWriter3.write(str2);
                    try {
                        bufferedWriter3.close();
                        return true;
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return true;
                    }
                } catch (IOException e8) {
                    e = e8;
                    bufferedWriter = bufferedWriter3;
                    e.printStackTrace();
                    if (bufferedWriter == null) {
                        return false;
                    }
                    try {
                        bufferedWriter.close();
                        return false;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter3;
                    if (bufferedWriter2 != null) {
                        try {
                            bufferedWriter2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                bufferedWriter = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
