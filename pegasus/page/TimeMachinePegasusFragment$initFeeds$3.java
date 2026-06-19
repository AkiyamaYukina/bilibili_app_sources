package com.bilibili.pegasus.page;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$initFeeds$3.class */
final /* synthetic */ class TimeMachinePegasusFragment$initFeeds$3 extends FunctionReferenceImpl implements Function0<Boolean> {
    public TimeMachinePegasusFragment$initFeeds$3(Object obj) {
        super(0, obj, TimeMachinePegasusFragment.class, "getPageSwitchState", "getPageSwitchState()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m8177invoke() {
        return Boolean.valueOf(((TimeMachinePegasusFragment) ((CallableReference) this).receiver).getPageSwitchState());
    }
}
