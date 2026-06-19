package com.bilibili.studio.videoeditor.ms.picture;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/picture/PictureRatioBean.class */
public class PictureRatioBean implements Serializable, Cloneable {
    public int imgRes;
    public boolean isSelected;

    @Nullable
    public String name;
    public float ratio;

    public PictureRatioBean(@Nullable String str, boolean z6, float f7, int i7) {
        this.name = str;
        this.isSelected = z6;
        this.ratio = f7;
        this.imgRes = i7;
    }

    @Nullable
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public PictureRatioBean m10478clone() {
        try {
            return (PictureRatioBean) super.clone();
        } catch (CloneNotSupportedException e7) {
            return null;
        }
    }
}
