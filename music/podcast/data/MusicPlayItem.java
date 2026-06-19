package com.bilibili.music.podcast.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.EventTracking;
import com.bapis.bilibili.app.listener.v1.PlayInfo;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bilibili.music.podcast.collection.data.FavFolderItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPlayItem.class */
@Keep
public final class MusicPlayItem {
    private long duration;

    @Nullable
    private EventTracking eventTracking;

    @Nullable
    private PlayInfo flashPlayInfo;

    @Nullable
    private PlayItem musicAssociatedItem;

    @Nullable
    private String notPlayMessage;
    private long oid;

    @Nullable
    private Author owner;

    @Nullable
    private MusicPlayArchive playArchive;
    private int playScene;
    private int playable;
    private long sid;

    @Nullable
    private State state;

    @Nullable
    private String title;

    @Nullable
    private FavFolderItem ugcSeasonInfo;
    private int page = 1;
    private int pageCount = 1;
    private int itemType = -1;
    private int autoPlay = 99;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPlayItem$Author.class */
    @Keep
    public static final class Author {

        @Nullable
        private String avatar;
        private long mid;

        @Nullable
        private String name;
        private int relation;

        public static /* synthetic */ void getRelation$annotations() {
        }

        @Nullable
        public final String getAvatar() {
            return this.avatar;
        }

