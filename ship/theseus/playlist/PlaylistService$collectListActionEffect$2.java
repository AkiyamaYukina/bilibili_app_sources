package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.uicomponent.D;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectListActionEffect$2.class */
final class PlaylistService$collectListActionEffect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
    private Object L$0;
    int label;
    final E this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectListActionEffect$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectListActionEffect$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
        int label;
        final E this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectListActionEffect$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectListActionEffect$2$1$1.class */
        public static final class C07701<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final E f95170a;

            public C07701(E e7) {
                this.f95170a = e7;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(com.bilibili.ship.theseus.playlist.uicomponent.D.c r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
                /*
                    Method dump skipped, instruction units count: 813
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistService$collectListActionEffect$2.AnonymousClass1.C07701.emit(com.bilibili.ship.theseus.playlist.uicomponent.D$c, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$component = d7;
            this.this$0 = e7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$component, this.this$0, continuation);
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
                SharedFlow<D.c> sharedFlow = this.$component.f95931f;
                C07701 c07701 = new C07701(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(c07701, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$collectListActionEffect$2(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super PlaylistService$collectListActionEffect$2> continuation) {
        super(2, continuation);
        this.$component = d7;
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistService$collectListActionEffect$2 playlistService$collectListActionEffect$2 = new PlaylistService$collectListActionEffect$2(this.$component, this.this$0, continuation);
        playlistService$collectListActionEffect$2.L$0 = obj;
        return playlistService$collectListActionEffect$2;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$component, this.this$0, null), 3, (Object) null);
    }
}
