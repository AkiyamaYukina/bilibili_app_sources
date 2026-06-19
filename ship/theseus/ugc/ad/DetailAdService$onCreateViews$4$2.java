package com.bilibili.ship.theseus.ugc.ad;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.IAdUnderPlayerCallback;
import com.bilibili.playerbizcommon.utils.BezierInterpolator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import zv0.C9268a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onCreateViews$4$2.class */
final class DetailAdService$onCreateViews$4$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C9268a.C1396a $views;
    int label;
    final DetailAdService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onCreateViews$4$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onCreateViews$4$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final C9268a.C1396a $views;
        boolean Z$0;
        int label;
        final DetailAdService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailAdService detailAdService, C9268a.C1396a c1396a, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailAdService;
            this.$views = c1396a;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$views, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                IAdUnderPlayerCallback iAdUnderPlayerCallback = this.this$0.f96270t;
                if (iAdUnderPlayerCallback == null || !iAdUnderPlayerCallback.isSupportAnimIn() || ((Number) this.this$0.f96275y.getValue()).longValue() <= 0) {
                    Animator animator = this.this$0.f96274x;
                    if (animator != null) {
                        animator.cancel();
                    }
                    DetailAdService detailAdService = this.this$0;
                    detailAdService.f96274x = null;
                    detailAdService.d();
                } else {
                    DetailAdService detailAdService2 = this.this$0;
                    if (detailAdService2.f96274x == null) {
                        final df.a aVarA = detailAdService2.a();
                        IAdUnderPlayerCallback iAdUnderPlayerCallback2 = detailAdService2.f96270t;
                        ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(0, iAdUnderPlayerCallback2 != null ? iAdUnderPlayerCallback2.getViewHeight() : 0);
                        valueAnimatorOfInt.setDuration(400L);
                        valueAnimatorOfInt.setStartDelay(((Number) detailAdService2.f96275y.getValue()).longValue());
                        valueAnimatorOfInt.setInterpolator(new BezierInterpolator(0.84f, 0.0f, 0.16f, 1.0f));
                        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(aVarA) { // from class: com.bilibili.ship.theseus.ugc.ad.b

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final df.a f96290a;

                            {
                                this.f96290a = aVarA;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                df.a aVar = this.f96290a;
                                ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
                                if (layoutParams == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                }
                                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                aVar.setLayoutParams(layoutParams);
                            }
                        });
                        valueAnimatorOfInt.addListener(new e(aVarA, detailAdService2));
                        detailAdService2.f96274x = valueAnimatorOfInt;
                    }
                    DetailAdService detailAdService3 = this.this$0;
                    Animator animator2 = detailAdService3.f96274x;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    Animator animator3 = detailAdService3.f96274x;
                    if (animator3 != null) {
                        animator3.start();
                    }
                }
                DetailAdService detailAdService4 = this.this$0;
                C9268a.C1396a c1396a = this.$views;
                detailAdService4.f96255d.registerState(detailAdService4.f96276z, new int[]{3, 4, 5, 6, 8});
                detailAdService4.f96256e.registerState(detailAdService4.f96246A);
                c1396a.f130938c.addOnLayoutChangeListener(detailAdService4.f96247B);
                BuildersKt.launch$default(detailAdService4.f96252a, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$onViewsCreated$1(detailAdService4, null), 3, (Object) null);
                BuildersKt.launch$default(detailAdService4.f96252a, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$onViewsCreated$2(detailAdService4, null), 3, (Object) null);
                BuildersKt.launch$default(detailAdService4.f96252a, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$onViewsCreated$3(detailAdService4, null), 3, (Object) null);
                BuildersKt.launch$default(detailAdService4.f96252a, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$onViewsCreated$4(c1396a, detailAdService4, null), 3, (Object) null);
                BuildersKt.launch$default(detailAdService4.f96252a, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$onViewsCreated$5(detailAdService4, null), 3, (Object) null);
                BuildersKt.launch$default(detailAdService4.f96252a, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$onViewsCreated$6(detailAdService4, null), 3, (Object) null);
                BuildersKt.launch$default(detailAdService4.f96252a, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$onViewsCreated$7(detailAdService4, null), 3, (Object) null);
                IAdUnderPlayerCallback iAdUnderPlayerCallback3 = detailAdService4.f96270t;
                if (iAdUnderPlayerCallback3 != null && !iAdUnderPlayerCallback3.isBlankView()) {
                    detailAdService4.f96267q.h.a("DetailAdService");
                }
            } else {
                this.this$0.a().setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$onCreateViews$4$2(DetailAdService detailAdService, C9268a.C1396a c1396a, Continuation<? super DetailAdService$onCreateViews$4$2> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
        this.$views = c1396a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$onCreateViews$4$2(this.this$0, this.$views, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        StateFlow visibleFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            IAdUnderPlayerCallback iAdUnderPlayerCallback = this.this$0.f96270t;
            if (iAdUnderPlayerCallback != null && (visibleFlow = iAdUnderPlayerCallback.getVisibleFlow()) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$views, null);
                this.label = 1;
                if (FlowKt.collectLatest(visibleFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
