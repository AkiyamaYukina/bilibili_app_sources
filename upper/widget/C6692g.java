package com.bilibili.upper.widget;

import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.DiffUtil;

/* JADX INFO: renamed from: com.bilibili.upper.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/g.class */
public final class C6692g extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseBooleanArray f114504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseBooleanArray f114505b;

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        boolean z6 = false;
        if (this.f114504a.get(i7, false) == this.f114505b.get(i8, false)) {
            z6 = true;
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        return i7 == i8;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f114505b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f114504a.size();
    }
}
