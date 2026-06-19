package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.MusicSubTab;
import java.util.ArrayList;
import java.util.List;
import ji0.C7687a;
import mi0.AbstractC8000a;
import mi0.InterfaceC8001b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MainFavMusicTab.class */
@Keep
public final class MainFavMusicTab extends AbstractC8000a<InterfaceC8001b> {

    @Nullable
    private String name;

    @Nullable
    private String offset;
    private int tabType;
    private int total;

    @NotNull
    private final List<InterfaceC8001b> menuList = new ArrayList();
    private boolean hasMore = true;

    public MainFavMusicTab() {
    }

    public MainFavMusicTab(@NotNull MusicSubTab musicSubTab) {
        this.name = musicSubTab.getName();
        this.tabType = musicSubTab.getTabType();
        this.total = (int) musicSubTab.getTotal();
    }

    @Override // mi0.AbstractC8000a
    public void addItems(@NotNull List<InterfaceC8001b> list) {
        int size = getItems().size();
        int i7 = size;
        if (size > 0) {
            i7 = size;
            if (getItems().get(size - 1) instanceof C7687a) {
                i7 = size - 1;
            }
        }
        this.menuList.addAll(i7, list);
    }

    @Override // mi0.AbstractC8000a
    public int getGroupType() {
        return this.tabType;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Override // ni0.AbstractC8096b
    @NotNull
    public List<InterfaceC8001b> getItems() {
        return this.menuList;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOffset() {
        return this.offset;
    }

    public final int getTabType() {
        return this.tabType;
    }

    @Override // mi0.AbstractC8000a
    public int getTotalCount() {
        return this.total;
    }

    public final void setHasMore(boolean z6) {
        this.hasMore = z6;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOffset(@Nullable String str) {
        this.offset = str;
    }

    public final void setTabType(int i7) {
        this.tabType = i7;
    }

    @Override // mi0.AbstractC8000a
    public void setTotalCount(int i7) {
        this.total = i7;
    }
}
