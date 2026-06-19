package com.bilibili.ship.theseus.ogv.intro.section.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeStat_JsonDescriptor.class */
public final class EpisodeStat_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93538a = {new PojoPropertyDescriptor("danmaku", (String[]) null, StatNumber.class, (Class) null, 5), new PojoPropertyDescriptor("vt", (String[]) null, StatNumber.class, (Class) null, 5)};

    public EpisodeStat_JsonDescriptor() {
        super(EpisodeStat.class, f93538a);
    }

    public final Object constructWith(Object[] objArr) {
        return new EpisodeStat((StatNumber) objArr[0], (StatNumber) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        EpisodeStat episodeStat = (EpisodeStat) obj;
        if (i7 == 0) {
            return episodeStat.f93536a;
        }
        if (i7 != 1) {
            return null;
        }
        return episodeStat.a();
    }
}
