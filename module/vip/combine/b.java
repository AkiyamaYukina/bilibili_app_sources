package com.bilibili.module.vip.combine;

import android.net.Uri;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/b.class */
public final class b implements Function1<Uri, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f66174a;

    public b(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f66174a = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        com.bilibili.ogv.infra.coroutine.a.a(this.f66174a, Result.box-impl(Result.constructor-impl((Uri) obj)));
        return Unit.INSTANCE;
    }
}
