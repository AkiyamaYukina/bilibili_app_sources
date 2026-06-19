package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/RestrictionLayerVo_BottomDisplayVo_JsonDescriptor.class */
public final class RestrictionLayerVo_BottomDisplayVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102694a = {new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 1), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 1)};

    public RestrictionLayerVo_BottomDisplayVo_JsonDescriptor() {
        super(RestrictionLayerVo.BottomDisplayVo.class, f102694a);
    }

    public final Object constructWith(Object[] objArr) {
        return new RestrictionLayerVo.BottomDisplayVo((TextVo) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        RestrictionLayerVo.BottomDisplayVo bottomDisplayVo = (RestrictionLayerVo.BottomDisplayVo) obj;
        if (i7 == 0) {
            return bottomDisplayVo.f102681a;
        }
        if (i7 != 1) {
            return null;
        }
        return bottomDisplayVo.f102682b;
    }
}
