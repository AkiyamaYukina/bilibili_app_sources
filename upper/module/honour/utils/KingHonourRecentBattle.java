package com.bilibili.upper.module.honour.utils;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/KingHonourRecentBattle.class */
@StabilityInferred(parameters = 1)
public final class KingHonourRecentBattle {
    @NotNull
    public static Flow a() {
        return FlowKt.callbackFlow(new KingHonourRecentBattle$hasKingHonorAccountInfo$1(null));
    }

    @NotNull
    public static Flow b(@NotNull Context context) {
        return FlowKt.callbackFlow(new KingHonourRecentBattle$hasKingHonourBattleInfo$1(context, null));
    }

    @NotNull
    public static Flow c(@NotNull Context context) {
        return FlowKt.callbackFlow(new KingHonourRecentBattle$hasKingHonourReportInfo$1(context, null));
    }
}
