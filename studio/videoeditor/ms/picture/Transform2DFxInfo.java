package com.bilibili.studio.videoeditor.ms.picture;

import Di0.C1600d;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/picture/Transform2DFxInfo.class */
@Keep
public class Transform2DFxInfo implements Serializable, Cloneable {
    public String bClipId;
    public double rotateAngle;
    public double transX;
    public double transY;
    public double scaleValueX = 1.0d;
    public double scaleValueY = 1.0d;
    public float opacity = 1.0f;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transform2DFxInfo m10481clone() {
        try {
            return (Transform2DFxInfo) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transform2DFxInfo)) {
            return false;
        }
        Transform2DFxInfo transform2DFxInfo = (Transform2DFxInfo) obj;
        if (Double.compare(transform2DFxInfo.scaleValueX, this.scaleValueX) != 0 || Double.compare(transform2DFxInfo.scaleValueY, this.scaleValueY) != 0 || Double.compare(transform2DFxInfo.rotateAngle, this.rotateAngle) != 0 || Double.compare(transform2DFxInfo.transX, this.transX) != 0 || Double.compare(transform2DFxInfo.transY, this.transY) != 0 || !Objects.equals(this.bClipId, transform2DFxInfo.bClipId) || Double.compare(transform2DFxInfo.opacity, this.opacity) != 0) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(serialize = false)
    public boolean isDefaultTransform2D() {
        return Double.compare(this.scaleValueX, 1.0d) == 0 && Double.compare(this.scaleValueY, 1.0d) == 0 && Double.compare(this.rotateAngle, 0.0d) == 0 && Double.compare(this.transX, 0.0d) == 0 && Double.compare(this.transY, 0.0d) == 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Transform2DFxInfo{bClipId='");
        sb.append(this.bClipId);
        sb.append("', scaleValueX=");
        sb.append(this.scaleValueX);
        sb.append(", scaleValueY=");
        sb.append(this.scaleValueY);
        sb.append(", rotateAngle=");
        sb.append(this.rotateAngle);
        sb.append(", transX=");
        sb.append(this.transX);
        sb.append(", transY=");
        sb.append(this.transY);
        sb.append(", opacity=");
        return C1600d.a(sb, this.opacity, '}');
    }
}
