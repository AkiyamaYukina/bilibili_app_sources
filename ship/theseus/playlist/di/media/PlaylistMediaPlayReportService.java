package com.bilibili.ship.theseus.playlist.di.media;

import Ou0.c;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.authorspace.ui.pages.p;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.playlist.PlaylistReportService;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import ev0.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistMediaPlayReportService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistMediaPlayReportService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95578a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.media.PlaylistMediaPlayReportService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistMediaPlayReportService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final h $player;
        final PlaylistRepository $playlistRepo;
        final PageReportService $reportService;
        final j.a $startParams;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.media.PlaylistMediaPlayReportService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistMediaPlayReportService$1$1.class */
        public static final class C07871 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C07871(Continuation<? super C07871> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07871 c07871 = new C07871(continuation);
                c07871.L$0 = obj;
                return c07871;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.READY);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, PlaylistRepository playlistRepository, PageReportService pageReportService, j.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$player = hVar;
            this.$playlistRepo = playlistRepository;
            this.$reportService = pageReportService;
            this.$startParams = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$player, this.$playlistRepo, this.$reportService, this.$startParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<PlayerAvailability> mutableStateFlow = this.$player.f91107a.f79286c;
                C07871 c07871 = new C07871(null);
                this.label = 1;
                if (FlowKt.first(mutableStateFlow, c07871, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<MultiTypeMedia> listD = this.$playlistRepo.d();
            j.a aVar = this.$startParams;
            Iterator<MultiTypeMedia> it = listD.iterator();
            int i8 = 0;
            loop0: while (true) {
                if (!it.hasNext()) {
                    i8 = -1;
                    break;
                }
                List<c> list = it.next().f95225M;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((c) it2.next()).f18088a == aVar.f117658b) {
                            break loop0;
                        }
                    }
                }
                i8++;
            }
            if (i8 == -1) {
                BLog.w("PlaylistMediaPlayReportService$1-invokeSuspend", "[theseus-playlist-PlaylistMediaPlayReportService$1-invokeSuspend] Index == -1: media not found in playlist.", (Throwable) null);
                return Unit.INSTANCE;
            }
            PageReportService.i(this.$reportService, "player.player.playlist-video.start.player", MapsKt.mapOf(new Pair[]{TuplesKt.to("playlist_sort_type", this.$playlistRepo.f().reportValue()), p.a(i8, 1, "playlist_video_sort"), TuplesKt.to("playlist_id", String.valueOf(this.$playlistRepo.f95085H)), TuplesKt.to("playlist_type", String.valueOf(this.$playlistRepo.f95087J))}), 4);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public PlaylistMediaPlayReportService(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull j.a aVar, @NotNull PlaylistReportService playlistReportService, @NotNull PlaylistRepository playlistRepository, @NotNull PageReportService pageReportService) {
        this.f95578a = coroutineScope;
        playlistReportService.a(aVar.f117659c);
        BuildersKt.launch$default(coroutineScope, Dispatchers.getDefault(), (CoroutineStart) null, new AnonymousClass1(hVar, playlistRepository, pageReportService, aVar, null), 2, (Object) null);
    }
}
