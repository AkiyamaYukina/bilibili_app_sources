package com.bilibili.lib.ui.mixin;

import com.bilibili.lib.ui.mixin.IHasRoute;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/d.class */
public final class d implements IHasRoute.Info {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f64899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f64900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f64901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f64902d;

    public /* synthetic */ d(String str, String str2, String str3, int i7) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, "");
    }

    public d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f64899a = str;
        this.f64900b = str2;
        this.f64901c = str3;
        this.f64902d = str4;
    }

    @Override // com.bilibili.lib.ui.mixin.IHasRoute.Info
    @NotNull
    public final String getParentRouteName() {
        return this.f64902d;
    }

    @Override // com.bilibili.lib.ui.mixin.IHasRoute.Info
    @NotNull
    public final String getRouteName() {
        return this.f64900b;
    }

    @Override // com.bilibili.lib.ui.mixin.IHasRoute.Info
    @NotNull
    public final String getRouteRule() {
        return this.f64901c;
    }

    @Override // com.bilibili.lib.ui.mixin.IHasRoute.Info
    @NotNull
    public final String getTargetUrl() {
        return this.f64899a;
    }
}
