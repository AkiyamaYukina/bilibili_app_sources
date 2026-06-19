package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.operation.OperationActivityVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityVo_JsonDescriptor.class */
public final class OgvActivityVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91425a = {new PojoPropertyDescriptor("activity_id", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("invite_drawer", (String[]) null, OgvInvitationActivityHostVo.class, (Class) null, 4), new PojoPropertyDescriptor("invite_win", (String[]) null, OgvInvitationActivityGuestVo.class, (Class) null, 4), new PojoPropertyDescriptor("container", (String[]) null, Types.parameterizedType(List.class, new Type[]{OperationActivityVo.class}), (Class) null, 21), new PojoPropertyDescriptor("watch_count_down_cfg", (String[]) null, VipWatchingCountdownTaskVo.class, (Class) null, 4), new PojoPropertyDescriptor("independent_win", (String[]) null, OgvActivityDialogVo.class, (Class) null, 0), new PojoPropertyDescriptor("pp_float_layer", (String[]) null, OgvOperationGuideFloatingVo.class, (Class) null, 0), new PojoPropertyDescriptor("play_half_container", (String[]) null, OgvActivityHalfScreenPopup.class, (Class) null, 4), new PojoPropertyDescriptor("float_ball", (String[]) null, OgvIntroFloatingBall.class, (Class) null, 4)};

    public OgvActivityVo_JsonDescriptor() {
        super(OgvActivityVo.class, f91425a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new OgvActivityVo(iIntValue, (OgvInvitationActivityHostVo) objArr[1], (OgvInvitationActivityGuestVo) objArr[2], (List) objArr[3], (VipWatchingCountdownTaskVo) objArr[4], (OgvActivityDialogVo) objArr[5], (OgvOperationGuideFloatingVo) objArr[6], (OgvActivityHalfScreenPopup) objArr[7], (OgvIntroFloatingBall) objArr[8]);
    }

    public final Object get(Object obj, int i7) {
        OgvActivityVo ogvActivityVo = (OgvActivityVo) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(ogvActivityVo.a());
            case 1:
                return ogvActivityVo.e();
            case 2:
                return ogvActivityVo.d();
            case 3:
                return ogvActivityVo.f();
            case 4:
                return ogvActivityVo.g();
            case 5:
                return ogvActivityVo.f91422f;
            case 6:
                return ogvActivityVo.f91423g;
            case 7:
                return ogvActivityVo.c();
            case 8:
                return ogvActivityVo.b();
            default:
                return null;
        }
    }
}
