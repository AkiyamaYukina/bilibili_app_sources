package com.bilibili.ogv.opbase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Intervene.class */
@StabilityInferred(parameters = 0)
@Bson
public final class Intervene {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RecommendModule f69853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f69855c;

    public Intervene(int i7, @NotNull RecommendModule recommendModule, @NotNull String str) {
        this.f69853a = recommendModule;
        this.f69854b = i7;
        this.f69855c = str;
    }
}
