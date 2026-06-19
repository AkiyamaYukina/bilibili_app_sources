package com.bilibili.ship.theseus.ugc.ad;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.IAdUnderPlayerCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$2.class */
final class DetailAdService$onViewsCreated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final DetailAdService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final DetailAdService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$onViewsCreated$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onViewsCreated$2$1$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f96280a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f96280a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailAdService detailAdService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailAdService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Lifecycle.Event event, Continuation<? super Unit> continuation) {
            return create(event, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Lifecycle.Event event = (Lifecycle.Event) this.L$0;
            BLog.d("BannerFlipperLogger", event.toString());
            int i7 = a.f96280a[event.ordinal()];
            if (i7 == 1) {
                IAdUnderPlayerCallback iAdUnderPlayerCallback = this.this$0.f96270t;
                if (iAdUnderPlayerCallback != null) {
                    iAdUnderPlayerCallback.onStart();
                }
            } else if (i7 == 2) {
                this.this$0.f96273w.setValue(Boxing.boxBoolean(false));
                IAdUnderPlayerCallback iAdUnderPlayerCallback2 = this.this$0.f96270t;
                if (iAdUnderPlayerCallback2 != null) {
                    iAdUnderPlayerCallback2.onStop();
                }
            } else if (i7 == 3) {
                this.this$0.f96273w.setValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailAdService$onViewsCreated$2(DetailAdService detailAdService, Continuation<? super DetailAdService$onViewsCreated$2> continuation) {
        super(2, continuation);
        this.this$0 = detailAdService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailAdService$onViewsCreated$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f96257f);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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
