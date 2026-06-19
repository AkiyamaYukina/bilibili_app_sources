package com.bilibili.music.podcast.moss;

import com.bapis.bilibili.app.listener.v1.DetailItem;
import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.player.history.MediaHistoryHelper;
import cq0.C6749b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/e.class */
public final class e {
    @Nullable
    public static List a(int i7, @Nullable List list, boolean z6) {
        if (list == null) {
            return null;
        }
        List<DetailItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (DetailItem detailItem : list2) {
            if (z6 && detailItem != null) {
                long lastPart = detailItem.getLastPart();
                long progress = detailItem.getProgress();
                if (lastPart > 0 && progress != -1) {
                    MediaHistoryHelper.Companion.getInstance().write(new C6749b(lastPart), new MediaHistoryEntry((int) (progress * ((long) 1000))));
                }
            }
            arrayList.add(b(i7, detailItem));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x02b2  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.music.podcast.data.MusicPlayVideo b(int r4, @org.jetbrains.annotations.NotNull com.bapis.bilibili.app.listener.v1.DetailItem r5) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.moss.e.b(int, com.bapis.bilibili.app.listener.v1.DetailItem):com.bilibili.music.podcast.data.MusicPlayVideo");
    }
}
