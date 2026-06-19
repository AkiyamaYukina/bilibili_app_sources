package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/o.class */
public final class o implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f68816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f68817b;

    public o(List<q> list, float f7) {
        this.f68816a = list;
        this.f68817b = f7;
    }

    public final Object invoke(Object obj) {
        List<q> list = this.f68816a;
        ((LazyListScope) obj).items(((ArrayList) list).size(), null, new m(list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new n(list, this.f68817b)));
        return Unit.INSTANCE;
    }
}
