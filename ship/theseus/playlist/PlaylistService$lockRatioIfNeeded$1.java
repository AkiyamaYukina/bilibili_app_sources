package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.E;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$lockRatioIfNeeded$1.class */
final class PlaylistService$lockRatioIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final E this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$lockRatioIfNeeded$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$lockRatioIfNeeded$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<E.b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final E this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(E e7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = e7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(E.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!Intrinsics.areEqual((E.b) this.L$0, E.b.a.f94960a)) {
                        return Unit.INSTANCE;
                    }
                    BLog.i("PlaylistService$lockRatioIfNeeded$1$1-invokeSuspend", "[theseus-playlist-PlaylistService$lockRatioIfNeeded$1$1-invokeSuspend] Playlist expanded, lock 16x9 ratio.");
                    this.this$0.f94944m.f("PlaylistService");
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                BLog.i("PlaylistService$lockRatioIfNeeded$1$1-invokeSuspend", "[theseus-playlist-PlaylistService$lockRatioIfNeeded$1$1-invokeSuspend] Playlist hidden, unlock 16x9 ratio.");
                this.this$0.f94944m.j("PlaylistService");
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$lockRatioIfNeeded$1(E e7, Continuation<? super PlaylistService$lockRatioIfNeeded$1> continuation) {
        super(2, continuation);
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistService$lockRatioIfNeeded$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            E e7 = this.this$0;
            StateFlow<E.b> stateFlow = e7.f94954w;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(e7, null);
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
