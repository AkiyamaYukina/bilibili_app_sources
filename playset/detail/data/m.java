package com.bilibili.playset.detail.data;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import os0.C8259e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/m.class */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84552a;

    public final Object invoke(Object obj) {
        switch (this.f84552a) {
            case 0:
                return Boolean.valueOf(((com.bilibili.playset.api.a) obj) instanceof C8259e);
            default:
                ((ContentDrawScope) obj).drawContent();
                return Unit.INSTANCE;
        }
    }
}
