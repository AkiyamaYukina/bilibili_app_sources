package com.bilibili.ship.theseus.cheese.biz.modules;

import eu0.C6985d;
import java.util.Iterator;
import tv.danmaku.biliplayerv2.service.k;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/c.class */
public final class C6118c implements k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseDirectorSerialOperationsService f90396a;

    public C6118c(CheeseDirectorSerialOperationsService cheeseDirectorSerialOperationsService) {
        this.f90396a = cheeseDirectorSerialOperationsService;
    }

    public final int getPlayingItemIndex() {
        CheeseDirectorSerialOperationsService cheeseDirectorSerialOperationsService = this.f90396a;
        Iterator<com.bilibili.ship.theseus.cheese.player.playselect.c> it = cheeseDirectorSerialOperationsService.f90352f.c().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            com.bilibili.ship.theseus.cheese.player.playselect.c next = it.next();
            C6985d c6985dA = cheeseDirectorSerialOperationsService.f90349c.a();
            if (c6985dA != null && com.bilibili.ship.theseus.cheese.player.playselect.a.b(next) == c6985dA.f117511f) {
                break;
            }
            i7++;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext(boolean r5) {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.ship.theseus.cheese.biz.modules.CheeseDirectorSerialOperationsService r0 = r0.f90396a
            r7 = r0
            r0 = r7
            com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository r0 = r0.f90352f
            r1 = r4
            int r1 = r1.getPlayingItemIndex()
            r2 = r5
            com.bilibili.ship.theseus.cheese.player.playselect.c r0 = r0.b(r1, r2)
            if (r0 == 0) goto L3a
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r6
            r5 = r0
            r0 = r4
            int r0 = r0.itemCount()
            r1 = 1
            if (r0 > r1) goto L3c
        L24:
            r0 = r4
            int r0 = r0.getPlayingItemIndex()
            r1 = r7
            com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository r1 = r1.f90352f
            java.util.List r1 = r1.c()
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            if (r0 >= r1) goto L3a
            r0 = r6
            r5 = r0
            goto L3c
        L3a:
            r0 = 0
            r5 = r0
        L3c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.C6118c.hasNext(boolean):boolean");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasPrevious(boolean r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.C6118c.hasPrevious(boolean):boolean");
    }

    public final boolean isProcessCompleteActionAvailable() {
        return ((Boolean) this.f90396a.f90350d.f104679s.getValue()).booleanValue();
    }

    public final int itemCount() {
        return this.f90396a.f90352f.c().size();
    }

    public final void switchToNext(boolean z6) {
        this.f90396a.f90351e.b(false);
    }

    public final void switchToPrevious(boolean z6) {
        this.f90396a.f90351e.c();
    }
}
