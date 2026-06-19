package com.bilibili.pegasus.recommendlabel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelFirstActivity$onCreate$2$1$1$1.class */
public final /* synthetic */ class RecommendLabelFirstActivity$onCreate$2$1$1$1 extends FunctionReferenceImpl implements Function1<InterfaceC5739h, Unit> {
    public RecommendLabelFirstActivity$onCreate$2$1$1$1(Object obj) {
        super(1, obj, RecommendLabelViewModel.class, "handleAction", "handleAction(Lcom/bilibili/pegasus/recommendlabel/IRecLabelAction;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC5739h) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC5739h interfaceC5739h) {
        ((RecommendLabelViewModel) ((CallableReference) this).receiver).I0(interfaceC5739h);
    }
}
