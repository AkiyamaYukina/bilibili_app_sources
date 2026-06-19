package com.bilibili.upper.widget;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.performance.EntryPointKt;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/UpperScrollTextView.class */
@StabilityInferred(parameters = 0)
public final class UpperScrollTextView extends AppCompatTextView implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f114463f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f114464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ValueAnimator f114465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ValueAnimator f114466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f114467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f114468e;

    @JvmOverloads
    public UpperScrollTextView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public UpperScrollTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public UpperScrollTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        Lifecycle lifecycle;
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        getPaint().setColor(getCurrentTextColor());
        setSelected(true);
        Activity activity = getActivity();
        if (activity == null || (lifecycle = ListExtentionsKt.lifecycle(activity)) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    public final void J() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f114466c;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f114466c) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator3 = this.f114466c;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.f114466c;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        this.f114466c = null;
    }

    public final void K() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f114465b;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f114465b) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator3 = this.f114465b;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.f114465b;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        this.f114465b = null;
    }

    @Nullable
    public final Activity getActivity() {
        return getContext() != null ? ContextUtilKt.findActivityOrNull(getContext()) : null;
    }

    public final int getMExtraSpace() {
        return this.f114468e;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        K();
        J();
        super.onDestroy(lifecycleOwner);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        if (EntryPointKt.getMemleakOptEnable()) {
            Activity activity = getActivity();
            if (activity != null && (lifecycle = ListExtentionsKt.lifecycle(activity)) != null) {
                lifecycle.removeObserver(this);
            }
            K();
            J();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        canvas.save();
        canvas.translate(this.f114464a, 0.0f);
        if (getLayout() != null) {
            getLayout().draw(canvas, null, null, 0);
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i7, @Nullable Rect rect) {
        if (z6) {
            super.onFocusChanged(z6, i7, rect);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f114465b;
        if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = this.f114465b) != null) {
            valueAnimator2.pause();
        }
        ValueAnimator valueAnimator4 = this.f114466c;
        if (valueAnimator4 == null || !valueAnimator4.isRunning() || (valueAnimator = this.f114466c) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f114465b;
        if (valueAnimator2 == null || !valueAnimator2.isPaused() || (valueAnimator = this.f114465b) == null) {
            return;
        }
        valueAnimator.resume();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        post(new Runnable(this) { // from class: com.bilibili.upper.widget.I

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UpperScrollTextView f114396a;

            {
                this.f114396a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final UpperScrollTextView upperScrollTextView = this.f114396a;
                int i11 = UpperScrollTextView.f114463f;
                upperScrollTextView.K();
                if (upperScrollTextView.getLayout() != null) {
                    upperScrollTextView.f114467d = upperScrollTextView.getLayout().getLineWidth(0);
                }
                float f7 = upperScrollTextView.f114467d;
                if (f7 <= 0.0f || ((int) f7) == upperScrollTextView.getWidth() || upperScrollTextView.f114467d <= (upperScrollTextView.getWidth() - (upperScrollTextView.getCompoundPaddingRight() + upperScrollTextView.getCompoundPaddingLeft())) - upperScrollTextView.f114468e) {
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(upperScrollTextView.getCompoundPaddingLeft(), (upperScrollTextView.f114467d - upperScrollTextView.getCompoundPaddingLeft()) * (-1.0f));
                upperScrollTextView.f114465b = valueAnimatorOfFloat;
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setStartDelay(1000L);
                }
                ValueAnimator valueAnimator = upperScrollTextView.f114465b;
                if (valueAnimator != null) {
                    valueAnimator.setDuration((long) (upperScrollTextView.f114467d * 20));
                }
                ValueAnimator valueAnimator2 = upperScrollTextView.f114465b;
                if (valueAnimator2 != null) {
                    valueAnimator2.setInterpolator(new LinearInterpolator());
                }
                ValueAnimator valueAnimator3 = upperScrollTextView.f114465b;
                if (valueAnimator3 != null) {
                    valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(upperScrollTextView) { // from class: com.bilibili.upper.widget.J

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final UpperScrollTextView f114397a;

                        {
                            this.f114397a = upperScrollTextView;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                            final UpperScrollTextView upperScrollTextView2 = this.f114397a;
                            int i12 = UpperScrollTextView.f114463f;
                            upperScrollTextView2.f114464a = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                            if (Math.abs(upperScrollTextView2.f114464a) + upperScrollTextView2.getWidth() < upperScrollTextView2.f114467d) {
                                upperScrollTextView2.invalidate();
                                return;
                            }
                            ValueAnimator valueAnimator5 = upperScrollTextView2.f114465b;
                            if (valueAnimator5 != null) {
                                valueAnimator5.cancel();
                            }
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(upperScrollTextView2.f114464a, upperScrollTextView2.getCompoundPaddingLeft());
                            upperScrollTextView2.f114466c = valueAnimatorOfFloat2;
                            if (valueAnimatorOfFloat2 != null) {
                                valueAnimatorOfFloat2.setStartDelay(1000L);
                            }
                            ValueAnimator valueAnimator6 = upperScrollTextView2.f114466c;
                            if (valueAnimator6 != null) {
                                valueAnimator6.setDuration(200L);
                            }
                            ValueAnimator valueAnimator7 = upperScrollTextView2.f114466c;
                            if (valueAnimator7 != null) {
                                valueAnimator7.setInterpolator(new LinearInterpolator());
                            }
                            ValueAnimator valueAnimator8 = upperScrollTextView2.f114466c;
                            if (valueAnimator8 != null) {
                                valueAnimator8.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(upperScrollTextView2) { // from class: com.bilibili.upper.widget.K

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final UpperScrollTextView f114398a;

                                    {
                                        this.f114398a = upperScrollTextView2;
                                    }

                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator9) {
                                        UpperScrollTextView upperScrollTextView3 = this.f114398a;
                                        int i13 = UpperScrollTextView.f114463f;
                                        upperScrollTextView3.f114464a = ((Float) valueAnimator9.getAnimatedValue()).floatValue();
                                        upperScrollTextView3.invalidate();
                                        if (upperScrollTextView3.f114464a >= upperScrollTextView3.getCompoundPaddingLeft()) {
                                            upperScrollTextView3.J();
                                            ValueAnimator valueAnimator10 = upperScrollTextView3.f114465b;
                                            if (valueAnimator10 != null) {
                                                valueAnimator10.start();
                                            }
                                        }
                                    }
                                });
                            }
                            ValueAnimator valueAnimator9 = upperScrollTextView2.f114466c;
                            if (valueAnimator9 != null) {
                                valueAnimator9.start();
                            }
                        }
                    });
                }
                ValueAnimator valueAnimator4 = upperScrollTextView.f114465b;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
        });
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        if (z6) {
            super.onWindowFocusChanged(z6);
        }
    }

    @Override // android.view.View
    public void setHorizontalFadingEdgeEnabled(boolean z6) {
        super.setHorizontalFadingEdgeEnabled(false);
    }

    public final void setMExtraSpace(int i7) {
        this.f114468e = i7;
    }

    @Override // android.widget.TextView
    public final void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        String.valueOf(charSequence);
        this.f114464a = getCompoundPaddingLeft();
    }
}
