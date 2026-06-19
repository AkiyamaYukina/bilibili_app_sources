package com.bilibili.storagechecker;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.compose.ui.node.C4448z;
import androidx.fragment.app.D;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.storagechecker.Environment4;
import com.squareup.wire.internal.MathMethodsKt;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f105070a = {"vfat", "extfat", "ext4", "fuse", "sdcardfs", "texfat", "exfat"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f105071b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f105072c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f105073d;

    static {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        f105073d = D.a(str, ".fingerprintbili", str, sb);
    }

    public static String a(String str) {
        String strA;
        return (str == null || str.length() <= 0 || (strA = C4448z.a(1, 0, str)) == null) ? "" : strA.substring(0, strA.lastIndexOf(File.separator) + 1);
    }

    public static boolean b(String str) {
        String[] strArr = {"sd", "emmc", "ext_card", "external", "storage"};
        String[] strArr2 = {"secure", "asec", "firmware", "obb", "tmpfs"};
        for (int i7 = 0; i7 < 5; i7++) {
            if (str.contains(strArr2[i7])) {
                BLog.v("Storage_StorageDetect_CHECKSD", "exclude path contains " + strArr2[i7] + ",so exclude it!!!");
                return false;
            }
        }
        for (int i8 = 0; i8 < 5; i8++) {
            if (str.contains(strArr[i8])) {
                BLog.v("Storage_StorageDetect_CHECKSD", "include  path contain " + strArr[i8] + ",so include it!!");
                return true;
            }
        }
        return false;
    }

    public static boolean c(long j7) {
        byte[] bytes;
        long j8 = j7 / MathMethodsKt.NANOS_PER_SECOND;
        if (j8 % 2 != 0) {
            j8++;
        }
        String binaryString = Integer.toBinaryString((int) j8);
        if (binaryString == null || (bytes = binaryString.getBytes()) == null) {
            return false;
        }
        int length = bytes.length;
        for (int i7 = 1; i7 < length; i7++) {
            if (bytes[i7] != 48) {
                return false;
            }
        }
        if (j7 <= 0) {
            return false;
        }
        double d7 = (j8 * 1073741824) / j7;
        BLog.v("Storage_StorageDetect_CHECKSD", "isPhySize real_diff = " + d7);
        return d7 >= 1.063741824d && d7 <= 1.098741824d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r5, java.util.ArrayList r6) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.storagechecker.c.d(android.content.Context, java.util.ArrayList):void");
    }

    public static String e() {
        try {
            return Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;
        } catch (RuntimeException e7) {
            return "";
        }
    }

    public static String f(String[] strArr) {
        for (String str : strArr) {
            int length = str.length();
            if (length >= f105072c && length <= f105071b) {
                for (int i7 = 0; i7 < 7; i7++) {
                    String str2 = f105070a[i7];
                    if (str.equals(str2)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList<StorageItem> g(Context context) {
        ArrayList<StorageItem> arrayListK;
        if (!(context != null ? BLKV.getBLSharedPreferences(context, "base_core_file_multiprocess", false, 1024).getBoolean("scan_sd_double", false) : false)) {
            BLog.v("Storage_StorageDetect_CHECKSD", "getStorageList use api...");
            return j(context);
        }
        BLog.v("Storage_StorageDetect_CHECKSD", "getStorageList use two way...");
        ArrayList<StorageItem> arrayListJ = j(context);
        try {
            arrayListK = k(context);
        } catch (Throwable th) {
            th.printStackTrace();
            arrayListK = null;
        }
        ArrayList<StorageItem> arrayList = new ArrayList<>();
        arrayList.addAll(arrayListJ);
        for (int i7 = 0; i7 < arrayListJ.size(); i7++) {
            StorageItem storageItem = arrayListJ.get(i7);
            int i8 = 0;
            boolean z6 = false;
            StorageItem storageItem2 = null;
            while (true) {
                if (i8 >= arrayListK.size()) {
                    break;
                }
                storageItem2 = arrayListK.get(i8);
                if (storageItem2.path.equals(storageItem.path)) {
                    BLog.v("Storage_StorageDetect_CHECKSD", "getStorageList path equals->repeat:" + storageItem2.path);
                    z6 = true;
                    break;
                }
                boolean z7 = z6;
                if (storageItem2.getAvailSize() == storageItem.getAvailSize()) {
                    z7 = z6;
                    if (storageItem2.getTotalSize() == storageItem.getTotalSize()) {
                        z7 = z6;
                        if (storageItem2.checkHideFileExist(context)) {
                            BLog.v("Storage_StorageDetect_CHECKSD", "getStorageList file equals->repeat:" + storageItem2.path);
                            z7 = true;
                        }
                    }
                }
                i8++;
                z6 = z7;
            }
            if (!z6 && storageItem2 != null) {
                arrayList.add(storageItem2);
            }
        }
        return arrayList;
    }

    public static String h(String[] strArr) {
        for (String str : strArr) {
            BLog.v("Storage_StorageDetect_CHECKSD", "str1:" + str);
            String lowerCase = str.toLowerCase();
            if (lowerCase.equals("/storage/emulated")) {
                BLog.v("Storage_StorageDetect_CHECKSD", "path is /storage/emulated so return the inner SD path!!");
                return e();
            }
            if (lowerCase.contains("sd") ? !lowerCase.contains("extrasd_bind") || lowerCase.contains("emmc") || lowerCase.contains("ext_card") || lowerCase.contains("external") || lowerCase.contains("storage") : lowerCase.contains("emmc") || lowerCase.contains("ext_card") || lowerCase.contains("external") || lowerCase.contains("storage")) {
                String strA = a(str);
                BLog.v("Storage_StorageDetect_CHECKSD", "str3 :" + strA);
                String strE = e();
                BLog.v("Storage_StorageDetect_CHECKSD", "str4 :" + strE);
                String strA2 = a(strE);
                BLog.v("Storage_StorageDetect_CHECKSD", "str5 " + strA2);
                if (strA.equals(strA2)) {
                    BLog.v("Storage_StorageDetect_CHECKSD", "str3 == str5");
                    return str;
                }
                if (strA.equals(strE)) {
                    BLog.v("Storage_StorageDetect_CHECKSD", "str3 == str4");
                    return str;
                }
                if (strA.equals("/storage/")) {
                    BLog.v("Storage_StorageDetect_CHECKSD", "str3 == /storage/");
                    return str;
                }
                if (strA.equals("/storage/removable/")) {
                    BLog.v("Storage_StorageDetect_CHECKSD", "str3 == /storage/removable/");
                    return str;
                }
            }
            if (str.equals("/mnt/sdcard") || str.equals("/mnt/sdcard/external_sd") || str.equals("/mnt/ext_sdcard")) {
                return str;
            }
        }
        return null;
    }

    public static ArrayList<StorageItem> i(ArrayList<StorageItem> arrayList) {
        ArrayList<StorageItem> arrayList2 = new ArrayList<>();
        int i7 = 0;
        for (StorageItem storageItem : arrayList) {
            if (i7 == 0) {
                arrayList2.add(storageItem);
                i7 = storageItem.priority;
            } else {
                if (storageItem.priority >= i7) {
                    String str = storageItem.path;
                    try {
                        if (!c(storageItem.getTotalSize())) {
                            boolean zEquals = (Environment.getExternalStorageDirectory().getAbsoluteFile().getCanonicalPath() + "/").equals(str);
                            if (Build.VERSION.SDK_INT >= 29) {
                                BLog.v("Storage_StorageDetect_CHECKSD", "ret:" + zEquals + "; getCanonicalPath=" + Environment.getExternalStorageDirectory().getAbsoluteFile().getCanonicalPath() + "; path=" + str);
                            }
                            if (zEquals) {
                            }
                        }
                    } catch (IOException | RuntimeException e7) {
                    }
                    arrayList2.add(storageItem);
                }
                arrayList2.add(0, storageItem);
                i7 = storageItem.priority;
            }
        }
        return arrayList2;
    }

    public static ArrayList<StorageItem> j(Context context) {
        ArrayList<StorageItem> arrayList = new ArrayList<>();
        Environment4.a(context);
        if (Environment4.f105055a == null) {
            Environment4.a(context);
        }
        Environment4.Device[] deviceArr = Environment4.f105055a;
        if (deviceArr == null) {
            return arrayList;
        }
        for (Environment4.Device device : deviceArr) {
            StorageItem storageItem = new StorageItem(device.getPath() + "/", "fuse", -100);
            storageItem.f105064c = device.getTotalSpace();
            storageItem.f105062a = device.getFreeSpace();
            storageItem.mPrimary = device.mPrimary;
            storageItem.mRemovable = device.mRemovable;
            storageItem.mState = device.mState;
            if (device.getState(context).equals("mounted") && storageItem.canWrite(context)) {
                storageItem.createHideFile(context);
                if (device.isPrimary()) {
                    arrayList.add(0, storageItem);
                } else {
                    arrayList.add(storageItem);
                }
            }
        }
        if (arrayList.size() == 0) {
            try {
                return k(context);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05a2  */
    /* JADX WARN: Type inference failed for: r0v158 */
    /* JADX WARN: Type inference failed for: r0v248, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v303, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.lang.CharSequence, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.bilibili.storagechecker.StorageItem> k(android.content.Context r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.storagechecker.c.k(android.content.Context):java.util.ArrayList");
    }

    public static void l(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e7) {
        }
    }
}
