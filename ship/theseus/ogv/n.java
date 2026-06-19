package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import dagger.Module;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/n.class */
@StabilityInferred(parameters = 1)
@Module
public final class n {
    public static long a(String str) {
        Integer numB = Uj0.a.b(str);
        return numB == null ? Color.Companion.m2665getUnspecified0d7_KjU() : ColorKt.Color(numB.intValue());
    }
}
