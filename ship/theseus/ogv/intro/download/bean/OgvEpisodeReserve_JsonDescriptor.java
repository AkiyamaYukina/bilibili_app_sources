package com.bilibili.ship.theseus.ogv.intro.download.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/bean/OgvEpisodeReserve_JsonDescriptor.class */
public final class OgvEpisodeReserve_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f92374a = {new PojoPropertyDescriptor("tip", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("episodes", (String[]) null, Types.parameterizedType(List.class, new Type[]{OgvEpisode.class}), (Class) null, 16)};

    public OgvEpisodeReserve_JsonDescriptor() {
        super(OgvEpisodeReserve.class, f92374a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvEpisodeReserve((String) objArr[0], (List) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        OgvEpisodeReserve ogvEpisodeReserve = (OgvEpisodeReserve) obj;
        if (i7 == 0) {
            return ogvEpisodeReserve.f92372a;
        }
        if (i7 != 1) {
            return null;
        }
        return ogvEpisodeReserve.f92373b;
    }
}
