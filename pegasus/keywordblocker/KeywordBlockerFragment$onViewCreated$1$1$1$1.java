package com.bilibili.pegasus.keywordblocker;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/KeywordBlockerFragment$onViewCreated$1$1$1$1.class */
public final /* synthetic */ class KeywordBlockerFragment$onViewCreated$1$1$1$1 extends FunctionReferenceImpl implements Function1<com.bilibili.pegasus.kmm.keywordblocker.b, Unit> {
    public KeywordBlockerFragment$onViewCreated$1$1$1$1(Object obj) {
        super(1, obj, KeywordBlockerViewModel.class, "handleAction", "handleAction(Lcom/bilibili/pegasus/kmm/keywordblocker/IKeywordBlockerAction;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((com.bilibili.pegasus.kmm.keywordblocker.b) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(com.bilibili.pegasus.kmm.keywordblocker.b bVar) {
        ((KeywordBlockerViewModel) ((CallableReference) this).receiver).I0(bVar);
    }
}
