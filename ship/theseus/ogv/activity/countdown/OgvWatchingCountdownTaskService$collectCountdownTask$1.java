package com.bilibili.ship.theseus.ogv.activity.countdown;

import com.bilibili.ship.theseus.ogv.activity.VipWatchingCountdownTaskVo;
import com.bilibili.ship.theseus.ogv.activity.countdown.OgvWatchingCountdownTaskService;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService$collectCountdownTask$1.class */
final class OgvWatchingCountdownTaskService$collectCountdownTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvWatchingCountdownTaskService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.countdown.OgvWatchingCountdownTaskService$collectCountdownTask$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService$collectCountdownTask$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<VipWatchingCountdownTaskVo, c.a, Continuation<? super Pair<? extends VipWatchingCountdownTaskVo, ? extends c.a>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo, c.a aVar, Continuation<? super Pair<VipWatchingCountdownTaskVo, c.a>> continuation) {
            return OgvWatchingCountdownTaskService$collectCountdownTask$1.invokeSuspend$lambda$0(vipWatchingCountdownTaskVo, aVar, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.countdown.OgvWatchingCountdownTaskService$collectCountdownTask$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService$collectCountdownTask$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends VipWatchingCountdownTaskVo, ? extends c.a>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final OgvWatchingCountdownTaskService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(OgvWatchingCountdownTaskService ogvWatchingCountdownTaskService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ogvWatchingCountdownTaskService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invokeSuspend$lambda$0() {
            return 5;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<VipWatchingCountdownTaskVo, c.a> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo = (VipWatchingCountdownTaskVo) pair.component1();
                c.a aVar = (c.a) pair.component2();
                if (!this.this$0.a()) {
                    return Unit.INSTANCE;
                }
                if (vipWatchingCountdownTaskVo != null) {
                    TheseusFloatLayerService theseusFloatLayerService = this.this$0.f91517f;
                    OgvWatchingCountdownTaskService.OgvWatchingCountdownComponent ogvWatchingCountdownComponent = new OgvWatchingCountdownTaskService.OgvWatchingCountdownComponent(this.this$0, vipWatchingCountdownTaskVo, !aVar.f102988b);
                    TheseusFloatLayerService.a aVar2 = new TheseusFloatLayerService.a(0, 0, 0, 0, new Object());
                    this.label = 1;
                    if (theseusFloatLayerService.e(ogvWatchingCountdownComponent, aVar2, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvWatchingCountdownTaskService$collectCountdownTask$1(OgvWatchingCountdownTaskService ogvWatchingCountdownTaskService, Continuation<? super OgvWatchingCountdownTaskService$collectCountdownTask$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvWatchingCountdownTaskService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo, c.a aVar, Continuation continuation) {
        return new Pair(vipWatchingCountdownTaskVo, aVar);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvWatchingCountdownTaskService$collectCountdownTask$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvWatchingCountdownTaskService ogvWatchingCountdownTaskService = this.this$0;
            Flow flowCombine = FlowKt.combine(ogvWatchingCountdownTaskService.h, ogvWatchingCountdownTaskService.f91516e.c(), AnonymousClass3.INSTANCE);
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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
