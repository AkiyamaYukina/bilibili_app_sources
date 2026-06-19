package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivityForegroundVo_JsonDescriptor.class */
public final class OgvInvitationActivityForegroundVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91461a = {new PojoPropertyDescriptor("component_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, OgvActivityTextVo.class, (Class) null, 5), new PojoPropertyDescriptor("subtitle", (String[]) null, OgvActivityTextVo.class, (Class) null, 5), new PojoPropertyDescriptor("show_time", (String[]) null, Long.TYPE, (Class) null, 5)};

    public OgvInvitationActivityForegroundVo_JsonDescriptor() {
        super(OgvInvitationActivityForegroundVo.class, f91461a);
    }

    public final Object constructWith(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        OgvActivityTextVo ogvActivityTextVo = (OgvActivityTextVo) objArr[2];
        OgvActivityTextVo ogvActivityTextVo2 = (OgvActivityTextVo) objArr[3];
        Long l7 = (Long) objArr[4];
        return new OgvInvitationActivityForegroundVo(str, str2, ogvActivityTextVo, ogvActivityTextVo2, l7 == null ? 0L : l7.longValue());
    }

    public final Object get(Object obj, int i7) {
        OgvInvitationActivityForegroundVo ogvInvitationActivityForegroundVo = (OgvInvitationActivityForegroundVo) obj;
        if (i7 == 0) {
            return ogvInvitationActivityForegroundVo.f91456a;
        }
        if (i7 == 1) {
            return ogvInvitationActivityForegroundVo.a();
        }
        if (i7 == 2) {
            return ogvInvitationActivityForegroundVo.f91458c;
        }
        if (i7 == 3) {
            return ogvInvitationActivityForegroundVo.f91459d;
        }
        if (i7 != 4) {
            return null;
        }
        return Long.valueOf(ogvInvitationActivityForegroundVo.f91460e);
    }
}
