package com.bilibili.studio.videoeditor.capturev3.bean;

import android.graphics.Point;
import androidx.annotation.Keep;
import androidx.compose.animation.C3353d;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/bean/CaptureStoreViewData.class */
@Keep
public final class CaptureStoreViewData {

    @NotNull
    private String ftPath;
    private boolean ftPipPreviewFront;
    private int ftPosition;

    @NotNull
    private Point startPoint;

    @NotNull
    private Point translationPoint;

    public CaptureStoreViewData(@NotNull Point point, @NotNull Point point2, boolean z6, int i7, @NotNull String str) {
        this.startPoint = point;
        this.translationPoint = point2;
        this.ftPipPreviewFront = z6;
        this.ftPosition = i7;
        this.ftPath = str;
    }

    public static /* synthetic */ CaptureStoreViewData copy$default(CaptureStoreViewData captureStoreViewData, Point point, Point point2, boolean z6, int i7, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            point = captureStoreViewData.startPoint;
        }
        if ((i8 & 2) != 0) {
            point2 = captureStoreViewData.translationPoint;
        }
        if ((i8 & 4) != 0) {
            z6 = captureStoreViewData.ftPipPreviewFront;
        }
        if ((i8 & 8) != 0) {
            i7 = captureStoreViewData.ftPosition;
        }
        if ((i8 & 16) != 0) {
            str = captureStoreViewData.ftPath;
        }
        return captureStoreViewData.copy(point, point2, z6, i7, str);
    }

    @NotNull
    public final Point component1() {
        return this.startPoint;
    }

    @NotNull
    public final Point component2() {
        return this.translationPoint;
    }

    public final boolean component3() {
        return this.ftPipPreviewFront;
    }

    public final int component4() {
        return this.ftPosition;
    }

    @NotNull
    public final String component5() {
        return this.ftPath;
    }

    @NotNull
    public final CaptureStoreViewData copy(@NotNull Point point, @NotNull Point point2, boolean z6, int i7, @NotNull String str) {
        return new CaptureStoreViewData(point, point2, z6, i7, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureStoreViewData)) {
            return false;
        }
        CaptureStoreViewData captureStoreViewData = (CaptureStoreViewData) obj;
        return Intrinsics.areEqual(this.startPoint, captureStoreViewData.startPoint) && Intrinsics.areEqual(this.translationPoint, captureStoreViewData.translationPoint) && this.ftPipPreviewFront == captureStoreViewData.ftPipPreviewFront && this.ftPosition == captureStoreViewData.ftPosition && Intrinsics.areEqual(this.ftPath, captureStoreViewData.ftPath);
    }

    @NotNull
    public final String getFtPath() {
        return this.ftPath;
    }

    public final boolean getFtPipPreviewFront() {
        return this.ftPipPreviewFront;
    }

    public final int getFtPosition() {
        return this.ftPosition;
    }

    @NotNull
    public final Point getStartPoint() {
        return this.startPoint;
    }

    @NotNull
    public final Point getTranslationPoint() {
        return this.translationPoint;
    }

    public int hashCode() {
        return this.ftPath.hashCode() + I.a(this.ftPosition, z.a((this.translationPoint.hashCode() + (this.startPoint.hashCode() * 31)) * 31, 31, this.ftPipPreviewFront), 31);
    }

    public final void setFtPath(@NotNull String str) {
        this.ftPath = str;
    }

    public final void setFtPipPreviewFront(boolean z6) {
        this.ftPipPreviewFront = z6;
    }

    public final void setFtPosition(int i7) {
        this.ftPosition = i7;
    }

    public final void setStartPoint(@NotNull Point point) {
        this.startPoint = point;
    }

    public final void setTranslationPoint(@NotNull Point point) {
        this.translationPoint = point;
    }

    @NotNull
    public String toString() {
        Point point = this.startPoint;
        Point point2 = this.translationPoint;
        boolean z6 = this.ftPipPreviewFront;
        int i7 = this.ftPosition;
        String str = this.ftPath;
        StringBuilder sb = new StringBuilder("CaptureStoreViewData(startPoint=");
        sb.append(point);
        sb.append(", translationPoint=");
        sb.append(point2);
        sb.append(", ftPipPreviewFront=");
        C3353d.b(", ftPosition=", ", ftPath=", i7, z6, sb);
        return C8770a.a(sb, str, ")");
    }
}
