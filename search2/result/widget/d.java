package com.bilibili.search2.result.widget;

import E80.g0;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.base.SearchFooterHolder;
import com.bilibili.search2.result.base.s;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.C8397q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/d.class */
@StabilityInferred(parameters = 0)
public final class d extends RecyclerView.OnScrollListener implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final g0 f88601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88602b;

    public d(@Nullable g0 g0Var) {
        this.f88601a = g0Var;
    }

    public final void a(@NotNull SearchResultAllFragment searchResultAllFragment, @NotNull RecyclerView recyclerView) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment), (CoroutineContext) null, (CoroutineStart) null, new LoadMoreListener$bind$1(recyclerView, this, null), 3, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(@NotNull View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null && recyclerView.isAttachedToWindow() && recyclerView.getChildCount() > 0) {
            try {
                Object childViewHolder = recyclerView.getChildViewHolder(view);
                if ((childViewHolder instanceof SearchFooterHolder) && this.f88602b) {
                    this.f88602b = false;
                    if (((s) ((SearchFooterHolder) childViewHolder).getData()).f87607a == 0) {
                        if (recyclerView.isComputingLayout()) {
                            OneShotPreDrawListener.add(recyclerView, new c(recyclerView, this));
                            return;
                        }
                        g0 g0Var = this.f88601a;
                        if (g0Var != null) {
                            g0Var.invoke(Boolean.FALSE);
                        }
                    }
                }
            } catch (Exception e7) {
                C8397q.a("reachLoadMore -> error = ", "LoadMoreListener", e7);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(@NotNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
        this.f88602b = false;
    }
}
