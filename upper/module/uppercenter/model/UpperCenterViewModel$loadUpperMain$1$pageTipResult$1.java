package com.bilibili.upper.module.uppercenter.model;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.bean.PageTip;
import com.bilibili.upper.api.service.UpperCenterApiService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/model/UpperCenterViewModel$loadUpperMain$1$pageTipResult$1.class */
public final class UpperCenterViewModel$loadUpperMain$1$pageTipResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PageTip>, Object> {
    int label;
    final UpperCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterViewModel$loadUpperMain$1$pageTipResult$1(UpperCenterViewModel upperCenterViewModel, Continuation<? super UpperCenterViewModel$loadUpperMain$1$pageTipResult$1> continuation) {
        super(2, continuation);
        this.this$0 = upperCenterViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperCenterViewModel$loadUpperMain$1$pageTipResult$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PageTip> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UpperCenterViewModel upperCenterViewModel = this.this$0;
            this.label = 1;
            upperCenterViewModel.getClass();
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(this));
            String accessToken = null;
            AccountService accountService = (AccountService) BLRouter.get$default(BLRouter.INSTANCE, AccountService.class, (String) null, 2, (Object) null);
            if (accountService != null) {
                accessToken = accountService.getAccessToken();
            }
            ((UpperCenterApiService) ServiceGenerator.createService(UpperCenterApiService.class)).getPageTipList(accessToken, 1).enqueue(new c(safeContinuation));
            Object orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = orThrow;
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
