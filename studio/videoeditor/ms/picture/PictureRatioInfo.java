package com.bilibili.studio.videoeditor.ms.picture;

import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/picture/PictureRatioInfo.class */
public class PictureRatioInfo implements Serializable, Cloneable {
    public int height;
    public int heightStand;
    public float ratio;
    public int width;
    public int widthStand;

    public PictureRatioInfo() {
    }

    public PictureRatioInfo(float f7, int i7, int i8, int i9, int i10) {
        this.ratio = f7;
        this.width = i7;
        this.height = i8;
        this.widthStand = i9;
        this.heightStand = i10;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public PictureRatioInfo m10479clone() {
        return new PictureRatioInfo(this.ratio, this.width, this.height, this.widthStand, this.heightStand);
    }
}
