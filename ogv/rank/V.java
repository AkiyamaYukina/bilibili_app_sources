package com.bilibili.ogv.rank;

import kntr.common.komponent.KomponentKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/V.class */
public final /* synthetic */ class V implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef f71903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef f71904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef f71905c;

    public /* synthetic */ V(C5501f c5501f, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        this.f71903a = objectRef;
        this.f71904b = objectRef2;
        this.f71905c = objectRef3;
    }

    public final Object invoke() {
        return KomponentKt.Komponent(new com.bilibili.bililive.room.ui.roommanager.j(new C5504i((String) this.f71903a.element, (String) this.f71904b.element, (String) this.f71905c.element), 2));
    }
}
