package com.bilibili.pegasus.components.interest.ui.common;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProducerScope f76393a;

    public /* synthetic */ d(ProducerScope producerScope) {
        this.f76393a = producerScope;
    }

    public final Object invoke(Object obj) {
        return InterestChooseGuideTipsKt$displayInterestChooseGuidance$2$result$1.invokeSuspend$lambda$0(this.f76393a, ((Boolean) obj).booleanValue());
    }
}
