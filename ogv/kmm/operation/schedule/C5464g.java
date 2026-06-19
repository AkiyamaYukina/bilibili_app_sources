package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.schedule.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/g.class */
public final class C5464g implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f68785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableIntState f68786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f68787c;

    public C5464g(List<i> list, MutableIntState mutableIntState, float f7) {
        this.f68785a = list;
        this.f68786b = mutableIntState;
        this.f68787c = f7;
    }

    public final Object invoke(Object obj) {
        List<i> list = this.f68785a;
        ArrayList arrayList = (ArrayList) ((i) ((ArrayList) list).get(this.f68786b.getIntValue())).f68793c;
        ((LazyListScope) obj).items(arrayList.size(), null, new C5462e(arrayList), ComposableLambdaKt.composableLambdaInstance(802480018, true, new C5463f(arrayList, this.f68787c)));
        return Unit.INSTANCE;
    }
}
