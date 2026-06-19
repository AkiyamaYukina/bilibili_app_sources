package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionSpeedInfo.class */
@Keep
public final class ProjectionSpeedInfo {

    @NotNull
    public static final a Companion = new Object();
    private boolean isSelected;
    private float playSpeed;

    @NotNull
    private List<Float> supportSpeedList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionSpeedInfo$a.class */
    public static final class a {
    }

    public ProjectionSpeedInfo(float f7, @NotNull List<Float> list, boolean z6) {
        this.playSpeed = f7;
        this.supportSpeedList = list;
        this.isSelected = z6;
    }

    public /* synthetic */ ProjectionSpeedInfo(float f7, List list, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, list, (i7 & 4) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProjectionSpeedInfo copy$default(ProjectionSpeedInfo projectionSpeedInfo, float f7, List list, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = projectionSpeedInfo.playSpeed;
        }
        if ((i7 & 2) != 0) {
            list = projectionSpeedInfo.supportSpeedList;
        }
        if ((i7 & 4) != 0) {
            z6 = projectionSpeedInfo.isSelected;
        }
        return projectionSpeedInfo.copy(f7, list, z6);
    }

    public final float component1() {
        return this.playSpeed;
    }

    @NotNull
    public final List<Float> component2() {
        return this.supportSpeedList;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    @NotNull
    public final ProjectionSpeedInfo copy(float f7, @NotNull List<Float> list, boolean z6) {
        return new ProjectionSpeedInfo(f7, list, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionSpeedInfo)) {
            return false;
        }
        ProjectionSpeedInfo projectionSpeedInfo = (ProjectionSpeedInfo) obj;
        return Float.compare(this.playSpeed, projectionSpeedInfo.playSpeed) == 0 && Intrinsics.areEqual(this.supportSpeedList, projectionSpeedInfo.supportSpeedList) && this.isSelected == projectionSpeedInfo.isSelected;
    }

    public final float getPlaySpeed() {
        return this.playSpeed;
    }

    @NotNull
    public final List<Float> getSupportSpeedList() {
        return this.supportSpeedList;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + e0.a(Float.hashCode(this.playSpeed) * 31, 31, this.supportSpeedList);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setPlaySpeed(float f7) {
        this.playSpeed = f7;
    }

    public final void setSelected(boolean z6) {
        this.isSelected = z6;
    }

    public final void setSupportSpeedList(@NotNull List<Float> list) {
        this.supportSpeedList = list;
    }

    @NotNull
    public String toString() {
        float f7 = this.playSpeed;
        List<Float> list = this.supportSpeedList;
        boolean z6 = this.isSelected;
        StringBuilder sb = new StringBuilder("ProjectionSpeedInfo(playSpeed=");
        sb.append(f7);
        sb.append(", supportSpeedList=");
        sb.append(list);
        sb.append(", isSelected=");
        return i.a(sb, z6, ")");
    }
}
