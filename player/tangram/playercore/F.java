package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.playercore.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/F.class */
public final class F {
    @Nullable
    public static final int[] a(@NotNull ClosedRange<com.bilibili.player.tangram.basic.a> closedRange) {
        if (com.bilibili.player.tangram.basic.a.b(((com.bilibili.player.tangram.basic.a) closedRange.getStart()).f79320a, 0) && com.bilibili.player.tangram.basic.a.b(((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a, Integer.MAX_VALUE)) {
            return null;
        }
        return new int[]{((com.bilibili.player.tangram.basic.a) closedRange.getStart()).f79320a, ((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a};
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final boolean b(@NotNull z zVar, @Nullable com.bilibili.player.tangram.basic.a aVar) throws NoWhenBranchMatchedException {
        boolean zContains;
        if (aVar == null) {
            return false;
        }
        if (Intrinsics.areEqual(zVar, z.b.f79470a)) {
            zContains = true;
        } else if (zVar instanceof z.c) {
            ((z.c) zVar).getClass();
            zContains = com.bilibili.player.tangram.basic.a.a(0, aVar);
        } else {
            if (!(zVar instanceof z.a)) {
                throw new NoWhenBranchMatchedException();
            }
            zContains = ((z.a) zVar).f79469a.contains(aVar);
        }
        return zContains;
    }

    @NotNull
    public static final ClosedRange<com.bilibili.player.tangram.basic.a> c(@NotNull ClosedRange<Integer> closedRange) {
        int i7;
        int iIntValue = ((Number) closedRange.getStart()).intValue();
        if (iIntValue < 0) {
            i7 = 0;
        } else {
            i7 = iIntValue;
            if (iIntValue == 15) {
                i7 = 16;
            }
        }
        com.bilibili.player.tangram.basic.a aVar = new com.bilibili.player.tangram.basic.a(i7);
        int iIntValue2 = ((Number) closedRange.getEndInclusive()).intValue();
        if (iIntValue2 < 0) {
            iIntValue2 = 0;
        } else if (iIntValue2 == 15) {
            iIntValue2 = 16;
        }
        return RangesKt.rangeTo(aVar, new com.bilibili.player.tangram.basic.a(iIntValue2));
    }
}
