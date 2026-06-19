package com.bilibili.ship.theseus.ogv;

import com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.Staff;
import com.google.protobuf.MessageLite;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/K.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class K implements Factory<Map<Long, Staff>> {
    public static Map<Long, Staff> a(ViewPgcAny viewPgcAny) {
        Map allUpInfoMap = viewPgcAny.getAllUpInfoMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(allUpInfoMap.size()));
        for (Map.Entry entry : allUpInfoMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), (Staff) JsonUtilKt.parseJson(Pj0.e.a((MessageLite) entry.getValue()), new H().getType()));
        }
        return (Map) Preconditions.checkNotNullFromProvides(linkedHashMap);
    }
}
