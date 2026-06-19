package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistRecyclerView.class */
@StabilityInferred(parameters = 0)
public final class PlaylistRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public PlaylistRepository.b f96006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f96007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f96008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BottomSheetBehavior<View> f96009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96010e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistRecyclerView$a.class */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistRecyclerView$b.class */
    public static final class b extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f96011a = true;

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            if (this.f96011a) {
                if (i7 == 1 || i7 == 2) {
                    BiliImageLoader.INSTANCE.pause();
                } else {
                    BiliImageLoader.INSTANCE.resume();
                }
            }
        }
    }

    public PlaylistRecyclerView(@NotNull Context context) {
        super(context);
        this.f96010e = true;
    }

    public PlaylistRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96010e = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        PlaylistRepository.b bVar;
        BottomSheetBehavior<View> bottomSheetBehavior;
        BottomSheetBehavior<View> bottomSheetBehavior2;
        int actionMasked = motionEvent.getActionMasked();
        a aVar = this.f96007b;
        if (aVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (!this.f96008c) {
            this.f96008c = true;
            aVar.a();
        }
        if (this.f96010e && (bVar = this.f96006a) != null) {
            if ((actionMasked == 0 || actionMasked == 1) && (bottomSheetBehavior = this.f96009d) != null) {
                bottomSheetBehavior.setDraggable(true);
            }
            boolean zCanScrollVertically = canScrollVertically(-1);
            boolean z6 = bVar.f95130b;
            if (!zCanScrollVertically && z6 && (bottomSheetBehavior2 = this.f96009d) != null) {
                bottomSheetBehavior2.setDraggable(false);
            }
            if (bVar.f95129a) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (actionMasked == 2 && !canScrollVertically(-1) && z6) {
                aVar.b();
            }
            if (actionMasked == 2 && !canScrollVertically(1) && bVar.f95131c) {
                aVar.c();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i7, int i8) {
        PlaylistRepository.b bVar;
        RecyclerView.Adapter adapter;
        int childCount;
        super.onScrolled(i7, i8);
        a aVar = this.f96007b;
        if (aVar == null || (bVar = this.f96006a) == null || (adapter = getAdapter()) == null || i8 == 0 || bVar.f95129a || (childCount = getChildCount()) <= 0) {
            return;
        }
        if (bVar.f95131c && i8 > 0) {
            if (getChildAdapterPosition(getChildAt(childCount - 1)) >= adapter.getItemCount() - 3) {
                aVar.c();
            }
        } else {
            if (!bVar.f95130b || i8 >= 0 || ((LinearLayoutManager) getLayoutManager()).findFirstCompletelyVisibleItemPosition() >= 2) {
                return;
            }
            aVar.b();
        }
    }

    public final void setLoadEventCallback(@NotNull a aVar) {
        this.f96007b = aVar;
        addOnScrollListener(new b());
    }
}
