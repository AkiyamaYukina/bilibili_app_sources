package com.bilibili.ship.theseus.united.page.comment;

import android.view.ViewGroup;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$2;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$2.class */
final class TheseusCommentService$createNewState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Ref.ObjectRef<ViewGroup> $cachedContentContainer;
    final com.bilibili.app.comm.comment.kntr.adapter.a $kntrFragment;
    private Object L$0;
    int label;
    final TheseusCommentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<ViewGroup> $cachedContentContainer;
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$2$1$1.class */
        public static final class C09621 extends SuspendLambda implements Function2<TheseusCommentService.e, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<ViewGroup> $cachedContentContainer;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09621(Ref.ObjectRef<ViewGroup> objectRef, Continuation<? super C09621> continuation) {
                super(2, continuation);
                this.$cachedContentContainer = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09621 c09621 = new C09621(this.$cachedContentContainer, continuation);
                c09621.L$0 = obj;
                return c09621;
            }

            public final Object invoke(TheseusCommentService.e eVar, Continuation<? super Unit> continuation) {
                return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TheseusCommentService.e eVar = (TheseusCommentService.e) this.L$0;
                this.$cachedContentContainer.element = eVar != null ? eVar.f99288a : null;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusCommentService theseusCommentService, Ref.ObjectRef<ViewGroup> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
            this.$cachedContentContainer = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$cachedContentContainer, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<TheseusCommentService.e> flow = this.this$0.f99232d;
                C09621 c09621 = new C09621(this.$cachedContentContainer, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c09621, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.app.comm.comment.kntr.adapter.a $kntrFragment;
        int label;
        final TheseusCommentService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusCommentService theseusCommentService, com.bilibili.app.comm.comment.kntr.adapter.a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
            this.$kntrFragment = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(com.bilibili.app.comm.comment.kntr.adapter.a aVar, boolean z6) {
            return aVar.onBackPressed();
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$kntrFragment, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BackActionRepository backActionRepository = this.this$0.f99239l;
                final com.bilibili.app.comm.comment.kntr.adapter.a aVar = this.$kntrFragment;
                Function1<? super Boolean, Boolean> function1 = new Function1(aVar) { // from class: com.bilibili.ship.theseus.united.page.comment.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final com.bilibili.app.comm.comment.kntr.adapter.a f99296a;

                    {
                        this.f99296a = aVar;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(TheseusCommentService$createNewState$2.AnonymousClass2.invokeSuspend$lambda$0(this.f99296a, ((Boolean) obj2).booleanValue()));
                    }
                };
                this.label = 1;
                if (backActionRepository.b(function1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.app.comm.comment.kntr.adapter.a $kntrFragment;
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<TabPage.LocatableTag, Continuation<? super Unit>, Object> {
            final com.bilibili.app.comm.comment.kntr.adapter.a $kntrFragment;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(com.bilibili.app.comm.comment.kntr.adapter.a aVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$kntrFragment = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$kntrFragment, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(TabPage.LocatableTag locatableTag, Continuation<? super Unit> continuation) {
                return create(locatableTag, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((TabPage.LocatableTag) this.L$0) == TabPage.LocatableTag.Comment) {
                    this.$kntrFragment.T();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusCommentService theseusCommentService, com.bilibili.app.comm.comment.kntr.adapter.a aVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
            this.$kntrFragment = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$kntrFragment, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<TabPage.LocatableTag> sharedFlow = this.this$0.f99237j.f103212b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$kntrFragment, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.app.comm.comment.kntr.adapter.a $kntrFragment;
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final com.bilibili.app.comm.comment.kntr.adapter.a $kntrFragment;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(com.bilibili.app.comm.comment.kntr.adapter.a aVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$kntrFragment = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$kntrFragment, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                if (this.Z$0) {
                    this.$kntrFragment.a();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusCommentService theseusCommentService, com.bilibili.app.comm.comment.kntr.adapter.a aVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
            this.$kntrFragment = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$kntrFragment, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Boolean> mutableSharedFlow = this.this$0.f99226L;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$kntrFragment, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableSharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public TheseusCommentService$createNewState$2(TheseusCommentService theseusCommentService, Ref.ObjectRef<ViewGroup> objectRef, com.bilibili.app.comm.comment.kntr.adapter.a aVar, Continuation<? super TheseusCommentService$createNewState$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusCommentService;
        this.$cachedContentContainer = objectRef;
        this.$kntrFragment = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusCommentService$createNewState$2 theseusCommentService$createNewState$2 = new TheseusCommentService$createNewState$2(this.this$0, this.$cachedContentContainer, this.$kntrFragment, continuation);
        theseusCommentService$createNewState$2.L$0 = obj;
        return theseusCommentService$createNewState$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$cachedContentContainer, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$kntrFragment, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$kntrFragment, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$kntrFragment, null), 3, (Object) null);
    }
}
