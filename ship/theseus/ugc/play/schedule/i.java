package com.bilibili.ship.theseus.ugc.play.schedule;

import com.bilibili.base.util.NumberFormat;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoNextInfo;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.base.localization.NumberFormat_androidKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import mv0.C8043a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/i.class */
public final class i implements AutoContinuousInterceptService.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UGCEpisodeListRepository f98185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UGCPlaybackRepository f98186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnitedSeasonDetailRepository f98187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.view.d f98188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C8043a f98189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rW0.a<InterfaceC7008a> f98190f;

    public i(UGCPlaybackRepository uGCPlaybackRepository, UGCEpisodeListRepository uGCEpisodeListRepository, UnitedSeasonDetailRepository unitedSeasonDetailRepository, com.bilibili.ship.theseus.united.page.view.d dVar, C8043a c8043a, rW0.a aVar) {
        this.f98185a = uGCEpisodeListRepository;
        this.f98186b = uGCPlaybackRepository;
        this.f98187c = unitedSeasonDetailRepository;
        this.f98188d = dVar;
        this.f98189e = c8043a;
        this.f98190f = aVar;
    }

    @Override // com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService.a
    public final void a(AutoNextInfo autoNextInfo, boolean z6) {
        InterfaceC7008a interfaceC7008a = (InterfaceC7008a) this.f98190f.get();
        long j7 = autoNextInfo.f98166k;
        int i7 = z6 ? 0 : 99;
        UnitedSeasonDetailRepository unitedSeasonDetailRepository = this.f98187c;
        long j8 = autoNextInfo.f98167l;
        com.bilibili.ship.theseus.ugc.c.a(interfaceC7008a, j7, j8, null, null, autoNextInfo.f98164i, i7, unitedSeasonDetailRepository.a(j7, j8), 12);
    }

    @Override // com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService.a
    public final Object next(Continuation<? super AutoNextInfo> continuation) {
        Av0.a aVarC;
        e eVarC;
        Object obj;
        Object next;
        UGCEpisodeListRepository uGCEpisodeListRepository = this.f98185a;
        PlaybackMode playbackModeB = uGCEpisodeListRepository.b();
        defpackage.a.b("[theseus-ugc-UGCAutoContinuousInterceptStrategyModule$provideUGCAutoContinuousInterceptStrategy$1-next] ", "mode: " + playbackModeB, "UGCAutoContinuousInterceptStrategyModule$provideUGCAutoContinuousInterceptStrategy$1-next");
        if (playbackModeB == PlaybackMode.SINGLE_EPISODE_LOOP || playbackModeB == PlaybackMode.PAUSE_WHEN_ENDED || (eVarC = uGCEpisodeListRepository.c((aVarC = this.f98186b.c()))) == null) {
            return null;
        }
        Av0.a aVar = eVarC.f98180a;
        if (aVarC != null && aVar.f590a == aVarC.f590a) {
            BLog.i("UGCAutoContinuousInterceptStrategyModule$provideUGCAutoContinuousInterceptStrategy$1-next", "[theseus-ugc-UGCAutoContinuousInterceptStrategyModule$provideUGCAutoContinuousInterceptStrategy$1-next] Scheduling ugc page, do not intercept.");
            return null;
        }
        List<C6353o> listB = this.f98187c.b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((C6353o) it.next()).h);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((Z) it2.next()).f101648d);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            Object next2 = it3.next();
            Iterator<T> it4 = ((C6355q) next2).f101689j.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                if (((Av0.a) next).f591b == aVar.f591b) {
                    break;
                }
            }
            if (next != null) {
                obj = next2;
                break;
            }
        }
        C6355q c6355q = (C6355q) obj;
        StatInfoData statInfoData = c6355q != null ? c6355q.f101690k : null;
        return new AutoNextInfo("合集下一集", AutoNextInfo.AutoNextFrom.COLLECTION, aVar.f598j, (statInfoData == null || !statInfoData.a()) ? 0 : 1, statInfoData == null ? "" : statInfoData.a() ? statInfoData.f104028b : NumberFormat_androidKt.format$default(Long.valueOf(statInfoData.f104027a), (String) null, 0, 3, (Object) null), aVar.f599k, this.f98188d.g(), NumberFormat.formatPlayTime(aVar.f595f), "united.player-video-detail.drama-endingpage.0", this.f98189e.a().f123882d, aVar.f590a, aVar.f591b);
    }
}
