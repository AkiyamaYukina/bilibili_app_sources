package com.bilibili.ogv.bpf.lifecycle;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleRegistry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f67494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LifecycleRegistry f67495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final L2.b f67496c;

    public c(@NotNull Context context, @NotNull LifecycleRegistry lifecycleRegistry, @NotNull L2.b bVar) {
        this.f67494a = context;
        this.f67495b = lifecycleRegistry;
        this.f67496c = bVar;
    }
}
