package com.bilibili.ship.theseus.ugc.intro;

import com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6354p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/n.class */
public final /* synthetic */ class n implements nv0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f97110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UgcSeasonService f97111b;

    public /* synthetic */ n(List list, UgcSeasonService ugcSeasonService) {
        this.f97110a = list;
        this.f97111b = ugcSeasonService;
    }

    @Override // nv0.h
    public final void a(nv0.m mVar) {
        Object next;
        List list = this.f97110a;
        C6353o c6353oE = C6354p.e(mVar.f124400a.getUgcSeason());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual((C6353o) next, c6353oE)) {
                    break;
                }
            }
        }
        C6353o c6353o = (C6353o) next;
        if (c6353o != null) {
            mVar.a(this.f97111b.a(c6353o));
        }
    }
}
