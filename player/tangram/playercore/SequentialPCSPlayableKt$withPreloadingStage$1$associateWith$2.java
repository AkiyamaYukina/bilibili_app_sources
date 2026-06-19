package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2.class */
public final class SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.player.tangram.basic.j $item;
    final StateFlow<Boolean> $preloadingFlow;
    final Flow<Boolean> $shadowCompletion;
    final com.bilibili.player.tangram.basic.d $this_withPreloadingStage;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final com.bilibili.player.tangram.basic.j $decorated;
        final com.bilibili.player.tangram.basic.d $this_withPreloadingStage;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.player.tangram.basic.d dVar, com.bilibili.player.tangram.basic.j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_withPreloadingStage = dVar;
            this.$decorated = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_withPreloadingStage, this.$decorated, continuation);
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.Z$0) {
                    com.bilibili.player.tangram.basic.d dVar = this.$this_withPreloadingStage;
                    com.bilibili.player.tangram.basic.j jVar = this.$decorated;
                    this.label = 1;
                    if (dVar.o(jVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$a.class */
    public static final class a implements com.bilibili.player.tangram.basic.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StateFlow<PlayerAvailability> f79439a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(StateFlow<? extends PlayerAvailability> stateFlow) {
            this.f79439a = stateFlow;
        }

        @Override // com.bilibili.player.tangram.basic.j
        public final Flow<PlayerAvailability> d() {
            return this.f79439a;
        }

        @Override // com.bilibili.player.tangram.basic.j
        public final PlayerAvailability k() {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2(Flow<Boolean> flow, com.bilibili.player.tangram.basic.j jVar, StateFlow<Boolean> stateFlow, com.bilibili.player.tangram.basic.d dVar, Continuation<? super SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2> continuation) {
        super(2, continuation);
        this.$shadowCompletion = flow;
        this.$item = jVar;
        this.$preloadingFlow = stateFlow;
        this.$this_withPreloadingStage = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2 sequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2 = new SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2(this.$shadowCompletion, this.$item, this.$preloadingFlow, this.$this_withPreloadingStage, continuation);
        sequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2.L$0 = obj;
        return sequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L30
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L29
            r0 = r8
            r1 = 2
            if (r0 != r1) goto L1f
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto Lac
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L29:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto L72
        L30:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            r7 = r0
            r0 = r6
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> r0 = r0.$shadowCompletion
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L81
            r0 = r9
            r1 = r6
            com.bilibili.player.tangram.basic.j r1 = r1.$item
            kotlinx.coroutines.flow.Flow r1 = r1.d()
            com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$decorated$flow$1 r2 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$decorated$flow$1
            r3 = r2
            r4 = 0
            r3.<init>(r4)
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.combine(r0, r1, r2)
            r9 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r7
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.stateIn(r0, r1, r2)
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            r1 = r10
            if (r0 != r1) goto L72
            r0 = r10
            return r0
        L72:
            com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$a r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$a
            r1 = r0
            r2 = r7
            kotlinx.coroutines.flow.StateFlow r2 = (kotlinx.coroutines.flow.StateFlow) r2
            r1.<init>(r2)
            r7 = r0
            goto L86
        L81:
            r0 = r6
            com.bilibili.player.tangram.basic.j r0 = r0.$item
            r7 = r0
        L86:
            r0 = r6
            kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> r0 = r0.$preloadingFlow
            r9 = r0
            com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$1 r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2$1
            r1 = r0
            r2 = r6
            com.bilibili.player.tangram.basic.d r2 = r2.$this_withPreloadingStage
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r6
            r1 = 2
            r0.label = r1
            r0 = r9
            r1 = r7
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.collectLatest(r0, r1, r2)
            r1 = r10
            if (r0 != r1) goto Lac
            r0 = r10
            return r0
        Lac:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayableKt$withPreloadingStage$1$associateWith$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
