package com.bilibili.ship.theseus.playlist;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.BizType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistDirectorSerialOperationsService$run$preloadProvider$1.class */
public final class PlaylistDirectorSerialOperationsService$run$preloadProvider$1 implements com.bilibili.ship.theseus.united.page.background.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlaylistDirectorSerialOperationsService f95031a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistDirectorSerialOperationsService$run$preloadProvider$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95032a;

        static {
            int[] iArr = new int[BizType.values().length];
            try {
                iArr[BizType.BIZ_TYPE_PGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BizType.BIZ_TYPE_PUGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f95032a = iArr;
        }
    }

    public PlaylistDirectorSerialOperationsService$run$preloadProvider$1(PlaylistDirectorSerialOperationsService playlistDirectorSerialOperationsService) {
        this.f95031a = playlistDirectorSerialOperationsService;
    }

    @Override // com.bilibili.ship.theseus.united.page.background.b
    public final long a(PlayViewUniteReply playViewUniteReply) {
        BizType videoType = playViewUniteReply.getPlayArc().getVideoType();
        int i7 = videoType == null ? -1 : a.f95032a[videoType.ordinal()];
        return i7 != 1 ? i7 != 2 ? com.bilibili.ship.theseus.ugc.k.a(playViewUniteReply) : com.bilibili.ship.theseus.cheese.player.playposition.b.a(playViewUniteReply) : com.bilibili.ship.theseus.ogv.media.t.a(playViewUniteReply);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.ship.theseus.united.page.background.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams> r9) {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistDirectorSerialOperationsService$run$preloadProvider$1.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
