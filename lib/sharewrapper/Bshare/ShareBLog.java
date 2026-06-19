package com.bilibili.lib.sharewrapper.Bshare;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.lib.sharewrapper.Bshare.GShare;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/ShareBLog.class */
public final class ShareBLog {

    @NotNull
    public static final ShareBLog INSTANCE = new ShareBLog();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static GShare.Log f64405a;

    public static String a(String str) {
        return C4496a.a("BShare.", str);
    }

    @JvmStatic
    public static final void d(@Nullable String str, @Nullable String str2) {
        GShare.Log log = f64405a;
        if (log != null) {
            INSTANCE.getClass();
            log.d(a(str), str2);
        }
    }

    @JvmStatic
    public static final void d(@Nullable String str, @Nullable String str2, @NotNull Throwable th) {
        GShare.Log log = f64405a;
        if (log != null) {
            INSTANCE.getClass();
            log.d(a(str), str2, th);
        }
    }

    @JvmStatic
    public static final void dfmt(@Nullable String str, @Nullable String str2, @NotNull Object... objArr) {
        GShare.Log log = f64405a;
        if (log != null) {
            log.dfmt(str, str2, objArr);
        }
    }

    @JvmStatic
    public static final void e(@Nullable String str, @Nullable String str2) {
        GShare.Log log = f64405a;
        if (log != null) {
            INSTANCE.getClass();
            log.e(a(str), str2);
        }
    }

    @JvmStatic
    public static final void e(@Nullable String str, @Nullable String str2, @NotNull Throwable th) {
        GShare.Log log = f64405a;
        if (log != null) {
            INSTANCE.getClass();
            log.e(a(str), str2, th);
        }
    }

    @JvmStatic
    public static final void i(@Nullable String str, @Nullable String str2) {
        GShare.Log log = f64405a;
        if (log != null) {
            INSTANCE.getClass();
            log.i(a(str), str2);
        }
    }

    @JvmStatic
    public static final void setLogDelegate(@Nullable GShare.Log log) {
        if (log != null) {
            f64405a = log;
        }
    }

    @JvmStatic
    public static final void v(@Nullable String str, @Nullable String str2) {
        GShare.Log log = f64405a;
        if (log != null) {
            INSTANCE.getClass();
            log.v(a(str), str2);
        }
    }

    @JvmStatic
    public static final void w(@Nullable String str, @Nullable String str2) {
        GShare.Log log = f64405a;
        if (log != null) {
            INSTANCE.getClass();
            log.w(a(str), str2);
        }
    }

    public final void e(@NotNull String str, @Nullable Throwable th) {
        GShare.Log log = f64405a;
        if (log != null) {
            log.e(str, th);
        }
    }
}
