package com.bilibili.lib.ui;

import android.os.Bundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/Target.class */
public final class Target {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<?> f64823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Bundle f64824b;

    public Target(@NotNull Class<?> cls, @NotNull Bundle bundle) {
        this.f64823a = cls;
        this.f64824b = bundle;
    }

    @NotNull
    public final Bundle getArgs() {
        return this.f64824b;
    }

    @NotNull
    public final Class<?> getClazz() {
        return this.f64823a;
    }
}
