package com.bilibili.topix.center;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/f.class */
public final class f extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C6667e f112418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<n> f112419b;

    public f(C6667e c6667e, List<n> list) {
        this.f112418a = c6667e;
        this.f112419b = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        Object orNull = CollectionsKt.getOrNull(this.f112418a.f112417b, i7);
        List<n> list = this.f112419b;
        return Intrinsics.areEqual(orNull, list != null ? (n) CollectionsKt.getOrNull(list, i8) : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        return i7 == i8;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final Object getChangePayload(int i7, int i8) {
        n nVar;
        List<n> list = this.f112419b;
        return ((list == null || (nVar = (n) CollectionsKt.getOrNull(list, i8)) == null) ? null : nVar.getType()) == TopixCenterItemType.TOPIC_IP ? Integer.valueOf(i8) : super.getChangePayload(i7, i8);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        List<n> list = this.f112419b;
        return list != null ? list.size() : 0;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return ((ArrayList) this.f112418a.f112417b).size();
    }
}
