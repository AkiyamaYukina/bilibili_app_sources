package com.bilibili.playset;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* JADX INFO: renamed from: com.bilibili.playset.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/a.class */
public final /* synthetic */ class C5894a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) (((RecyclerView.ViewHolder) obj).itemView.getY() - ((RecyclerView.ViewHolder) obj2).itemView.getY());
    }
}
