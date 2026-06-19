package com.bilibili.ship.theseus.ugc.intro.commentguide;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideService$create$1.class */
public final class CommentGuideService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final i $likeComment;
    final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
    int label;
    final CommentGuideService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final i $likeComment;
        final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
        int label;
        final CommentGuideService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.commentguide.CommentGuideService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideService$create$1$1$1.class */
        public static final class C08331 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final i $likeComment;
            final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
            boolean Z$0;
            int label;
            final CommentGuideService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08331(CommentGuideService commentGuideService, i iVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super C08331> continuation) {
                super(2, continuation);
                this.this$0 = commentGuideService;
                this.$likeComment = iVar;
                this.$placeHolder = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08331 c08331 = new C08331(this.this$0, this.$likeComment, this.$placeHolder, continuation);
                c08331.Z$0 = ((Boolean) obj).booleanValue();
                return c08331;
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
                if (!this.Z$0) {
                    return Unit.INSTANCE;
                }
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) this.this$0.f96985f.get();
                if (introRecycleViewService != null) {
                    CommentGuideService commentGuideService = this.this$0;
                    i iVar = this.$likeComment;
                    commentGuideService.getClass();
                    introRecycleViewService.e(new RunningUIComponent(new f(new g(iVar, commentGuideService, new Ref.BooleanRef()), commentGuideService.h.f100020a), 0, (Function1) null, 6), this.$placeHolder);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommentGuideService commentGuideService, i iVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = commentGuideService;
            this.$likeComment = iVar;
            this.$placeHolder = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$likeComment, this.$placeHolder, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(this.this$0.f96982c.f103999g, 1);
                C08331 c08331 = new C08331(this.this$0, this.$likeComment, this.$placeHolder, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDrop, c08331, this) == coroutine_suspended) {
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
    public CommentGuideService$create$1(CommentGuideService commentGuideService, i iVar, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super CommentGuideService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = commentGuideService;
        this.$likeComment = iVar;
        this.$placeHolder = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CommentGuideService$create$1(this.this$0, this.$likeComment, this.$placeHolder, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CommentGuideService commentGuideService = this.this$0;
        BuildersKt.launch$default(commentGuideService.f96980a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(commentGuideService, this.$likeComment, this.$placeHolder, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
