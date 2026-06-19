package com.bilibili.pegasus.promo;

import com.bilibili.pegasus.card.base.F;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasePegasusFragment f78500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78501b;

    public /* synthetic */ b(BasePegasusFragment basePegasusFragment, int i7) {
        this.f78500a = basePegasusFragment;
        this.f78501b = i7;
    }

    public final Object invoke() {
        int i7 = BasePegasusFragment.f78463o;
        BasePegasusFragment basePegasusFragment = this.f78500a;
        F fNf = basePegasusFragment.nf();
        int i8 = this.f78501b;
        if (i8 < 0) {
            fNf.getClass();
        } else if (i8 < ((ArrayList) fNf.a).size()) {
            ((ArrayList) fNf.a).remove(i8);
        }
        basePegasusFragment.mf().notifyItemRemoved(i8);
        return Unit.INSTANCE;
    }
}
