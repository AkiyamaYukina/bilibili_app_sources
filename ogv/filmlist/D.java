package com.bilibili.ogv.filmlist;

import com.bilibili.playset.detail.data.d;
import com.bilibili.playset.detail.data.f;
import kntr.common.komponent.KomponentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/D.class */
public final /* synthetic */ class D implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67616a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f67617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f67618c;

    public /* synthetic */ D(C5432a c5432a, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        this.f67617b = objectRef;
        this.f67618c = objectRef2;
    }

    public /* synthetic */ D(com.bilibili.playset.detail.components.g gVar, com.bilibili.playset.detail.data.d dVar) {
        this.f67617b = gVar;
        this.f67618c = dVar;
    }

    public final Object invoke() {
        switch (this.f67616a) {
            case 0:
                return KomponentKt.Komponent(new Cw0.m(new C5433b((String) ((Ref.ObjectRef) this.f67617b).element, (String) ((Ref.ObjectRef) this.f67618c).element), 2));
            default:
                ((com.bilibili.playset.detail.components.g) this.f67617b).f84315e.invoke(new f.i(((d.b) ((com.bilibili.playset.detail.data.d) this.f67618c)).f84460a));
                return Unit.INSTANCE;
        }
    }
}
