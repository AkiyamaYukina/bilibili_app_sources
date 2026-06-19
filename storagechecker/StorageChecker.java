package com.bilibili.storagechecker;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bilibili.lib.blkv.BLKV;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/StorageChecker.class */
public class StorageChecker {
    public static final String COMMON_SP = "bili_storage_sp";
    public static final String TAG = "Storage_StorageChecker_CHECKSD";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f105057a = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f105058b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f105059c = new Object();
    public static List<StorageItem> sdCardItems = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f105060d = "";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/StorageChecker$a.class */
    public final class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "startScanSdcardTask");
        }
    }

    public static File a(Context context, String str, String str2) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                context.getExternalFilesDir("");
                if (file.exists()) {
                    BLog.v(TAG, "mInnerPath is exist!");
                } else if (file.mkdirs()) {
                    BLog.v(TAG, "create parent success!");
                } else {
                    BLog.v(TAG, "create parent fail!");
                }
            }
        } catch (SecurityException e7) {
            BLog.e(TAG, "ensureDirExist()>>>exception=" + e7.getMessage());
        }
        File file2 = file;
        if (!TextUtils.isEmpty(str2)) {
            File file3 = new File(str, str2);
            file2 = file3;
            if (!file3.exists()) {
                if (file3.mkdirs()) {
                    BLog.v(TAG, "create success!");
                    file2 = file3;
                } else {
                    BLog.v(TAG, "create failed");
                    file2 = file3;
                }
            }
        }
        return file2;
    }

    public static boolean checkSpaceEnough(String str) {
        return checkSpaceEnough(str, 0L);
    }

    public static boolean checkSpaceEnough(String str, long j7) {
        for (StorageItem storageItem : new ArrayList(sdCardItems)) {
            if (str.startsWith(storageItem.path)) {
                return storageItem.getAvailSize() > j7;
            }
        }
        return false;
    }

    public static StorageItem findStorageItemByAvailableSize(long j7) {
        for (StorageItem storageItem : new ArrayList(sdCardItems)) {
            if (storageItem.getAvailSize() > j7) {
                return storageItem;
            }
        }
        return null;
    }

    public static long getAllExternalSDItemSize() {
        long totalSize = 0;
        for (StorageItem storageItem : new ArrayList(sdCardItems)) {
            if (storageItem.type == 2) {
                totalSize = storageItem.getTotalSize() + totalSize;
            }
        }
        return totalSize;
    }

    public static long getAvailableInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static List<StorageItem> getAvailableStorageItems(Context context) {
        ArrayList<StorageItem> arrayList = new ArrayList(sdCardItems);
        ArrayList arrayList2 = new ArrayList();
        for (StorageItem storageItem : arrayList) {
            if (storageItem.canWrite(context) && "mounted".equals(storageItem.getState(context))) {
                arrayList2.add(storageItem);
                BLog.v(TAG, "available sdcard path: " + storageItem.path);
            }
        }
        return arrayList2;
    }

    public static List<String> getAvailableStoragePaths(Context context) {
        ArrayList<StorageItem> arrayList = new ArrayList(sdCardItems);
        ArrayList arrayList2 = new ArrayList();
        for (StorageItem storageItem : arrayList) {
            if (storageItem.canWrite(context) && "mounted".equals(storageItem.getState(context))) {
                arrayList2.add(storageItem.path);
                BLog.v(TAG, "available sdcard path: " + storageItem.path);
            }
        }
        return arrayList2;
    }

    public static String getCacheDir(Context context) {
        if (context == null) {
            return "/data/data/tv.danmaku.bili/cache";
        }
        try {
            return context.getCacheDir() != null ? context.getCacheDir().getAbsolutePath() : "/data/data/tv.danmaku.bili/cache";
        } catch (NullPointerException e7) {
            return "/data/data/tv.danmaku.bili/cache";
        }
    }

    public static String getCurrentRootPath(Context context) {
        if (!TextUtils.isEmpty(f105060d)) {
            return f105060d;
        }
        String string = BLKV.getBLSharedPreferences(context, "bili_storage_sp", false, 1024).getString("offlineDownloadDir", "");
        f105060d = string;
        return string;
    }

    public static StorageItem getCurrentStorageItem(Context context) {
        return getStorageItemByPath(getCurrentRootPath(context));
    }

    public static StorageItem getDefaultExternalSDCardItem() {
        ArrayList<StorageItem> arrayList = new ArrayList(sdCardItems);
        ArrayList arrayList2 = new ArrayList();
        for (StorageItem storageItem : arrayList) {
            if (storageItem.type == 2) {
                arrayList2.add(storageItem);
            }
        }
        return arrayList2.size() > 0 ? (StorageItem) arrayList2.get(0) : null;
    }

    public static long getInnerSDItemSize() {
        StorageItem internalSDCardItem = getInternalSDCardItem();
        if (internalSDCardItem == null) {
            return 0L;
        }
        return internalSDCardItem.getTotalSize();
    }

    public static File getInternalDataCacheDir(Context context, String str) {
        File cacheDir = context.getCacheDir();
        return a(context, cacheDir != null ? cacheDir.getAbsolutePath() : androidx.coordinatorlayout.widget.a.a(context, new StringBuilder("/data/data/"), "/cache"), str);
    }

    public static File getInternalDataFilesDir(Context context, String str) {
        File filesDir = context.getFilesDir();
        return a(context, filesDir != null ? filesDir.getAbsolutePath() : androidx.coordinatorlayout.widget.a.a(context, new StringBuilder("/data/data/"), "/files"), str);
    }

    public static StorageItem getInternalSDCardItem() {
        if (sdCardItems.size() > 0) {
            return sdCardItems.get(0);
        }
        return null;
    }

    public static File getInternalStorageCacheDir(Context context, String str) {
        try {
            if (!f105058b) {
                f105057a.execute(new b(context, 0));
            }
            if (sdCardItems.size() > 0) {
                String str2 = sdCardItems.get(0).path + "Android/data/" + context.getPackageName() + "/cache";
                BLog.v(TAG, "getInternalStorageCacheDir>>>internal storage cache path: " + str2);
                return a(context, str2, str);
            }
        } catch (TimeoutException e7) {
            BLog.v(TAG, "getInternalStorageCacheDir>>>wait sdcard scanning timeout, use system api instead!");
        }
        try {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null && Environment.getExternalStorageState().equals("mounted")) {
                BLog.v(TAG, "getInternalStorageCacheDir>>>storage cache path with system api: " + externalCacheDir.getAbsolutePath());
                return a(context, externalCacheDir.getAbsolutePath(), str);
            }
        } catch (NullPointerException e8) {
            BLog.e(TAG, "getInternalStorageCacheDir>>>exception=" + e8.getMessage());
        }
        BLog.w(TAG, "no available sdcards in the system");
        return getInternalDataCacheDir(context, str);
    }

    public static File getInternalStorageFilesDir(Context context, String str) {
        if (context == null) {
            throw new RuntimeException("StorageCheckor: context is null");
        }
        try {
            if (!f105058b) {
                f105057a.execute(new b(context, 0));
            }
            if (sdCardItems.size() > 0) {
                String str2 = sdCardItems.get(0).path + "Android/data/" + context.getPackageName() + "/files";
                BLog.v(TAG, "getInternalStorageFilesDir>>>internal storage files path: " + str2);
                return a(context, str2, str);
            }
        } catch (TimeoutException e7) {
            BLog.e(TAG, "getInternalStorageFilesDir>>>wait sdcard scanning timeout, use system api instead!");
        }
        try {
            File externalFilesDir = context.getExternalFilesDir(str);
            if (externalFilesDir != null && "mounted".equals(Environment.getExternalStorageState())) {
                BLog.v(TAG, "getInternalStorageFilesDir>>>storage files path with system api: " + externalFilesDir.getAbsolutePath());
                return externalFilesDir;
            }
        } catch (NullPointerException e8) {
            BLog.e(TAG, "getInternalStorageFilesDir>>>exception=" + e8.getMessage());
        } catch (RuntimeException e9) {
            BLog.e(TAG, "getInternalStorageFilesDir>>>exception=" + e9.getMessage());
        }
        BLog.w(TAG, "no available sdcards in the system");
        return getInternalDataFilesDir(context, str);
    }

    public static StorageItem getMaxStorageItem(Context context) {
        List<StorageItem> availableStorageItems = getAvailableStorageItems(context);
        StorageItem storageItem = null;
        if (availableStorageItems.size() == 0) {
            return null;
        }
        long j7 = 0;
        for (StorageItem storageItem2 : availableStorageItems) {
            long availSize = storageItem2.getAvailSize();
            if (availSize > j7) {
                storageItem = storageItem2;
                j7 = availSize;
            }
        }
        return storageItem;
    }

    public static StorageItem getStorageItemByPath(String str) {
        BLog.i(TAG, "getStorageItemByPath[path]:" + str);
        BLog.i(TAG, "getStorageItemByPath[sdCardItems]:" + sdCardItems);
        for (StorageItem storageItem : new ArrayList(sdCardItems)) {
            if (storageItem.path.equals(str)) {
                return storageItem;
            }
        }
        return null;
    }

    public static StorageItem getStorageItemContainPath(String str) {
        if (TextUtils.isEmpty(str)) {
            BLog.v(TAG, "getStorageItemContainPath()>>>path is empty");
            return null;
        }
        for (StorageItem storageItem : new ArrayList(sdCardItems)) {
            if (str.startsWith(new File(storageItem.path).getAbsolutePath())) {
                return storageItem;
            }
        }
        return null;
    }

    public static File getStoragePublicDir(Context context, String str) throws NoPermissionException {
        return getStoragePublicDir(context, str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[PHI: r11
  0x0076: PHI (r11v11 java.io.File) = (r11v2 java.io.File), (r11v12 java.io.File), (r11v14 java.io.File), (r11v15 java.io.File) binds: [B:30:0x0073, B:24:0x0056, B:65:0x0194, B:27:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File getStoragePublicDir(android.content.Context r6, java.lang.String r7, boolean r8) throws com.bilibili.storagechecker.NoPermissionException {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.storagechecker.StorageChecker.getStoragePublicDir(android.content.Context, java.lang.String, boolean):java.io.File");
    }

    public static long getTotalInternalMemorySize() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    public static File getUserPreferFilesDir(Context context, String str) {
        String str2;
        String str3;
        String currentRootPath = getCurrentRootPath(context);
        if (TextUtils.isEmpty(currentRootPath) || !StorageItem.a(context, currentRootPath)) {
            F0.a.b("getUserPreferFilesDir>>>storage path: ", currentRootPath, " in sp is invalid", TAG);
            String str4 = currentRootPath;
            try {
                if (!f105058b) {
                    f105057a.execute(new b(context, 0));
                }
                str2 = currentRootPath;
                if (sdCardItems.size() > 0) {
                    StorageItem maxStorageItem = getMaxStorageItem(context);
                    str2 = maxStorageItem != null ? maxStorageItem.path : "";
                    str4 = str2;
                    setCurrentRootPath(context, str2);
                }
            } catch (TimeoutException e7) {
                BLog.e(TAG, "getUserPreferFilesDir>>>wait sdcard scanning timeout, use system api instead!");
                str2 = str4;
            }
            str3 = str2;
            if (TextUtils.isEmpty(str2)) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                str3 = str2;
                if (externalStorageDirectory != null) {
                    str3 = str2;
                    if (Environment.getExternalStorageState().equals("mounted")) {
                        str3 = externalStorageDirectory.getAbsolutePath() + "/";
                        setCurrentRootPath(context, str3);
                    }
                }
            }
        } else {
            BLog.v(TAG, "getUserPreferFilesDir>>>storage path: " + currentRootPath + " in sp is valid");
            str3 = currentRootPath;
            if (!f105058b) {
                f105057a.execute(new b(context, 0));
                str3 = currentRootPath;
            }
        }
        if (TextUtils.isEmpty(str3)) {
            BLog.w(TAG, "no available sdcards in the system");
            return getInternalDataFilesDir(context, str);
        }
        String strA = androidx.coordinatorlayout.widget.a.a(context, C0.d.a(str3, "Android/data/"), "/files");
        BLog.v(TAG, "getUserPreferFilesDir>>>user prefer files path: " + strA);
        return a(context, strA, str);
    }

    public static boolean isSandboxModel() {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                return !Environment.isExternalStorageLegacy();
            }
            return false;
        } catch (Exception e7) {
            BLog.e(TAG, e7);
            return false;
        }
    }

    public static void scanSDCards(Context context) {
        StringBuilder sb;
        synchronized (f105059c) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    BLog.v(TAG, "sdcard is scanning......");
                    sdCardItems = c.g(context);
                    f105058b = true;
                    BLog.v(TAG, "scanning sdcard is over, cost time: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " milliseconds");
                    StringBuilder sb2 = new StringBuilder("sdcard infos: ");
                    sb2.append(sdCardItems.toString());
                    BLog.v(TAG, sb2.toString());
                } finally {
                    sdCardItems = c.g(context);
                    f105058b = true;
                    BLog.v(TAG, "scanning sdcard is over, cost time: " + (System.currentTimeMillis() - jCurrentTimeMillis) + " milliseconds");
                    sb = new StringBuilder("sdcard infos: ");
                    sb.append(sdCardItems.toString());
                    BLog.v(TAG, sb.toString());
                }
            } catch (Exception e7) {
                BLog.e(TAG, "get sdcard path failed");
            }
        }
    }

    public static void setCurrentRootPath(Context context, String str) {
        if (str != null) {
            f105060d = str;
            BLKV.getBLSharedPreferences(context, "bili_storage_sp", false, 1024).edit().putString("offlineDownloadDir", str).commit();
        }
    }
}
