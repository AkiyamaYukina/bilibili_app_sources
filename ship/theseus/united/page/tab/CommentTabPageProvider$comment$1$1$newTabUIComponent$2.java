package com.bilibili.ship.theseus.united.page.tab;

import com.bilibili.ship.theseus.united.page.tab.f;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabPageProvider$comment$1$1$newTabUIComponent$2.class */
final class CommentTabPageProvider$comment$1$1$newTabUIComponent$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RelationRepository $relationRepo;
    final Flow<Boolean> $selectedFlow;
    final f.a $vm;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final RelationRepository $relationRepo;
        final Flow<Boolean> $selectedFlow;
        final f.a $vm;
        private Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$1.class */
        public static final class C11151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final RelationRepository $relationRepo;
            final f.a $vm;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$1$1.class */
            public static final class C11161 extends SuspendLambda implements Function2<StatData, Continuation<? super Unit>, Object> {
                final f.a $vm;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11161(f.a aVar, Continuation<? super C11161> continuation) {
                    super(2, continuation);
                    this.$vm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11161 c11161 = new C11161(this.$vm, continuation);
                    c11161.L$0 = obj;
                    return c11161;
                }

                public final Object invoke(StatData statData, Continuation<? super Unit> continuation) {
                    return create(statData, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    StatData statData = (StatData) this.L$0;
                    if (statData == null) {
                        return Unit.INSTANCE;
                    }
                    this.$vm.f103180b.setValue(Boxing.boxLong(statData.f104023e));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11151(RelationRepository relationRepository, f.a aVar, Continuation<? super C11151> continuation) {
                super(2, continuation);
                this.$relationRepo = relationRepository;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C11151(this.$relationRepo, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<StatData> stateFlow = this.$relationRepo.f104004m;
                    C11161 c11161 = new C11161(this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c11161, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final RelationRepository $relationRepo;
            final f.a $vm;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$2$1.class */
            public static final class C11171 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final f.a $vm;
                boolean Z$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11171(f.a aVar, Continuation<? super C11171> continuation) {
                    super(2, continuation);
                    this.$vm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11171 c11171 = new C11171(this.$vm, continuation);
                    c11171.Z$0 = ((Boolean) obj).booleanValue();
                    return c11171;
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
                    this.$vm.f103179a.setValue(Boxing.boxBoolean(this.Z$0));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RelationRepository relationRepository, f.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$relationRepo = relationRepository;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$relationRepo, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Boolean> stateFlow = this.$relationRepo.f104006o;
                    C11171 c11171 = new C11171(this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c11171, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Flow<Boolean> $selectedFlow;
            final f.a $vm;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabPageProvider$comment$1$1$newTabUIComponent$2$1$3$1.class */
            public static final class C11181 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final f.a $vm;
                boolean Z$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11181(f.a aVar, Continuation<? super C11181> continuation) {
                    super(2, continuation);
                    this.$vm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11181 c11181 = new C11181(this.$vm, continuation);
                    c11181.Z$0 = ((Boolean) obj).booleanValue();
                    return c11181;
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
                    this.$vm.f103182d.setValue(Boxing.boxBoolean(this.Z$0));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Flow<Boolean> flow, f.a aVar, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$selectedFlow = flow;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$selectedFlow, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$selectedFlow;
                    C11181 c11181 = new C11181(this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c11181, this) == coroutine_suspended) {
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
        public AnonymousClass1(RelationRepository relationRepository, f.a aVar, Flow<Boolean> flow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$relationRepo = relationRepository;
            this.$vm = aVar;
            this.$selectedFlow = flow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$relationRepo, this.$vm, this.$selectedFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C11151(this.$relationRepo, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$relationRepo, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$selectedFlow, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTabPageProvider$comment$1$1$newTabUIComponent$2(RelationRepository relationRepository, f.a aVar, Flow<Boolean> flow, Continuation<? super CommentTabPageProvider$comment$1$1$newTabUIComponent$2> continuation) {
        super(1, continuation);
        this.$relationRepo = relationRepository;
        this.$vm = aVar;
        this.$selectedFlow = flow;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CommentTabPageProvider$comment$1$1$newTabUIComponent$2(this.$relationRepo, this.$vm, this.$selectedFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$relationRepo, this.$vm, this.$selectedFlow, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
