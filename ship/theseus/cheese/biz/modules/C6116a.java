package com.bilibili.ship.theseus.cheese.biz.modules;

import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.lib.projection.commonburid.CastContentType;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6354p;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import dagger.Module;
import eu0.C6985d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import mv0.C8043a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/a.class */
@StabilityInferred(parameters = 1)
@Module
public final class C6116a {
    public static List a(List list, C4911a c4911a) {
        ArrayList<C6985d> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C6985d) obj).f117516l) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C6985d c6985d : arrayList) {
            long j7 = c6985d.f117510e;
            String str = c4911a.f54247l;
            StringBuilder sb = new StringBuilder("bilibili://cheese/season/ep/");
            long j8 = c6985d.f117521q;
            sb.append(j8);
            arrayList2.add(new ProjectionItemData(3, j7, "", c6985d.f117511f, j8, c6985d.f117526v, 0L, str, c4911a.f54246k, c6985d.f117512g, sb.toString(), 0, 0, 0L, 0L, 0, 0, 0, null, CastContentType.CastContentTypeEDU));
        }
        return arrayList2;
    }

    public static List b(List list, C8043a c8043a) {
        ArrayList arrayList = new ArrayList();
        List<C6353o> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (C6353o c6353o : list2) {
            Iterator<T> it = c6353o.h.iterator();
            while (it.hasNext()) {
                for (C6355q c6355q : ((com.bilibili.ship.theseus.united.page.intro.module.season.Z) it.next()).f101648d) {
                    int size = ((ArrayList) c6355q.f101689j).size();
                    long j7 = c6353o.f101669a;
                    if (size == 1) {
                        arrayList.add(C6354p.c(c6355q, c8043a.a().f123881c, c8043a.a().f123880b, j7));
                    } else {
                        Iterator<T> it2 = c6355q.f101689j.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Av0.b.c((Av0.a) it2.next(), c8043a.a().f123881c, c8043a.a().f123880b, j7));
                        }
                    }
                }
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return arrayList;
    }
}
