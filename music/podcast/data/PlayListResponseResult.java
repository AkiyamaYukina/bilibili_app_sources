package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.BKArcPart;
import com.bapis.bilibili.app.listener.v1.DetailItem;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bapis.bilibili.app.listener.v1.PlaylistResp;
import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.player.history.MediaHistoryHelper;
import cq0.C6749b;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/PlayListResponseResult.class */
@Keep
public final class PlayListResponseResult {

    @NotNull
    private Pair<Integer, Integer> mAnchorIndex;

    @Nullable
    private List<MusicPlayVideo> mPlayList;

    public PlayListResponseResult() {
        this.mAnchorIndex = new Pair<>(0, 0);
    }

    public PlayListResponseResult(boolean z6, int i7, @Nullable PlayItem playItem, @NotNull PlaylistResp playlistResp) {
        this.mAnchorIndex = new Pair<>(0, 0);
        this.mPlayList = com.bilibili.music.podcast.moss.e.a(i7, playlistResp.getListList(), true);
        this.mAnchorIndex = getRealAnchorIndex(z6, playItem, playlistResp);
        handLastPlayHistory(playlistResp, z6);
    }

    private final Pair<Integer, Integer> getRealAnchorIndex(boolean z6, PlayItem playItem, PlaylistResp playlistResp) {
        DetailItem detailItem;
        int i7;
        int i8 = 0;
        if (playItem == null || !z6) {
            return new Pair<>(0, 0);
        }
        List listList = playlistResp.getListList();
        if (listList == null) {
            return new Pair<>(0, 0);
        }
        PlayItem lastPlay = playlistResp.getLastPlay();
        Iterator it = listList.iterator();
        int i9 = 0;
        while (true) {
            if (!it.hasNext()) {
                detailItem = null;
                break;
            }
            detailItem = (DetailItem) it.next();
            if (detailItem.getItem().getOid() == playItem.getOid()) {
                break;
            }
            if (detailItem.getPartsList().size() > 0) {
                i9++;
            }
        }
        if (detailItem == null) {
            return new Pair<>(0, 0);
        }
        Long l7 = (Long) CollectionsKt.getOrNull(playItem.getSubIdList(), 0);
        if (l7 != null && l7.longValue() > 0) {
            Iterator it2 = detailItem.getPartsList().iterator();
            int i10 = 0;
            while (true) {
                i7 = -1;
                if (!it2.hasNext()) {
                    break;
                }
                if (((BKArcPart) it2.next()).getSubId() == l7.longValue()) {
                    i7 = i10;
                    break;
                }
                i10++;
            }
            return i7 >= 0 ? new Pair<>(Integer.valueOf(i9), Integer.valueOf(i7)) : new Pair<>(Integer.valueOf(i9), 0);
        }
        if (lastPlay.getOid() != detailItem.getItem().getOid()) {
            return new Pair<>(Integer.valueOf(i9), 0);
        }
        Long l8 = (Long) CollectionsKt.getOrNull(lastPlay.getSubIdList(), 0);
        int i11 = -1;
        if (l8 != null) {
            long jLongValue = l8.longValue();
            Iterator it3 = detailItem.getPartsList().iterator();
            while (true) {
                i11 = -1;
                if (!it3.hasNext()) {
                    break;
                }
                if (((BKArcPart) it3.next()).getSubId() == jLongValue) {
                    i11 = i8;
                    break;
                }
                i8++;
            }
        }
        return i11 >= 0 ? new Pair<>(Integer.valueOf(i9), Integer.valueOf(i11)) : new Pair<>(Integer.valueOf(i9), 0);
    }

    private final void handLastPlayHistory(PlaylistResp playlistResp, boolean z6) {
        if (z6 && playlistResp.hasLastPlay()) {
            PlayItem lastPlay = playlistResp.getLastPlay();
            if (lastPlay.getOid() <= 0) {
                return;
            }
            long lastProgress = playlistResp.getLastProgress();
            if (lastPlay.getSubIdList().isEmpty()) {
                return;
            }
            C6749b c6749b = new C6749b(lastPlay.getSubId(0));
            MediaHistoryHelper.Companion companion = MediaHistoryHelper.Companion;
            if (companion.getInstance().read(c6749b) != null || lastProgress <= 0 || lastProgress == -1) {
                return;
            }
            companion.getInstance().write(c6749b, new MediaHistoryEntry((int) (lastProgress * ((long) 1000))));
        }
    }

    @NotNull
    public final Pair<Integer, Integer> getMAnchorIndex() {
        return this.mAnchorIndex;
    }

    @Nullable
    public final List<MusicPlayVideo> getMPlayList() {
        return this.mPlayList;
    }

    public final void setMAnchorIndex(@NotNull Pair<Integer, Integer> pair) {
        this.mAnchorIndex = pair;
    }

    public final void setMPlayList(@Nullable List<MusicPlayVideo> list) {
        this.mPlayList = list;
    }
}
