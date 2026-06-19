package com.bilibili.ogv.opbase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Exp.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Exp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cinema_layout_exp")
    private final boolean f69823a;

    public Exp() {
        this(false, 1);
    }

    public Exp(boolean z6, int i7) {
        this.f69823a = (i7 & 1) != 0 ? false : z6;
    }

    public final boolean a() {
        return this.f69823a;
    }
}
