package com.bilibili.studio.videoeditor.mediav3.data;

import Uu.a;
import androidx.annotation.Keep;
import androidx.compose.animation.C3353d;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import androidx.compose.animation.z;
import c6.P;
import c6.Q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/DeviceCapabilityV3.class */
@Keep
public final class DeviceCapabilityV3 {
    private float exposureCompensationStep;
    private int maxExposureCompensation;
    private float maxZoom;
    private int minExposureCompensation;
    private boolean supportAutoExposure;
    private boolean supportAutoFocus;
    private boolean supportContinuousFocus;
    private boolean supportExposureCompensation;
    private boolean supportFlash;
    private boolean supportVideoStabilization;
    private boolean supportZoom;

    @NotNull
    private ArrayList<Float> zoomRatios;

    public DeviceCapabilityV3() {
        this(false, false, false, false, 0.0f, null, false, false, false, 0, 0, 0.0f, 4095, null);
    }

    public DeviceCapabilityV3(boolean z6, boolean z7, boolean z8, boolean z9, float f7, @NotNull ArrayList<Float> arrayList, boolean z10, boolean z11, boolean z12, int i7, int i8, float f8) {
        this.supportAutoFocus = z6;
        this.supportContinuousFocus = z7;
        this.supportAutoExposure = z8;
        this.supportZoom = z9;
        this.maxZoom = f7;
        this.zoomRatios = arrayList;
        this.supportFlash = z10;
        this.supportVideoStabilization = z11;
        this.supportExposureCompensation = z12;
        this.minExposureCompensation = i7;
        this.maxExposureCompensation = i8;
        this.exposureCompensationStep = f8;
    }

    public /* synthetic */ DeviceCapabilityV3(boolean z6, boolean z7, boolean z8, boolean z9, float f7, ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i7, int i8, float f8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? false : z6, (i9 & 2) != 0 ? false : z7, (i9 & 4) != 0 ? false : z8, (i9 & 8) != 0 ? false : z9, (i9 & 16) != 0 ? 0.0f : f7, (i9 & 32) != 0 ? new ArrayList() : arrayList, (i9 & 64) != 0 ? false : z10, (i9 & 128) != 0 ? false : z11, (i9 & 256) != 0 ? false : z12, (i9 & 512) != 0 ? 0 : i7, (i9 & 1024) != 0 ? 0 : i8, (i9 & 2048) != 0 ? 0.0f : f8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceCapabilityV3 copy$default(DeviceCapabilityV3 deviceCapabilityV3, boolean z6, boolean z7, boolean z8, boolean z9, float f7, ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i7, int i8, float f8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z6 = deviceCapabilityV3.supportAutoFocus;
        }
        if ((i9 & 2) != 0) {
            z7 = deviceCapabilityV3.supportContinuousFocus;
        }
        if ((i9 & 4) != 0) {
            z8 = deviceCapabilityV3.supportAutoExposure;
        }
        if ((i9 & 8) != 0) {
            z9 = deviceCapabilityV3.supportZoom;
        }
        if ((i9 & 16) != 0) {
            f7 = deviceCapabilityV3.maxZoom;
        }
        if ((i9 & 32) != 0) {
            arrayList = deviceCapabilityV3.zoomRatios;
        }
        if ((i9 & 64) != 0) {
            z10 = deviceCapabilityV3.supportFlash;
        }
        if ((i9 & 128) != 0) {
            z11 = deviceCapabilityV3.supportVideoStabilization;
        }
        if ((i9 & 256) != 0) {
            z12 = deviceCapabilityV3.supportExposureCompensation;
        }
        if ((i9 & 512) != 0) {
            i7 = deviceCapabilityV3.minExposureCompensation;
        }
        if ((i9 & 1024) != 0) {
            i8 = deviceCapabilityV3.maxExposureCompensation;
        }
        if ((i9 & 2048) != 0) {
            f8 = deviceCapabilityV3.exposureCompensationStep;
        }
        return deviceCapabilityV3.copy(z6, z7, z8, z9, f7, arrayList, z10, z11, z12, i7, i8, f8);
    }

    public final boolean component1() {
        return this.supportAutoFocus;
    }

    public final int component10() {
        return this.minExposureCompensation;
    }

    public final int component11() {
        return this.maxExposureCompensation;
    }

    public final float component12() {
        return this.exposureCompensationStep;
    }

    public final boolean component2() {
        return this.supportContinuousFocus;
    }

    public final boolean component3() {
        return this.supportAutoExposure;
    }

    public final boolean component4() {
        return this.supportZoom;
    }

    public final float component5() {
        return this.maxZoom;
    }

    @NotNull
    public final ArrayList<Float> component6() {
        return this.zoomRatios;
    }

    public final boolean component7() {
        return this.supportFlash;
    }

    public final boolean component8() {
        return this.supportVideoStabilization;
    }

    public final boolean component9() {
        return this.supportExposureCompensation;
    }

