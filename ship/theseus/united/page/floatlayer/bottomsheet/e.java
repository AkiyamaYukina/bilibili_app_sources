package com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet;

import kotlin.Pair;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/e.class */
public final class e {
    public static final float a(@NotNull Pair<Integer, Integer> pair, boolean z6) {
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        int iRoundToInt = MathKt.roundToInt(iIntValue / 1.7777778f);
        int iMin = iRoundToInt;
        if (z6) {
            iMin = Math.min(((Number) pair.getSecond()).intValue() / 2, iRoundToInt);
        }
        return iMin / iIntValue2;
    }
}
