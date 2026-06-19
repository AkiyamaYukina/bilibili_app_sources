package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeRights_JsonDescriptor.class */
public final class EpisodeRights_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93522a;

    static {
        Class cls = Boolean.TYPE;
        f93522a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("allow_download", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("area_limit", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("cache_auth", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("cache_auth_reason", (String[]) null, String.class, (Class) null, 5)};
    }

    public EpisodeRights_JsonDescriptor() {
        super(EpisodeRights.class, f93522a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        boolean zBooleanValue3 = bool2 == null ? false : bool2.booleanValue();
        Object obj2 = objArr[2];
        if (obj2 == null) {
            i7 |= 4;
        }
        Boolean bool3 = (Boolean) obj2;
        if (bool3 != null) {
            zBooleanValue = bool3.booleanValue();
        }
        return new EpisodeRights(i7, (String) objArr[3], zBooleanValue2, zBooleanValue3, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        boolean zA;
        EpisodeRights episodeRights = (EpisodeRights) obj;
        if (i7 == 0) {
            zA = episodeRights.a();
        } else if (i7 == 1) {
            zA = episodeRights.d();
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    return null;
                }
                return episodeRights.b();
            }
            zA = episodeRights.c();
        }
        return Boolean.valueOf(zA);
    }
}
