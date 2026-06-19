package com.bilibili.studio.videoeditor.editor.editdata;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/editdata/Size.class */
@Keep
public final class Size {
    private int mHeight;
    private int mWidth;

    public Size() {
    }

    public Size(int i7, int i8) {
        this.mWidth = i7;
        this.mHeight = i8;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Size m10451clone() {
        return new Size(this.mWidth, this.mHeight);
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.mWidth != size.mWidth || this.mHeight != size.mHeight) {
            z6 = false;
        }
        return z6;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void rotate() {
        int i7 = this.mWidth;
        this.mWidth = this.mHeight;
        this.mHeight = i7;
    }

    public void setHeight(int i7) {
        this.mHeight = i7;
    }

    public void setWidth(int i7) {
        this.mWidth = i7;
    }

    public String toString() {
        return " width: " + this.mWidth + " height: " + this.mHeight;
    }

    public void update(int i7, int i8) {
        this.mWidth = i7;
        this.mHeight = i8;
    }
}
