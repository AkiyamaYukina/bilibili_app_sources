package com.bilibili.ship.theseus.ugc.chronos;

import G0.g;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.player.tangram.playercore.u;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.C6369f;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.D;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.d;
import com.bilibili.ship.theseus.united.page.view.q;
import com.bilibili.ship.theseus.united.page.view.t;
import ev0.InterfaceC7008a;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.FetchBusinessData;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetOnlineInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.InvokeCommandDetailPanel;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.OpenUrlScheme;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.ReportSubtitle;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateCurrentWork;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateFullscreenState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdatePreference;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateShipChain;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.model.DanmakuFeedbackInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/UGCChronosBusinessService.class */
@StabilityInferred(parameters = 0)
public final class UGCChronosBusinessService implements RpcInvokeObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ChronosBusinessService f96439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f96441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f96442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f96443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f96444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final d f96445g;

    @NotNull
    public final RelationRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f96446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C7893a f96447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final E f96448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f96449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f96450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Av0.a f96451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final t f96452o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final j f96453p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f96454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final C6369f f96455r;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/UGCChronosBusinessService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCChronosBusinessService uGCChronosBusinessService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCChronosBusinessService;
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
                UGCChronosBusinessService uGCChronosBusinessService = this.this$0;
                uGCChronosBusinessService.getClass();
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                List list = listCreateListBuilder;
                list.add(new a(uGCChronosBusinessService));
                list.add(new b(uGCChronosBusinessService));
                list.add(new c(uGCChronosBusinessService));
                List listBuild = CollectionsKt.build(listCreateListBuilder);
                this.label = 1;
                if (UGCChronosBusinessService.a(uGCChronosBusinessService, listBuild, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/UGCChronosBusinessService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCChronosBusinessService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/UGCChronosBusinessService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<Long> $currentEpisodeCid;
            Object L$0;
            int label;
            final UGCChronosBusinessService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.ObjectRef<Long> objectRef, UGCChronosBusinessService uGCChronosBusinessService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$currentEpisodeCid = objectRef;
                this.this$0 = uGCChronosBusinessService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentEpisodeCid, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ExtraInfo extraInfo = (ExtraInfo) this.L$0;
                    Ref.ObjectRef<Long> objectRef = this.$currentEpisodeCid;
                    if (objectRef.element == null && extraInfo != null) {
                        C7893a.C1318a c1318aC = this.this$0.f96447j.c();
                        objectRef.element = c1318aC != null ? Boxing.boxLong(c1318aC.f123395a.f123398b) : null;
                        j jVar = this.this$0.f96453p;
                        this.label = 1;
                        if (jVar.u(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                IRemoteHandler remoteHandler = this.this$0.f96441c.getRemoteHandler();
                if (remoteHandler != null) {
                    remoteHandler.updateCurrentWorkInfo(this.this$0.b());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UGCChronosBusinessService uGCChronosBusinessService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uGCChronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.ObjectRef objectRefB = g.b(obj);
                UGCChronosBusinessService uGCChronosBusinessService = this.this$0;
                StateFlow<ExtraInfo> stateFlow = uGCChronosBusinessService.f96446i.f99566b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRefB, uGCChronosBusinessService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public UGCChronosBusinessService(@NotNull ChronosBusinessService chronosBusinessService, @NotNull CoroutineScope coroutineScope, @NotNull IInteractLayerService iInteractLayerService, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull d dVar, @NotNull D d7, @NotNull RelationRepository relationRepository, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull C7893a c7893a, @NotNull E e7, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull List<Av0.a> list, @NotNull Av0.a aVar3, @NotNull t tVar, @NotNull j jVar, @NotNull PageAdRepository pageAdRepository) {
        this.f96439a = chronosBusinessService;
        this.f96440b = coroutineScope;
        this.f96441c = iInteractLayerService;
        this.f96442d = aVar;
        this.f96443e = c8043a;
        this.f96444f = aVar2;
        this.f96445g = dVar;
        this.h = relationRepository;
        this.f96446i = episodeExtraInfoRepository;
        this.f96447j = c7893a;
        this.f96448k = e7;
        this.f96449l = uGCPlaybackRepository;
        this.f96450m = list;
        this.f96451n = aVar3;
        this.f96452o = tVar;
        this.f96453p = jVar;
        this.f96454q = pageAdRepository;
        this.f96455r = (C6369f) d7.f101764b.getValue();
        iInteractLayerService.enableReply(true);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCChronosBusinessService$notifyChronosCollectionChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService r5, java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService.a(com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo.Response b() {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService.b():tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo$Response");
    }

    @Nullable
    public final FetchBusinessData.Response fetchBusinessData(@NotNull String str, @Nullable Object obj) {
        return this.f96439a.fetchBusinessData(str, obj);
    }

    @Nullable
    public final GetOnlineInfo.Response getOnlineInfo() {
        return this.f96439a.getOnlineInfo();
    }

    @Nullable
    public final int[] getPlayerComponentsHeight() {
        return this.f96439a.getPlayerComponentsHeight();
    }

    @NotNull
    public final UpdateShipChain.Response getRelationshipChain() {
        UpdateShipChain.Response response = new UpdateShipChain.Response();
        RelationRepository relationRepository = this.h;
        response.setLikeState(Boolean.valueOf(relationRepository.j()));
        response.setLikeNum(Long.valueOf(relationRepository.l()));
        response.setDislikeState(Boolean.valueOf(relationRepository.h()));
        response.setCoinState(Boolean.valueOf(relationRepository.g()));
        response.setCoinNum(Long.valueOf(relationRepository.a()));
        response.setFavoriteState(Boolean.valueOf(relationRepository.i()));
        d dVar = this.f96445g;
        response.setFollowState(Boolean.valueOf(dVar.d()));
        d.a aVar = (d.a) dVar.f104056c.getValue();
        response.setFansNum(Long.valueOf(aVar != null ? aVar.f104064g : 0L));
        q qVar = this.f96444f.f104045k;
        int i7 = 0;
        if (qVar != null) {
            i7 = 0;
            if (qVar.f104117d) {
                j jVar = this.f96453p;
                ResolveAndPlayPlayable.c<InterfaceC5778f> cVarH0 = jVar.h0();
                u uVarO = jVar.o();
                if (uVarO == null || !uVarO.f79462e) {
                    u uVarO2 = jVar.o();
                    i7 = 0;
                    if (uVarO2 != null) {
                        MediaResource mediaResource = uVarO2.f79460c;
                        i7 = 0;
                        if (mediaResource != null) {
                            i7 = 0;
                            if (mediaResource.isPlayable()) {
                                i7 = ((cVarH0 instanceof ResolveAndPlayPlayable.c.C0510c) && ((InterfaceC5778f) ((ResolveAndPlayPlayable.c.C0510c) cVarH0).f79314a).k() == PlayerAvailability.COMPLETED) ? 2 : 1;
                            }
                        }
                    }
                } else {
                    i7 = 0;
                }
            }
        }
        response.setTrialStatus(i7);
        return response;
    }

    public final void notifyDanmakuExperiment(@Nullable String str, boolean z6) {
        this.f96439a.notifyDanmakuExperiment(str, z6);
    }

    public final void notifyDanmakuSent(@Nullable String str) {
        this.f96439a.notifyDanmakuSent(str);
    }

    public final void onDanmakuReply(@NotNull String str, @NotNull String str2, long j7, @NotNull String str3) {
        this.f96439a.onDanmakuReply(str, str2, j7, str3);
    }

    public final void onInvokeDanmakuInputPanel(@Nullable InvokeCommandDetailPanel.CommandDetailParams commandDetailParams) {
        this.f96439a.onInvokeDanmakuInputPanel(commandDetailParams);
    }

    @NotNull
    public final UpdateCurrentWork.Response onRpcGetCurrentWork() {
        UpdateCurrentWork.Response response = new UpdateCurrentWork.Response();
        response.setWorkId(String.valueOf(this.f96451n.f590a));
        response.setVideoId(String.valueOf(this.f96453p.f().getCid()));
        return response;
    }

    @NotNull
    public final GetWorkInfo.Response onRpcGetWorkInfo() {
        return b();
    }

    public final void onShowDanmakuFeedback(@NotNull DanmakuFeedbackInfo danmakuFeedbackInfo, @NotNull String str, @NotNull Map<String, String> map, @NotNull Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
        this.f96439a.onShowDanmakuFeedback(danmakuFeedbackInfo, str, map, function8);
    }

    public final void onTriggerTripleLike() {
        this.f96439a.onTriggerTripleLike();
    }

    public final void onUpdateClockInState(@NotNull UpdateVideoDetailState.CheckInState checkInState) {
        this.f96439a.onUpdateClockInState(checkInState);
    }

    public final void onUpdateCoinState(boolean z6) {
        this.f96439a.onUpdateCoinState(z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onUpdateCurrentWork(@org.jetbrains.annotations.Nullable tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateCurrentWork.Request r14) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.chronos.UGCChronosBusinessService.onUpdateCurrentWork(tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateCurrentWork$Request):boolean");
    }

    public final void onUpdateDislikeState(boolean z6) {
        this.f96439a.onUpdateDislikeState(z6);
    }

    public final void onUpdateFavoState(boolean z6) {
        this.f96439a.onUpdateFavoState(z6);
    }

    public final void onUpdateFollowState(boolean z6) {
        this.f96439a.onUpdateFollowState(z6);
    }

    public final void onUpdateLikeState(boolean z6) {
        this.f96439a.onUpdateLikeState(z6);
    }

    @Deprecated(message = "使用明确的行为定义，而不是使用这个聚合体")
    public final void onUpdateRelationshipChain(@Nullable UpdateShipChain.Request request) {
        this.f96439a.onUpdateRelationshipChain(request);
    }

    public final void onUpdateReserveState(@NotNull UpdateVideoDetailState.ReserveState reserveState) {
        this.f96439a.onUpdateReserveState(reserveState);
    }

    public final void onUpdateSeasonFollowState(boolean z6) {
        this.f96439a.onUpdateSeasonFollowState(z6);
    }

    public final void onUpdateStaffFollowState(@NotNull List<UpdateVideoDetailState.FollowState> list) {
        this.f96439a.onUpdateStaffFollowState(list);
    }

    public final boolean openURLSchema(@NotNull Uri uri, @Nullable OpenUrlScheme.BizParams bizParams) {
        return this.f96439a.openURLSchema(uri, bizParams);
    }

    public final boolean openURLScheme(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable OpenUrlScheme.BizParams bizParams, @Nullable Integer num2) {
        return this.f96439a.openURLScheme(str, str2, num, bizParams, num2);
    }

    public final void showDanmakuFeedbackWebview(@NotNull String str, @NotNull Map<String, String> map, @NotNull Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
        this.f96439a.showDanmakuFeedbackWebview(str, map, function8);
    }

    public final void showPlayerNaPage(@NotNull String str) {
        this.f96439a.showPlayerNaPage(str);
    }

    public final void showPlayerWebView(@NotNull String str) {
        this.f96439a.showPlayerWebView(str);
    }

    public final boolean showSubtitleReportDialog(@Nullable ReportSubtitle.SubtitleMeta subtitleMeta, @Nullable ReportSubtitle.SubtitleMeta subtitleMeta2) {
        return this.f96439a.showSubtitleReportDialog(subtitleMeta, subtitleMeta2);
    }

    public final void updateDanmakuInputPanel(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @NotNull Function2<Object, ? super Map<String, byte[]>, Unit> function2) {
        this.f96439a.updateDanmakuInputPanel(str, bool, bool2, function2);
    }

    @Nullable
    public final UpdateFullscreenState.Response updateFullscreenState(@Nullable Boolean bool, @Nullable Boolean bool2) {
        return this.f96439a.updateFullscreenState(bool, bool2);
    }

    @Nullable
    public final UpdatePreference.Response updatePreference(@NotNull String str, @Nullable String str2) {
        return this.f96439a.updatePreference(str, str2);
    }
}
