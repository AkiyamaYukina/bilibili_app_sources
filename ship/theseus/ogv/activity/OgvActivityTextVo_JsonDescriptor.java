package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityTextVo_JsonDescriptor.class */
public final class OgvActivityTextVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91416a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("text_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12)};

    public OgvActivityTextVo_JsonDescriptor() {
        super(OgvActivityTextVo.class, f91416a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvActivityTextVo((String) objArr[0], (Integer) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityTextVo ogvActivityTextVo = (OgvActivityTextVo) obj;
        if (i7 == 0) {
            return ogvActivityTextVo.f91414a;
        }
        if (i7 != 1) {
            return null;
        }
        return ogvActivityTextVo.f91415b;
    }
}
