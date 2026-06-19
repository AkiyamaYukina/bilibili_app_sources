package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/J.class */
public final class J implements Arrangement.Vertical {
    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    public final void arrange(Density density, int i7, int[] iArr, int[] iArr2) {
        int iMin = Math.min((i7 - ArraysKt.sum(iArr)) / 2, density.mo1265roundToPx0680j_4(Dp.m3880constructorimpl(160)));
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            iArr2[i9] = iMin;
            iMin += i10;
            i8++;
            i9++;
        }
    }
}
