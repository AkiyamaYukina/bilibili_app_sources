package com.bilibili.storagechecker;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.splash.l;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/StorageItem.class */
public class StorageItem {
    public static final String TAG = "Storage_StorageItem_CHECKSD";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadPoolExecutor f105061d = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f105062a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f105064c;
    public String file_type;
    public String mState;
    public String path;
    public int priority;
    public int type;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f105063b = 0;
    public boolean mPrimary = false;
    public boolean mRemovable = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/StorageItem$a.class */
    public final class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "getAvailSize");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/StorageItem$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f105065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f105066b;
    }

    public StorageItem(String str, String str2, int i7) {
        this.path = str;
        this.file_type = str2;
        this.priority = i7;
        File file = new File(this.path);
        b bVar = null;
        if (!file.exists()) {
            BLog.v("Storage_StorageItem_CHECKSD", "getStorageSize->file is not exist!");
        } else if (file.isDirectory()) {
            try {
                StatFs statFs = new StatFs(this.path);
                try {
                    long blockSize = statFs.getBlockSize();
                    long blockCount = statFs.getBlockCount();
                    long availableBlocks = statFs.getAvailableBlocks();
                    b bVar2 = new b();
                    bVar2.f105066b = (blockCount - availableBlocks) * blockSize;
                    bVar2.f105065a = blockSize * blockCount;
                    bVar = bVar2;
                } catch (IllegalArgumentException e7) {
                    BLog.e("Storage_StorageItem_CHECKSD", e7);
                }
            } catch (ArithmeticException | Exception e8) {
            }
        } else {
            BLog.v("Storage_StorageItem_CHECKSD", "getStorageSize->file is not Directory!");
        }
        if (bVar == null) {
            BLog.v("Storage_StorageItem_CHECKSD", "StorageItem->StorageSize is null");
            this.f105064c = 0L;
            return;
        }
        BLog.v("Storage_StorageItem_CHECKSD", "StorageItem->StorageSize is not null");
        long j7 = bVar.f105066b;
        long j8 = bVar.f105065a;
        this.f105064c = j8;
        this.f105062a = j8 - j7;
    }

    public static boolean a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strA = androidx.coordinatorlayout.widget.a.a(context, C0.d.a(str, "Android/data/"), "/files");
        BLog.v("Storage_StorageItem_CHECKSD", "checkPathCanWrite:" + strA);
        File file = new File(strA);
        try {
            if (!file.exists()) {
                context.getExternalFilesDir("");
                if (file.exists()) {
                    BLog.v("Storage_StorageItem_CHECKSD", "mInnerPath is exist!");
                } else {
                    BLog.v("Storage_StorageItem_CHECKSD", "create " + strA);
                    if (file.mkdirs()) {
                        BLog.v("Storage_StorageItem_CHECKSD", "create success!");
                    } else {
                        BLog.v("Storage_StorageItem_CHECKSD", "create fail!");
                    }
                }
            }
        } catch (SecurityException e7) {
            BLog.e("Storage_StorageItem_CHECKSD", "checkPathCanWrite()>>>exception=" + e7.getMessage());
        }
        return file.canWrite();
    }

    public final long b() {
        if (!new File(this.path).exists()) {
            return 0L;
        }
        try {
            return new StatFs(this.path).getAvailableBytes();
        } catch (IllegalArgumentException | SecurityException | Exception e7) {
            return 0L;
        }
    }

    public boolean canRealWrite(Context context) {
        FileOutputStream fileOutputStream;
        Throwable th;
        String str = this.path + "Android/data/" + context.getPackageName() + "/files";
        BLog.v("Storage_StorageItem_CHECKSD", "canRealWrite()>>>current test path=" + str);
        File file = new File(str);
        boolean zExists = file.exists();
        FileOutputStream fileOutputStream2 = null;
        if (!zExists) {
            context.getExternalFilesDir(null);
            file.mkdirs();
        }
        if (!file.exists()) {
            BLog.v("Storage_StorageItem_CHECKSD", "canRealWrite()>>>App files dir cannot be created");
            return false;
        }
        if (!file.canWrite()) {
            BLog.v("Storage_StorageItem_CHECKSD", "canRealWrite()>>>App files dir cannot be written");
            return false;
        }
        BLog.v("Storage_StorageItem_CHECKSD", "canRealWrite()>>>App files dir canWrite return true, we need to write a real file for testing");
        File file2 = new File(str, ".sd");
        try {
            try {
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file2, true);
                try {
                    fileOutputStream.write((System.currentTimeMillis() + ": " + this.path + "\n").getBytes());
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    StringBuilder sb = new StringBuilder("canRealWrite()>>>App files dir is really writable, path=");
                    sb.append(file2.getAbsolutePath());
                    BLog.i("Storage_StorageItem_CHECKSD", sb.toString());
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e7) {
                        return true;
                    }
                } catch (IOException e8) {
                    BLog.d("Storage_StorageItem_CHECKSD", "canRealWrite()>>>App files dir write a file throw IOException, so we assure the sdcard is not writable, this is an exception case");
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException e9) {
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (IOException e10) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                fileOutputStream = null;
                th = th3;
            }
        } catch (Throwable th4) {
            try {
                fileOutputStream2.close();
            } catch (IOException e11) {
            }
            throw th4;
        }
    }

    public boolean canWrite(Context context) {
        return a(context, this.path);
    }

    public boolean checkHideFileExist(Context context) {
        try {
            File file = new File(this.path + "Android/data/" + context.getPackageName() + "/files");
            if (!file.exists()) {
                context.getExternalFilesDir("");
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            return new File(file, ".a").exists();
        } catch (SecurityException e7) {
            return false;
        }
    }

    public void createHideFile(Context context) {
        try {
            File file = new File(this.path + "Android/data/" + context.getPackageName() + "/files");
            if (!file.exists()) {
                context.getExternalFilesDir("");
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            File file2 = new File(file, ".a");
            if (file2.exists()) {
                BLog.v("Storage_StorageItem_CHECKSD", "file already exist..");
            } else {
                BLog.v("Storage_StorageItem_CHECKSD", "createHideFile not exist,so create it...");
                file2.createNewFile();
            }
            BLog.v("Storage_StorageItem_CHECKSD", "createHideFile Success!");
        } catch (IOException e7) {
            BLog.e("Storage_StorageItem_CHECKSD", e7);
        } catch (SecurityException e8) {
            BLog.e("Storage_StorageItem_CHECKSD", e8);
        }
    }

    public long getAvailSize() {
        if (this.f105062a <= 0 || System.currentTimeMillis() - this.f105063b >= LogReportStrategy.INTERVAL_DEFAULT) {
            this.f105062a = b();
            this.f105063b = System.currentTimeMillis();
        } else {
            final int i7 = 0;
            f105061d.execute(new Runnable(this, i7) { // from class: com.bilibili.storagechecker.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f105074a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f105075b;

                {
                    this.f105074a = i7;
                    this.f105075b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f105074a) {
                        case 0:
                            StorageItem storageItem = (StorageItem) this.f105075b;
                            String str = StorageItem.TAG;
                            storageItem.f105062a = storageItem.b();
                            storageItem.f105063b = System.currentTimeMillis();
                            break;
                        default:
                            l lVar = (l) this.f105075b;
                            if (!lVar.a.isFinishing()) {
                                BLog.i("MainSplashHelper", "mDelayJumpRunnable hideSplashFragment");
                                lVar.a.hideSplashFragment(true);
                            } else {
                                BLog.i("MainSplashHelper", "activity finished");
                            }
                            break;
                    }
                }
            });
        }
        return this.f105062a;
    }

    public long getAvailSizeSync() {
        this.f105062a = b();
        this.f105063b = System.currentTimeMillis();
        return this.f105062a;
    }

    public String getState(Context context) {
        String externalStorageState;
        String str;
        if (!this.mRemovable && (str = this.mState) != null) {
            BLog.v("Storage_StorageItem_CHECKSD", "getState()>>>storage cannot removable, state=".concat(str));
            return this.mState;
        }
        File file = new File(this.path);
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        try {
            Method method = storageManager.getClass().getMethod("getVolumeState", String.class);
            method.setAccessible(true);
            externalStorageState = (String) method.invoke(storageManager, file.getAbsolutePath());
        } catch (IllegalAccessException e7) {
            BLog.e("Storage_StorageItem_CHECKSD", e7);
            externalStorageState = null;
        } catch (NoSuchMethodException e8) {
            BLog.e("Storage_StorageItem_CHECKSD", e8);
            externalStorageState = null;
        } catch (InvocationTargetException e9) {
            BLog.e("Storage_StorageItem_CHECKSD", e9);
            externalStorageState = null;
        }
        if (externalStorageState != null) {
            BLog.v("Storage_StorageItem_CHECKSD", "StorageManager-->getVolumeState reflection success, path=" + this.path + ", state=" + externalStorageState);
            this.mState = externalStorageState;
            return externalStorageState;
        }
        try {
            externalStorageState = Environment.getExternalStorageState(file);
        } catch (NoSuchMethodError e10) {
            BLog.e("Storage_StorageItem_CHECKSD", "NoSuchMethodError in Environment.getStorageState");
        }
        if (externalStorageState == null) {
            BLog.d("Storage_StorageItem_CHECKSD", "getState()>>>cannot get correct state, so we assure the storage state is unknown");
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        BLog.v("Storage_StorageItem_CHECKSD", "getState()>>>use system Environment api, oldState=" + this.mState + ", newState=" + externalStorageState);
        this.mState = externalStorageState;
        return externalStorageState;
    }

    public String getStorageItemInfo() {
        StringBuilder sb = new StringBuilder("StorageItem{path='");
        sb.append(this.path);
        sb.append("', totalsize=");
        sb.append(this.f105064c);
        sb.append(", availsize=");
        sb.append(this.f105062a);
        sb.append(", file_type='");
        return C8770a.a(sb, this.file_type, "'}");
    }

    public long getTotalSize() {
        long j7 = this.f105064c;
        long totalBytes = 0;
        if (j7 > 0) {
            return j7;
        }
        if (new File(this.path).exists()) {
            try {
                totalBytes = new StatFs(this.path).getTotalBytes();
            } catch (IllegalArgumentException | SecurityException | Exception e7) {
            }
        }
        this.f105064c = totalBytes;
        return totalBytes;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StorageItem{ path=");
        sb.append(this.path);
        sb.append(", totalSize=");
        sb.append(this.f105064c);
        sb.append("bytes, availSize=");
        return android.support.v4.media.session.a.a(sb, this.f105062a, "bytes }");
    }
}
