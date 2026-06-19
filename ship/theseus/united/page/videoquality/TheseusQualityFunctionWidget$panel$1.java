package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusQualityFunctionWidget$panel$1.class */
public final /* synthetic */ class TheseusQualityFunctionWidget$panel$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public TheseusQualityFunctionWidget$panel$1(Object obj) {
        super(0, obj, TheseusQualityFunctionWidget.class, "dismiss", "dismiss()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m9651invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9651invoke() {
        TheseusQualityFunctionWidget theseusQualityFunctionWidget = (TheseusQualityFunctionWidget) ((CallableReference) this).receiver;
        theseusQualityFunctionWidget.h.hideWidget(theseusQualityFunctionWidget.getToken());
    }
}
