package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonActivity;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<j> f97497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<C6353o> f97498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef<String> f97499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UgcSeasonService f97500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.BooleanRef f97501e;

    public i(Ref.ObjectRef<j> objectRef, Ref.ObjectRef<C6353o> objectRef2, Ref.ObjectRef<String> objectRef3, UgcSeasonService ugcSeasonService, Ref.BooleanRef booleanRef) {
        this.f97497a = objectRef;
        this.f97498b = objectRef2;
        this.f97499c = objectRef3;
        this.f97500d = ugcSeasonService;
        this.f97501e = booleanRef;
    }

    public final String a() {
        return (String) this.f97499c.element;
    }

    public final void b(boolean z6) {
        Ref.ObjectRef<C6353o> objectRef = this.f97498b;
        Integer numValueOf = null;
        UgcSeasonService ugcSeasonService = this.f97500d;
        if (!z6) {
            PageReportService pageReportService = ugcSeasonService.f97461k;
            HashMap map = new HashMap();
            map.put("goto_daid", String.valueOf(((C6353o) objectRef.element).f101669a));
            UnitedSeasonActivity unitedSeasonActivity = ((C6353o) objectRef.element).f101678k;
            Integer numValueOf2 = null;
            if (unitedSeasonActivity != null) {
                numValueOf2 = Integer.valueOf(unitedSeasonActivity.k());
            }
            map.put("clockin_type", String.valueOf(numValueOf2));
            Unit unit = Unit.INSTANCE;
            PageReportService.g(pageReportService, "united.player-video-detail.base-drama.0.click", map, 4);
            return;
        }
        Ref.BooleanRef booleanRef = this.f97501e;
        if (booleanRef.element) {
            return;
        }
        PageReportService pageReportService2 = ugcSeasonService.f97461k;
        HashMap map2 = new HashMap();
        map2.put("goto_daid", String.valueOf(((C6353o) objectRef.element).f101669a));
        UnitedSeasonActivity unitedSeasonActivity2 = ((C6353o) objectRef.element).f101678k;
        if (unitedSeasonActivity2 != null) {
            numValueOf = Integer.valueOf(unitedSeasonActivity2.k());
        }
        map2.put("clockin_type", String.valueOf(numValueOf));
        Unit unit2 = Unit.INSTANCE;
        PageReportService.i(pageReportService2, "united.player-video-detail.base-drama.0.show", map2, 4);
        booleanRef.element = true;
    }

    public final String c() {
        String str = ((C6353o) this.f97498b.element).f101676i;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }
}
