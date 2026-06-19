package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.playerbizcommonv2.widget.dowanload.m;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadMultiPageComponent$bind$2.class */
final class VideoDownloadMultiPageComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
    final Dr0.j $binding;
    private Object L$0;
    int label;
    final m this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadMultiPageComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadMultiPageComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Dr0.j $binding;
        int label;
        final m this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m mVar, Dr0.j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mVar;
            this.$binding = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                m mVar = this.this$0;
                Dr0.j jVar = this.$binding;
                TextView textView = jVar.h;
                ImageView imageView = jVar.f3097f;
                RingProgressBar ringProgressBar = jVar.f3095d;
                LottieAnimationView lottieAnimationView = jVar.f3093b;
                m.a aVar = (m.a) mVar.f82571a.getFirst();
                StateFlow<Long> stateFlow = this.this$0.f82572b;
                this.label = 1;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoDownloadMultiPageComponent$collectItem$2(textView, aVar, ringProgressBar, stateFlow, mVar, lottieAnimationView, imageView, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadMultiPageComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadMultiPageComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RingProgressBar $progress2;
        final m.a $second;
        final ImageView $status2;
        final TextView $title2;
        final LottieAnimationView $wave2;
        int label;
        final m this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(m mVar, TextView textView, ImageView imageView, RingProgressBar ringProgressBar, LottieAnimationView lottieAnimationView, m.a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = mVar;
            this.$title2 = textView;
            this.$status2 = imageView;
            this.$progress2 = ringProgressBar;
            this.$wave2 = lottieAnimationView;
            this.$second = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$title2, this.$status2, this.$progress2, this.$wave2, this.$second, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                m mVar = this.this$0;
                TextView textView = this.$title2;
                ImageView imageView = this.$status2;
                RingProgressBar ringProgressBar = this.$progress2;
                LottieAnimationView lottieAnimationView = this.$wave2;
                m.a aVar = this.$second;
                StateFlow<Long> stateFlow = mVar.f82572b;
                this.label = 1;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoDownloadMultiPageComponent$collectItem$2(textView, aVar, ringProgressBar, stateFlow, mVar, lottieAnimationView, imageView, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
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
    public VideoDownloadMultiPageComponent$bind$2(Dr0.j jVar, m mVar, Continuation<? super VideoDownloadMultiPageComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = jVar;
        this.this$0 = mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(View view) {
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoDownloadMultiPageComponent$bind$2 videoDownloadMultiPageComponent$bind$2 = new VideoDownloadMultiPageComponent$bind$2(this.$binding, this.this$0, continuation);
        videoDownloadMultiPageComponent$bind$2.L$0 = obj;
        return videoDownloadMultiPageComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Job jobLaunch$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
        Dr0.j jVar = this.$binding;
        TextView textView = jVar.f3099i;
        ImageView imageView = jVar.f3098g;
        RingProgressBar ringProgressBar = jVar.f3096e;
        LottieAnimationView lottieAnimationView = jVar.f3094c;
        m.a aVar = (m.a) this.this$0.f82571a.getSecond();
        if (aVar != null) {
            textView.setVisibility(0);
            textView.setText(aVar.f82574b);
            jobLaunch$default = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, textView, imageView, ringProgressBar, lottieAnimationView, aVar, null), 3, (Object) null);
        } else {
            textView.setVisibility(4);
            com.bilibili.playerbizcommonv2.utils.p.h(lottieAnimationView);
            com.bilibili.playerbizcommonv2.utils.p.h(imageView);
            com.bilibili.playerbizcommonv2.utils.p.h(ringProgressBar);
            textView.setOnClickListener(new Object());
            jobLaunch$default = Unit.INSTANCE;
        }
        return jobLaunch$default;
    }
}
