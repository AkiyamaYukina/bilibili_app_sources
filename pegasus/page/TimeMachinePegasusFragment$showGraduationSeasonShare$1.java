package com.bilibili.pegasus.page;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$showGraduationSeasonShare$1.class */
final /* synthetic */ class TimeMachinePegasusFragment$showGraduationSeasonShare$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public TimeMachinePegasusFragment$showGraduationSeasonShare$1(Object obj) {
        super(1, obj, TimeMachinePegasusFragment.class, "showReverseToast", "showReverseToast(Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        ((TimeMachinePegasusFragment) ((CallableReference) this).receiver).zb(str);
    }
}
