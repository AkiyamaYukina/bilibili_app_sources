package com.bilibili.lib.projection.internal.projectionitem.base;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/base/CompatProjectionPlayableItem.class */
public interface CompatProjectionPlayableItem extends IProjectionPlayableItem {
    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    @NotNull
    StandardProjectionItem getRawItem();
}
