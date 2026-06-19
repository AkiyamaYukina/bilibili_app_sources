package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import androidx.annotation.Keep;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/MediaSortedItem.class */
@Keep
public final class MediaSortedItem implements Comparator<MediaSortedItem> {
    private long addTime;

    @Nullable
    private ImageItem imageItem;

    @NotNull
    private String materialKey;

    public MediaSortedItem() {
        this.materialKey = "";
    }

    public MediaSortedItem(@NotNull MediaStrategyItem mediaStrategyItem) {
        this();
        ImageItem source = mediaStrategyItem.getSource();
        this.addTime = source != null ? source.addTime : 0L;
        this.materialKey = mediaStrategyItem.getMaterialKey();
        this.imageItem = mediaStrategyItem.getSource();
    }

    @Override // java.util.Comparator
    public int compare(@Nullable MediaSortedItem mediaSortedItem, @Nullable MediaSortedItem mediaSortedItem2) {
        if (Intrinsics.areEqual(mediaSortedItem, mediaSortedItem2)) {
            return 0;
        }
        if (mediaSortedItem == null) {
            return -1;
        }
        if (mediaSortedItem2 == null) {
            return 1;
        }
        long j7 = mediaSortedItem.addTime;
        long j8 = mediaSortedItem2.addTime;
        return j7 != j8 ? Intrinsics.compare(j8, j7) : mediaSortedItem.materialKey.compareTo(mediaSortedItem2.materialKey);
    }

    @Override // java.util.Comparator
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSortedItem)) {
            return false;
        }
        MediaSortedItem mediaSortedItem = (MediaSortedItem) obj;
        return this.addTime == mediaSortedItem.addTime && Intrinsics.areEqual(this.materialKey, mediaSortedItem.materialKey);
    }

    public final long getAddTime() {
        return this.addTime;
    }

    @Nullable
    public final ImageItem getImageItem() {
        return this.imageItem;
    }

    @NotNull
    public final String getMaterialKey() {
        return this.materialKey;
    }

    public int hashCode() {
        return this.materialKey.hashCode() + (Long.hashCode(this.addTime) * 31);
    }

    public final void setAddTime(long j7) {
        this.addTime = j7;
    }

    public final void setImageItem(@Nullable ImageItem imageItem) {
        this.imageItem = imageItem;
    }

    public final void setMaterialKey(@NotNull String str) {
        this.materialKey = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = n.a(this.addTime, "MediaSortedItem(addTime=", ", materialKey='", this.materialKey);
        sbA.append("')");
        return sbA.toString();
    }
}
