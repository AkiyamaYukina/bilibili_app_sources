package com.bilibili.tgwt.service;

import androidx.fragment.app.Fragment;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformEpisode;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import sl0.C8597a;
import sl0.InterfaceC8598b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$initChangeRoomPageFragment$2.class */
final class ChatService$initChangeRoomPageFragment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final BangumiUniformSeason $season;
    final Fragment $this_initChangeRoomPageFragment;
    private Object L$0;
    int label;
    final ChatService this$0;

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$initChangeRoomPageFragment$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$initChangeRoomPageFragment$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BangumiUniformSeason $season;
        final Fragment $this_initChangeRoomPageFragment;
        int label;
        final ChatService this$0;

        /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$initChangeRoomPageFragment$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$initChangeRoomPageFragment$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatService f111908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BangumiUniformSeason f111909b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Fragment f111910c;

            public a(ChatService chatService, BangumiUniformSeason bangumiUniformSeason, Fragment fragment) {
                this.f111908a = chatService;
                this.f111909b = bangumiUniformSeason;
                this.f111910c = fragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                BangumiUniformEpisode bangumiUniformEpisode = (BangumiUniformEpisode) obj;
                if (bangumiUniformEpisode == null) {
                    unit = Unit.INSTANCE;
                } else {
                    ((InterfaceC8598b) this.f111910c).w9(new C8597a(bangumiUniformEpisode.a(), lm.a.a(this.f111908a.f111878a, this.f111909b, bangumiUniformEpisode)));
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChatService chatService, BangumiUniformSeason bangumiUniformSeason, Fragment fragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chatService;
            this.$season = bangumiUniformSeason;
            this.$this_initChangeRoomPageFragment = fragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$season, this.$this_initChangeRoomPageFragment, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow currentEpisodeFlow = this.this$0.f111888f.getCurrentEpisodeFlow();
                a aVar = new a(this.this$0, this.$season, this.$this_initChangeRoomPageFragment);
                this.label = 1;
                if (currentEpisodeFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$initChangeRoomPageFragment$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$initChangeRoomPageFragment$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Fragment $this_initChangeRoomPageFragment;
        int label;
        final ChatService this$0;

        /* JADX INFO: renamed from: com.bilibili.tgwt.service.ChatService$initChangeRoomPageFragment$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$initChangeRoomPageFragment$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChatService f111911a;

            public a(ChatService chatService) {
                this.f111911a = chatService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ChatService chatService = this.f111911a;
                chatService.f111884d.hideTopPopFragment();
                Object objEmit = chatService.f111890i.a.emit(Boxing.boxBoolean(true), continuation);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                return objEmit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, ChatService chatService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_initChangeRoomPageFragment = fragment;
            this.this$0 = chatService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_initChangeRoomPageFragment, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlowS = ((InterfaceC8598b) this.$this_initChangeRoomPageFragment).s();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlowS.collect(aVar, this) == coroutine_suspended) {
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
    public ChatService$initChangeRoomPageFragment$2(ChatService chatService, BangumiUniformSeason bangumiUniformSeason, Fragment fragment, Continuation<? super ChatService$initChangeRoomPageFragment$2> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$season = bangumiUniformSeason;
        this.$this_initChangeRoomPageFragment = fragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatService$initChangeRoomPageFragment$2 chatService$initChangeRoomPageFragment$2 = new ChatService$initChangeRoomPageFragment$2(this.this$0, this.$season, this.$this_initChangeRoomPageFragment, continuation);
        chatService$initChangeRoomPageFragment$2.L$0 = obj;
        return chatService$initChangeRoomPageFragment$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$season, this.$this_initChangeRoomPageFragment, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$this_initChangeRoomPageFragment, this.this$0, null), 3, (Object) null);
    }
}
