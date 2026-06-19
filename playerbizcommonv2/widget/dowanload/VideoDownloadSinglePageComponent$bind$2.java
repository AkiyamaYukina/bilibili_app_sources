package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.playerbizcommonv2.widget.dowanload.q;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadSinglePageComponent$bind$2.class */
final class VideoDownloadSinglePageComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Dr0.l $binding;
    private Object L$0;
    int label;
    final q this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadSinglePageComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadSinglePageComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Dr0.l $binding;
        int label;
        final q this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, Dr0.l lVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = qVar;
            this.$binding = lVar;
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
                q qVar = this.this$0;
                Dr0.l lVar = this.$binding;
                View view = lVar.f3105b;
                TextView textView = lVar.f3109f;
                ImageView imageView = lVar.f3108e;
                RingProgressBar ringProgressBar = lVar.f3107d;
                LottieAnimationView lottieAnimationView = lVar.f3106c;
                q.a aVar = qVar.f82584a;
                StateFlow<Long> stateFlow = qVar.f82585b;
                this.label = 1;
                qVar.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new VideoDownloadSinglePageComponent$collectItem$2(textView, view, aVar, ringProgressBar, stateFlow, qVar, lottieAnimationView, imageView, null), this);
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
    public VideoDownloadSinglePageComponent$bind$2(q qVar, Dr0.l lVar, Continuation<? super VideoDownloadSinglePageComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = qVar;
        this.$binding = lVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoDownloadSinglePageComponent$bind$2 videoDownloadSinglePageComponent$bind$2 = new VideoDownloadSinglePageComponent$bind$2(this.this$0, this.$binding, continuation);
        videoDownloadSinglePageComponent$bind$2.L$0 = obj;
        return videoDownloadSinglePageComponent$bind$2;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
