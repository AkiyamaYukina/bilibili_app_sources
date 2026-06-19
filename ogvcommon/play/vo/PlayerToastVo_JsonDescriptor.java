package com.bilibili.ogvcommon.play.vo;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/PlayerToastVo_JsonDescriptor.class */
public final class PlayerToastVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73330a = {new PojoPropertyDescriptor("toast_text", (String[]) null, TextVo.class, (Class) null, 4), new PojoPropertyDescriptor("button", (String[]) null, TextVo.class, (Class) null, 4), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 4), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("show_style_type", (String[]) null, Integer.TYPE, (Class) null, 5)};

    public PlayerToastVo_JsonDescriptor() {
        super(PlayerToastVo.class, f73330a);
    }

    public final Object constructWith(Object[] objArr) {
        TextVo textVo = (TextVo) objArr[0];
        TextVo textVo2 = (TextVo) objArr[1];
        ReportVo reportVo = (ReportVo) objArr[2];
        String str = (String) objArr[3];
        Integer num = (Integer) objArr[4];
        return new PlayerToastVo(textVo, textVo2, reportVo, str, num == null ? 0 : num.intValue());
    }

    public final Object get(Object obj, int i7) {
        PlayerToastVo playerToastVo = (PlayerToastVo) obj;
        if (i7 == 0) {
            return playerToastVo.a();
        }
        if (i7 == 1) {
            return playerToastVo.f73326b;
        }
        if (i7 == 2) {
            return playerToastVo.f73327c;
        }
        if (i7 == 3) {
            return playerToastVo.f73328d;
        }
        if (i7 != 4) {
            return null;
        }
        return Integer.valueOf(playerToastVo.f73329e);
    }
}
