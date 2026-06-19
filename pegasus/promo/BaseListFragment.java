package com.bilibili.pegasus.promo;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.widget.l;
import com.bilibili.lib.ui.BaseFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BaseListFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BaseListFragment extends BaseFragment {
    public static final KProperty<Object>[] h = {new MutablePropertyReference1Impl(BaseListFragment.class, "mRecyclerView", "getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78457c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78456b = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78458d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f78459e = LazyKt.lazy(new Vy0.b(this, 3));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f78460f = new com.bilibili.app.comm.list.common.widget.a(jf());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f78461g = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BaseListFragment$a.class */
    public final class a extends RecyclerView.OnScrollListener implements RecyclerView.OnChildAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BasePromoFragment f78462a;

        public a(BasePromoFragment basePromoFragment) {
            this.f78462a = basePromoFragment;
        }

        public final void a(RecyclerView recyclerView) {
            if (recyclerView == null || true != recyclerView.isAttachedToWindow() || recyclerView.getChildCount() <= 0) {
                return;
            }
            BasePromoFragment basePromoFragment = this.f78462a;
            if (basePromoFragment.hasNextPage() && basePromoFragment.canLoadNextPage()) {
                View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (recyclerView.getChildAdapterPosition(childAt) >= (adapter.getItemCount() - 1) - (basePromoFragment.f78461g ? basePromoFragment.f78456b : 0)) {
                    basePromoFragment.onLoadNextPage();
                }
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
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
            this.f78462a.kf(recyclerView, i7);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(@NotNull RecyclerView recyclerView, int i7, int i8) {
            if (i7 == 0 && i8 == 0) {
                this.f78462a.kf(recyclerView, 0);
            }
            if (i8 > 0) {
                a(recyclerView);
            }
        }
    }

    public boolean canLoadNextPage() {
        return !this.f78457c;
    }

    @Nullable
    public final RecyclerView getMRecyclerView() {
        com.bilibili.app.comm.list.common.widget.a aVar = this.f78460f;
        KProperty<Object> kProperty = h[0];
        return (RecyclerView) aVar.b;
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    @Nullable
    public final View getViewRecyclable() {
        return getMRecyclerView();
    }

    public boolean hasNextPage() {
        return this.f78458d;
    }

    @NotNull
    public final l jf() {
        return (l) this.f78459e.getValue();
    }

    public void kf(@NotNull RecyclerView recyclerView, int i7) {
    }

    public abstract void onLoadNextPage();
}
