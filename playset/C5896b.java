package com.bilibili.playset;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* JADX INFO: renamed from: com.bilibili.playset.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/b.class */
public final /* synthetic */ class C5896b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((RecyclerView.ViewHolder) obj).getAdapterPosition() - ((RecyclerView.ViewHolder) obj2).getAdapterPosition();
    }
}
