package com.bilibili.lib.projection.internal.projectionitem.base;

import com.bilibili.lib.projection.internal.api.model.ProjectionQualityInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/base/StandardProjectionPlayableItem.class */
public interface StandardProjectionPlayableItem extends CompatProjectionPlayableItem {
    @NotNull
    ProjectionQualityInfo F0();

    long getDuration();

    @NotNull
    ArrayList<ProjectionQualityInfo> getSupportQualities();

    @NotNull
    String x();
}
