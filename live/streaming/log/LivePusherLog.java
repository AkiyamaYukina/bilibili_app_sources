package com.bilibili.live.streaming.log;

import com.bilibili.live.streaming.BiliLivePushLoader;
import com.bilibili.mediastreaming.flashpoint.IBiliFlashpointLoggerObserver;
import com.bilibili.mediastreaming.flashpoint.f;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/log/LivePusherLog.class */
public final class LivePusherLog {

    @NotNull
    public static final LivePusherLog INSTANCE = new LivePusherLog();

    @NotNull
    private static final String TAG = "LiveStreamingSDK";
    private static boolean isEnabledNativeLogger = false;

    @NotNull
    private static final String pattern = "LivePushCC %P-%t %s:%# %!() %v since previous: %o ms";

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bilibili.live.streaming.log.LivePusherLog$1] */
    static {
        f.f66024a = new IBiliFlashpointLoggerObserver() { // from class: com.bilibili.live.streaming.log.LivePusherLog.1

            /* JADX INFO: renamed from: com.bilibili.live.streaming.log.LivePusherLog$1$WhenMappings */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/log/LivePusherLog$1$WhenMappings.class */
            public static final /* synthetic */ class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IBiliFlashpointLoggerObserver.Severity.values().length];
                    try {
                        iArr[IBiliFlashpointLoggerObserver.Severity.LS_VERBOSE.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[IBiliFlashpointLoggerObserver.Severity.LS_DEBUG.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[IBiliFlashpointLoggerObserver.Severity.LS_INFO.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    try {
                        iArr[IBiliFlashpointLoggerObserver.Severity.LS_WARNING.ordinal()] = 4;
                    } catch (NoSuchFieldError e10) {
                    }
                    try {
                        iArr[IBiliFlashpointLoggerObserver.Severity.LS_ERROR.ordinal()] = 5;
                    } catch (NoSuchFieldError e11) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // com.bilibili.mediastreaming.flashpoint.IBiliFlashpointLoggerObserver
            public void onLogMessage(IBiliFlashpointLoggerObserver.Severity severity, String str, String str2, Throwable th) {
                if (str2 == null) {
                    return;
                }
                String str3 = str;
                if (str == null) {
                    str3 = "BiliFlashpoint";
                }
                int i7 = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
                if (i7 == 1) {
                    LivePusherLog.v(str3, str2, th);
                    return;
                }
                if (i7 == 2) {
                    LivePusherLog.d(str3, str2, th);
                    return;
                }
                if (i7 == 3) {
                    LivePusherLog.i(str3, str2, th);
                    return;
                }
                if (i7 == 4) {
                    LivePusherLog.w(str3, str2, th);
                } else if (i7 != 5) {
                    LivePusherLog.d(str3, str2, th);
                } else {
                    LivePusherLog.e(str3, str2, th);
                }
            }
        };
    }

    private LivePusherLog() {
    }

    @JvmStatic
    public static final void d(@Nullable String str, @NotNull String str2, @Nullable Throwable th) {
        BLog.d(str != null ? "LiveStreamingSDK:".concat(str) : TAG, str2, th);
    }

    public static /* synthetic */ void d$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        d(str, str2, th);
    }

    @JvmStatic
    public static final void e(@Nullable String str, @NotNull String str2, @Nullable Throwable th) {
        BLog.e(str != null ? "LiveStreamingSDK:".concat(str) : TAG, str2, th);
    }

    public static /* synthetic */ void e$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        e(str, str2, th);
    }

    @JvmStatic
    public static final void i(@Nullable String str, @NotNull String str2, @Nullable Throwable th) {
        BLog.i(str != null ? "LiveStreamingSDK:".concat(str) : TAG, str2, th);
    }

    public static /* synthetic */ void i$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        i(str, str2, th);
    }

    private final native boolean setNativeLogPattern(String str);

    @JvmStatic
    public static final void v(@Nullable String str, @NotNull String str2, @Nullable Throwable th) {
        BLog.v(str != null ? "LiveStreamingSDK:".concat(str) : TAG, str2, th);
    }

    public static /* synthetic */ void v$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        v(str, str2, th);
    }

    @JvmStatic
    public static final void w(@Nullable String str, @NotNull String str2, @Nullable Throwable th) {
        BLog.w(str != null ? "LiveStreamingSDK:".concat(str) : TAG, str2, th);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        w(str, str2, th);
    }

    public final void enableNativeLogger() {
        BiliLivePushLoader.INSTANCE.load();
        if (isEnabledNativeLogger) {
            return;
        }
        setNativeLogPattern(pattern);
        isEnabledNativeLogger = true;
    }
}