    @NotNull
    public final DeviceCapabilityV3 copy(boolean z6, boolean z7, boolean z8, boolean z9, float f7, @NotNull ArrayList<Float> arrayList, boolean z10, boolean z11, boolean z12, int i7, int i8, float f8) {
        return new DeviceCapabilityV3(z6, z7, z8, z9, f7, arrayList, z10, z11, z12, i7, i8, f8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceCapabilityV3)) {
            return false;
        }
        DeviceCapabilityV3 deviceCapabilityV3 = (DeviceCapabilityV3) obj;
        return this.supportAutoFocus == deviceCapabilityV3.supportAutoFocus && this.supportContinuousFocus == deviceCapabilityV3.supportContinuousFocus && this.supportAutoExposure == deviceCapabilityV3.supportAutoExposure && this.supportZoom == deviceCapabilityV3.supportZoom && Float.compare(this.maxZoom, deviceCapabilityV3.maxZoom) == 0 && Intrinsics.areEqual(this.zoomRatios, deviceCapabilityV3.zoomRatios) && this.supportFlash == deviceCapabilityV3.supportFlash && this.supportVideoStabilization == deviceCapabilityV3.supportVideoStabilization && this.supportExposureCompensation == deviceCapabilityV3.supportExposureCompensation && this.minExposureCompensation == deviceCapabilityV3.minExposureCompensation && this.maxExposureCompensation == deviceCapabilityV3.maxExposureCompensation && Float.compare(this.exposureCompensationStep, deviceCapabilityV3.exposureCompensationStep) == 0;
    }

    public final float getExposureCompensationStep() {
        return this.exposureCompensationStep;
    }

    public final int getMaxExposureCompensation() {
        return this.maxExposureCompensation;
    }

    public final float getMaxZoom() {
        return this.maxZoom;
    }

    public final int getMinExposureCompensation() {
        return this.minExposureCompensation;
    }

    public final boolean getSupportAutoExposure() {
        return this.supportAutoExposure;
    }

    public final boolean getSupportAutoFocus() {
        return this.supportAutoFocus;
    }

    public final boolean getSupportContinuousFocus() {
        return this.supportContinuousFocus;
    }

    public final boolean getSupportExposureCompensation() {
        return this.supportExposureCompensation;
    }

    public final boolean getSupportFlash() {
        return this.supportFlash;
    }

    public final boolean getSupportVideoStabilization() {
        return this.supportVideoStabilization;
    }

    public final boolean getSupportZoom() {
        return this.supportZoom;
    }

    @NotNull
    public final ArrayList<Float> getZoomRatios() {
        return this.zoomRatios;
    }

    public int hashCode() {
        return Float.hashCode(this.exposureCompensationStep) + I.a(this.maxExposureCompensation, I.a(this.minExposureCompensation, z.a(z.a(z.a(a.a(n.a(this.maxZoom, z.a(z.a(z.a(Boolean.hashCode(this.supportAutoFocus) * 31, 31, this.supportContinuousFocus), 31, this.supportAutoExposure), 31, this.supportZoom), 31), 31, this.zoomRatios), 31, this.supportFlash), 31, this.supportVideoStabilization), 31, this.supportExposureCompensation), 31), 31);
    }

    public final void setExposureCompensationStep(float f7) {
        this.exposureCompensationStep = f7;
    }

    public final void setMaxExposureCompensation(int i7) {
        this.maxExposureCompensation = i7;
    }

    public final void setMaxZoom(float f7) {
        this.maxZoom = f7;
    }

    public final void setMinExposureCompensation(int i7) {
        this.minExposureCompensation = i7;
    }

    public final void setSupportAutoExposure(boolean z6) {
        this.supportAutoExposure = z6;
    }

    public final void setSupportAutoFocus(boolean z6) {
        this.supportAutoFocus = z6;
    }

    public final void setSupportContinuousFocus(boolean z6) {
        this.supportContinuousFocus = z6;
    }

    public final void setSupportExposureCompensation(boolean z6) {
        this.supportExposureCompensation = z6;
    }

    public final void setSupportFlash(boolean z6) {
        this.supportFlash = z6;
    }

    public final void setSupportVideoStabilization(boolean z6) {
        this.supportVideoStabilization = z6;
    }

    public final void setSupportZoom(boolean z6) {
        this.supportZoom = z6;
    }

    public final void setZoomRatios(@NotNull ArrayList<Float> arrayList) {
        this.zoomRatios = arrayList;
    }

    @NotNull
    public String toString() {
        boolean z6 = this.supportAutoFocus;
        boolean z7 = this.supportContinuousFocus;
        boolean z8 = this.supportAutoExposure;
        boolean z9 = this.supportZoom;
        float f7 = this.maxZoom;
        ArrayList<Float> arrayList = this.zoomRatios;
        boolean z10 = this.supportFlash;
        boolean z11 = this.supportVideoStabilization;
        boolean z12 = this.supportExposureCompensation;
        int i7 = this.minExposureCompensation;
        int i8 = this.maxExposureCompensation;
        float f8 = this.exposureCompensationStep;
        StringBuilder sbA = Q.a("DeviceCapabilityV3(supportAutoFocus=", ", supportContinuousFocus=", ", supportAutoExposure=", z6, z7);
        P.a(", supportZoom=", ", maxZoom=", sbA, z8, z9);
        sbA.append(f7);
        sbA.append(", zoomRatios=");
        sbA.append(arrayList);
        sbA.append(", supportFlash=");
        P.a(", supportVideoStabilization=", ", supportExposureCompensation=", sbA, z10, z11);
        C3353d.b(", minExposureCompensation=", ", maxExposureCompensation=", i7, z12, sbA);
        sbA.append(i8);
        sbA.append(", exposureCompensationStep=");
        sbA.append(f8);
        sbA.append(")");
        return sbA.toString();
    }
}
