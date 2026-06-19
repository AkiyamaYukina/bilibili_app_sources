package com.bilibili.ship.theseus.united.page.danmaku;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.authorspace.ui.C0;
import com.bilibili.app.gemini.player.feature.subtitle.GeminiSubtitleReportDialog;
import com.bilibili.app.gemini.player.feature.zoom.a;
import com.bilibili.app.gemini.player.feature.zoom.h;
import com.bilibili.biligame.GameCenterService;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.biligame.videocard.GameRetUserCard;
import com.bilibili.bus.Violet;
import com.bilibili.community.Community;
import com.bilibili.community.follow.FollowSeasonResult;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.playerbizcommonv2.danmaku.feedback.u;
import com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import com.bilibili.playerbizcommonv2.widget.setting.channel.InterfaceC5833b;
import com.bilibili.relation.FollowStateManager;
import com.bilibili.ship.theseus.united.page.card.VideoGameRetUserService;
import com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService;
import com.bilibili.ship.theseus.united.page.danmaku.ChronosReserveType;
import com.bilibili.ship.theseus.united.page.danmaku.HalfScreenDanmakuInputService;
import com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.ILocalHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.FetchBusinessData;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetWorkInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.InvokeCommandDetailPanel;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.OpenUrlScheme;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.ReportSubtitle;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateCurrentWork;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateFullscreenState;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateShipChain;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.biliplayerv2.service.interact.biz.model.DanmakuFeedbackInfo;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import zr0.C9211a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService.class */
@StabilityInferred(parameters = 0)
public final class ChronosBusinessService implements RpcInvokeObserver {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f99324A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final InteractiveSettingsService f99325B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f99326C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C9211a> f99327D = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public ChronosDanmakuFeedbackJsBridge f99328E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f99329F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f99331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f99332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FragmentManager f99333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f99334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f99335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99336g;

    @NotNull
    public final AbsFunctionWidgetService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IToastService f99337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IReporterService f99338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final RelationRepository f99339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final KingPositionService f99340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f99341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.intro.module.staffs.D f99342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository f99343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.weblayer.e f99344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final TheseusV3WebRepository f99345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final SlangPediaFloatLayerService f99346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final DanmakuInputWindowService f99347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final HalfScreenDanmakuInputService f99348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.online.a f99349u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f99350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f99351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final VideoGameRetUserService f99352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f99353y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f99354z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChronosBusinessService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChronosBusinessService f99355a;

