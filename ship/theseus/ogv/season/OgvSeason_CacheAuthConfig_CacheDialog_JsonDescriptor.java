package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeason_CacheAuthConfig_CacheDialog_JsonDescriptor.class */
public final class OgvSeason_CacheAuthConfig_CacheDialog_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94498a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("button_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_image", (String[]) null, String.class, (Class) null, 5)};

    public OgvSeason_CacheAuthConfig_CacheDialog_JsonDescriptor() {
        super(OgvSeason.CacheAuthConfig.CacheDialog.class, f94498a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvSeason.CacheAuthConfig.CacheDialog((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        OgvSeason.CacheAuthConfig.CacheDialog cacheDialog = (OgvSeason.CacheAuthConfig.CacheDialog) obj;
        if (i7 == 0) {
            return cacheDialog.f94472a;
        }
        if (i7 == 1) {
            return cacheDialog.f94473b;
        }
        if (i7 == 2) {
            return cacheDialog.f94474c;
        }
        if (i7 != 3) {
            return null;
        }
        return cacheDialog.f94475d;
    }
}
