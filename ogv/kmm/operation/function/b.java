package com.bilibili.ogv.kmm.operation.function;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import ek0.C6953c;
import ek0.C6954d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/function/b.class */
public final class b implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f68336a;

    public b(List<c> list) {
        this.f68336a = list;
    }

    public final Object invoke(Object obj) {
        List<c> list = this.f68336a;
        ((LazyListScope) obj).items(((ArrayList) list).size(), null, new C6953c(list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new C6954d(list)));
        return Unit.INSTANCE;
    }
}
