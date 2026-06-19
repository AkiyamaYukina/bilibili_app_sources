package com.bilibili.ship.theseus.playlist.di.episode.cheese;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.compose.ui.input.pointer.k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mini.player.common.utils.i;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.united.bean.g;
import ev0.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/cheese/PlaylistCheeseRestoreSharedPlayService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistCheeseRestoreSharedPlayService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f95519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f95520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f95521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f95524g;

    @NotNull
    public final MutableStateFlow<PlaylistRepository.e> h = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.cheese.PlaylistCheeseRestoreSharedPlayService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/cheese/PlaylistCheeseRestoreSharedPlayService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistCheeseRestoreSharedPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.cheese.PlaylistCheeseRestoreSharedPlayService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/cheese/PlaylistCheeseRestoreSharedPlayService$1$1.class */
        public static final class C07821 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistCheeseRestoreSharedPlayService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07821(PlaylistCheeseRestoreSharedPlayService playlistCheeseRestoreSharedPlayService, Continuation<? super C07821> continuation) {
                super(2, continuation);
                this.this$0 = playlistCheeseRestoreSharedPlayService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07821 c07821 = new C07821(this.this$0, continuation);
                c07821.L$0 = obj;
                return c07821;
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
                if (((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_START && this.this$0.h.getValue() != null) {
                    com.bilibili.mini.player.biz.d dVar = (com.bilibili.mini.player.biz.d) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.mini.player.biz.d.class, (String) null, 2, (Object) null);
                    Bundle bundleB = dVar != null ? dVar.b() : null;
                    i.a();
                    Integer numBoxInt = bundleB != null ? Boxing.boxInt(bundleB.getInt("mini_player_shared_record_id")) : null;
                    Long lBoxLong = bundleB != null ? Boxing.boxLong(bundleB.getLong("mini_player_shared_avid")) : null;
                    Long lBoxLong2 = bundleB != null ? Boxing.boxLong(bundleB.getLong("mini_player_shared_cid")) : null;
                    PlaylistCheeseRestoreSharedPlayService playlistCheeseRestoreSharedPlayService = this.this$0;
                    MutableStateFlow<PlaylistRepository.e> mutableStateFlow = playlistCheeseRestoreSharedPlayService.h;
                    try {
                        PlaylistRepository.e eVar = (PlaylistRepository.e) mutableStateFlow.getValue();
                        if (eVar == null) {
                            BLog.i("PlaylistCheeseRestoreSharedPlayService-tryToRestorePlay", "[theseus-playlist-PlaylistCheeseRestoreSharedPlayService-tryToRestorePlay] unnecessary restore to play, because last media is null");
                            if (numBoxInt != null) {
                                IPlayerContainer.Companion.forceDestroyShareRecord(numBoxInt.intValue());
                            }
                        } else {
                            IPlayerContainer.SharedRecord sharedRecordRetrieveSharedRecord = numBoxInt != null ? IPlayerContainer.Companion.retrieveSharedRecord(numBoxInt.intValue()) : null;
                            if (sharedRecordRetrieveSharedRecord == null || lBoxLong == null || lBoxLong2 == null) {
                                BLog.i("PlaylistCheeseRestoreSharedPlayService-tryToRestorePlay", "[theseus-playlist-PlaylistCheeseRestoreSharedPlayService-tryToRestorePlay] restore to play but no shared data or play id");
                                playlistCheeseRestoreSharedPlayService.f95520c.attachByShared(PlayerSharingType.NORMAL, (PlayerSharingBundle) null);
                                playlistCheeseRestoreSharedPlayService.f95522e.l();
                            } else {
                                playlistCheeseRestoreSharedPlayService.a(sharedRecordRetrieveSharedRecord, eVar, lBoxLong.longValue(), lBoxLong2.longValue());
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
        public AnonymousClass1(PlaylistCheeseRestoreSharedPlayService playlistCheeseRestoreSharedPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistCheeseRestoreSharedPlayService;
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
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f95519b);
                C07821 c07821 = new C07821(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, c07821, this) == coroutine_suspended) {
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
    public PlaylistCheeseRestoreSharedPlayService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle, @NotNull PlayerContainer playerContainer, @NotNull C8043a c8043a, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull PlaylistRepository playlistRepository, @NotNull CheesePlayRepository cheesePlayRepository) {
        this.f95518a = coroutineScope;
        this.f95519b = lifecycle;
        this.f95520c = playerContainer;
        this.f95521d = c8043a;
        this.f95522e = playlistSchedulingService;
        this.f95523f = playlistRepository;
        this.f95524g = cheesePlayRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final void a(IPlayerContainer.SharedRecord sharedRecord, PlaylistRepository.e eVar, long j7, long j8) {
        Object next;
        Object next2;
        this.f95520c.attachByShared(PlayerSharingType.NORMAL, sharedRecord.getSharingBundle());
        Iterator<T> it = this.f95523f.d().iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MultiTypeMedia multiTypeMedia = (MultiTypeMedia) next;
            if (multiTypeMedia.t()) {
                List<Ou0.c> list = multiTypeMedia.f95225M;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((Ou0.c) it2.next()).f18088a == j7) {
                            break loop0;
                        }
                    }
                }
            } else if (multiTypeMedia.d() == j7) {
                break;
            }
        }
        MultiTypeMedia multiTypeMedia2 = (MultiTypeMedia) next;
        if (multiTypeMedia2 == null) {
            defpackage.a.b("[theseus-playlist-PlaylistCheeseRestoreSharedPlayService-restoreSharedPlay] ", k.a(j7, "Can not restore form shared record: avid=", " is not in playlist"), "PlaylistCheeseRestoreSharedPlayService-restoreSharedPlay");
            this.f95522e.l();
            return;
        }
        StringBuilder sbA = z.a(j7, "has record, try to attach: avid: ", ", cid: ");
        sbA.append(j8);
        defpackage.a.b("[theseus-playlist-PlaylistCheeseRestoreSharedPlayService-restoreSharedPlay] ", sbA.toString(), "PlaylistCheeseRestoreSharedPlayService-restoreSharedPlay");
        Iterator<T> it3 = multiTypeMedia2.f95225M.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it3.next();
                if (((Ou0.c) next2).f18089b == j8) {
                    break;
                }
            }
        }
        Ou0.c cVar = (Ou0.c) next2;
        String str = this.f95521d.a().f123879a;
        com.bilibili.ship.theseus.united.bean.d dVar = new com.bilibili.ship.theseus.united.bean.d(cVar != null ? Long.valueOf(cVar.f18090c) : null, null, cVar != null ? Long.valueOf(cVar.f18091d) : null, null, null, 58);
        String str2 = null;
        if (cVar != null) {
            str2 = cVar.f18097k;
        }
        l lVar = new l(sharedRecord, j7, j8, str, dVar, 0, new com.bilibili.ship.theseus.united.bean.b((Long) null, (Long) null, (Long) null, (String) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4079), (g) null, 384);
        if (j7 == eVar.f95137a.d()) {
            new Pair(Long.valueOf(multiTypeMedia2.d()), Boolean.FALSE);
            this.f95524g.getClass();
        }
        PlaylistSchedulingService.g(this.f95522e, multiTypeMedia2, cVar, lVar, null, 8);
    }
}
