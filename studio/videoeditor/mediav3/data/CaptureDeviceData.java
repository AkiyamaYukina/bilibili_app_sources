package com.bilibili.studio.videoeditor.mediav3.data;

import Vn.A;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.media3.exoplayer.C4690e;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/mediav3/data/CaptureDeviceData.class */
@Keep
public final class CaptureDeviceData {
    private int backDeviceIndex;
    private int deviceCount;
    private int deviceIndex;
    private int grade;

    @Nullable
    private Map<String, ? extends Object> map4SharedCamera;

    public CaptureDeviceData() {
        this(0, 0, 0, 0, null, 31, null);
    }

    public CaptureDeviceData(int i7, int i8, int i9, int i10, @Nullable Map<String, ? extends Object> map) {
        this.deviceIndex = i7;
        this.backDeviceIndex = i8;
        this.deviceCount = i9;
        this.grade = i10;
        this.map4SharedCamera = map;
    }

    public /* synthetic */ CaptureDeviceData(int i7, int i8, int i9, int i10, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i7, (i11 & 2) != 0 ? -1 : i8, (i11 & 4) != 0 ? 0 : i9, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureDeviceData copy$default(CaptureDeviceData captureDeviceData, int i7, int i8, int i9, int i10, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = captureDeviceData.deviceIndex;
        }
        if ((i11 & 2) != 0) {
            i8 = captureDeviceData.backDeviceIndex;
        }
        if ((i11 & 4) != 0) {
            i9 = captureDeviceData.deviceCount;
        }
        if ((i11 & 8) != 0) {
            i10 = captureDeviceData.grade;
        }
        if ((i11 & 16) != 0) {
            map = captureDeviceData.map4SharedCamera;
        }
        return captureDeviceData.copy(i7, i8, i9, i10, map);
    }

    public final int component1() {
        return this.deviceIndex;
    }

    public final int component2() {
        return this.backDeviceIndex;
    }

    public final int component3() {
        return this.deviceCount;
    }

    public final int component4() {
        return this.grade;
    }

    @Nullable
    public final Map<String, Object> component5() {
        return this.map4SharedCamera;
    }

    @NotNull
    public final CaptureDeviceData copy(int i7, int i8, int i9, int i10, @Nullable Map<String, ? extends Object> map) {
        return new CaptureDeviceData(i7, i8, i9, i10, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureDeviceData)) {
            return false;
        }
        CaptureDeviceData captureDeviceData = (CaptureDeviceData) obj;
        return this.deviceIndex == captureDeviceData.deviceIndex && this.backDeviceIndex == captureDeviceData.backDeviceIndex && this.deviceCount == captureDeviceData.deviceCount && this.grade == captureDeviceData.grade && Intrinsics.areEqual(this.map4SharedCamera, captureDeviceData.map4SharedCamera);
    }

    public final int getBackDeviceIndex() {
        return this.backDeviceIndex;
    }

    public final int getDeviceCount() {
        return this.deviceCount;
    }

    public final int getDeviceIndex() {
        return this.deviceIndex;
    }

    public final int getGrade() {
        return this.grade;
    }

    @Nullable
    public final Map<String, Object> getMap4SharedCamera() {
        return this.map4SharedCamera;
    }

    public int hashCode() {
        int iA = I.a(this.grade, I.a(this.deviceCount, I.a(this.backDeviceIndex, Integer.hashCode(this.deviceIndex) * 31, 31), 31), 31);
        Map<String, ? extends Object> map = this.map4SharedCamera;
        return iA + (map == null ? 0 : map.hashCode());
    }

    public final void setBackDeviceIndex(int i7) {
        this.backDeviceIndex = i7;
    }

    public final void setDeviceCount(int i7) {
        this.deviceCount = i7;
    }

    public final void setDeviceIndex(int i7) {
        this.deviceIndex = i7;
    }

    public final void setGrade(int i7) {
        this.grade = i7;
    }

    public final void setMap4SharedCamera(@Nullable Map<String, ? extends Object> map) {
        this.map4SharedCamera = map;
    }

    @NotNull
    public String toString() {
        int i7 = this.deviceIndex;
        int i8 = this.backDeviceIndex;
        int i9 = this.deviceCount;
        int i10 = this.grade;
        Map<String, ? extends Object> map = this.map4SharedCamera;
        StringBuilder sbB = A.b(i7, i8, "CaptureDeviceData(deviceIndex=", ", backDeviceIndex=", ", deviceCount=");
        C4690e.a(i9, i10, ", grade=", ", map4SharedCamera=", sbB);
        return C8711a.a(sbB, map, ")");
    }
}
