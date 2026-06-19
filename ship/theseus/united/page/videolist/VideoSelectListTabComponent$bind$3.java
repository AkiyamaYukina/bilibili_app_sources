package com.bilibili.ship.theseus.united.page.videolist;

import android.widget.TextView;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListTabComponent$bind$3.class */
final class VideoSelectListTabComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final TextView $title;
    private Object L$0;
    int label;
    final m this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListTabComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListTabComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TextView $title;
        int label;
        final m this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videolist.VideoSelectListTabComponent$bind$3$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListTabComponent$bind$3$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f103555a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final m f103556b;

            public a(TextView textView, m mVar) {
                this.f103555a = textView;
                this.f103556b = mVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                long jLongValue = ((Number) obj).longValue();
                TextView textView = this.f103555a;
                m mVar = this.f103556b;
                long j7 = mVar.f103628a.f103632a;
                b bVar = mVar.f103629b;
                textView.setTextColor(jLongValue == j7 ? bVar.f103586e : bVar.f103585d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m mVar, TextView textView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mVar;
            this.$title = textView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$title, continuation);
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
                m mVar = this.this$0;
                StateFlow<Long> stateFlow = mVar.f103630c;
                a aVar = new a(this.$title, mVar);
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
    public VideoSelectListTabComponent$bind$3(m mVar, TextView textView, Continuation<? super VideoSelectListTabComponent$bind$3> continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$title = textView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VideoSelectListTabComponent$bind$3 videoSelectListTabComponent$bind$3 = new VideoSelectListTabComponent$bind$3(this.this$0, this.$title, continuation);
        videoSelectListTabComponent$bind$3.L$0 = obj;
        return videoSelectListTabComponent$bind$3;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$title, null), 3, (Object) null);
    }
}
