package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeason_CacheAuthConfig_JsonDescriptor.class */
public final class OgvSeason_CacheAuthConfig_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94499a = {new PojoPropertyDescriptor("dialog", (String[]) null, OgvSeason.CacheAuthConfig.CacheDialog.class, (Class) null, 5)};

    public OgvSeason_CacheAuthConfig_JsonDescriptor() {
        super(OgvSeason.CacheAuthConfig.class, f94499a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvSeason.CacheAuthConfig((OgvSeason.CacheAuthConfig.CacheDialog) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        OgvSeason.CacheAuthConfig cacheAuthConfig = (OgvSeason.CacheAuthConfig) obj;
        if (i7 != 0) {
            return null;
        }
        return cacheAuthConfig.f94471a;
    }
}
