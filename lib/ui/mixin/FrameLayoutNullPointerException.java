package com.bilibili.lib.ui.mixin;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/FrameLayoutNullPointerException.class */
@Keep
public final class FrameLayoutNullPointerException extends RuntimeException {

    @Nullable
    private final Throwable cause;

    @Nullable
    private final String message;

    public FrameLayoutNullPointerException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
        this.message = str;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }
}
