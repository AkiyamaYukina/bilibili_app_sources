package com.bilibili.ogv.rank.part;

import com.bilibili.ogv.rank.C5502g;
import com.bilibili.ogv.rank.O;
import com.bilibili.ogv.rank.part.PartReadyUiService;
import com.bilibili.ogv.rank.part.r;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/j.class */
public final class j implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f72082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f72083b;

    public j(l lVar, r rVar) {
        this.f72082a = lVar;
        this.f72083b = rVar;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        O o7 = this.f72082a.f72093b;
        final com.bilibili.ogv.rank.api.a aVar = ((r.c) this.f72083b).f72119a;
        final int i7 = 0;
        final C5502g c5502g = (C5502g) o7.f71864a;
        return komponentScope.__setContent(new i(Unit.INSTANCE, komponentScope.getContext(), komponentScope, komponentScope.embed(KomponentKt.Komponent(new Function1(i7, c5502g, aVar) { // from class: com.bilibili.ogv.rank.N

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f71861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f71862b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f71863c;

            {
                this.f71861a = i7;
                this.f71862b = c5502g;
                this.f71863c = aVar;
            }

            public final Object invoke(Object obj2) {
                switch (this.f71861a) {
                    case 0:
                        KomponentScope komponentScope2 = (KomponentScope) obj2;
                        yW0.b bVar = new C5503h(((C5502g) this.f71862b).f71974a, (com.bilibili.ogv.rank.api.a) this.f71863c, komponentScope2).f71978d;
                        if (bVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("partReadyUiServiceProvider");
                            bVar = null;
                        }
                        return komponentScope2.__setContent(new P(Unit.INSTANCE, komponentScope2.getContext(), komponentScope2, (PartReadyUiService) bVar.get()));
                    default:
                        return (im.keywordBlocking.T) ((hO.j) this.f71862b).set((im.keywordBlocking.T) obj2, ((im.keywordBlocking.stateMachine.g) this.f71863c).a);
                }
            }
        }))));
    }
}
