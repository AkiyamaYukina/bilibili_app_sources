package com.bilibili.ship.theseus.united.bean;

import androidx.collection.ArrayMap;
import org.jetbrains.annotations.NotNull;
import tb0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/bean/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final tb0.h f98751a = j.c();

    @NotNull
    public static final ArrayMap a(@NotNull b bVar) {
        ArrayMap arrayMap = new ArrayMap();
        Long l7 = bVar.f98740a;
        if (l7 != null) {
            arrayMap.put("season_id", String.valueOf(l7.longValue()));
        }
        Long l8 = bVar.f98741b;
        if (l8 != null) {
            arrayMap.put("ep_id", String.valueOf(l8.longValue()));
        }
        Long l9 = bVar.f98742c;
        if (l9 != null) {
            arrayMap.put("series_id", String.valueOf(l9.longValue()));
        }
        String str = bVar.f98749k;
        if (str != null) {
            arrayMap.put("biz_type", str);
        }
        String str2 = bVar.f98746g;
        if (str2 != null) {
            arrayMap.put("scene_tag", str2);
        }
        String str3 = bVar.h;
        if (str3 != null) {
            arrayMap.put("scene_mark", str3);
        }
        String str4 = bVar.f98744e;
        if (str4 != null) {
            arrayMap.put("csource", str4);
        }
        a aVar = bVar.f98750l;
        if (aVar != null) {
            arrayMap.put("material_no", String.valueOf(aVar.f98739a));
        }
        return arrayMap;
    }
}
