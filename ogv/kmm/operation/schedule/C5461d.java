package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.schedule.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/d.class */
public final class C5461d implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f68780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableIntState f68781b;

    public C5461d(List<i> list, MutableIntState mutableIntState) {
        this.f68780a = list;
        this.f68781b = mutableIntState;
    }

    public final Object invoke(Object obj) {
        List<i> list = this.f68780a;
        ((LazyListScope) obj).items(((ArrayList) list).size(), null, new C5459b(list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new C5460c(list, this.f68781b)));
        return Unit.INSTANCE;
    }
}
