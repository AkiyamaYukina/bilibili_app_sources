package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.MusicMenu;
import com.bapis.bilibili.app.listener.v1.MusicMenuAuthor;
import com.bapis.bilibili.app.listener.v1.MusicMenuStat;
import kotlin.jvm.internal.Intrinsics;
import mi0.InterfaceC8001b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MainFavMusicMenu.class */
@Keep
public final class MainFavMusicMenu implements InterfaceC8001b {
    private static final int ATTR_PUBLIC = 2;
    private static final int ATTR_TYPE = 1;

    @NotNull
    public static final a Companion = new Object();
    private int attr;

    @Nullable
    private String cover;
    private long ctime;

    @Nullable
    private String desc;
    private long id;
    private int menuType;

    @Nullable
    private MusicMenuAuthor owner;

    @Nullable
    private MusicMenuStat stat;
    private int state;

    @Nullable
    private String title;
    private long total;

    @Nullable
    private String uri;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MainFavMusicMenu$a.class */
    public static final class a {
    }

    public MainFavMusicMenu() {
    }

    public MainFavMusicMenu(@NotNull MusicMenu musicMenu) {
        this.id = musicMenu.getId();
        this.menuType = musicMenu.getMenuType();
        this.title = musicMenu.getTitle();
        this.desc = musicMenu.getDesc();
        this.cover = musicMenu.getCover();
        this.owner = musicMenu.getOwner();
        this.state = musicMenu.getState();
        this.attr = (int) musicMenu.getAttr();
        this.stat = musicMenu.getStat();
        this.total = musicMenu.getTotal();
        this.ctime = musicMenu.getCtime();
        this.uri = musicMenu.getUri();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(MainFavMusicMenu.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        MainFavMusicMenu mainFavMusicMenu = (MainFavMusicMenu) obj;
        return this.id == mainFavMusicMenu.id && this.menuType == mainFavMusicMenu.menuType;
    }

    public final int getAttr() {
        return this.attr;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final long getCtime() {
        return this.ctime;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final long getId() {
        return this.id;
    }

    public final int getMenuType() {
        return this.menuType;
    }

    @Nullable
    public final MusicMenuAuthor getOwner() {
        return this.owner;
    }

    @Nullable
    public final MusicMenuStat getStat() {
        return this.stat;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final long getTotal() {
        return this.total;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + this.menuType;
    }

    public final boolean isDefault() {
        boolean z6 = true;
        if ((this.attr & 1) == 0) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isInvalid() {
        return this.state < 0;
    }

    public final boolean isPublic() {
        return (this.attr & 2) != 0;
    }

    public final void setAttr(int i7) {
        this.attr = i7;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setCtime(long j7) {
        this.ctime = j7;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setMenuType(int i7) {
        this.menuType = i7;
    }

    public final void setOwner(@Nullable MusicMenuAuthor musicMenuAuthor) {
        this.owner = musicMenuAuthor;
    }

    public final void setPublic(boolean z6) {
        this.attr = z6 ? this.attr | 2 : this.attr & (-3);
    }

    public final void setStat(@Nullable MusicMenuStat musicMenuStat) {
        this.stat = musicMenuStat;
    }

    public final void setState(int i7) {
        this.state = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTotal(long j7) {
        this.total = j7;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }
}
