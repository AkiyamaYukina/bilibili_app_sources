package com.bilibili.tgwt.filmselection;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/a.class */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f111180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111181b;

    public /* synthetic */ a(c cVar, int i7) {
        this.f111180a = cVar;
        this.f111181b = i7;
    }

    public final Object invoke() {
        JW.b bVar = this.f111180a.f111186d;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(this.f111181b));
        }
        return Unit.INSTANCE;
    }
}
