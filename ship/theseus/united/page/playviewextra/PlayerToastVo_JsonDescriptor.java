package com.bilibili.ship.theseus.united.page.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/PlayerToastVo_JsonDescriptor.class */
public final class PlayerToastVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102393a = {new PojoPropertyDescriptor("toast_text", (String[]) null, TextVo.class, (Class) null, 4), new PojoPropertyDescriptor("button", (String[]) null, TextVo.class, (Class) null, 4), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 4), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 4)};

    public PlayerToastVo_JsonDescriptor() {
        super(PlayerToastVo.class, f102393a);
    }

    public final Object constructWith(Object[] objArr) {
        return new PlayerToastVo((TextVo) objArr[0], (TextVo) objArr[1], (ReportVo) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        PlayerToastVo playerToastVo = (PlayerToastVo) obj;
        if (i7 == 0) {
            return playerToastVo.a();
        }
        if (i7 == 1) {
            return playerToastVo.f102390b;
        }
        if (i7 == 2) {
            return playerToastVo.f102391c;
        }
        if (i7 != 3) {
            return null;
        }
        return playerToastVo.f102392d;
    }
}
