package com.bilibili.lib.projection.internal.projectionitem.base;

import com.bilibili.lib.projection.commonburid.CastContentType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/base/StandardProjectionItem.class */
public interface StandardProjectionItem extends IProjectionItem {
    int getAutoNext();

    long getAvid();

    long getBiz_id();

    @NotNull
    String getBvid();

    @NotNull
    CastContentType getCastContentType();

    long getCid();

    int getDesc();

    long getEpid();

    @Nullable
    String getFromSpmid();

    @NotNull
    String getJumpUri();

    long getOid();

    int getOtype();

    @Nullable
    String getSpmid();

    long getSsid();

    @Nullable
    String getStartKey();

    @NotNull
    String getTitle();

    int getType();

    long getUpmid();

    default boolean isAutoNext() {
        boolean z6 = true;
        if (getAutoNext() != 1) {
            z6 = false;
        }
        return z6;
    }
}
