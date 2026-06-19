package com.bilibili.ship.theseus.playlist;

import android.app.KeyguardManager;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.playerbizcommon.features.background.BackgroundPlayService;
import com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.ugc.play.schedule.PlaybackMode;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import java.util.HashMap;
import java.util.Iterator;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.ui.player.data.NotificationStyle;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBackgroundPlayService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistBackgroundPlayService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f95002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerHeadsetService f95004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f95005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f95006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IReporterService f95007g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistBackgroundPlayService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBackgroundPlayService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistBackgroundPlayService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistBackgroundPlayService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBackgroundPlayService$1$1.class */
        public static final class C07651 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int label;
            final PlaylistBackgroundPlayService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07651(PlaylistBackgroundPlayService playlistBackgroundPlayService, Continuation<? super C07651> continuation) {
                super(2, continuation);
                this.this$0 = playlistBackgroundPlayService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07651(this.this$0, continuation);
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
                this.this$0.f95004d.updatePlaybackState();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistBackgroundPlayService playlistBackgroundPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistBackgroundPlayService;
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
                PlaylistBackgroundPlayService playlistBackgroundPlayService = this.this$0;
                StateFlow<Boolean> stateFlow = playlistBackgroundPlayService.f95003c.f95078A;
                C07651 c07651 = new C07651(playlistBackgroundPlayService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c07651, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBackgroundPlayService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95008a;

        public a() {
            this(false);
        }

        public a(boolean z6) {
            this.f95008a = z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBackgroundPlayService$b.class */
    public static final class b extends com.bilibili.playerbizcommon.features.background.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlaylistBackgroundPlayService f95009c;

        public b(PlaylistBackgroundPlayService playlistBackgroundPlayService) {
            this.f95009c = playlistBackgroundPlayService;
        }

        public final boolean a() {
            return BiliAccounts.get(FoundationAlias.getFapp().getApplicationContext()).isLogin() && !this.f95009c.f95003c.c().f95137a.h();
        }

        public final boolean b() {
            return ((Boolean) this.f95009c.f95003c.f95078A.getValue()).booleanValue();
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final NotificationStyle f() {
            NotificationStyle notificationStyleF = super.f();
            notificationStyleF.forceShowNextAndPrev = true;
            notificationStyleF.isFixedPlayMode = true ^ this.f95009c.f95005e.f95008a;
            return notificationStyleF;
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final int g() {
            return this.f95009c.f95003c.d().size();
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final int h() {
            PlaylistBackgroundPlayService playlistBackgroundPlayService = this.f95009c;
            if (!playlistBackgroundPlayService.f95005e.f95008a) {
                return 4;
            }
            PlaybackMode.a aVar = PlaybackMode.Companion;
            int i7 = playlistBackgroundPlayService.f95002b.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
            aVar.getClass();
            return PlaybackMode.a.a(i7).getValue();
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final int i() {
            PlaylistBackgroundPlayService playlistBackgroundPlayService = this.f95009c;
            MultiTypeMedia multiTypeMedia = playlistBackgroundPlayService.f95003c.c().f95137a;
            Iterator<MultiTypeMedia> it = playlistBackgroundPlayService.f95003c.d().iterator();
            int i7 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                if (it.next().f95235i == multiTypeMedia.f95235i) {
                    break;
                }
                i7++;
            }
            return i7;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.bilibili.playerbizcommon.features.background.a
        public final String j() throws NoWhenBranchMatchedException {
            String string;
            PlaybackMode.a aVar = PlaybackMode.Companion;
            PlaylistBackgroundPlayService playlistBackgroundPlayService = this.f95009c;
            playlistBackgroundPlayService.getClass();
            int i7 = 0;
            int i8 = playlistBackgroundPlayService.f95002b.getInt(com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
            aVar.getClass();
            PlaybackMode playbackModeA = PlaybackMode.a.a(i8);
            aVar.getClass();
            int i9 = PlaybackMode.a.C0909a.f98168a[playbackModeA.ordinal()];
            if (i9 == 1) {
                string = FoundationAlias.getFapp().getString(2131847305);
            } else if (i9 == 2) {
                string = FoundationAlias.getFapp().getString(2131847476);
            } else if (i9 == 3) {
                string = FoundationAlias.getFapp().getString(2131847390);
            } else {
                if (i9 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                string = FoundationAlias.getFapp().getString(2131845589);
            }
            if (g() <= 1) {
                i7 = 1;
            }
            return com.bilibili.playerbizcommon.features.background.a.l(FoundationAlias.getFapp().getString(2131832861), new Object[]{0, string, Integer.valueOf(i7), Integer.valueOf(i() + 1), Integer.valueOf(Math.max(g(), 1))});
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
        @Override // com.bilibili.playerbizcommon.features.background.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tv.danmaku.bili.ui.player.data.VideoData k() {
            /*
                r4 = this;
                tv.danmaku.bili.ui.player.data.VideoData r0 = new tv.danmaku.bili.ui.player.data.VideoData
                r1 = r0
                r1.<init>()
                r9 = r0
                r0 = r4
                com.bilibili.ship.theseus.playlist.PlaylistBackgroundPlayService r0 = r0.f95009c
                r6 = r0
                r0 = r6
                com.bilibili.ship.theseus.playlist.PlaylistRepository r0 = r0.f95003c
                com.bilibili.ship.theseus.playlist.PlaylistRepository$e r0 = r0.c()
                com.bilibili.ship.theseus.playlist.api.MultiTypeMedia r0 = r0.f95137a
                r10 = r0
                r0 = r6
                com.bilibili.ship.theseus.playlist.PlaylistRepository r0 = r0.f95003c
                com.bilibili.ship.theseus.playlist.PlaylistRepository$e r0 = r0.c()
                Ou0.c r0 = r0.f95138b
                r6 = r0
                r0 = r10
                boolean r0 = r0.t()
                if (r0 == 0) goto L3e
                r0 = r10
                boolean r0 = r0.f95219G
                if (r0 != 0) goto L3e
                r0 = r10
                java.lang.String r0 = r0.f95237k
                r6 = r0
                goto L68
            L3e:
                r0 = r10
                java.util.List<Ou0.c> r0 = r0.f95225M
                int r0 = r0.size()
                r5 = r0
                r0 = r10
                java.lang.String r0 = r0.f95247u
                r7 = r0
                r0 = r5
                r1 = 1
                if (r0 <= r1) goto L66
                r0 = r6
                if (r0 == 0) goto L66
                r0 = r6
                java.lang.String r0 = r0.f18096j
                r8 = r0
                r0 = r8
                r6 = r0
                r0 = r8
                if (r0 != 0) goto L68
            L66:
                r0 = r7
                r6 = r0
            L68:
                r0 = r9
                r1 = r6
                r0.title = r1
                r0 = r10
                com.bilibili.ship.theseus.playlist.api.Upper r0 = r0.f95249w
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L83
                r0 = r6
                java.lang.String r0 = r0.f95324f
                r7 = r0
                r0 = r7
                r6 = r0
                r0 = r7
                if (r0 != 0) goto L86
            L83:
                java.lang.String r0 = ""
                r6 = r0
            L86:
                r0 = r9
                r1 = r6
                r0.author = r1
                r0 = r9
                r1 = r10
                java.lang.String r1 = r1.f95233f
                r0.cover = r1
                r0 = r9
                r1 = r10
                long r1 = r1.d()
                r0.avid = r1
                r0 = r9
                r1 = r10
                int r1 = r1.p()
                r0.page = r1
                r0 = r9
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistBackgroundPlayService.b.k():tv.danmaku.bili.ui.player.data.VideoData");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistBackgroundPlayService$c.class */
    public static final class c implements Lq0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lq0.b f95010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Lq0.b f95011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PlaylistBackgroundPlayService f95012c;

        public c(Lq0.b bVar, PlaylistBackgroundPlayService playlistBackgroundPlayService) {
            this.f95011b = bVar;
            this.f95012c = playlistBackgroundPlayService;
            this.f95010a = bVar;
        }

        @Override // Lq0.b
        public final boolean a() {
            return this.f95010a.a();
        }

        @Override // Lq0.b
        public final boolean b() {
            return this.f95010a.b();
        }

        @Override // Lq0.b
        public final void c(String str, Bundle bundle) {
            KeyguardManager keyguardManager;
            Object next;
            if (!Intrinsics.areEqual(str, "com.bilibili.player.music.notification.favorite")) {
                this.f95011b.c(str, bundle);
                return;
            }
            PlaylistBackgroundPlayService playlistBackgroundPlayService = this.f95012c;
            long jD = playlistBackgroundPlayService.f95003c.c().f95137a.d();
            PlaylistRepository playlistRepository = playlistBackgroundPlayService.f95003c;
            Iterator<T> it = playlistRepository.d().iterator();
            while (true) {
                keyguardManager = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((MultiTypeMedia) next).d() == jD) {
                        break;
                    }
                }
            }
            MultiTypeMedia multiTypeMedia = (MultiTypeMedia) next;
            String str2 = (multiTypeMedia == null || multiTypeMedia.h != 1) ? "8" : "9";
            HashMap map = new HashMap();
            map.put("card_entity_id", String.valueOf(playlistRepository.c().f95137a.d()));
            Object systemService = FoundationAlias.getFapp().getApplicationContext().getSystemService("keyguard");
            if (systemService instanceof KeyguardManager) {
                keyguardManager = (KeyguardManager) systemService;
            }
            map.put("card_loc", (keyguardManager == null || !keyguardManager.isKeyguardLocked()) ? "0" : "1");
            map.put("track_id", playlistBackgroundPlayService.f95006f.a().f123882d);
            map.put("click_type", str2);
            playlistBackgroundPlayService.f95007g.report(new NeuronsEvents.b("player.player.interact.background.player", map));
            playlistRepository.f95116x.tryEmit(Unit.INSTANCE);
        }

        @Override // Lq0.b
        public final void d() {
            this.f95010a.d();
        }

        @Override // Lq0.b
        public final void e() {
            this.f95010a.e();
        }

        @Override // Lq0.b
        public final boolean enableLike() {
            return this.f95010a.enableLike();
        }

        @Override // Lq0.b
        public final void f(MediaSessionCompat mediaSessionCompat) {
            this.f95010a.f(mediaSessionCompat);
        }

        @Override // Lq0.b
        public final void g(MediaSessionCompat mediaSessionCompat, int i7) {
            this.f95010a.g(mediaSessionCompat, i7);
        }

        @Override // Lq0.b
        public final boolean getLikeState() {
            return this.f95010a.getLikeState();
        }

        @Override // Lq0.b
        public final void h(com.bilibili.playerbizcommon.features.background.a aVar) {
            this.f95010a.h(aVar);
        }

        @Override // Lq0.b
        public final void i() {
            this.f95010a.i();
        }

        @Override // Lq0.b
        public final void j() {
            this.f95010a.j();
        }

        @Override // Lq0.b
        public final com.bilibili.playerbizcommon.features.background.a k() {
            return this.f95010a.k();
        }

        @Override // Lq0.b
        public final void l(MediaSessionCompat mediaSessionCompat) {
            this.f95010a.l(mediaSessionCompat);
        }

        @Override // Lq0.b
        public final void m(long j7) {
            this.f95010a.m(j7);
        }

        @Override // Lq0.b
        public final void onPause() {
            this.f95010a.onPause();
        }

        @Override // Lq0.b
        public final void onPlay() {
            this.f95010a.onPlay();
        }

        @Override // Lq0.b
        public final void onRelease() {
            this.f95010a.onRelease();
        }

        @Override // Lq0.b
        public final void onStop() {
            this.f95010a.onStop();
        }
    }

    @Inject
    public PlaylistBackgroundPlayService(@NotNull CoroutineScope coroutineScope, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull PlaylistRepository playlistRepository, @NotNull BackgroundPlayService backgroundPlayService, @NotNull PlayerHeadsetService playerHeadsetService, @NotNull a aVar, @NotNull C8043a c8043a, @NotNull IReporterService iReporterService) {
        this.f95001a = coroutineScope;
        this.f95002b = iPlayerSettingService;
        this.f95003c = playlistRepository;
        this.f95004d = playerHeadsetService;
        this.f95005e = aVar;
        this.f95006f = c8043a;
        this.f95007g = iReporterService;
        pageBackgroundPlayRepository.f98997f = false;
        backgroundPlayService.setAlwaysDisplayBackgroundControls(true);
        playerHeadsetService.getMediaSessionPlayback().h(new b(this));
        playerHeadsetService.setMediaSessionPlayback(new c(playerHeadsetService.getMediaSessionPlayback(), this));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
