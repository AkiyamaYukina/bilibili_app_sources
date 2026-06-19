package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.MainFavMusicMenuListResp;
import com.bapis.bilibili.app.listener.v1.MusicMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import mi0.InterfaceC8001b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MainFavMusicMenuResult.class */
@Keep
public final class MainFavMusicMenuResult {
    private boolean hasMore;

    @NotNull
    private List<InterfaceC8001b> menuList = new ArrayList();

    @Nullable
    private String offset;
    private int tabType;

    public MainFavMusicMenuResult(@NotNull MainFavMusicMenuListResp mainFavMusicMenuListResp) {
        this.tabType = mainFavMusicMenuListResp.getTabType();
        this.hasMore = mainFavMusicMenuListResp.getHasMore();
        this.offset = mainFavMusicMenuListResp.getOffset();
        List<InterfaceC8001b> list = this.menuList;
        List menuListList = mainFavMusicMenuListResp.getMenuListList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(menuListList, 10));
        Iterator it = menuListList.iterator();
        while (it.hasNext()) {
            arrayList.add(new MainFavMusicMenu((MusicMenu) it.next()));
        }
        list.addAll(arrayList);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final List<InterfaceC8001b> getMenuList() {
        return this.menuList;
    }

    @Nullable
    public final String getOffset() {
        return this.offset;
    }

    public final int getTabType() {
        return this.tabType;
    }

    public final void setHasMore(boolean z6) {
        this.hasMore = z6;
    }

    public final void setMenuList(@NotNull List<InterfaceC8001b> list) {
        this.menuList = list;
    }

    public final void setOffset(@Nullable String str) {
        this.offset = str;
    }

    public final void setTabType(int i7) {
        this.tabType = i7;
    }
}
