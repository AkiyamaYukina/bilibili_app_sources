package com.bilibili.ogv.operation2;

import android.view.View;
import android.widget.CheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.UgcPartyInfoService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.upper.module.contribute.up.ui.ManuscriptEditV8Fragment;
import com.mall.ui.page.ip.sponsor.MallCharacterSponsorFragmentV2;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import qk0.s;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f70808b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f70807a = i7;
        this.f70808b = obj;
    }

    public final Object invoke() {
        Object obj = this.f70808b;
        switch (this.f70807a) {
            case 0:
                d dVar = (d) obj;
                dVar.f70824e.setIntValue(2);
                dVar.f70825f = "close";
                dVar.f70822c.invoke(dVar);
                return Unit.INSTANCE;
            case 1:
                UgcPartyInfoService.b bVar = ((com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.f) obj).f97432b;
                com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo.g gVar = bVar.f97413a;
                Ref.BooleanRef booleanRef = bVar.f97416d;
                if (!booleanRef.element) {
                    PageReportService pageReportService = bVar.f97414b.f97407f;
                    HashMap map = new HashMap();
                    map.put("button_type", gVar.f97438d.f97423a ? "1" : "0");
                    map.put("activity_id", String.valueOf(Long.valueOf(gVar.f97438d.f97427e.f97418a)));
                    Unit unit = Unit.INSTANCE;
                    PageReportService.i(pageReportService, "united.player-video-detail.activity-subscription.0.show", map, 4);
                    booleanRef.element = true;
                }
                return Unit.INSTANCE;
            case 2:
                ((ManuscriptEditV8Fragment) obj).bg();
                return Unit.INSTANCE;
            case 3:
                View view = ((MallCharacterSponsorFragmentV2) obj).b;
                return view != null ? (ConstraintLayout) view.findViewById(2131306607) : null;
            default:
                return (CheckBox) ((s) obj).f126142b.findViewById(2131298745);
        }
    }
}
