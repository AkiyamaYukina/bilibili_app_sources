package com.bilibili.ogv.infra.biliimage;

import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/biliimage/a.class */
public final class a implements ImageDataSubscriber<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f67862a;

    public a(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f67862a = cancellableContinuationImpl;
    }

    public final void onCancellation(ImageDataSource<Object> imageDataSource) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f67862a;
        if (cancellableContinuationImpl.isActive()) {
            com.bilibili.ogv.infra.coroutine.a.b(new CancellationException(), cancellableContinuationImpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFailure(com.bilibili.lib.image2.bean.ImageDataSource<java.lang.Object> r5) {
        /*
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L11
            r0 = r5
            java.lang.Throwable r0 = r0.getFailureCause()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L1b
        L11:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unknown error."
            r1.<init>(r2)
            r5 = r0
        L1b:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            r6 = r0
            r0 = r5
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
            kotlin.Result r0 = kotlin.Result.box-impl(r0)
            r5 = r0
            r0 = r4
            kotlinx.coroutines.CancellableContinuationImpl r0 = r0.f67862a
            r1 = r5
            com.bilibili.ogv.infra.coroutine.a.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.biliimage.a.onFailure(com.bilibili.lib.image2.bean.ImageDataSource):void");
    }

    public final void onResult(ImageDataSource<Object> imageDataSource) {
        Object result = imageDataSource != null ? imageDataSource.getResult() : null;
        CancellableContinuationImpl cancellableContinuationImpl = this.f67862a;
        if (result != null) {
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, Result.box-impl(Result.constructor-impl(result)));
        } else {
            Result.Companion companion = Result.Companion;
            com.bilibili.ogv.infra.coroutine.a.a(cancellableContinuationImpl, Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new NullPointerException("Null result!")))));
        }
    }
}
