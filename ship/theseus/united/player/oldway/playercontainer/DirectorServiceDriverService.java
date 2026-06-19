package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService.class */
@StabilityInferred(parameters = 0)
public final class DirectorServiceDriverService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f104754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.biliplayerv2.service.k f104755c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.DirectorServiceDriverService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final DirectorServiceDriverService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DirectorServiceDriverService directorServiceDriverService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = directorServiceDriverService;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                DirectorServiceDriverService directorServiceDriverService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(FlowKt.transformLatest(FlowKt.asStateFlow(directorServiceDriverService.f104754b.f91111e), new DirectorServiceDriverService$collectPlayable$$inlined$flatMapLatest$1(null, directorServiceDriverService)), new DirectorServiceDriverService$collectPlayable$3(directorServiceDriverService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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
    public DirectorServiceDriverService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull tv.danmaku.biliplayerv2.service.k kVar) {
        this.f104753a = coroutineScope;
        this.f104754b = hVar;
        this.f104755c = kVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
