package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.BKArcPart;
import com.bapis.bilibili.app.listener.v1.DetailItem;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bapis.bilibili.app.listener.v1.RcmdPlaylistResp;
import com.bapis.bilibili.app.listener.v1.TopCard;
import com.bapis.bilibili.pagination.PaginationReply;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/RecommendListResponseResult.class */
@Keep
public final class RecommendListResponseResult {

    @NotNull
    private Pair<Integer, Integer> mAnchorIndex;

    @Nullable
    private PaginationReply mNextPage;

    @Nullable
    private List<MusicPlayVideo> mPlayList;

    @Nullable
    private List<MusicRecommendTopCard> mTopCards;

    public RecommendListResponseResult() {
        this.mAnchorIndex = new Pair<>(0, 0);
    }

    public RecommendListResponseResult(boolean z6, int i7, @Nullable PlayItem playItem, boolean z7, @NotNull RcmdPlaylistResp rcmdPlaylistResp) {
        this.mAnchorIndex = new Pair<>(0, 0);
        this.mPlayList = com.bilibili.music.podcast.moss.e.a(i7, rcmdPlaylistResp.getListList(), z7);
        List topCardsList = rcmdPlaylistResp.getTopCardsList();
        ArrayList arrayList = new ArrayList();
        Iterator it = topCardsList.iterator();
        while (it.hasNext()) {
            arrayList.add(new MusicRecommendTopCard((TopCard) it.next()));
        }
        this.mTopCards = arrayList;
        this.mAnchorIndex = getRealAnchorIndex(z6, playItem, rcmdPlaylistResp);
        this.mNextPage = rcmdPlaylistResp.getNextPage();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> getRealAnchorIndex(boolean r6, com.bapis.bilibili.app.listener.v1.PlayItem r7, com.bapis.bilibili.app.listener.v1.RcmdPlaylistResp r8) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            kotlin.Pair r0 = r0.getRealHistoryIndex(r1, r2)
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            kotlin.Pair r0 = r0.getRealAnchorItemIndex(r1, r2, r3)
            r8 = r0
            r0 = r8
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = r9
            java.lang.Object r1 = r1.getFirst()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r0 <= r1) goto L2b
            goto L3b
        L2b:
            r0 = r9
            r7 = r0
            r0 = r8
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L3d
        L3b:
            r0 = r8
            r7 = r0
        L3d:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.data.RecommendListResponseResult.getRealAnchorIndex(boolean, com.bapis.bilibili.app.listener.v1.PlayItem, com.bapis.bilibili.app.listener.v1.RcmdPlaylistResp):kotlin.Pair");
    }

    private final Pair<Integer, Integer> getRealAnchorItemIndex(boolean z6, PlayItem playItem, RcmdPlaylistResp rcmdPlaylistResp) {
        int i7;
        DetailItem detailItem;
        int i8;
        Pair<Integer, Integer> pair;
        MusicPlayVideo musicPlayVideo;
        List<MusicPlayItem> parts;
        MusicPlayItem musicPlayItem;
        if (playItem == null || !z6) {
            return new Pair<>(0, 0);
        }
        List listList = rcmdPlaylistResp.getListList();
        if (listList == null) {
            return new Pair<>(0, 0);
        }
        Iterator it = listList.iterator();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i7 = i10;
            if (!it.hasNext()) {
                detailItem = null;
                i8 = 0;
                break;
            }
            detailItem = (DetailItem) it.next();
            if (detailItem.getItem().getOid() == playItem.getOid()) {
                i8 = i9;
                break;
            }
            int i11 = i7;
            if (detailItem.getPartsList().size() > 0) {
                i11 = i7 + 1;
            }
            i9++;
            i10 = i11;
        }
        if (detailItem == null) {
            return new Pair<>(0, 0);
        }
        Long l7 = (Long) CollectionsKt.getOrNull(playItem.getSubIdList(), 0);
        Iterator it2 = detailItem.getPartsList().iterator();
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i12 = -1;
                break;
            }
            long subId = ((BKArcPart) it2.next()).getSubId();
            if (l7 != null && subId == l7.longValue()) {
                break;
            }
            i12++;
        }
        if (i7 < 0 || i12 < 0) {
            pair = new Pair<>(Integer.valueOf(i7), 0);
        } else {
            List<MusicPlayVideo> list = this.mPlayList;
            if (list != null && (musicPlayVideo = (MusicPlayVideo) CollectionsKt.getOrNull(list, i8)) != null && (parts = musicPlayVideo.getParts()) != null && (musicPlayItem = (MusicPlayItem) CollectionsKt.getOrNull(parts, i12)) != null) {
                musicPlayItem.setAutoPlay(0);
            }
            pair = new Pair<>(Integer.valueOf(i7), Integer.valueOf(i12));
        }
        return pair;
    }

    private final Pair<Integer, Integer> getRealHistoryIndex(boolean z6, RcmdPlaylistResp rcmdPlaylistResp) {
        MusicPlayVideo musicPlayVideo;
        List<MusicPlayItem> parts;
        if (!z6) {
            return new Pair<>(0, 0);
        }
        int historyLen = (int) rcmdPlaylistResp.getHistoryLen();
        List listList = rcmdPlaylistResp.getListList();
        if (listList == null) {
            return new Pair<>(0, 0);
        }
        if (historyLen <= 0 || historyLen >= listList.size()) {
            return new Pair<>(0, 0);
        }
        for (int i7 = 0; i7 < historyLen; i7++) {
            List<MusicPlayVideo> list = this.mPlayList;
            if (list != null && (musicPlayVideo = (MusicPlayVideo) CollectionsKt.getOrNull(list, i7)) != null && (parts = musicPlayVideo.getParts()) != null) {
                Iterator<T> it = parts.iterator();
                while (it.hasNext()) {
                    ((MusicPlayItem) it.next()).setAutoPlay(0);
                }
            }
        }
        return new Pair<>(Integer.valueOf(historyLen), 0);
    }

    @NotNull
    public final Pair<Integer, Integer> getMAnchorIndex() {
        return this.mAnchorIndex;
    }

    @Nullable
    public final PaginationReply getMNextPage() {
        return this.mNextPage;
    }

    @Nullable
    public final List<MusicPlayVideo> getMPlayList() {
        return this.mPlayList;
    }

    @Nullable
    public final List<MusicRecommendTopCard> getMTopCards() {
        return this.mTopCards;
    }

    public final void setMAnchorIndex(@NotNull Pair<Integer, Integer> pair) {
        this.mAnchorIndex = pair;
    }

    public final void setMNextPage(@Nullable PaginationReply paginationReply) {
        this.mNextPage = paginationReply;
    }

    public final void setMPlayList(@Nullable List<MusicPlayVideo> list) {
        this.mPlayList = list;
    }

    public final void setMTopCards(@Nullable List<MusicRecommendTopCard> list) {
        this.mTopCards = list;
    }
}
