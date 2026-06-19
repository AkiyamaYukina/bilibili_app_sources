package com.bilibili.ship.theseus.ugc.intro.commentguide;

import Vu0.C2971j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.WindowManagerHelper;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideComponent$bindToView$2;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideComponent$bindToView$2.class */
final class CommentGuideComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C2971j $binding;
    final String $comment;
    final ConstraintLayout $root;
    final String $subtitle;
    final String $title;
    private Object L$0;
    int label;
    final f this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideComponent$bindToView$2$1$1.class */
        public static final class C08321 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08321(ConstraintLayout constraintLayout, Continuation<? super C08321> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08321 c08321 = new C08321(this.$root, continuation);
                c08321.I$0 = ((Number) obj).intValue();
                return c08321;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0 - 12);
                ConstraintLayout constraintLayout = this.$root;
                constraintLayout.setPadding(iDpToPx, constraintLayout.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$root = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f96997b;
                C08321 c08321 = new C08321(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08321, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2971j $binding;
        final String $subtitle;
        final String $title;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C2971j c2971j, String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c2971j;
            this.$title = str;
            this.$subtitle = str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, this.$title, this.$subtitle, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ConstraintLayout constraintLayout = this.$binding.f25915a;
                this.label = 1;
                if (com.bilibili.ogv.infra.android.view.d.a(constraintLayout, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int width = this.$binding.h.getWidth();
            TextPaint paint = this.$binding.f25921g.getPaint();
            float fMeasureText = 0.0f;
            float fMeasureText2 = paint != null ? paint.measureText(this.$title) : 0.0f;
            TextPaint paint2 = this.$binding.f25921g.getPaint();
            if (paint2 != null) {
                fMeasureText = paint2.measureText(this.$subtitle);
            }
            float f7 = width;
            if (fMeasureText2 > f7 || fMeasureText > f7) {
                this.$binding.f25919e.setVisibility(8);
                this.$binding.h.setPadding(NewPlayerUtilsKt.toPx(12.0f), 0, 0, 0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideComponent$bindToView$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideComponent$bindToView$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C2971j $binding;
        final String $comment;
        final String $subtitle;
        final String $title;
        int label;
        final f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C2971j c2971j, String str, String str2, f fVar, String str3, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$binding = c2971j;
            this.$title = str;
            this.$subtitle = str2;
            this.this$0 = fVar;
            this.$comment = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(f fVar, String str, C2971j c2971j, View view) {
            fVar.f96996a.b(1, str, false);
            f.a(fVar, c2971j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(f fVar, String str, C2971j c2971j, View view) {
            CommentGuideService commentGuideService = fVar.f96996a.f97004b;
            long jA = commentGuideService.f96983d.a();
            C8043a c8043a = commentGuideService.f96984e;
            String str2 = c8043a.a().f123880b;
            String str3 = c8043a.a().f123881c;
            Hg.a.b(commentGuideService.f96981b, jA, 1, 0L, 0L, 0, 0, str, "", "", new ArrayList(), 0L, 0, "", "", "", str2, str3, "", "", new HashMap(), new BiliApiCallback());
            fVar.f96996a.b(2, str, false);
            f.a(fVar, c2971j);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$binding, this.$title, this.$subtitle, this.this$0, this.$comment, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$binding.f25921g.setText(this.$title);
            this.$binding.f25920f.setText(this.$subtitle);
            final C2971j c2971j = this.$binding;
            TintImageView tintImageView = c2971j.f25917c;
            final f fVar = this.this$0;
            final String str = this.$comment;
            tintImageView.setOnClickListener(new View.OnClickListener(fVar, str, c2971j) { // from class: com.bilibili.ship.theseus.ugc.intro.commentguide.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f f96989a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f96990b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final C2971j f96991c;

                {
                    this.f96989a = fVar;
                    this.f96990b = str;
                    this.f96991c = c2971j;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommentGuideComponent$bindToView$2.AnonymousClass3.invokeSuspend$lambda$0(this.f96989a, this.f96990b, this.f96991c, view);
                }
            });
            ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f25915a, this.this$0.f97002g);
            final C2971j c2971j2 = this.$binding;
            TintTextView tintTextView = c2971j2.f25918d;
            final f fVar2 = this.this$0;
            final String str2 = this.$comment;
            tintTextView.setOnClickListener(new View.OnClickListener(fVar2, str2, c2971j2) { // from class: com.bilibili.ship.theseus.ugc.intro.commentguide.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final f f96992a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f96993b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final C2971j f96994c;

                {
                    this.f96992a = fVar2;
                    this.f96993b = str2;
                    this.f96994c = c2971j2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommentGuideComponent$bindToView$2.AnonymousClass3.invokeSuspend$lambda$2(this.f96992a, this.f96993b, this.f96994c, view);
                }
            });
            f fVar3 = this.this$0;
            if (fVar3.f96999d) {
                fVar3.f96999d = false;
                final C2971j c2971j3 = this.$binding;
                Context context = c2971j3.f25915a.getContext();
                ConstraintLayout constraintLayout = c2971j3.f25915a;
                constraintLayout.setVisibility(0);
                if (fVar3.f96998c == 0) {
                    DisplayMetrics displayMetrics = WindowManagerHelper.getDisplayMetrics(context);
                    constraintLayout.measure(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE));
                    fVar3.f96998c = constraintLayout.getMeasuredHeight();
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, fVar3.f96998c);
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(c2971j3) { // from class: com.bilibili.ship.theseus.ugc.intro.commentguide.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C2971j f96988a;

                    {
                        this.f96988a = c2971j3;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ConstraintLayout constraintLayout2 = this.f96988a.f25915a;
                        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        constraintLayout2.setLayoutParams(layoutParams);
                    }
                });
                valueAnimatorOfInt.start();
                fVar3.f97001f = valueAnimatorOfInt;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideComponent$bindToView$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideComponent$bindToView$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(f fVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ValueAnimator valueAnimator;
            ValueAnimator valueAnimator2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                ValueAnimator valueAnimator3 = this.this$0.f97000e;
                if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = this.this$0.f97000e) != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator4 = this.this$0.f97001f;
                if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.this$0.f97001f) != null) {
                    valueAnimator.cancel();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentGuideComponent$bindToView$2(f fVar, ConstraintLayout constraintLayout, C2971j c2971j, String str, String str2, String str3, Continuation<? super CommentGuideComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$root = constraintLayout;
        this.$binding = c2971j;
        this.$title = str;
        this.$subtitle = str2;
        this.$comment = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommentGuideComponent$bindToView$2 commentGuideComponent$bindToView$2 = new CommentGuideComponent$bindToView$2(this.this$0, this.$root, this.$binding, this.$title, this.$subtitle, this.$comment, continuation);
        commentGuideComponent$bindToView$2.L$0 = obj;
        return commentGuideComponent$bindToView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.$title, this.$subtitle, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$binding, this.$title, this.$subtitle, this.this$0, this.$comment, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
    }
}
