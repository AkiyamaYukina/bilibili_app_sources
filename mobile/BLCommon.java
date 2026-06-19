package com.bilibili.mobile;

import android.content.res.AssetManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLCommon.class */
public class BLCommon {
    public static int BL_LOG_DEBUG = 0;
    public static int BL_LOG_ERROR = 0;
    public static int BL_LOG_FATAL = 0;
    public static int BL_LOG_INFO = 0;
    public static int BL_LOG_MODE_FILE = 0;
    public static int BL_LOG_MODE_NONE = 0;
    public static int BL_LOG_MODE_SCREEN = 0;
    public static int BL_LOG_SILENT = 0;
    public static int BL_LOG_UNKNOWN = 0;
    public static int BL_LOG_VERBOSE = 0;
    public static int BL_LOG_WARN = 0;
    public static final int BL_MOBILE_ENABLE_CLUSTER_BIG = 1;
    public static final int BL_MOBILE_ENABLE_CLUSTER_LITTLE = 2;
    public static final int BL_MOBILE_ENABLE_LOW_POWER_MULTI_THREAD = 4;
    public static final int BL_MOBILE_HUMAN_ACTION_MAX_FACE_COUNT = 10;
    public static final int BL_MOBILE_TRACKING_ENABLE_DEBOUNCE = 16;
    public static final int BL_MOBILE_TRACKING_ENABLE_FACE_ACTION = 32;
    public static final int BL_MOBILE_TRACKING_MULTI_THREAD = 0;
    public static final int BL_MOBILE_TRACKING_SINGLE_THREAD = 65536;
    public static final int BL_SDK_FMT_ARGB8888 = 9;
    public static final int BL_SDK_FMT_BGR888 = 5;
    public static final int BL_SDK_FMT_BGRA8888 = 4;
    public static final int BL_SDK_FMT_FLOAT = 8;
    public static final int BL_SDK_FMT_GRAY8 = 0;
    public static final int BL_SDK_FMT_NV12 = 2;
    public static final int BL_SDK_FMT_NV21 = 3;
    public static final int BL_SDK_FMT_RGB888 = 7;
    public static final int BL_SDK_FMT_RGBA8888 = 6;
    public static final int BL_SDK_FMT_YUV420P = 1;
    public static final int BL_SDK_FMT_YUV_420_888 = 11;
    public static final int BL_SDK_FMT_YV12 = 10;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLCommon$ResultCode.class */
    public enum ResultCode {
        BL_OK(0),
        BL_E_INVALIDARG(-1),
        BL_E_HANDLE(-2),
        BL_E_OUTOFMEMORY(-3),
        BL_E_FAIL(-4),
        BL_E_DELNOTFOUND(-5),
        BL_E_INVALID_PIXEL_FORMAT(-6),
        BL_E_FILE_NOT_FOUND(-7),
        BL_E_INVALID_FILE_FORMAT(-8),
        BL_E_FILE_EXPIRE(-9),
        BL_E_INVALID_AUTH(-13),
        BL_E_INVALID_APPID(-14),
        BL_E_AUTH_EXPIRE(-15),
        BL_E_UUID_MISMATCH(-16),
        BL_E_ONLINE_AUTH_CONNECT_FAIL(-17),
        BL_E_ONLINE_AUTH_TIMEOUT(-18),
        BL_E_ONLINE_AUTH_INVALID(-19),
        BL_E_LICENSE_IS_NOT_ACTIVABLE(-20),
        BL_E_ACTIVE_FAIL(-21),
        BL_E_ACTIVE_CODE_INVALID(-22),
        BL_E_NO_CAPABILITY(-23),
        BL_E_PLATFORM_NOTSUPPORTED(-24),
        BL_E_SUBMODEL_NOT_EXIST(-26),
        BL_E_ONLINE_ACTIVATE_NO_NEED(-27),
        BL_E_ONLINE_ACTIVATE_FAIL(-28),
        BL_E_ONLINE_ACTIVATE_CODE_INVALID(-29),
        BL_E_ONLINE_ACTIVATE_CONNECT_FAIL(-30),
        BL_E_UNSUPPORTED_ZIP(-32),
        BL_E_ZIP_EXIBL_IN_MEMORY(-33),
        BL_E_NOT_CONNECT_TO_NETWORK(-34),
        BL_E_OTHER_LINK_ERRORS_IN_HTTPS(-35),
        BL_E_CERTIFICAT_NOT_BE_TRUSTED(-36);

        private final int resultCode;

        ResultCode(int i7) {
            this.resultCode = i7;
        }

        public int getResultCode() {
            return this.resultCode;
        }
    }

    static {
        BLLibraryLoader.loadBLLibrary();
        BL_LOG_UNKNOWN = 0;
        BL_LOG_VERBOSE = 1;
        BL_LOG_DEBUG = 2;
        BL_LOG_INFO = 3;
        BL_LOG_WARN = 4;
        BL_LOG_ERROR = 5;
        BL_LOG_FATAL = 6;
        BL_LOG_SILENT = 7;
        BL_LOG_MODE_NONE = 0;
        BL_LOG_MODE_FILE = 1;
        BL_LOG_MODE_SCREEN = 2;
    }

    public static native boolean checkAppIdAuth();

    public static native String getSDKVersion();

    public static native int loadLicenseFromAssetFile(String str, AssetManager assetManager);

    public static native int loadLicenseFromFile(String str);

    public static native void setLogLevel(int i7);

    public static native int setLogMode(int i7);

    public static native int setLogPath(String str);
}
