package com.bilibili.pegasus.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.components.C5632m;
import com.bilibili.pegasus.vm.PegasusViewModel;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.D;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/a.class */
@StabilityInferred(parameters = 0)
public final class a implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RecyclerView f79131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5632m.a f79133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f79134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79135e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f79137g;

    @Nullable
    public VelocityTracker h;

    public a(@NotNull RecyclerView recyclerView, int i7, @NotNull C5632m.a aVar) {
        this.f79131a = recyclerView;
        this.f79132b = i7;
        this.f79133c = aVar;
        D.a(i7, ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop(), "init triggerDistance=", " touchSlop=", "EarlyRefreshDetector");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        RecyclerView recyclerView2 = this.f79131a;
        if (actionMasked == 0) {
            this.f79135e = motionEvent.getPointerId(0);
            this.f79134d = motionEvent.getY();
            this.f79136f = false;
            this.f79137g = false;
            VelocityTracker velocityTracker = this.h;
            if (velocityTracker == null) {
                this.h = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            VelocityTracker velocityTracker2 = this.h;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            BLog.d("EarlyRefreshDetector", String.format("DOWN y=%.1f canScrollUp=%b", Arrays.copyOf(new Object[]{Float.valueOf(motionEvent.getY()), Boolean.valueOf(recyclerView2.canScrollVertically(-1))}, 2)));
            return false;
        }
        C5632m.a aVar = this.f79133c;
        int i7 = this.f79132b;
        int i8 = 1;
        if (actionMasked == 1) {
            BLog.d("EarlyRefreshDetector", "UP triggered=" + this.f79137g + " trackingStarted=" + this.f79136f);
            if (this.f79137g) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f79135e);
                if (iFindPointerIndex >= 0) {
                    float y6 = (motionEvent.getY(iFindPointerIndex) - this.f79134d) * 0.5f;
                    if (y6 < i7) {
                        BLog.i("EarlyRefreshDetector", String.format(">>> cancelled (dragged back) overscroll=%.1f", Arrays.copyOf(new Object[]{Float.valueOf(y6)}, 1)));
                        aVar.a();
                    } else {
                        BLog.i("EarlyRefreshDetector", String.format(">>> released normally, early refresh confirmed overscroll=%.1f", Arrays.copyOf(new Object[]{Float.valueOf(y6)}, 1)));
                    }
                } else {
                    BLog.i("EarlyRefreshDetector", ">>> cancelled (pointer lost)");
                    aVar.a();
                }
            }
            VelocityTracker velocityTracker3 = this.h;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
            }
            this.h = null;
            this.f79136f = false;
            this.f79137g = false;
            this.f79135e = -1;
            return false;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f79135e = motionEvent.getPointerId(actionIndex);
                    this.f79134d = motionEvent.getY(actionIndex);
                    return false;
                }
                if (actionMasked != 6) {
                    return false;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) != this.f79135e) {
                    return false;
                }
                if (actionIndex2 != 0) {
                    i8 = 0;
                }
                this.f79135e = motionEvent.getPointerId(i8);
                this.f79134d = motionEvent.getY(i8);
                return false;
            }
            BLog.d("EarlyRefreshDetector", "CANCEL triggered=" + this.f79137g + " trackingStarted=" + this.f79136f);
            if (this.f79137g) {
                BLog.i("EarlyRefreshDetector", ">>> cancelled (gesture cancel)");
                aVar.a();
            }
            VelocityTracker velocityTracker4 = this.h;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            this.h = null;
            this.f79136f = false;
            this.f79137g = false;
            this.f79135e = -1;
            return false;
        }
        VelocityTracker velocityTracker5 = this.h;
        if (velocityTracker5 != null) {
            velocityTracker5.addMovement(motionEvent);
        }
        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f79135e);
        if (iFindPointerIndex2 < 0) {
            return false;
        }
        float y7 = motionEvent.getY(iFindPointerIndex2);
        if (!this.f79136f) {
            if (recyclerView2.canScrollVertically(-1)) {
                return false;
            }
            this.f79136f = true;
            this.f79134d = y7;
            BLog.d("EarlyRefreshDetector", String.format("tracking started at y=%.1f", Arrays.copyOf(new Object[]{Float.valueOf(y7)}, 1)));
            return false;
        }
        if (recyclerView2.canScrollVertically(-1)) {
            this.f79136f = false;
            if (!this.f79137g) {
                return false;
            }
            BLog.i("EarlyRefreshDetector", ">>> cancelled (scrolled away from top)");
            aVar.a();
            this.f79137g = false;
            return false;
        }
        float f7 = (y7 - this.f79134d) * 0.5f;
        if (this.f79137g || f7 < i7) {
            return false;
        }
        VelocityTracker velocityTracker6 = this.h;
        if (velocityTracker6 != null) {
            velocityTracker6.computeCurrentVelocity(1000);
        }
        VelocityTracker velocityTracker7 = this.h;
        float yVelocity = velocityTracker7 != null ? velocityTracker7.getYVelocity(this.f79135e) : 0.0f;
        BLog.d("EarlyRefreshDetector", String.format("threshold reached overscroll=%.1f vy=%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f7), Float.valueOf(yVelocity)}, 2)));
        if (yVelocity <= 0.0f) {
            return false;
        }
        this.f79137g = true;
        BLog.i("EarlyRefreshDetector", ">>> early refresh triggered");
        BLog.i("[Pegasus]EarlyRefreshComponent", "early refresh triggered");
        ((PegasusViewModel) aVar.f77085a.f77084m.getValue()).L0();
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z6) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(@NotNull RecyclerView recyclerView, @NotNull MotionEvent motionEvent) {
    }
}
