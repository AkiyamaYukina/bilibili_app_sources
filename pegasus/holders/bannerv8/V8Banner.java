package com.bilibili.pegasus.holders.bannerv8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bilibili.app.comm.list.widget.IBannerMoveClick;
import com.bilibili.app.comm.list.widget.swiper.SwiperBanner;
import com.bilibili.app.comm.list.widget.swiper.SwiperBannerAdapter;
import com.tencent.bugly.crashreport.CrashReport;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/V8Banner.class */
@StabilityInferred(parameters = 0)
public final class V8Banner extends SwiperBanner implements IBannerMoveClick {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f77711C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f77712A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f77713B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f77714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f77715y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f77716z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/V8Banner$a.class */
    public final class a extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f77717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V8Banner f77718b;

        public a(V8Banner v8Banner) {
            this.f77718b = v8Banner;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrollStateChanged(int i7) {
            super.onPageScrollStateChanged(i7);
            if (i7 == 1) {
                this.f77717a = true;
            }
            if (i7 == 0 && this.f77717a) {
                this.f77717a = false;
                int i8 = V8Banner.f77711C;
                this.f77718b.resumeAutoLoop(1500L);
            }
        }
    }

    @JvmOverloads
    public V8Banner(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public V8Banner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public V8Banner(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f77714x = 0.5f;
        this.f77715y = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        setDispatchWorking(false);
        getViewPager2().registerOnPageChangeCallback(new a(this));
        setInterceptWorking(false);
    }

    public final boolean bannerMoveClick() {
        return this.f77713B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z6 = false;
            if (action != 2) {
                if (motionEvent.getAction() == 1) {
                    float f7 = this.f77712A;
                    float f8 = this.f77716z;
                    float x6 = motionEvent.getX();
                    float y6 = motionEvent.getY();
                    float fAbs = Math.abs(x6 - f7);
                    float fAbs2 = Math.abs(y6 - f8);
                    float f9 = this.f77715y;
                    if (fAbs >= f9 || fAbs2 >= f9) {
                        z6 = true;
                    }
                    this.f77713B = z6;
                }
                this.f77716z = 0.0f;
                this.f77712A = 0.0f;
            } else {
                float f10 = this.f77716z;
                if (f10 > 0.0f) {
                    float fA = S9.r.a(motionEvent, f10);
                    float fAbs3 = Math.abs(this.f77712A - motionEvent.getX());
                    if (fA > 100.0f && fAbs3 < 100.0f) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else if (getAdapter() != null && getParent() != null) {
                        ViewParent parent = getParent();
                        SwiperBannerAdapter adapter = getAdapter();
                        parent.requestDisallowInterceptTouchEvent((adapter != null ? adapter.getItemCount() : 0) > 1);
                    }
                    if (fAbs3 <= this.f77715y || fAbs3 * this.f77714x <= fA) {
                        RecyclerView recyclerView = getRecyclerView();
                        if (recyclerView != null) {
                            recyclerView.requestDisallowInterceptTouchEvent(true);
                        }
                    } else {
                        RecyclerView recyclerView2 = getRecyclerView();
                        if (recyclerView2 != null) {
                            recyclerView2.requestDisallowInterceptTouchEvent(false);
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else {
            this.f77716z = motionEvent.getY();
            this.f77712A = motionEvent.getX();
        }
        try {
            zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        } catch (Exception e7) {
            CrashReport.postCatchedException(e7);
            zDispatchTouchEvent = true;
        }
        return zDispatchTouchEvent;
    }

    public final boolean getLastIsMoveEvent() {
        return this.f77713B;
    }

    public final void loopAction() {
        if (getViewPager2().getScrollState() == 0) {
            super.loopAction();
        } else {
            resumeAutoLoop(1500L);
        }
    }
}
