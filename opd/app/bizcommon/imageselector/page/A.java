package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/A.class */
public final class A extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f73745a;

    public A(FragmentActivity fragmentActivity) {
        this.f73745a = fragmentActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        FragmentActivity fragmentActivity = this.f73745a;
        rect.right = fragmentActivity == null ? 0 : (int) ((8.0f * fragmentActivity.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
