package com.bilibili.ship.theseus.ogv;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvRestoreFromMiniPlayService.class */
@StabilityInferred(parameters = 0)
public final class OgvRestoreFromMiniPlayService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f91316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Gu0.a f91318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f91319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<OgvEpisode> f91321g = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvRestoreFromMiniPlayService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvRestoreFromMiniPlayService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvRestoreFromMiniPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvRestoreFromMiniPlayService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvRestoreFromMiniPlayService$1$1.class */
        public static final class C06761 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvRestoreFromMiniPlayService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06761(OgvRestoreFromMiniPlayService ogvRestoreFromMiniPlayService, Continuation<? super C06761> continuation) {
                super(2, continuation);
                this.this$0 = ogvRestoreFromMiniPlayService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06761 c06761 = new C06761(this.this$0, continuation);
                c06761.L$0 = obj;
                return c06761;
            }

            public final Object invoke(Lifecycle.Event event, Continuation<? super Unit> continuation) {
                return create(event, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_START && this.this$0.f91321g.getValue() != null) {
                    com.bilibili.mini.player.biz.d dVar = (com.bilibili.mini.player.biz.d) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.mini.player.biz.d.class, (String) null, 2, (Object) null);
                    Bundle bundleB = dVar != null ? dVar.b() : null;
                    com.bilibili.mini.player.common.utils.i.a();
                    Integer numBoxInt = bundleB != null ? Boxing.boxInt(bundleB.getInt("mini_player_shared_record_id")) : null;
                    Long lBoxLong = bundleB != null ? Boxing.boxLong(bundleB.getLong("mini_player_shared_avid")) : null;
                    Long lBoxLong2 = bundleB != null ? Boxing.boxLong(bundleB.getLong("mini_player_shared_cid")) : null;
                    OgvRestoreFromMiniPlayService ogvRestoreFromMiniPlayService = this.this$0;
                    MutableStateFlow<OgvEpisode> mutableStateFlow = ogvRestoreFromMiniPlayService.f91321g;
                    try {
                        OgvEpisode ogvEpisode = (OgvEpisode) mutableStateFlow.getValue();
                        if (ogvEpisode == null) {
                            BLog.i("OgvRestoreFromMiniPlayService-tryToRestorePlay", "[theseus-ogv-OgvRestoreFromMiniPlayService-tryToRestorePlay] unnecessary restore to play, because last episode is null");
                        } else {
                            IPlayerContainer.SharedRecord sharedRecordRetrieveSharedRecord = numBoxInt != null ? IPlayerContainer.Companion.retrieveSharedRecord(numBoxInt.intValue()) : null;
                            if (sharedRecordRetrieveSharedRecord == null || lBoxLong == null || lBoxLong2 == null) {
                                BLog.i("OgvRestoreFromMiniPlayService-tryToRestorePlay", "[theseus-ogv-OgvRestoreFromMiniPlayService-tryToRestorePlay] restore to play but no shared data or play id");
                                ogvRestoreFromMiniPlayService.f91319e.attachByShared(PlayerSharingType.NORMAL, (PlayerSharingBundle) null);
                                OgvCurrentEpisodeRepository.h(ogvRestoreFromMiniPlayService.f91317c, ogvEpisode, null, null, null, 0, 30);
                            } else {
                                ogvRestoreFromMiniPlayService.a(sharedRecordRetrieveSharedRecord, ogvEpisode, lBoxLong.longValue(), lBoxLong2.longValue());
                            }
                        }
                    } finally {
                        mutableStateFlow.setValue((Object) null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvRestoreFromMiniPlayService ogvRestoreFromMiniPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvRestoreFromMiniPlayService;
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
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f91316b);
                C06761 c06761 = new C06761(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, c06761, this) == coroutine_suspended) {
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
    public OgvRestoreFromMiniPlayService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Gu0.a aVar, @NotNull PlayerContainer playerContainer, @NotNull OgvSeason ogvSeason) {
        this.f91315a = coroutineScope;
        this.f91316b = lifecycle;
        this.f91317c = ogvCurrentEpisodeRepository;
        this.f91318d = aVar;
        this.f91319e = playerContainer;
        this.f91320f = ogvSeason;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final void a(IPlayerContainer.SharedRecord sharedRecord, OgvEpisode ogvEpisode, long j7, long j8) {
        this.f91319e.attachByShared(PlayerSharingType.NORMAL, sharedRecord.getSharingBundle());
        OgvEpisode ogvEpisodeH = this.f91318d.h(j8);
        if (ogvEpisodeH == null) {
            defpackage.a.b("[theseus-ogv-OgvRestoreFromMiniPlayService-restoreSharedPlay] ", "find non episode, restore to play last, episode id:" + ogvEpisode.f93555a, "OgvRestoreFromMiniPlayService-restoreSharedPlay");
            OgvCurrentEpisodeRepository.h(this.f91317c, ogvEpisode, null, null, null, 0, 30);
            return;
        }
        StringBuilder sb = new StringBuilder("try to restore from shared play, episode id:");
        long j9 = ogvEpisodeH.f93555a;
        sb.append(j9);
        BLog.i("OgvRestoreFromMiniPlayService-restoreSharedPlay", "[theseus-ogv-OgvRestoreFromMiniPlayService-restoreSharedPlay] " + sb.toString());
        OgvSeason ogvSeason = this.f91320f;
        OgvCurrentEpisodeRepository.h(this.f91317c, ogvEpisodeH, null, null, new ev0.l(sharedRecord, j7, j8, "6", new com.bilibili.ship.theseus.united.bean.d(Long.valueOf(ogvSeason.f94449a), ogvSeason.f94450b, Long.valueOf(j9), null, null, 56), 0, (com.bilibili.ship.theseus.united.bean.b) null, (com.bilibili.ship.theseus.united.bean.g) null, 448), 0, 22);
    }
}
