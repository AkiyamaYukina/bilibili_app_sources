package com.bilibili.ship.theseus.united.page.tab;

import android.animation.AnimatorSet;
import android.widget.FrameLayout;
import com.bilibili.ship.theseus.united.page.tab.f;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$bind$2.class */
final class CommentTabUIComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final FrameLayout $container;
    private Object L$0;
    int label;
    final f this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabUIComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FrameLayout $container;
        int label;
        final f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabUIComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$bind$2$1$1.class */
        public static final class C11191 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final FrameLayout $container;
            boolean Z$0;
            int label;
            final f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11191(FrameLayout frameLayout, f fVar, Continuation<? super C11191> continuation) {
                super(2, continuation);
                this.$container = frameLayout;
                this.this$0 = fVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11191 c11191 = new C11191(this.$container, this.this$0, continuation);
                c11191.Z$0 = ((Boolean) obj).booleanValue();
                return c11191;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                AnimatorSet animatorSet;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                this.$container.setSelected(z6);
                if (z6 && (animatorSet = this.this$0.f103177c) != null) {
                    animatorSet.cancel();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, FrameLayout frameLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$container = frameLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$container, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = fVar.f103175a.f103182d;
                C11191 c11191 = new C11191(this.$container, fVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c11191, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabUIComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FrameLayout $container;
        int label;
        final f this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabUIComponent$bind$2$2$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$bind$2$2$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<Long, Boolean, Continuation<? super Pair<? extends Long, ? extends Boolean>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(long j7, boolean z6, Continuation<? super Pair<Long, Boolean>> continuation) {
                return AnonymousClass2.invokeSuspend$lambda$0(j7, z6, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Number) obj).longValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<Long, Boolean>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabUIComponent$bind$2$2$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$bind$2$2$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends Long, ? extends Boolean>, Continuation<? super Unit>, Object> {
            final FrameLayout $container;
            int label;
            final f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(f fVar, FrameLayout frameLayout, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = fVar;
                this.$container = frameLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$container, continuation);
            }

            public final Object invoke(Pair<Long, Boolean> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    f fVar = this.this$0;
                    FrameLayout frameLayout = this.$container;
                    this.label = 1;
                    if (f.c(fVar, frameLayout, this) == coroutine_suspended) {
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
        public AnonymousClass2(f fVar, FrameLayout frameLayout, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$container = frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(long j7, boolean z6, Continuation continuation) {
            return new Pair(Boxing.boxLong(j7), Boxing.boxBoolean(z6));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$container, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                f.a aVar = this.this$0.f103175a;
                Flow flowCombine = FlowKt.combine(aVar.f103180b, aVar.f103179a, AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$container, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTabUIComponent$bind$2(f fVar, FrameLayout frameLayout, Continuation<? super CommentTabUIComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$container = frameLayout;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommentTabUIComponent$bind$2 commentTabUIComponent$bind$2 = new CommentTabUIComponent$bind$2(this.this$0, this.$container, continuation);
        commentTabUIComponent$bind$2.L$0 = obj;
        return commentTabUIComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$container, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this.this$0, this.$container, null), 1, (Object) null);
    }
}
