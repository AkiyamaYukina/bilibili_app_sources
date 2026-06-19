package com.bilibili.lib.projection.internal.projectionitem.base;

import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/base/IProjectionPlayableItem.class */
public interface IProjectionPlayableItem extends Parcelable {
    @NotNull
    IProjectionItem getRawItem();
}
