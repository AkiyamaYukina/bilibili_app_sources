package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.ship.theseus.united.page.videolist.c;
import com.bilibili.ship.theseus.united.page.videolist.d;
import com.bilibili.ship.theseus.united.page.videolist.m;
import java.util.ArrayList;
import java.util.List;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.collections.CollectionsKt;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.utils.TimeFormater;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/U.class */
public final class U {
    @NotNull
    public static final List<c.a> a(@NotNull C6353o c6353o, boolean z6) {
        List<Z> list = z6 ? C6354p.a(c6353o).h : c6353o.h;
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        for (Z z8 : list) {
            for (C6355q c6355q : z8.f101648d) {
                List<Av0.a> list2 = c6355q.f101689j;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (Av0.a aVar : list2) {
                    long j7 = aVar.f590a;
                    arrayList2.add(new d.a(aVar.f591b, aVar.f593d));
                }
                arrayList.add(new c.a(z8.f101645a, c6355q.f101682b, c6355q.f101683c, c6355q.f101684d, c6355q.f101685e, c6355q.f101686f, TimeFormater.formatTime$default(TimeFormater.INSTANCE, Duration.getInWholeMilliseconds-impl(c6355q.h), false, false, 6, (Object) null), NumberFormat_androidKt.format$default(Long.valueOf(c6355q.f101690k.f104027a), (String) null, 0, 3, (Object) null), NumberFormat_androidKt.format$default(Long.valueOf(c6355q.f101691l.f104027a), (String) null, 0, 3, (Object) null), c6355q.f101687g, c6355q.f101692m, arrayList2, z7));
                z7 = true;
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<m.a> b(@NotNull C6353o c6353o, boolean z6) {
        List<Z> listReversed = z6 ? CollectionsKt.reversed(c6353o.h) : c6353o.h;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listReversed, 10));
        for (Z z7 : listReversed) {
            arrayList.add(new m.a(z7.f101645a, z7.f101646b));
        }
        return arrayList;
    }
}
