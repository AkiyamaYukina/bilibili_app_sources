package com.bilibili.live.streaming.log;

import B0.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/log/BiliPushLogger.class */
public class BiliPushLogger implements IBiliPushLogger {
    private boolean blockLine;

    @NotNull
    private final String endLine;

    @NotNull
    private final String startLine;

    @Nullable
    private final String tag;

    public BiliPushLogger() {
        this(null, 1, null);
    }

    public BiliPushLogger(@Nullable String str) {
        this.tag = str;
        this.startLine = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>start>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
        this.endLine = "\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<end<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<";
    }

    public /* synthetic */ BiliPushLogger(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }

    @NotNull
    public final BiliPushLogger enableBlockLine(boolean z6) {
        this.blockLine = z6;
        return this;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logDebug(@NotNull Function0<String> function0, @Nullable String str, @Nullable String str2, @Nullable Throwable th) {
        String str3;
        String strA = str2;
        if (str2 == null) {
            String str4 = this.tag;
            strA = str4;
            if (str != null) {
                strA = a.a(str4, ":", str);
            }
        }
        if (this.blockLine) {
            str3 = this.startLine + function0 + this.endLine;
        } else {
            str3 = (String) function0.invoke();
        }
        LivePusherLog.d(strA, str3, th);
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.tag;
            strA = str4;
            if (str2 != null) {
                strA = a.a(str4, ":", str2);
            }
        }
        String strA2 = str;
        if (this.blockLine) {
            strA2 = a.a(this.startLine, str, this.endLine);
        }
        LivePusherLog.e(strA, strA2, th);
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.tag;
            strA = str4;
            if (str2 != null) {
                strA = a.a(str4, ":", str2);
            }
        }
        String strA2 = str;
        if (this.blockLine) {
            strA2 = a.a(this.startLine, str, this.endLine);
        }
        LivePusherLog.i(strA, strA2, th);
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logVerbose(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.tag;
            strA = str4;
            if (str2 != null) {
                strA = a.a(str4, ":", str2);
            }
        }
        String strA2 = str;
        if (this.blockLine) {
            strA2 = a.a(this.startLine, str, this.endLine);
        }
        LivePusherLog.v(strA, strA2, th);
    }

    @Override // com.bilibili.live.streaming.log.IBiliPushLogger
    public void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.tag;
            strA = str4;
            if (str2 != null) {
                strA = a.a(str4, ":", str2);
            }
        }
        String strA2 = str;
        if (this.blockLine) {
            strA2 = a.a(this.startLine, str, this.endLine);
        }
        LivePusherLog.w(strA, strA2, th);
    }
}
