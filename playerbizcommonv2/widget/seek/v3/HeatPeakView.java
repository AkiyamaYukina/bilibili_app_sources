package com.bilibili.playerbizcommonv2.widget.seek.v3;

import I3.C2212d2;
import X1.F;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C3246j;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.concurrent.CancellationException;
import kntr.video.peakbar.c;
import kntr.video.peakbar.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/HeatPeakView.class */
@StabilityInferred(parameters = 0)
public class HeatPeakView extends View {

    @NotNull
    public static final b h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f82904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public CoroutineScope f82905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f82906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f82907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f82909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ValueAnimator f82910g;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.HeatPeakView$onAttachedToWindow$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/HeatPeakView$onAttachedToWindow$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HeatPeakView this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.HeatPeakView$onAttachedToWindow$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/HeatPeakView$onAttachedToWindow$1$1.class */
        public static final class C05451 extends SuspendLambda implements Function2<kntr.video.peakbar.c, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final HeatPeakView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05451(HeatPeakView heatPeakView, Continuation<? super C05451> continuation) {
                super(2, continuation);
                this.this$0 = heatPeakView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05451 c05451 = new C05451(this.this$0, continuation);
                c05451.L$0 = obj;
                return c05451;
            }

            public final Object invoke(kntr.video.peakbar.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c.d dVar = (kntr.video.peakbar.c) this.L$0;
                if (dVar instanceof c.d) {
                    c.d dVar2 = dVar;
                    com.bilibili.ad.adview.videodetail.pausedpage.brand.base.b.b(dVar2.b, "HeatPeakView", F.b(dVar2.a.size(), "Ready: pathCmds=", " stepSec="));
                    a heatPeakDrawable = this.this$0.getHeatPeakDrawable();
                    List<d.b> list = dVar2.a;
                    heatPeakDrawable.getClass();
                    if (list.isEmpty()) {
                        heatPeakDrawable.f82954c = null;
                        heatPeakDrawable.f82955d = null;
                        heatPeakDrawable.invalidateSelf();
                    } else {
                        Path path = new Path();
                        for (d.b bVar : list) {
                            if (bVar instanceof d.d) {
                                d.d dVar3 = (d.d) bVar;
                                dVar3.getClass();
                                path.moveTo((float) 0.0d, (float) dVar3.a);
                            } else if (bVar instanceof d.c) {
                                d.c cVar = (d.c) bVar;
                                path.lineTo((float) cVar.a, (float) cVar.b);
                            } else if (bVar instanceof d.b) {
                                d.b bVar2 = bVar;
                                path.cubicTo((float) bVar2.a, (float) bVar2.b, (float) bVar2.c, (float) bVar2.d, (float) bVar2.e, (float) bVar2.f);
                            } else {
                                if (!(bVar instanceof d.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                path.close();
                            }
                        }
                        heatPeakDrawable.f82954c = path;
                        heatPeakDrawable.f82955d = null;
                        heatPeakDrawable.f82958g = null;
                        heatPeakDrawable.a();
                        heatPeakDrawable.invalidateSelf();
                    }
                    this.this$0.getHeatPeakDrawable().b(true);
                    HeatPeakView heatPeakView = this.this$0;
                    if (!heatPeakView.f82908e) {
                        heatPeakView.f82908e = true;
                        Function0<Unit> function0 = heatPeakView.f82909f;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                } else if (dVar instanceof c.a) {
                    BLog.d("HeatPeakView", "Empty");
                    this.this$0.getHeatPeakDrawable().b(false);
                } else if (dVar instanceof c.b) {
                    C3246j.b("Error: ", ((c.b) dVar).a, "HeatPeakView");
                    this.this$0.getHeatPeakDrawable().b(false);
                } else if (!(dVar instanceof c.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HeatPeakView heatPeakView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = heatPeakView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow stateFlow = this.this$0.getFacade().getStateFlow();
                C05451 c05451 = new C05451(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c05451, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    public HeatPeakView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public HeatPeakView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @JvmOverloads
    public HeatPeakView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a aVar = new a();
        this.f82904a = aVar;
        this.f82907d = LazyKt.lazy(new C2212d2(8));
        aVar.setCallback(this);
    }

    public /* synthetic */ HeatPeakView(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public static void c(HeatPeakView heatPeakView, long j7, long j8) {
        heatPeakView.getClass();
        if (!((Boolean) com.bilibili.playerbizcommonv2.utils.f.f81925n.getValue()).booleanValue()) {
            BLog.d("HeatPeakView", "experiment not hit, skip");
            heatPeakView.f82904a.b(false);
            return;
        }
        if (j8 <= 0) {
            com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.d.a(j8, "invalid cid=", ", skip", "HeatPeakView");
            heatPeakView.f82904a.b(false);
        } else {
            if (j8 == heatPeakView.f82906c) {
                com.bilibili.ad.adview.pegasus.holders.inline.card136.composeview.d.a(j8, "same cid=", ", skip", "HeatPeakView");
                return;
            }
            heatPeakView.f82906c = j8;
            heatPeakView.f82908e = false;
            heatPeakView.getFacade().reset();
            heatPeakView.getFacade().a(j7, j8, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kntr.video.peakbar.a getFacade() {
        return (kntr.video.peakbar.a) this.f82907d.getValue();
    }

    public final void b(float f7) {
        ValueAnimator valueAnimator;
        if (getScaleY() != f7 || ((valueAnimator = this.f82910g) != null && valueAnimator.isRunning())) {
            ValueAnimator valueAnimator2 = this.f82910g;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleY(), f7);
            valueAnimatorOfFloat.setDuration(500L);
            valueAnimatorOfFloat.setInterpolator(h);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.playerbizcommonv2.widget.seek.v3.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final HeatPeakView f82959a;

                {
                    this.f82959a = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    HeatPeakView heatPeakView = this.f82959a;
                    b bVar = HeatPeakView.h;
                    heatPeakView.setScaleY(((Float) valueAnimator3.getAnimatedValue()).floatValue());
                }
            });
            valueAnimatorOfFloat.start();
            this.f82910g = valueAnimatorOfFloat;
        }
    }

    public final void d() {
        getFacade().reset();
        this.f82904a.b(false);
        this.f82906c = 0L;
        this.f82908e = false;
    }

    public final void e(float f7) {
        a aVar = this.f82904a;
        aVar.getClass();
        float fCoerceIn = RangesKt.coerceIn(f7, 0.0f, 1.0f);
        if (fCoerceIn == aVar.f82957f) {
            return;
        }
        aVar.f82957f = fCoerceIn;
        aVar.invalidateSelf();
    }

    @NotNull
    public final a getHeatPeakDrawable() {
        return this.f82904a;
    }

    @Nullable
    public final Function0<Unit> getOnShowReport() {
        return this.f82909f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CoroutineScope coroutineScopeA = o.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
        this.f82905b = coroutineScopeA;
        BuildersKt.launch$default(coroutineScopeA, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f82910g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        CoroutineScope coroutineScope = this.f82905b;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        }
        this.f82905b = null;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        this.f82904a.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        this.f82904a.setBounds(getPaddingLeft(), 0, i7 - getPaddingRight(), i8 - getPaddingBottom());
        setPivotY(i8);
    }

    public final void setOnShowReport(@Nullable Function0<Unit> function0) {
        this.f82909f = function0;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NotNull Drawable drawable) {
        return Intrinsics.areEqual(drawable, this.f82904a) || super.verifyDrawable(drawable);
    }
}
