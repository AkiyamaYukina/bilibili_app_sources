package com.bilibili.lib.tribe.core.internal3.bundle;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/IllegalBundleException.class */
public final class IllegalBundleException extends Exception {
    public IllegalBundleException(@NotNull String str, @Nullable Throwable th) {
        super(str, th);
    }

    public /* synthetic */ IllegalBundleException(String str, Throwable th, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : th);
    }
}
