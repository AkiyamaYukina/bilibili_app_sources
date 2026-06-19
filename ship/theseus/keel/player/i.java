package com.bilibili.ship.theseus.keel.player;

import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/i.class */
public final class i {
    @Nullable
    public static final Object a(@NotNull h hVar, long j7, @NotNull SuspendLambda suspendLambda) {
        j jVarJ = hVar.j();
        if (jVarJ == null) {
            BLog.w("TheseusKeelPlayer", "current playable is null can not seek!", new IllegalStateException());
            return Unit.INSTANCE;
        }
        hVar.p();
        Object objY = jVarJ.y(j7, false, suspendLambda);
        return objY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objY : Unit.INSTANCE;
    }
}
