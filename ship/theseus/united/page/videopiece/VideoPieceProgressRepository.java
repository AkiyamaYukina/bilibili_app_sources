package com.bilibili.ship.theseus.united.page.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.q;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/VideoPieceProgressRepository.class */
@StabilityInferred(parameters = 0)
public final class VideoPieceProgressRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Hr0.c> f103677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Hr0.c> f103678c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.VideoPieceProgressRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/VideoPieceProgressRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final b $pieceRepository;
        int label;
        final VideoPieceProgressRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.VideoPieceProgressRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/VideoPieceProgressRepository$1$1.class */
        public static final class C11511 extends SuspendLambda implements Function2<q<?>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final VideoPieceProgressRepository this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videopiece.VideoPieceProgressRepository$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/VideoPieceProgressRepository$1$1$1.class */
            public static final class C11521 extends SuspendLambda implements Function2<Duration, Continuation<? super Unit>, Object> {
                final q<?> $context;
                long J$0;
                int label;
                final VideoPieceProgressRepository this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11521(VideoPieceProgressRepository videoPieceProgressRepository, q<?> qVar, Continuation<? super C11521> continuation) {
                    super(2, continuation);
                    this.this$0 = videoPieceProgressRepository;
                    this.$context = qVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11521 c11521 = new C11521(this.this$0, this.$context, continuation);
                    c11521.J$0 = ((Duration) obj).unbox-impl();
                    return c11521;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m9642invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
                }

                /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
                public final Object m9642invokeVtjQ1oo(long j7, Continuation<? super Unit> continuation) {
                    return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f103677b.setValue(new Hr0.c(this.$context.f91142c, Duration.getInWholeMilliseconds-impl(this.J$0)));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11511(VideoPieceProgressRepository videoPieceProgressRepository, Continuation<? super C11511> continuation) {
                super(2, continuation);
                this.this$0 = videoPieceProgressRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11511 c11511 = new C11511(this.this$0, continuation);
                c11511.L$0 = obj;
                return c11511;
            }

            public final Object invoke(q<?> qVar, Continuation<? super Unit> continuation) {
                return create(qVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    q qVar = (q) this.L$0;
                    if (qVar == null) {
                        this.this$0.f103677b.setValue((Object) null);
                        return Unit.INSTANCE;
                    }
                    Flow<Duration> flowJ = qVar.f91144e.J();
                    C11521 c11521 = new C11521(this.this$0, qVar, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowJ, c11521, this) == coroutine_suspended) {
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
        public AnonymousClass1(b bVar, VideoPieceProgressRepository videoPieceProgressRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pieceRepository = bVar;
            this.this$0 = videoPieceProgressRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$pieceRepository, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<q<?>> mutableStateFlow = this.$pieceRepository.f103682a;
                C11511 c11511 = new C11511(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c11511, this) == coroutine_suspended) {
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
    public VideoPieceProgressRepository(@NotNull CoroutineScope coroutineScope, @NotNull b bVar) {
        this.f103676a = coroutineScope;
        MutableStateFlow<Hr0.c> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f103677b = MutableStateFlow;
        this.f103678c = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(bVar, this, null), 3, (Object) null);
    }
}
