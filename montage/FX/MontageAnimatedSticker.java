package com.bilibili.montage.FX;

import android.graphics.PointF;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageAnimatedSticker.class */
public class MontageAnimatedSticker extends MontageFx {
    private native List<PointF> nativeGetBoundingRectangleVertices(long j7);

    private native MontageControlPointPair nativeGetControlPoint(long j7, String str);

    private native float nativeGetZValue(long j7);

    private native boolean nativeSetControlPoint(long j7, String str, MontageControlPointPair montageControlPointPair);

    private native void nativeSetCurrentKeyFrameTime(long j7, long j8);

    private native void nativeSetZValue(long j7, float f7);

    public String getAnimatedStickerPackageId() {
        return getFxName();
    }

    public List<PointF> getBoundingRectangleVertices() {
        return nativeGetBoundingRectangleVertices(this.mInternalObject);
    }

    public MontageControlPointPair getControlPoint(String str) {
        return nativeGetControlPoint(this.mInternalObject, str);
    }

    public float getOpacity() {
        return (float) getFloatVal("Opacity");
    }

    public float getRotationZ() {
        return (float) getFloatVal("Rotation");
    }

    public float getScale() {
        return (float) getFloatVal("Scale X");
    }

    public PointF getTranslation() {
        return new PointF((float) getFloatVal("Trans X"), (float) getFloatVal("Trans Y"));
    }

    public float getZValue() {
        return nativeGetZValue(this.mInternalObject);
    }

    public void rotateAnimatedSticker(float f7) {
        float f8;
        float f9;
        float f10;
        float f11;
        List<PointF> boundingRectangleVertices = getBoundingRectangleVertices();
        PointF pointF = boundingRectangleVertices.get(0);
        float f12 = pointF.x;
        float f13 = pointF.y;
        int i7 = 1;
        float f14 = f12;
        float f15 = f12;
        float f16 = f13;
        while (i7 < 4) {
            PointF pointF2 = boundingRectangleVertices.get(i7);
            float f17 = pointF2.x;
            if (f17 < f14) {
                f8 = f17;
                f9 = f15;
            } else {
                f8 = f14;
                f9 = f15;
                if (f17 > f15) {
                    f9 = f17;
                    f8 = f14;
                }
            }
            float f18 = pointF2.y;
            if (f18 < f16) {
                f11 = f18;
                f10 = f13;
            } else {
                f10 = f13;
                f11 = f16;
                if (f18 > f13) {
                    f10 = f18;
                    f11 = f16;
                }
            }
            i7++;
            f13 = f10;
            f16 = f11;
            f14 = f8;
            f15 = f9;
        }
        rotateAnimatedSticker(f7, new PointF((f14 + f15) / 2.0f, (f13 + f16) / 2.0f));
    }

    public void rotateAnimatedSticker(float f7, PointF pointF) {
        setRotationZ(getRotationZ() + f7);
    }

    public void scaleAnimatedSticker(float f7, PointF pointF) {
        setScale(getScale() * f7);
    }

    public boolean setControlPoint(String str, MontageControlPointPair montageControlPointPair) {
        return nativeSetControlPoint(this.mInternalObject, str, montageControlPointPair);
    }

    public void setCurrentKeyFrameTime(long j7) {
        nativeSetCurrentKeyFrameTime(this.mInternalObject, j7);
    }

    public void setOpacity(float f7) {
        setFloatVal("Opacity", f7);
    }

    public void setRotationZ(float f7) {
        setFloatVal("Rotation", f7);
    }

    public void setScale(float f7) {
        double d7 = f7;
        setFloatVal("Scale X", d7);
        setFloatVal("Scale Y", d7);
    }

    public void setTranslation(PointF pointF) {
        setFloatVal("Trans X", pointF.x);
        setFloatVal("Trans Y", pointF.y);
    }

    public void setZValue(float f7) {
        nativeSetZValue(this.mInternalObject, f7);
    }

    public void translateAnimatedSticker(PointF pointF) {
        setFloatVal("Trans X", getFloatVal("Trans X") + ((double) pointF.x));
        setFloatVal("Trans Y", getFloatVal("Trans Y") + ((double) pointF.y));
    }
}
