package com.bilibili.studio.videoeditor.template;

import android.app.Application;
import fD0.InterfaceC7041a;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/d0.class */
public final class d0<V> implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC7041a f110064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f110065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CancellableContinuationImpl f110066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f110067d;

    public d0(InterfaceC7041a interfaceC7041a, Application application, CancellableContinuationImpl cancellableContinuationImpl, boolean z6) {
        this.f110064a = interfaceC7041a;
        this.f110065b = application;
        this.f110066c = cancellableContinuationImpl;
        this.f110067d = z6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f110064a.transferMmkvDataToBlkv(this.f110065b);
        Result.Companion companion = Result.Companion;
        this.f110066c.resumeWith(Result.constructor-impl(Boolean.valueOf(this.f110067d)));
        return Unit.INSTANCE;
    }
}
