package com.bilibili.ship.theseus.ugc.endpage.qoe;

import Vu0.L;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import com.bilibili.ship.theseus.ugc.endpage.qoe.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/w.class */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f96771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f96772b;

    public w(q qVar, L l7) {
        this.f96771a = qVar;
        this.f96772b = l7;
    }

    public final void a(int i7, int i8) {
        if (i8 != i7) {
            q qVar = this.f96771a;
            qVar.f96738i = i7;
            ArrayList arrayList = new ArrayList(qVar.f96732b);
            q.c cVar = qVar.f96739j;
            q.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ugcQoeItemsAdapter");
                cVar2 = null;
            }
            cVar2.N(i7, arrayList, qVar.f96735e, this.f96772b.f25853b);
            List<String> list = ((UgcDmQoeComponent.State.a) arrayList.get(i7)).f96632e;
            if (list != null) {
                q.d dVar = qVar.f96740k;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ugcQoeSecondItemsAdapter");
                    dVar = null;
                }
                dVar.O(list);
            }
        }
    }
}
