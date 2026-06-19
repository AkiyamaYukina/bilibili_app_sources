package com.bilibili.relation;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.relation.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/g.class */
public final /* synthetic */ class C6015g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f86067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f86068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f86069c;

    public /* synthetic */ C6015g(Function2 function2, List list, Function0 function0) {
        this.f86067a = function2;
        this.f86068b = list;
        this.f86069c = function0;
    }

    public final Object invoke(Object obj) {
        this.f86067a.invoke(this.f86068b, (List) obj);
        this.f86069c.invoke();
        return Unit.INSTANCE;
    }
}
