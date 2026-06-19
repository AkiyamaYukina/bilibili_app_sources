package com.bilibili.ogv.operation.legacy;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/legacy/AdaptiveLayoutManager.class */
public class AdaptiveLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView.State f70272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70275d;

    public AdaptiveLayoutManager(Context context) {
        super(context, 0, false);
        this.f70273b = 5;
        this.f70274c = 6;
        this.f70275d = 0;
        setOrientation(0);
        this.f70275d = context.getResources().getDimensionPixelSize(2131165353);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(@NonNull View view, int i7, int i8) {
        int i9;
        int i10;
        int width = getWidth() - i7;
        RecyclerView.State state = this.f70272a;
        int itemCount = state != null ? state.getItemCount() : getItemCount();
        int i11 = this.f70273b;
        if (itemCount > i11) {
            int i12 = this.f70274c;
            while (true) {
                int i13 = this.f70275d;
                i10 = i13;
                if (i12 < i11) {
                    break;
                }
                i10 = (int) ((width / (i12 - 0.5f)) + 0.5f);
                if (i10 > i13) {
                    break;
                } else {
                    i12--;
                }
            }
            i9 = width - i10;
        } else {
            i9 = width - (width / itemCount);
        }
        super.measureChildWithMargins(view, i9 + i7, i8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        this.f70272a = state;
        super.onLayoutChildren(recycler, state);
    }
}
