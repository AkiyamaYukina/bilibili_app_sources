package com.bilibili.studio.videoeditor.template;

import android.app.Application;
import bolts.Task;
import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/e0.class */
public final class e0 implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC7041a f110072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f110073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CancellableContinuationImpl f110074c;

    public e0(InterfaceC7041a interfaceC7041a, Application application, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f110072a = interfaceC7041a;
        this.f110073b = application;
        this.f110074c = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Task.callInBackground(new d0(this.f110072a, this.f110073b, this.f110074c, zBooleanValue));
        return Unit.INSTANCE;
    }
}
