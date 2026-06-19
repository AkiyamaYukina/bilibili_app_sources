package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/CloudSpeedInfo.class */
@Keep
public final class CloudSpeedInfo {
    private float currentSpeed;
    private boolean isSelected;

    @NotNull
    private List<Float> supportSpeedList;

    public CloudSpeedInfo(float f7, @NotNull List<Float> list, boolean z6) {
        this.currentSpeed = f7;
        this.supportSpeedList = list;
        this.isSelected = z6;
    }

    public /* synthetic */ CloudSpeedInfo(float f7, List list, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, list, (i7 & 4) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CloudSpeedInfo copy$default(CloudSpeedInfo cloudSpeedInfo, float f7, List list, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = cloudSpeedInfo.currentSpeed;
        }
        if ((i7 & 2) != 0) {
            list = cloudSpeedInfo.supportSpeedList;
        }
        if ((i7 & 4) != 0) {
            z6 = cloudSpeedInfo.isSelected;
        }
        return cloudSpeedInfo.copy(f7, list, z6);
    }

    public final float component1() {
        return this.currentSpeed;
    }

    @NotNull
    public final List<Float> component2() {
        return this.supportSpeedList;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    @NotNull
    public final CloudSpeedInfo copy(float f7, @NotNull List<Float> list, boolean z6) {
        return new CloudSpeedInfo(f7, list, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudSpeedInfo)) {
            return false;
        }
        CloudSpeedInfo cloudSpeedInfo = (CloudSpeedInfo) obj;
        return Float.compare(this.currentSpeed, cloudSpeedInfo.currentSpeed) == 0 && Intrinsics.areEqual(this.supportSpeedList, cloudSpeedInfo.supportSpeedList) && this.isSelected == cloudSpeedInfo.isSelected;
    }

    public final float getCurrentSpeed() {
        return this.currentSpeed;
    }

    @NotNull
    public final List<Float> getSupportSpeedList() {
        return this.supportSpeedList;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + e0.a(Float.hashCode(this.currentSpeed) * 31, 31, this.supportSpeedList);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCurrentSpeed(float f7) {
        this.currentSpeed = f7;
    }

    public final void setSelected(boolean z6) {
        this.isSelected = z6;
    }

    public final void setSupportSpeedList(@NotNull List<Float> list) {
        this.supportSpeedList = list;
    }

    @NotNull
    public String toString() {
        float f7 = this.currentSpeed;
        List<Float> list = this.supportSpeedList;
        boolean z6 = this.isSelected;
        StringBuilder sb = new StringBuilder("CloudSpeedInfo(currentSpeed=");
        sb.append(f7);
        sb.append(", supportSpeedList=");
        sb.append(list);
        sb.append(", isSelected=");
        return i.a(sb, z6, ")");
    }
}
