package com.bilibili.search2.result.all;

import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.search2.api.BaseSearchItem;
import dt0.AbstractC6839b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bilibili.search2.result.all.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/a.class */
public final class C6047a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<BaseSearchItem> f87273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC6048b<AbstractC6839b<Object>, BaseSearchItem> f87274b;

    public C6047a(AbstractC6048b abstractC6048b, List list) {
        this.f87273a = list;
        this.f87274b = abstractC6048b;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        return Intrinsics.areEqual(this.f87273a.get(i7), this.f87274b.f87275a.get(i8));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        return this.f87273a.get(i7).getContentId() == ((BaseSearchItem) this.f87274b.f87275a.get(i8)).getContentId();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f87274b.f87275a.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f87273a.size();
    }
}
