package com.bilibili.search2.result.base;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/f.class */
public final class f extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseSearchResultFragment<BaseSearchResultViewModel> f87544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87546c;

    public f(BaseSearchResultFragment<BaseSearchResultViewModel> baseSearchResultFragment, int i7, int i8) {
        this.f87544a = baseSearchResultFragment;
        this.f87545b = i7;
        this.f87546c = i8;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        int i8;
        w<?> wVarMf = this.f87544a.mf();
        int i9 = this.f87545b;
        int i10 = this.f87546c;
        if (i9 <= i10) {
            wVarMf.getClass();
            i8 = i9;
        } else {
            i8 = SetsKt.plus(SetsKt.setOf(1091444754), wVarMf.U()).contains(Integer.valueOf(wVarMf.getItemViewType(i7))) ? i9 : i10;
        }
        return i8;
    }
}
