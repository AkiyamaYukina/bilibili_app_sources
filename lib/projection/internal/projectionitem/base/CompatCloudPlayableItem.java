package com.bilibili.lib.projection.internal.projectionitem.base;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/base/CompatCloudPlayableItem.class */
public interface CompatCloudPlayableItem extends IProjectionPlayableItem {
    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    @NotNull
    StandardProjectionItem getRawItem();
}
