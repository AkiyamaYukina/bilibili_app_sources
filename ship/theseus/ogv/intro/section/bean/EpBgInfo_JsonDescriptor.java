package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpBgInfo_JsonDescriptor.class */
public final class EpBgInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93513a = {new PojoPropertyDescriptor("float_layer", (String[]) null, BgInfo.class, (Class) null, 4), new PojoPropertyDescriptor("no_float_layer", (String[]) null, BgInfo.class, (Class) null, 4)};

    public EpBgInfo_JsonDescriptor() {
        super(EpBgInfo.class, f93513a);
    }

    public final Object constructWith(Object[] objArr) {
        return new EpBgInfo((BgInfo) objArr[0], (BgInfo) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        EpBgInfo epBgInfo = (EpBgInfo) obj;
        if (i7 == 0) {
            return epBgInfo.a();
        }
        if (i7 != 1) {
            return null;
        }
        return epBgInfo.b();
    }
}
