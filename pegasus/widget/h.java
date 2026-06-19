package com.bilibili.pegasus.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/h.class */
@StabilityInferred(parameters = 0)
public final class h extends RecyclerView.OnScrollListener implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f79150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79151b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f79152c = true;

    public h(@NotNull Function0<Unit> function0) {
        this.f79150a = function0;
    }

    public final void a(RecyclerView recyclerView) {
        GridLayoutManager.SpanSizeLookup spanSizeLookup;
        if (recyclerView == null || true != recyclerView.isAttachedToWindow()) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        if (!this.f79152c || childCount <= 0) {
            return;
        }
        View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
        int i7 = this.f79151b << 1;
        if (i7 != 0) {
            int itemCount = adapter.getItemCount();
            int spanSize = 0;
            for (int i8 = childAdapterPosition + 1; i8 < itemCount; i8++) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                spanSize += (gridLayoutManager == null || (spanSizeLookup = gridLayoutManager.getSpanSizeLookup()) == null) ? 1 : spanSizeLookup.getSpanSize(i8);
                if (spanSize > i7) {
                    return;
                }
            }
        } else if (childAdapterPosition + 1 != adapter.getItemCount()) {
            return;
        }
        if (recyclerView.isComputingLayout()) {
            OneShotPreDrawListener.add(recyclerView, new g(recyclerView, this));
        } else {
            this.f79150a.invoke();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(@NotNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return;
        }
        a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(@NotNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
        if (i8 > 0) {
            a(recyclerView);
        }
    }
}
