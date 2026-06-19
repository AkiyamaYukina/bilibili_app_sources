package com.bilibili.ship.theseus.cheese.player.toolbar;

import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository;
import eu0.C6985d;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toolbar/CheeseToolbarActionsListRepository$2.class */
final class CheeseToolbarActionsListRepository$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CheesePlayRepository $cheesePlayRepository;
    final ToolbarMiniPlayerRepository $toolbarMiniPlayerRepository;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.toolbar.CheeseToolbarActionsListRepository$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/toolbar/CheeseToolbarActionsListRepository$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6985d, Continuation<? super Unit>, Object> {
        final CheesePlayRepository $cheesePlayRepository;
        final ToolbarMiniPlayerRepository $toolbarMiniPlayerRepository;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheesePlayRepository cheesePlayRepository, ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cheesePlayRepository = cheesePlayRepository;
            this.$toolbarMiniPlayerRepository = toolbarMiniPlayerRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cheesePlayRepository, this.$toolbarMiniPlayerRepository, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(C6985d c6985d, Continuation<? super Unit> continuation) {
            return create(c6985d, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C6985d c6985d = (C6985d) this.L$0;
                if (c6985d == null) {
                    return Unit.INSTANCE;
                }
                if (this.$cheesePlayRepository.d(c6985d)) {
                    ToolbarMiniPlayerRepository toolbarMiniPlayerRepository = this.$toolbarMiniPlayerRepository;
                    this.label = 1;
                    if (toolbarMiniPlayerRepository.c(this) == coroutine_suspended) {
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
    public CheeseToolbarActionsListRepository$2(CheesePlayRepository cheesePlayRepository, ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, Continuation<? super CheeseToolbarActionsListRepository$2> continuation) {
        super(2, continuation);
        this.$cheesePlayRepository = cheesePlayRepository;
        this.$toolbarMiniPlayerRepository = toolbarMiniPlayerRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseToolbarActionsListRepository$2(this.$cheesePlayRepository, this.$toolbarMiniPlayerRepository, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheesePlayRepository cheesePlayRepository = this.$cheesePlayRepository;
            CheesePlayRepository$special$$inlined$map$1 cheesePlayRepository$special$$inlined$map$1 = cheesePlayRepository.f90695y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheesePlayRepository, this.$toolbarMiniPlayerRepository, null);
            this.label = 1;
            if (FlowKt.collectLatest(cheesePlayRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
