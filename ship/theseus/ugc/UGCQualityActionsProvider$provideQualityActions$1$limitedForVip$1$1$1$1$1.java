package com.bilibili.ship.theseus.ugc;

import Vr0.b;
import com.bilibili.ship.theseus.united.page.videoquality.A0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1.class */
public final class UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $from;
    final AbsFunctionWidgetService $functionWidgetService;
    final int $quality;
    final FunctionWidgetToken $token;
    final A0 $vipViewMaterialRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1(A0 a02, FunctionWidgetToken functionWidgetToken, AbsFunctionWidgetService absFunctionWidgetService, String str, int i7, Continuation<? super UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$vipViewMaterialRepository = a02;
        this.$token = functionWidgetToken;
        this.$functionWidgetService = absFunctionWidgetService;
        this.$from = str;
        this.$quality = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1(this.$vipViewMaterialRepository, this.$token, this.$functionWidgetService, this.$from, this.$quality, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<b.C0134b> mutableStateFlow = this.$vipViewMaterialRepository.f103694f;
            UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1 uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1 = new UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1(null);
            this.label = 1;
            Object objFirst = FlowKt.first(mutableStateFlow, uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1, this);
            obj = objFirst;
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        b.C0134b c0134b = (b.C0134b) obj;
        if (this.$token.isShowing()) {
            this.$functionWidgetService.updateFunctionWidgetConfiguration(this.$token, UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1.invokeSuspend$lambda$0$getConfig(this.$from, this.$quality, c0134b));
        }
        return Unit.INSTANCE;
    }
}
