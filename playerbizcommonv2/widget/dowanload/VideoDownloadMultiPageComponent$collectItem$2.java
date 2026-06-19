package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.playerbizcommonv2.widget.dowanload.m;
import com.bilibili.playerbizcommonv2.widget.dowanload.s;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadMultiPageComponent$collectItem$2.class */
final class VideoDownloadMultiPageComponent$collectItem$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final StateFlow<Long> $currentCidFlow;
    final m.a $item;
    final RingProgressBar $progressView;
    final ImageView $stateView;
    final TextView $titleView;
    final LottieAnimationView $waveView;
    private Object L$0;
    int label;
    final m this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadMultiPageComponent$collectItem$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadMultiPageComponent$collectItem$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final StateFlow<Long> $currentCidFlow;
        final m.a $item;
        final TextView $titleView;
        final LottieAnimationView $waveView;
        int label;
        final m this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadMultiPageComponent$collectItem$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadMultiPageComponent$collectItem$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m f82507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final m.a f82508b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final TextView f82509c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final LottieAnimationView f82510d;

            public a(m mVar, m.a aVar, TextView textView, LottieAnimationView lottieAnimationView) {
                this.f82507a = mVar;
                this.f82508b = aVar;
                this.f82509c = textView;
                this.f82510d = lottieAnimationView;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ((Number) obj).longValue();
                m.a aVar = this.f82508b;
                String str = aVar.f82574b;
                TextView textView = this.f82509c;
                int i7 = m.f82570c;
                m mVar = this.f82507a;
                mVar.getClass();
                Context context = textView.getContext();
                long jLongValue = ((Number) mVar.f82572b.getValue()).longValue();
                long j7 = aVar.f82573a;
                LottieAnimationView lottieAnimationView = this.f82510d;
                if (j7 == jLongValue) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(DimenUtilsKt.dpToPx(12.0f), 0), 0, spannableStringBuilder.length(), 33);
                    textView.setText(spannableStringBuilder);
                    textView.setTextColor(ContextCompat.getColor(context, R$color.Brand_pink));
                    textView.setTypeface(Typeface.DEFAULT, 1);
                    if (textView.getWidth() <= 0) {
                        textView.getViewTreeObserver().addOnGlobalLayoutListener(new p(textView, j7, mVar, spannableStringBuilder, lottieAnimationView));
                    } else {
                        m.c(lottieAnimationView, textView, spannableStringBuilder.toString());
                    }
                } else {
                    textView.setText(str);
                    textView.setTextColor(ContextCompat.getColor(context, R$color.Text1));
                    textView.setTypeface(Typeface.DEFAULT, 0);
                    m.c(lottieAnimationView, textView, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StateFlow<Long> stateFlow, m mVar, m.a aVar, TextView textView, LottieAnimationView lottieAnimationView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentCidFlow = stateFlow;
            this.this$0 = mVar;
            this.$item = aVar;
            this.$titleView = textView;
            this.$waveView = lottieAnimationView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$currentCidFlow, this.this$0, this.$item, this.$titleView, this.$waveView, continuation);
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
                StateFlow<Long> stateFlow = this.$currentCidFlow;
                a aVar = new a(this.this$0, this.$item, this.$titleView, this.$waveView);
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadMultiPageComponent$collectItem$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadMultiPageComponent$collectItem$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final m.a $item;
        final RingProgressBar $progressView;
        final ImageView $stateView;
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadMultiPageComponent$collectItem$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadMultiPageComponent$collectItem$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<l, Continuation<? super Unit>, Object> {
            final m.a $item;
            final RingProgressBar $progressView;
            final ImageView $stateView;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(m.a aVar, ImageView imageView, RingProgressBar ringProgressBar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$item = aVar;
                this.$stateView = imageView;
                this.$progressView = ringProgressBar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.$stateView, this.$progressView, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(l lVar, Continuation<? super Unit> continuation) {
                return create(lVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s sVar = ((l) this.L$0).f82569a.get(Boxing.boxLong(this.$item.f82573a));
                if (sVar instanceof s.c) {
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$stateView);
                    this.$progressView.setVisibility(0);
                    this.$progressView.setProgress(((s.c) sVar).f82593a);
                } else if (Intrinsics.areEqual(sVar, s.a.f82591a)) {
                    ImageView imageView = this.$stateView;
                    Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
                    imageView.setVisibility(0);
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$progressView);
                    this.$stateView.setImageResource(2131236766);
                } else if (Intrinsics.areEqual(sVar, s.b.f82592a)) {
                    ImageView imageView2 = this.$stateView;
                    Lazy lazy2 = com.bilibili.playerbizcommonv2.utils.p.f81943a;
                    imageView2.setVisibility(0);
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$progressView);
                    this.$stateView.setImageResource(2131236767);
                } else {
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$stateView);
                    com.bilibili.playerbizcommonv2.utils.p.h(this.$progressView);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(m.a aVar, ImageView imageView, RingProgressBar ringProgressBar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$item = aVar;
            this.$stateView = imageView;
            this.$progressView = ringProgressBar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$item, this.$stateView, this.$progressView, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                m.a aVar = this.$item;
                StateFlow<l> stateFlow = aVar.f82575c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, this.$stateView, this.$progressView, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDownloadMultiPageComponent$collectItem$2(TextView textView, m.a aVar, RingProgressBar ringProgressBar, StateFlow<Long> stateFlow, m mVar, LottieAnimationView lottieAnimationView, ImageView imageView, Continuation<? super VideoDownloadMultiPageComponent$collectItem$2> continuation) {
        super(2, continuation);
        this.$titleView = textView;
        this.$item = aVar;
        this.$progressView = ringProgressBar;
        this.$currentCidFlow = stateFlow;
        this.this$0 = mVar;
        this.$waveView = lottieAnimationView;
        this.$stateView = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(m.a aVar, View view) {
        aVar.f82576d.invoke();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoDownloadMultiPageComponent$collectItem$2 videoDownloadMultiPageComponent$collectItem$2 = new VideoDownloadMultiPageComponent$collectItem$2(this.$titleView, this.$item, this.$progressView, this.$currentCidFlow, this.this$0, this.$waveView, this.$stateView, continuation);
        videoDownloadMultiPageComponent$collectItem$2.L$0 = obj;
        return videoDownloadMultiPageComponent$collectItem$2;
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
        Context context = this.$titleView.getContext();
        this.$titleView.setText(this.$item.f82574b);
        this.$titleView.setBackground(com.bilibili.playerbizcommonv2.utils.p.f(ContextCompat.getColor(context, R$color.Bg1_float), 0.0f, 6, 0));
        TextView textView = this.$titleView;
        final m.a aVar = this.$item;
        textView.setOnClickListener(new View.OnClickListener(aVar) { // from class: com.bilibili.playerbizcommonv2.widget.dowanload.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final m.a f82577a;

            {
                this.f82577a = aVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoDownloadMultiPageComponent$collectItem$2.invokeSuspend$lambda$0(this.f82577a, view);
            }
        });
        this.$progressView.setRingColor(com.bilibili.playerbizcommonv2.utils.p.c(context, R$color.Ga3, 0.5f));
        this.$progressView.setRingProgressColor(ContextCompat.getColor(context, R$color.Pi5));
        this.$progressView.setClockwise(true);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$currentCidFlow, this.this$0, this.$item, this.$titleView, this.$waveView, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$item, this.$stateView, this.$progressView, null), 3, (Object) null);
    }
}
