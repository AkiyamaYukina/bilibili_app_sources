package com.bilibili.playerbizcommon.features.headset;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.media.util.PlayerCloudSetting;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import j4.t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.player.notification.MediaButtonReceiver;
import tv.danmaku.bili.ui.player.utils.HeadsetEventHandler;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainerKt;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;
import tv.danmaku.biliplayerv2.service.BufferingObserver;
import tv.danmaku.biliplayerv2.service.IRenderStartObserver;
import tv.danmaku.biliplayerv2.service.PlayerSeekObserver;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.setting.PlayerSettingChangeObserver;
import uq0.C8757e;
import uq0.InterfaceC8754b;
import uq0.InterfaceC8755c;
import uq0.InterfaceC8756d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService.class */
public final class PlayerHeadsetService implements InterfaceC8755c {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    public static final String TAG = "PlayerHeadsetService";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f79811v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlayerContainer f79814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public tv.danmaku.bili.ui.player.notification.d f79815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public HeadsetEventHandler f79818g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public InterfaceC8756d f79819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Lq0.b f79820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f79821k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f79812a = true;

    @NotNull
    public final CopyOnWriteArrayList<InterfaceC8754b> h = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f79822l = new h(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final d f79823m = new d(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final c f79824n = new c(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final f f79825o = new f(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final j f79826p = new j(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final e f79827q = new e(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final g f79828r = new g(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final i f79829s = new i(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final k f79830t = new k(this);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final l f79831u = new l(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$b.class */
    public final class b extends MediaSessionCompat.Callback {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final PlayerHeadsetService f79832f;

        public b(PlayerHeadsetService playerHeadsetService) {
            this.f79832f = playerHeadsetService;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onCustomAction(@Nullable String str, @Nullable Bundle bundle) {
            defpackage.a.b("headset call custom action: ", str, PlayerHeadsetService.TAG);
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.c(str, bundle);
            if (Intrinsics.areEqual(str, "com.bilibili.player.music.notification.delete")) {
                playerHeadsetService.b();
            }
            Iterator it = playerHeadsetService.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8754b) it.next()).c(str);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onFastForward() {
            BLog.i(PlayerHeadsetService.TAG, "headset call fast forward");
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.e();
            Iterator it = playerHeadsetService.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8754b) it.next()).b();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onMediaButtonEvent(@org.jetbrains.annotations.Nullable android.content.Intent r5) {
            /*
                r4 = this;
                r0 = 0
                r7 = r0
                r0 = r4
                com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService r0 = r0.f79832f     // Catch: java.lang.Exception -> L1a
                tv.danmaku.bili.ui.player.utils.HeadsetEventHandler r0 = com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService.access$getMHeadsetEventHandler$p(r0)     // Catch: java.lang.Exception -> L1a
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L1f
                r0 = r9
                r1 = r5
                boolean r0 = r0.interceptHeadsetHookEvent(r1)     // Catch: java.lang.Exception -> L1a
                r6 = r0
                goto L21
            L1a:
                r11 = move-exception
                goto L37
            L1f:
                r0 = 0
                r6 = r0
            L21:
                r0 = r6
                if (r0 != 0) goto L33
                r0 = r4
                r1 = r5
                boolean r0 = super.onMediaButtonEvent(r1)     // Catch: java.lang.Exception -> L1a
                r8 = r0
                r0 = r7
                r6 = r0
                r0 = r8
                if (r0 == 0) goto L35
            L33:
                r0 = 1
                r6 = r0
            L35:
                r0 = r6
                return r0
            L37:
                r0 = 0
                r10 = r0
                r0 = r5
                if (r0 == 0) goto L4c
                r0 = r5
                java.lang.String r1 = "android.intent.extra.KEY_EVENT"
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
                android.view.KeyEvent r0 = (android.view.KeyEvent) r0
                r9 = r0
                goto L4f
            L4c:
                r0 = 0
                r9 = r0
            L4f:
                r0 = r10
                r5 = r0
                r0 = r9
                if (r0 == 0) goto L5d
                r0 = r9
                java.lang.String r0 = r0.toString()
                r5 = r0
            L5d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                java.lang.String r2 = "onMediaButtonEvent has a exception keyEventMessage:"
                r1.<init>(r2)
                r9 = r0
                r0 = r9
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r9
                java.lang.String r1 = " exceptionMessage:"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r9
                r1 = r11
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = "PlayerHeadsetService"
                r1 = r9
                java.lang.String r1 = r1.toString()
                tv.danmaku.android.log.BLog.e(r0, r1)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.features.headset.PlayerHeadsetService.b.onMediaButtonEvent(android.content.Intent):boolean");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onPause() {
            BLog.i(PlayerHeadsetService.TAG, "PlayerControlCallback, onPause");
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.onPause();
            Iterator it = playerHeadsetService.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8754b) it.next()).pause();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onPlay() {
            BLog.i(PlayerHeadsetService.TAG, "PlayerControlCallback, onPlay");
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.onPlay();
            Iterator it = playerHeadsetService.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8754b) it.next()).resume();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onRewind() {
            BLog.i(PlayerHeadsetService.TAG, "headset call rewind");
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.d();
            Iterator it = playerHeadsetService.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8754b) it.next()).rewind();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onSeekTo(long j7) {
            BLog.i(PlayerHeadsetService.TAG, "headset call seek");
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.m(j7);
            Iterator it = playerHeadsetService.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8754b) it.next()).a();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onSkipToNext() {
            BLog.i(PlayerHeadsetService.TAG, "PlayerControlCallback, onSkipToNext");
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.i();
            Iterator it = playerHeadsetService.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8754b) it.next()).d();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onSkipToPrevious() {
            BLog.i(PlayerHeadsetService.TAG, "PlayerControlCallback, onSkipToPrevious");
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.j();
            Iterator it = playerHeadsetService.h.iterator();
            while (it.hasNext()) {
                ((InterfaceC8754b) it.next()).e();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.Callback
        public final void onStop() {
            BLog.i(PlayerHeadsetService.TAG, "PlayerControlCallback, onStop");
            boolean zBooleanValue = ((Boolean) C8757e.f127936b.getValue()).booleanValue();
            PlayerHeadsetService playerHeadsetService = this.f79832f;
            if (!zBooleanValue) {
                IPlayerContainer iPlayerContainer = playerHeadsetService.f79814c;
                IPlayerContainer iPlayerContainer2 = iPlayerContainer;
                if (iPlayerContainer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                    iPlayerContainer2 = null;
                }
                int state = iPlayerContainer2.getPlayerCoreService().getState();
                if (((Boolean) C8757e.f127935a.getValue()).booleanValue() && playerHeadsetService.f79821k && state == 4) {
                    com.bilibili.ad.adview.pegasus.banner.toplive.b.a(state, "PlayerControlCallback, onStop ignored, player still active: ", " buffering：", PlayerHeadsetService.TAG);
                } else {
                    Lq0.b bVar = playerHeadsetService.f79820j;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                        bVar = null;
                    }
                    bVar.onStop();
                }
                playerHeadsetService.b();
                return;
            }
            IPlayerContainer iPlayerContainer3 = playerHeadsetService.f79814c;
            IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
            if (iPlayerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer4 = null;
            }
            int state2 = iPlayerContainer4.getPlayerCoreService().getState();
            if (state2 != 4) {
                Lq0.b bVar2 = playerHeadsetService.f79820j;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                    bVar2 = null;
                }
                bVar2.onStop();
                playerHeadsetService.b();
                return;
            }
            BLog.i(PlayerHeadsetService.TAG, "PlayerControlCallback, onStop ignored, player still active: " + state2);
            Lq0.b bVar3 = playerHeadsetService.f79820j;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar3 = null;
            }
            bVar3.l(playerHeadsetService.f79815d);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$c.class */
    public static final class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79833a;

        public c(PlayerHeadsetService playerHeadsetService) {
            this.f79833a = playerHeadsetService;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int intExtra;
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1676458352) {
                    if (iHashCode == 1123270207 && action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED") && this.f79833a.f79815d != null) {
                        int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
                        bilibili.live.app.service.resolver.c.a(intExtra2, "bluetooth action connection state changed state=", PlayerHeadsetService.TAG);
                        if (intExtra2 == 2) {
                            Lq0.b bVar = this.f79833a.f79820j;
                            Lq0.b bVar2 = bVar;
                            if (bVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                                bVar2 = null;
                            }
                            bVar2.f(this.f79833a.f79815d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state") && PlayerHeadsetService.f79811v != (intExtra = intent.getIntExtra("state", 0))) {
                    PlayerHeadsetService.f79811v = intExtra;
                    if (intExtra == 1) {
                        AudioManager audioManager = (AudioManager) BiliContext.application().getSystemService("audio");
                        int streamVolume = audioManager.getStreamVolume(3);
                        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                        if (streamMaxVolume == 0) {
                            return;
                        }
                        com.bilibili.bplus.im.protobuf.a.b(streamVolume, streamMaxVolume, "bluetooth action headset plug, change volume current=", ", max=", PlayerHeadsetService.TAG);
                        float f7 = streamVolume;
                        float f8 = streamMaxVolume;
                        if (f7 / f8 > 0.66f) {
                            audioManager.setStreamVolume(3, (int) (f8 * 0.66f), 1);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$d.class */
    public static final class d implements BufferingObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79834a;

        public d(PlayerHeadsetService playerHeadsetService) {
            this.f79834a = playerHeadsetService;
        }

        public final void onBufferingEnd() {
            PlayerHeadsetService playerHeadsetService = this.f79834a;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.l(playerHeadsetService.f79815d);
            playerHeadsetService.f79821k = false;
        }

        public final void onBufferingStart(int i7) {
            PlayerHeadsetService playerHeadsetService = this.f79834a;
            playerHeadsetService.f79821k = true;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.g(playerHeadsetService.f79815d, 6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$e.class */
    public static final class e implements PlayerCloudSetting.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79835a;

        public e(PlayerHeadsetService playerHeadsetService) {
            this.f79835a = playerHeadsetService;
        }

        public final void onChange() {
            PlayerHeadsetService playerHeadsetService = this.f79835a;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.f(playerHeadsetService.f79815d);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$f.class */
    public static final class f implements IRenderStartObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79836a;

        public f(PlayerHeadsetService playerHeadsetService) {
            this.f79836a = playerHeadsetService;
        }

        public final void onAudioRenderStart() {
            super.onAudioRenderStart();
            PlayerHeadsetService playerHeadsetService = this.f79836a;
            IPlayerContainer iPlayerContainer = playerHeadsetService.f79814c;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getPlayerCoreService().removeRenderStartObserver(this);
            playerHeadsetService.a();
        }

        public final void onVideoRenderStart() {
            PlayerHeadsetService playerHeadsetService = this.f79836a;
            IPlayerContainer iPlayerContainer = playerHeadsetService.f79814c;
            IPlayerContainer iPlayerContainer2 = iPlayerContainer;
            if (iPlayerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                iPlayerContainer2 = null;
            }
            iPlayerContainer2.getPlayerCoreService().removeRenderStartObserver(this);
            playerHeadsetService.a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$g.class */
    public static final class g implements PlayerSettingChangeObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79837a;

        public g(PlayerHeadsetService playerHeadsetService) {
            this.f79837a = playerHeadsetService;
        }

        public final void onChange(String str) {
            PlayerHeadsetService playerHeadsetService = this.f79837a;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.l(playerHeadsetService.f79815d);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$h.class */
    public static final class h implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79838a;

        public h(PlayerHeadsetService playerHeadsetService) {
            this.f79838a = playerHeadsetService;
        }

        public final void onPlayerStateChanged(int i7) {
            Lq0.b bVar = null;
            PlayerHeadsetService playerHeadsetService = this.f79838a;
            if (i7 == 3) {
                BLog.d(PlayerHeadsetService.TAG, "player PREPARED, update metadata");
                Lq0.b bVar2 = playerHeadsetService.f79820j;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                } else {
                    bVar = bVar2;
                }
                bVar.f(playerHeadsetService.f79815d);
                return;
            }
            if (i7 == 4) {
                playerHeadsetService.a();
                Lq0.b bVar3 = playerHeadsetService.f79820j;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                    bVar3 = null;
                }
                bVar3.l(playerHeadsetService.f79815d);
                return;
            }
            if (i7 != 7) {
                Lq0.b bVar4 = playerHeadsetService.f79820j;
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                    bVar4 = null;
                }
                bVar4.g(playerHeadsetService.f79815d, 2);
                return;
            }
            if (!((Boolean) C8757e.f127935a.getValue()).booleanValue() && BiliContext.isForeground() && BiliContext.isVisible()) {
                playerHeadsetService.b();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$i.class */
    public static final class i implements PlayerSeekObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79839a;

        public i(PlayerHeadsetService playerHeadsetService) {
            this.f79839a = playerHeadsetService;
        }

        public final void onSeekComplete(long j7) {
            PlayerHeadsetService playerHeadsetService = this.f79839a;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.l(playerHeadsetService.f79815d);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$j.class */
    public static final class j implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79840a;

        public j(PlayerHeadsetService playerHeadsetService) {
            this.f79840a = playerHeadsetService;
        }

        public final void onItemStart(Video.PlayableParams playableParams) {
            PlayerHeadsetService playerHeadsetService = this.f79840a;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.f(playerHeadsetService.f79815d);
        }

        public final void onPlayableParamsChanged(Video.PlayableParams playableParams) {
            PlayerHeadsetService playerHeadsetService = this.f79840a;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.f(playerHeadsetService.f79815d);
        }

        public final void onResolveFailed(Video.PlayableParams playableParams, String str) {
            PlayerHeadsetService playerHeadsetService = this.f79840a;
            Lq0.b bVar = playerHeadsetService.f79820j;
            Lq0.b bVar2 = bVar;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
                bVar2 = null;
            }
            bVar2.g(playerHeadsetService.f79815d, 7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$k.class */
    public static final class k implements tv.danmaku.biliplayerv2.service.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHeadsetService f79841a;

        public k(PlayerHeadsetService playerHeadsetService) {
            this.f79841a = playerHeadsetService;
        }

        public final void b() {
            BLog.i(PlayerHeadsetService.TAG, "StopInternal for terminated by media center.");
            this.f79841a.b();
        }

        public final void e() {
            BLog.i(PlayerHeadsetService.TAG, "StartInternal for prepared from media center.");
            this.f79841a.a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/headset/PlayerHeadsetService$l.class */
    public static final class l extends MediaControllerCompat.Callback {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final PlayerHeadsetService f79842d;

        public l(PlayerHeadsetService playerHeadsetService) {
            this.f79842d = playerHeadsetService;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            BLog.i(PlayerHeadsetService.TAG, "onMetadataChanged: metadata " + mediaMetadataCompat);
            InterfaceC8756d interfaceC8756d = this.f79842d.f79819i;
            if (interfaceC8756d != null) {
                interfaceC8756d.a();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            BLog.i(PlayerHeadsetService.TAG, "onPlaybackStateChanged: state " + playbackStateCompat);
            InterfaceC8756d interfaceC8756d = this.f79842d.f79819i;
            if (interfaceC8756d != null) {
                interfaceC8756d.onPlaybackStateChanged(playbackStateCompat);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onSessionDestroyed() {
            BLog.i(PlayerHeadsetService.TAG, "onSessionDestroyed");
            InterfaceC8756d interfaceC8756d = this.f79842d.f79819i;
            if (interfaceC8756d != null) {
                interfaceC8756d.onSessionDestroyed();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public final void onSessionReady() {
            BLog.i(PlayerHeadsetService.TAG, "onSessionReady, update metadata and playback state");
            InterfaceC8756d interfaceC8756d = this.f79842d.f79819i;
            if (interfaceC8756d != null) {
                interfaceC8756d.onSessionReady();
            }
            this.f79842d.updateMetadata();
            this.f79842d.updatePlaybackState();
        }
    }

    public final void a() {
        PendingIntent broadcast;
        MediaControllerCompat controller;
        if (this.f79817f) {
            return;
        }
        if (!this.f79812a) {
            BLog.i(TAG, "mIsEnable is false, return");
            return;
        }
        t.a("onStartInternal ，disableMediaSession=", TAG, this.f79813b);
        this.f79817f = true;
        try {
            PlayerContainer playerContainer = this.f79814c;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            ComponentName componentName = new ComponentName(playerContainer2.getContext(), (Class<?>) MediaButtonReceiver.class);
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            PlayerContainer playerContainer3 = this.f79814c;
            PlayerContainer playerContainer4 = playerContainer3;
            if (playerContainer3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer4 = null;
            }
            Context applicationContext = playerContainer4.getContext().getApplicationContext();
            E00.e.a(intent, BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D, applicationContext);
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    broadcast = PendingIntent.getBroadcast(applicationContext, 0, intent, BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D);
                } catch (IllegalArgumentException e7) {
                    broadcast = PendingIntent.getBroadcast(applicationContext, 0, intent, BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D);
                }
            } else {
                broadcast = PendingIntent.getBroadcast(applicationContext, 0, intent, BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D);
            }
            PlayerContainer playerContainer5 = this.f79814c;
            PlayerContainer playerContainer6 = playerContainer5;
            if (playerContainer5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer6 = null;
            }
            this.f79815d = new tv.danmaku.bili.ui.player.notification.d(playerContainer6.getContext(), componentName, broadcast);
            b bVar = new b(this);
            tv.danmaku.bili.ui.player.notification.d dVar = this.f79815d;
            if (dVar != null) {
                dVar.setCallback(bVar);
            }
            tv.danmaku.bili.ui.player.notification.d dVar2 = this.f79815d;
            if (dVar2 != null) {
                dVar2.setPlaybackToLocal(3);
            }
            tv.danmaku.bili.ui.player.notification.d dVar3 = this.f79815d;
            if (dVar3 != null && (controller = dVar3.getController()) != null) {
                controller.registerCallback(this.f79831u);
            }
            this.f79818g = new HeadsetEventHandler(this.f79815d, bVar);
        } catch (RuntimeException e8) {
            M.b("can not create media session because :", e8.getMessage(), TAG);
        }
        tv.danmaku.bili.ui.player.notification.d dVar4 = this.f79815d;
        if (dVar4 != null) {
            dVar4.setActive(!this.f79813b);
        }
        PlayerContainer playerContainer7 = this.f79814c;
        if (playerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer7 = null;
        }
        Context context = playerContainer7.getContext();
        if (this.f79816e) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        try {
            c cVar = this.f79824n;
            if (Build.VERSION.SDK_INT >= 34) {
                context.registerReceiver(cVar, intentFilter, 4);
            } else {
                context.registerReceiver(cVar, intentFilter);
            }
            this.f79816e = true;
        } catch (Error e9) {
            String message = e9.getMessage();
            String str = message;
            if (message == null) {
                str = "registerReceiver error";
            }
            BLog.e(str);
        }
    }

    @Override // uq0.InterfaceC8755c
    public void addHeadsetEventObserver(@NotNull InterfaceC8754b interfaceC8754b) {
        if (this.h.contains(interfaceC8754b)) {
            return;
        }
        this.h.add(interfaceC8754b);
    }

    public final void b() {
        MediaControllerCompat controller;
        BLog.i(TAG, "onStopInternal");
        PlayerContainer playerContainer = this.f79814c;
        PlayerContainer playerContainer2 = playerContainer;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer2 = null;
        }
        Context context = playerContainer2.getContext();
        if (this.f79816e) {
            try {
                context.unregisterReceiver(this.f79824n);
            } catch (Exception e7) {
                String message = e7.getMessage();
                String str = message;
                if (message == null) {
                    str = "unregisterReceiver error";
                }
                BLog.e(str);
            }
            this.f79816e = false;
        }
        HeadsetEventHandler headsetEventHandler = this.f79818g;
        if (headsetEventHandler != null) {
            headsetEventHandler.release();
        }
        this.f79818g = null;
        this.f79817f = false;
        tv.danmaku.bili.ui.player.notification.d dVar = this.f79815d;
        if (dVar != null) {
            dVar.setActive(false);
        }
        tv.danmaku.bili.ui.player.notification.d dVar2 = this.f79815d;
        if (dVar2 != null) {
            dVar2.setCallback(null);
        }
        tv.danmaku.bili.ui.player.notification.d dVar3 = this.f79815d;
        if (dVar3 != null) {
            dVar3.release();
        }
        tv.danmaku.bili.ui.player.notification.d dVar4 = this.f79815d;
        if (dVar4 != null && (controller = dVar4.getController()) != null) {
            controller.unregisterCallback(this.f79831u);
        }
        InterfaceC8756d interfaceC8756d = this.f79819i;
        if (interfaceC8756d != null) {
            interfaceC8756d.onSessionDestroyed();
        }
        this.f79815d = null;
    }

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f79814c = playerContainer;
    }

    public void disableMediaController(boolean z6) {
        tv.danmaku.bili.ui.player.notification.d dVar;
        t.a("disableMediaSession: ", TAG, z6);
        this.f79813b = z6;
        if (z6) {
            tv.danmaku.bili.ui.player.notification.d dVar2 = this.f79815d;
            if (dVar2 != null) {
                dVar2.setActive(false);
                return;
            }
            return;
        }
        if (this.f79817f && this.f79812a && (dVar = this.f79815d) != null) {
            dVar.setActive(true);
        }
    }

    @Override // uq0.InterfaceC8755c
    @Nullable
    public MediaSessionCompat getMediaSession(boolean z6) {
        if (this.f79815d == null && z6) {
            a();
        }
        return this.f79815d;
    }

    @NotNull
    public Lq0.b getMediaSessionPlayback() {
        Lq0.b bVar = this.f79820j;
        Lq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
            bVar2 = null;
        }
        return bVar2;
    }

    public void onAttachByShared(@NotNull PlayerSharingType playerSharingType, @Nullable PlayerSharingBundle playerSharingBundle) {
        BLog.i(TAG, "onAttachByShared");
        a();
    }

    public void onCollectSharedParams(@NotNull PlayerSharingType playerSharingType, @NotNull PlayerSharingBundle playerSharingBundle) {
        BLog.i(TAG, "onCollectSharedParams");
        b();
        this.f79821k = false;
        if (EntryPointKt.getMemleakOptEnable()) {
            z50.a aVar = PlayerCloudSetting.a;
            Iterator it = PlayerCloudSetting.b.entrySet().iterator();
            while (it.hasNext()) {
                ((List) ((Map.Entry) it.next()).getValue()).remove(this.f79827q);
            }
        }
    }

    public void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        IPlayerContainer iPlayerContainer = this.f79814c;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerCoreService().addRenderStartObserver(this.f79825o);
        IPlayerContainer iPlayerContainer3 = this.f79814c;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerCoreService().registerSeekObserver(this.f79829s);
        IPlayerContainer iPlayerContainer5 = this.f79814c;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getPlayerCoreService().registerState(this.f79822l, new int[]{3, 4, 5, 6, 7});
        IPlayerContainer iPlayerContainer7 = this.f79814c;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getPlayerCoreService().registerBufferingState(this.f79823m);
        IPlayerContainer iPlayerContainer9 = this.f79814c;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        iPlayerContainer10.getPlayerCoreService().addMediaCenterObserver(this.f79830t);
        IPlayerContainer iPlayerContainer11 = this.f79814c;
        IPlayerContainer iPlayerContainer12 = iPlayerContainer11;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer12 = null;
        }
        PlayerContainerKt.getPlayDirector(iPlayerContainer12).addVideoDirectorObserver(this.f79826p);
        z50.a aVar = PlayerCloudSetting.a;
        PlayerCloudSetting.Setting setting = new PlayerCloudSetting.Setting[]{PlayerCloudSetting.Setting.BackgroundPlay}[0];
        HashMap map = PlayerCloudSetting.b;
        List list = (List) map.get(setting);
        List linkedList = list;
        if (list == null) {
            linkedList = new LinkedList();
            map.put(setting, linkedList);
        }
        linkedList.add(this.f79827q);
        IPlayerContainer iPlayerContainer13 = this.f79814c;
        IPlayerContainer iPlayerContainer14 = iPlayerContainer13;
        if (iPlayerContainer13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer14 = null;
        }
        iPlayerContainer14.getPlayerSettingService().addPlayerSettingChangeObserver(this.f79828r, new String[]{PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED});
        PlayerContainer playerContainer = this.f79814c;
        if (playerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            playerContainer = null;
        }
        this.f79820j = new Lq0.a(playerContainer);
    }

    public void onStop() {
        b();
        Lq0.b bVar = this.f79820j;
        Lq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
            bVar2 = null;
        }
        bVar2.onRelease();
        IPlayerContainer iPlayerContainer = this.f79814c;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getPlayerCoreService().removeRenderStartObserver(this.f79825o);
        IPlayerContainer iPlayerContainer3 = this.f79814c;
        IPlayerContainer iPlayerContainer4 = iPlayerContainer3;
        if (iPlayerContainer3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer4 = null;
        }
        iPlayerContainer4.getPlayerCoreService().unregisterSeekObserver(this.f79829s);
        IPlayerContainer iPlayerContainer5 = this.f79814c;
        IPlayerContainer iPlayerContainer6 = iPlayerContainer5;
        if (iPlayerContainer5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer6 = null;
        }
        iPlayerContainer6.getPlayerCoreService().unregisterState(this.f79822l);
        IPlayerContainer iPlayerContainer7 = this.f79814c;
        IPlayerContainer iPlayerContainer8 = iPlayerContainer7;
        if (iPlayerContainer7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer8 = null;
        }
        iPlayerContainer8.getPlayerCoreService().unregisterBufferingState(this.f79823m);
        IPlayerContainer iPlayerContainer9 = this.f79814c;
        IPlayerContainer iPlayerContainer10 = iPlayerContainer9;
        if (iPlayerContainer9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer10 = null;
        }
        iPlayerContainer10.getPlayerCoreService().removeMediaCenterObserver(this.f79830t);
        IPlayerContainer iPlayerContainer11 = this.f79814c;
        IPlayerContainer iPlayerContainer12 = iPlayerContainer11;
        if (iPlayerContainer11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer12 = null;
        }
        iPlayerContainer12.getPlayerSettingService().removePlayerSettingChangeObserver(this.f79828r);
        IPlayerContainer iPlayerContainer13 = this.f79814c;
        if (iPlayerContainer13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer13 = null;
        }
        PlayerContainerKt.getPlayDirector(iPlayerContainer13).removeVideoDirectorObserver(this.f79826p);
        z50.a aVar = PlayerCloudSetting.a;
        Iterator it = PlayerCloudSetting.b.entrySet().iterator();
        while (it.hasNext()) {
            ((List) ((Map.Entry) it.next()).getValue()).remove(this.f79827q);
        }
    }

    @Override // uq0.InterfaceC8755c
    public void removeHeadsetEventObserver(@NotNull InterfaceC8754b interfaceC8754b) {
        this.h.remove(interfaceC8754b);
    }

    public void setEnable(boolean z6) {
        BLog.i(TAG, "setEnable enable=" + z6 + " ");
        if (this.f79812a == z6) {
            return;
        }
        this.f79812a = z6;
        if (z6) {
            a();
        } else {
            b();
        }
    }

    public void setMediaSessionControllerCallback(@Nullable InterfaceC8756d interfaceC8756d) {
        this.f79819i = interfaceC8756d;
    }

    public void setMediaSessionPlayback(@NotNull Lq0.b bVar) {
        this.f79820j = bVar;
    }

    public final void updateMetadata() {
        Lq0.b bVar = this.f79820j;
        Lq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
            bVar2 = null;
        }
        bVar2.f(this.f79815d);
    }

    public final void updatePlaybackState() {
        Lq0.b bVar = this.f79820j;
        Lq0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaSessionPlayback");
            bVar2 = null;
        }
        bVar2.l(this.f79815d);
    }
}
