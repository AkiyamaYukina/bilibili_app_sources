package com.bilibili.studio.videoeditor.editor.editdata;

import Di0.C1600d;
import android.graphics.Point;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/PointF.class */
@Keep
public class PointF implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f109462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f109463y;

    public PointF() {
    }

    public PointF(float f7, float f8) {
        this.f109462x = f7;
        this.f109463y = f8;
    }

    public PointF(Point point) {
        this.f109462x = point.x;
        this.f109463y = point.y;
    }

    @NonNull
    public PointF copy() {
        return new PointF(getX(), getY());
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PointF pointF = (PointF) obj;
        if (Float.compare(pointF.f109462x, this.f109462x) != 0 || Float.compare(pointF.f109463y, this.f109463y) != 0) {
            z6 = false;
        }
        return z6;
    }

    public float getX() {
        return this.f109462x;
    }

    public float getY() {
        return this.f109463y;
    }

    public int hashCode() {
        return Arrays.hashCode(new float[]{this.f109462x, this.f109463y});
    }

    public final void negate() {
        this.f109462x = -this.f109462x;
        this.f109463y = -this.f109463y;
    }

    public final void offset(float f7, float f8) {
        this.f109462x += f7;
        this.f109463y += f8;
    }

    public final void set(float f7, float f8) {
        this.f109462x = f7;
        this.f109463y = f8;
    }

    public final void set(android.graphics.PointF pointF) {
        this.f109462x = pointF.x;
        this.f109463y = pointF.y;
    }

    public void setX(float f7) {
        this.f109462x = f7;
    }

    public void setY(float f7) {
        this.f109463y = f7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PointF{x=");
        sb.append(this.f109462x);
        sb.append(", y=");
        return C1600d.a(sb, this.f109463y, '}');
    }
}
