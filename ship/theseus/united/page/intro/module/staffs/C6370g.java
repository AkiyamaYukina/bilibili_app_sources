package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bapis.bilibili.app.viewunite.common.Vip;
import com.bapis.bilibili.app.viewunite.common.VipLabel;
import com.bilibili.lib.accountinfo.model.OfficialVerify;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;
import xg0.C8973c;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/g.class */
public final class C6370g {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.g$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/g$a.class */
    public static final class a extends TypeToken<OfficialVerify> {
    }

    @NotNull
    public static final Staff a(@NotNull com.bapis.bilibili.app.viewunite.common.Staff staff) {
        long mid = staff.getMid();
        int attention = staff.getAttention();
        String title = staff.getTitle();
        String name = staff.getName();
        String face = staff.getFace();
        OfficialVerify officialVerify = (OfficialVerify) JsonUtilKt.parseJson(Pj0.e.a(staff.getOfficial()), new a().getType());
        Vip vip = staff.getVip();
        VipUserInfo vipUserInfo = new VipUserInfo();
        vipUserInfo.setVipType(vip.getType());
        vipUserInfo.setVipStatus(vip.getVipStatus());
        vipUserInfo.setThemeType(vip.getThemeType());
        VipLabel label = vip.getLabel();
        VipUserInfo.VipLabel vipLabel = new VipUserInfo.VipLabel();
        vipLabel.setText(label.getText());
        vipLabel.setLabelTheme(label.getLabelTheme());
        vipUserInfo.setLabel(vipLabel);
        return new Staff(mid, attention, title, name, face, officialVerify, vipUserInfo, staff.getLabelStyle(), staff.getFans(), staff.hasNameRender() ? new C8973c(staff.getNameRender()) : null);
    }
}
