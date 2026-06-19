package com.bilibili.mobile.model;

import android.graphics.Rect;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLRect.class */
public class BLRect {
    private int bottom;
    private int left;
    private int right;
    private int top;

    public BLRect(int i7, int i8, int i9, int i10) {
        this.left = i7;
        this.top = i8;
        this.right = i9;
        this.bottom = i10;
    }

    public Rect convertToRect() {
        Rect rect = new Rect();
        rect.left = this.left;
        rect.top = this.top;
        rect.right = this.right;
        rect.bottom = this.bottom;
        return rect;
    }
}
