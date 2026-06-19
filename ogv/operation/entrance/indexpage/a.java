package com.bilibili.ogv.operation.entrance.indexpage;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/a.class */
public final class a extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70168a;

    public a(int i7) {
        this.f70168a = i7;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        int i8;
        if (i7 == 0) {
            i8 = 2;
        } else {
            i8 = 2;
            if (this.f70168a > Integer.MAX_VALUE) {
                i8 = 1;
            }
        }
        return i8;
    }
}
