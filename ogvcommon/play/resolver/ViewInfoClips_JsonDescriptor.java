package com.bilibili.ogvcommon.play.resolver;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/ViewInfoClips_JsonDescriptor.class */
public final class ViewInfoClips_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73236a = {new PojoPropertyDescriptor("startClipInfo", (String[]) null, ViewInfoClipInfo.class, (Class) null, 0), new PojoPropertyDescriptor("endClipInfo", (String[]) null, ViewInfoClipInfo.class, (Class) null, 0)};

    public ViewInfoClips_JsonDescriptor() {
        super(ViewInfoClips.class, f73236a);
    }

    public final Object constructWith(Object[] objArr) {
        return new ViewInfoClips((ViewInfoClipInfo) objArr[0], (ViewInfoClipInfo) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        ViewInfoClips viewInfoClips = (ViewInfoClips) obj;
        if (i7 == 0) {
            return viewInfoClips.f73234a;
        }
        if (i7 != 1) {
            return null;
        }
        return viewInfoClips.f73235b;
    }
}
