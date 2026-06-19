package com.bilibili.ship.theseus.ogv.intro.section.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.section.ui.u;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f93784a;

    @Inject
    public d(@NotNull Context context) {
        this.f93784a = context;
    }

    @NotNull
    public final u a(@NotNull List<OgvSeasonInfo> list, @NotNull OgvSeason ogvSeason, @NotNull u.c cVar) {
        int i7;
        long j7 = ogvSeason.f94449a;
        List<OgvSeasonInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            OgvSeasonInfo ogvSeasonInfo = (OgvSeasonInfo) it.next();
            u.b bVar = new u.b();
            bVar.f93886a = ogvSeasonInfo.f94481a;
            String str = bVar.f93888c;
            String str2 = ogvSeasonInfo.f94485e;
            if (!Intrinsics.areEqual(str2, str)) {
                bVar.f93888c = str2;
                bVar.notifyPropertyChanged(640);
            }
            boolean z6 = ogvSeasonInfo.f94481a == j7;
            if (z6 != bVar.f93889d) {
                bVar.f93889d = z6;
                bVar.notifyPropertyChanged(550);
            }
            arrayList.add(new u.a(bVar));
        }
        u uVar = new u(cVar, arrayList);
        int i8 = -1;
        for (Object obj : arrayList) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((u.a) obj).f93885a.f93889d) {
                i8 = i7;
            }
            i7++;
        }
        if (i8 != -1) {
            Pair<Integer, Integer> pair = new Pair<>(Integer.valueOf(i8), Integer.valueOf(((int) Uj0.c.a(12, this.f93784a)) * 4));
            if (!Intrinsics.areEqual(pair, cVar.f93890a)) {
                cVar.f93890a = pair;
                cVar.notifyPropertyChanged(528);
            }
        }
        return uVar;
    }
}
