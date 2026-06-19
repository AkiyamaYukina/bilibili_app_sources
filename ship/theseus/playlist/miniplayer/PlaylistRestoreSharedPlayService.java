package com.bilibili.ship.theseus.playlist.miniplayer;

import Ou0.c;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.compose.ui.input.pointer.k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.mini.player.biz.d;
import com.bilibili.mini.player.common.utils.i;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.united.bean.b;
import com.bilibili.ship.theseus.united.bean.g;
import ev0.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/miniplayer/PlaylistRestoreSharedPlayService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistRestoreSharedPlayService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f95768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f95769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f95770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlaylistRepository.e> f95773g = StateFlowKt.MutableStateFlow((Object) null);
    public boolean h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.miniplayer.PlaylistRestoreSharedPlayService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/miniplayer/PlaylistRestoreSharedPlayService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistRestoreSharedPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.miniplayer.PlaylistRestoreSharedPlayService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/miniplayer/PlaylistRestoreSharedPlayService$1$1.class */
        public static final class C07901 extends SuspendLambda implements Function2<Lifecycle.Event, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistRestoreSharedPlayService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07901(PlaylistRestoreSharedPlayService playlistRestoreSharedPlayService, Continuation<? super C07901> continuation) {
                super(2, continuation);
                this.this$0 = playlistRestoreSharedPlayService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07901 c07901 = new C07901(this.this$0, continuation);
                c07901.L$0 = obj;
                return c07901;
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
                if (((Lifecycle.Event) this.L$0) == Lifecycle.Event.ON_START && this.this$0.f95773g.getValue() != null) {
                    PlaylistRestoreSharedPlayService playlistRestoreSharedPlayService = this.this$0;
                    if (playlistRestoreSharedPlayService.h) {
                        playlistRestoreSharedPlayService.h = false;
                        d dVar = (d) BLRouter.get$default(BLRouter.INSTANCE, d.class, (String) null, 2, (Object) null);
                        Bundle bundleB = dVar != null ? dVar.b() : null;
                        i.a();
                        Integer numBoxInt = bundleB != null ? Boxing.boxInt(bundleB.getInt("mini_player_shared_record_id")) : null;
                        Long lBoxLong = bundleB != null ? Boxing.boxLong(bundleB.getLong("mini_player_shared_avid")) : null;
                        Long lBoxLong2 = bundleB != null ? Boxing.boxLong(bundleB.getLong("mini_player_shared_cid")) : null;
                        PlaylistRestoreSharedPlayService playlistRestoreSharedPlayService2 = this.this$0;
                        MutableStateFlow<PlaylistRepository.e> mutableStateFlow = playlistRestoreSharedPlayService2.f95773g;
                        try {
                            if (((PlaylistRepository.e) mutableStateFlow.getValue()) == null) {
                                BLog.i("PlaylistRestoreSharedPlayService-tryToRestorePlay", "[theseus-playlist-PlaylistRestoreSharedPlayService-tryToRestorePlay] unnecessary restore to play, because last media is null");
                                if (numBoxInt != null) {
                                    IPlayerContainer.Companion.forceDestroyShareRecord(numBoxInt.intValue());
                                }
                            } else {
                                IPlayerContainer.SharedRecord sharedRecordRetrieveSharedRecord = numBoxInt != null ? IPlayerContainer.Companion.retrieveSharedRecord(numBoxInt.intValue()) : null;
                                if (sharedRecordRetrieveSharedRecord == null || lBoxLong == null || lBoxLong2 == null) {
                                    BLog.i("PlaylistRestoreSharedPlayService-tryToRestorePlay", "[theseus-playlist-PlaylistRestoreSharedPlayService-tryToRestorePlay] restore to play but no shared data or play id");
                                    playlistRestoreSharedPlayService2.f95769c.attachByShared(PlayerSharingType.NORMAL, (PlayerSharingBundle) null);
                                    playlistRestoreSharedPlayService2.f95771e.l();
                                } else {
                                    playlistRestoreSharedPlayService2.b(sharedRecordRetrieveSharedRecord, lBoxLong.longValue(), lBoxLong2.longValue());
                                }
                            }
                        } finally {
                            mutableStateFlow.setValue((Object) null);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistRestoreSharedPlayService playlistRestoreSharedPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistRestoreSharedPlayService;
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
                Flow<Lifecycle.Event> eventFlow = LifecycleKt.getEventFlow(this.this$0.f95768b);
                C07901 c07901 = new C07901(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, c07901, this) == coroutine_suspended) {
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
    public PlaylistRestoreSharedPlayService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle, @NotNull PlayerContainer playerContainer, @NotNull C8043a c8043a, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull PlaylistRepository playlistRepository) {
        this.f95767a = coroutineScope;
        this.f95768b = lifecycle;
        this.f95769c = playerContainer;
        this.f95770d = c8043a;
        this.f95771e = playlistSchedulingService;
        this.f95772f = playlistRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public final void a(@NotNull PlaylistRepository.e eVar) {
        this.f95773g.setValue(eVar);
        long jD = eVar.f95137a.d();
        c cVar = eVar.f95138b;
        defpackage.a.b("[theseus-playlist-PlaylistRestoreSharedPlayService-leavePageAndSaveLast] ", "leave page and save last, avid:" + jD + ", cid:" + (cVar != null ? Long.valueOf(cVar.f18089b) : null), "PlaylistRestoreSharedPlayService-leavePageAndSaveLast");
    }

    public final void b(IPlayerContainer.SharedRecord sharedRecord, long j7, long j8) {
        Long lValueOf;
        Object next;
        Object next2;
        this.f95769c.attachByShared(PlayerSharingType.NORMAL, sharedRecord.getSharingBundle());
        Iterator<T> it = this.f95772f.d().iterator();
        loop0: while (true) {
            lValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MultiTypeMedia multiTypeMedia = (MultiTypeMedia) next;
            if (multiTypeMedia.t()) {
                List<c> list = multiTypeMedia.f95225M;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((c) it2.next()).f18088a == j7) {
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
            defpackage.a.b("[theseus-playlist-PlaylistRestoreSharedPlayService-restoreSharedPlay] ", k.a(j7, "Can not restore form shared record: avid=", " is not in playlist"), "PlaylistRestoreSharedPlayService-restoreSharedPlay");
            this.f95771e.l();
            return;
        }
        StringBuilder sbA = z.a(j7, "has record, try to attach: avid: ", ", cid: ");
        sbA.append(j8);
        defpackage.a.b("[theseus-playlist-PlaylistRestoreSharedPlayService-restoreSharedPlay] ", sbA.toString(), "PlaylistRestoreSharedPlayService-restoreSharedPlay");
        Iterator<T> it3 = multiTypeMedia2.f95225M.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it3.next();
                if (((c) next2).f18089b == j8) {
                    break;
                }
            }
        }
        c cVar = (c) next2;
        Long lValueOf2 = cVar != null ? Long.valueOf(cVar.f18090c) : null;
        if (cVar != null) {
            lValueOf = Long.valueOf(cVar.f18091d);
        }
        PlaylistSchedulingService.g(this.f95771e, multiTypeMedia2, cVar, new l(sharedRecord, j7, j8, this.f95770d.a().f123879a, new com.bilibili.ship.theseus.united.bean.d(lValueOf2, null, lValueOf, null, null, 58), 0, (b) null, (g) null, 448), null, 8);
    }
}
