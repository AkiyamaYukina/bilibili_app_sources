package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/BgInfo_JsonDescriptor.class */
public final class BgInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93510a = {new PojoPropertyDescriptor("light_long_bg", new String[]{"lightLongBg"}, String.class, (Class) null, 5), new PojoPropertyDescriptor("dark_long_bg", new String[]{"darkLongBg"}, String.class, (Class) null, 5)};

    public BgInfo_JsonDescriptor() {
        super(BgInfo.class, f93510a);
    }

    public final Object constructWith(Object[] objArr) {
        return new BgInfo((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        BgInfo bgInfo = (BgInfo) obj;
        if (i7 == 0) {
            return bgInfo.b();
        }
        if (i7 != 1) {
            return null;
        }
        return bgInfo.a();
    }
}
