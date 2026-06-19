package com.bilibili.studio.videoeditor.annual.bean.engine;

import androidx.annotation.Keep;
import androidx.collection.C3269h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/engine/BVideoSize.class */
@Keep
public class BVideoSize {
    private int height;
    private int width;

    public BVideoSize() {
    }

    public BVideoSize(int i7, int i8) {
        this.width = i7;
        this.height = i8;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i7) {
        this.height = i7;
    }

    public void setWidth(int i7) {
        this.width = i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BVideoSize{width=");
        sb.append(this.width);
        sb.append(", height=");
        return C3269h.a(sb, this.height, '}');
    }
}
