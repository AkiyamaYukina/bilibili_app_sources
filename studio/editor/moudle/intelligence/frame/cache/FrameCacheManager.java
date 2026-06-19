package com.bilibili.studio.editor.moudle.intelligence.frame.cache;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.StatFs;
import androidx.annotation.Keep;
import com.bilibili.cache.DiskLruCache;
import com.bilibili.commons.io.FileUtils;
import com.bilibili.commons.security.DigestUtils;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/cache/FrameCacheManager.class */
@Keep
public class FrameCacheManager {
    private static final String STORAGE_WRITE_PERMISSIONS = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final String TAG = "FrameCacheManager";
    private static final int maxSize = 20971520;
    private WeakReference<Context> mContextWrf;
    private String mDirName;
    private DiskLruCache mDiskLruCache;
    private long mMaxCacheSize;

    public FrameCacheManager(Context context, String str, long j7) {
        try {
            this.mContextWrf = new WeakReference<>(context);
            this.mDirName = str;
            this.mMaxCacheSize = j7;
            this.mDiskLruCache = DiskLruCache.open(getDiskCacheFile(context, str), getAppVersion(context), 1, this.mMaxCacheSize);
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    private String MD5(String str) {
        return DigestUtils.md5(str);
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "checkPermission", owner = {"android.content.Context"}, scope = {})
    private static int __Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_checkPermission(Object obj, String str, int i7, int i8) {
        String str2 = str;
        if (Build.VERSION.SDK_INT >= 33) {
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str)) {
                str2 = "android.permission.READ_MEDIA_IMAGES";
            } else {
                str2 = str;
                if (STORAGE_WRITE_PERMISSIONS.equals(str)) {
                    return 0;
                }
            }
        }
        return ((Context) obj).checkPermission(str2, i7, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (kotlin.text.StringsKt.n(r0, r5) == true) goto L24;
     */
    @kotlin.jvm.JvmStatic
    @com.bilibili.lib.ghost.api.Invocation(category = com.bilibili.lib.ghost.api.InvocationCategory.INVOKE_NONE_STATIC, name = "getPackageInfo", owner = {"android.content.pm.PackageManager"})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.pm.PackageInfo __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(@org.jetbrains.annotations.NotNull android.content.pm.PackageManager r4, @org.jetbrains.annotations.NotNull java.lang.String r5, int r6) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L12
            com.bilibili.lib.blconfig.FeatureFlagContract r0 = r0.ab2()     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "ff.privacy.hook.agree.get_package_info"
            r2 = 1
            boolean r0 = r0.getWithDefault(r1, r2)     // Catch: java.lang.Exception -> L12
            r7 = r0
            goto L16
        L12:
            r9 = move-exception
            r0 = 1
            r7 = r0
        L16:
            com.bilibili.privacy.PrivacyHelper r0 = com.bilibili.privacy.PrivacyHelper.INSTANCE
            java.lang.String r1 = "pm_get_package_info"
            boolean r0 = r0.checkPrivacy$privacy_release(r1)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L2c
            r0 = r7
            if (r0 != 0) goto L80
        L2c:
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L92
            com.bilibili.lib.blconfig.Contract r0 = r0.config()     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = "privacy.pkg_info_whitelist"
            r2 = 0
            java.lang.Object r0 = r0.get(r1, r2)     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L92
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L53
            r0 = r10
            r1 = r5
            boolean r0 = kotlin.text.StringsKt.n(r0, r1)     // Catch: java.lang.Exception -> L92
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L53
            goto L80
        L53:
            r0 = r5
            boolean r0 = V0.f.c(r0)
            if (r0 == 0) goto L77
            r0 = r4
            r1 = 0
            android.content.pm.PackageInfo r0 = V0.e.a(r0, r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L75
            android.content.pm.PackageInfo r0 = new android.content.pm.PackageInfo
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = 2233(0x8b9, float:3.129E-42)
            r0.versionCode = r1
        L75:
            r0 = r4
            return r0
        L77:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L80:
            r0 = r4
            r1 = r5
            r2 = r6
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)
            r5 = r0
            r0 = r9
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L90
            r0 = r5
            r4 = r0
        L90:
            r0 = r4
            return r0
        L92:
            r10 = move-exception
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.frame.cache.FrameCacheManager.__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(android.content.pm.PackageManager, java.lang.String, int):android.content.pm.PackageInfo");
    }

    private void bitmap2OutputStream(Bitmap bitmap, OutputStream outputStream) {
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
        }
    }

