package com.bilibili.ship.theseus.united.player.screenrecord;

import Oi1.d;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/screenrecord/UnitedScreenRecordSuppressionService$collectScreenRecordState$4.class */
final /* synthetic */ class UnitedScreenRecordSuppressionService$collectScreenRecordState$4 extends AdaptedFunctionReference implements Function3<ScreenModeType, d, Continuation<? super Pair<? extends ScreenModeType, ? extends d>>, Object>, SuspendFunction {
    public static final UnitedScreenRecordSuppressionService$collectScreenRecordState$4 INSTANCE = new UnitedScreenRecordSuppressionService$collectScreenRecordState$4();

    public UnitedScreenRecordSuppressionService$collectScreenRecordState$4() {
        super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
    }

    public final Object invoke(ScreenModeType screenModeType, d dVar, Continuation<? super Pair<? extends ScreenModeType, d>> continuation) {
        return new Pair(screenModeType, dVar);
    }
}
