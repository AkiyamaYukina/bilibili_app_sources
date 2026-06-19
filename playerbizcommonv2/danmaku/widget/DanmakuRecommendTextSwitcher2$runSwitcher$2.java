package com.bilibili.playerbizcommonv2.danmaku.widget;

import com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher2$runSwitcher$2.class */
final class DanmakuRecommendTextSwitcher2$runSwitcher$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final DanmakuRecommendTextSwitcher2 this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2$runSwitcher$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher2$runSwitcher$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DanmakuRecommendTextSwitcher2 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2$runSwitcher$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher2$runSwitcher$2$1$1.class */
        public static final class C05311 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final DanmakuRecommendTextSwitcher2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05311(DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2, Continuation<? super C05311> continuation) {
                super(2, continuation);
                this.this$0 = danmakuRecommendTextSwitcher2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05311 c05311 = new C05311(this.this$0, continuation);
                c05311.Z$0 = ((Boolean) obj).booleanValue();
                return c05311;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                j4.t.a("visibleStateFlow, ", "DanmakuRecommendTextSwitcher", z6);
                if (z6) {
                    this.this$0.setVisibility(0);
                } else {
                    this.this$0.setVisibility(8);
                    this.this$0.f81609i.setValue((Object) null);
                    this.this$0.setCurrentText("");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = danmakuRecommendTextSwitcher2;
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
                StateFlow<Boolean> visibleStateFlow = this.this$0.getVisibleStateFlow();
                C05311 c05311 = new C05311(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(visibleStateFlow, c05311, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2$runSwitcher$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher2$runSwitcher$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DanmakuRecommendTextSwitcher2 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2$runSwitcher$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/DanmakuRecommendTextSwitcher2$runSwitcher$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<DanmakuRecommendTextSwitcher2.a, Continuation<? super Unit>, Object> {
            int I$0;
            int I$1;
            int I$2;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;
            final DanmakuRecommendTextSwitcher2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = danmakuRecommendTextSwitcher2;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(DanmakuRecommendTextSwitcher2.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x02cd, code lost:
            
                r10 = r0;
                r17 = r7;
                r7 = r14;
             */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x01d8  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x02d6  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01b5 -> B:46:0x01ce). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x02a6 -> B:65:0x02b6). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2$runSwitcher$2.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = danmakuRecommendTextSwitcher2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2 = this.this$0;
                MutableStateFlow<DanmakuRecommendTextSwitcher2.a> mutableStateFlow = danmakuRecommendTextSwitcher2.f81609i;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(danmakuRecommendTextSwitcher2, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public DanmakuRecommendTextSwitcher2$runSwitcher$2(DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2, Continuation<? super DanmakuRecommendTextSwitcher2$runSwitcher$2> continuation) {
        super(2, continuation);
        this.this$0 = danmakuRecommendTextSwitcher2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DanmakuRecommendTextSwitcher2$runSwitcher$2 danmakuRecommendTextSwitcher2$runSwitcher$2 = new DanmakuRecommendTextSwitcher2$runSwitcher$2(this.this$0, continuation);
        danmakuRecommendTextSwitcher2$runSwitcher$2.L$0 = obj;
        return danmakuRecommendTextSwitcher2$runSwitcher$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
    }
}
