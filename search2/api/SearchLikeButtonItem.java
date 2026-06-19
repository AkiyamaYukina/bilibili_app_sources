package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kntr.base.localization.NumberFormat_androidKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchLikeButtonItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchLikeButtonItem {
    public static final int $stable = 8;

    @JSONField(name = "aid")
    private long aid;

    @JSONField(name = "count")
    private long count;

    @JSONField(name = "dislike_night_resource")
    @Nullable
    private LikeResource dislikeNightResource;

    @JSONField(name = "dislike_resource")
    @Nullable
    private LikeResource dislikeResource;

    @JSONField(name = "like_night_resource")
    @Nullable
    private LikeResource likeNightResource;

    @JSONField(name = "like_resource")
    @Nullable
    private LikeResource likeResource;

    @JSONField(name = "selected")
    private int selected;

    @JSONField(name = "show_count")
    private boolean showCount;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchLikeButtonItem$LikeResource.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class LikeResource {
        public static final int $stable = 8;

        @JSONField(name = "content_hash")
        @Nullable
        private String contentHash;

        @JSONField(name = "url")
        @Nullable
        private String url;

        public LikeResource() {
        }

        public LikeResource(@NotNull com.bapis.bilibili.polymer.app.search.v1.LikeResource likeResource) {
            this.url = likeResource.getUrl();
            this.contentHash = likeResource.getContentHash();
        }

        @Nullable
        public final String getContentHash() {
            return this.contentHash;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setContentHash(@Nullable String str) {
            this.contentHash = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    public SearchLikeButtonItem() {
    }

    public SearchLikeButtonItem(@NotNull com.bapis.bilibili.polymer.app.search.v1.SearchLikeButtonItem searchLikeButtonItem) {
        this.aid = searchLikeButtonItem.getAid();
        this.count = searchLikeButtonItem.getCount();
        this.selected = searchLikeButtonItem.getSelected();
        this.showCount = searchLikeButtonItem.getShowCount();
        if (searchLikeButtonItem.hasLikeResource()) {
            this.likeResource = new LikeResource(searchLikeButtonItem.getLikeResource());
        }
        if (searchLikeButtonItem.hasLikeNightResource()) {
            this.likeNightResource = new LikeResource(searchLikeButtonItem.getLikeNightResource());
        }
        if (searchLikeButtonItem.hasDislikeResource()) {
            this.dislikeResource = new LikeResource(searchLikeButtonItem.getDislikeResource());
        }
        if (searchLikeButtonItem.hasDislikeNightResource()) {
            this.dislikeNightResource = new LikeResource(searchLikeButtonItem.getDislikeNightResource());
        }
    }

    public final long getAid() {
        return this.aid;
    }

    public final long getCount() {
        return this.count;
    }

    @Nullable
    public final LikeResource getDislikeNightResource() {
        return this.dislikeNightResource;
    }

    @Nullable
    public final LikeResource getDislikeResource() {
        return this.dislikeResource;
    }

    @NotNull
    public final String getFormatCount() {
        return !this.showCount ? "" : NumberFormat_androidKt.format$default(Long.valueOf(this.count), "-", 0, 2, (Object) null);
    }

    @Nullable
    public final LikeResource getLikeNightResource() {
        return this.likeNightResource;
    }

    @Nullable
    public final LikeResource getLikeResource() {
        return this.likeResource;
    }

    public final int getSelected() {
        return this.selected;
    }

    public final boolean getShowCount() {
        return this.showCount;
    }

    public final boolean isSelected() {
        boolean z6 = true;
        if (this.selected != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setAid(long j7) {
        this.aid = j7;
    }

    public final void setCount(long j7) {
        this.count = j7;
    }

    public final void setDislikeNightResource(@Nullable LikeResource likeResource) {
        this.dislikeNightResource = likeResource;
    }

    public final void setDislikeResource(@Nullable LikeResource likeResource) {
        this.dislikeResource = likeResource;
    }

    public final void setLikeNightResource(@Nullable LikeResource likeResource) {
        this.likeNightResource = likeResource;
    }

    public final void setLikeResource(@Nullable LikeResource likeResource) {
        this.likeResource = likeResource;
    }

    public final void setSelected(int i7) {
        this.selected = i7;
    }

    public final void setShowCount(boolean z6) {
        this.showCount = z6;
    }

    public final boolean updateSelect() {
        this.selected = 1 - this.selected;
        if (this.showCount) {
            if (isSelected()) {
                this.count++;
            } else {
                this.count--;
            }
        }
        return isSelected();
    }

    public final boolean updateSelected(boolean z6) {
        return z6 == isSelected() ? isSelected() : updateSelect();
    }

    public final boolean updateSelected(boolean z6, long j7) {
        if (z6) {
            this.selected = 1;
        } else {
            this.selected = 0;
        }
        if (this.showCount) {
            this.count = j7;
        }
        return isSelected();
    }
}
