package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldPrevueSection_JsonDescriptor.class */
public final class OgvOldPrevueSection_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93594a = {new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("episode_ids", (String[]) null, Types.parameterizedType(List.class, new Type[]{Long.class}), (Class) null, 21), new PojoPropertyDescriptor("type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("episodes", (String[]) null, Types.parameterizedType(List.class, new Type[]{OgvEpisode.class}), (Class) null, 21), new PojoPropertyDescriptor("split_text", (String[]) null, String.class, (Class) null, 4)};

    public OgvOldPrevueSection_JsonDescriptor() {
        super(OgvOldPrevueSection.class, f93594a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        List list = (List) objArr[1];
        Integer num = (Integer) objArr[2];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new OgvOldPrevueSection(iIntValue, jLongValue, (String) objArr[4], list, (List) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        OgvOldPrevueSection ogvOldPrevueSection = (OgvOldPrevueSection) obj;
        if (i7 == 0) {
            return Long.valueOf(ogvOldPrevueSection.c());
        }
        if (i7 == 1) {
            return ogvOldPrevueSection.a();
        }
        if (i7 == 2) {
            return Integer.valueOf(ogvOldPrevueSection.d());
        }
        if (i7 == 3) {
            return ogvOldPrevueSection.b();
        }
        if (i7 != 4) {
            return null;
        }
        return ogvOldPrevueSection.f93593e;
    }
}
