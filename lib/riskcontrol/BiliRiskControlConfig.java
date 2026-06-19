package com.bilibili.lib.riskcontrol;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/riskcontrol/BiliRiskControlConfig.class */
public final class BiliRiskControlConfig {

    @NotNull
    public static final BiliRiskControlConfig INSTANCE = new BiliRiskControlConfig();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static NeuronDelegate f64334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static LogDelegate f64335b;
    public static ParamsDelegate params;

    @JvmStatic
    @JvmOverloads
    public static final void init(@NotNull ParamsDelegate paramsDelegate, @Nullable NeuronDelegate neuronDelegate, @Nullable LogDelegate logDelegate) {
        INSTANCE.setParams(paramsDelegate);
        f64334a = neuronDelegate;
        f64335b = logDelegate;
    }

    @NotNull
    public final String configBySafe(@NotNull String str, @NotNull String str2) {
        return params != null ? getParams().config(str, str2) : str2;
    }

    @Nullable
    public final LogDelegate getLog() {
        return f64335b;
    }

    @NotNull
    public final ParamsDelegate getParams() {
        ParamsDelegate paramsDelegate = params;
        if (paramsDelegate != null) {
            return paramsDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("params");
        return null;
    }

    @Nullable
    public final NeuronDelegate getTracker() {
        return f64334a;
    }

    public final void setLog(@Nullable LogDelegate logDelegate) {
        f64335b = logDelegate;
    }

    public final void setParams(@NotNull ParamsDelegate paramsDelegate) {
        params = paramsDelegate;
    }

    public final void setTracker(@Nullable NeuronDelegate neuronDelegate) {
        f64334a = neuronDelegate;
    }
}
