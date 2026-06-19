package com.bilibili.ship.theseus.keel.player;

import I3.F2;
import android.app.Application;
import android.util.Log;
import android.util.Range;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.BizType;
import com.bapis.bilibili.playershared.Fragment;
import com.bapis.bilibili.playershared.FragmentInfo;
import com.bapis.bilibili.playershared.FragmentType;
import com.bapis.bilibili.playershared.FragmentVideoInfo;
import com.bapis.bilibili.playershared.VideoCtrl;
import com.bapis.bilibili.playershared.VodInfo;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.app.gemini.base.resolver.ArchiveInfo;
import com.bilibili.app.gemini.base.resolver.GeminiCommonResolver;
import com.bilibili.app.gemini.base.resolver.PlayerResolveExtraInfosUtilKt;
import com.bilibili.app.gemini.base.resolver.qn.AutoQualityControl;
import com.bilibili.app.gemini.base.resolver.qn.AutoQualityRange;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.playercore.B;
import com.bilibili.player.tangram.playercore.C;
import com.bilibili.player.tangram.playercore.C5773a;
import com.bilibili.player.tangram.playercore.C5777e;
import com.bilibili.player.tangram.playercore.E;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.player.tangram.playercore.PCSFacadeImpl;
import com.bilibili.player.tangram.playercore.PCSPlayableImpl;
import com.bilibili.player.tangram.playercore.u;
import com.bilibili.ship.theseus.keel.player.c;
import di0.InterfaceC6815b;
import j4.t;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerParamsV2;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.v;
import tv.danmaku.biliplayerv2.utils.MediaItemBuilderExtKt;
import tv.danmaku.videoplayer.coreV2.MediaItem;
import tv.danmaku.videoplayer.coreV2.transformer.MediaItemParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/p.class */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f91137a = LazyKt.lazy(new F2(9));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/p$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f91138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f91139b;

        static {
            int[] iArr = new int[BizType.values().length];
            try {
                iArr[BizType.BIZ_TYPE_PUGV.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BizType.BIZ_TYPE_PGC.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f91138a = iArr;
            int[] iArr2 = new int[FragmentType.values().length];
            try {
                iArr2[FragmentType.AD_FRAGMENT.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr2[FragmentType.OGV_FRAGMENT.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            f91139b = iArr2;
        }
    }

    public static final n a(FragmentVideoInfo fragmentVideoInfo, IPlayerCoreService iPlayerCoreService, h hVar, boolean z6, PlayerParamsV2 playerParamsV2, GeminiCommonPlayableParams geminiCommonPlayableParams, Function0<? extends Map<String, String>> function0, ExtraInfo extraInfo, int i7) {
        c aVar;
        GeminiCommonResolver.a aVar2 = GeminiCommonResolver.Companion;
        VodInfo vodInfo = fragmentVideoInfo.getVodInfo();
        PlayIndex.DrmType drmType = PlayIndex.DrmType.No;
        aVar2.getClass();
        MediaResource mediaResourceD = GeminiCommonResolver.a.d(vodInfo, drmType, "vod_common", false, i7);
        mediaResourceD.setExtraInfo(extraInfo);
        mediaResourceD.setPlayConfig(GeminiCommonResolver.a.a(fragmentVideoInfo.getPlayArcConf()));
        BizType videoType = fragmentVideoInfo.getVideoType();
        int i8 = videoType == null ? -1 : a.f91138a[videoType.ordinal()];
        d dVar = i8 != 1 ? i8 != 2 ? new d(0, 0, 0, 63) : new d(4, 2, 1, 56) : new d(10, 3, 0, 60);
        Duration.Companion companion = Duration.Companion;
        u uVarD = d(iPlayerCoreService, hVar, z6, playerParamsV2, geminiCommonPlayableParams, function0, mediaResourceD, new sb0.c(Duration.box-impl(DurationKt.toDuration(fragmentVideoInfo.getTimelength(), DurationUnit.MILLISECONDS)), 0L, (Range) null, 6), false, null, null, 1792);
        long aid = fragmentVideoInfo.getFragmentInfo().getAid();
        long cid = fragmentVideoInfo.getFragmentInfo().getCid();
        FragmentInfo fragmentInfo = fragmentVideoInfo.getFragmentInfo();
        FragmentType fragmentType = fragmentInfo.getFragmentType();
        int i9 = fragmentType == null ? -1 : a.f91139b[fragmentType.ordinal()];
        if (i9 == 1) {
            aVar = new c.a(fragmentInfo.getIndex(), fragmentInfo.getReport());
        } else if (i9 != 2) {
            Log.e("TheseusPlayableKt-toPieceMeta", "[gemini-TheseusPlayableKt-toPieceMeta] A malformed piece is detected!", null);
            aVar = c.b.f91087a;
        } else {
            aVar = c.d.f91091a;
        }
        return new n(uVarD, aid, cid, dVar, aVar);
    }

    public static InterfaceC5778f b(PCSFacadeImpl pCSFacadeImpl, f fVar, long j7, long j8) {
        InterfaceC5778f oVar = pCSFacadeImpl;
        if (fVar != null) {
            oVar = new o(pCSFacadeImpl, fVar, j7, j8, null);
        }
        return oVar;
    }

    public static k c(IPlayerCoreService iPlayerCoreService, PlayerParamsV2 playerParamsV2, h hVar, GeminiCommonPlayableParams geminiCommonPlayableParams, E e7, Function1 function1, ii1.a aVar, f fVar, com.bilibili.player.tangram.basic.d dVar, PlayViewUniteReply playViewUniteReply, Fragment fragment, b bVar, g gVar, com.bilibili.ship.theseus.keel.player.a aVar2, e eVar, boolean z6, Deferred deferred, boolean z7, Function0 function0, v vVar, Function0 function02) {
        CompletableDeferred CompletableDeferred = CompletableDeferredKt.CompletableDeferred(Unit.INSTANCE);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(geminiCommonPlayableParams);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        t.a("usesTrialQuality: ", "StoryVipQualityTrialService", z7);
        booleanRef.element = z7;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = fragment;
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        PCSPlayableImpl pCSPlayableImpl = new PCSPlayableImpl(dVar, hVar, new TheseusPlayableKt$TheseusPlayable$resolver$1(MutableStateFlow, booleanRef2, function02, hVar, aVar, objectRef, booleanRef, mutableSharedFlowMutableSharedFlow$default, e7, function1, vVar, aVar2, gVar, iPlayerCoreService, z6, playerParamsV2, geminiCommonPlayableParams, function0, fVar, dVar, deferred, CompletableDeferred, null), iPlayerCoreService, new ResolveAndPlayPlayable(dVar), e7, C5777e.a((gVar != null ? gVar.f91106d : null) != null ? new CB.f(gVar, 3) : null, iPlayerCoreService), vVar);
        return new k(MutableStateFlow, pCSPlayableImpl, mutableSharedFlowMutableSharedFlow$default, aVar, new CB.g(objectRef, 4), new m(booleanRef), new TheseusPlayableKt$TheseusPlayable$5(gVar, eVar, iPlayerCoreService, pCSPlayableImpl, MutableStateFlow, bVar, e7, aVar2, playViewUniteReply, booleanRef2, hVar, z6, playerParamsV2, geminiCommonPlayableParams, function0, dVar, deferred, CompletableDeferred, vVar, fVar, aVar, objectRef, booleanRef, function1, mutableSharedFlowMutableSharedFlow$default, function02, null));
    }

    public static u d(final IPlayerCoreService iPlayerCoreService, h hVar, boolean z6, final PlayerParamsV2 playerParamsV2, final GeminiCommonPlayableParams geminiCommonPlayableParams, final Function0 function0, final MediaResource mediaResource, sb0.c cVar, boolean z7, MediaItem mediaItem, Function2 function2, int i7) {
        if ((i7 & 256) != 0) {
            z7 = false;
        }
        if ((i7 & 512) != 0) {
            mediaItem = null;
        }
        if ((i7 & 1024) != 0) {
            function2 = null;
        }
        if (mediaResource.getExtraInfo() == null) {
            mediaResource.setExtraInfo(new ExtraInfo());
        }
        ExtraInfo extraInfo = mediaResource.getExtraInfo();
        if (extraInfo != null) {
            extraInfo.setProgressManipulation(cVar);
        }
        return new u(iPlayerCoreService, hVar, mediaResource, (Function1<? super C5773a, MediaItemParams.Builder>) new Function1(iPlayerCoreService, playerParamsV2, geminiCommonPlayableParams, mediaResource, function0) { // from class: com.bilibili.ship.theseus.keel.player.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IPlayerCoreService f91120a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PlayerParamsV2 f91121b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final GeminiCommonPlayableParams f91122c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final MediaResource f91123d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final Function0 f91124e;

            {
                this.f91120a = iPlayerCoreService;
                this.f91121b = playerParamsV2;
                this.f91122c = geminiCommonPlayableParams;
                this.f91123d = mediaResource;
                this.f91124e = function0;
            }

            public final Object invoke(Object obj) {
                ArchiveInfo archiveInfo;
                MediaItemParams.Builder mediaItemParamsBuilder = MediaItemBuilderExtKt.getMediaItemParamsBuilder(this.f91120a, this.f91121b, ((C5773a) obj).f79440a);
                MediaItemParams.Builder builderApplyPlayableParams = MediaItemBuilderExtKt.applyPlayableParams(mediaItemParamsBuilder, this.f91122c);
                ExtraInfo extraInfo2 = this.f91123d.getExtraInfo();
                if (extraInfo2 != null && (archiveInfo = PlayerResolveExtraInfosUtilKt.getArchiveInfo(extraInfo2)) != null && archiveInfo.a) {
                    builderApplyPlayableParams.setForceRenderLastFrame(true);
                }
                for (Map.Entry entry : ((Map) this.f91124e.invoke()).entrySet()) {
                    mediaItemParamsBuilder.putReportParam((String) entry.getKey(), (String) entry.getValue());
                }
                return mediaItemParamsBuilder;
            }
        }, !mediaResource.isPlayable(), z7, (MediaItem<?>) mediaItem, z6, (Function2<? super C, ? super Continuation<? super MediaResource>, ? extends Object>) function2);
    }

    public static final PCSFacadeImpl e(B b7, IPlayerCoreService iPlayerCoreService, h hVar, E e7, com.bilibili.player.tangram.basic.d dVar, Deferred deferred, Deferred deferred2, v vVar, u uVar) {
        return new PCSFacadeImpl(iPlayerCoreService, b7.f79336d, hVar, e7, uVar, dVar, b7.f79340i, deferred, deferred2, vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(com.bilibili.player.tangram.playercore.B r9, ii1.a r10, kotlin.jvm.internal.Ref.ObjectRef r11, kotlin.jvm.internal.Ref.BooleanRef r12, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams r13, com.bilibili.player.tangram.playercore.u r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.p.f(com.bilibili.player.tangram.playercore.B, ii1.a, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$BooleanRef, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams, com.bilibili.player.tangram.playercore.u, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final MediaResource g(MutableStateFlow<GeminiCommonPlayableParams> mutableStateFlow) {
        Object objC;
        GeminiCommonResolverParams resolveParams = ((GeminiCommonPlayableParams) mutableStateFlow.getValue()).getResolveParams();
        resolveParams.setMFrom("downloaded");
        GeminiCommonResolver.Companion.getClass();
        MediaResource mediaResource = null;
        InterfaceC6815b interfaceC6815b = (InterfaceC6815b) com.bilibili.ad.adview.story.c.a(BLRouter.INSTANCE, InterfaceC6815b.class, (String) null, 1, (Object) null);
        if (interfaceC6815b != null) {
            Application application = BiliContext.application();
            long avid = resolveParams.getAvid();
            long cid = resolveParams.getCid();
            int page = resolveParams.getPage();
            String from = resolveParams.getFrom();
            String str = (String) resolveParams.getExtraContent().get("ep_id");
            objC = InterfaceC6815b.c(interfaceC6815b, application, Long.valueOf(avid), Long.valueOf(cid), Integer.valueOf(page), str != null ? StringsKt.toLongOrNull(str) : null, (String) resolveParams.getExtraContent().get("season_id"), from, 128);
        } else {
            objC = null;
        }
        if (objC instanceof MediaResource) {
            mediaResource = (MediaResource) objC;
        }
        return mediaResource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(kotlin.jvm.internal.Ref.ObjectRef r5, kotlinx.coroutines.flow.MutableSharedFlow r6, com.bilibili.player.tangram.playercore.E r7, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.p.h(kotlin.jvm.internal.Ref$ObjectRef, kotlinx.coroutines.flow.MutableSharedFlow, com.bilibili.player.tangram.playercore.E, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(com.bilibili.player.tangram.playercore.B r19, com.bilibili.ship.theseus.keel.player.f r20, tv.danmaku.biliplayerv2.service.IPlayerCoreService r21, com.bilibili.ship.theseus.keel.player.h r22, com.bilibili.player.tangram.playercore.E r23, com.bilibili.player.tangram.basic.d r24, kotlinx.coroutines.Deferred r25, kotlinx.coroutines.Deferred r26, kotlin.jvm.functions.Function1 r27, tv.danmaku.biliplayerv2.service.v r28, ii1.a r29, kotlinx.coroutines.flow.MutableStateFlow r30, com.bilibili.ship.theseus.keel.player.a r31, com.bilibili.ship.theseus.keel.player.g r32, kotlin.jvm.internal.Ref.ObjectRef r33, kotlin.jvm.internal.Ref.BooleanRef r34, boolean r35, tv.danmaku.biliplayerv2.PlayerParamsV2 r36, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r37, kotlin.jvm.functions.Function0 r38, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r39, com.bilibili.player.tangram.playercore.u r40, com.bilibili.player.tangram.playercore.u r41, kotlin.coroutines.jvm.internal.ContinuationImpl r42) {
        /*
            Method dump skipped, instruction units count: 1199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.p.i(com.bilibili.player.tangram.playercore.B, com.bilibili.ship.theseus.keel.player.f, tv.danmaku.biliplayerv2.service.IPlayerCoreService, com.bilibili.ship.theseus.keel.player.h, com.bilibili.player.tangram.playercore.E, com.bilibili.player.tangram.basic.d, kotlinx.coroutines.Deferred, kotlinx.coroutines.Deferred, kotlin.jvm.functions.Function1, tv.danmaku.biliplayerv2.service.v, ii1.a, kotlinx.coroutines.flow.MutableStateFlow, com.bilibili.ship.theseus.keel.player.a, com.bilibili.ship.theseus.keel.player.g, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$BooleanRef, boolean, tv.danmaku.biliplayerv2.PlayerParamsV2, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams, kotlin.jvm.functions.Function0, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply, com.bilibili.player.tangram.playercore.u, com.bilibili.player.tangram.playercore.u, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(com.bilibili.player.tangram.playercore.B r25, kotlin.jvm.functions.Function1 r26, tv.danmaku.biliplayerv2.service.v r27, ii1.a r28, kotlinx.coroutines.flow.MutableStateFlow r29, com.bilibili.ship.theseus.keel.player.a r30, com.bilibili.ship.theseus.keel.player.g r31, com.bilibili.ship.theseus.keel.player.h r32, kotlin.jvm.internal.Ref.ObjectRef r33, kotlin.jvm.internal.Ref.BooleanRef r34, tv.danmaku.biliplayerv2.service.IPlayerCoreService r35, boolean r36, tv.danmaku.biliplayerv2.PlayerParamsV2 r37, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r38, kotlin.jvm.functions.Function0 r39, com.bilibili.ship.theseus.keel.player.f r40, com.bilibili.player.tangram.playercore.E r41, com.bilibili.player.tangram.basic.d r42, kotlinx.coroutines.Deferred r43, kotlinx.coroutines.Deferred r44, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r45, com.bilibili.player.tangram.playercore.u r46, kotlin.coroutines.jvm.internal.ContinuationImpl r47) {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.p.j(com.bilibili.player.tangram.playercore.B, kotlin.jvm.functions.Function1, tv.danmaku.biliplayerv2.service.v, ii1.a, kotlinx.coroutines.flow.MutableStateFlow, com.bilibili.ship.theseus.keel.player.a, com.bilibili.ship.theseus.keel.player.g, com.bilibili.ship.theseus.keel.player.h, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$BooleanRef, tv.danmaku.biliplayerv2.service.IPlayerCoreService, boolean, tv.danmaku.biliplayerv2.PlayerParamsV2, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams, kotlin.jvm.functions.Function0, com.bilibili.ship.theseus.keel.player.f, com.bilibili.player.tangram.playercore.E, com.bilibili.player.tangram.basic.d, kotlinx.coroutines.Deferred, kotlinx.coroutines.Deferred, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply, com.bilibili.player.tangram.playercore.u, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.bilibili.player.tangram.playercore.u k(com.bilibili.player.tangram.playercore.B r21, kotlin.jvm.functions.Function1 r22, tv.danmaku.biliplayerv2.service.v r23, ii1.a r24, kotlinx.coroutines.flow.MutableStateFlow r25, com.bilibili.ship.theseus.keel.player.a r26, com.bilibili.ship.theseus.keel.player.g r27, com.bilibili.ship.theseus.keel.player.h r28, kotlin.jvm.internal.Ref.ObjectRef r29, kotlin.jvm.internal.Ref.BooleanRef r30, tv.danmaku.biliplayerv2.service.IPlayerCoreService r31, boolean r32, tv.danmaku.biliplayerv2.PlayerParamsV2 r33, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r34, kotlin.jvm.functions.Function0 r35, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r36, boolean r37, com.bilibili.player.tangram.playercore.u r38) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.p.k(com.bilibili.player.tangram.playercore.B, kotlin.jvm.functions.Function1, tv.danmaku.biliplayerv2.service.v, ii1.a, kotlinx.coroutines.flow.MutableStateFlow, com.bilibili.ship.theseus.keel.player.a, com.bilibili.ship.theseus.keel.player.g, com.bilibili.ship.theseus.keel.player.h, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$BooleanRef, tv.danmaku.biliplayerv2.service.IPlayerCoreService, boolean, tv.danmaku.biliplayerv2.PlayerParamsV2, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams, kotlin.jvm.functions.Function0, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply, boolean, com.bilibili.player.tangram.playercore.u):com.bilibili.player.tangram.playercore.u");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0539 A[PHI: r47
  0x0539: PHI (r47v7 java.lang.Object) = (r47v6 java.lang.Object), (r47v1 java.lang.Object) binds: [B:30:0x0531, B:16:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(com.bilibili.player.tangram.playercore.B r24, ii1.a r25, kotlin.jvm.internal.Ref.ObjectRef r26, kotlin.jvm.internal.Ref.BooleanRef r27, kotlinx.coroutines.flow.MutableSharedFlow r28, com.bilibili.player.tangram.playercore.E r29, kotlin.jvm.functions.Function1 r30, tv.danmaku.biliplayerv2.service.v r31, kotlinx.coroutines.flow.MutableStateFlow r32, com.bilibili.ship.theseus.keel.player.a r33, com.bilibili.ship.theseus.keel.player.g r34, com.bilibili.ship.theseus.keel.player.h r35, tv.danmaku.biliplayerv2.service.IPlayerCoreService r36, boolean r37, tv.danmaku.biliplayerv2.PlayerParamsV2 r38, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r39, kotlin.jvm.functions.Function0 r40, com.bilibili.ship.theseus.keel.player.f r41, com.bilibili.player.tangram.basic.d r42, kotlinx.coroutines.Deferred r43, kotlinx.coroutines.Deferred r44, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams r45, com.bilibili.player.tangram.playercore.u r46, kotlin.coroutines.jvm.internal.ContinuationImpl r47) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.p.l(com.bilibili.player.tangram.playercore.B, ii1.a, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$BooleanRef, kotlinx.coroutines.flow.MutableSharedFlow, com.bilibili.player.tangram.playercore.E, kotlin.jvm.functions.Function1, tv.danmaku.biliplayerv2.service.v, kotlinx.coroutines.flow.MutableStateFlow, com.bilibili.ship.theseus.keel.player.a, com.bilibili.ship.theseus.keel.player.g, com.bilibili.ship.theseus.keel.player.h, tv.danmaku.biliplayerv2.service.IPlayerCoreService, boolean, tv.danmaku.biliplayerv2.PlayerParamsV2, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams, kotlin.jvm.functions.Function0, com.bilibili.ship.theseus.keel.player.f, com.bilibili.player.tangram.basic.d, kotlinx.coroutines.Deferred, kotlinx.coroutines.Deferred, com.bilibili.app.gemini.base.player.GeminiCommonResolverParams, com.bilibili.player.tangram.playercore.u, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(com.bilibili.player.tangram.playercore.B r9, kotlinx.coroutines.flow.MutableStateFlow r10, com.bilibili.ship.theseus.keel.player.h r11, ii1.a r12, kotlin.jvm.internal.Ref.ObjectRef r13, kotlin.jvm.internal.Ref.BooleanRef r14, kotlin.jvm.functions.Function1 r15, com.bilibili.player.tangram.playercore.C r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.p.m(com.bilibili.player.tangram.playercore.B, kotlinx.coroutines.flow.MutableStateFlow, com.bilibili.ship.theseus.keel.player.h, ii1.a, kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.internal.Ref$BooleanRef, kotlin.jvm.functions.Function1, com.bilibili.player.tangram.playercore.C, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public static final AutoQualityControl n(@NotNull VideoCtrl videoCtrl) {
        AutoQualityControl autoQualityControl = null;
        if (!videoCtrl.hasAutoQnCtl()) {
            return null;
        }
        if (videoCtrl.getQnExp().hasQnExp3() && videoCtrl.getQnExp().getQnExp3().getQnExp3()) {
            AutoQualityRange autoQualityRange = PlayerResolveExtraInfosUtilKt.autoQualityRange(videoCtrl.getAutoQnCtl(), new AutoQualityRange.a.b(videoCtrl.getQnExp().getQnExp3().getLowScreenThreshold(), videoCtrl.getQnExp().getQnExp3().getSid()));
            if (autoQualityRange != null) {
                autoQualityControl = new AutoQualityControl(autoQualityRange, videoCtrl.getQnFeature());
            }
            return autoQualityControl;
        }
        AutoQualityControl autoQualityControl2 = null;
        if (videoCtrl.getQnExp().getQnExp2()) {
            AutoQualityRange autoQualityRange2 = PlayerResolveExtraInfosUtilKt.autoQualityRange(videoCtrl.getAutoQnCtl(), AutoQualityRange.a.a.a);
            autoQualityControl2 = null;
            if (autoQualityRange2 != null) {
                autoQualityControl2 = new AutoQualityControl(autoQualityRange2, videoCtrl.getQnFeature());
            }
        }
        return autoQualityControl2;
    }

    public static final boolean o() {
        return ((Boolean) f91137a.getValue()).booleanValue();
    }
}
