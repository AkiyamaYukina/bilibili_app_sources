package com.bilibili.live.streaming.log;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/log/IBiliPushLogger.class */
public interface IBiliPushLogger {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/log/IBiliPushLogger$DefaultImpls.class */
    public static final class DefaultImpls {
    }

    static /* synthetic */ void logDebug$default(IBiliPushLogger iBiliPushLogger, Function0 function0, String str, String str2, Throwable th, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logDebug");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            str2 = null;
        }
        if ((i7 & 8) != 0) {
            th = null;
        }
        iBiliPushLogger.logDebug(function0, str, str2, th);
    }

    static /* synthetic */ void logError$default(IBiliPushLogger iBiliPushLogger, String str, String str2, String str3, Throwable th, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        if ((i7 & 8) != 0) {
            th = null;
        }
        iBiliPushLogger.logError(str, str2, str3, th);
    }

    static /* synthetic */ void logInfo$default(IBiliPushLogger iBiliPushLogger, String str, String str2, String str3, Throwable th, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logInfo");
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        if ((i7 & 8) != 0) {
            th = null;
        }
        iBiliPushLogger.logInfo(str, str2, str3, th);
    }

    static /* synthetic */ void logVerbose$default(IBiliPushLogger iBiliPushLogger, String str, String str2, String str3, Throwable th, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logVerbose");
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        if ((i7 & 8) != 0) {
            th = null;
        }
        iBiliPushLogger.logVerbose(str, str2, str3, th);
    }

    static /* synthetic */ void logWarning$default(IBiliPushLogger iBiliPushLogger, String str, String str2, String str3, Throwable th, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logWarning");
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        if ((i7 & 8) != 0) {
            th = null;
        }
        iBiliPushLogger.logWarning(str, str2, str3, th);
    }

    void logDebug(@NotNull Function0<String> function0, @Nullable String str, @Nullable String str2, @Nullable Throwable th);

    void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th);

    void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th);

    void logVerbose(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th);

    void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th);
}
