package com.bilibili.topix.center;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/r.class */
public final class r extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f112435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.bilibili.topix.model.TopicItem> f112436b;

    public r(s sVar, List<com.bilibili.topix.model.TopicItem> list) {
        this.f112435a = sVar;
        this.f112436b = list;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        Object orNull = CollectionsKt.getOrNull(this.f112435a.f112438b, i7);
        List<com.bilibili.topix.model.TopicItem> list = this.f112436b;
        return Intrinsics.areEqual(orNull, list != null ? (com.bilibili.topix.model.TopicItem) CollectionsKt.getOrNull(list, i8) : null);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        com.bilibili.topix.model.TopicItem topicItem = (com.bilibili.topix.model.TopicItem) CollectionsKt.getOrNull(this.f112435a.f112438b, i7);
        Long lValueOf = topicItem != null ? Long.valueOf(topicItem.d) : null;
        List<com.bilibili.topix.model.TopicItem> list = this.f112436b;
        Long lValueOf2 = null;
        if (list != null) {
            com.bilibili.topix.model.TopicItem topicItem2 = (com.bilibili.topix.model.TopicItem) CollectionsKt.getOrNull(list, i8);
            lValueOf2 = null;
            if (topicItem2 != null) {
                lValueOf2 = Long.valueOf(topicItem2.d);
            }
        }
        return Intrinsics.areEqual(lValueOf, lValueOf2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        List<com.bilibili.topix.model.TopicItem> list = this.f112436b;
        return list != null ? list.size() : 0;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return ((ArrayList) this.f112435a.f112438b).size();
    }
}
