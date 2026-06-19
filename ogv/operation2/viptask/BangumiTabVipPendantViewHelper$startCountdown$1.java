package com.bilibili.ogv.operation2.viptask;

import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.bililive.room.ui.roomv3.voice.r;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.operation2.viptask.a;
import java.util.List;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/BangumiTabVipPendantViewHelper$startCountdown$1.class */
final class BangumiTabVipPendantViewHelper$startCountdown$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $winId;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.viptask.BangumiTabVipPendantViewHelper$startCountdown$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/BangumiTabVipPendantViewHelper$startCountdown$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final String $winId;
        int label;
        final com.bilibili.ogv.operation2.viptask.a this$0;

        /* JADX INFO: renamed from: com.bilibili.ogv.operation2.viptask.BangumiTabVipPendantViewHelper$startCountdown$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/BangumiTabVipPendantViewHelper$startCountdown$1$1$1.class */
        public static final class C04361 extends SuspendLambda implements Function2<Long, Continuation<? super Boolean>, Object> {
            int label;
            final com.bilibili.ogv.operation2.viptask.a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04361(com.bilibili.ogv.operation2.viptask.a aVar, Continuation<? super C04361> continuation) {
                super(2, continuation);
                this.this$0 = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04361(this.this$0, continuation);
            }

            public final Object invoke(long j7, Continuation<? super Boolean> continuation) {
                return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(Intrinsics.areEqual(this.this$0.h, a.InterfaceC0437a.b.f71023a));
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.operation2.viptask.BangumiTabVipPendantViewHelper$startCountdown$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/BangumiTabVipPendantViewHelper$startCountdown$1$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.ogv.operation2.viptask.a f71010a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f71011b;

            public a(com.bilibili.ogv.operation2.viptask.a aVar, String str) {
                this.f71010a = aVar;
                this.f71011b = str;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iLongValue = (int) ((Number) obj).longValue();
                com.bilibili.ogv.operation2.viptask.a aVar = this.f71010a;
                aVar.f71019i = iLongValue;
                if (iLongValue > 0) {
                    aVar.f71018g.setProgress(aVar.f71020j - iLongValue);
                    TextView textView = aVar.f71017f;
                    textView.setText(textView.getContext().getString(2131821942, String.valueOf(aVar.f71019i / 1000)));
                } else if (!aVar.h.a()) {
                    aVar.h = a.InterfaceC0437a.C0438a.f71022a;
                    Job job = aVar.f71021k;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    Neurons.reportExposure$default(false, C8770a.a(new StringBuilder("pgc."), aVar.f71013b, ".task-timer.end.show"), com.bilibili.ogv.operation2.viptask.a.b(), (List) null, 8, (Object) null);
                    aVar.f71015d.setVisibility(8);
                    Group group = aVar.f71016e;
                    group.setVisibility(0);
                    group.postDelayed(new r(aVar, 1), 5000L);
                    BuildersKt.launch$default(LifecycleKt.getCoroutineScope(aVar.f71014c), (CoroutineContext) null, (CoroutineStart) null, new BangumiTabVipPendantViewHelper$completeVipTask$2(aVar, this.f71011b, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ogv.operation2.viptask.a aVar, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$winId = str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$winId, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTakeWhile = FlowKt.takeWhile(FlowKt.flow(new BangumiTabVipPendantViewHelper$countdownTimerFlow$1(r0.f71019i, 100L, this.this$0, null)), new C04361(this.this$0, null));
                a aVar = new a(this.this$0, this.$winId);
                this.label = 1;
                if (flowTakeWhile.collect(aVar, this) == coroutine_suspended) {
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
    public BangumiTabVipPendantViewHelper$startCountdown$1(a aVar, String str, Continuation<? super BangumiTabVipPendantViewHelper$startCountdown$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$winId = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BangumiTabVipPendantViewHelper$startCountdown$1(this.this$0, this.$winId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = this.this$0;
            LifecycleRegistry lifecycleRegistry = aVar.f71014c;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, this.$winId, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleRegistry, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
