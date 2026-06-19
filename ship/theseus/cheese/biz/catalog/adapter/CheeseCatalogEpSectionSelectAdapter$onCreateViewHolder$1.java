package com.bilibili.ship.theseus.cheese.biz.catalog.adapter;

import eu0.C7006y;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/adapter/CheeseCatalogEpSectionSelectAdapter$onCreateViewHolder$1.class */
final /* synthetic */ class CheeseCatalogEpSectionSelectAdapter$onCreateViewHolder$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    public CheeseCatalogEpSectionSelectAdapter$onCreateViewHolder$1(Object obj) {
        super(1, obj, a.class, "onItemClick", "onItemClick(I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i7) {
        Dd1.b bVar;
        a aVar = (a) ((CallableReference) this).receiver;
        int i8 = 0;
        for (Object obj : (ArrayList) aVar.f89154b) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C7006y c7006y = (C7006y) obj;
            boolean z6 = i8 == i7;
            c7006y.f117600e = z6;
            if (z6 && (bVar = aVar.f89153a) != null) {
                bVar.invoke(c7006y);
            }
            i8++;
        }
        aVar.notifyDataSetChanged();
    }
}
