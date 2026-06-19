package com.bilibili.studio.videoeditor.template;

import android.app.Application;
import fD0.InterfaceC7041a;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/f0.class */
public final class f0<V> implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC7041a f110077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f110078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CancellableContinuationImpl f110079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f110080d;

    public f0(InterfaceC7041a interfaceC7041a, Application application, CancellableContinuationImpl cancellableContinuationImpl, boolean z6) {
        this.f110077a = interfaceC7041a;
        this.f110078b = application;
        this.f110079c = cancellableContinuationImpl;
        this.f110080d = z6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f110077a.transferMmkvDataToBlkv(this.f110078b);
        CancellableContinuationImpl cancellableContinuationImpl = this.f110079c;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.valueOf(this.f110080d)));
        }
        return Unit.INSTANCE;
    }
}
