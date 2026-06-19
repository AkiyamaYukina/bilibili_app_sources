package com.bilibili.module.vip.combine;

import com.bilibili.vip.VipPaymentCombineException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/c.class */
public final class c implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f66175a;

    public c(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f66175a = cancellableContinuationImpl;
    }

    public final Object invoke() {
        Result.Companion companion = Result.Companion;
        com.bilibili.ogv.infra.coroutine.a.a(this.f66175a, Result.box-impl(Result.constructor-impl(ResultKt.createFailure(VipPaymentCombineException.PayTipsCancel.INSTANCE))));
        return Unit.INSTANCE;
    }
}
