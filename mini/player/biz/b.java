package com.bilibili.mini.player.biz;

import F3.C1835t2;
import K7.M;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.media.util.PlayerCloudSetting;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.tencent.connect.common.Constants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rh0.C8524a;
import sh0.C8594c;
import sh0.InterfaceC8593b;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.player.data.NotificationStyle;
import tv.danmaku.bili.ui.player.notification.BackgroundMusicService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/b.class */
@Singleton
public final class b implements com.bilibili.mini.player.biz.d, com.bilibili.mini.player.common.manager.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Bundle f66037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f66038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66039e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f66041g;

    @Nullable
    public ICardPlayerContext h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Video.PlayableParams f66042i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f66044k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Video.PlayableParams f66045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f66046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f66047n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f66048o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Integer f66049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final ScreenStatusReceiver f66050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public C8524a f66051r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final c f66052s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final d f66053t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.mini.player.biz.a f66054u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final C0369b f66055v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Video.PlayableParams> f66035a = com.bilibili.app.dialogmanager2.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f66036b = LazyKt.lazy(new C1835t2(8));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66040f = 9500;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<ICardPlaySateChangedCallback> f66043j = new CopyOnWriteArrayList<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f66056a;

        static {
            int[] iArr = new int[Topic.values().length];
            try {
                iArr[Topic.SIGN_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f66056a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.mini.player.biz.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/b$b.class */
    public static final class C0369b extends com.bilibili.playerbizcommon.features.background.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f66057c;

        public C0369b(b bVar) {
            this.f66057c = bVar;
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final long d() {
            ICardPlayerContext iCardPlayerContext = this.f66057c.h;
            return iCardPlayerContext != null ? iCardPlayerContext.getDuration() : 0L;
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final NotificationStyle f() {
            NotificationStyle notificationStyle = new NotificationStyle();
            notificationStyle.backgroundColor = ThemeUtils.getColor(BiliContext.application(), -298343);
            notificationStyle.notificationType = 1;
            notificationStyle.isFixedPlayMode = false;
            notificationStyle.forceShowNextAndPrev = this.f66057c.f66048o;
            return notificationStyle;
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final int g() {
            return this.f66057c.f66035a.size();
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final int h() {
            return IPlayerSettingService.Companion.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final int i() {
            b bVar = this.f66057c;
            return bVar.f66035a.indexOf(bVar.f66042i);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
        @Override // com.bilibili.playerbizcommon.features.background.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String j() {
            /*
                Method dump skipped, instruction units count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.biz.b.C0369b.j():java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
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
                r11 = r0
                r0 = r4
                com.bilibili.mini.player.biz.b r0 = r0.f66057c
                tv.danmaku.biliplayerv2.service.Video$PlayableParams r0 = r0.f66042i
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L1d
                r0 = r7
                tv.danmaku.biliplayerv2.service.Video$DisplayParams r0 = r0.getDisplayParams()
                r7 = r0
                goto L1f
            L1d:
                r0 = 0
                r7 = r0
            L1f:
                java.lang.String r0 = ""
                r9 = r0
                r0 = r7
                if (r0 == 0) goto L36
                r0 = r7
                java.lang.String r0 = r0.getTitle()
                r10 = r0
                r0 = r10
                r8 = r0
                r0 = r10
                if (r0 != 0) goto L3a
            L36:
                java.lang.String r0 = ""
                r8 = r0
            L3a:
                r0 = r11
                r1 = r8
                r0.title = r1
                r0 = r7
                if (r0 == 0) goto L54
                r0 = r7
                java.lang.String r0 = r0.getCover()
                r10 = r0
                r0 = r10
                r8 = r0
                r0 = r10
                if (r0 != 0) goto L58
            L54:
                java.lang.String r0 = ""
                r8 = r0
            L58:
                r0 = r11
                r1 = r8
                r0.cover = r1
                r0 = r9
                r8 = r0
                r0 = r7
                if (r0 == 0) goto L79
                r0 = r7
                java.lang.String r0 = r0.getAuthor()
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L79
                r0 = r9
                r8 = r0
                goto L79
            L79:
                r0 = r11
                r1 = r8
                r0.author = r1
                r0 = r7
                if (r0 == 0) goto L8c
                r0 = r7
                long r0 = r0.getAvid()
                r5 = r0
                goto L8e
            L8c:
                r0 = 0
                r5 = r0
            L8e:
                r0 = r11
                r1 = r5
                r0.avid = r1
                r0 = r11
                r1 = 0
                r0.page = r1
                r0 = r11
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.biz.b.C0369b.k():tv.danmaku.bili.ui.player.data.VideoData");
        }

        @Override // com.bilibili.playerbizcommon.features.background.a
        public final void m() {
            C8524a c8524a = this.f66057c.f66051r;
            if (c8524a != null) {
                c8524a.b();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/b$c.class */
    public static final class c implements ICardPlaySateChangedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f66058a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/b$c$a.class */
        public static final class a implements Lq0.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Lq0.b f66059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f66060b;

            public a(Lq0.b bVar, b bVar2) {
                this.f66060b = bVar2;
                this.f66059a = bVar;
            }

            @Override // Lq0.b
            public final boolean a() {
                return this.f66059a.a();
            }

            @Override // Lq0.b
            public final boolean b() {
                return this.f66059a.b();
            }

            @Override // Lq0.b
            public final void c(String str, Bundle bundle) {
                this.f66059a.c(str, bundle);
            }

            @Override // Lq0.b
            public final void d() {
                this.f66059a.d();
            }

            @Override // Lq0.b
            public final void e() {
                this.f66059a.e();
            }

            @Override // Lq0.b
            public final boolean enableLike() {
                return this.f66059a.enableLike();
            }

            @Override // Lq0.b
            public final void f(MediaSessionCompat mediaSessionCompat) {
                this.f66059a.f(mediaSessionCompat);
            }

            @Override // Lq0.b
            public final void g(MediaSessionCompat mediaSessionCompat, int i7) {
                this.f66059a.g(mediaSessionCompat, i7);
            }

            @Override // Lq0.b
            public final boolean getLikeState() {
                return this.f66059a.getLikeState();
            }

            @Override // Lq0.b
            public final void h(com.bilibili.playerbizcommon.features.background.a aVar) {
                this.f66059a.h(aVar);
            }

            @Override // Lq0.b
            public final void i() {
                b.k(this.f66060b);
            }

            @Override // Lq0.b
            public final void j() {
                b.l(this.f66060b);
            }

            @Override // Lq0.b
            public final com.bilibili.playerbizcommon.features.background.a k() {
                return this.f66059a.k();
            }

            @Override // Lq0.b
            public final void l(MediaSessionCompat mediaSessionCompat) {
                this.f66059a.l(mediaSessionCompat);
            }

            @Override // Lq0.b
            public final void m(long j7) {
                this.f66059a.m(j7);
            }

            @Override // Lq0.b
            public final void onPause() {
                this.f66059a.onPause();
            }

            @Override // Lq0.b
            public final void onPlay() {
                this.f66059a.onPlay();
            }

            @Override // Lq0.b
            public final void onRelease() {
                this.f66059a.onRelease();
            }

            @Override // Lq0.b
            public final void onStop() {
                this.f66059a.onStop();
            }
        }

        public c(b bVar) {
            this.f66058a = bVar;
        }

        public final void onCompleted(ICardPlayerContext iCardPlayerContext) {
            Video.ReportCommonParams reportCommonParams;
            super.onCompleted(iCardPlayerContext);
            b bVar = this.f66058a;
            Integer num = bVar.f66049p;
            int iIntValue = num != null ? num.intValue() : IPlayerSettingService.Companion.getMMainPlayerPreference().getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
            if (iIntValue == 0) {
                if (bVar.f66035a.size() <= 1) {
                    BLog.i("DefaultMiniPlayerBizManager", "mini player play list completed");
                    return;
                }
                int iIndexOf = bVar.f66035a.indexOf(bVar.f66042i) + 1;
                Video.PlayableParams playableParams = bVar.f66042i;
                Long lValueOf = (playableParams == null || (reportCommonParams = playableParams.getReportCommonParams()) == null) ? null : Long.valueOf(reportCommonParams.getCid());
                Video.PlayableParams playableParams2 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf);
                Long lValueOf2 = null;
                if (playableParams2 != null) {
                    Video.ReportCommonParams reportCommonParams2 = playableParams2.getReportCommonParams();
                    lValueOf2 = null;
                    if (reportCommonParams2 != null) {
                        lValueOf2 = Long.valueOf(reportCommonParams2.getCid());
                    }
                }
                BLog.i("DefaultMiniPlayerBizManager", lValueOf + " is completed, start play next " + lValueOf2);
                if (iIndexOf <= 0 || iIndexOf >= bVar.f66035a.size()) {
                    return;
                }
                bVar.n(true);
                Video.PlayableParams playableParams3 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf);
                if (playableParams3 != null) {
                    playableParams3.setFromAutoPlay(99);
                }
                com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, iIndexOf, 11);
                return;
            }
            if (iIntValue == 1) {
                BLog.i("DefaultMiniPlayerBizManager", "mini player play list size > 1 and completion pause");
                return;
            }
            if (iIntValue == 2) {
                ICardPlayerContext iCardPlayerContext2 = bVar.h;
                if (iCardPlayerContext2 != null) {
                    iCardPlayerContext2.seekTo(0L);
                }
                ICardPlayerContext iCardPlayerContext3 = bVar.h;
                if (iCardPlayerContext3 != null) {
                    iCardPlayerContext3.resume();
                }
                BLog.i("DefaultMiniPlayerBizManager", "mini player play list completion single loop");
                return;
            }
            if (iIntValue != 4) {
                BLog.w("DefaultMiniPlayerBizManager", "mini player play list size > 1 ");
                return;
            }
            bVar.n(true);
            if (bVar.f66035a.size() <= 1) {
                ICardPlayerContext iCardPlayerContext4 = bVar.h;
                if (iCardPlayerContext4 != null) {
                    iCardPlayerContext4.seekTo(0L);
                }
                ICardPlayerContext iCardPlayerContext5 = bVar.h;
                if (iCardPlayerContext5 != null) {
                    iCardPlayerContext5.resume();
                }
                BLog.i("DefaultMiniPlayerBizManager", "mini player play list size 1，completion loop");
                return;
            }
            int iIndexOf2 = 1 + bVar.f66035a.indexOf(bVar.f66042i);
            if (iIndexOf2 >= bVar.f66035a.size()) {
                Video.PlayableParams playableParams4 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, 0);
                if (playableParams4 != null) {
                    playableParams4.setFromAutoPlay(99);
                }
                com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, 0, 27);
                return;
            }
            Video.PlayableParams playableParams5 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf2);
            if (playableParams5 != null) {
                playableParams5.setFromAutoPlay(99);
            }
            com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, iIndexOf2, 11);
        }

        public final void onStart(ICardPlayerContext iCardPlayerContext) {
            Application application;
            super.onStart(iCardPlayerContext);
            b bVar = this.f66058a;
            if (bVar.h == null) {
                Lq0.b mediaSessionPlayback = iCardPlayerContext.getMediaSessionPlayback();
                if (mediaSessionPlayback != null) {
                    a aVar = new a(mediaSessionPlayback, bVar);
                    aVar.h(bVar.f66055v);
                    iCardPlayerContext.setMediaSessionPlayback(aVar);
                }
                MediaSessionCompat mediaSession = iCardPlayerContext.getMediaSession(true);
                if (mediaSession != null) {
                    C8524a c8524a = new C8524a(mediaSession, iCardPlayerContext);
                    bVar.f66051r = c8524a;
                    if (c8524a.f126673c == null && !BackgroundMusicService.g && !BackgroundMusicService.f && (application = BiliContext.application()) != null) {
                        BackgroundMusicService.g = true;
                        application.bindService(new Intent(application, (Class<?>) BackgroundMusicService.class), c8524a.f126675e, 1);
                        Activity activity = BiliContext.topActivity();
                        if (activity != null) {
                            try {
                                application.startService(new Intent(activity, (Class<?>) BackgroundMusicService.class));
                            } catch (Exception e7) {
                                BLog.e("MiniBackgroundServiceManager", "start service failed", e7);
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    }
                }
                if (((Boolean) Wi1.e.a.getValue()).booleanValue()) {
                    iCardPlayerContext.enableMediaController(true);
                }
            }
            bVar.h = iCardPlayerContext;
            iCardPlayerContext.resetVideoFlip();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/b$d.class */
    public static final class d implements ScreenStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f66061a;

        public d(b bVar) {
            this.f66061a = bVar;
        }

        @Override // com.bilibili.mini.player.biz.ScreenStatusListener
        public final void onScreenStatusChanged(boolean z6) {
            ICardPlayerContext iCardPlayerContext;
            b bVar = this.f66061a;
            if (!z6 && !BiliContext.isVisible() && (iCardPlayerContext = bVar.h) != null && iCardPlayerContext.getPlayerState() == 4) {
                z50.a aVar = PlayerCloudSetting.a;
                if (!PlayerCloudSetting.b(PlayerCloudSetting.Setting.BackgroundPlay)) {
                    ICardPlayerContext iCardPlayerContext2 = bVar.h;
                    if (iCardPlayerContext2 != null) {
                        iCardPlayerContext2.pause();
                    }
                    BLog.i("DefaultMiniPlayerBizManager", "screen off, pause");
                }
            }
            BLog.i("DefaultMiniPlayerBizManager", "screen off:" + z6 + ", change audio-only");
            ICardPlayerContext iCardPlayerContext3 = bVar.h;
            if (iCardPlayerContext3 != null) {
                iCardPlayerContext3.setAudioOnly(!z6);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.mini.player.biz.a, java.lang.Object] */
    public b() {
        Integer intOrNull;
        String str = (String) ConfigManager.Companion.config().get("videodetail.miniscreen_ai_relate_max_count", Constants.DEFAULT_UIN);
        this.f66046m = (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 1000 : intOrNull.intValue();
        this.f66048o = true;
        this.f66050q = new ScreenStatusReceiver();
        this.f66052s = new c(this);
        this.f66053t = new d(this);
        this.f66054u = new Object();
        this.f66055v = new C0369b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(com.bilibili.mini.player.biz.b r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.biz.b.j(com.bilibili.mini.player.biz.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final boolean k(b bVar) {
        Video.ReportCommonParams reportCommonParams;
        Integer num = bVar.f66049p;
        boolean z6 = false;
        int iIntValue = num != null ? num.intValue() : IPlayerSettingService.Companion.getMMainPlayerPreference().getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        bVar.n(false);
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2) {
            if (bVar.f66035a.size() > 1) {
                int iIndexOf = bVar.f66035a.indexOf(bVar.f66042i) + 1;
                Video.PlayableParams playableParams = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf);
                M.c((playableParams == null || (reportCommonParams = playableParams.getReportCommonParams()) == null) ? null : Long.valueOf(reportCommonParams.getCid()), "play next ", "DefaultMiniPlayerBizManager");
                if (iIndexOf <= 0 || iIndexOf >= bVar.f66035a.size()) {
                    BLog.i("DefaultMiniPlayerBizManager", "mini player play list completed");
                } else {
                    Video.PlayableParams playableParams2 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf);
                    if (playableParams2 != null) {
                        playableParams2.setFromAutoPlay(0);
                    }
                    com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, iIndexOf, 11);
                }
            } else {
                BLog.i("DefaultMiniPlayerBizManager", "mini player play list completed");
            }
            return z6;
        }
        if (iIntValue == 4) {
            if (bVar.f66035a.size() <= 1) {
                int iIndexOf2 = bVar.f66035a.indexOf(bVar.f66042i);
                Video.PlayableParams playableParams3 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf2);
                if (playableParams3 != null) {
                    playableParams3.setFromAutoPlay(0);
                }
                com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, iIndexOf2, 11);
            } else {
                int iIndexOf3 = bVar.f66035a.indexOf(bVar.f66042i) + 1;
                if (iIndexOf3 >= bVar.f66035a.size()) {
                    Video.PlayableParams playableParams4 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, 0);
                    if (playableParams4 != null) {
                        playableParams4.setFromAutoPlay(0);
                    }
                    com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, 0, 27);
                } else {
                    Video.PlayableParams playableParams5 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf3);
                    if (playableParams5 != null) {
                        playableParams5.setFromAutoPlay(0);
                    }
                    com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, iIndexOf3, 11);
                }
            }
        }
        z6 = true;
        return z6;
    }

    public static final boolean l(b bVar) {
        Video.ReportCommonParams reportCommonParams;
        Integer num = bVar.f66049p;
        boolean z6 = false;
        int iIntValue = num != null ? num.intValue() : IPlayerSettingService.Companion.getMMainPlayerPreference().getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        bVar.n(false);
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2) {
            if (bVar.f66035a.size() > 1) {
                int iIndexOf = bVar.f66035a.indexOf(bVar.f66042i) - 1;
                Video.PlayableParams playableParams = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf);
                M.c((playableParams == null || (reportCommonParams = playableParams.getReportCommonParams()) == null) ? null : Long.valueOf(reportCommonParams.getCid()), "play next ", "DefaultMiniPlayerBizManager");
                if (iIndexOf >= 0) {
                    Video.PlayableParams playableParams2 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf);
                    if (playableParams2 != null) {
                        playableParams2.setFromAutoPlay(0);
                    }
                    com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, iIndexOf, 11);
                } else {
                    BLog.i("DefaultMiniPlayerBizManager", "mini player play list completed");
                }
            } else {
                BLog.i("DefaultMiniPlayerBizManager", "mini player play list completed");
            }
            return z6;
        }
        if (iIntValue == 4) {
            if (bVar.f66035a.size() <= 1) {
                int iIndexOf2 = bVar.f66035a.indexOf(bVar.f66042i);
                Video.PlayableParams playableParams3 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf2);
                if (playableParams3 != null) {
                    playableParams3.setFromAutoPlay(0);
                }
                com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, iIndexOf2, 11);
            } else {
                int iIndexOf3 = bVar.f66035a.indexOf(bVar.f66042i) - 1;
                if (iIndexOf3 < 0) {
                    Video.PlayableParams playableParams4 = (Video.PlayableParams) CollectionsKt.lastOrNull(bVar.f66035a);
                    if (playableParams4 != null) {
                        playableParams4.setFromAutoPlay(0);
                    }
                    com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, 0, 27);
                } else {
                    Video.PlayableParams playableParams5 = (Video.PlayableParams) CollectionsKt.getOrNull(bVar.f66035a, iIndexOf3);
                    if (playableParams5 != null) {
                        playableParams5.setFromAutoPlay(0);
                    }
                    com.bilibili.mini.player.biz.d.d(bVar, 0, 0, bVar.f66039e, iIndexOf3, 11);
                }
            }
        }
        z6 = true;
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    @Override // com.bilibili.mini.player.common.manager.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.biz.b.a():void");
    }

    @Override // com.bilibili.mini.player.biz.d
    @NotNull
    public final Bundle b() {
        Video.DisplayParams displayParams;
        Video.DisplayParams displayParams2;
        int iC = com.bilibili.mini.player.common.manager.c.f66064b.c();
        Video.PlayableParams playableParams = this.f66042i;
        long avid = (playableParams == null || (displayParams2 = playableParams.getDisplayParams()) == null) ? 0L : displayParams2.getAvid();
        Video.PlayableParams playableParams2 = this.f66042i;
        long cid = 0;
        if (playableParams2 != null) {
            Video.DisplayParams displayParams3 = playableParams2.getDisplayParams();
            cid = 0;
            if (displayParams3 != null) {
                cid = displayParams3.getCid();
            }
        }
        ICardPlayerContext iCardPlayerContext = this.h;
        int videoHeight = 0;
        int videoWidth = iCardPlayerContext != null ? iCardPlayerContext.getVideoWidth() : 0;
        ICardPlayerContext iCardPlayerContext2 = this.h;
        if (iCardPlayerContext2 != null) {
            videoHeight = iCardPlayerContext2.getVideoHeight();
        }
        Video.PlayableParams playableParams3 = this.f66042i;
        float displayRotate = (playableParams3 == null || (displayParams = playableParams3.getDisplayParams()) == null) ? 0.5625f : displayParams.getDisplayRotate();
        Bundle bundle = new Bundle();
        bundle.putInt("mini_player_shared_record_id", iC);
        bundle.putLong("mini_player_shared_avid", avid);
        bundle.putLong("mini_player_shared_cid", cid);
        bundle.putLong("mini_player_shared_cid", cid);
        bundle.putInt("mini_player_shared_width", videoWidth);
        bundle.putInt("mini_player_shared_height", videoHeight);
        bundle.putFloat("mini_player_shared_display_rotate", displayRotate);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b1  */
    @Override // com.bilibili.mini.player.biz.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.biz.b.c(int, int, int, boolean, boolean):void");
    }

    @Override // com.bilibili.mini.player.biz.d
    public final void e() {
        this.f66040f = 9503;
    }

    @Override // com.bilibili.mini.player.biz.d
    public final void f(@NotNull Class<? extends Video.PlayableParams> cls, @NotNull InterfaceC8593b interfaceC8593b) {
        C8594c c8594c = (C8594c) this.f66036b.getValue();
        InterfaceC8593b interfaceC8593b2 = c8594c.f127259a.get(cls);
        if (interfaceC8593b2 != null) {
            BLog.i("MiniPlayerBizProviderHouse", "set provider" + interfaceC8593b + " to replace " + interfaceC8593b2);
        }
        c8594c.f127259a.put(cls, interfaceC8593b);
    }

    @Override // com.bilibili.mini.player.biz.d
    public final void g(@NotNull List<? extends Video.PlayableParams> list) {
        this.f66035a.clear();
        this.f66035a.addAll(list);
    }

    @Override // com.bilibili.mini.player.biz.d
    public final void h(@Nullable Integer num) {
        this.f66049p = num;
    }

    @Override // com.bilibili.mini.player.biz.d
    public final void i(@NotNull Bundle bundle) {
        this.f66037c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(boolean z6) {
        InterfaceC8593b interfaceC8593bA;
        Video.PlayableParams playableParams = this.f66042i;
        if (playableParams == null || (interfaceC8593bA = ((C8594c) this.f66036b.getValue()).a(playableParams.getClass())) == null || interfaceC8593bA.b() == null || z6) {
            return;
        }
        ((Bq0.c) FJ0.d.c.getValue()).b();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(boolean r11) {
        /*
            r10 = this;
            r0 = r10
            tv.danmaku.video.bilicardplayer.ICardPlayerContext r0 = r0.h
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L6d
            r0 = r14
            tv.danmaku.biliplayerv2.service.Video$PlayableParams r0 = r0.getCurrentPlayableParams()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L22
            r0 = r12
            java.lang.String r0 = r0.getTrackId()
            r13 = r0
            r0 = r13
            r12 = r0
            r0 = r13
            if (r0 != 0) goto L26
        L22:
            java.lang.String r0 = ""
            r12 = r0
        L26:
            r0 = r11
            if (r0 == 0) goto L31
            java.lang.String r0 = "auto"
            r13 = r0
            goto L35
        L31:
            java.lang.String r0 = "normal"
            r13 = r0
        L35:
            r0 = r14
            tv.danmaku.biliplayerv2.service.report.NeuronsEvents$b r1 = new tv.danmaku.biliplayerv2.service.report.NeuronsEvents$b
            r2 = r1
            java.lang.String r3 = "player.miniplayer.miniplayer-board.autoplay.player"
            r4 = 3
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            r5 = r4
            r6 = 0
            java.lang.String r7 = "type"
            java.lang.String r8 = "lite"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            r5[r6] = r7
            r5 = r4
            r6 = 1
            java.lang.String r7 = "play_type"
            r8 = r13
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            r5[r6] = r7
            r5 = r4
            r6 = 2
            java.lang.String r7 = "track_id"
            r8 = r12
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            r5[r6] = r7
            java.util.Map r4 = kotlin.collections.MapsKt.mapOf(r4)
            r2.<init>(r3, r4)
            r0.report(r1)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mini.player.biz.b.n(boolean):void");
    }
}
