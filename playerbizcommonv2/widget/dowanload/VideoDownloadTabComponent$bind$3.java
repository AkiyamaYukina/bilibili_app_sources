package com.bilibili.playerbizcommonv2.widget.dowanload;

import android.content.Context;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
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
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadTabComponent$bind$3.class */
final class VideoDownloadTabComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Context $context;
    final TextView $title;
    private Object L$0;
    int label;
    final t this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadTabComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadTabComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final TextView $title;
        int label;
        final t this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.dowanload.VideoDownloadTabComponent$bind$3$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/VideoDownloadTabComponent$bind$3$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f82526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final t f82527b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Context f82528c;

            public a(TextView textView, t tVar, Context context) {
                this.f82526a = textView;
                this.f82527b = tVar;
                this.f82528c = context;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f82526a.setTextColor(((Number) obj).longValue() == this.f82527b.f82595a.f82598a ? ContextCompat.getColor(this.f82528c, R$color.Pi5) : ContextCompat.getColor(this.f82528c, R$color.Text2));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(t tVar, TextView textView, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = tVar;
            this.$title = textView;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$title, this.$context, continuation);
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
                t tVar = this.this$0;
                MutableStateFlow mutableStateFlow = tVar.f82596b;
                a aVar = new a(this.$title, tVar, this.$context);
                this.label = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
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
    public VideoDownloadTabComponent$bind$3(t tVar, TextView textView, Context context, Continuation<? super VideoDownloadTabComponent$bind$3> continuation) {
        super(2, continuation);
        this.this$0 = tVar;
        this.$title = textView;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoDownloadTabComponent$bind$3 videoDownloadTabComponent$bind$3 = new VideoDownloadTabComponent$bind$3(this.this$0, this.$title, this.$context, continuation);
        videoDownloadTabComponent$bind$3.L$0 = obj;
        return videoDownloadTabComponent$bind$3;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$title, this.$context, null), 3, (Object) null);
    }
}
