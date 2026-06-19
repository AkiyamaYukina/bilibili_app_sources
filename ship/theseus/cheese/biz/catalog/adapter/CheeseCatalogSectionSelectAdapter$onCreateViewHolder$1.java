package com.bilibili.ship.theseus.cheese.biz.catalog.adapter;

import Wr.i;
import eu0.C6979B;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/adapter/CheeseCatalogSectionSelectAdapter$onCreateViewHolder$1.class */
final /* synthetic */ class CheeseCatalogSectionSelectAdapter$onCreateViewHolder$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    public CheeseCatalogSectionSelectAdapter$onCreateViewHolder$1(Object obj) {
        super(1, obj, b.class, "onItemClick", "onItemClick(I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i7) {
        i iVar;
        b bVar = (b) ((CallableReference) this).receiver;
        int i8 = 0;
        for (Object obj : (ArrayList) bVar.f89156b) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C6979B c6979b = (C6979B) obj;
            boolean z6 = i7 == i8;
            c6979b.f117497f = z6;
            if (z6 && (iVar = bVar.f89155a) != null) {
                iVar.invoke(c6979b);
            }
            i8++;
        }
        bVar.notifyDataSetChanged();
    }
}
