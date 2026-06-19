package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/VipWatchingCountdownTaskVo_JsonDescriptor.class */
public final class VipWatchingCountdownTaskVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91501a = {new PojoPropertyDescriptor("milliseconds", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor("count_down_status_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("pause_status_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("complete_status_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("complete_status_jump_url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("token", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("task_id", (String[]) null, String.class, (Class) null, 5)};

    public VipWatchingCountdownTaskVo_JsonDescriptor() {
        super(VipWatchingCountdownTaskVo.class, f91501a);
    }

    public final Object constructWith(Object[] objArr) {
        Long l7 = (Long) objArr[0];
        return new VipWatchingCountdownTaskVo((String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (String) objArr[5], (String) objArr[6], l7 == null ? 0L : l7.longValue());
    }

    public final Object get(Object obj, int i7) {
        VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo = (VipWatchingCountdownTaskVo) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(vipWatchingCountdownTaskVo.e());
            case 1:
                return vipWatchingCountdownTaskVo.b();
            case 2:
                return vipWatchingCountdownTaskVo.d();
            case 3:
                return vipWatchingCountdownTaskVo.a();
            case 4:
                return vipWatchingCountdownTaskVo.c();
            case 5:
                return vipWatchingCountdownTaskVo.f91499f;
            case 6:
                return vipWatchingCountdownTaskVo.f91500g;
            default:
                return null;
        }
    }
}
