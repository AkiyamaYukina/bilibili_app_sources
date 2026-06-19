package com.bilibili.ship.theseus.ogv.playercontainer;

import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import tv.danmaku.biliplayerv2.service.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/g.class */
public final class g implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvDirectorSerialOperationsService f94319a;

    public g(OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService) {
        this.f94319a = ogvDirectorSerialOperationsService;
    }

    public final int getPlayingItemIndex() {
        OgvEpisode ogvEpisodeC = this.f94319a.f94293b.c();
        if (ogvEpisodeC == null) {
            return 0;
        }
        return ogvEpisodeC.f93551G;
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
            if (r0 > r1) goto L24
        L10:
            r0 = r3
            com.bilibili.ship.theseus.ogv.playercontainer.OgvDirectorSerialOperationsService r0 = r0.f94319a
            com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository r0 = r0.f94293b
            boolean r0 = r0.f()
            if (r0 == 0) goto L22
            r0 = r5
            r4 = r0
            goto L24
        L22:
            r0 = 0
            r4 = r0
        L24:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.playercontainer.g.hasNext(boolean):boolean");
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
            if (r0 > r1) goto L24
        L10:
            r0 = r3
            com.bilibili.ship.theseus.ogv.playercontainer.OgvDirectorSerialOperationsService r0 = r0.f94319a
            com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository r0 = r0.f94293b
            boolean r0 = r0.g()
            if (r0 == 0) goto L22
            r0 = r5
            r4 = r0
            goto L24
        L22:
            r0 = 0
            r4 = r0
        L24:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.playercontainer.g.hasPrevious(boolean):boolean");
    }

    public final boolean isProcessCompleteActionAvailable() {
        return ((Boolean) this.f94319a.f94298g.f104679s.getValue()).booleanValue();
    }

    public final int itemCount() {
        EpisodeSection episodeSectionG;
        OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService = this.f94319a;
        OgvEpisode ogvEpisodeC = ogvDirectorSerialOperationsService.f94293b.c();
        if (ogvEpisodeC == null || (episodeSectionG = ogvDirectorSerialOperationsService.f94296e.g(ogvEpisodeC.f93555a)) == null) {
            return 0;
        }
        return episodeSectionG.h.size();
    }

    public final void switchToNext(boolean z6) {
        int i7 = 0;
        OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService = this.f94319a;
        if (!z6 || ogvDirectorSerialOperationsService.f94293b.f()) {
            OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = ogvDirectorSerialOperationsService.f94293b;
            if (ogvDirectorSerialOperationsService.f94297f.d()) {
                i7 = 99;
            }
            OgvCurrentEpisodeRepository.n(ogvCurrentEpisodeRepository, i7);
            return;
        }
        int i8 = 0;
        if (ogvDirectorSerialOperationsService.f94297f.d()) {
            i8 = 99;
        }
        OgvCurrentEpisodeRepository.l(ogvDirectorSerialOperationsService.f94293b, i8);
    }

    public final void switchToPrevious(boolean z6) {
        int i7 = 0;
        OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService = this.f94319a;
        if (z6 && !ogvDirectorSerialOperationsService.f94293b.g()) {
            if (ogvDirectorSerialOperationsService.f94297f.d()) {
                i7 = 99;
            }
            OgvCurrentEpisodeRepository.m(ogvDirectorSerialOperationsService.f94293b, i7);
        } else {
            OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = ogvDirectorSerialOperationsService.f94293b;
            int i8 = 0;
            if (ogvDirectorSerialOperationsService.f94297f.d()) {
                i8 = 99;
            }
            OgvCurrentEpisodeRepository.o(ogvCurrentEpisodeRepository, i8);
        }
    }
}
