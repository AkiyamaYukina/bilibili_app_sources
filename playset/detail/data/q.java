package com.bilibili.playset.detail.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.SocializeInfo;
import com.bilibili.playset.playlist.adapters.FavFooterItem$Companion$LoadMoreType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import os0.C8259e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/q.class */
@StabilityInferred(parameters = 1)
public final class q {
    @Inject
    public q() {
    }

    @NotNull
    public static h a(@NotNull h hVar, boolean z6) {
        SocializeInfo socializeInfoB;
        MultitypePlaylist.Info info = hVar.f84517e;
        SocializeInfo socializeInfo = info.socializeInfo;
        if (socializeInfo != null) {
            socializeInfoB = c.b(socializeInfo, socializeInfo.collect + (z6 ? 1 : -1), 0, 0, 2046);
        } else {
            socializeInfoB = null;
        }
        return h.a(hVar, 0L, 0L, null, null, c.a(info, 0, socializeInfoB, null, 0, null, 131069), false, false, false, false, z6, false, false, null, false, false, false, false, 0, 0, 4193775);
    }

    @NotNull
    public static h b(@NotNull h hVar, @NotNull FavFooterItem$Companion$LoadMoreType favFooterItem$Companion$LoadMoreType) {
        List mutableList = CollectionsKt.toMutableList(hVar.f84515c);
        com.bilibili.playset.api.a aVar = (com.bilibili.playset.api.a) CollectionsKt.lastOrNull(mutableList);
        h hVarA = hVar;
        if (aVar != null) {
            hVarA = hVar;
            if (aVar instanceof C8259e) {
                int lastIndex = CollectionsKt.getLastIndex(mutableList);
                C8259e c8259e = new C8259e();
                c8259e.f124939b = favFooterItem$Companion$LoadMoreType;
                mutableList.set(lastIndex, c8259e);
                hVarA = h.a(hVar, 0L, 0L, mutableList, null, null, false, false, false, false, false, false, false, null, false, false, false, false, 0, 0, 4194299);
            }
        }
        return hVarA;
    }

    @NotNull
    public static h c(@NotNull h hVar, boolean z6) {
        SocializeInfo socializeInfoB;
        MultitypePlaylist.Info info = hVar.f84517e;
        SocializeInfo socializeInfo = info.socializeInfo;
        if (socializeInfo != null) {
            socializeInfoB = c.b(socializeInfo, 0, 0, socializeInfo.thumb_up + (z6 ? 1 : -1), 1983);
        } else {
            socializeInfoB = null;
        }
        return h.a(hVar, 0L, 0L, null, null, c.a(info, 0, socializeInfoB, null, 0, null, 131069), false, false, z6, false, false, false, false, null, false, false, false, false, 0, 0, 4194159);
    }

    @NotNull
    public static List d(@NotNull List list, @NotNull com.bilibili.playset.api.d dVar, boolean z6, @NotNull FavFooterItem$Companion$LoadMoreType favFooterItem$Companion$LoadMoreType) {
        List mutableList = CollectionsKt.toMutableList(list);
        if (z6) {
            mutableList.clear();
        }
        List<com.bilibili.playset.api.c> listD = dVar.d();
        if (listD != null) {
            final m mVar = new m(0);
            mutableList.removeIf(new Predicate(mVar) { // from class: com.bilibili.playset.detail.data.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final m f84553a;

                {
                    this.f84553a = mVar;
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) this.f84553a.invoke(obj)).booleanValue();
                }
            });
            List list2 = mutableList;
            ArrayList<com.bilibili.playset.api.c> arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof com.bilibili.playset.api.c) {
                    arrayList.add(obj);
                }
            }
            HashSet hashSet = new HashSet();
            for (com.bilibili.playset.api.c cVar : arrayList) {
                hashSet.add(cVar.k() + "_" + cVar.l());
            }
            List<com.bilibili.playset.api.c> list3 = listD;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                com.bilibili.playset.api.c cVar2 = (com.bilibili.playset.api.c) obj2;
                if (cVar2 != null) {
                    if (hashSet.add(cVar2.k() + "_" + cVar2.l())) {
                    }
                }
                arrayList2.add(obj2);
            }
            mutableList.addAll(arrayList2);
            C8259e c8259e = new C8259e();
            c8259e.f124939b = favFooterItem$Companion$LoadMoreType;
            mutableList.add(c8259e);
        } else {
            final o oVar = new o(0);
            mutableList.removeIf(new Predicate(oVar) { // from class: com.bilibili.playset.detail.data.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final o f84555a;

                {
                    this.f84555a = oVar;
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj3) {
                    return ((Boolean) this.f84555a.invoke(obj3)).booleanValue();
                }
            });
            C8259e c8259e2 = new C8259e();
            c8259e2.f124939b = favFooterItem$Companion$LoadMoreType;
            mutableList.add(c8259e2);
        }
        return mutableList;
    }

    @NotNull
    public static h e(@NotNull h hVar, @NotNull com.bilibili.playset.api.c cVar) {
        List mutableList = CollectionsKt.toMutableList(hVar.f84515c);
        h hVarA = hVar;
        if (CollectionsKt.removeAll(mutableList, new PL.e(cVar, 1))) {
            MultitypePlaylist.Info info = hVar.f84517e;
            hVarA = h.a(hVar, 0L, 0L, mutableList, null, c.a(info, 0, null, null, RangesKt.coerceAtLeast(info.mediaCount - 1, 0), null, 130559), false, false, false, false, false, false, false, null, false, false, false, false, 0, 0, 4194283);
        }
        return hVarA;
    }
}
