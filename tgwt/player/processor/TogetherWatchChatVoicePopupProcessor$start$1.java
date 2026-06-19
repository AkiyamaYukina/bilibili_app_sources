package com.bilibili.tgwt.player.processor;

import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.chatroomsdk.SurpriseEvent;
import com.bilibili.tgwt.player.widget.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatVoicePopupProcessor$start$1.class */
final class TogetherWatchChatVoicePopupProcessor$start$1 extends SuspendLambda implements Function2<SurpriseEvent, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchChatVoicePopupProcessor$start$1(k kVar, Continuation<? super TogetherWatchChatVoicePopupProcessor$start$1> continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchChatVoicePopupProcessor$start$1 togetherWatchChatVoicePopupProcessor$start$1 = new TogetherWatchChatVoicePopupProcessor$start$1(this.this$0, continuation);
        togetherWatchChatVoicePopupProcessor$start$1.L$0 = obj;
        return togetherWatchChatVoicePopupProcessor$start$1;
    }

    public final Object invoke(SurpriseEvent surpriseEvent, Continuation<? super Unit> continuation) {
        return create(surpriseEvent, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SurpriseEvent surpriseEvent = (SurpriseEvent) this.L$0;
        if (this.this$0.f111660b.getScreenStateHelper().a().b) {
            k kVar = this.this$0;
            String landscapeAnim = surpriseEvent.getLandscapeAnim();
            kVar.getClass();
            IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
            layoutParams.setFunctionType(1);
            layoutParams.touchEnable(false);
            layoutParams.setEnterAnim(-1);
            layoutParams.setExitAnim(-1);
            layoutParams.touchOutsideDismiss(false);
            layoutParams.setLayoutType(16);
            BangumiPlayerContainerService bangumiPlayerContainerService = kVar.f111661c;
            FunctionWidgetToken functionWidgetTokenShowWidget = bangumiPlayerContainerService.getPlayerServiceController().a.c().showWidget(com.bilibili.tgwt.player.widget.a.class, layoutParams);
            if (functionWidgetTokenShowWidget != null) {
                bangumiPlayerContainerService.getPlayerServiceController().a.c().updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget, new a.C1221a(landscapeAnim));
            }
            this.this$0.f111661c.getPlayerServiceController().n();
        }
        return Unit.INSTANCE;
    }
}
