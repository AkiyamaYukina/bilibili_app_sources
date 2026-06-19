package com.bilibili.studio.editor.moudle.caption.v1;

import Di0.C1600d;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/v1/BPointF.class */
@Keep
public class BPointF implements Serializable, Cloneable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f106027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f106028y;

    public BPointF() {
    }

    public BPointF(float f7, float f8) {
        this.f106027x = f7;
        this.f106028y = f8;
    }

    public BPointF(BPointF bPointF) {
        this.f106027x = bPointF.f106027x;
        this.f106028y = bPointF.f106028y;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BPointF m9881clone() {
        try {
            return (BPointF) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BPointF)) {
            return false;
        }
        BPointF bPointF = (BPointF) obj;
        return this.f106027x == bPointF.f106027x && this.f106028y == bPointF.f106028y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BPointF{x=");
        sb.append(this.f106027x);
        sb.append(", y=");
        return C1600d.a(sb, this.f106028y, '}');
    }
}
