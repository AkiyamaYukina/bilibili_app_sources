package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.restrictionlayer.BackgroundVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/BackgroundVo_JsonDescriptor.class */
public final class BackgroundVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102507a = {new PojoPropertyDescriptor("drawable_bitmap_url", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("effects", (String[]) null, BackgroundVo.BackgroundEffect.class, (Class) null, 2)};

    public BackgroundVo_JsonDescriptor() {
        super(BackgroundVo.class, f102507a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        Object obj = objArr[1];
        if (obj == null) {
            i7 = 2;
        }
        return new BackgroundVo(str, (BackgroundVo.BackgroundEffect) obj, i7);
    }

    public final Object get(Object obj, int i7) {
        BackgroundVo backgroundVo = (BackgroundVo) obj;
        if (i7 == 0) {
            return backgroundVo.a();
        }
        if (i7 != 1) {
            return null;
        }
        return backgroundVo.f102506b;
    }
}
