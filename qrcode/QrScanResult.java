package com.bilibili.qrcode;

import android.graphics.Point;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/qrcode/QrScanResult.class */
public final class QrScanResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Point[] f85864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f85865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f85866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85867d;

    public QrScanResult(@Nullable Point[] pointArr, @Nullable String str, double d7, int i7) {
        this.f85864a = pointArr;
        this.f85865b = str;
        this.f85866c = d7;
        this.f85867d = i7;
    }

    public /* synthetic */ QrScanResult(Point[] pointArr, String str, double d7, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : pointArr, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? 1.0d : d7, i7);
    }

    @Nullable
    public final Point[] getPoints() {
        return this.f85864a;
    }

    @Nullable
    public final String getText() {
        return this.f85865b;
    }

    public final int getType() {
        return this.f85867d;
    }

    public final double getZoom() {
        return this.f85866c;
    }

    public final void setPoints(@Nullable Point[] pointArr) {
        this.f85864a = pointArr;
    }

    public final void setText(@Nullable String str) {
        this.f85865b = str;
    }

    public final void setType(int i7) {
        this.f85867d = i7;
    }

    public final void setZoom(double d7) {
        this.f85866c = d7;
    }
}
