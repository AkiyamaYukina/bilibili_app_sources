package com.bilibili.playset.playlist.viewmodels;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import vs0.InterfaceC8857a;
import vs0.InterfaceC8858b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$onAction$1.class */
final class PlaylistViewModelV2$onAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC8857a $action;
    int label;
    final PlaylistViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModelV2$onAction$1(InterfaceC8857a interfaceC8857a, PlaylistViewModelV2 playlistViewModelV2, Continuation<? super PlaylistViewModelV2$onAction$1> continuation) {
        super(2, continuation);
        this.$action = interfaceC8857a;
        this.this$0 = playlistViewModelV2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistViewModelV2$onAction$1(this.$action, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8857a interfaceC8857a = this.$action;
            if (interfaceC8857a instanceof InterfaceC8857a.b) {
                PlaylistViewModelV2 playlistViewModelV2 = this.this$0;
                InterfaceC8857a.b bVar = (InterfaceC8857a.b) interfaceC8857a;
                com.bilibili.playset.api.c cVar = bVar.f128433a;
                Long lBoxLong = Boxing.boxLong(bVar.f128434b);
                this.label = 1;
                if (PlaylistViewModelV2.I0(playlistViewModelV2, cVar, lBoxLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(interfaceC8857a instanceof InterfaceC8857a.C1370a)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlaylistViewModelV2 playlistViewModelV22 = this.this$0;
                InterfaceC8858b.c cVar2 = new InterfaceC8858b.c(((InterfaceC8857a.C1370a) interfaceC8857a).f128432a);
                this.label = 2;
                Object objEmit = ((MutableSharedFlow) playlistViewModelV22.f85559u.getValue()).emit(cVar2, this);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = Unit.INSTANCE;
                }
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