    private void checkNotClosed() {
        try {
            DiskLruCache diskLruCache = this.mDiskLruCache;
            if (diskLruCache == null || !diskLruCache.isClosed()) {
                return;
            }
            tryReopenCache();
        } catch (Exception e7) {
        }
    }

    private void file2OutputStream(File file, OutputStream outputStream) throws Throwable {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream3 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i7 = fileInputStream3.read(bArr);
                            if (i7 == -1) {
                                break;
                            } else {
                                outputStream.write(bArr, 0, i7);
                            }
                        }
                        fileInputStream3.close();
                    } catch (IOException e7) {
                        e = e7;
                        fileInputStream = fileInputStream3;
                        fileInputStream2 = fileInputStream;
                        e.printStackTrace();
                        if (fileInputStream == null) {
                        } else {
                            fileInputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream3;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e9) {
                e = e9;
                fileInputStream = null;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private int getAppVersion(Context context) {
        String packageName = context.getPackageName();
        int iIntValue = 0;
        if (packageName == null) {
            return 0;
        }
        try {
            PackageInfo packageInfo__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo = __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(context.getPackageManager(), packageName, 0);
            iIntValue = Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo.getLongVersionCode() & 4294967295L).intValue() : packageInfo__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e7) {
        }
        return iIntValue;
    }

    private long getAvailableLength(String str) {
        try {
            return new StatFs(str).getAvailableBytes();
        } catch (Exception e7) {
            e7.printStackTrace();
            return 0L;
        }
    }

    private File getDiskCacheFile(Context context, String str) {
        File filePackDiskCacheFile = packDiskCacheFile(context, str);
        if (!filePackDiskCacheFile.exists()) {
            filePackDiskCacheFile.mkdirs();
        }
        return filePackDiskCacheFile;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File packDiskCacheFile(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12
            boolean r0 = android.os.Environment.isExternalStorageRemovable()
            if (r0 != 0) goto L4e
        L12:
            r0 = r6
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            int r2 = android.os.Process.myPid()
            int r3 = android.os.Process.myUid()
            int r0 = __Ghost$Insertion$com_bilibili_infra_base_aop_StoragePermissionHook_checkPermission(r0, r1, r2, r3)
            if (r0 != 0) goto L4e
            r0 = r6
            java.io.File r0 = r0.getExternalCacheDir()     // Catch: java.lang.Exception -> L2a
            r9 = r0
            goto L2e
        L2a:
            r8 = move-exception
            r0 = 0
            r9 = r0
        L2e:
            r0 = r9
            if (r0 == 0) goto L46
            r0 = r9
            r8 = r0
            r0 = r5
            r1 = r9
            java.lang.String r1 = r1.getAbsolutePath()
            long r0 = r0.getAvailableLength(r1)
            r1 = 20971520(0x1400000, double:1.03613076E-316)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L53
        L46:
            r0 = r6
            java.io.File r0 = r0.getCacheDir()
            r8 = r0
            goto L53
        L4e:
            r0 = r6
            java.io.File r0 = r0.getCacheDir()
            r8 = r0
        L53:
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r8
            r3 = r7
            r1.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.frame.cache.FrameCacheManager.packDiskCacheFile(android.content.Context, java.lang.String):java.io.File");
    }

    private void tryReopenCache() {
        try {
            Context context = this.mContextWrf.get();
            if (context != null) {
                this.mDiskLruCache = DiskLruCache.open(getDiskCacheFile(context, this.mDirName), getAppVersion(context), 1, this.mMaxCacheSize);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public void close() {
        DiskLruCache diskLruCache = this.mDiskLruCache;
        if (diskLruCache != null) {
            try {
                diskLruCache.close();
            } catch (IOException e7) {
            }
        }
    }

    public void deleteDiskCache() {
        try {
            DiskLruCache diskLruCache = this.mDiskLruCache;
            if (diskLruCache != null) {
                diskLruCache.delete();
            }
        } catch (IOException e7) {
        }
    }

    public void deleteFile(Context context, String str) {
        try {
            DiskLruCache.deleteContents(packDiskCacheFile(context, str));
        } catch (IOException e7) {
        }
    }

    public Bitmap getDiskCache(String str) {
        Bitmap bitmapDecodeStream;
        String strMD5 = MD5(str);
        try {
            DiskLruCache diskLruCache = this.mDiskLruCache;
            bitmapDecodeStream = null;
            if (diskLruCache != null) {
                DiskLruCache.Snapshot snapshot = diskLruCache.get(strMD5);
                bitmapDecodeStream = null;
                if (snapshot != null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(snapshot.getInputStream(0));
                }
            }
        } catch (IOException e7) {
            bitmapDecodeStream = null;
        } catch (IllegalStateException e8) {
            checkNotClosed();
            bitmapDecodeStream = null;
        }
        return bitmapDecodeStream;
    }

    public File getDiskCache(String str, String str2) {
        InputStream inputStream;
        String strMD5 = MD5(str);
        File file = new File(str2);
        InputStream inputStream2 = null;
        InputStream inputStream3 = null;
        InputStream inputStream4 = null;
        try {
        } catch (IOException e7) {
            e7.printStackTrace();
        }
        try {
            try {
                DiskLruCache diskLruCache = this.mDiskLruCache;
                inputStream = null;
                if (diskLruCache != null) {
                    DiskLruCache.Snapshot snapshot = diskLruCache.get(strMD5);
                    inputStream = null;
                    if (snapshot != null) {
                        inputStream = snapshot.getInputStream(0);
                        inputStream2 = inputStream;
                        inputStream3 = inputStream;
                        inputStream4 = inputStream;
                        FileUtils.copyToFile(inputStream, file);
                    }
                }
            } catch (IOException e8) {
                if (inputStream3 != null) {
                    inputStream3.close();
                }
            } catch (IllegalStateException e9) {
                checkNotClosed();
                if (inputStream4 != null) {
                    inputStream4.close();
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return file;
        } catch (Throwable th) {
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            throw th;
        }
    }

    public void putDiskCache(String str, File file) throws Throwable {
        DiskLruCache.Editor editorEdit;
        String strMD5 = MD5(str);
        try {
            DiskLruCache diskLruCache = this.mDiskLruCache;
            if (diskLruCache != null && (editorEdit = diskLruCache.edit(strMD5)) != null) {
                OutputStream outputStreamNewOutputStream = editorEdit.newOutputStream(0);
                file2OutputStream(file, outputStreamNewOutputStream);
                if (outputStreamNewOutputStream != null) {
                    editorEdit.commit();
                    outputStreamNewOutputStream.close();
                } else {
                    editorEdit.abort();
                }
            }
        } catch (IOException e7) {
        } catch (IllegalStateException e8) {
            checkNotClosed();
        }
    }

    public boolean putDiskCache(String str, Bitmap bitmap) {
        String strMD5 = MD5(str);
        try {
            DiskLruCache diskLruCache = this.mDiskLruCache;
            if (diskLruCache == null) {
                return false;
            }
            if (diskLruCache.get(strMD5) != null) {
                return true;
            }
            DiskLruCache.Editor editorEdit = this.mDiskLruCache.edit(strMD5);
            if (editorEdit == null) {
                return false;
            }
            OutputStream outputStreamNewOutputStream = editorEdit.newOutputStream(0);
            bitmap2OutputStream(bitmap, outputStreamNewOutputStream);
            if (outputStreamNewOutputStream == null) {
                editorEdit.abort();
                return false;
            }
            editorEdit.commit();
            outputStreamNewOutputStream.close();
            return true;
        } catch (IOException e7) {
            return false;
        } catch (IllegalStateException e8) {
            checkNotClosed();
            return false;
        }
    }

    public void removeDiskCache(String str) {
        DiskLruCache diskLruCache = this.mDiskLruCache;
        if (diskLruCache != null) {
            try {
                diskLruCache.remove(str);
            } catch (IOException e7) {
            } catch (IllegalStateException e8) {
                checkNotClosed();
            }
        }
    }

    public long size() {
        DiskLruCache diskLruCache = this.mDiskLruCache;
        return diskLruCache != null ? diskLruCache.size() : 0L;
    }
}
