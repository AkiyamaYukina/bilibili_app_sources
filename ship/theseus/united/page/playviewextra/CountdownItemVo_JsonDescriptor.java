package com.bilibili.ship.theseus.united.page.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/CountdownItemVo_JsonDescriptor.class */
public final class CountdownItemVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102375a = {new PojoPropertyDescriptor("foldCountdown", (String[]) null, Duration.class, DurationFromSecondsTypeAdapter.class, 9), new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 0), new PojoPropertyDescriptor("subtitle", (String[]) null, TextVo.class, (Class) null, 0)};

    public CountdownItemVo_JsonDescriptor() {
        super(CountdownItemVo.class, f102375a);
    }

    public final Object constructWith(Object[] objArr) {
        return new CountdownItemVo(((Duration) objArr[0]).unbox-impl(), (TextVo) objArr[1], (TextVo) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        CountdownItemVo countdownItemVo = (CountdownItemVo) obj;
        if (i7 == 0) {
            return Duration.box-impl(countdownItemVo.f102372a);
        }
        if (i7 == 1) {
            return countdownItemVo.f102373b;
        }
        if (i7 != 2) {
            return null;
        }
        return countdownItemVo.f102374c;
    }
}
