package com.bilibili.sistersplayer.p2p.utils;

import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.z;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.UStringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/P2PLogger.class */
public final class P2PLogger {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "P2PLogger";

    @NotNull
    private final String instanceId = UStringsKt.toString-V7xB4Y4(UInt.constructor-impl(hashCode()), 32);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/utils/P2PLogger$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        PLog.INSTANCE.getTags().put(TAG, Boolean.TRUE);
    }

    public static /* synthetic */ void logD$default(P2PLogger p2PLogger, String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        p2PLogger.logD(str, str2, th);
    }

    public static /* synthetic */ void logE$default(P2PLogger p2PLogger, String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        p2PLogger.logE(str, str2, th);
    }

    public static /* synthetic */ void logI$default(P2PLogger p2PLogger, String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        p2PLogger.logI(str, str2, th);
    }

    public static /* synthetic */ void logV$default(P2PLogger p2PLogger, String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        p2PLogger.logV(str, str2, th);
    }

    public static /* synthetic */ void logW$default(P2PLogger p2PLogger, String str, String str2, Throwable th, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            th = null;
        }
        p2PLogger.logW(str, str2, th);
    }

    public final void bindRoomId(@NotNull String str) {
        logI$default(this, TAG, C4496a.a("bindRoom ", str), null, 4, null);
    }

    public final void logD(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        PLog.logD(str, z.a("[", this.instanceId, "] ", str2), th);
    }

    public final void logE(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        PLog.logE(str, z.a("[", this.instanceId, "] ", str2), th);
    }

    public final void logI(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        PLog.logI(str, z.a("[", this.instanceId, "] ", str2), th);
    }

    public final void logV(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        PLog.logV(str, z.a("[", this.instanceId, "] ", str2), th);
    }

    public final void logW(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        PLog.logW(str, z.a("[", this.instanceId, "] ", str2), th);
    }
}
