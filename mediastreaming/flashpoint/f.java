package com.bilibili.mediastreaming.flashpoint;

import android.util.Log;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.mediastreaming.flashpoint.IBiliFlashpointLoggerObserver;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static LivePusherLog.AnonymousClass1 f66024a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/f$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f66025a;

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
            f66025a = iArr;
        }
    }

    @JvmStatic
    public static final void a(@NotNull IBiliFlashpointLoggerObserver.Severity severity, @Nullable String str, @NotNull String str2, @Nullable Throwable th) {
        String strConcat = str == null ? "BiliFlashpointLog" : "BiliFlashpointLog:".concat(str);
        LivePusherLog.AnonymousClass1 anonymousClass1 = f66024a;
        if (anonymousClass1 != null) {
            anonymousClass1.onLogMessage(severity, strConcat, str2, th);
            return;
        }
        int i7 = a.f66025a[severity.ordinal()];
        if (i7 == 1 || i7 == 2) {
            return;
        }
        if (i7 == 3) {
            Log.i(strConcat, str2, th);
            return;
        }
        if (i7 == 4) {
            Log.w(strConcat, str2, th);
        } else if (i7 != 5) {
            Log.i(strConcat, str2, th);
        } else {
            Log.e(strConcat, str2, th);
        }
    }
}
