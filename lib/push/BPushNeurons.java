package com.bilibili.lib.push;

import java.util.Map;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushNeurons.class */
public final class BPushNeurons {

    @NotNull
    public static final BPushNeurons INSTANCE = new BPushNeurons();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Delegate f64207a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushNeurons$Delegate.class */
    public interface Delegate {
        void report(boolean z6, int i7, @NotNull String str, @NotNull Map<String, String> map);

        void reportClick(boolean z6, @NotNull String str, @NotNull Map<String, String> map);

        void trackT(boolean z6, @NotNull String str, @NotNull Map<String, String> map);
    }

    @JvmStatic
    public static final void setNeuronsDelegate(@Nullable Delegate delegate) {
        if (delegate != null) {
            f64207a = delegate;
        }
    }

    public final void report(boolean z6, int i7, @NotNull String str, @NotNull Map<String, String> map) {
        Delegate delegate = f64207a;
        if (delegate != null) {
            delegate.report(z6, i7, str, map);
        }
    }

    public final void reportClick(boolean z6, @NotNull String str, @NotNull Map<String, String> map) {
        Delegate delegate = f64207a;
        if (delegate != null) {
            delegate.reportClick(z6, str, map);
        }
    }

    public final void trackT(boolean z6, @NotNull String str, @NotNull Map<String, String> map) {
        Delegate delegate = f64207a;
        if (delegate != null) {
            delegate.trackT(z6, str, map);
        }
    }
}
