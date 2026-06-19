package com.bilibili.ship.theseus.cheese.miniplayer;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import au0.C4911a;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mini.player.biz.d;
import com.bilibili.mini.player.common.utils.i;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.bean.b;
import com.bilibili.ship.theseus.united.bean.g;
import com.bilibili.ship.theseus.united.page.miniplayer.f;
import eu0.C6985d;
import ev0.l;
import javax.inject.Inject;
import kotlin.Pair;
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
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/miniplayer/CheeseRestoreSharedPlayService.class */
@StabilityInferred(parameters = 0)
public final class CheeseRestoreSharedPlayService implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f90489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C4911a f90491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f90492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C7893a.C1318a> f90493f = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f90494g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.miniplayer.CheeseRestoreSharedPlayService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/miniplayer/CheeseRestoreSharedPlayService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseRestoreSharedPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.miniplayer.CheeseRestoreSharedPlayService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/miniplayer/CheeseRestoreSharedPlayService$1$1.class */
        public static final class C06521 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseRestoreSharedPlayService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06521(CheeseRestoreSharedPlayService cheeseRestoreSharedPlayService, Continuation<? super C06521> continuation) {
                super(2, continuation);
                this.this$0 = cheeseRestoreSharedPlayService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06521 c06521 = new C06521(this.this$0, continuation);
                c06521.L$0 = obj;
                return c06521;
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
                if (((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_START && this.this$0.f90493f.getValue() != null) {
                    CheeseRestoreSharedPlayService cheeseRestoreSharedPlayService = this.this$0;
                    if (cheeseRestoreSharedPlayService.f90494g) {
                        cheeseRestoreSharedPlayService.f90494g = false;
                        Integer numBoxInt = null;
                        d dVar = (d) BLRouter.get$default(BLRouter.INSTANCE, d.class, (String) null, 2, (Object) null);
                        Bundle bundleB = dVar != null ? dVar.b() : null;
                        i.a();
                        if (bundleB != null) {
                            numBoxInt = Boxing.boxInt(bundleB.getInt("mini_player_shared_record_id"));
                        }
                        long j7 = 0;
                        long j8 = bundleB != null ? bundleB.getLong("mini_player_shared_avid") : 0L;
                        if (bundleB != null) {
                            j7 = bundleB.getLong("mini_player_shared_cid");
                        }
                        this.this$0.b(numBoxInt, j8, j7, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseRestoreSharedPlayService cheeseRestoreSharedPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseRestoreSharedPlayService;
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
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f90489b);
                C06521 c06521 = new C06521(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, c06521, this) == coroutine_suspended) {
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
    public CheeseRestoreSharedPlayService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull C4911a c4911a, @NotNull PlayerContainer playerContainer) {
        this.f90488a = coroutineScope;
        this.f90489b = lifecycle;
        this.f90490c = cheesePlayRepository;
        this.f90491d = c4911a;
        this.f90492e = playerContainer;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.ship.theseus.united.page.miniplayer.f
    public final void a() {
        this.f90494g = true;
    }

    @Override // com.bilibili.ship.theseus.united.page.miniplayer.f
    public final void b(@Nullable Integer num, long j7, long j8, @Nullable Bundle bundle) {
        MutableStateFlow<C7893a.C1318a> mutableStateFlow = this.f90493f;
        try {
            CheesePlayRepository cheesePlayRepository = this.f90490c;
            C7893a.C1318a c1318a = (C7893a.C1318a) mutableStateFlow.getValue();
            C6985d c6985dC = cheesePlayRepository.c(c1318a != null ? c1318a.f123395a.f123398b : 0L);
            if (c6985dC == null) {
                BLog.d("unnecessary restore to play, because last episode is null");
                return;
            }
            IPlayerContainer.SharedRecord sharedRecordRetrieveSharedRecord = num != null ? IPlayerContainer.Companion.retrieveSharedRecord(num.intValue()) : null;
            if (sharedRecordRetrieveSharedRecord == null || j7 == 0 || j8 == 0) {
                BLog.d("restore to play but no shared data or play id");
                this.f90492e.attachByShared(PlayerSharingType.NORMAL, (PlayerSharingBundle) null);
                CheesePlayRepository.i(this.f90490c, c6985dC, null, null, 0, 14);
            } else {
                d(sharedRecordRetrieveSharedRecord, c6985dC, j7, j8);
            }
        } finally {
            mutableStateFlow.setValue((Object) null);
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.miniplayer.f
    public final void c(@Nullable C7893a.C1318a c1318a) {
        this.f90493f.setValue(c1318a);
    }

    public final void d(IPlayerContainer.SharedRecord sharedRecord, C6985d c6985d, long j7, long j8) {
        this.f90492e.attachByShared(PlayerSharingType.NORMAL, sharedRecord.getSharingBundle());
        C6985d c6985dC = this.f90490c.c(j8);
        if (c6985dC == null) {
            BLog.d("find non episode, restore to play last, episode id:" + c6985d.f117521q);
            CheesePlayRepository.i(this.f90490c, c6985d, null, null, 0, 14);
            return;
        }
        StringBuilder sb = new StringBuilder("try to restore from shared play, episode id:");
        long j9 = c6985dC.f117521q;
        sb.append(j9);
        BLog.d(sb.toString());
        C4911a c4911a = this.f90491d;
        l lVar = new l(sharedRecord, j7, j8, "6", (com.bilibili.ship.theseus.united.bean.d) null, 0, new b(Long.valueOf(c4911a.f54237a), Long.valueOf(j9), (Long) null, c4911a.f54239c, c4911a.f54238b, (String) null, c4911a.f54241e, c4911a.f54242f, c4911a.f54243g, c4911a.h, (String) null, 3108), (g) null, 384);
        new Pair(Long.valueOf(c6985dC.f117510e), Boolean.FALSE);
        CheesePlayRepository.i(this.f90490c, c6985dC, null, lVar, 0, 10);
    }
}
