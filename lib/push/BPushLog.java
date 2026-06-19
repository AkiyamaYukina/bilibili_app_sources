package com.bilibili.lib.push;

import androidx.compose.ui.text.font.C4496a;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushLog.class */
public final class BPushLog {

    @NotNull
    public static final BPushLog INSTANCE = new BPushLog();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Delegate f64205a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushLog$Delegate.class */
    public interface Delegate {
        void d(@Nullable String str, @Nullable String str2);

        void e(@Nullable String str, @Nullable String str2);

        void i(@Nullable String str, @Nullable String str2);

        void v(@Nullable String str, @Nullable String str2);

        void w(@Nullable String str, @Nullable String str2);
    }

    public static String a(String str) {
        return C4496a.a("PUSH_LG_", str);
    }

    @JvmStatic
    public static final void d(@Nullable String str, @Nullable String str2) {
        INSTANCE.getClass();
        Delegate delegate = f64205a;
        if (delegate != null) {
            delegate.d(a(str), str2);
        }
    }

    @JvmStatic
    public static final void e(@Nullable String str, @Nullable String str2) {
        INSTANCE.getClass();
        Delegate delegate = f64205a;
        if (delegate != null) {
            delegate.e(a(str), str2);
        }
    }

    @JvmStatic
    public static final void i(@Nullable String str, @Nullable String str2) {
        INSTANCE.getClass();
        Delegate delegate = f64205a;
        if (delegate != null) {
            delegate.i(a(str), str2);
        }
    }

    @JvmStatic
    public static final void setLogDelegate(@Nullable Delegate delegate) {
        if (delegate != null) {
            f64205a = delegate;
        }
    }

    @JvmStatic
    public static final void v(@Nullable String str, @Nullable String str2) {
        INSTANCE.getClass();
        Delegate delegate = f64205a;
        if (delegate != null) {
            delegate.v(a(str), str2);
        }
    }

    @JvmStatic
    public static final void w(@Nullable String str, @Nullable String str2) {
        INSTANCE.getClass();
        Delegate delegate = f64205a;
        if (delegate != null) {
            delegate.w(a(str), str2);
        }
    }
}
