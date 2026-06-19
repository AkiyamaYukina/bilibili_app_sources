package com.bilibili.pegasus.components.interest;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/v.class */
public final /* synthetic */ class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProducerScope f76986a;

    public /* synthetic */ v(ProducerScope producerScope) {
        this.f76986a = producerScope;
    }

    public final Object invoke() {
        return LowActiveInterestChoosePlugin$waitSplashVisible$2.invokeSuspend$lambda$0(this.f76986a);
    }
}
