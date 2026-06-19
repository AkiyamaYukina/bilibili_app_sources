package com.bilibili.search2.result.bangumi;

import Ps0.X;
import com.bilibili.search2.api.BaseSearchItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/I.class */
public final /* synthetic */ class I implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f87346c;

    public /* synthetic */ I(int i7, Object obj, Object obj2) {
        this.f87344a = i7;
        this.f87345b = obj;
        this.f87346c = obj2;
    }

    public final Object invoke() {
        switch (this.f87344a) {
            case 0:
                L l7 = (L) this.f87345b;
                String strD = Xs0.b.d((BaseSearchItem) l7.getData(), null, null, 3);
                X x6 = (X) this.f87346c;
                l7.q0(strD, x6.c(), x6.d());
                break;
            default:
                ((Function1) this.f87345b).invoke((y11.l) this.f87346c);
                break;
        }
        return Unit.INSTANCE;
    }
}
