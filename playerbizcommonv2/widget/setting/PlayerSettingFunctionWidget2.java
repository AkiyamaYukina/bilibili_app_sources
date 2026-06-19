package com.bilibili.playerbizcommonv2.widget.setting;

import Oi1.d;
import android.app.Application;
import android.content.Context;
import android.view.View;
import androidx.compose.material.C3804a0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.sdk.app.PayTask;
import com.bapis.bilibili.community.service.dm.v1.SubtitleItem;
import com.bapis.bilibili.community.service.dm.v1.VideoSubtitle;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.playerbizcommonv2.delegate.IDelegateStoreService;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import com.bilibili.playerbizcommonv2.widget.setting.P;
import com.bilibili.playerbizcommonv2.widget.setting.channel.C5832a;
import com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingType;
import com.bilibili.playerbizcommonv2.widget.subtitle.L0;
import com.bilibili.playerbizcommonv2.widget.subtitle.q0;
import com.bilibili.playerbizcommonv2.widget.subtitle.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2.class */
@StabilityInferred(parameters = 0)
public final class PlayerSettingFunctionWidget2 extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f83113y = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f83114g;

    @InjectPlayerService
    private IPlayDirector h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f83115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f83116j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerSettingService f83117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f83118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InjectPlayerService
    private IToastService f83119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @InjectPlayerService
    private IRenderContainerService f83120n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @InjectPlayerService
    private li1.a f83121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @InjectPlayerService
    private IInteractLayerService f83122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f83123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @InjectPlayerService
    private com.bilibili.playerbizcommon.features.background.h f83124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @InjectPlayerService
    private IDelegateStoreService f83125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @InjectPlayerService
    private com.bilibili.playerbizcommonv2.service.ai.a f83126t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f83127u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final List<C5832a> f83128v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f83129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f83130x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f83131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f83132b;

        static {
            int[] iArr = new int[AspectRatio.values().length];
            try {
                iArr[AspectRatio.RATIO_ADJUST_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[AspectRatio.RATIO_CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[AspectRatio.RATIO_16_9_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[AspectRatio.RATIO_4_3_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f83131a = iArr;
            int[] iArr2 = new int[VideoSettingType.values().length];
            try {
                iArr2[VideoSettingType.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError e11) {
            }
            f83132b = iArr2;
        }
    }

    static {
        DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
        deviceDecision.dd("dd_united_836_fullscreen_ai_audio_switch_title", "");
        deviceDecision.dd("dd_united_867_fullscreen_multi_audio_switch_title", "");
        deviceDecision.dd("dd_united_836_fullscreen_ai_audio_change_title", "");
    }

    public PlayerSettingFunctionWidget2(@NotNull Context context) {
        super(context);
        this.f83114g = context;
        this.f83127u = new com.bilibili.app.gemini.ui.f(false);
        this.f83128v = new ArrayList();
        this.f83129w = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f83130x = StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public static Unit A(MutableStateFlow mutableStateFlow, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, int i7) {
        mutableStateFlow.setValue(Integer.valueOf(i7));
        IRenderContainerService iRenderContainerService = playerSettingFunctionWidget2.f83120n;
        IRenderContainerService iRenderContainerService2 = iRenderContainerService;
        if (iRenderContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderContainerService");
            iRenderContainerService2 = null;
        }
        iRenderContainerService2.setAspectRatio(i7 != 1 ? i7 != 2 ? AspectRatio.RATIO_ADJUST_CONTENT : AspectRatio.RATIO_CENTER_CROP : AspectRatio.RATIO_ADJUST_SCREEN);
        V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "ratio"), com.bilibili.app.authorspace.ui.pages.p.a(i7, 1, "value")}));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.Unit B(Oi1.d r4, com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2 r5, boolean r6) {
        /*
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r5
            com.bilibili.playerbizcommonv2.widget.setting.P r0 = r0.U()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L13
            r0 = r4
            r0.b()
        L13:
            r0 = r5
            java.lang.String r1 = "option"
            java.lang.String r2 = "screencast"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            V(r0, r1)
            goto L45
        L24:
            r0 = r4
            java.lang.String r0 = r0.e()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L36
            r0 = r7
            r4 = r0
            r0 = r7
            int r0 = r0.length()
            if (r0 != 0) goto L40
        L36:
            r0 = r5
            android.content.Context r0 = r0.getMContext()
            r1 = 2131846344(0x7f1164c8, float:1.9326135E38)
            java.lang.String r0 = r0.getString(r1)
            r4 = r0
        L40:
            r0 = r5
            r1 = r4
            r0.W(r1)
        L45:
            r0 = r5
            tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService r0 = r0.f83123q
            r7 = r0
            r0 = r7
            r4 = r0
            r0 = r7
            if (r0 != 0) goto L57
            java.lang.String r0 = "functionWidgetService"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r4 = r0
        L57:
            r0 = r4
            r1 = r5
            tv.danmaku.biliplayerv2.service.FunctionWidgetToken r1 = r1.getToken()
            r0.hideWidget(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2.B(Oi1.d, com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2, boolean):kotlin.Unit");
    }

    public static Unit C(Oi1.d dVar, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, boolean z6) {
        Unit unit;
        String str;
        if (z6) {
            P pU = playerSettingFunctionWidget2.U();
            if (pU != null) {
                pU.a();
            }
            V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", "listen")));
        } else {
            d.a aVarL = dVar.l();
            if (aVarL == null || (str = aVarL.c) == null) {
                unit = Unit.INSTANCE;
                return unit;
            }
            playerSettingFunctionWidget2.W(str);
        }
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
        unit = Unit.INSTANCE;
        return unit;
    }

    public static Unit F(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2) {
        IControlContainerService iControlContainerService = playerSettingFunctionWidget2.f83118l;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        RightInsetWithShadowFunctionWidget.Companion.getClass();
        absFunctionWidgetService2.showWidget(Lr0.f.class, RightInsetWithShadowFunctionWidget.a.a(screenModeType));
        AbsFunctionWidgetService absFunctionWidgetService3 = playerSettingFunctionWidget2.f83123q;
        if (absFunctionWidgetService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService3 = null;
        }
        absFunctionWidgetService3.hideWidget(playerSettingFunctionWidget2.getToken());
        V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", "ratio")));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.Unit G(com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2 r7) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2.G(com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2):kotlin.Unit");
    }

    public static Unit H(Oi1.d dVar, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2) {
        playerSettingFunctionWidget2.W(dVar.d());
        V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", "background")));
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
        return Unit.INSTANCE;
    }

    public static Unit I(Oi1.d dVar, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, boolean z6) {
        Unit unit;
        String str;
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
        if (z6) {
            V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", "watchLater")));
            P pU = playerSettingFunctionWidget2.U();
            if (pU != null) {
                pU.d();
            }
        } else {
            d.a aVarV = dVar.V();
            if (aVarV == null || (str = aVarV.c) == null) {
                unit = Unit.INSTANCE;
                return unit;
            }
            playerSettingFunctionWidget2.W(str);
        }
        unit = Unit.INSTANCE;
        return unit;
    }

    public static Unit J(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2) {
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void N(kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r4, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> r5, com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2 r6) {
        /*
            r0 = r4
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r9 = r0
            r0 = r5
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r8 = r0
            r0 = 1
            r7 = r0
            r0 = r9
            if (r0 == 0) goto L2e
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L2e
            r0 = 4
            r7 = r0
            goto L58
        L2e:
            r0 = r9
            if (r0 == 0) goto L3e
            r0 = r8
            r1 = 2
            if (r0 != r1) goto L3e
        L39:
            r0 = 0
            r7 = r0
            goto L58
        L3e:
            r0 = r9
            if (r0 != 0) goto L4d
            r0 = r8
            if (r0 != 0) goto L4d
            r0 = 2
            r7 = r0
            goto L58
        L4d:
            r0 = r9
            if (r0 != 0) goto L39
            r0 = r8
            r1 = 2
            if (r0 != r1) goto L39
        L58:
            r0 = r6
            tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r0 = r0.f83117k
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L6b
            java.lang.String r0 = "playerSettingService"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r4 = r0
        L6b:
            r0 = r4
            java.lang.String r1 = "pref_player_completion_action_key3"
            r2 = r7
            r0.putInt(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2.N(kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.MutableStateFlow, com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit P(com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2 r6, kotlin.jvm.internal.Ref.BooleanRef r7, int r8, int r9, int r10, com.bilibili.playerbizcommonv2.widget.setting.channel.x r11) {
        /*
            r0 = r6
            com.bilibili.playerbizcommonv2.service.ai.a r0 = r0.f83126t
            r16 = r0
            r0 = 0
            r15 = r0
            r0 = r16
            r14 = r0
            r0 = r16
            if (r0 != 0) goto L1b
            java.lang.String r0 = "aiService"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            r14 = r0
        L1b:
            r0 = r14
            com.bilibili.lib.media.resource.LanguageItem r0 = r0.n0()
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L4e
            r0 = r14
            boolean r0 = r0.b()
            r13 = r0
            r0 = 1
            r12 = r0
            r0 = r13
            r1 = 1
            if (r0 != r1) goto L4e
            r0 = r6
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f83129w
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            goto L51
        L4e:
            r0 = 0
            r12 = r0
        L51:
            r0 = r7
            r1 = r12
            r0.element = r1
            r0 = r15
            r14 = r0
            r0 = r11
            if (r0 == 0) goto Lb1
            r0 = r12
            if (r0 == 0) goto L74
            r0 = r6
            android.content.Context r0 = r0.f83114g
            r1 = r8
            r2 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = com.bilibili.playerbizcommonv2.utils.p.c(r0, r1, r2)
            r8 = r0
            goto L7d
        L74:
            r0 = r6
            android.content.Context r0 = r0.f83114g
            r1 = r8
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r8 = r0
        L7d:
            r0 = r7
            boolean r0 = r0.element
            if (r0 == 0) goto L93
            r0 = r6
            android.content.Context r0 = r0.f83114g
            r1 = r9
            r2 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = com.bilibili.playerbizcommonv2.utils.p.c(r0, r1, r2)
            r9 = r0
            goto L9c
        L93:
            r0 = r6
            android.content.Context r0 = r0.f83114g
            r1 = r9
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            r9 = r0
        L9c:
            r0 = r11
            r1 = r8
            r2 = r9
            r3 = r6
            android.content.Context r3 = r3.f83114g
            r4 = r10
            int r3 = androidx.core.content.ContextCompat.getColor(r3, r4)
            r0.c(r1, r2, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r14 = r0
        Lb1:
            r0 = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2.P(com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2, kotlin.jvm.internal.Ref$BooleanRef, int, int, int, com.bilibili.playerbizcommonv2.widget.setting.channel.x):kotlin.Unit");
    }

    public static final void Q(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, long j7) {
        if (j7 == 0) {
            V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "sleepTimer"), TuplesKt.to("value", "off")}));
            li1.a aVar = playerSettingFunctionWidget2.f83121o;
            li1.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shutOffTimingService");
                aVar2 = null;
            }
            aVar2.startShutOffTiming(j7, false);
            AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
        } else if (j7 == 15 || j7 == 30 || j7 == 60) {
            V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "sleepTimer"), TuplesKt.to("value", String.valueOf(j7))}));
            li1.a aVar3 = playerSettingFunctionWidget2.f83121o;
            li1.a aVar4 = aVar3;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shutOffTimingService");
                aVar4 = null;
            }
            aVar4.startShutOffTiming(j7, false);
            AbsFunctionWidgetService absFunctionWidgetService3 = playerSettingFunctionWidget2.f83123q;
            AbsFunctionWidgetService absFunctionWidgetService4 = absFunctionWidgetService3;
            if (absFunctionWidgetService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService4 = null;
            }
            absFunctionWidgetService4.hideWidget(playerSettingFunctionWidget2.getToken());
        } else if (j7 == Long.MAX_VALUE) {
            IControlContainerService iControlContainerService = playerSettingFunctionWidget2.f83118l;
            IControlContainerService iControlContainerService2 = iControlContainerService;
            if (iControlContainerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService2 = null;
            }
            ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
            AbsFunctionWidgetService absFunctionWidgetService5 = playerSettingFunctionWidget2.f83123q;
            AbsFunctionWidgetService absFunctionWidgetService6 = absFunctionWidgetService5;
            if (absFunctionWidgetService5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService6 = null;
            }
            RightInsetWithShadowFunctionWidget.Companion.getClass();
            absFunctionWidgetService6.showWidget(Ur0.d.class, RightInsetWithShadowFunctionWidget.a.a(screenModeType));
            AbsFunctionWidgetService absFunctionWidgetService7 = playerSettingFunctionWidget2.f83123q;
            AbsFunctionWidgetService absFunctionWidgetService8 = absFunctionWidgetService7;
            if (absFunctionWidgetService7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService8 = null;
            }
            absFunctionWidgetService8.hideWidget(playerSettingFunctionWidget2.getToken());
        }
        playerSettingFunctionWidget2.W(j7 == 0 ? playerSettingFunctionWidget2.getMContext().getString(2131846548) : (j7 == 15 || j7 == 30 || j7 == 60) ? playerSettingFunctionWidget2.getMContext().getString(2131846218) : "");
    }

    public static final String R(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, long j7) {
        return j7 == 0 ? playerSettingFunctionWidget2.getMContext().getString(2131841427) : j7 == 15 ? playerSettingFunctionWidget2.getMContext().getString(2131838713) : j7 == 30 ? playerSettingFunctionWidget2.getMContext().getString(2131838714) : j7 == 60 ? playerSettingFunctionWidget2.getMContext().getString(2131838715) : playerSettingFunctionWidget2.getMContext().getString(2131847115);
    }

    public static final long S(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, long j7, long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        li1.a aVar = playerSettingFunctionWidget2.f83121o;
        li1.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shutOffTimingService");
            aVar2 = null;
        }
        if (aVar2.isCustomizeTotalTime()) {
            return Long.MAX_VALUE;
        }
        long j9 = j7;
        if (j7 != 15) {
            j9 = j7;
            if (j7 != 30) {
                j9 = j7 == 60 ? j7 : Long.MAX_VALUE;
            }
        }
        return j9;
    }

    public static void V(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Map map) {
        playerSettingFunctionWidget2.getClass();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        if ("".length() > 0) {
            map2.put("value", "");
        }
        IReporterService iReporterService = playerSettingFunctionWidget2.f83116j;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
            iReporterService2 = null;
        }
        com.bilibili.app.gemini.player.widget.watchpoint.f.a("player.player.full-option-more.click.player", map2, iReporterService2);
    }

    public static Unit i(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableStateFlow mutableStateFlow) {
        com.bilibili.playerbizcommon.features.background.h hVar = playerSettingFunctionWidget2.f83124r;
        com.bilibili.playerbizcommon.features.background.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundPlayService");
            hVar2 = null;
        }
        boolean zIsEnable = hVar2.isEnable();
        boolean z6 = !zIsEnable;
        mutableStateFlow.setValue(Boolean.valueOf(z6));
        com.bilibili.playerbizcommon.features.background.h hVar3 = playerSettingFunctionWidget2.f83124r;
        com.bilibili.playerbizcommon.features.background.h hVar4 = hVar3;
        if (hVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundPlayService");
            hVar4 = null;
        }
        hVar4.setEnable(z6);
        playerSettingFunctionWidget2.W(!zIsEnable ? playerSettingFunctionWidget2.getMContext().getString(2131845419) : playerSettingFunctionWidget2.getMContext().getString(2131845460));
        V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "background"), TuplesKt.to("value", !zIsEnable ? "1" : "0")}));
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService = null;
        }
        absFunctionWidgetService.hideWidget(playerSettingFunctionWidget2.getToken());
        return Unit.INSTANCE;
    }

    public static Unit k(Oi1.d dVar, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, boolean z6) {
        Unit unit;
        String str;
        if (z6) {
            V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", "miniPlayer")));
            P pU = playerSettingFunctionWidget2.U();
            if (pU != null) {
                pU.e();
            }
        } else {
            d.a aVarM = dVar.m();
            if (aVarM == null || (str = aVarM.c) == null) {
                unit = Unit.INSTANCE;
                return unit;
            }
            playerSettingFunctionWidget2.W(str);
        }
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
        unit = Unit.INSTANCE;
        return unit;
    }

    public static Unit l(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, boolean z6, boolean z7) {
        playerSettingFunctionWidget2.getClass();
        V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "barrierFree"), TuplesKt.to("option", z7 ? "1" : "0")}));
        IToastService iToastService = null;
        if (z6) {
            IToastService iToastService2 = playerSettingFunctionWidget2.f83119m;
            if (iToastService2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toastService");
            } else {
                iToastService = iToastService2;
            }
            iToastService.showToast(new PlayerToast.Builder().toastItemType(17).location(33).setExtraString("extra_title", playerSettingFunctionWidget2.getMContext().getString(2131847504)).duration(2000L).build());
        } else {
            IControlContainerService iControlContainerService = playerSettingFunctionWidget2.f83118l;
            IControlContainerService iControlContainerService2 = iControlContainerService;
            if (iControlContainerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService2 = null;
            }
            ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
            AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            RightInsetWithShadowFunctionWidget.Companion.getClass();
            absFunctionWidgetService2.showWidget(Nr0.f.class, RightInsetWithShadowFunctionWidget.a.a(screenModeType));
            AbsFunctionWidgetService absFunctionWidgetService3 = playerSettingFunctionWidget2.f83123q;
            if (absFunctionWidgetService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService3 = null;
            }
            absFunctionWidgetService3.hideWidget(playerSettingFunctionWidget2.getToken());
        }
        return Unit.INSTANCE;
    }

    public static Unit m(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableStateFlow mutableStateFlow) {
        boolean zBooleanValue = ((Boolean) mutableStateFlow.getValue()).booleanValue();
        boolean z6 = !zBooleanValue;
        mutableStateFlow.setValue(Boolean.valueOf(z6));
        IRenderContainerService iRenderContainerService = playerSettingFunctionWidget2.f83120n;
        IRenderContainerService iRenderContainerService2 = iRenderContainerService;
        if (iRenderContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderContainerService");
            iRenderContainerService2 = null;
        }
        iRenderContainerService2.flipVideo(z6);
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService = null;
        }
        absFunctionWidgetService.hideWidget(playerSettingFunctionWidget2.getToken());
        V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "mirror"), TuplesKt.to("value", ((Boolean) mutableStateFlow.getValue()).booleanValue() ? "1" : "0")}));
        playerSettingFunctionWidget2.W(!zBooleanValue ? playerSettingFunctionWidget2.getMContext().getString(2131847274) : playerSettingFunctionWidget2.getMContext().getString(2131845760));
        return Unit.INSTANCE;
    }

    public static Unit n(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2) {
        String strC;
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
        IControlContainerService iControlContainerService = playerSettingFunctionWidget2.f83118l;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
        AbsFunctionWidgetService absFunctionWidgetService3 = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService4 = absFunctionWidgetService3;
        if (absFunctionWidgetService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService4 = null;
        }
        com.bilibili.playerbizcommonv2.service.ai.a aVar = playerSettingFunctionWidget2.f83126t;
        com.bilibili.playerbizcommonv2.service.ai.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aiService");
            aVar2 = null;
        }
        L0 l0Y = aVar2.Y();
        boolean zA = l0Y != null ? l0Y.a() : false;
        com.bilibili.playerbizcommonv2.service.ai.a aVar3 = playerSettingFunctionWidget2.f83126t;
        com.bilibili.playerbizcommonv2.service.ai.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aiService");
            aVar4 = null;
        }
        L0 l0Y2 = aVar4.Y();
        if (l0Y2 != null) {
            com.bilibili.playerbizcommonv2.service.ai.a aVar5 = playerSettingFunctionWidget2.f83126t;
            com.bilibili.playerbizcommonv2.service.ai.a aVar6 = aVar5;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aiService");
                aVar6 = null;
            }
            strC = l0Y2.c(aVar6.e0());
        } else {
            strC = "";
        }
        z0.a(screenModeType, absFunctionWidgetService4, new q0.d(new z0.b(zA, strC)), null);
        V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", "subtitleSwitch")));
        return Unit.INSTANCE;
    }

    public static Unit o(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2) {
        Unit unit;
        IPlayerSettingService iPlayerSettingService = playerSettingFunctionWidget2.f83117k;
        IPlayerSettingService iPlayerSettingService2 = iPlayerSettingService;
        if (iPlayerSettingService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
            iPlayerSettingService2 = null;
        }
        if (iPlayerSettingService2.getCloudConfig().b != null) {
            V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", "selfDefined")));
            IControlContainerService iControlContainerService = playerSettingFunctionWidget2.f83118l;
            IControlContainerService iControlContainerService2 = iControlContainerService;
            if (iControlContainerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService2 = null;
            }
            iControlContainerService2.editController(ControlContainerType.LANDSCAPE_FULLSCREEN);
            IReporterService iReporterService = playerSettingFunctionWidget2.f83116j;
            if (iReporterService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reporterService");
                iReporterService = null;
            }
            iReporterService.report(new NeuronsEvents.NormalEvent("player.player.full-more.edit-player.player", new String[0]));
            unit = Unit.INSTANCE;
        } else {
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public static Unit p(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2) {
        IControlContainerService iControlContainerService = playerSettingFunctionWidget2.f83118l;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        RightInsetWithShadowFunctionWidget.Companion.getClass();
        absFunctionWidgetService2.showWidget(Qr0.a.class, RightInsetWithShadowFunctionWidget.a.a(screenModeType));
        V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", "feedback")));
        AbsFunctionWidgetService absFunctionWidgetService3 = playerSettingFunctionWidget2.f83123q;
        if (absFunctionWidgetService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService3 = null;
        }
        absFunctionWidgetService3.hideWidget(playerSettingFunctionWidget2.getToken());
        return Unit.INSTANCE;
    }

    public static Unit q(final PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, boolean z6) {
        Unit unit;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        com.bilibili.playerbizcommonv2.service.ai.a aVar = playerSettingFunctionWidget2.f83126t;
        com.bilibili.playerbizcommonv2.service.ai.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aiService");
            aVar2 = null;
        }
        Languages languagesE0 = aVar2.e0();
        if (languagesE0 == null) {
            unit = Unit.INSTANCE;
        } else {
            IControlContainerService iControlContainerService = playerSettingFunctionWidget2.f83118l;
            IControlContainerService iControlContainerService2 = iControlContainerService;
            if (iControlContainerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService2 = null;
            }
            ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
            AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            q0.b bVar = q0.b.f83766a;
            String strJ = languagesE0.j();
            String strI = languagesE0.i();
            List listH = languagesE0.h();
            com.bilibili.playerbizcommonv2.service.ai.a aVar3 = playerSettingFunctionWidget2.f83126t;
            com.bilibili.playerbizcommonv2.service.ai.a aVar4 = aVar3;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aiService");
                aVar4 = null;
            }
            objectRef.element = z0.a(screenModeType, absFunctionWidgetService2, bVar, new z0.a(strJ, strI, listH, aVar4.n0(), playerSettingFunctionWidget2.f83114g.getString(2131846814), new C3804a0(1, playerSettingFunctionWidget2, objectRef), new Function1(playerSettingFunctionWidget2, objectRef) { // from class: com.bilibili.playerbizcommonv2.widget.setting.y

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerSettingFunctionWidget2 f83392a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.ObjectRef f83393b;

                {
                    this.f83392a = playerSettingFunctionWidget2;
                    this.f83393b = objectRef;
                }

                public final Object invoke(Object obj) {
                    ((Integer) obj).getClass();
                    return PlayerSettingFunctionWidget2.r(this.f83392a, this.f83393b);
                }
            }));
            IControlContainerService iControlContainerService3 = playerSettingFunctionWidget2.f83118l;
            IControlContainerService iControlContainerService4 = iControlContainerService3;
            if (iControlContainerService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService4 = null;
            }
            iControlContainerService4.hide();
            AbsFunctionWidgetService absFunctionWidgetService3 = playerSettingFunctionWidget2.f83123q;
            if (absFunctionWidgetService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService3 = null;
            }
            absFunctionWidgetService3.hideWidget(playerSettingFunctionWidget2.getToken());
            V(playerSettingFunctionWidget2, MapsKt.mapOf(TuplesKt.to("option", z6 ? "AIDubSwitch" : "multilingualSwitch")));
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.Unit r(com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2 r9, kotlin.jvm.internal.Ref.ObjectRef r10) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2.r(com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2, kotlin.jvm.internal.Ref$ObjectRef):kotlin.Unit");
    }

    public static Unit s(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Ref.ObjectRef objectRef, LanguageItem languageItem) {
        Unit unit;
        Application application = BiliContext.application();
        Context applicationContext = application != null ? application.getApplicationContext() : null;
        if (applicationContext == null || BiliAccounts.get(applicationContext).isLogin()) {
            com.bilibili.playerbizcommonv2.service.ai.a aVar = playerSettingFunctionWidget2.f83126t;
            com.bilibili.playerbizcommonv2.service.ai.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aiService");
                aVar2 = null;
            }
            Languages languagesE0 = aVar2.e0();
            String strM = languagesE0 != null ? languagesE0.m() : null;
            IControlContainerService iControlContainerService = playerSettingFunctionWidget2.f83118l;
            IControlContainerService iControlContainerService2 = iControlContainerService;
            if (iControlContainerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService2 = null;
            }
            ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
            IToastService iToastService = playerSettingFunctionWidget2.f83119m;
            IToastService iToastService2 = iToastService;
            if (iToastService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("toastService");
                iToastService2 = null;
            }
            com.bilibili.playerbizcommonv2.utils.p.i(strM, screenModeType, iToastService2);
            com.bilibili.playerbizcommonv2.service.ai.a aVar3 = playerSettingFunctionWidget2.f83126t;
            com.bilibili.playerbizcommonv2.service.ai.a aVar4 = aVar3;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aiService");
                aVar4 = null;
            }
            aVar4.o0(languageItem);
            FunctionWidgetToken functionWidgetToken = (FunctionWidgetToken) objectRef.element;
            if (functionWidgetToken != null) {
                AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
                AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
                if (absFunctionWidgetService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                    absFunctionWidgetService2 = null;
                }
                absFunctionWidgetService2.hideWidget(functionWidgetToken);
            }
            IReporterService iReporterService = playerSettingFunctionWidget2.f83116j;
            if (iReporterService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reporterService");
                iReporterService = null;
            }
            iReporterService.report(new NeuronsEvents.NormalEvent("player.player.aidubswitch-option.option-click.player", new String[]{"option", languageItem.getTitle(), "perfer_type", sb0.b.a(languageItem)}));
            unit = Unit.INSTANCE;
        } else {
            PlayerRouteUris.Routers.login$default(PlayerRouteUris.Routers.INSTANCE, applicationContext, 1024, (String) null, 4, (Object) null);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public static Unit u(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableStateFlow mutableStateFlow) {
        IRenderContainerService iRenderContainerService = playerSettingFunctionWidget2.f83120n;
        IRenderContainerService iRenderContainerService2 = iRenderContainerService;
        if (iRenderContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderContainerService");
            iRenderContainerService2 = null;
        }
        boolean zIsInWholeSceneMode = iRenderContainerService2.isInWholeSceneMode();
        mutableStateFlow.setValue(Boolean.valueOf(!zIsInWholeSceneMode));
        if (zIsInWholeSceneMode) {
            IRenderContainerService iRenderContainerService3 = playerSettingFunctionWidget2.f83120n;
            IRenderContainerService iRenderContainerService4 = iRenderContainerService3;
            if (iRenderContainerService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("renderContainerService");
                iRenderContainerService4 = null;
            }
            IRenderContainerService.exitWholeSceneMode$default(iRenderContainerService4, false, 1, (Object) null);
        } else {
            IRenderContainerService iRenderContainerService5 = playerSettingFunctionWidget2.f83120n;
            IRenderContainerService iRenderContainerService6 = iRenderContainerService5;
            if (iRenderContainerService5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("renderContainerService");
                iRenderContainerService6 = null;
            }
            IRenderContainerService.enterWholeSceneMode$default(iRenderContainerService6, false, 1, (Object) null);
        }
        V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "fullView"), TuplesKt.to("value", !zIsInWholeSceneMode ? "1" : "0")}));
        playerSettingFunctionWidget2.W(!zIsInWholeSceneMode ? playerSettingFunctionWidget2.getMContext().getString(2131846871) : playerSettingFunctionWidget2.getMContext().getString(2131846890));
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService = null;
        }
        absFunctionWidgetService.hideWidget(playerSettingFunctionWidget2.getToken());
        return Unit.INSTANCE;
    }

    public static Unit v(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableStateFlow mutableStateFlow, MutableStateFlow mutableStateFlow2, List list, int i7) {
        mutableStateFlow.setValue(Integer.valueOf(i7));
        boolean zBooleanValue = ((Boolean) mutableStateFlow2.getValue()).booleanValue();
        if (zBooleanValue && i7 == 0) {
            mutableStateFlow2.setValue(Boolean.FALSE);
        } else if (!zBooleanValue && i7 == 1) {
            mutableStateFlow2.setValue(Boolean.TRUE);
        }
        playerSettingFunctionWidget2.W((String) list.get(i7));
        N(mutableStateFlow2, mutableStateFlow, playerSettingFunctionWidget2);
        V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "circle"), com.bilibili.app.authorspace.ui.pages.p.a(i7, 1, "value")}));
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
        return Unit.INSTANCE;
    }

    public static Unit w(int i7, int i8, PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef) {
        Unit unit;
        List subtitlesList;
        if (booleanRef.element) {
            unit = Unit.INSTANCE;
        } else {
            boolean zBooleanValue = ((Boolean) playerSettingFunctionWidget2.f83129w.getValue()).booleanValue();
            boolean z6 = !zBooleanValue;
            IInteractLayerService iInteractLayerService = playerSettingFunctionWidget2.f83122p;
            IInteractLayerService iInteractLayerService2 = iInteractLayerService;
            if (iInteractLayerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
                iInteractLayerService2 = null;
            }
            String keySubtitleSwitchOn = iInteractLayerService2.getSubtitleKeyConfig().getKeySubtitleSwitchOn();
            IPlayerSettingService iPlayerSettingService = playerSettingFunctionWidget2.f83117k;
            IPlayerSettingService iPlayerSettingService2 = iPlayerSettingService;
            if (iPlayerSettingService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
                iPlayerSettingService2 = null;
            }
            iPlayerSettingService2.putBoolean(keySubtitleSwitchOn, z6);
            com.bilibili.biligame.ui.feed.preload.b.a("[playerbizcommonv2-PlayerSettingFunctionWidget2-createSubtitleSwitch$lambda$1] ", "click subtitle switch " + z6, "PlayerSettingFunctionWidget2-createSubtitleSwitch$lambda$1");
            IInteractLayerService iInteractLayerService3 = playerSettingFunctionWidget2.f83122p;
            IInteractLayerService iInteractLayerService4 = iInteractLayerService3;
            if (iInteractLayerService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
                iInteractLayerService4 = null;
            }
            SubtitleItem mainSubtitle = iInteractLayerService4.getMainSubtitle();
            SubtitleItem subtitleItem = mainSubtitle;
            if (mainSubtitle == null) {
                IInteractLayerService iInteractLayerService5 = playerSettingFunctionWidget2.f83122p;
                IInteractLayerService iInteractLayerService6 = iInteractLayerService5;
                if (iInteractLayerService5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
                    iInteractLayerService6 = null;
                }
                SubtitleItem subtitleItemChooseMainSubtitle$default = IInteractLayerService.chooseMainSubtitle$default(iInteractLayerService6, false, 1, (Object) null);
                subtitleItem = subtitleItemChooseMainSubtitle$default;
                if (subtitleItemChooseMainSubtitle$default == null) {
                    IInteractLayerService iInteractLayerService7 = playerSettingFunctionWidget2.f83122p;
                    IInteractLayerService iInteractLayerService8 = iInteractLayerService7;
                    if (iInteractLayerService7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
                        iInteractLayerService8 = null;
                    }
                    VideoSubtitle subtitleData = iInteractLayerService8.getSubtitleData();
                    subtitleItem = (subtitleData == null || (subtitlesList = subtitleData.getSubtitlesList()) == null) ? null : (SubtitleItem) CollectionsKt.firstOrNull(subtitlesList);
                }
            }
            if (zBooleanValue) {
                AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
                AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
                if (absFunctionWidgetService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                    absFunctionWidgetService2 = null;
                }
                absFunctionWidgetService2.hideWidget(playerSettingFunctionWidget2.getToken());
                IInteractLayerService iInteractLayerService9 = playerSettingFunctionWidget2.f83122p;
                IInteractLayerService iInteractLayerService10 = iInteractLayerService9;
                if (iInteractLayerService9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
                    iInteractLayerService10 = null;
                }
                iInteractLayerService10.loadSubtitle((SubtitleItem) null, (SubtitleItem) null);
                IPlayerSettingService iPlayerSettingService3 = playerSettingFunctionWidget2.f83117k;
                IPlayerSettingService iPlayerSettingService4 = iPlayerSettingService3;
                if (iPlayerSettingService3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
                    iPlayerSettingService4 = null;
                }
                iPlayerSettingService4.putBoolean("danmaku_subtitle_multi", false);
            } else {
                IInteractLayerService iInteractLayerService11 = playerSettingFunctionWidget2.f83122p;
                IInteractLayerService iInteractLayerService12 = iInteractLayerService11;
                if (iInteractLayerService11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
                    iInteractLayerService12 = null;
                }
                iInteractLayerService12.loadSubtitle(subtitleItem, (SubtitleItem) null);
            }
            IInteractLayerService iInteractLayerService13 = playerSettingFunctionWidget2.f83122p;
            if (iInteractLayerService13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
                iInteractLayerService13 = null;
            }
            IInteractLayerService.recordSelectedSubtitle$default(iInteractLayerService13, false, true, false, 1, (Object) null);
            playerSettingFunctionWidget2.f83129w.setValue(Boolean.valueOf(z6));
            V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "subtitle"), TuplesKt.to("value", !zBooleanValue ? "1" : "0")}));
            P(playerSettingFunctionWidget2, booleanRef, i7, 2131100084, i8, (com.bilibili.playerbizcommonv2.widget.setting.channel.x) objectRef.element);
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.Unit x(com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2 r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2.x(com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2, boolean):kotlin.Unit");
    }

    public static Unit y(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, String str) {
        playerSettingFunctionWidget2.W(str + "X");
        V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "speed"), TuplesKt.to("value", str)}));
        IPlayerCoreService iPlayerCoreService = playerSettingFunctionWidget2.f83115i;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.setPlaySpeed(Float.parseFloat(str));
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService = null;
        }
        absFunctionWidgetService.hideWidget(playerSettingFunctionWidget2.getToken());
        return Unit.INSTANCE;
    }

    public static Unit z(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, MutableStateFlow mutableStateFlow) {
        IPlayerSettingService iPlayerSettingService = playerSettingFunctionWidget2.f83117k;
        IPlayerSettingService iPlayerSettingService2 = iPlayerSettingService;
        if (iPlayerSettingService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
            iPlayerSettingService2 = null;
        }
        boolean z6 = iPlayerSettingService2.getBoolean("SkipTitlesAndEndings", true);
        boolean z7 = !z6;
        mutableStateFlow.setValue(Boolean.valueOf(z7));
        IPlayerSettingService iPlayerSettingService3 = playerSettingFunctionWidget2.f83117k;
        IPlayerSettingService iPlayerSettingService4 = iPlayerSettingService3;
        if (iPlayerSettingService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
            iPlayerSettingService4 = null;
        }
        iPlayerSettingService4.putBoolean("SkipTitlesAndEndings", z7);
        V(playerSettingFunctionWidget2, MapsKt.mapOf(new Pair[]{TuplesKt.to("option", "jumpHeadTail"), TuplesKt.to("value", !z6 ? "1" : "0")}));
        playerSettingFunctionWidget2.W(!z6 ? playerSettingFunctionWidget2.f83114g.getString(2131846433) : playerSettingFunctionWidget2.f83114g.getString(2131845933));
        AbsFunctionWidgetService absFunctionWidgetService = playerSettingFunctionWidget2.f83123q;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService = null;
        }
        absFunctionWidgetService.hideWidget(playerSettingFunctionWidget2.getToken());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0628  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.bilibili.app.gemini.ui.RunningUIComponent> O(int r26, com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingType r27) {
        /*
            Method dump skipped, instruction units count: 3476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2.O(int, com.bilibili.playerbizcommonv2.widget.setting.channel.VideoSettingType):java.util.List");
    }

    public final boolean T() {
        IPlayerCoreService iPlayerCoreService = this.f83115i;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService2 = null;
        }
        MediaResource mediaResource = iPlayerCoreService2.getMediaResource();
        String str = null;
        if (mediaResource != null) {
            PlayIndex playIndex = mediaResource.getPlayIndex();
            str = null;
            if (playIndex != null) {
                str = playIndex.mFrom;
            }
        }
        return Intrinsics.areEqual(str, "downloaded");
    }

    public final P U() {
        IDelegateStoreService iDelegateStoreService = this.f83125s;
        if (iDelegateStoreService != null) {
            return (P) iDelegateStoreService.get(P.a.f83112a);
        }
        return null;
    }

    public final void W(String str) {
        if (str == null || str.length() <= 0) {
            return;
        }
        PlayerToast playerToastBuild = new PlayerToast.Builder().toastItemType(17).location(33).setExtraString("extra_title", str).duration(PayTask.f60018j).build();
        IToastService iToastService = this.f83119m;
        IToastService iToastService2 = iToastService;
        if (iToastService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toastService");
            iToastService2 = null;
        }
        iToastService2.showToast(playerToastBuild);
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(this.f83127u);
        return recyclerView;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.launchType(1);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.persistent(false);
        builder.changeOrientationDisableWhenShow(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerSettingFunctionWidget2";
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        ((ArrayList) this.f83128v).clear();
        this.f83127u.N(CollectionsKt.emptyList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x08c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onWidgetShow() {
        /*
            Method dump skipped, instruction units count: 2933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2.onWidgetShow():void");
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM;
    }
}
