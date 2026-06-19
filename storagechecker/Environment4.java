package com.bilibili.storagechecker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.storage.StorageManager;
import androidx.core.content.ContextCompat;
import androidx.core.os.EnvironmentCompat;
import com.bilibili.live.streaming.push.BiliUSBFlashpoint;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/Environment4.class */
public final class Environment4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Device[] f105055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f105056b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/Environment4$Device.class */
    public static class Device extends File {
        boolean mAllowMassStorage;
        File mCache;
        boolean mEmulated;
        File mFiles;
        long mMaxFileSize;
        boolean mPrimary;
        boolean mRemovable;
        String mState;
        String mType;
        String mUserLabel;
        String mUuid;
        String mWriteState;

        public Device(Context context) {
            super(Environment.getDataDirectory().getAbsolutePath());
            this.mState = "mounted";
            this.mFiles = context.getFilesDir();
            this.mCache = context.getCacheDir();
            this.mType = "internal";
            this.mWriteState = "apponly";
        }

        public Device(Object obj, Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            super(getVolumePath(obj));
            for (Method method : obj.getClass().getMethods()) {
                if (method.getName().equals("getUserLabel") && method.getParameterTypes().length == 0 && method.getReturnType() == String.class) {
                    this.mUserLabel = (String) method.invoke(obj, null);
                }
                if (method.getName().equals("getUuid") && method.getParameterTypes().length == 0 && method.getReturnType() == String.class) {
                    this.mUuid = (String) method.invoke(obj, null);
                }
                if (method.getName().equals("getState") && method.getParameterTypes().length == 0 && method.getReturnType() == String.class) {
                    this.mState = (String) method.invoke(obj, null);
                }
                if (method.getName().equals("isRemovable") && method.getParameterTypes().length == 0 && method.getReturnType() == Boolean.TYPE) {
                    this.mRemovable = ((Boolean) method.invoke(obj, null)).booleanValue();
                }
                if (method.getName().equals("isPrimary") && method.getParameterTypes().length == 0 && method.getReturnType() == Boolean.TYPE) {
                    this.mPrimary = ((Boolean) method.invoke(obj, null)).booleanValue();
                }
                if (method.getName().equals("isEmulated") && method.getParameterTypes().length == 0 && method.getReturnType() == Boolean.TYPE) {
                    this.mEmulated = ((Boolean) method.invoke(obj, null)).booleanValue();
                }
                if (method.getName().equals("allowMassStorage") && method.getParameterTypes().length == 0 && method.getReturnType() == Boolean.TYPE) {
                    this.mAllowMassStorage = ((Boolean) method.invoke(obj, null)).booleanValue();
                }
                if (method.getName().equals("getMaxFileSize") && method.getParameterTypes().length == 0 && method.getReturnType() == Long.TYPE) {
                    this.mMaxFileSize = ((Long) method.invoke(obj, null)).longValue();
                }
            }
            if (this.mState == null) {
                this.mState = getState(context);
            }
            if (this.mPrimary) {
                this.mType = "primary";
                return;
            }
            String lowerCase = getAbsolutePath().toLowerCase();
            if (lowerCase.indexOf("sd") != -1) {
                this.mType = "MicroSD";
            } else {
                if (lowerCase.indexOf(BiliUSBFlashpoint.PROTOCOL_TYPE) != -1) {
                    this.mType = "USB";
                    return;
                }
                this.mType = "unbekannt" + getAbsolutePath();
            }
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
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.storagechecker.Environment4.Device.__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(android.content.pm.PackageManager, java.lang.String, int):android.content.pm.PackageInfo");
        }

        private static String getVolumePath(Object obj) {
            String absolutePath;
            try {
                absolutePath = ((File) obj.getClass().getMethod("getDirectory", null).invoke(obj, null)).getAbsolutePath();
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
                absolutePath = null;
            } catch (NoSuchMethodException | NullPointerException e8) {
                try {
                    absolutePath = (String) obj.getClass().getMethod("getPath", null).invoke(obj, null);
                } catch (IllegalAccessException e9) {
                    e9.printStackTrace();
                    absolutePath = null;
                } catch (NoSuchMethodException e10) {
                    e10.printStackTrace();
                    absolutePath = null;
                } catch (InvocationTargetException e11) {
                    e11.printStackTrace();
                    absolutePath = null;
                }
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
                absolutePath = null;
            }
            return absolutePath;
        }

        private static boolean isTargetSdkAbove(Context context, int i7) {
            int i8;
            Context applicationContext = context.getApplicationContext();
            try {
                i8 = __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(applicationContext.getPackageManager(), applicationContext.getPackageName(), 0).applicationInfo.targetSdkVersion;
            } catch (PackageManager.NameNotFoundException e7) {
                BLog.e("Storage_Environment4", e7);
                i8 = -1;
            } catch (RuntimeException e8) {
                BLog.e("Storage_Environment4", e8);
                i8 = -1;
            }
            boolean z6 = false;
            if (i8 > 0) {
                z6 = false;
                if (i8 >= i7) {
                    z6 = true;
                }
            }
            return z6;
        }

        public String getAccess() {
            if (this.mWriteState == null) {
                try {
                    this.mWriteState = "none";
                    File[] fileArrListFiles = listFiles();
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        throw new IOException("root empty/unreadable");
                    }
                    this.mWriteState = "readonly";
                    File.createTempFile("jow", null, getFilesDir()).delete();
                    this.mWriteState = "apponly";
                    File.createTempFile("jow", null, this).delete();
                    this.mWriteState = "readwrite";
                } catch (IOException e7) {
                    BLog.e("Storage_Environment4", e7);
                }
            }
            return this.mWriteState;
        }

        public File getCacheDir() {
            if (this.mCache == null) {
                File file = new File(this, C8770a.a(new StringBuilder(), Environment4.f105056b, "/cache"));
                this.mCache = file;
                if (!file.isDirectory()) {
                    this.mCache.mkdirs();
                }
            }
            return this.mCache;
        }

        public File getFilesDir() {
            if (this.mFiles == null) {
                File file = new File(this, C8770a.a(new StringBuilder(), Environment4.f105056b, "/files"));
                this.mFiles = file;
                if (!file.isDirectory()) {
                    this.mFiles.mkdirs();
                }
            }
            return this.mFiles;
        }

        public long getMaxFileSize() {
            return this.mMaxFileSize;
        }

        public String getState(Context context) {
            try {
                if (this.mRemovable || this.mState == null) {
                    this.mState = Environment.getExternalStorageState(this);
                }
            } catch (NoSuchMethodError e7) {
                BLog.e("TAG", "NoSuchMethodError in Environment.getStorageState");
                this.mState = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return this.mState;
        }

        public String getType() {
            return this.mType;
        }

        public String getUserLabel() {
            return this.mUserLabel;
        }

        public String getUuid() {
            return this.mUuid;
        }

        public boolean isAllowMassStorage() {
            return this.mAllowMassStorage;
        }

        public boolean isAvailable(Context context) {
            String state = getState(context);
            return "mounted".equals(state) || "mounted_ro".equals(state);
        }

        public boolean isEmulated() {
            return this.mEmulated;
        }

        public boolean isPrimary() {
            return this.mPrimary;
        }

        public boolean isRemovable() {
            return this.mRemovable;
        }
    }

    public static void a(Context context) {
        if (f105056b == null) {
            f105056b = "/Android/data/" + context.getPackageName();
        }
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            if (storageManager != null) {
                try {
                    Object[] objArr = (Object[]) storageManager.getClass().getMethod("getVolumeList", null).invoke(storageManager, null);
                    if (objArr == null) {
                        return;
                    }
                    int length = objArr.length;
                    Device[] deviceArr = new Device[length];
                    int i7 = 0;
                    while (true) {
                        if (i7 >= objArr.length) {
                            break;
                        }
                        try {
                            deviceArr[i7] = new Device(objArr[i7], context);
                        } catch (NullPointerException e7) {
                        }
                        i7++;
                    }
                    Device device = null;
                    for (int i8 = 0; i8 < length; i8++) {
                        Device device2 = deviceArr[i8];
                        if (device2 != null && device2.mPrimary) {
                            device = device2;
                        }
                    }
                    Device device3 = device;
                    if (device == null) {
                        int i9 = 0;
                        while (true) {
                            device3 = device;
                            if (i9 >= length) {
                                break;
                            }
                            device3 = deviceArr[i9];
                            if (device3 != null && !device3.mRemovable) {
                                device3.mPrimary = true;
                                break;
                            }
                            i9++;
                        }
                    }
                    Device device4 = device3;
                    if (device3 == null) {
                        Device device5 = deviceArr[0];
                        device4 = device3;
                        if (device5 != null) {
                            device5.mPrimary = true;
                            device4 = device5;
                        }
                    }
                    try {
                        File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(context, null);
                        File[] externalCacheDirs = ContextCompat.getExternalCacheDirs(context);
                        for (int i10 = 0; i10 < length; i10++) {
                            Device device6 = deviceArr[i10];
                            if (device6 != null) {
                                if (externalFilesDirs != null) {
                                    for (File file : externalFilesDirs) {
                                        if (file != null && file.getAbsolutePath().startsWith(device6.getAbsolutePath())) {
                                            device6.mFiles = file;
                                        }
                                    }
                                }
                                if (externalCacheDirs != null) {
                                    for (File file2 : externalCacheDirs) {
                                        if (file2 != null && file2.getAbsolutePath().startsWith(device6.getAbsolutePath())) {
                                            device6.mCache = file2;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (NoSuchMethodError e8) {
                        BLog.e("TAG", "NoSuchMethodError in ContextCompat.getExternalFilesDirs");
                    } catch (NullPointerException e9) {
                        BLog.e("TAG", "NPE in ContextCompat.getExternalFilesDirs");
                    }
                    ArrayList arrayList = new ArrayList(10);
                    ArrayList arrayList2 = new ArrayList(10);
                    ArrayList arrayList3 = new ArrayList(10);
                    for (int i11 = 0; i11 < length; i11++) {
                        Device device7 = deviceArr[i11];
                        if (device7 != null) {
                            arrayList.add(device7);
                            if (device7.isAvailable(context)) {
                                arrayList3.add(device7);
                                arrayList2.add(device7);
                            }
                        }
                    }
                    Device device8 = new Device(context);
                    arrayList2.add(0, device8);
                    if (device4 != null && !device4.mEmulated) {
                        arrayList.add(0, device8);
                    }
                    f105055a = (Device[]) arrayList.toArray(new Device[arrayList.size()]);
                } catch (ArrayIndexOutOfBoundsException e10) {
                    BLog.e("Storage_Environment4", e10);
                } catch (IllegalAccessException e11) {
                    BLog.e("Storage_Environment4", e11);
                } catch (NoSuchMethodException e12) {
                    BLog.e("Storage_Environment4", e12);
                } catch (InvocationTargetException e13) {
                    BLog.e("Storage_Environment4", e13);
                }
            }
        } catch (IllegalStateException e14) {
        }
    }
}
