package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.bilibili.ship.theseus.ogv.activity.OgvOperationGuideFloatingVo;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvOperationGuideFloatingVo_Countdown_JsonDescriptor.class */
public final class OgvOperationGuideFloatingVo_Countdown_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91492a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("remaining_time", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 9)};

    public OgvOperationGuideFloatingVo_Countdown_JsonDescriptor() {
        super(OgvOperationGuideFloatingVo.Countdown.class, f91492a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvOperationGuideFloatingVo.Countdown((String) objArr[0], ((Duration) objArr[1]).unbox-impl());
    }

    public final Object get(Object obj, int i7) {
        OgvOperationGuideFloatingVo.Countdown countdown = (OgvOperationGuideFloatingVo.Countdown) obj;
        if (i7 == 0) {
            return countdown.f91490a;
        }
        if (i7 != 1) {
            return null;
        }
        return Duration.box-impl(countdown.f91491b);
    }
}
