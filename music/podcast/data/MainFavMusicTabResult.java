package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.MainFavMusicMenuListResp;
import com.bapis.bilibili.app.listener.v1.MainFavMusicSubTabListResp;
import com.bapis.bilibili.app.listener.v1.MusicMenu;
import com.bapis.bilibili.app.listener.v1.MusicSubTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ji0.C7687a;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MainFavMusicTabResult.class */
@Keep
public final class MainFavMusicTabResult {

    @NotNull
    private List<MainFavMusicTab> mTabList;

    public MainFavMusicTabResult() {
        this.mTabList = CollectionsKt.emptyList();
    }

    public MainFavMusicTabResult(@NotNull MainFavMusicSubTabListResp mainFavMusicSubTabListResp) {
        this.mTabList = CollectionsKt.emptyList();
        List tabsList = mainFavMusicSubTabListResp.getTabsList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tabsList, 10));
        Iterator it = tabsList.iterator();
        while (it.hasNext()) {
            arrayList.add(new MainFavMusicTab((MusicSubTab) it.next()));
        }
        this.mTabList = arrayList;
        Map firstPageResMap = mainFavMusicSubTabListResp.getFirstPageResMap();
        for (MainFavMusicTab mainFavMusicTab : this.mTabList) {
            MainFavMusicMenuListResp mainFavMusicMenuListResp = (MainFavMusicMenuListResp) firstPageResMap.get(Integer.valueOf(mainFavMusicTab.getTabType()));
            if (mainFavMusicMenuListResp != null) {
                mainFavMusicTab.setHasMore(mainFavMusicMenuListResp.getHasMore());
                mainFavMusicTab.setTabType(mainFavMusicMenuListResp.getTabType());
                mainFavMusicTab.setHasMore(mainFavMusicMenuListResp.getHasMore());
                mainFavMusicTab.setOffset(mainFavMusicMenuListResp.getOffset());
                List menuListList = mainFavMusicMenuListResp.getMenuListList();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(menuListList, 10));
                Iterator it2 = menuListList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new MainFavMusicMenu((MusicMenu) it2.next()));
                }
                mainFavMusicTab.addItems(arrayList2);
                C7687a c7687a = mainFavMusicTab.getItems().isEmpty() ? null : new C7687a();
                if (mainFavMusicTab.getHasMore()) {
                    if (c7687a != null) {
                        c7687a.f122433a = 1;
                    }
                } else if (c7687a != null) {
                    c7687a.f122433a = 3;
                }
                if (c7687a != null) {
                    mainFavMusicTab.addItems(CollectionsKt.listOf(c7687a));
                }
            }
        }
    }

    @NotNull
    public final List<MainFavMusicTab> getMTabList() {
        return this.mTabList;
    }

    public final void setMTabList(@NotNull List<MainFavMusicTab> list) {
        this.mTabList = list;
    }
}
