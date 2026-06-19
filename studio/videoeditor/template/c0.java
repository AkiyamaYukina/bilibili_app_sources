package com.bilibili.studio.videoeditor.template;

import fD0.InterfaceC7041a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/c0.class */
public final /* synthetic */ class c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliTemplateEngineManager f110055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f110056b;

    public /* synthetic */ c0(BiliTemplateEngineManager biliTemplateEngineManager, Function1 function1) {
        this.f110055a = biliTemplateEngineManager;
        this.f110056b = function1;
    }

    public final Object invoke() {
        BiliTemplateEngineManager biliTemplateEngineManager = this.f110055a;
        InterfaceC7041a interfaceC7041a = biliTemplateEngineManager.f109914e;
        Function1 function1 = this.f110056b;
        if (interfaceC7041a == null || biliTemplateEngineManager.f109915f) {
            function1.invoke(Boolean.valueOf(biliTemplateEngineManager.f109915f));
        } else {
            boolean zI = interfaceC7041a.i(biliTemplateEngineManager.f109913d);
            biliTemplateEngineManager.f109915f = zI;
            if (zI) {
                interfaceC7041a.p(biliTemplateEngineManager);
            }
            function1.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