            public a(ChronosBusinessService chronosBusinessService) {
                this.f99355a = chronosBusinessService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                C9211a c9211a = (C9211a) obj;
                this.f99355a.f99336g.syncStandardCardStatus(7, c9211a.f130352a, -1L, c9211a.f130353b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChronosBusinessService chronosBusinessService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
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
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(com.bilibili.ogv.infra.violet.c.b(Reflection.getOrCreateKotlinClass(C9211a.class)));
                ChronosBusinessService chronosBusinessService = this.this$0;
                a aVar = new a(chronosBusinessService);
                this.label = 1;
                Object objCollect = flowDistinctUntilChanged.collect(new ChronosBusinessService$2$invokeSuspend$$inlined$filter$1$2(aVar, chronosBusinessService), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChronosBusinessService chronosBusinessService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f99328E = new ChronosDanmakuFeedbackJsBridge();
                ChronosBusinessService chronosBusinessService = this.this$0;
                SlangPediaFloatLayerService slangPediaFloatLayerService = chronosBusinessService.f99346r;
                ChronosDanmakuFeedbackJsBridge chronosDanmakuFeedbackJsBridge = chronosBusinessService.f99328E;
                this.label = 1;
                if (slangPediaFloatLayerService.c("unitedvideo", chronosDanmakuFeedbackJsBridge, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ChronosBusinessService chronosBusinessService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ChronosBusinessService chronosBusinessService = this.this$0;
                this.label = 1;
                if (ChronosBusinessService.a(chronosBusinessService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$onUpdateCoinState$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$onUpdateCoinState$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $coin;
        int label;
        final ChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChronosBusinessService chronosBusinessService, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
            this.$coin = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$coin, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                RelationRepository relationRepository = this.this$0.f99339k;
                boolean z6 = this.$coin;
                this.label = 1;
                Object objS = relationRepository.s(z6, this);
                obj2 = objS;
                if (objS == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).unbox-impl();
            }
            ChronosBusinessService chronosBusinessService = this.this$0;
            if (Result.isSuccess-impl(obj2)) {
                chronosBusinessService.e(chronosBusinessService.f99331b.getString(2131845739));
            }
            ChronosBusinessService chronosBusinessService2 = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                String string = chronosBusinessService2.f99331b.getString(2131845422);
                String message = th.getMessage();
                chronosBusinessService2.e(string + ((message == null || message.length() == 0) ? th.getMessage() : ""));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$onUpdateFavoState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$onUpdateFavoState$1.class */
    public static final class C62781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $favo;
        int label;
        final ChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62781(ChronosBusinessService chronosBusinessService, boolean z6, Continuation<? super C62781> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
            this.$favo = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C62781(this.this$0, this.$favo, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                RelationRepository relationRepository = this.this$0.f99339k;
                boolean z6 = this.$favo;
                this.label = 1;
                Object objR = relationRepository.r(z6, this);
                obj2 = objR;
                if (objR == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).unbox-impl();
            }
            ChronosBusinessService chronosBusinessService = this.this$0;
            if (Result.isSuccess-impl(obj2)) {
                chronosBusinessService.e(chronosBusinessService.f99331b.getString(2131847339));
            }
            ChronosBusinessService chronosBusinessService2 = this.this$0;
            if (Result.exceptionOrNull-impl(obj2) != null) {
                chronosBusinessService2.e(chronosBusinessService2.f99331b.getString(2131845879));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$onUpdateFollowState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$onUpdateFollowState$1.class */
    public static final class C62791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $follow;
        int label;
        final ChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62791(ChronosBusinessService chronosBusinessService, boolean z6, Continuation<? super C62791> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
            this.$follow = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C62791(this.this$0, this.$follow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!com.bilibili.ship.theseus.united.utils.e.a(!this.this$0.f99334e.h().f102988b)) {
                    return Unit.INSTANCE;
                }
                if (this.this$0.f99341m.f() == this.this$0.f99350v.mid()) {
                    ChronosBusinessService chronosBusinessService = this.this$0;
                    chronosBusinessService.e(chronosBusinessService.f99331b.getString(2131846881));
                    return Unit.INSTANCE;
                }
                com.bilibili.ship.theseus.united.page.view.d dVar = this.this$0.f99341m;
                boolean z6 = this.$follow;
                this.label = 1;
                Object objH = dVar.h(MapsKt.emptyMap(), this, z6);
                obj2 = objH;
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).unbox-impl();
            }
            boolean z7 = this.$follow;
            ChronosBusinessService chronosBusinessService2 = this.this$0;
            if (Result.isSuccess-impl(obj2)) {
                if (z7) {
                    chronosBusinessService2.e(chronosBusinessService2.f99331b.getString(2131846742));
                } else {
                    chronosBusinessService2.e(chronosBusinessService2.f99331b.getString(2131845772));
                }
            }
            ChronosBusinessService chronosBusinessService3 = this.this$0;
            Throwable th = Result.exceptionOrNull-impl(obj2);
            if (th != null) {
                String message = th.getMessage();
                String string = message;
                if (message == null) {
                    string = chronosBusinessService3.f99331b.getString(2131847626);
                }
                chronosBusinessService3.e(string);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$onUpdateReserveState$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$onUpdateReserveState$1.class */
    public static final class C62801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final UpdateVideoDetailState.ReserveState $reserveState;
        final long $seasonId;
        int label;
        final ChronosBusinessService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62801(UpdateVideoDetailState.ReserveState reserveState, long j7, ChronosBusinessService chronosBusinessService, Continuation<? super C62801> continuation) {
            super(2, continuation);
            this.$reserveState = reserveState;
            this.$seasonId = j7;
            this.this$0 = chronosBusinessService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C62801(this.$reserveState, this.$seasonId, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Community community = Community.a;
                com.bilibili.community.follow.d dVar = new com.bilibili.community.follow.d(!this.$reserveState.getState(), this.$seasonId, (Long) null);
                this.label = 1;
                Object objG = community.g(dVar, this);
                obj2 = objG;
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).unbox-impl();
            }
            ChronosBusinessService chronosBusinessService = this.this$0;
            if (Result.isSuccess-impl(obj2)) {
                ToastHelper.showToastShort(chronosBusinessService.f99331b, ((FollowSeasonResult) obj2).b);
            }
            Result.exceptionOrNull-impl(obj2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$showDanmakuFeedbackWebview$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$showDanmakuFeedbackWebview$1.class */
    public static final class C62811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Function8<Boolean, Boolean, Boolean, String, String, String, String, GeneralResponse<String>, Unit> $onDanmakuReportCallback;
        final String $webviewUrl;
        int label;
        final ChronosBusinessService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService$showDanmakuFeedbackWebview$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$showDanmakuFeedbackWebview$1$a.class */
        public static final class a implements D {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function8<Boolean, Boolean, Boolean, String, String, String, String, GeneralResponse<String>, Unit> f99363a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
                this.f99363a = function8;
            }

            @Override // com.bilibili.ship.theseus.united.page.danmaku.D
            public final void a(boolean z6, boolean z7, Boolean bool, String str, String str2, String str3, String str4, GeneralResponse<String> generalResponse) {
                this.f99363a.invoke(Boolean.valueOf(z6), Boolean.valueOf(z7), bool, str, str2, str3, str4, generalResponse);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C62811(ChronosBusinessService chronosBusinessService, String str, Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8, Continuation<? super C62811> continuation) {
            super(2, continuation);
            this.this$0 = chronosBusinessService;
            this.$webviewUrl = str;
            this.$onDanmakuReportCallback = function8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Function8 function8, Object[] objArr) {
            if (objArr.length == 8) {
                boolean zBooleanValue = false;
                Object obj = objArr[0];
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                Object obj2 = objArr[1];
                Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                }
                Object obj3 = objArr[2];
                Boolean bool3 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                Object obj4 = objArr[3];
                String str = obj4 instanceof String ? (String) obj4 : null;
                String str2 = str == null ? "" : str;
                Object obj5 = objArr[4];
                String str3 = obj5 instanceof String ? (String) obj5 : null;
                String str4 = str3 == null ? "" : str3;
                Object obj6 = objArr[5];
                String str5 = obj6 instanceof String ? (String) obj6 : null;
                if (str5 == null) {
                    str5 = "";
                }
                Object obj7 = objArr[6];
                String str6 = obj7 instanceof String ? (String) obj7 : null;
                Object obj8 = objArr[7];
                GeneralResponse generalResponse = null;
                if (obj8 instanceof GeneralResponse) {
                    generalResponse = (GeneralResponse) obj8;
                }
                function8.invoke(Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue), bool3, str2, str4, str5, str6, generalResponse);
            }
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C62811(this.this$0, this.$webviewUrl, this.$onDanmakuReportCallback, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.this$0.f99334e.h().f102988b) {
                final Function8<Boolean, Boolean, Boolean, String, String, String, String, GeneralResponse<String>, Unit> function8 = this.$onDanmakuReportCallback;
                ChronosBusinessService.d(this.this$0, this.$webviewUrl, true, null, MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("onDanmakuReport", new Function1(function8) { // from class: com.bilibili.ship.theseus.united.page.danmaku.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Function8 f99530a;

                    {
                        this.f99530a = function8;
                    }

                    public final Object invoke(Object obj2) {
                        return ChronosBusinessService.C62811.invokeSuspend$lambda$0(this.f99530a, (Object[]) obj2);
                    }
                })}), true, true, 20);
            } else {
                ChronosDanmakuFeedbackJsBridge chronosDanmakuFeedbackJsBridge = this.this$0.f99328E;
                if (chronosDanmakuFeedbackJsBridge != null) {
                    chronosDanmakuFeedbackJsBridge.setReportListener(new a(this.$onDanmakuReportCallback));
                }
                ChronosBusinessService.d(this.this$0, this.$webviewUrl, false, null, null, false, true, 76);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public ChronosBusinessService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull FragmentManager fragmentManager, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IPlayDirector iPlayDirector, @NotNull IInteractLayerService iInteractLayerService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IToastService iToastService, @NotNull IReporterService iReporterService, @NotNull RelationRepository relationRepository, @NotNull KingPositionService kingPositionService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.intro.module.staffs.D d7, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull com.bilibili.ship.theseus.united.page.weblayer.e eVar, @NotNull TheseusV3WebRepository theseusV3WebRepository, @NotNull SlangPediaFloatLayerService slangPediaFloatLayerService, @NotNull DanmakuInputWindowService danmakuInputWindowService, @NotNull HalfScreenDanmakuInputService halfScreenDanmakuInputService, @NotNull com.bilibili.ship.theseus.united.page.online.a aVar, @NotNull BiliAccounts biliAccounts, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar2, @NotNull VideoGameRetUserService videoGameRetUserService, @NotNull IControlContainerService iControlContainerService, @NotNull AbsFunctionWidgetService absFunctionWidgetService2, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull InteractiveSettingsService interactiveSettingsService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar) {
        this.f99330a = coroutineScope;
        this.f99331b = context;
        this.f99332c = hVar;
        this.f99333d = fragmentManager;
        this.f99334e = cVar;
        this.f99335f = iPlayDirector;
        this.f99336g = iInteractLayerService;
        this.h = absFunctionWidgetService;
        this.f99337i = iToastService;
        this.f99338j = iReporterService;
        this.f99339k = relationRepository;
        this.f99340l = kingPositionService;
        this.f99341m = dVar;
        this.f99342n = d7;
        this.f99343o = danmakuCompoundRepository;
        this.f99344p = eVar;
        this.f99345q = theseusV3WebRepository;
        this.f99346r = slangPediaFloatLayerService;
        this.f99347s = danmakuInputWindowService;
        this.f99348t = halfScreenDanmakuInputService;
        this.f99349u = aVar;
        this.f99350v = biliAccounts;
        this.f99351w = cVar2;
        this.f99352x = videoGameRetUserService;
        this.f99353y = iControlContainerService;
        this.f99354z = absFunctionWidgetService2;
        this.f99324A = iPlayerSettingService;
        this.f99325B = interactiveSettingsService;
        this.f99326C = gVar;
        ILocalHandler localHandler = iInteractLayerService.getLocalHandler();
        if (localHandler != null) {
            localHandler.registerRpcInvokeObserver(this);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$special$$inlined$awaitCancel$1(null, this), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        iInteractLayerService.setSyncCardStatusListener(new h(this));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosLikeChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosLikeStateChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosCoinChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosCoinStateChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosFollowStateChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosFollowStateChange$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosFavorChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosDislikeVideoChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$notifyChronosEyeProtectionChange$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService.a(com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void d(ChronosBusinessService chronosBusinessService, String str, boolean z6, OpenUrlScheme.BizParams bizParams, Map map, boolean z7, boolean z8, int i7) {
        if ((i7 & 4) != 0) {
            bizParams = null;
        }
        if ((i7 & 8) != 0) {
            map = new LinkedHashMap();
        }
        boolean z9 = (i7 & 16) != 0;
        boolean z10 = (i7 & 32) != 0;
        if ((i7 & 64) != 0) {
            z7 = false;
        }
        if ((i7 & 128) != 0) {
            z8 = false;
        }
        if (!z6) {
            chronosBusinessService.getClass();
            BuildersKt.launch$default(chronosBusinessService.f99330a, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$openWebContainer$2(bizParams, chronosBusinessService, str, z9, z10, z8, null), 3, (Object) null);
            return;
        }
        IFunctionContainer.LayoutParams layoutParamsB = chronosBusinessService.b();
        boolean zAreEqual = Intrinsics.areEqual(Uri.parse(str).getQueryParameter("mask_close"), "0");
        q4.r.a("url[", str, "]", "H5Const");
        layoutParamsB.touchEnable(!zAreEqual);
        AbsFunctionWidgetService absFunctionWidgetService = chronosBusinessService.h;
        FunctionWidgetToken functionWidgetTokenShowWidget = absFunctionWidgetService.showWidget(com.bilibili.app.gemini.player.feature.zoom.h.class, layoutParamsB);
        if (functionWidgetTokenShowWidget != null) {
            absFunctionWidgetService.updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget, new h.a(str, 0, (Function1) null, z10, z7, z8, new W2.e(chronosBusinessService, 4), map, 6));
        }
    }

    public final IFunctionContainer.LayoutParams b() {
        IFunctionContainer.LayoutParams layoutParams;
        int i7 = this.f99331b.getResources().getDisplayMetrics().heightPixels;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f99334e;
        if (cVar.h().f102988b && cVar.h().f102987a) {
            layoutParams = new IFunctionContainer.LayoutParams(-1, (int) (i7 * 0.75f));
            layoutParams.setLayoutType(8);
        } else {
            layoutParams = new IFunctionContainer.LayoutParams(NewPlayerUtilsKt.toPx(320.0f), -1);
            layoutParams.setLayoutType(4);
        }
        return layoutParams;
    }

    public final void c(String str) {
        IFunctionContainer.LayoutParams layoutParamsB = b();
        AbsFunctionWidgetService absFunctionWidgetService = this.h;
        FunctionWidgetToken functionWidgetTokenShowWidget = absFunctionWidgetService.showWidget(com.bilibili.app.gemini.player.feature.zoom.a.class, layoutParamsB);
        if (functionWidgetTokenShowWidget != null) {
            absFunctionWidgetService.updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget, new a.a(str, 0));
        }
    }

    public final void e(@NotNull String str) {
        this.f99337i.showToast(qe.b.a(17, 33, 2000L).setExtraString("extra_title", str).build());
    }

    @NotNull
    public final FetchBusinessData.Response fetchBusinessData(@NotNull String str, @Nullable Object obj) {
        GameRetUserCard gameRetUserCard;
        if (Intrinsics.areEqual(str, "game") && obj != null) {
            GameRetUserCard videoGameRetUserCard = null;
            if ((obj instanceof JSONObject ? obj : null) != null) {
                JSONObject jSONObject = (JSONObject) JSON.toJSON(obj);
                boolean zContainsKey = jSONObject.containsKey("backflow_info");
                VideoGameRetUserService videoGameRetUserService = this.f99352x;
                if (zContainsKey) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("backflow_info");
                    String string = jSONObject2.containsKey("game_id") ? jSONObject2.getString("game_id") : "";
                    String string2 = jSONObject2.containsKey("gift_id") ? jSONObject2.getString("gift_id") : null;
                    if (videoGameRetUserService.f99084f == null) {
                        GameCenterService gameCenterService = (GameCenterService) BLRouter.INSTANCE.get(GameCenterService.class, "game_center");
                        if (gameCenterService != null) {
                            videoGameRetUserCard = gameCenterService.getVideoGameRetUserCard(string, string2, "1000100171");
                        }
                        videoGameRetUserService.f99084f = videoGameRetUserCard;
                        com.bilibili.ship.theseus.united.page.view.a aVar = videoGameRetUserService.f99081c;
                        Pair pair = TuplesKt.to(GameCardButton.extraAvid, aVar.b());
                        C8043a c8043a = videoGameRetUserService.f99082d;
                        Map mapMapOf = MapsKt.mapOf(new Pair[]{pair, TuplesKt.to("from_spmid", c8043a.a().f123881c)});
                        Map mapMapOf2 = MapsKt.mapOf(new Pair[]{TuplesKt.to("content_id", aVar.b()), TuplesKt.to("foreign_link_from_spmid", c8043a.a().f123881c)});
                        GameRetUserCard gameRetUserCard2 = videoGameRetUserService.f99084f;
                        if (gameRetUserCard2 != null) {
                            gameRetUserCard2.setRouterParams(mapMapOf2);
                        }
                        GameRetUserCard gameRetUserCard3 = videoGameRetUserService.f99084f;
                        if (gameRetUserCard3 != null) {
                            gameRetUserCard3.setReportExtra(mapMapOf);
                        }
                        GameRetUserCard gameRetUserCard4 = videoGameRetUserService.f99084f;
                        if (gameRetUserCard4 != null) {
                            gameRetUserCard4.attach();
                        }
                    }
                    FetchBusinessData.Response response = new FetchBusinessData.Response();
                    JSONObject jSONObject3 = new JSONObject();
                    GameRetUserCard gameRetUserCard5 = videoGameRetUserService.f99084f;
                    String str2 = "";
                    if (gameRetUserCard5 != null) {
                        LiveData textLiveData = gameRetUserCard5.getTextLiveData();
                        str2 = "";
                        if (textLiveData != null) {
                            str2 = (String) textLiveData.getValue();
                            if (str2 == null) {
                                str2 = "";
                            }
                        }
                    }
                    jSONObject3.put("button_title", str2);
                    response.setValue(jSONObject3);
                    return response;
                }
                if (jSONObject.containsKey("backflow_click") && (gameRetUserCard = videoGameRetUserService.f99084f) != null) {
                    gameRetUserCard.onCardClicked(videoGameRetUserService.f99079a);
                }
            }
        }
        return new FetchBusinessData.Response();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetOnlineInfo.Response getOnlineInfo() {
        /*
            r3 = this;
            tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetOnlineInfo$Response r0 = new tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetOnlineInfo$Response
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r3
            com.bilibili.ship.theseus.keel.player.h r0 = r0.f99332c
            com.bilibili.ship.theseus.keel.player.j r0 = r0.j()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = r4
            com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r0 = r0.f()
            r4 = r0
            goto L21
        L1f:
            r0 = 0
            r4 = r0
        L21:
            java.lang.String r0 = "0"
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L3a
            r0 = r4
            long r0 = r0.getAvid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L3e
        L3a:
            java.lang.String r0 = "0"
            r5 = r0
        L3e:
            r0 = r8
            r1 = r5
            r0.setWorkId(r1)
            r0 = r6
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L5b
            r0 = r4
            long r0 = r0.getCid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L5b
            r0 = r6
            r5 = r0
            goto L5b
        L5b:
            r0 = r8
            r1 = r5
            r0.setVideoId(r1)
            r0 = r3
            com.bilibili.ship.theseus.united.page.online.a r0 = r0.f99349u
            r4 = r0
            r0 = r8
            r1 = r4
            boolean r1 = r1.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setEnabled(r1)
            r0 = r8
            r1 = r4
            com.bilibili.ship.theseus.united.page.online.b r1 = r1.c()
            java.lang.String r1 = r1.f102114b
            r0.setViewerContent(r1)
            r0 = r8
            r1 = r4
            com.bilibili.ship.theseus.united.page.online.b r1 = r1.c()
            java.lang.String r1 = r1.f102115c
            r0.setIconUrl(r1)
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.ChronosBusinessService.getOnlineInfo():tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetOnlineInfo$Response");
    }

    @Nullable
    public final UpdateShipChain.Response getRelationshipChain() {
        return null;
    }

    public final void onInvokeDanmakuInputPanel(@Nullable InvokeCommandDetailPanel.CommandDetailParams commandDetailParams) {
        String string = this.f99331b.getString(2131845712);
        if (!this.f99334e.h().f102988b) {
            this.f99348t.h("", string, HalfScreenDanmakuInputService.DanmakuInputControl.WITH_KEYBOARD);
        } else {
            this.f99343o.a();
            this.f99347s.R(new com.bilibili.playerbizcommonv2.service.d(null, null, string, 1));
        }
    }

    @Nullable
    public final UpdateCurrentWork.Response onRpcGetCurrentWork() {
        return null;
    }

    @Nullable
    public final GetWorkInfo.Response onRpcGetWorkInfo() {
        return null;
    }

    public final void onShowDanmakuFeedback(@NotNull DanmakuFeedbackInfo danmakuFeedbackInfo, @NotNull final String str, @NotNull final Map<String, String> map, @NotNull final Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
        if (this.f99334e.h().f102988b) {
            RightInsetWithShadowFunctionWidget.a aVar = RightInsetWithShadowFunctionWidget.Companion;
            ScreenModeType screenModeType = this.f99353y.getScreenModeType();
            aVar.getClass();
            this.f99354z.showWidget(com.bilibili.playerbizcommonv2.danmaku.feedback.u.class, RightInsetWithShadowFunctionWidget.a.a(screenModeType), new u.a(danmakuFeedbackInfo, null, new KS0.b(this, 4), new Function0(this, str, map, function8) { // from class: com.bilibili.ship.theseus.united.page.danmaku.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChronosBusinessService f99515a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f99516b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Map f99517c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final Function8 f99518d;

                {
                    this.f99515a = this;
                    this.f99516b = str;
                    this.f99517c = map;
                    this.f99518d = function8;
                }

                public final Object invoke() {
                    this.f99515a.showDanmakuFeedbackWebview(this.f99516b, this.f99517c, this.f99518d);
                    return Unit.INSTANCE;
                }
            }, new KS0.d(this, 7), 2));
            return;
        }
        Context context = this.f99331b;
        long jF = this.f99341m.f();
        InterfaceC5833b.C0553b c0553b = InterfaceC5833b.C0553b.f83223a;
        Function0 function0 = new Function0(this, str, map, function8) { // from class: com.bilibili.ship.theseus.united.page.danmaku.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChronosBusinessService f99519a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99520b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Map f99521c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Function8 f99522d;

            {
                this.f99519a = this;
                this.f99520b = str;
                this.f99521c = map;
                this.f99522d = function8;
            }

            public final Object invoke() {
                this.f99519a.showDanmakuFeedbackWebview(this.f99520b, this.f99521c, this.f99522d);
                return Unit.INSTANCE;
            }
        };
        com.bilibili.ad.adview.videodetail.upper.common.g gVar = new com.bilibili.ad.adview.videodetail.upper.common.g(this, 4);
        com.bilibili.playerbizcommonv2.danmaku.feedback.h.f(context, danmakuFeedbackInfo, jF, this.f99324A, this.f99336g, this.f99337i, this.f99338j, null, function0, gVar, 256);
    }

    public final void onTriggerTripleLike() {
        KingPositionService kingPositionService = this.f99340l;
        kingPositionService.getClass();
        if (BiliAccounts.get(FoundationAlias.getFapp()).isLogin()) {
            kingPositionService.f100379j.f100340r.tryEmit(Unit.INSTANCE);
        } else {
            kingPositionService.f(true);
        }
    }

    public final void onUpdateCoinState(boolean z6) {
        boolean z7;
        if (C0.b()) {
            z7 = true;
        } else {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            z7 = false;
        }
        if (z7) {
            BuildersKt.launch$default(this.f99330a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, z6, null), 3, (Object) null);
        }
    }

    public final boolean onUpdateCurrentWork(@Nullable UpdateCurrentWork.Request request) {
        return false;
    }

    public final void onUpdateDislikeState(boolean z6) {
        if (z6) {
            this.f99340l.c(true);
        }
    }

    public final void onUpdateFavoState(boolean z6) {
        boolean z7;
        if (C0.b()) {
            z7 = true;
        } else {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            z7 = false;
        }
        if (z7) {
            BuildersKt.launch$default(this.f99330a, (CoroutineContext) null, (CoroutineStart) null, new C62781(this, z6, null), 3, (Object) null);
        }
    }

    public final void onUpdateFollowState(boolean z6) {
        BuildersKt.launch$default(this.f99330a, (CoroutineContext) null, (CoroutineStart) null, new C62791(this, z6, null), 3, (Object) null);
    }

    public final void onUpdateLikeState(boolean z6) {
        this.f99339k.k();
    }

    public final void onUpdateReserveState(@NotNull UpdateVideoDetailState.ReserveState reserveState) {
        ChronosReserveType chronosReserveType;
        if (!C0.b()) {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            return;
        }
        if (reserveState.getId().length() == 0) {
            return;
        }
        ChronosReserveType.a aVar = ChronosReserveType.Companion;
        int type = reserveState.getType();
        aVar.getClass();
        switch (type) {
            case 1:
                chronosReserveType = ChronosReserveType.UGC;
                break;
            case 2:
                chronosReserveType = ChronosReserveType.LIVE;
                break;
            case 3:
                chronosReserveType = ChronosReserveType.COOPERATION;
                break;
            case 4:
                chronosReserveType = ChronosReserveType.OGV;
                break;
            case 5:
                chronosReserveType = ChronosReserveType.GAME;
                break;
            case 6:
                chronosReserveType = ChronosReserveType.ACTIVITY;
                break;
            default:
                chronosReserveType = ChronosReserveType.NONE;
                break;
        }
        if (chronosReserveType == ChronosReserveType.OGV) {
            Long longOrNull = StringsKt.toLongOrNull(reserveState.getId());
            if (longOrNull != null) {
                BuildersKt.launch$default(this.f99330a, (CoroutineContext) null, (CoroutineStart) null, new C62801(reserveState, longOrNull.longValue(), this, null), 3, (Object) null);
                return;
            }
            return;
        }
        this.f99336g.syncStandardCardStatusFromPlayer(chronosReserveType.getType(), com.bilibili.ogv.infra.util.i.e(reserveState.getId()), reserveState.getState());
        this.f99327D.setValue(new C9211a(Long.parseLong(reserveState.getId()), reserveState.getState()));
        Violet.INSTANCE.sendMsg(new C9211a(com.bilibili.ogv.infra.util.i.e(reserveState.getId()), reserveState.getState()));
    }

    public final void onUpdateStaffFollowState(@NotNull List<UpdateVideoDetailState.FollowState> list) {
        Long longOrNull;
        if (list.isEmpty()) {
            return;
        }
        if (!C0.b()) {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
            return;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            String mid = list.get(i7).getMid();
            boolean state = list.get(i7).getState();
            if (mid != null && (longOrNull = StringsKt.toLongOrNull(mid)) != null) {
                long jLongValue = longOrNull.longValue();
                com.bilibili.community.follow.f fVar = com.bilibili.community.follow.f.a;
                com.bilibili.community.follow.f.g(jLongValue, state);
                FollowStateManager.Companion.getInstance().notify(jLongValue, state, null);
            }
        }
    }

    public final boolean openURLSchema(@NotNull Uri uri, @Nullable OpenUrlScheme.BizParams bizParams) {
        String queryParameter;
        if (!uri.getPathSegments().contains("inner_player")) {
            return false;
        }
        boolean z6 = this.f99334e.h().f102988b;
        String queryParameter2 = uri.getQueryParameter("scheme");
        if (queryParameter2 == null || (queryParameter = uri.getQueryParameter("biz")) == null) {
            return false;
        }
        if (Intrinsics.areEqual(queryParameter, "web")) {
            d(this, queryParameter2, z6, bizParams, null, false, false, 248);
            return true;
        }
        if (Intrinsics.areEqual(queryParameter, "na")) {
            c(queryParameter2);
            return true;
        }
        if (si1.a.a(queryParameter2)) {
            d(this, queryParameter2, z6, bizParams, null, false, false, 248);
            return true;
        }
        c(queryParameter2);
        return true;
    }

    public final boolean openURLScheme(@NotNull String str, @Nullable String str2, @Nullable Integer num, @Nullable OpenUrlScheme.BizParams bizParams, @Nullable Integer num2) {
        if (num == null || num.intValue() != 1 || str2 == null) {
            return false;
        }
        if (!Intrinsics.areEqual(str2, "web") && !si1.a.a(str)) {
            c(str);
            return true;
        }
        boolean z6 = this.f99334e.h().f102988b;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f99351w;
        if (num2 != null && num2.intValue() == 1) {
            BLog.i("ChronosBusinessService-openWebContainerWithOrientation", "[theseus-united-ChronosBusinessService-openWebContainerWithOrientation] switch to portrait from openWebContainer.");
            cVar.d();
            d(this, str, false, bizParams, null, false, false, 248);
            return true;
        }
        if (num2 == null || num2.intValue() != 2) {
            d(this, str, z6, bizParams, null, false, false, 248);
            return true;
        }
        BLog.i("ChronosBusinessService-openWebContainerWithOrientation", "[theseus-united-ChronosBusinessService-openWebContainerWithOrientation] switch to landscape from openWebContainer.");
        cVar.e();
        d(this, str, true, bizParams, null, false, false, 248);
        return true;
    }

    public final void showDanmakuFeedbackWebview(@NotNull String str, @NotNull Map<String, String> map, @NotNull Function8<? super Boolean, ? super Boolean, ? super Boolean, ? super String, ? super String, ? super String, ? super String, ? super GeneralResponse<String>, Unit> function8) {
        String strA = B0.a.a(str, "/?report_cfg=", Uri.encode(JsonUtilKt.toJson(map)));
        BLog.i("ChronosBusinessService", "webviewUrl: " + strA);
        BuildersKt.launch$default(this.f99330a, (CoroutineContext) null, (CoroutineStart) null, new C62811(this, strA, function8, null), 3, (Object) null);
    }

    public final void showPlayerNaPage(@NotNull String str) {
        if (this.f99334e.h().f102988b) {
            c(str);
        }
    }

    public final void showPlayerWebView(@NotNull String str) {
        if (this.f99334e.h().f102988b) {
            d(this, str, true, null, null, false, false, 252);
        } else {
            BLRouter.routeTo(RouteRequestKt.toRouteRequest(str), this.f99331b);
        }
    }

    public final boolean showSubtitleReportDialog(@Nullable ReportSubtitle.SubtitleMeta subtitleMeta, @Nullable ReportSubtitle.SubtitleMeta subtitleMeta2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f99329F < 500) {
            return false;
        }
        String content = subtitleMeta != null ? subtitleMeta.getContent() : null;
        String content2 = subtitleMeta2 != null ? subtitleMeta2.getContent() : null;
        if ((content == null || StringsKt.isBlank(content)) && (content2 == null || StringsKt.isBlank(content2))) {
            return false;
        }
        this.f99329F = jElapsedRealtime;
        GeminiSubtitleReportDialog geminiSubtitleReportDialog = new GeminiSubtitleReportDialog();
        geminiSubtitleReportDialog.l = this.f99335f;
        geminiSubtitleReportDialog.m = this.f99338j;
        geminiSubtitleReportDialog.h = subtitleMeta;
        geminiSubtitleReportDialog.i = subtitleMeta2;
        geminiSubtitleReportDialog.show(this.f99333d, "subtitle report");
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(geminiSubtitleReportDialog), (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$showSubtitleReportDialog$$inlined$awaitCancel$1(null, this, geminiSubtitleReportDialog), 3, (Object) null);
        this.f99332c.h(geminiSubtitleReportDialog);
        BuildersKt.launch$default(this.f99330a, (CoroutineContext) null, (CoroutineStart) null, new ChronosBusinessService$showSubtitleReportDialog$$inlined$awaitCancel$2(null, geminiSubtitleReportDialog, this), 3, (Object) null);
        return true;
    }

    @NotNull
    public final UpdateFullscreenState.Response updateFullscreenState(@Nullable Boolean bool, @Nullable Boolean bool2) {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f99334e;
        if (bool != null) {
            cVar.e();
        }
        if (bool2 != null) {
            cVar.b(this, bool2.booleanValue());
        }
        UpdateFullscreenState.Response response = new UpdateFullscreenState.Response();
        response.setFullscreen(Boolean.valueOf(cVar.h().f102988b));
        response.setLock(Boolean.valueOf(cVar.k()));
        return response;
    }
}
