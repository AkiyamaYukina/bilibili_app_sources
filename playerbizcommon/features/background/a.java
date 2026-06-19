package com.bilibili.playerbizcommon.features.background;

import Di0.C1598b;
import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import java.lang.ref.WeakReference;
import java.text.MessageFormat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.ui.player.data.NotificationStyle;
import tv.danmaku.bili.ui.player.notification.BackgroundMusicService;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainerKt;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/a.class */
public abstract class a implements BackgroundMusicService.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public WeakReference<IPlayerContainer> f79616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public f f79617b;

    public a() {
        f fVar = new f();
        fVar.f79623c = true;
        this.f79617b = fVar;
    }

    @NotNull
    public static String l(@Nullable String str, @NotNull Object[] objArr) {
        if (str == null) {
            return "";
        }
        try {
            return new MessageFormat(str).format(objArr);
        } catch (Exception e7) {
            return "";
        }
    }

    public boolean c() {
        return this instanceof C1598b;
    }

    public long d() {
        IPlayerContainer iPlayerContainer;
        IPlayerCoreService playerCoreService;
        WeakReference<IPlayerContainer> weakReference = this.f79616a;
        return (weakReference == null || (iPlayerContainer = weakReference.get()) == null || (playerCoreService = iPlayerContainer.getPlayerCoreService()) == null) ? 0L : playerCoreService.getDuration();
    }

    public boolean e() {
        return false;
    }

    @NotNull
    public NotificationStyle f() {
        NotificationStyle notificationStyle = new NotificationStyle();
        Application application = BiliContext.application();
        notificationStyle.backgroundColor = ThemeUtils.getColor(application != null ? application.getApplicationContext() : null, -298343);
        f fVar = this.f79617b;
        notificationStyle.notificationType = fVar.f79621a;
        notificationStyle.isFixedPlayMode = fVar.f79622b != -1;
        notificationStyle.forceShowNextAndPrev = false;
        return notificationStyle;
    }

    public int g() {
        IPlayerContainer iPlayerContainer;
        WeakReference<IPlayerContainer> weakReference = this.f79616a;
        if (weakReference == null || (iPlayerContainer = weakReference.get()) == null) {
            return 1;
        }
        return PlayerContainerKt.getPlayDirector(iPlayerContainer).itemCount();
    }

    public int h() {
        f fVar = this.f79617b;
        int i7 = fVar.f79622b;
        if (i7 == -1) {
            if (fVar.f79623c) {
                WeakReference<IPlayerContainer> weakReference = this.f79616a;
                i7 = 0;
                if (weakReference != null) {
                    IPlayerContainer iPlayerContainer = weakReference.get();
                    i7 = 0;
                    if (iPlayerContainer != null) {
                        IPlayerSettingService playerSettingService = iPlayerContainer.getPlayerSettingService();
                        i7 = 0;
                        if (playerSettingService != null) {
                            i7 = playerSettingService.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
                        }
                    }
                }
            } else {
                i7 = -1;
            }
        }
        return i7;
    }

    public int i() {
        IPlayerContainer iPlayerContainer;
        WeakReference<IPlayerContainer> weakReference = this.f79616a;
        if (weakReference == null || (iPlayerContainer = weakReference.get()) == null) {
            return 0;
        }
        return PlayerContainerKt.getPlayDirector(iPlayerContainer).getPlayingItemIndex();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String j() {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.background.a.j():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.bili.ui.player.data.VideoData k() {
        /*
            r4 = this;
            tv.danmaku.bili.ui.player.data.VideoData r0 = new tv.danmaku.bili.ui.player.data.VideoData
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r4
            java.lang.ref.WeakReference<tv.danmaku.biliplayerv2.IPlayerContainer> r0 = r0.f79616a
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Lb4
            r0 = r7
            java.lang.Object r0 = r0.get()
            tv.danmaku.biliplayerv2.IPlayerContainer r0 = (tv.danmaku.biliplayerv2.IPlayerContainer) r0
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L21
            goto Lb4
        L21:
            r0 = r7
            tv.danmaku.biliplayerv2.service.IPlayDirector r0 = tv.danmaku.biliplayerv2.PlayerContainerKt.getPlayDirector(r0)
            tv.danmaku.biliplayerv2.service.Video$PlayableParams r0 = r0.getCurrentPlayableParams()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L37
            r0 = r7
            tv.danmaku.biliplayerv2.service.Video$DisplayParams r0 = r0.getDisplayParams()
            r7 = r0
            goto L39
        L37:
            r0 = 0
            r7 = r0
        L39:
            java.lang.String r0 = ""
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L50
            r0 = r7
            java.lang.String r0 = r0.getTitle()
            r10 = r0
            r0 = r10
            r8 = r0
            r0 = r10
            if (r0 != 0) goto L54
        L50:
            java.lang.String r0 = ""
            r8 = r0
        L54:
            r0 = r11
            r1 = r8
            r0.title = r1
            r0 = r7
            if (r0 == 0) goto L6e
            r0 = r7
            java.lang.String r0 = r0.getCover()
            r10 = r0
            r0 = r10
            r8 = r0
            r0 = r10
            if (r0 != 0) goto L72
        L6e:
            java.lang.String r0 = ""
            r8 = r0
        L72:
            r0 = r11
            r1 = r8
            r0.cover = r1
            r0 = r9
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L93
            r0 = r7
            java.lang.String r0 = r0.getAuthor()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L93
            r0 = r9
            r8 = r0
            goto L93
        L93:
            r0 = r11
            r1 = r8
            r0.author = r1
            r0 = r7
            if (r0 == 0) goto La6
            r0 = r7
            long r0 = r0.getAvid()
            r5 = r0
            goto La8
        La6:
            r0 = 0
            r5 = r0
        La8:
            r0 = r11
            r1 = r5
            r0.avid = r1
            r0 = r11
            r1 = 0
            r0.page = r1
        Lb4:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.background.a.k():tv.danmaku.bili.ui.player.data.VideoData");
    }

    public void m() {
        IPlayerContainer iPlayerContainer;
        IPlayerServiceManager playerServiceManager;
        IPlayerContainer iPlayerContainer2;
        IPlayerServiceManager playerServiceManager2;
        PlayerServiceManager.Client client = new PlayerServiceManager.Client();
        WeakReference<IPlayerContainer> weakReference = this.f79616a;
        if (weakReference != null && (iPlayerContainer2 = weakReference.get()) != null && (playerServiceManager2 = iPlayerContainer2.getPlayerServiceManager()) != null) {
            playerServiceManager2.bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(BackgroundPlayService.class), client);
        }
        BackgroundPlayService backgroundPlayService = (BackgroundPlayService) client.getService();
        if (backgroundPlayService != null) {
            backgroundPlayService.stopMusicService$playerbizcommon_apinkRelease();
        }
        WeakReference<IPlayerContainer> weakReference2 = this.f79616a;
        if (weakReference2 == null || (iPlayerContainer = weakReference2.get()) == null || (playerServiceManager = iPlayerContainer.getPlayerServiceManager()) == null) {
            return;
        }
        playerServiceManager.unbindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(BackgroundPlayService.class), client);
    }
}
