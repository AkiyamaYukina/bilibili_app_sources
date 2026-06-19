package com.bilibili.ship.theseus.united.player.screenrecord;

import Oi1.d;
import com.bapis.bilibili.playershared.UnsupportScene;
import com.bilibili.lib.media.resource.PlayConfig;
import defpackage.a;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/screenrecord/UnitedScreenRecordSuppressionService$collectScreenRecordState$5.class */
final class UnitedScreenRecordSuppressionService$collectScreenRecordState$5 extends SuspendLambda implements Function2<Pair<? extends ScreenModeType, ? extends d>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final UnitedScreenRecordSuppressionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedScreenRecordSuppressionService$collectScreenRecordState$5(UnitedScreenRecordSuppressionService unitedScreenRecordSuppressionService, Continuation<? super UnitedScreenRecordSuppressionService$collectScreenRecordState$5> continuation) {
        super(2, continuation);
        this.this$0 = unitedScreenRecordSuppressionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnitedScreenRecordSuppressionService$collectScreenRecordState$5 unitedScreenRecordSuppressionService$collectScreenRecordState$5 = new UnitedScreenRecordSuppressionService$collectScreenRecordState$5(this.this$0, continuation);
        unitedScreenRecordSuppressionService$collectScreenRecordState$5.L$0 = obj;
        return unitedScreenRecordSuppressionService$collectScreenRecordState$5;
    }

    public final Object invoke(Pair<? extends ScreenModeType, d> pair, Continuation<? super Unit> continuation) {
        return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        PlayConfig.PlayMenuConfig playMenuConfig;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Pair pair = (Pair) this.L$0;
        ScreenModeType screenModeType = (ScreenModeType) pair.component1();
        d dVar = (d) pair.component2();
        PlayConfig playConfig = dVar.b;
        UnsupportScene unsupportScene = dVar.d;
        boolean z6 = playConfig == null || (playMenuConfig = playConfig.K) == null || !(!playMenuConfig.a || playMenuConfig.a().contains(unsupportScene) || playMenuConfig.e == PlayConfig.UnsupportedState.HALF);
        PlayConfig playConfig2 = dVar.b;
        boolean z7 = true;
        if (playConfig2 != null) {
            PlayConfig.PlayMenuConfig playMenuConfig2 = playConfig2.K;
            if (playMenuConfig2 == null) {
                z7 = true;
            } else {
                z7 = false;
                if (playMenuConfig2.a) {
                    z7 = false;
                    if (!playMenuConfig2.a().contains(unsupportScene)) {
                        z7 = false;
                        if (playMenuConfig2.e != PlayConfig.UnsupportedState.FULL) {
                            z7 = true;
                        }
                    }
                }
            }
        }
        a.b("[theseus-united-UnitedScreenRecordSuppressionService$collectScreenRecordState$5-invokeSuspend] ", "screenType: " + screenModeType + " recordHalf: " + z6 + " recordFull: " + z7, "UnitedScreenRecordSuppressionService$collectScreenRecordState$5-invokeSuspend");
        if (!CoroutineScopeKt.isActive(this.this$0.f104787a)) {
            return Unit.INSTANCE;
        }
        if (screenModeType == ScreenModeType.THUMB) {
            UnitedScreenRecordSuppressionService.a(this.this$0, z6);
        } else {
            UnitedScreenRecordSuppressionService.a(this.this$0, z7);
        }
        return Unit.INSTANCE;
    }
}
