package com.bilibili.ship.theseus.ugc.playercontainer;

import com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import java.util.Iterator;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/w.class */
public final class w implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UGCDirectorSerialOperationsService f98361a;

    public w(UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService) {
        this.f98361a = uGCDirectorSerialOperationsService;
    }

    public final int getPlayingItemIndex() {
        UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService = this.f98361a;
        Iterator<com.bilibili.ship.theseus.ugc.play.schedule.e> it = uGCDirectorSerialOperationsService.h.a().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (com.bilibili.ship.theseus.ugc.play.schedule.c.a(it.next(), uGCDirectorSerialOperationsService.f98275e.c())) {
                break;
            }
            i7++;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext(boolean r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L10
            r0 = r5
            r4 = r0
            r0 = r3
            int r0 = r0.itemCount()
            r1 = 1
            if (r0 > r1) goto L2b
        L10:
            r0 = r3
            int r0 = r0.getPlayingItemIndex()
            r1 = r3
            com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService r1 = r1.f98361a
            com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository r1 = r1.h
            java.util.List r1 = r1.a()
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            if (r0 >= r1) goto L29
            r0 = r5
            r4 = r0
            goto L2b
        L29:
            r0 = 0
            r4 = r0
        L2b:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.w.hasNext(boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasPrevious(boolean r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L10
            r0 = r5
            r4 = r0
            r0 = r3
            int r0 = r0.itemCount()
            r1 = 1
            if (r0 > r1) goto L28
        L10:
            r0 = r5
            r4 = r0
            r0 = r3
            int r0 = r0.getPlayingItemIndex()
            if (r0 > 0) goto L28
            r0 = r3
            int r0 = r0.getPlayingItemIndex()
            r1 = -1
            if (r0 != r1) goto L26
            r0 = r5
            r4 = r0
            goto L28
        L26:
            r0 = 0
            r4 = r0
        L28:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.w.hasPrevious(boolean):boolean");
    }

    public final boolean isProcessCompleteActionAvailable() {
        return ((Boolean) this.f98361a.f98276f.f104679s.getValue()).booleanValue();
    }

    public final int itemCount() {
        return this.f98361a.h.a().size();
    }

    public final void switchToNext(boolean z6) {
        UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService = this.f98361a;
        boolean zD = uGCDirectorSerialOperationsService.f98272b.d();
        com.bilibili.ship.theseus.ugc.play.schedule.k kVar = uGCDirectorSerialOperationsService.f98277g;
        if (!zD) {
            kVar.c(0);
            return;
        }
        if (!uGCDirectorSerialOperationsService.f98272b.a()) {
            kVar.c(99);
            return;
        }
        UGCBackgroundPlayService uGCBackgroundPlayService = uGCDirectorSerialOperationsService.f98273c;
        uGCBackgroundPlayService.getClass();
        BLog.i("UGCBackgroundPlayService-playAINext", "[theseus-ugc-UGCBackgroundPlayService-playAINext] playNext");
        PageBackgroundPlayRepository pageBackgroundPlayRepository = uGCBackgroundPlayService.f96303b;
        if (!pageBackgroundPlayRepository.a() || pageBackgroundPlayRepository.f99002l < pageBackgroundPlayRepository.f98999i.size() - 1) {
            uGCBackgroundPlayService.d();
            return;
        }
        pageBackgroundPlayRepository.f99004n = true;
        if (pageBackgroundPlayRepository.e()) {
            return;
        }
        uGCBackgroundPlayService.d();
    }

    public final void switchToPrevious(boolean z6) {
        UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService = this.f98361a;
        boolean zD = uGCDirectorSerialOperationsService.f98272b.d();
        com.bilibili.ship.theseus.ugc.play.schedule.k kVar = uGCDirectorSerialOperationsService.f98277g;
        if (!zD) {
            kVar.d(0);
        } else if (uGCDirectorSerialOperationsService.f98272b.a()) {
            uGCDirectorSerialOperationsService.f98273c.c();
        } else {
            kVar.d(99);
        }
    }
}
