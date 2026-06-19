package com.bilibili.search2.stardust.expose;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.discover.BiliMainSearchDiscoverFragment;
import com.bilibili.search2.main.MainSearchViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/g.class */
@StabilityInferred(parameters = 0)
public final class g implements RecyclerView.OnChildAttachStateChangeListener, View.OnAttachStateChangeListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RecyclerView f88752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public BiliMainSearchDiscoverFragment.b f88753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public l f88755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Rect f88756e = new Rect();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/g$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f88757a;

        public a(g gVar) {
            this.f88757a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            g gVar = this.f88757a;
            if (i7 != 0) {
                gVar.getClass();
                return;
            }
            l lVar = gVar.f88755d;
            if (lVar != null) {
                lVar.a("SCROLL_STATE_IDLE");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            super.onScrolled(recyclerView, i7, i8);
            this.f88757a.getClass();
        }
    }

    public g(@NotNull RecyclerView recyclerView) {
        this.f88752a = recyclerView;
        recyclerView.addOnScrollListener(new a(this));
        recyclerView.addOnChildAttachStateChangeListener(this);
        recyclerView.addOnLayoutChangeListener(this);
        recyclerView.addOnAttachStateChangeListener(this);
    }

    public final long a(@NotNull View view) {
        RecyclerView.Adapter adapter = this.f88752a.getAdapter();
        if (adapter != null && adapter.hasStableIds()) {
            long itemId = this.f88752a.getChildViewHolder(view).getItemId();
            if (itemId != -1) {
                return itemId;
            }
        }
        return view.hashCode();
    }

    @NotNull
    public final Rect b(@Nullable Rect rect) {
        int height;
        Window window;
        WindowManager.LayoutParams attributes;
        BiliMainSearchDiscoverFragment.b bVar = this.f88753b;
        if (bVar == null) {
            return this.f88756e;
        }
        BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment = bVar.f86417a;
        int i7 = ((Ws0.a) ((MainSearchViewModel) biliMainSearchDiscoverFragment.f86412o.getValue()).f86732e.getValue()).f27347b;
        FragmentActivity fragmentActivityP3 = biliMainSearchDiscoverFragment.p3();
        if ((((fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null || (attributes = window.getAttributes()) == null) ? 16 : attributes.softInputMode) & 48) == 48) {
            ViewGroup viewGroup = biliMainSearchDiscoverFragment.h;
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
                viewGroup2 = null;
            }
            height = viewGroup2.getHeight() - i7;
        } else {
            ViewGroup viewGroup3 = biliMainSearchDiscoverFragment.h;
            ViewGroup viewGroup4 = viewGroup3;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
                viewGroup4 = null;
            }
            height = viewGroup4.getHeight();
        }
        Rect rect2 = bVar.f86418b;
        ViewGroup viewGroup5 = biliMainSearchDiscoverFragment.h;
        if (viewGroup5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
            viewGroup5 = null;
        }
        rect2.set(0, 0, viewGroup5.getWidth(), height);
        return bVar.f86418b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(@NotNull View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(@NotNull View view) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Nullable View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        boolean clipToPadding = this.f88752a.getClipToPadding();
        RecyclerView recyclerView = this.f88752a;
        Rect rect = this.f88756e;
        int paddingBottom = 0;
        int paddingLeft = clipToPadding ? recyclerView.getPaddingLeft() : 0;
        int paddingTop = clipToPadding ? recyclerView.getPaddingTop() : 0;
        int width = this.f88752a.getWidth();
        int paddingRight = clipToPadding ? recyclerView.getPaddingRight() : 0;
        int height = this.f88752a.getHeight();
        if (clipToPadding) {
            paddingBottom = recyclerView.getPaddingBottom();
        }
        rect.set(paddingLeft, paddingTop, width - paddingRight, height - paddingBottom);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @CallSuper
    public final void onViewDetachedFromWindow(@NotNull View view) {
        if (this.f88754c) {
            this.f88755d = null;
        }
    }
}
