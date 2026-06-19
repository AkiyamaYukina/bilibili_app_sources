package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.uicomponent.D;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectLoadEffect$2.class */
final class PlaylistService$collectLoadEffect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
    private Object L$0;
    int label;
    final E this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectLoadEffect$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectLoadEffect$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
        int label;
        final E this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectLoadEffect$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectLoadEffect$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final E f95173a;

            public a(E e7) {
                this.f95173a = e7;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                D.a aVar = (D.a) obj;
                E e7 = this.f95173a;
                Job job = e7.f94957z;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    e7.f94957z = null;
                }
                boolean zAreEqual = Intrinsics.areEqual(aVar, D.a.b.f95941a);
                PlaylistLoadService playlistLoadService = e7.f94938f;
                if (zAreEqual) {
                    playlistLoadService.g();
                } else {
                    if (!Intrinsics.areEqual(aVar, D.a.C0799a.f95940a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    playlistLoadService.f();
                }
                return Unit.INSTANCE;
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
                SharedFlow<D.a> sharedFlow = this.$component.f95934j;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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
    public PlaylistService$collectLoadEffect$2(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super PlaylistService$collectLoadEffect$2> continuation) {
        super(2, continuation);
        this.$component = d7;
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistService$collectLoadEffect$2 playlistService$collectLoadEffect$2 = new PlaylistService$collectLoadEffect$2(this.$component, this.this$0, continuation);
        playlistService$collectLoadEffect$2.L$0 = obj;
        return playlistService$collectLoadEffect$2;
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
