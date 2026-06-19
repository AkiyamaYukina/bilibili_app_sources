package com.bilibili.mediastreaming.flashpoint;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/i.class */
public interface i {
    static /* synthetic */ void b(i iVar, String str, Throwable th, int i7) {
        if ((i7 & 8) != 0) {
            th = null;
        }
        iVar.logError(str, null, null, th);
    }

    static /* synthetic */ void c(i iVar, String str, Throwable th, int i7) {
        if ((i7 & 8) != 0) {
            th = null;
        }
        iVar.logWarning(str, null, null, th);
    }

    void logError(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th);

    void logInfo(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th);

    void logWarning(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Throwable th);
}
