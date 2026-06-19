package com.bilibili.ship.theseus.united.page.danmaku;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.playerbizcommonv2.danmaku.widget.DanmakuRecommendTextSwitcher2;
import com.bilibili.ship.theseus.united.page.danmaku.C;
import dv0.C6855b;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuRecommendSwitcherComponent$bind$2.class */
final class HalfScreenDanmakuRecommendSwitcherComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C6855b $binding;
    private Object L$0;
    int label;
    final C this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuRecommendSwitcherComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuRecommendSwitcherComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6855b $binding;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6855b c6855b, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = c6855b;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2 = this.$binding.f116903b;
                this.label = 1;
                if (danmakuRecommendTextSwitcher2.d(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuRecommendSwitcherComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuRecommendSwitcherComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6855b $binding;
        int label;
        final C this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuRecommendSwitcherComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuRecommendSwitcherComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final C this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C c7, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = c7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.L$0;
                    defpackage.a.b("[theseus-united-HalfScreenDanmakuRecommendSwitcherComponent$bind$2$2$1-invokeSuspend] ", C4496a.a("currentTextFlow, ", str), "HalfScreenDanmakuRecommendSwitcherComponent$bind$2$2$1-invokeSuspend");
                    MutableSharedFlow<C.a> mutableSharedFlow = this.this$0.f99314b;
                    C.a.C0970a c0970a = new C.a.C0970a(str);
                    this.label = 1;
                    if (mutableSharedFlow.emit(c0970a, this) == coroutine_suspended) {
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
        public AnonymousClass2(C6855b c6855b, C c7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c6855b;
            this.this$0 = c7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<String> currentTextFlow = this.$binding.f116903b.getCurrentTextFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(currentTextFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuRecommendSwitcherComponent$bind$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuRecommendSwitcherComponent$bind$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6855b $binding;
        int label;
        final C this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuRecommendSwitcherComponent$bind$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/HalfScreenDanmakuRecommendSwitcherComponent$bind$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C.b, Continuation<? super Unit>, Object> {
            final C6855b $binding;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6855b c6855b, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = c6855b;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C.b bVar = (C.b) this.L$0;
                if (bVar == null) {
                    return Unit.INSTANCE;
                }
                DanmakuRecommendTextSwitcher2 danmakuRecommendTextSwitcher2 = this.$binding.f116903b;
                if (bVar instanceof C.b.d) {
                    C.b.d dVar = (C.b.d) bVar;
                    danmakuRecommendTextSwitcher2.b(dVar.f99323d, dVar.f99320a, dVar.f99321b, dVar.f99322c);
                    BLog.i("DanmakuRecommendTextSwitcher", "show");
                    danmakuRecommendTextSwitcher2.f81605d.setValue(Boolean.TRUE);
                    danmakuRecommendTextSwitcher2.e(dVar.f99320a, dVar.f99321b, dVar.f99322c, true);
                } else if (bVar instanceof C.b.a) {
                    danmakuRecommendTextSwitcher2.c();
                } else if (bVar instanceof C.b.C0971b) {
                    BLog.i("HalfScreenDanmakuRecommendSwitcherComponent", "switcher keep");
                } else {
                    if (!(bVar instanceof C.b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    danmakuRecommendTextSwitcher2.getClass();
                    BLog.i("DanmakuRecommendTextSwitcher", "removeAllWord");
                    danmakuRecommendTextSwitcher2.h.clear();
                    BLog.i("DanmakuRecommendTextSwitcher", "stopAnimation");
                    danmakuRecommendTextSwitcher2.f81609i.setValue((Object) null);
                    danmakuRecommendTextSwitcher2.c();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C c7, C6855b c6855b, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c7;
            this.$binding = c6855b;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<C.b> stateFlow = this.this$0.f99313a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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
    public HalfScreenDanmakuRecommendSwitcherComponent$bind$2(C6855b c6855b, C c7, Continuation<? super HalfScreenDanmakuRecommendSwitcherComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = c6855b;
        this.this$0 = c7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HalfScreenDanmakuRecommendSwitcherComponent$bind$2 halfScreenDanmakuRecommendSwitcherComponent$bind$2 = new HalfScreenDanmakuRecommendSwitcherComponent$bind$2(this.$binding, this.this$0, continuation);
        halfScreenDanmakuRecommendSwitcherComponent$bind$2.L$0 = obj;
        return halfScreenDanmakuRecommendSwitcherComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
