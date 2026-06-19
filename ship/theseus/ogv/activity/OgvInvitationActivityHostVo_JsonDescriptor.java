package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivityHostVo_JsonDescriptor.class */
public final class OgvInvitationActivityHostVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91472a = {new PojoPropertyDescriptor("pre_win", (String[]) null, OgvInvitationActivityForegroundVo.class, (Class) null, 4), new PojoPropertyDescriptor("share_win", (String[]) null, OgvInvitationActivityBackgroundVo.class, (Class) null, 4), new PojoPropertyDescriptor("success_win", (String[]) null, OgvInvitationActivitySuccessVo.class, (Class) null, 4)};

    public OgvInvitationActivityHostVo_JsonDescriptor() {
        super(OgvInvitationActivityHostVo.class, f91472a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvInvitationActivityHostVo((OgvInvitationActivityForegroundVo) objArr[0], (OgvInvitationActivityBackgroundVo) objArr[1], (OgvInvitationActivitySuccessVo) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        OgvInvitationActivityHostVo ogvInvitationActivityHostVo = (OgvInvitationActivityHostVo) obj;
        if (i7 == 0) {
            return ogvInvitationActivityHostVo.b();
        }
        if (i7 == 1) {
            return ogvInvitationActivityHostVo.a();
        }
        if (i7 != 2) {
            return null;
        }
        return ogvInvitationActivityHostVo.c();
    }
}
