package com.bilibili.ship.theseus.playlist.uicomponent;

import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistMediaBottomHolder$bind$1.class */
final class PlaylistMediaBottomHolder$bind$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final StateFlow<PlaylistRepository.b> $state;
    int label;
    final C6261j this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.uicomponent.PlaylistMediaBottomHolder$bind$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistMediaBottomHolder$bind$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlaylistRepository.b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final C6261j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6261j c6261j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c6261j;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlaylistRepository.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlaylistRepository.b bVar = (PlaylistRepository.b) this.L$0;
            defpackage.a.b("[theseus-playlist-PlaylistMediaBottomHolder$bind$1$1-invokeSuspend] ", "PlaylistMediaBottomHolder bind state: " + bVar, "PlaylistMediaBottomHolder$bind$1$1-invokeSuspend");
            this.this$0.f96052a.f19323b.setVisibility(!(bVar != null ? bVar.f95131c : true) ? 0 : 8);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistMediaBottomHolder$bind$1(StateFlow<PlaylistRepository.b> stateFlow, C6261j c6261j, Continuation<? super PlaylistMediaBottomHolder$bind$1> continuation) {
        super(2, continuation);
        this.$state = stateFlow;
        this.this$0 = c6261j;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistMediaBottomHolder$bind$1(this.$state, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<PlaylistRepository.b> stateFlow = this.$state;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
