package com.bilibili.ship.theseus.united.page.comment;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.app.comment3.CommentV3Fragment;
import com.bilibili.app.comment3.abtest.AbtestBatchData;
import com.bilibili.app.comment3.abtest.CommentAbtestRepository;
import com.bilibili.app.comment3.abtest.ReplyABResult;
import com.bilibili.app.comment3.abtest.ResultData;
import com.bilibili.app.comment3.ui.CommentContainerImpl;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3;
import com.bilibili.ship.theseus.united.page.tab.TabPage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3.class */
final class TheseusCommentService$createNewState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final TheseusCommentService.d.b $commentConfig;
    final CommentV3Fragment $fragment;
    private Object L$0;
    int label;
    final TheseusCommentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final CommentV3Fragment $fragment;
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$1$1.class */
        public static final class C09631 extends SuspendLambda implements Function2<TheseusCommentService.e, Continuation<? super Unit>, Object> {
            final CommentV3Fragment $fragment;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09631(CommentV3Fragment commentV3Fragment, Continuation<? super C09631> continuation) {
                super(2, continuation);
                this.$fragment = commentV3Fragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09631 c09631 = new C09631(this.$fragment, continuation);
                c09631.L$0 = obj;
                return c09631;
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
                this.$fragment.Ed(eVar != null ? eVar.f99288a : null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusCommentService theseusCommentService, CommentV3Fragment commentV3Fragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
            this.$fragment = commentV3Fragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$fragment, continuation);
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
                C09631 c09631 = new C09631(this.$fragment, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c09631, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final CommentV3Fragment $fragment;
        int label;
        final TheseusCommentService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusCommentService theseusCommentService, CommentV3Fragment commentV3Fragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
            this.$fragment = commentV3Fragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(CommentV3Fragment commentV3Fragment, boolean z6) {
            return commentV3Fragment.onBackPressed();
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$fragment, continuation);
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
                final CommentV3Fragment commentV3Fragment = this.$fragment;
                Function1<? super Boolean, Boolean> function1 = new Function1(commentV3Fragment) { // from class: com.bilibili.ship.theseus.united.page.comment.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CommentV3Fragment f99297a;

                    {
                        this.f99297a = commentV3Fragment;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(TheseusCommentService$createNewState$3.AnonymousClass2.invokeSuspend$lambda$0(this.f99297a, ((Boolean) obj2).booleanValue()));
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final CommentV3Fragment $fragment;
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<TabPage.LocatableTag, Continuation<? super Unit>, Object> {
            final CommentV3Fragment $fragment;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CommentV3Fragment commentV3Fragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$fragment = commentV3Fragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fragment, continuation);
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
                    this.$fragment.T();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusCommentService theseusCommentService, CommentV3Fragment commentV3Fragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
            this.$fragment = commentV3Fragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$fragment, continuation);
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fragment, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final TheseusCommentService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusCommentService theseusCommentService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusCommentService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TabPage tabPage = (TabPage) CollectionsKt.getOrNull(this.this$0.f99252y.f103191a, this.I$0);
                if (tabPage != null) {
                    TabPage.LocatableTag locatableTagB = tabPage.b();
                    if (locatableTagB != null) {
                        if (locatableTagB != TabPage.LocatableTag.Comment) {
                            locatableTagB = null;
                        }
                        if (locatableTagB != null) {
                            TheseusCommentService theseusCommentService = this.this$0;
                            if (((Boolean) theseusCommentService.f99253z.f102268t.getValue()).booleanValue()) {
                                theseusCommentService.f99247t.d();
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusCommentService theseusCommentService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusCommentService theseusCommentService = this.this$0;
                StateFlow<Integer> stateFlow = theseusCommentService.f99237j.f103214d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusCommentService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusCommentService.d.b $commentConfig;
        final CommentV3Fragment $fragment;
        int label;
        final TheseusCommentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final TheseusCommentService.d.b $commentConfig;
            final CommentV3Fragment $fragment;
            private Object L$0;
            int label;
            final TheseusCommentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$1.class */
            public static final class C09641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final CommentV3Fragment $fragment;
                int label;
                final TheseusCommentService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$1$a */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$1$a.class */
                public static final class a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TheseusCommentService f99266a;

                    public a(TheseusCommentService theseusCommentService) {
                        this.f99266a = theseusCommentService;
                    }

                    public final Object emit(Object obj, Continuation continuation) {
                        this.f99266a.f99242o.u(((Number) obj).longValue());
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09641(CommentV3Fragment commentV3Fragment, TheseusCommentService theseusCommentService, Continuation<? super C09641> continuation) {
                    super(2, continuation);
                    this.$fragment = commentV3Fragment;
                    this.this$0 = theseusCommentService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09641(this.$fragment, this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flowQe = this.$fragment.Qe();
                        a aVar = new a(this.this$0);
                        this.label = 1;
                        if (flowQe.collect(aVar, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$2.class */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final CommentV3Fragment $fragment;
                int label;
                final TheseusCommentService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$2$a */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$2$a.class */
                public static final class a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TheseusCommentService f99267a;

                    public a(TheseusCommentService theseusCommentService) {
                        this.f99267a = theseusCommentService;
                    }

                    public final Object emit(Object obj, Continuation continuation) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        this.f99267a.f99242o.f104005n.setValue(bool);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(CommentV3Fragment commentV3Fragment, TheseusCommentService theseusCommentService, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$fragment = commentV3Fragment;
                    this.this$0 = theseusCommentService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.$fragment, this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flow = (Flow) this.$fragment.of().b.d.getValue();
                        a aVar = new a(this.this$0);
                        this.label = 1;
                        if (flow.collect(aVar, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$3, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$3.class */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final CommentV3Fragment $fragment;
                int label;
                final TheseusCommentService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(TheseusCommentService theseusCommentService, CommentV3Fragment commentV3Fragment, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = theseusCommentService;
                    this.$fragment = commentV3Fragment;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(this.this$0, this.$fragment, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        TheseusCommentService theseusCommentService = this.this$0;
                        MutableSharedFlow<Boolean> mutableSharedFlow = theseusCommentService.f99223I;
                        TheseusCommentService$createNewState$3$5$1$3$invokeSuspend$$inlined$collectInteractionChange$1 theseusCommentService$createNewState$3$5$1$3$invokeSuspend$$inlined$collectInteractionChange$1 = new TheseusCommentService$createNewState$3$5$1$3$invokeSuspend$$inlined$collectInteractionChange$1(theseusCommentService, null, this.$fragment);
                        this.label = 1;
                        if (FlowKt.collectLatest(mutableSharedFlow, theseusCommentService$createNewState$3$5$1$3$invokeSuspend$$inlined$collectInteractionChange$1, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$4, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$4.class */
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final CommentV3Fragment $fragment;
                int label;
                final TheseusCommentService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(TheseusCommentService theseusCommentService, CommentV3Fragment commentV3Fragment, Continuation<? super AnonymousClass4> continuation) {
                    super(2, continuation);
                    this.this$0 = theseusCommentService;
                    this.$fragment = commentV3Fragment;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass4(this.this$0, this.$fragment, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        TheseusCommentService theseusCommentService = this.this$0;
                        MutableSharedFlow<Boolean> mutableSharedFlow = theseusCommentService.f99224J;
                        TheseusCommentService$createNewState$3$5$1$4$invokeSuspend$$inlined$collectInteractionChange$1 theseusCommentService$createNewState$3$5$1$4$invokeSuspend$$inlined$collectInteractionChange$1 = new TheseusCommentService$createNewState$3$5$1$4$invokeSuspend$$inlined$collectInteractionChange$1(theseusCommentService, null, this.$fragment);
                        this.label = 1;
                        if (FlowKt.collectLatest(mutableSharedFlow, theseusCommentService$createNewState$3$5$1$4$invokeSuspend$$inlined$collectInteractionChange$1, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$5, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$5.class */
            public static final class C09655 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final CommentV3Fragment $fragment;
                int label;
                final TheseusCommentService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09655(TheseusCommentService theseusCommentService, CommentV3Fragment commentV3Fragment, Continuation<? super C09655> continuation) {
                    super(2, continuation);
                    this.this$0 = theseusCommentService;
                    this.$fragment = commentV3Fragment;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09655(this.this$0, this.$fragment, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        TheseusCommentService theseusCommentService = this.this$0;
                        MutableSharedFlow<Boolean> mutableSharedFlow = theseusCommentService.f99225K;
                        TheseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1 theseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1 = new TheseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1(theseusCommentService, null, this.$fragment);
                        this.label = 1;
                        if (FlowKt.collectLatest(mutableSharedFlow, theseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$6, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$6.class */
            public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final CommentV3Fragment $fragment;
                int label;
                final TheseusCommentService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$6$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$6$1.class */
                public static final class C09661 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    final CommentV3Fragment $fragment;
                    boolean Z$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09661(CommentV3Fragment commentV3Fragment, Continuation<? super C09661> continuation) {
                        super(2, continuation);
                        this.$fragment = commentV3Fragment;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C09661 c09661 = new C09661(this.$fragment, continuation);
                        c09661.Z$0 = ((Boolean) obj).booleanValue();
                        return c09661;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                    }

                    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        CommentContainerImpl commentContainerImpl;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        if (this.Z$0 && (commentContainerImpl = this.$fragment.d) != null) {
                            commentContainerImpl.a();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(TheseusCommentService theseusCommentService, CommentV3Fragment commentV3Fragment, Continuation<? super AnonymousClass6> continuation) {
                    super(2, continuation);
                    this.this$0 = theseusCommentService;
                    this.$fragment = commentV3Fragment;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass6(this.this$0, this.$fragment, continuation);
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
                        C09661 c09661 = new C09661(this.$fragment, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(mutableSharedFlow, c09661, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$7, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$7.class */
            public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final TheseusCommentService.d.b $commentConfig;
                final CommentV3Fragment $fragment;
                int label;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$7$a */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$7$a.class */
                public static final class a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CommentV3Fragment f99268a;

                    public a(CommentV3Fragment commentV3Fragment) {
                        this.f99268a = commentV3Fragment;
                    }

                    public final Object emit(Object obj, Continuation continuation) {
                        this.f99268a.Jf(((Boolean) obj).booleanValue());
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass7(TheseusCommentService.d.b bVar, CommentV3Fragment commentV3Fragment, Continuation<? super AnonymousClass7> continuation) {
                    super(2, continuation);
                    this.$commentConfig = bVar;
                    this.$fragment = commentV3Fragment;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass7(this.$commentConfig, this.$fragment, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<Boolean> flow = this.$commentConfig.f99278c;
                        a aVar = new a(this.$fragment);
                        this.label = 1;
                        if (flow.collect(aVar, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$8, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$8.class */
            public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final CommentV3Fragment $fragment;
                int label;
                final TheseusCommentService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$8$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$8$1.class */
                public static final class C09671 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    boolean Z$0;
                    int label;
                    final TheseusCommentService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09671(TheseusCommentService theseusCommentService, Continuation<? super C09671> continuation) {
                        super(2, continuation);
                        this.this$0 = theseusCommentService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C09671 c09671 = new C09671(this.this$0, continuation);
                        c09671.Z$0 = ((Boolean) obj).booleanValue();
                        return c09671;
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
                        this.this$0.f99219E.setValue(Boxing.boxBoolean(this.Z$0));
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass8(CommentV3Fragment commentV3Fragment, TheseusCommentService theseusCommentService, Continuation<? super AnonymousClass8> continuation) {
                    super(2, continuation);
                    this.$fragment = commentV3Fragment;
                    this.this$0 = theseusCommentService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass8(this.$fragment, this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flow = (Flow) this.$fragment.of().b.e.getValue();
                        C09671 c09671 = new C09671(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flow, c09671, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$9, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$9.class */
            public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final CommentV3Fragment $fragment;
                int label;
                final TheseusCommentService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$3$5$1$9$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$9$1.class */
                public static final class C09681 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    boolean Z$0;
                    int label;
                    final TheseusCommentService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09681(TheseusCommentService theseusCommentService, Continuation<? super C09681> continuation) {
                        super(2, continuation);
                        this.this$0 = theseusCommentService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C09681 c09681 = new C09681(this.this$0, continuation);
                        c09681.Z$0 = ((Boolean) obj).booleanValue();
                        return c09681;
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
                        this.this$0.f99221G.setValue(Boxing.boxBoolean(this.Z$0));
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass9(CommentV3Fragment commentV3Fragment, TheseusCommentService theseusCommentService, Continuation<? super AnonymousClass9> continuation) {
                    super(2, continuation);
                    this.$fragment = commentV3Fragment;
                    this.this$0 = theseusCommentService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass9(this.$fragment, this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow flow = (Flow) this.$fragment.of().b.h.getValue();
                        C09681 c09681 = new C09681(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flow, c09681, this) == coroutine_suspended) {
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
            public AnonymousClass1(CommentV3Fragment commentV3Fragment, TheseusCommentService theseusCommentService, TheseusCommentService.d.b bVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$fragment = commentV3Fragment;
                this.this$0 = theseusCommentService;
                this.$commentConfig = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fragment, this.this$0, this.$commentConfig, continuation);
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
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09641(this.$fragment, this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$fragment, this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$fragment, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$fragment, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09655(this.this$0, this.$fragment, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this.this$0, this.$fragment, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this.$commentConfig, this.$fragment, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this.$fragment, this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this.$fragment, this.this$0, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CommentV3Fragment commentV3Fragment, TheseusCommentService theseusCommentService, TheseusCommentService.d.b bVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$fragment = commentV3Fragment;
            this.this$0 = theseusCommentService;
            this.$commentConfig = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$fragment, this.this$0, this.$commentConfig, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle = this.$fragment.getLifecycle();
                Lifecycle.State state = Lifecycle.State.CREATED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$fragment, this.this$0, this.$commentConfig, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
    public TheseusCommentService$createNewState$3(TheseusCommentService theseusCommentService, CommentV3Fragment commentV3Fragment, TheseusCommentService.d.b bVar, Continuation<? super TheseusCommentService$createNewState$3> continuation) {
        super(2, continuation);
        this.this$0 = theseusCommentService;
        this.$fragment = commentV3Fragment;
        this.$commentConfig = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusCommentService$createNewState$3 theseusCommentService$createNewState$3 = new TheseusCommentService$createNewState$3(this.this$0, this.$fragment, this.$commentConfig, continuation);
        theseusCommentService$createNewState$3.L$0 = obj;
        return theseusCommentService$createNewState$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ResultData replyUgcLocationAdjustV2;
        Integer data;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$fragment, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$fragment, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$fragment, null), 3, (Object) null);
        ReplyABResult replyAbResult = ((AbtestBatchData) CommentAbtestRepository.b.getValue()).getReplyAbResult();
        if (replyAbResult != null && (replyUgcLocationAdjustV2 = replyAbResult.getReplyUgcLocationAdjustV2()) != null && (data = replyUgcLocationAdjustV2.getData()) != null && data.intValue() == 1) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
        }
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.$fragment, this.this$0, this.$commentConfig, null), 3, (Object) null);
    }
}
