package com.bilibili.ship.theseus.united.player.oldway;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayEpisodeFusionService.class */
@StabilityInferred(parameters = 0)
public final class OldWayEpisodeFusionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f104651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RelationRepository f104652c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayEpisodeFusionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayEpisodeFusionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlayerHeadsetService $playerHeadsetService;
        int label;
        final OldWayEpisodeFusionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OldWayEpisodeFusionService oldWayEpisodeFusionService, PlayerHeadsetService playerHeadsetService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oldWayEpisodeFusionService;
            this.$playerHeadsetService = playerHeadsetService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$playerHeadsetService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<PlayViewUniteReply> flowG = this.this$0.f104651b.g();
                this.label = 1;
                if (FlowKt.first(flowG, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BLog.i("OldWayEpisodeFusionService$1-invokeSuspend", "[theseus-united-OldWayEpisodeFusionService$1-invokeSuspend] update media metadata");
            this.$playerHeadsetService.updateMetadata();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayEpisodeFusionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayEpisodeFusionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlayerHeadsetService $playerHeadsetService;
        int label;
        final OldWayEpisodeFusionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.OldWayEpisodeFusionService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/OldWayEpisodeFusionService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final PlayerHeadsetService $playerHeadsetService;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerHeadsetService playerHeadsetService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$playerHeadsetService = playerHeadsetService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$playerHeadsetService, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BLog.i("OldWayEpisodeFusionService$2$1-invokeSuspend", "[theseus-united-OldWayEpisodeFusionService$2$1-invokeSuspend] update media playback state: like");
                this.$playerHeadsetService.updatePlaybackState();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OldWayEpisodeFusionService oldWayEpisodeFusionService, PlayerHeadsetService playerHeadsetService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = oldWayEpisodeFusionService;
            this.$playerHeadsetService = playerHeadsetService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$playerHeadsetService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlow = this.this$0.f104652c.f103999g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$playerHeadsetService, null);
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

    @Inject
    public OldWayEpisodeFusionService(@NotNull CoroutineScope coroutineScope, @NotNull j jVar, @NotNull PlayerHeadsetService playerHeadsetService, @NotNull RelationRepository relationRepository) {
        this.f104650a = coroutineScope;
        this.f104651b = jVar;
        this.f104652c = relationRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, playerHeadsetService, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, playerHeadsetService, null), 3, (Object) null);
    }
}
