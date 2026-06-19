package com.bilibili.ogv.rank;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.ImageBitmap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/G.class */
public final /* synthetic */ class G implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f71833b;

    public /* synthetic */ G(MutableState mutableState, int i7) {
        this.f71832a = i7;
        this.f71833b = mutableState;
    }

    public final Object invoke() {
        switch (this.f71832a) {
            case 0:
                return (T) this.f71833b.getValue();
            default:
                return (ImageBitmap) this.f71833b.getValue();
        }
    }
}
