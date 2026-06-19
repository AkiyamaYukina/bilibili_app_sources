package com.bilibili.pegasus.holders.bannerv8;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.app.comm.list.widget.banneradapter.VideoBannerHolder;
import com.bilibili.app.comm.list.widget.swiper.SwiperExtKt;
import java.util.Iterator;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/r.class */
public final class r extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerV8Holder f77819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.BooleanRef f77820b;

    public r(BannerV8Holder bannerV8Holder, Ref.BooleanRef booleanRef) {
        this.f77819a = bannerV8Holder;
        this.f77820b = booleanRef;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i7) {
        RecyclerView recyclerView;
        super.onPageScrollStateChanged(i7);
        BannerV8Holder bannerV8Holder = this.f77819a;
        if (i7 == 0) {
            bannerV8Holder.C0(2000L);
            bannerV8Holder.B0();
            V8Banner v8Banner = bannerV8Holder.f77682f;
            if (v8Banner != null && (recyclerView = v8Banner.getRecyclerView()) != null) {
                int currentItem = v8Banner.getViewPager2().getCurrentItem();
                int childCount = recyclerView.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    VideoBannerHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i8));
                    if (childViewHolder instanceof VideoBannerHolder) {
                        VideoBannerHolder videoBannerHolder = childViewHolder;
                        if (videoBannerHolder.getBindingAdapterPosition() != currentItem) {
                            videoBannerHolder.releaseCurrentPlayer();
                        }
                    }
                }
            }
        }
        RecyclerView recyclerView2 = bannerV8Holder.f77682f.getRecyclerView();
        if (recyclerView2 != null) {
            Iterator it = ViewGroupKt.getChildren(recyclerView2).iterator();
            while (it.hasNext()) {
                VideoBannerHolder childViewHolder2 = recyclerView2.getChildViewHolder((View) it.next());
                VideoBannerHolder videoBannerHolder2 = childViewHolder2 instanceof VideoBannerHolder ? childViewHolder2 : null;
                if (videoBannerHolder2 != null) {
                    videoBannerHolder2.onScrollStateChanged(i7);
                }
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        BannerV8Holder bannerV8Holder = this.f77819a;
        int realPosition = SwiperExtKt.getRealPosition(bannerV8Holder.f77682f, i7);
        bannerV8Holder.H0(realPosition, true);
        f fVar = bannerV8Holder.f77684i;
        if (fVar != null) {
            fVar.dispatchItemSelected(i7);
        }
        gp0.c cVar = (gp0.c) bannerV8Holder.getBindData();
        if (cVar != null) {
            cVar.f120539E = realPosition;
        }
        Ref.BooleanRef booleanRef = this.f77820b;
        if (!booleanRef.element) {
            System.currentTimeMillis();
            bannerV8Holder.getClass();
            bannerV8Holder.getClass();
        }
        booleanRef.element = false;
    }
}
