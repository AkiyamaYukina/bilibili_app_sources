package com.bilibili.ship.theseus.ugc.intro;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bus.Violet;
import com.bilibili.playerbizcommon.live.VideoLiveStateMessage;
import javax.inject.Inject;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.PlayerCardStatusSyncFromPlayerListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/UgcCardStatusRepository.class */
@StabilityInferred(parameters = 0)
public final class UgcCardStatusRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f96931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<C6264a> f96932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SharedFlow<C6264a> f96933d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.UgcCardStatusRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/UgcCardStatusRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcCardStatusRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.UgcCardStatusRepository$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/UgcCardStatusRepository$1$a.class */
        public static final class a implements PlayerCardStatusSyncFromPlayerListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcCardStatusRepository f96934a;

            public a(UgcCardStatusRepository ugcCardStatusRepository) {
                this.f96934a = ugcCardStatusRepository;
            }

            public final void syncPlayerCardStatusFromPlayer(int i7, long j7, boolean z6) {
                this.f96934a.f96932c.tryEmit(new C6264a(i7, j7, z6));
                Violet.INSTANCE.setValue(new VideoLiveStateMessage(j7, z6));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcCardStatusRepository ugcCardStatusRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcCardStatusRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcCardStatusRepository ugcCardStatusRepository = this.this$0;
                    ugcCardStatusRepository.f96931b.setSyncCardStatusFromPlayerListener(new a(ugcCardStatusRepository));
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
                this.this$0.f96931b.setSyncCardStatusFromPlayerListener((PlayerCardStatusSyncFromPlayerListener) null);
                throw th;
            }
        }
    }

    @Inject
    public UgcCardStatusRepository(@NotNull CoroutineScope coroutineScope, @NotNull IInteractLayerService iInteractLayerService) {
        this.f96930a = coroutineScope;
        this.f96931b = iInteractLayerService;
        MutableSharedFlow<C6264a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f96932c = mutableSharedFlowMutableSharedFlow$default;
        this.f96933d = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
