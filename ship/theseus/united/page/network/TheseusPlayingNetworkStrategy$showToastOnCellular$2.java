package com.bilibili.ship.theseus.united.page.network;

import com.bilibili.ship.theseus.united.player.mediaplay.network.m;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$showToastOnCellular$2.class */
final class TheseusPlayingNetworkStrategy$showToastOnCellular$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $isLastEnvWifi;
    private Object L$0;
    int label;
    final TheseusPlayingNetworkStrategy this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$showToastOnCellular$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$showToastOnCellular$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $isLastEnvWifi;
        int label;
        final TheseusPlayingNetworkStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z6, TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isLastEnvWifi = z6;
            this.this$0 = theseusPlayingNetworkStrategy;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$isLastEnvWifi, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$isLastEnvWifi) {
                    TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy = this.this$0;
                    m mVar = theseusPlayingNetworkStrategy.h;
                    String string = theseusPlayingNetworkStrategy.f102083b.getString(2131845638);
                    this.label = 1;
                    if (mVar.b(string, this, true) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.network.TheseusPlayingNetworkStrategy$showToastOnCellular$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/network/TheseusPlayingNetworkStrategy$showToastOnCellular$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayingNetworkStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayingNetworkStrategy;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                m mVar = this.this$0.h;
                this.label = 1;
                if (mVar.f(this) == coroutine_suspended) {
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
    public TheseusPlayingNetworkStrategy$showToastOnCellular$2(boolean z6, TheseusPlayingNetworkStrategy theseusPlayingNetworkStrategy, Continuation<? super TheseusPlayingNetworkStrategy$showToastOnCellular$2> continuation) {
        super(2, continuation);
        this.$isLastEnvWifi = z6;
        this.this$0 = theseusPlayingNetworkStrategy;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayingNetworkStrategy$showToastOnCellular$2 theseusPlayingNetworkStrategy$showToastOnCellular$2 = new TheseusPlayingNetworkStrategy$showToastOnCellular$2(this.$isLastEnvWifi, this.this$0, continuation);
        theseusPlayingNetworkStrategy$showToastOnCellular$2.L$0 = obj;
        return theseusPlayingNetworkStrategy$showToastOnCellular$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$isLastEnvWifi, this.this$0, null), 3, (Object) null);
        c71.b.a.getClass();
        if (c71.b.b()) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
