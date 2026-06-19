package com.bilibili.ogv.infra.coroutine;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/coroutine/SelectKt$selectCancellingUnselected$scope$1.class */
public final class SelectKt$selectCancellingUnselected$scope$1<R> implements c<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Flow<R>> f67864a;

    public SelectKt$selectCancellingUnselected$scope$1(ArrayList<Flow<R>> arrayList) {
        this.f67864a = arrayList;
    }

    @Override // com.bilibili.ogv.infra.coroutine.c
    public final void a(Flow<? extends R> flow) {
        this.f67864a.add(flow);
    }

    @Override // com.bilibili.ogv.infra.coroutine.c
    public final void b(Function1<? super Continuation<? super R>, ? extends Object> function1) {
        this.f67864a.add(FlowKt.flow(new SelectKt$selectCancellingUnselected$scope$1$selectAsync$1(function1, null)));
    }
}
