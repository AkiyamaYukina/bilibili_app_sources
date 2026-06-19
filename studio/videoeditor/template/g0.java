package com.bilibili.studio.videoeditor.template;

import android.app.Application;
import bolts.Task;
import com.bilibili.base.MainThread;
import com.bilibili.droid.ToastHelper;
import fD0.InterfaceC7041a;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/g0.class */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliTemplateEngineManager f110086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC7041a f110087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f110088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CancellableContinuationImpl f110089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f110090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f110091f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/g0$a.class */
    public static final class a implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC7041a f110092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Application f110093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CancellableContinuationImpl f110094c;

        public a(InterfaceC7041a interfaceC7041a, Application application, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f110092a = interfaceC7041a;
            this.f110093b = application;
            this.f110094c = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Task.callInBackground(new f0(this.f110092a, this.f110093b, this.f110094c, zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    public g0(BiliTemplateEngineManager biliTemplateEngineManager, InterfaceC7041a interfaceC7041a, Application application, CancellableContinuationImpl cancellableContinuationImpl, boolean z6, boolean z7) {
        this.f110086a = biliTemplateEngineManager;
        this.f110087b = interfaceC7041a;
        this.f110088c = application;
        this.f110089d = cancellableContinuationImpl;
        this.f110090e = z6;
        this.f110091f = z7;
    }

    public final void a() {
        Application application;
        if (this.f110090e) {
            this.f110086a.h();
        }
        if (this.f110091f && (application = this.f110088c) != null) {
            ToastHelper.showToast(application, application.getString(2131841949), 0, 17);
        }
        CancellableContinuationImpl cancellableContinuationImpl = this.f110089d;
        if (cancellableContinuationImpl.isActive()) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(Boolean.FALSE));
        }
    }

    public final void b() {
        a aVar = new a(this.f110087b, this.f110088c, this.f110089d);
        BiliTemplateEngineManager biliTemplateEngineManager = this.f110086a;
        biliTemplateEngineManager.getClass();
        MainThread.runOnMainThread(new c0(biliTemplateEngineManager, aVar));
    }
}