        public final long getMid() {
            return this.mid;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final int getRelation() {
            return this.relation;
        }

        public final void setAvatar(@Nullable String str) {
            this.avatar = str;
        }

        public final void setMid(long j7) {
            this.mid = j7;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setRelation(int i7) {
            this.relation = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPlayItem$MusicPlayArchive.class */
    @Keep
    public static final class MusicPlayArchive {
        private int copyright;

        @Nullable
        private String cover;

        @Nullable
        private String desc;

        @Nullable
        private String displayedOid;
        private long duration;
        private long oid;
        private long publish;
        private int rid;

        @Nullable
        private MusicPlayArchiveRights rights;

        @Nullable
        private String rname;

        @Nullable
        private String title;

        public final int getCopyright() {
            return this.copyright;
        }

        @Nullable
        public final String getCover() {
            return this.cover;
        }

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final String getDisplayedOid() {
            return this.displayedOid;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final long getOid() {
            return this.oid;
        }

        public final long getPublish() {
            return this.publish;
        }

        public final int getRid() {
            return this.rid;
        }

        @Nullable
        public final MusicPlayArchiveRights getRights() {
            return this.rights;
        }

        @Nullable
        public final String getRname() {
            return this.rname;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final boolean isForbidReprint() {
            MusicPlayArchiveRights musicPlayArchiveRights;
            boolean z6 = true;
            if (this.copyright != 1 || (musicPlayArchiveRights = this.rights) == null || musicPlayArchiveRights == null || musicPlayArchiveRights.getNoReprint() != 1) {
                z6 = false;
            }
            return z6;
        }

        public final void setCopyright(int i7) {
            this.copyright = i7;
        }

        public final void setCover(@Nullable String str) {
            this.cover = str;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setDisplayedOid(@Nullable String str) {
            this.displayedOid = str;
        }

        public final void setDuration(long j7) {
            this.duration = j7;
        }

        public final void setOid(long j7) {
            this.oid = j7;
        }

        public final void setPublish(long j7) {
            this.publish = j7;
        }

        public final void setRid(int i7) {
            this.rid = i7;
        }

        public final void setRights(@Nullable MusicPlayArchiveRights musicPlayArchiveRights) {
            this.rights = musicPlayArchiveRights;
        }

        public final void setRname(@Nullable String str) {
            this.rname = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPlayItem$MusicPlayArchiveRights.class */
    @Keep
    public static final class MusicPlayArchiveRights {
        private int noReprint;

        public final int getNoReprint() {
            return this.noReprint;
        }

        public final void setNoReprint(int i7) {
            this.noReprint = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicPlayItem$State.class */
    @Keep
    public static final class State {
        private int coin;
        private int favourite;
        private boolean isCoin;
        private boolean isFav;
        private boolean isLiked;
        private boolean isVt;
        private int like;
        private int reply;
        private int share;
        private int view;

        @NotNull
        private String viewContent = "";

        public final int getCoin() {
            return this.coin;
        }

        public final int getFavourite() {
            return this.favourite;
        }

        public final int getLike() {
            return this.like;
        }

        public final int getReply() {
            return this.reply;
        }

        public final int getShare() {
            return this.share;
        }

        public final int getView() {
            return this.view;
        }

        @NotNull
        public final String getViewContent() {
            return this.viewContent;
        }

        public final boolean isCoin() {
            return this.isCoin;
        }

        public final boolean isFav() {
            return this.isFav;
        }

        public final boolean isLiked() {
            return this.isLiked;
        }

        public final boolean isVt() {
            return this.isVt;
        }

        public final void setCoin(int i7) {
            this.coin = i7;
        }

        public final void setCoin(boolean z6) {
            this.isCoin = z6;
        }

        public final void setFav(boolean z6) {
            this.isFav = z6;
        }

        public final void setFavourite(int i7) {
            this.favourite = i7;
        }

        public final void setLike(int i7) {
            this.like = i7;
        }

        public final void setLiked(boolean z6) {
            this.isLiked = z6;
        }

        public final void setReply(int i7) {
            this.reply = i7;
        }

        public final void setShare(int i7) {
            this.share = i7;
        }

        public final void setView(int i7) {
            this.view = i7;
        }

        public final void setViewContent(@NotNull String str) {
            this.viewContent = str;
        }

        public final void setVt(boolean z6) {
            this.isVt = z6;
        }
    }

    public static /* synthetic */ void getItemType$annotations() {
    }

    public static /* synthetic */ void getPlayScene$annotations() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(MusicPlayItem.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        MusicPlayItem musicPlayItem = (MusicPlayItem) obj;
        return this.oid == musicPlayItem.oid && this.sid == musicPlayItem.sid;
    }

    public final int getAutoPlay() {
        return this.autoPlay;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final EventTracking getEventTracking() {
        return this.eventTracking;
    }

    @Nullable
    public final PlayInfo getFlashPlayInfo() {
        return this.flashPlayInfo;
    }

    public final int getItemType() {
        return this.itemType;
    }

    @Nullable
    public final PlayItem getMusicAssociatedItem() {
        return this.musicAssociatedItem;
    }

    @Nullable
    public final String getNotPlayMessage() {
        return this.notPlayMessage;
    }

    public final long getOid() {
        return this.oid;
    }

    @Nullable
    public final Author getOwner() {
        return this.owner;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    @Nullable
    public final MusicPlayArchive getPlayArchive() {
        return this.playArchive;
    }

    public final int getPlayScene() {
        return this.playScene;
    }

    public final int getPlayable() {
        return this.playable;
    }

    public final long getSid() {
        return this.sid;
    }

    @Nullable
    public final State getState() {
        return this.state;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final FavFolderItem getUgcSeasonInfo() {
        return this.ugcSeasonInfo;
    }

    public int hashCode() {
        return Long.hashCode(this.sid) + (Long.hashCode(this.oid) * 31);
    }

    public final boolean isUgcVideo() {
        int i7 = this.itemType;
        boolean z6 = true;
        if (i7 != -1) {
            z6 = i7 == 1;
        }
        return z6;
    }

    public final void setAutoPlay(int i7) {
        this.autoPlay = i7;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setEventTracking(@Nullable EventTracking eventTracking) {
        this.eventTracking = eventTracking;
    }

    public final void setFlashPlayInfo(@Nullable PlayInfo playInfo) {
        this.flashPlayInfo = playInfo;
    }

    public final void setItemType(int i7) {
        this.itemType = i7;
    }

    public final void setMusicAssociatedItem(@Nullable PlayItem playItem) {
        this.musicAssociatedItem = playItem;
    }

    public final void setNotPlayMessage(@Nullable String str) {
        this.notPlayMessage = str;
    }

    public final void setOid(long j7) {
        this.oid = j7;
    }

    public final void setOwner(@Nullable Author author) {
        this.owner = author;
    }

    public final void setPage(int i7) {
        this.page = i7;
    }

    public final void setPageCount(int i7) {
        this.pageCount = i7;
    }

    public final void setPlayArchive(@Nullable MusicPlayArchive musicPlayArchive) {
        this.playArchive = musicPlayArchive;
    }

    public final void setPlayScene(int i7) {
        this.playScene = i7;
    }

    public final void setPlayable(int i7) {
        this.playable = i7;
    }

    public final void setSid(long j7) {
        this.sid = j7;
    }

    public final void setState(@Nullable State state) {
        this.state = state;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUgcSeasonInfo(@Nullable FavFolderItem favFolderItem) {
        this.ugcSeasonInfo = favFolderItem;
    }
}
