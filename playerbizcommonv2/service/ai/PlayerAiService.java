package com.bilibili.playerbizcommonv2.service.ai;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.TranslationIntro;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.playerbizcommon.features.ai.PlayerMultiLangStore;
import com.bilibili.playerbizcommonv2.widget.subtitle.K0;
import com.bilibili.playerbizcommonv2.widget.subtitle.L0;
import com.bilibili.ship.theseus.ugc.intro.ai.f;
import j4.t;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.PlayerSharingType;
import tv.danmaku.biliplayerv2.c;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.IMediaResourceObserver;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderStartObserver;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiService.class */
@StabilityInferred(parameters = 0)
public final class PlayerAiService implements com.bilibili.playerbizcommonv2.service.ai.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f81834v = DeviceDecision.INSTANCE.getBoolean("dd_united_ai_audio", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public PlayerContainer f81835a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public f f81837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Languages f81838d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Channel<Unit> f81840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Flow<Unit> f81841g;

    @Nullable
    public LanguageItem h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public LanguageItem f81842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public SuspendLambda f81843j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f81844k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TranslationIntro f81845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f81846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InjectPlayerService
    private IPlayDirector f81847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f81848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f81849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @InjectPlayerService
    public Er0.a f81850q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a f81851r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final c f81852s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final b f81853t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final PlayerAiService$renderStartObserver$1 f81854u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f81836b = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<LanguageItem> f81839e = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiService$a.class */
    public static final class a implements IMediaResourceObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerAiService f81855a;

        public a(PlayerAiService playerAiService) {
            this.f81855a = playerAiService;
        }

        public final boolean onPrepared(MediaResource mediaResource) {
            PlayerContainer playerContainer;
            Mi1.a heartbeatService;
            PlayerAiService playerAiService = this.f81855a;
            LanguageItem languageItem = playerAiService.f81842i;
            if ((languageItem == null && (languageItem != null || playerAiService.h == null)) || (playerContainer = playerAiService.f81835a) == null || (heartbeatService = playerContainer.getHeartbeatService()) == null) {
                return true;
            }
            heartbeatService.m0();
            return true;
        }

        public final void onUpdated(MediaResource mediaResource) {
            if (mediaResource == null) {
                return;
            }
            Languages language = mediaResource.getLanguage();
            PlayerAiService playerAiService = this.f81855a;
            playerAiService.f81838d = language;
            LanguageItem languageItemD = playerAiService.d(Integer.valueOf(mediaResource.getCurProductionType()), mediaResource.getCurrentLanguage());
            PlayerAiService.b(playerAiService, languageItemD, playerAiService.f81842i);
            LanguageItem languageItem = playerAiService.f81842i;
            if (languageItem == null) {
                playerAiService.e(languageItemD);
                return;
            }
            if (sb0.b.b(languageItem, languageItemD)) {
                playerAiService.e(languageItemD);
                return;
            }
            BLog.i("PlayerAIService", "is interrupt : " + playerAiService.f81842i + " ：" + languageItemD);
            playerAiService.c();
            playerAiService.e(languageItemD);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiService$b.class */
    public static final class b implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerAiService f81856a;

        public b(PlayerAiService playerAiService) {
            this.f81856a = playerAiService;
        }

        public final void onPlayerStateChanged(int i7) {
            if (i7 == 3) {
                PlayerAiService playerAiService = this.f81856a;
                playerAiService.h = null;
                LanguageItem languageItem = playerAiService.f81842i;
                if (languageItem != null) {
                    playerAiService.e(languageItem);
                    playerAiService.f81842i = null;
                    playerAiService.c();
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiService$c.class */
    public static final class c implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerAiService f81857a;

        public c(PlayerAiService playerAiService) {
            this.f81857a = playerAiService;
        }

        public final void onItemStart(Video.PlayableParams playableParams) {
            String strId = playableParams.id();
            PlayerAiService playerAiService = this.f81857a;
            if (Intrinsics.areEqual(strId, playerAiService.f81846m)) {
                return;
            }
            playerAiService.f81846m = null;
        }

        public final void onItemWillChange(Video.PlayableParams playableParams, Video.PlayableParams playableParams2) {
            boolean z6 = PlayerAiService.f81834v;
            PlayerAiService playerAiService = this.f81857a;
            playerAiService.c();
            playerAiService.f81839e.setValue((Object) null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.bilibili.playerbizcommonv2.service.ai.PlayerAiService$renderStartObserver$1] */
    public PlayerAiService() {
        Channel<Unit> channelChannel$default = ChannelKt.Channel$default(-1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        this.f81840f = channelChannel$default;
        this.f81841g = FlowKt.receiveAsFlow(channelChannel$default);
        this.f81851r = new a(this);
        this.f81852s = new c(this);
        this.f81853t = new b(this);
        this.f81854u = new IRenderStartObserver(this) { // from class: com.bilibili.playerbizcommonv2.service.ai.PlayerAiService$renderStartObserver$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerAiService f81858a;

            {
                this.f81858a = this;
            }

            public final void onVideoRenderStart() {
                PlayerContainer playerContainer;
                PlayerAiService playerAiService = this.f81858a;
                IPlayDirector iPlayDirector = playerAiService.f81847n;
                IPlayDirector iPlayDirector2 = iPlayDirector;
                if (iPlayDirector == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playDirector");
                    iPlayDirector2 = null;
                }
                Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
                String strId = currentPlayableParams != null ? currentPlayableParams.id() : null;
                if (strId != null && strId.length() != 0 && !Intrinsics.areEqual(strId, playerAiService.f81846m) && playerAiService.n0() != null && (playerContainer = playerAiService.f81835a) != null) {
                    BuildersKt.launch$default(c.a(playerContainer), (CoroutineContext) null, (CoroutineStart) null, new PlayerAiService$renderStartObserver$1$onVideoRenderStart$1(playerAiService, null), 3, (Object) null);
                }
                playerAiService.f81846m = strId;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.bilibili.playerbizcommonv2.service.ai.PlayerAiService r10, com.bilibili.lib.media.resource.LanguageItem r11, com.bilibili.lib.media.resource.LanguageItem r12) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.service.ai.PlayerAiService.b(com.bilibili.playerbizcommonv2.service.ai.PlayerAiService, com.bilibili.lib.media.resource.LanguageItem, com.bilibili.lib.media.resource.LanguageItem):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.service.ai.PlayerAiService.H(android.content.Context, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    public final void I(@Nullable f fVar) {
        this.f81837c = fVar;
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    public final void N() {
        PlayerMultiLangStore.f79562a.c(null);
        o0(null);
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    @NotNull
    public final Flow<Unit> S() {
        return this.f81841g;
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    @NotNull
    public final MutableStateFlow U() {
        return this.f81836b;
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    @Nullable
    public final L0 Y() {
        Er0.a aVar = this.f81850q;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            aVar = null;
        }
        return (L0) aVar.get(L0.a.f83540a);
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    @NotNull
    public final MutableStateFlow b0() {
        return this.f81839e;
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
        this.f81835a = playerContainer;
    }

    public final void c() {
        Job job;
        Job job2 = this.f81844k;
        if (job2 != null && job2.isActive() && (job = this.f81844k) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f81844k = null;
        if (this.f81842i != null) {
            this.f81842i = null;
            BLog.i("PlayerAIService", "transform is finished");
        }
        this.h = null;
    }

    public final LanguageItem d(Integer num, String str) {
        Object next;
        LanguageItem languageItem = null;
        if (str != null) {
            if (str.length() == 0) {
                languageItem = null;
            } else {
                Languages languages = this.f81838d;
                languageItem = null;
                if (languages != null) {
                    List listH = languages.h();
                    languageItem = null;
                    if (listH != null) {
                        Iterator it = listH.iterator();
                        while (true) {
                            next = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            next = it.next();
                            LanguageItem languageItem2 = (LanguageItem) next;
                            if (Intrinsics.areEqual(languageItem2.c(), str)) {
                                int iH = languageItem2.h();
                                if (num != null && iH == num.intValue()) {
                                    break;
                                }
                            }
                        }
                        languageItem = (LanguageItem) next;
                    }
                }
            }
        }
        return languageItem;
    }

    public final void e(LanguageItem languageItem) {
        Languages languages = this.f81838d;
        if (languages == null || languages.n() != getSupport()) {
            Languages languages2 = this.f81838d;
            this.f81836b.setValue(Boolean.valueOf(languages2 != null ? languages2.n() : false));
            t.a("sync language support, ", "PlayerAIService", getSupport());
        }
        MutableStateFlow<LanguageItem> mutableStateFlow = this.f81839e;
        if (languageItem == null) {
            mutableStateFlow.setValue((Object) null);
            BLog.i("PlayerAIService", "sync language, null");
            return;
        }
        LanguageItem languageItemD = d(Integer.valueOf(languageItem.h()), languageItem.c());
        if (languageItemD == null) {
            BLog.i("PlayerAIService", "sync language, not found " + languageItem);
        } else {
            if (sb0.b.b(languageItemD, (LanguageItem) mutableStateFlow.getValue())) {
                return;
            }
            mutableStateFlow.setValue(languageItemD);
            BLog.i("PlayerAIService", "sync language, " + languageItemD);
        }
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    @Nullable
    public final Languages e0() {
        return this.f81838d;
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    @Nullable
    public final K0 g0() {
        Er0.a aVar = this.f81850q;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            aVar = null;
        }
        return (K0) aVar.get(K0.a.f83532a);
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    public final boolean getSupport() {
        return ((Boolean) this.f81836b.getValue()).booleanValue();
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    public final void i0(@Nullable Function2<? super LanguageItem, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f81843j = (SuspendLambda) function2;
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    @Nullable
    public final LanguageItem n0() {
        return (LanguageItem) this.f81839e.getValue();
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    public final void o0(@Nullable LanguageItem languageItem) {
        IPlayerCoreService playerCoreService;
        MediaResource mediaResource;
        IPlayerCoreService playerCoreService2;
        MediaResource mediaResource2;
        if (sb0.b.b(n0(), languageItem)) {
            LanguageItem languageItem2 = this.f81842i;
            String strC = null;
            if (languageItem2 != null) {
                strC = languageItem2.c();
            }
            defpackage.a.b("has changed or pending : ", strC, "PlayerAIService");
            return;
        }
        if (!getSupport()) {
            BLog.i("PlayerAIService", "not support");
            return;
        }
        LanguageItem languageItemD = d(languageItem != null ? Integer.valueOf(languageItem.h()) : null, languageItem != null ? languageItem.c() : null);
        if (this.f81843j == null || (languageItem != null && languageItemD == null)) {
            String strC2 = null;
            if (languageItem != null) {
                strC2 = languageItem.c();
            }
            defpackage.a.b("not support, no transform or language:", strC2, "PlayerAIService");
            return;
        }
        c();
        PlayerContainer playerContainer = this.f81835a;
        String currentLanguage = (playerContainer == null || (playerCoreService2 = playerContainer.getPlayerCoreService()) == null || (mediaResource2 = playerCoreService2.getMediaResource()) == null) ? null : mediaResource2.getCurrentLanguage();
        PlayerContainer playerContainer2 = this.f81835a;
        this.h = d(Integer.valueOf((playerContainer2 == null || (playerCoreService = playerContainer2.getPlayerCoreService()) == null || (mediaResource = playerCoreService.getMediaResource()) == null) ? 0 : mediaResource.getCurProductionType()), currentLanguage);
        this.f81842i = languageItem;
        if (languageItem != null) {
            PlayerMultiLangStore.f79562a.c(languageItem.c());
        }
        PlayerContainer playerContainer3 = this.f81835a;
        Job jobLaunch$default = null;
        if (playerContainer3 != null) {
            jobLaunch$default = BuildersKt.launch$default(tv.danmaku.biliplayerv2.c.a(playerContainer3), (CoroutineContext) null, (CoroutineStart) null, new PlayerAiService$switchLanguage$1(this, languageItem, null), 3, (Object) null);
        }
        this.f81844k = jobLaunch$default;
    }

    public final void onAttachByShared(@NotNull PlayerSharingType playerSharingType, @Nullable PlayerSharingBundle playerSharingBundle) {
        super.onAttachByShared(playerSharingType, playerSharingBundle);
        String string = null;
        if (playerSharingBundle != null) {
            Bundle bundle = playerSharingBundle.getBundle();
            string = null;
            if (bundle != null) {
                string = bundle.getString("key_ai_language_started", null);
            }
        }
        this.f81846m = string;
    }

    public final void onCollectSharedParams(@NotNull PlayerSharingType playerSharingType, @NotNull PlayerSharingBundle playerSharingBundle) {
        super.onCollectSharedParams(playerSharingType, playerSharingBundle);
        c();
        String str = this.f81846m;
        if (str != null) {
            playerSharingBundle.getBundle().putString("key_ai_language_started", str);
        }
    }

    public final void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        Bundle bundle;
        IPlayerCoreService iPlayerCoreService = null;
        this.f81846m = (playerSharingBundle == null || (bundle = playerSharingBundle.getBundle()) == null) ? null : bundle.getString("key_ai_language_started", null);
        IPlayerCoreService iPlayerCoreService2 = this.f81848o;
        IPlayerCoreService iPlayerCoreService3 = iPlayerCoreService2;
        if (iPlayerCoreService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService3 = null;
        }
        iPlayerCoreService3.registerState(this.f81853t, new int[]{3});
        IPlayerCoreService iPlayerCoreService4 = this.f81848o;
        IPlayerCoreService iPlayerCoreService5 = iPlayerCoreService4;
        if (iPlayerCoreService4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService5 = null;
        }
        iPlayerCoreService5.addMediaResourceObserver(this.f81851r);
        IPlayerCoreService iPlayerCoreService6 = this.f81848o;
        IPlayerCoreService iPlayerCoreService7 = iPlayerCoreService6;
        if (iPlayerCoreService6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService7 = null;
        }
        iPlayerCoreService7.addRenderStartObserver(this.f81854u);
        IPlayDirector iPlayDirector = this.f81847n;
        IPlayDirector iPlayDirector2 = iPlayDirector;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playDirector");
            iPlayDirector2 = null;
        }
        iPlayDirector2.addVideoDirectorObserver(this.f81852s);
        IPlayerCoreService iPlayerCoreService8 = this.f81848o;
        IPlayerCoreService iPlayerCoreService9 = iPlayerCoreService8;
        if (iPlayerCoreService8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService9 = null;
        }
        MediaResource mediaResource = iPlayerCoreService9.getMediaResource();
        String currentLanguage = mediaResource != null ? mediaResource.getCurrentLanguage() : null;
        if (currentLanguage == null || currentLanguage.length() == 0) {
            return;
        }
        IPlayerCoreService iPlayerCoreService10 = this.f81848o;
        IPlayerCoreService iPlayerCoreService11 = iPlayerCoreService10;
        if (iPlayerCoreService10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService11 = null;
        }
        MediaResource mediaResource2 = iPlayerCoreService11.getMediaResource();
        this.f81838d = mediaResource2 != null ? mediaResource2.getLanguage() : null;
        IPlayerCoreService iPlayerCoreService12 = this.f81848o;
        IPlayerCoreService iPlayerCoreService13 = iPlayerCoreService12;
        if (iPlayerCoreService12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService13 = null;
        }
        MediaResource mediaResource3 = iPlayerCoreService13.getMediaResource();
        String currentLanguage2 = mediaResource3 != null ? mediaResource3.getCurrentLanguage() : null;
        IPlayerCoreService iPlayerCoreService14 = this.f81848o;
        if (iPlayerCoreService14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
        } else {
            iPlayerCoreService = iPlayerCoreService14;
        }
        MediaResource mediaResource4 = iPlayerCoreService.getMediaResource();
        e(d(Integer.valueOf(mediaResource4 != null ? mediaResource4.getCurProductionType() : 0), currentLanguage2));
    }

    public final void onStop() {
        this.f81838d = null;
        IPlayerCoreService iPlayerCoreService = this.f81848o;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.unregisterState(this.f81853t);
        IPlayerCoreService iPlayerCoreService3 = this.f81848o;
        IPlayerCoreService iPlayerCoreService4 = iPlayerCoreService3;
        if (iPlayerCoreService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService4 = null;
        }
        iPlayerCoreService4.removeMediaResourceObserver(this.f81851r);
        IPlayerCoreService iPlayerCoreService5 = this.f81848o;
        IPlayerCoreService iPlayerCoreService6 = iPlayerCoreService5;
        if (iPlayerCoreService5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService6 = null;
        }
        iPlayerCoreService6.removeRenderStartObserver(this.f81854u);
        IPlayDirector iPlayDirector = this.f81847n;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playDirector");
            iPlayDirector = null;
        }
        iPlayDirector.removeVideoDirectorObserver(this.f81852s);
    }

    @Override // com.bilibili.playerbizcommonv2.service.ai.a
    public final void showFeedback() {
        f fVar = this.f81837c;
        if (fVar != null) {
            fVar.invoke();
        }
    }
}
