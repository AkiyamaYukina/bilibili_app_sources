package com.bilibili.ship.theseus.ugc.pages;

import com.bapis.bilibili.app.viewunite.common.Page;
import com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny;
import com.bapis.bilibili.app.viewunite.v1.Arc;
import com.bilibili.ship.theseus.united.di.BusinessType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/b.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class b implements Factory<List<Av0.a>> {
    public static List<Av0.a> a(@Nullable ViewUgcAny viewUgcAny, Arc arc) {
        Object objEmptyList;
        List pagesList;
        if (viewUgcAny != null && (pagesList = viewUgcAny.getPagesList()) != null) {
            List list = pagesList;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            int i7 = 0;
            while (true) {
                int i8 = i7;
                objEmptyList = arrayList;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(Av0.b.b((Page) next, arc.getAid(), i9, arc.getTitle(), arc.getCover(), BusinessType.UGC));
                i7 = i9;
            }
        } else {
            objEmptyList = CollectionsKt.emptyList();
        }
        return (List) Preconditions.checkNotNullFromProvides(objEmptyList);
    }
}
