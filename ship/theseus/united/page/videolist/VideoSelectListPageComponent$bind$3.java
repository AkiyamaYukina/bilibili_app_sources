package com.bilibili.ship.theseus.united.page.videolist;

import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.videolist.d;
import dv0.I0;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListPageComponent$bind$3.class */
final class VideoSelectListPageComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final I0 $binding;
    private Object L$0;
    int label;
    final d this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListPageComponent$bind$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListPageComponent$bind$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final d.a $item1;
        final TextView $title1;
        final LottieAnimationView $wave1;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListPageComponent$bind$3$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListPageComponent$bind$3$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f103543a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d.a f103544b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextView f103545c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final LottieAnimationView f103546d;

            public a(d dVar, d.a aVar, TextView textView, LottieAnimationView lottieAnimationView) {
                this.f103543a = dVar;
                this.f103544b = aVar;
                this.f103545c = textView;
                this.f103546d = lottieAnimationView;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ((Number) obj).longValue();
                d.a aVar = this.f103544b;
                d.c(this.f103543a, aVar.f103615b, aVar.f103614a, this.f103545c, this.f103546d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, d.a aVar, TextView textView, LottieAnimationView lottieAnimationView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$item1 = aVar;
            this.$title1 = textView;
            this.$wave1 = lottieAnimationView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$item1, this.$title1, this.$wave1, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                d dVar = this.this$0;
                StateFlow<Long> stateFlow = dVar.f103610c;
                a aVar = new a(dVar, this.$item1, this.$title1, this.$wave1);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListPageComponent$bind$3$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListPageComponent$bind$3$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final d.a $item2;
        final TextView $title2;
        final LottieAnimationView $wave2;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListPageComponent$bind$3$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListPageComponent$bind$3$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f103547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d.a f103548b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextView f103549c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final LottieAnimationView f103550d;

            public a(d dVar, d.a aVar, TextView textView, LottieAnimationView lottieAnimationView) {
                this.f103547a = dVar;
                this.f103548b = aVar;
                this.f103549c = textView;
                this.f103550d = lottieAnimationView;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ((Number) obj).longValue();
                d.a aVar = this.f103548b;
                d.c(this.f103547a, aVar.f103615b, aVar.f103614a, this.f103549c, this.f103550d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(d dVar, d.a aVar, TextView textView, LottieAnimationView lottieAnimationView, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$item2 = aVar;
            this.$title2 = textView;
            this.$wave2 = lottieAnimationView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$item2, this.$title2, this.$wave2, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                d dVar = this.this$0;
                StateFlow<Long> stateFlow = dVar.f103610c;
                a aVar = new a(dVar, this.$item2, this.$title2, this.$wave2);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListPageComponent$bind$3$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListPageComponent$bind$3$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final d.a $item3;
        final TextView $title3;
        final LottieAnimationView $wave3;
        int label;
        final d this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListPageComponent$bind$3$7$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListPageComponent$bind$3$7$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f103551a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d.a f103552b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextView f103553c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final LottieAnimationView f103554d;

            public a(d dVar, d.a aVar, TextView textView, LottieAnimationView lottieAnimationView) {
                this.f103551a = dVar;
                this.f103552b = aVar;
                this.f103553c = textView;
                this.f103554d = lottieAnimationView;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ((Number) obj).longValue();
                d.a aVar = this.f103552b;
                d.c(this.f103551a, aVar.f103615b, aVar.f103614a, this.f103553c, this.f103554d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(d dVar, d.a aVar, TextView textView, LottieAnimationView lottieAnimationView, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$item3 = aVar;
            this.$title3 = textView;
            this.$wave3 = lottieAnimationView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, this.$item3, this.$title3, this.$wave3, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                d dVar = this.this$0;
                StateFlow<Long> stateFlow = dVar.f103610c;
                a aVar = new a(dVar, this.$item3, this.$title3, this.$wave3);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSelectListPageComponent$bind$3(I0 i02, d dVar, Continuation<? super VideoSelectListPageComponent$bind$3> continuation) {
        super(2, continuation);
        this.$binding = i02;
        this.this$0 = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(d dVar, d.a aVar, View view) {
        dVar.f103612e.invoke(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(d dVar, d.a aVar, View view) {
        dVar.f103612e.invoke(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3(d dVar, d.a aVar, View view) {
        dVar.f103612e.invoke(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$5(View view) {
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSelectListPageComponent$bind$3 videoSelectListPageComponent$bind$3 = new VideoSelectListPageComponent$bind$3(this.$binding, this.this$0, continuation);
        videoSelectListPageComponent$bind$3.L$0 = obj;
        return videoSelectListPageComponent$bind$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Job jobLaunch$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        I0 i02 = this.$binding;
        TextView textView = i02.f116796e;
        TextView textView2 = i02.f116797f;
        TextView textView3 = i02.f116798g;
        LottieAnimationView lottieAnimationView = i02.f116793b;
        LottieAnimationView lottieAnimationView2 = i02.f116794c;
        LottieAnimationView lottieAnimationView3 = i02.f116795d;
        final d.a aVar = (d.a) this.this$0.f103608a.getFirst();
        final d.a aVar2 = (d.a) this.this$0.f103608a.getSecond();
        final d.a aVar3 = (d.a) this.this$0.f103608a.getThird();
        textView.setText(aVar.f103615b);
        final d dVar = this.this$0;
        textView.setOnClickListener(new View.OnClickListener(dVar, aVar) { // from class: com.bilibili.ship.theseus.united.page.videolist.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f103616a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d.a f103617b;

            {
                this.f103616a = dVar;
                this.f103617b = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoSelectListPageComponent$bind$3.invokeSuspend$lambda$0(this.f103616a, this.f103617b, view);
            }
        });
        textView.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(this.this$0.f103609b.f103587f, 0.0f, DimenUtilsKt.dpToPx(2.0f), 0));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, aVar, textView, lottieAnimationView, null), 3, (Object) null);
        if (aVar2 != null) {
            textView2.setVisibility(0);
            lottieAnimationView2.setVisibility(0);
            textView2.setText(aVar2.f103615b);
            final d dVar2 = this.this$0;
            textView2.setOnClickListener(new View.OnClickListener(dVar2, aVar2) { // from class: com.bilibili.ship.theseus.united.page.videolist.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f103618a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final d.a f103619b;

                {
                    this.f103618a = dVar2;
                    this.f103619b = aVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoSelectListPageComponent$bind$3.invokeSuspend$lambda$1(this.f103618a, this.f103619b, view);
                }
            });
            textView2.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(this.this$0.f103609b.f103587f, 0.0f, DimenUtilsKt.dpToPx(2.0f), 0));
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, aVar2, textView2, lottieAnimationView2, null), 3, (Object) null);
        } else {
            textView2.setVisibility(4);
            lottieAnimationView2.setVisibility(4);
            textView2.setOnClickListener(new Object());
        }
        if (aVar3 != null && this.this$0.f103611d) {
            textView3.setVisibility(0);
            lottieAnimationView3.setVisibility(0);
            textView3.setText(aVar3.f103615b);
            final d dVar3 = this.this$0;
            textView3.setOnClickListener(new View.OnClickListener(dVar3, aVar3) { // from class: com.bilibili.ship.theseus.united.page.videolist.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d f103620a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final d.a f103621b;

                {
                    this.f103620a = dVar3;
                    this.f103621b = aVar3;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoSelectListPageComponent$bind$3.invokeSuspend$lambda$3(this.f103620a, this.f103621b, view);
                }
            });
            textView3.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(this.this$0.f103609b.f103587f, 0.0f, DimenUtilsKt.dpToPx(2.0f), 0));
            jobLaunch$default = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.this$0, aVar3, textView3, lottieAnimationView3, null), 3, (Object) null);
        } else if (this.this$0.f103611d) {
            textView3.setVisibility(4);
            lottieAnimationView3.setVisibility(4);
            textView3.setOnClickListener(new Object());
            jobLaunch$default = Unit.INSTANCE;
        } else {
            textView3.setVisibility(8);
            lottieAnimationView3.setVisibility(8);
            textView3.setOnClickListener(new Object());
            jobLaunch$default = Unit.INSTANCE;
        }
        return jobLaunch$default;
    }
}
