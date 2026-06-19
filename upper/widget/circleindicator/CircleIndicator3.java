package com.bilibili.upper.widget.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.upper.widget.circleindicator.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/circleindicator/CircleIndicator3.class */
public class CircleIndicator3 extends com.bilibili.upper.widget.circleindicator.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewPager2 f114483k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f114484l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f114485m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/circleindicator/CircleIndicator3$a.class */
    public final class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CircleIndicator3 f114486a;

        public a(CircleIndicator3 circleIndicator3) {
            this.f114486a = circleIndicator3;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i7) {
            View childAt;
            CircleIndicator3 circleIndicator3 = this.f114486a;
            if (i7 == circleIndicator3.f114496j || circleIndicator3.f114483k.getAdapter() == null || circleIndicator3.f114483k.getAdapter().getItemCount() <= 0 || circleIndicator3.f114496j == i7) {
                return;
            }
            if (circleIndicator3.f114494g.isRunning()) {
                circleIndicator3.f114494g.end();
                circleIndicator3.f114494g.cancel();
            }
            if (circleIndicator3.f114493f.isRunning()) {
                circleIndicator3.f114493f.end();
                circleIndicator3.f114493f.cancel();
            }
            int i8 = circleIndicator3.f114496j;
            if (i8 >= 0 && (childAt = circleIndicator3.getChildAt(i8)) != null) {
                childAt.setBackgroundResource(circleIndicator3.f114492e);
                circleIndicator3.f114494g.setTarget(childAt);
                circleIndicator3.f114494g.start();
            }
            View childAt2 = circleIndicator3.getChildAt(i7);
            if (childAt2 != null) {
                childAt2.setBackgroundResource(circleIndicator3.f114491d);
                circleIndicator3.f114493f.setTarget(childAt2);
                circleIndicator3.f114493f.start();
            }
            circleIndicator3.f114496j = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/circleindicator/CircleIndicator3$b.class */
    public final class b extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CircleIndicator3 f114487a;

        public b(CircleIndicator3 circleIndicator3) {
            this.f114487a = circleIndicator3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            super.onChanged();
            CircleIndicator3 circleIndicator3 = this.f114487a;
            ViewPager2 viewPager2 = circleIndicator3.f114483k;
            if (viewPager2 == null) {
                return;
            }
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount == circleIndicator3.getChildCount()) {
                return;
            }
            if (circleIndicator3.f114496j < itemCount) {
                circleIndicator3.f114496j = circleIndicator3.f114483k.getCurrentItem();
            } else {
                circleIndicator3.f114496j = -1;
            }
            RecyclerView.Adapter adapter2 = circleIndicator3.f114483k.getAdapter();
            circleIndicator3.a(adapter2 == null ? 0 : adapter2.getItemCount(), circleIndicator3.f114483k.getCurrentItem());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i7, int i8) {
            super.onItemRangeChanged(i7, i8);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i7, int i8, @Nullable Object obj) {
            super.onItemRangeChanged(i7, i8, obj);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i7, int i8) {
            super.onItemRangeInserted(i7, i8);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i7, int i8, int i9) {
            super.onItemRangeMoved(i7, i8, i9);
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i7, int i8) {
            super.onItemRangeRemoved(i7, i8);
            onChanged();
        }
    }

    public CircleIndicator3(Context context) {
        super(context);
        this.f114484l = new a(this);
        this.f114485m = new b(this);
    }

    public CircleIndicator3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114484l = new a(this);
        this.f114485m = new b(this);
    }

    public RecyclerView.AdapterDataObserver getAdapterDataObserver() {
        return this.f114485m;
    }

    @Override // com.bilibili.upper.widget.circleindicator.a
    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(@Nullable a.InterfaceC1238a interfaceC1238a) {
        super.setIndicatorCreatedListener(interfaceC1238a);
    }

    public void setViewPager(@Nullable ViewPager2 viewPager2) {
        this.f114483k = viewPager2;
        if (viewPager2 == null || viewPager2.getAdapter() == null) {
            return;
        }
        this.f114496j = -1;
        RecyclerView.Adapter adapter = this.f114483k.getAdapter();
        a(adapter == null ? 0 : adapter.getItemCount(), this.f114483k.getCurrentItem());
        this.f114483k.unregisterOnPageChangeCallback(this.f114484l);
        this.f114483k.registerOnPageChangeCallback(this.f114484l);
        this.f114484l.onPageSelected(this.f114483k.getCurrentItem());
    }
}
