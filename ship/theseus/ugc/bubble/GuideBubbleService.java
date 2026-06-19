package com.bilibili.ship.theseus.ugc.bubble;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.utils.j;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/bubble/GuideBubbleService.class */
@StabilityInferred(parameters = 0)
public final class GuideBubbleService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C7893a f96342b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.bubble.GuideBubbleService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/bubble/GuideBubbleService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final GuideBubbleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.bubble.GuideBubbleService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/bubble/GuideBubbleService$1$1.class */
        public static final class C08131 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;

            public C08131(Continuation<? super C08131> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08131 c08131 = new C08131(continuation);
                c08131.L$0 = obj;
                return c08131;
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((C7893a.C1318a) this.L$0) == null) {
                    return Unit.INSTANCE;
                }
                Map<Long, Integer> map = j.f81937a;
                if (!map.isEmpty()) {
                    BLog.i("GuideBubbleTimesLimitHelper", "clear bubble show time map");
                    ((LinkedHashMap) map).clear();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GuideBubbleService guideBubbleService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = guideBubbleService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<C7893a.C1318a> stateFlow = this.this$0.f96342b.f123393f;
                C08131 c08131 = new C08131(null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08131, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.bubble.GuideBubbleService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/bubble/GuideBubbleService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.bubble.GuideBubbleService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/bubble/GuideBubbleService$2$a.class */
        public static final class a implements com.bilibili.lib.coroutineextension.j {
            public final void invoke() {
                Map<Long, Integer> map = j.f81937a;
                if (map.isEmpty()) {
                    return;
                }
                BLog.i("GuideBubbleTimesLimitHelper", "clear bubble show time map");
                ((LinkedHashMap) map).clear();
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13, types: [com.bilibili.lib.coroutineextension.j] */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            Object obj3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                obj2 = new Object();
                try {
                    this.L$0 = obj2;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    obj3 = obj2;
                    obj3.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bilibili.lib.coroutineextension.j jVar = (com.bilibili.lib.coroutineextension.j) this.L$0;
                obj3 = jVar;
                try {
                    ResultKt.throwOnFailure(obj);
                    obj2 = jVar;
                } catch (Throwable th2) {
                    th = th2;
                    obj3.invoke();
                    throw th;
                }
            }
            obj3 = obj2;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public GuideBubbleService(@NotNull CoroutineScope coroutineScope, @NotNull C7893a c7893a) {
        this.f96341a = coroutineScope;
        this.f96342b = c7893a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(null), 3, (Object) null);
    }
}
