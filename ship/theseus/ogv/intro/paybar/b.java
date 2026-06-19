package com.bilibili.ship.theseus.ogv.intro.paybar;

import By0.U;
import Hy0.m;
import TB0.C2868b;
import TB0.C2891x;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ship.theseus.ogv.playviewextra.PayTip;
import com.bilibili.ship.theseus.ogv.playviewextra.PrimaryNavType;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.P;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.r;
import com.bilibili.ship.theseus.united.page.restrictionlayer.s;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import java.util.Map;
import kntr.base.imageloader.BiliImagePainterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/paybar/b.class */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f93375b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f93374a = i7;
        this.f93375b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [android.app.Activity, com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity] */
    public final Object invoke(Object obj) {
        Unit unit;
        Object obj2 = this.f93375b;
        switch (this.f93374a) {
            case 0:
                PayTip payTip = (PayTip) obj;
                if (payTip == null) {
                    unit = Unit.INSTANCE;
                } else {
                    OgvPayBarUIComponentService ogvPayBarUIComponentService = (OgvPayBarUIComponentService) obj2;
                    ogvPayBarUIComponentService.getClass();
                    ReportVo reportVo = payTip.f94368o;
                    String strB = reportVo != null ? reportVo.b() : null;
                    Map<String, String> mapC = reportVo != null ? reportVo.c() : null;
                    if (strB != null && strB.length() != 0) {
                        PageReportService.g(ogvPayBarUIComponentService.f93339g, strB, mapC, 4);
                    }
                    ogvPayBarUIComponentService.h.a("vip.vip-operation-position.tips-track.0.click", null, mapC);
                    s rVar = (payTip.l() == PrimaryNavType.PAY && payTip.m().length() == 0) ? new r(false) : (payTip.l() == null && payTip.m().length() == 0) ? null : new P(payTip.m(), 16, "united.player-video-detail.vip-open-banner.0.click", payTip.h(), false, "remind");
                    if (rVar != null) {
                        ogvPayBarUIComponentService.f93336d.a(rVar);
                    }
                    unit = Unit.INSTANCE;
                }
                return unit;
            case 1:
                m mVar = (m) obj;
                int i7 = BiliEditorMainActivity.f106268Y;
                boolean z6 = mVar.f8895a;
                ?? r02 = (BiliEditorMainActivity) obj2;
                if (z6) {
                    r02.setRequestedOrientation(!mVar.f8897c ? 1 : 0);
                } else if (mVar.f8896b) {
                    U u7 = r02.f106278R;
                    if (u7 != null) {
                        C2868b c2868b = (C2868b) u7.f1201a;
                        u7.a(c2868b.h.h, true);
                        u7.a(c2868b.f23743e.f24029m, true);
                        u7.a(c2868b.f23741c, true);
                        C2891x c2891x = c2868b.f23744f;
                        u7.a(c2891x.f24047k, true);
                        u7.a(c2868b.f23740b.f23870g, false);
                        c2891x.f24041d.setVisibility(0);
                    }
                } else {
                    U u8 = r02.f106278R;
                    if (u8 != null) {
                        C2868b c2868b2 = (C2868b) u8.f1201a;
                        u8.b(c2868b2.h.h);
                        u8.b(c2868b2.f23743e.f24029m);
                        u8.b(c2868b2.f23741c);
                        C2891x c2891x2 = c2868b2.f23744f;
                        u8.b(c2891x2.f24047k);
                        u8.b(c2868b2.f23740b.f23870g);
                        c2891x2.f24041d.setVisibility(8);
                    }
                }
                return Unit.INSTANCE;
            default:
                MutableState mutableState = (MutableState) obj2;
                mutableState.setValue(Lifecycle.State.CREATED);
                return new BiliImagePainterKt.b(mutableState);
        }
    }
}
