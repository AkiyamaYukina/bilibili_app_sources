package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvOldSeasonModule;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldSeasonModule_StylePositive_JsonDescriptor.class */
public final class OgvOldSeasonModule_StylePositive_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93617a = {new PojoPropertyDescriptor("episodes", (String[]) null, Types.parameterizedType(List.class, new Type[]{OgvEpisode.class}), (Class) null, 17)};

    public OgvOldSeasonModule_StylePositive_JsonDescriptor() {
        super(OgvOldSeasonModule.StylePositive.class, f93617a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvOldSeasonModule.StylePositive((List) objArr[0]);
    }

    public final Object get(Object obj, int i7) {
        OgvOldSeasonModule.StylePositive stylePositive = (OgvOldSeasonModule.StylePositive) obj;
        if (i7 != 0) {
            return null;
        }
        return stylePositive.f93613a;
    }
}
