package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.io.Serializable;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/ArticleList.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ArticleList implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "articles_count")
    private long articlesCount;

    @JSONField(name = "ctime")
    private long ctime;

    @JvmField
    @JSONField(name = "id")
    public long id;

    @JSONField(name = ThirdPartyExtraBuilder.SHARE_PARAMS_IMAGE_URL)
    @Nullable
    private String imageUrl;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "publish_time")
    private long publishTime;

    @JSONField(name = "read")
    private long read;

    @JSONField(name = "summary")
    @Nullable
    private String summary;

    @JSONField(name = "update_time")
    private long updateTime;

    @JSONField(name = "words")
    private long words;

    public final long getArticlesCount() {
        return this.articlesCount;
    }

    public final long getCtime() {
        return this.ctime;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getPublishTime() {
        return this.publishTime;
    }

    public final long getRead() {
        return this.read;
    }

    @Nullable
    public final String getSummary() {
        return this.summary;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getWords() {
        return this.words;
    }

    public final void setArticlesCount(long j7) {
        this.articlesCount = j7;
    }

    public final void setCtime(long j7) {
        this.ctime = j7;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPublishTime(long j7) {
        this.publishTime = j7;
    }

    public final void setRead(long j7) {
        this.read = j7;
    }

    public final void setSummary(@Nullable String str) {
        this.summary = str;
    }

    public final void setUpdateTime(long j7) {
        this.updateTime = j7;
    }

    public final void setWords(long j7) {
        this.words = j7;
    }
}
