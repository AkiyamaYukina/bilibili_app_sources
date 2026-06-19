package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$show$requestClose$1.class */
final class TheseusV3WebService$show$requestClose$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.BooleanRef $active;
    final Ref.ObjectRef<PlayerV3WebGeneralUIComponent> $activeWebUiComponent;
    final Ref.ObjectRef<String> $finishReason;
    final String $logSummary;
    final String $reason;
    final String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusV3WebService$show$requestClose$1(Ref.ObjectRef<PlayerV3WebGeneralUIComponent> objectRef, Ref.BooleanRef booleanRef, String str, String str2, Ref.ObjectRef<String> objectRef2, String str3, Continuation<? super TheseusV3WebService$show$requestClose$1> continuation) {
        super(2, continuation);
        this.$activeWebUiComponent = objectRef;
        this.$active = booleanRef;
        this.$source = str;
        this.$logSummary = str2;
        this.$finishReason = objectRef2;
        this.$reason = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusV3WebService$show$requestClose$1(this.$activeWebUiComponent, this.$active, this.$source, this.$logSummary, this.$finishReason, this.$reason, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = (PlayerV3WebGeneralUIComponent) this.$activeWebUiComponent.element;
        if (!this.$active.element || playerV3WebGeneralUIComponent == null) {
            BLog.w("TheseusV3Web", this.$source + " close skipped reason=no_active_web_component " + this.$logSummary);
            return Unit.INSTANCE;
        }
        this.$finishReason.element = this.$reason;
        playerV3WebGeneralUIComponent.d();
        BLog.i("TheseusV3Web", this.$source + " close requested " + this.$logSummary);
        return Unit.INSTANCE;
    }
}
