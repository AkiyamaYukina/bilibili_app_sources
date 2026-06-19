package com.bilibili.music.podcast.collection.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/data/FavFolderItem.class */
@Keep
public final class FavFolderItem {
    private static final int ATTR_CHECKED_MASK = 4;
    private static final int ATTR_COVER_UPDATE_MASK = 64;
    private static final int ATTR_DEFAULT_MASK = 2;
    private static final int ATTR_DESC_UPDATE_MASK = 32;
    private static final int ATTR_PUBLIC_MASK = 1;
    private static final int ATTR_SENSITIVE_AUDIT_MASK = 128;
    private static final int ATTR_SHIFT = 1;
    private static final int ATTR_TITLE_UPDATE_MASK = 16;
    private static final int ATTR_VALIDE_MASK = 8;

    @NotNull
    public static final a Companion = new Object();
    private int attr;
    private int count;

    @Nullable
    private String cover;
    private long ctime;
    private int favCount;
    private int favState;
    private int favored;
    private long id;

    @Nullable
    private String intro;
    private int likeCount;
    private long mtime;
    private int playCount;
    private int replyCount;
    private int shareCount;

    @Nullable
    private String title;
    private int type = -1;

    @Nullable
    private Upper upper;
    private int valid;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/data/FavFolderItem$Upper.class */
    @Keep
    public static final class Upper {
        private long mid;

        @Nullable
        private String name;

        public final long getMid() {
            return this.mid;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final void setMid(long j7) {
            this.mid = j7;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/data/FavFolderItem$a.class */
    public static final class a {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public final int getAttr() {
        return this.attr;
    }

    public final long getAuthorId() {
        Upper upper = this.upper;
        return upper == null ? 0L : upper.getMid();
    }

    @Nullable
    public final String getAuthorName() {
        Upper upper = this.upper;
        return (upper != null ? upper.getName() : null) == null ? "" : this.upper.getName();
    }

    public long getCommentCounts() {
        return this.replyCount;
    }

    public int getContentCounts() {
        return this.count;
    }

    public final int getCount() {
        return this.count;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public String getCoverUrl() {
        return this.cover;
    }

    public long getCreatorId() {
        return getAuthorId();
    }

    @Nullable
    public String getCreatorName() {
        return getAuthorName();
    }

    public final long getCtime() {
        return this.ctime;
    }

    public final int getFavCount() {
        return this.favCount;
    }

    public final int getFavState() {
        return this.favState;
    }

    public final int getFavored() {
        return this.favored;
    }

    public long getId() {
        return this.id;
    }

    @Nullable
    public String getIntro() {
        return this.intro;
    }

    @NotNull
    public String getKey() {
        return String.valueOf(this.id);
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final long getMtime() {
        return this.mtime;
    }

    public final int getPlayCount() {
        return this.playCount;
    }

    public long getPlayCounts() {
        return this.playCount;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final int getShareCount() {
        return this.shareCount;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final Upper getUpper() {
        return this.upper;
    }

    public final int getValid() {
        return this.valid;
    }

    public final boolean hasCurrentVideo() {
        boolean z6 = true;
        if (this.favState != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isDefault() {
        return (this.attr & 2) == 0;
    }

    public boolean isDefaultAttr() {
        return isDefault();
    }

    public boolean isInvalid() {
        return !isValid();
    }

    public final boolean isPublic() {
        boolean z6 = true;
        if ((this.attr & 1) != 0) {
            z6 = false;
        }
        return z6;
    }

    public boolean isPublicAttr() {
        return isPublic();
    }

    public boolean isUPDelete() {
        boolean z6 = true;
        if ((this.attr & 8) != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isValid() {
        return this.valid == 0;
    }

    public final void setAttr(int i7) {
        this.attr = i7;
    }

    public final void setCount(int i7) {
        this.count = i7;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setCtime(long j7) {
        this.ctime = j7;
    }

    public final void setFavCount(int i7) {
        this.favCount = i7;
    }

    public final void setFavState(int i7) {
        this.favState = i7;
    }

    public final void setFavored(int i7) {
        this.favored = i7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setIntro(@Nullable String str) {
        this.intro = str;
    }

    public final void setLikeCount(int i7) {
        this.likeCount = i7;
    }

    public final void setMtime(long j7) {
        this.mtime = j7;
    }

    public final void setPlayCount(int i7) {
        this.playCount = i7;
    }

    public final void setReplyCount(int i7) {
        this.replyCount = i7;
    }

    public final void setShareCount(int i7) {
        this.shareCount = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUpper(@Nullable Upper upper) {
        this.upper = upper;
    }

    public final void setValid(int i7) {
        this.valid = i7;
    }
}
