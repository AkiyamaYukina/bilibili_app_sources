package com.bilibili.ship.theseus.ugc.toolbar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.ToolbarListenRepository;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.home.ToolbarHomeRepository;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/UGCToolbarActionsListRepository.class */
@StabilityInferred(parameters = 1)
public final class UGCToolbarActionsListRepository {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.UGCToolbarActionsListRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/UGCToolbarActionsListRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarHomeRepository $toolbarHomeRepository;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ToolbarHomeRepository toolbarHomeRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$toolbarHomeRepository = toolbarHomeRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$toolbarHomeRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarHomeRepository toolbarHomeRepository = this.$toolbarHomeRepository;
                this.label = 1;
                Object objD = toolbarHomeRepository.f103323f.d(CollectionsKt.listOf(toolbarHomeRepository.f103329m), this);
                if (objD != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objD = Unit.INSTANCE;
                }
                if (objD == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.UGCToolbarActionsListRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/UGCToolbarActionsListRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarCastScreenRepository $toolbarCastScreenRepository;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ToolbarCastScreenRepository toolbarCastScreenRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$toolbarCastScreenRepository = toolbarCastScreenRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$toolbarCastScreenRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarCastScreenRepository toolbarCastScreenRepository = this.$toolbarCastScreenRepository;
                this.label = 1;
                if (toolbarCastScreenRepository.g(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.UGCToolbarActionsListRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/UGCToolbarActionsListRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarMiniPlayerRepository $toolbarMiniPlayerRepository;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$toolbarMiniPlayerRepository = toolbarMiniPlayerRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$toolbarMiniPlayerRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarMiniPlayerRepository toolbarMiniPlayerRepository = this.$toolbarMiniPlayerRepository;
                this.label = 1;
                if (toolbarMiniPlayerRepository.c(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.toolbar.UGCToolbarActionsListRepository$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toolbar/UGCToolbarActionsListRepository$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ToolbarListenRepository $toolbarListenRepository;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ToolbarListenRepository toolbarListenRepository, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$toolbarListenRepository = toolbarListenRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$toolbarListenRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarListenRepository toolbarListenRepository = this.$toolbarListenRepository;
                this.label = 1;
                Object objE = toolbarListenRepository.f98531e.e(CollectionsKt.listOf(toolbarListenRepository.f98532f), this);
                if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objE = Unit.INSTANCE;
                }
                if (objE == coroutine_suspended) {
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

    @Inject
    public UGCToolbarActionsListRepository(@NotNull CoroutineScope coroutineScope, @NotNull ToolbarCastScreenRepository toolbarCastScreenRepository, @NotNull ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, @NotNull ToolbarListenRepository toolbarListenRepository, @NotNull ToolbarHomeRepository toolbarHomeRepository) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(toolbarHomeRepository, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(toolbarCastScreenRepository, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(toolbarMiniPlayerRepository, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(toolbarListenRepository, null), 3, (Object) null);
    }
}
