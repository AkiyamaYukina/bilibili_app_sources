package com.bilibili.ogv.kmm.operation.schedule;

import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.pegasus.holders.LargeCoverSingleV9Holder;
import kntr.base.router.Router;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mk0.C8008d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/z.class */
public final /* synthetic */ class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f68845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f68846c;

    public /* synthetic */ z(int i7, Object obj, Object obj2) {
        this.f68844a = i7;
        this.f68845b = obj;
        this.f68846c = obj2;
    }

    public final Object invoke() {
        switch (this.f68844a) {
            case 0:
                C8008d.a(((w) this.f68846c).f68835a.f68735b, (Router) this.f68845b);
                break;
            default:
                ListExtentionsKt.setText(((LargeCoverSingleV9Holder) this.f68845b).f77547k.f53690f.f53764e, (String) this.f68846c);
                break;
        }
        return Unit.INSTANCE;
    }
}
