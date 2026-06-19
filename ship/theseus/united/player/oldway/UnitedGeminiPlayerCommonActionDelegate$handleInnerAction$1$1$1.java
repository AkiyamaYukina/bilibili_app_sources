package com.bilibili.ship.theseus.united.player.oldway;

import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.PageType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1$1$1.class */
public final class UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final PageType $pageType;
    final String $url;
    int label;
    final UnitedGeminiPlayerCommonActionDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1$1$1(UnitedGeminiPlayerCommonActionDelegate unitedGeminiPlayerCommonActionDelegate, String str, PageType pageType, Continuation<? super UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = unitedGeminiPlayerCommonActionDelegate;
        this.$url = str;
        this.$pageType = pageType;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1$1$1(this.this$0, this.$url, this.$pageType, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ZoomContainerService zoomContainerService = this.this$0.f104712i;
            String str = this.$url;
            PageType pageType = this.$pageType;
            ZoomContainerService.Side side = ZoomContainerService.Side.RIGHT;
            this.label = 1;
            if (zoomContainerService.n(str, pageType, side, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
