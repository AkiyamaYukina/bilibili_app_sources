package com.bilibili.module.vip.combine;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/k.class */
public final class k implements Function1<Result<? extends Unit>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f66185a;

    public k(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f66185a = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        com.bilibili.ogv.infra.coroutine.a.a(this.f66185a, Result.box-impl(((Result) obj).unbox-impl()));
        return Unit.INSTANCE;
    }
}
