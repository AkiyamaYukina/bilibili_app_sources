package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.blueshield.IDeviceColorModule;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.search2.api.SearchResultAll;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchEasterEggItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchEasterEggItem implements Serializable {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    private static final long serialVersionUID = 9849461564894L;

    @JSONField(name = "hash")
    @Nullable
    private String hash;

    @JSONField(name = "sid")
    private int id;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @Nullable
    private transient String path;

    @JSONField(name = TextSource.CFG_SIZE)
    private long size;

    @JSONField(name = "type")
    @Nullable
    private String type;

    @JSONField(name = "url")
    @Nullable
    private String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchEasterEggItem$a.class */
    public static final class a {
    }

    public final boolean canPrefetch() {
        return this.size <= SearchResultAll.EasterEgg.preFetchSize;
    }

    @Nullable
    public final String getHash() {
        return this.hash;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean isAnimImg() {
        return Intrinsics.areEqual("dynamic", this.type);
    }

    public final boolean isStaticImg() {
        return Intrinsics.areEqual(IDeviceColorModule.UPDATE_LABEL_SCENE_STATIC, this.type);
    }

    public final boolean isVideo() {
        return Intrinsics.areEqual("mov", this.type);
    }

    public final void setHash(@Nullable String str) {
        this.hash = str;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
    }

    public final void setSize(long j7) {
        this.size = j7;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return this.id + " , " + this.type + " , " + this.url;
    }

    public final boolean withMd5Verify() {
        return isVideo();
    }
}
