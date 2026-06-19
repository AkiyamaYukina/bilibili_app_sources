package com.bilibili.ship.theseus.united.player.oldway;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.PageType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1.class */
public final class UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PageType $pageType;
    final String $url;
    int label;
    final UnitedGeminiPlayerCommonActionDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1(UnitedGeminiPlayerCommonActionDelegate unitedGeminiPlayerCommonActionDelegate, String str, PageType pageType, Continuation<? super UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1> continuation) {
        super(2, continuation);
        this.this$0 = unitedGeminiPlayerCommonActionDelegate;
        this.$url = str;
        this.$pageType = pageType;
    }

    private static final Unit invokeSuspend$lambda$0(UnitedGeminiPlayerCommonActionDelegate unitedGeminiPlayerCommonActionDelegate, String str, PageType pageType, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1$1$1(unitedGeminiPlayerCommonActionDelegate, str, pageType, null));
        cVar.b(new UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1$1$2(unitedGeminiPlayerCommonActionDelegate, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1(this.this$0, this.$url, this.$pageType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UnitedGeminiPlayerCommonActionDelegate unitedGeminiPlayerCommonActionDelegate = this.this$0;
            String str = this.$url;
            PageType pageType = this.$pageType;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(unitedGeminiPlayerCommonActionDelegate, str, pageType, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
