package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.content.Context;
import com.bilibili.app.comm.vipconfig.VipThemeConfigManager;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.relation.widget.FollowButtonConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/F.class */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<InterfaceC6365b> f101767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Staff f101768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StaffsService f101769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G f101770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<Long> f101771e;

    public F(Ref.ObjectRef<InterfaceC6365b> objectRef, Staff staff, StaffsService staffsService, G g7, ArrayList<Long> arrayList) {
        this.f101767a = objectRef;
        this.f101768b = staff;
        this.f101769c = staffsService;
        this.f101770d = g7;
        this.f101771e = arrayList;
    }

    public final FollowButtonConfig a() {
        Staff staff = this.f101768b;
        FollowButtonConfig.Builder builder = new FollowButtonConfig.Builder(staff.f101786a, staff.c(), 32, this.f101770d);
        StaffsService staffsService = this.f101769c;
        return builder.setIsGuestAttention(staffsService.f101836e.c()).setSpmid("united.player-video-detail.joint-submission.0").setFromSpmid(staffsService.f101839i.a().f123881c).setExtendContent(staffsService.d()).setClickReportExtras(staffsService.c(staff)).build();
    }

    public final int b() {
        int vipNicknameColor;
        StaffsService staffsService = this.f101769c;
        Integer numH = staffsService.f101842l.h();
        if (numH != null) {
            vipNicknameColor = numH.intValue();
        } else {
            Context context = staffsService.f101832a;
            VipUserInfo.VipLabel label = this.f101768b.f101792g.getLabel();
            String labelTheme = label != null ? label.getLabelTheme() : null;
            vipNicknameColor = (labelTheme == null || labelTheme.length() == 0) ? 0 : VipThemeConfigManager.getVipNicknameColor(context, labelTheme, Cj0.a.a(context));
        }
        return vipNicknameColor;
    }
}
