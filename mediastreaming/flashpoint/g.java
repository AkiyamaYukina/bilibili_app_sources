package com.bilibili.mediastreaming.flashpoint;

import com.bilibili.mediastreaming.flashpoint.IBiliFlashpointLoggerObserver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/g.class */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f66026a;

    public g(@Nullable String str) {
        this.f66026a = str;
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.f66026a;
            strA = str4;
            if (str2 != null) {
                strA = B0.a.a(str4, ":", str2);
            }
        }
        f.a(IBiliFlashpointLoggerObserver.Severity.LS_ERROR, strA, str, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.f66026a;
            strA = str4;
            if (str2 != null) {
                strA = B0.a.a(str4, ":", str2);
            }
        }
        f.a(IBiliFlashpointLoggerObserver.Severity.LS_INFO, strA, str, th);
    }

    @Override // com.bilibili.mediastreaming.flashpoint.i
    public final void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th) {
        String strA = str3;
        if (str3 == null) {
            String str4 = this.f66026a;
            strA = str4;
            if (str2 != null) {
                strA = B0.a.a(str4, ":", str2);
            }
        }
        f.a(IBiliFlashpointLoggerObserver.Severity.LS_WARNING, strA, str, th);
    }
}
