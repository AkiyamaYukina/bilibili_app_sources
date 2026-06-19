package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/NormalSpeedInfo.class */
@Keep
public final class NormalSpeedInfo {
    private float currSpeed;
    private boolean isSelected;

    @NotNull
    private List<Float> supportSpeedList;

    public NormalSpeedInfo(float f7, @NotNull List<Float> list, boolean z6) {
        this.currSpeed = f7;
        this.supportSpeedList = list;
        this.isSelected = z6;
    }

    public /* synthetic */ NormalSpeedInfo(float f7, List list, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, list, (i7 & 4) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NormalSpeedInfo copy$default(NormalSpeedInfo normalSpeedInfo, float f7, List list, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            f7 = normalSpeedInfo.currSpeed;
        }
        if ((i7 & 2) != 0) {
            list = normalSpeedInfo.supportSpeedList;
        }
        if ((i7 & 4) != 0) {
            z6 = normalSpeedInfo.isSelected;
        }
        return normalSpeedInfo.copy(f7, list, z6);
    }

    public final float component1() {
        return this.currSpeed;
    }

    @NotNull
    public final List<Float> component2() {
        return this.supportSpeedList;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    @NotNull
    public final NormalSpeedInfo copy(float f7, @NotNull List<Float> list, boolean z6) {
        return new NormalSpeedInfo(f7, list, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NormalSpeedInfo)) {
            return false;
        }
        NormalSpeedInfo normalSpeedInfo = (NormalSpeedInfo) obj;
        return Float.compare(this.currSpeed, normalSpeedInfo.currSpeed) == 0 && Intrinsics.areEqual(this.supportSpeedList, normalSpeedInfo.supportSpeedList) && this.isSelected == normalSpeedInfo.isSelected;
    }

    public final float getCurrSpeed() {
        return this.currSpeed;
    }

    @NotNull
    public final List<Float> getSupportSpeedList() {
        return this.supportSpeedList;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + e0.a(Float.hashCode(this.currSpeed) * 31, 31, this.supportSpeedList);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setCurrSpeed(float f7) {
        this.currSpeed = f7;
    }

    public final void setSelected(boolean z6) {
        this.isSelected = z6;
    }

    public final void setSupportSpeedList(@NotNull List<Float> list) {
        this.supportSpeedList = list;
    }

    @NotNull
    public String toString() {
        float f7 = this.currSpeed;
        List<Float> list = this.supportSpeedList;
        boolean z6 = this.isSelected;
        StringBuilder sb = new StringBuilder("NormalSpeedInfo(currSpeed=");
        sb.append(f7);
        sb.append(", supportSpeedList=");
        sb.append(list);
        sb.append(", isSelected=");
        return i.a(sb, z6, ")");
    }
}
