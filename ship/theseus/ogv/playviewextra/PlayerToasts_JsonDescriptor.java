package com.bilibili.ship.theseus.ogv.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.tencent.connect.common.Constants;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/PlayerToasts_JsonDescriptor.class */
public final class PlayerToasts_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94376a = {new PojoPropertyDescriptor("1", (String[]) null, PlayerToastVo.class, (Class) null, 4), new PojoPropertyDescriptor("2", (String[]) null, PlayerToastVo.class, (Class) null, 4), new PojoPropertyDescriptor("4", (String[]) null, PlayerToastVo.class, (Class) null, 4), new PojoPropertyDescriptor(Constants.VIA_REPORT_TYPE_JOININ_GROUP, (String[]) null, PlayerToastVo.class, (Class) null, 4)};

    public PlayerToasts_JsonDescriptor() {
        super(PlayerToasts.class, f94376a);
    }

    public final Object constructWith(Object[] objArr) {
        return new PlayerToasts((PlayerToastVo) objArr[0], (PlayerToastVo) objArr[1], (PlayerToastVo) objArr[2], (PlayerToastVo) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        PlayerToasts playerToasts = (PlayerToasts) obj;
        if (i7 == 0) {
            return playerToasts.d();
        }
        if (i7 == 1) {
            return playerToasts.c();
        }
        if (i7 == 2) {
            return playerToasts.b();
        }
        if (i7 != 3) {
            return null;
        }
        return playerToasts.a();
    }
}
