package com.bilibili.playerbizcommonv2.danmaku.feedback;

import ES0.E0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.theme.R$color;
import com.bilibili.playerbizcommonv2.danmaku.feedback.k;
import com.bilibili.playerbizcommonv2.danmaku.feedback.n;
import com.bilibili.playerbizcommonv2.danmaku.setting.v2.DanmakuSettingsStyle;
import com.bilibili.playerbizcommonv2.danmaku.widget.q;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import com.bilibili.playerbizcommonv2.widget.setting.channel.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.model.DanmakuFeedbackInfo;
import tv.danmaku.biliplayerv2.service.interact.biz.model.DanmakuFeedbackScene;
import tv.danmaku.biliplayerv2.service.interact.biz.model.comment.CommentItem;
import tv.danmaku.biliplayerv2.service.interact.biz.widget.b;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/u.class */
@StabilityInferred(parameters = 0)
public final class u extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Lazy<String> f80935q = LazyKt.lazy(new Be.b(5));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f80936g;

    @InjectPlayerService
    private IToastService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f80937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f80938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f80939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    private IInteractLayerService f80940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InjectPlayerService
    private IPlayDirector f80941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f80942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final List<RunningUIComponent> f80943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f80944p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/u$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final DanmakuFeedbackInfo f80945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final DanmakuFeedbackScene f80946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Function0<Unit> f80947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f80948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f80949e;

        public a() {
            throw null;
        }

        public a(DanmakuFeedbackInfo danmakuFeedbackInfo, DanmakuFeedbackScene danmakuFeedbackScene, KS0.b bVar, Function0 function0, Function0 function02, int i7) {
            danmakuFeedbackScene = (i7 & 2) != 0 ? DanmakuFeedbackScene.Detail : danmakuFeedbackScene;
            bVar = (i7 & 4) != 0 ? null : bVar;
            this.f80945a = danmakuFeedbackInfo;
            this.f80946b = danmakuFeedbackScene;
            this.f80947c = bVar;
            this.f80948d = function0;
            this.f80949e = function02;
        }
    }

    public u(@NotNull Context context) {
        super(context);
        this.f80936g = context;
        this.f80942n = new com.bilibili.app.gemini.ui.f(false);
        this.f80943o = new ArrayList();
    }

    public static Unit i(u uVar, DanmakuFeedbackInfo danmakuFeedbackInfo) {
        AbsFunctionWidgetService absFunctionWidgetService = uVar.f80939k;
        IToastService iToastService = null;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(uVar.getToken());
        Context context = uVar.f80936g;
        String oid = danmakuFeedbackInfo.getOid();
        String dmId = danmakuFeedbackInfo.getDmId();
        IInteractLayerService iInteractLayerService = uVar.f80940l;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        IToastService iToastService2 = uVar.h;
        if (iToastService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toastService");
        } else {
            iToastService = iToastService2;
        }
        h.a(context, oid, dmId, iInteractLayerService2, iToastService);
        uVar.p(1, danmakuFeedbackInfo);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit k(u uVar, Function0 function0, DanmakuFeedbackInfo danmakuFeedbackInfo) {
        AbsFunctionWidgetService absFunctionWidgetService = uVar.f80939k;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(uVar.getToken());
        if (((String) f80935q.getValue()).length() > 0) {
            function0.invoke();
        } else {
            danmakuFeedbackInfo.getType();
            b.a aVar = new b.a(danmakuFeedbackInfo.getDmId(), danmakuFeedbackInfo.getOid(), danmakuFeedbackInfo.getContent(), danmakuFeedbackInfo.getAppearanceTime(), danmakuFeedbackInfo.getDuration(), danmakuFeedbackInfo.getUserHash(), new com.bilibili.lib.fasthybrid.container.u(1, uVar));
            IControlContainerService iControlContainerService = uVar.f80938j;
            IControlContainerService iControlContainerService2 = iControlContainerService;
            if (iControlContainerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService2 = null;
            }
            ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
            ScreenModeType screenModeType2 = ScreenModeType.VERTICAL_FULLSCREEN;
            IFunctionContainer.LayoutParams layoutParams = screenModeType == screenModeType2 ? new IFunctionContainer.LayoutParams(-1, (int) DpUtils.dp2px(uVar.f80936g, 380.0f)) : new IFunctionContainer.LayoutParams((int) DpUtils.dp2px(uVar.f80936g, 320.0f), -1);
            layoutParams.setLayoutType(screenModeType == screenModeType2 ? 8 : 4);
            IControlContainerService iControlContainerService3 = uVar.f80938j;
            IControlContainerService iControlContainerService4 = iControlContainerService3;
            if (iControlContainerService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService4 = null;
            }
            iControlContainerService4.hide();
            AbsFunctionWidgetService absFunctionWidgetService3 = uVar.f80939k;
            AbsFunctionWidgetService absFunctionWidgetService4 = absFunctionWidgetService3;
            if (absFunctionWidgetService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService4 = null;
            }
            FunctionWidgetToken functionWidgetTokenShowWidget = absFunctionWidgetService4.showWidget(tv.danmaku.biliplayerv2.service.interact.biz.widget.b.class, layoutParams);
            if (functionWidgetTokenShowWidget != null) {
                AbsFunctionWidgetService absFunctionWidgetService5 = uVar.f80939k;
                if (absFunctionWidgetService5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                    absFunctionWidgetService5 = null;
                }
                absFunctionWidgetService5.updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget, aVar);
            }
        }
        uVar.p(2, danmakuFeedbackInfo);
        return Unit.INSTANCE;
    }

    public static Unit l(u uVar, ScreenModeType screenModeType, List list) {
        Video.DisplayParams displayParams;
        IPlayDirector iPlayDirector = uVar.f80941m;
        IPlayDirector iPlayDirector2 = iPlayDirector;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playDirector");
            iPlayDirector2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
        Long lValueOf = (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? null : Long.valueOf(displayParams.getCid());
        if (lValueOf != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CommentItem commentItem = (CommentItem) it.next();
                if (commentItem.cid != lValueOf.longValue()) {
                    commentItem.showLike = false;
                    commentItem.showReport = false;
                }
            }
        }
        AbsFunctionWidgetService absFunctionWidgetService = uVar.f80939k;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        RightInsetWithShadowFunctionWidget.Companion.getClass();
        FunctionWidgetToken functionWidgetTokenShowWidget = absFunctionWidgetService2.showWidget(com.bilibili.playerbizcommonv2.danmaku.widget.q.class, RightInsetWithShadowFunctionWidget.a.a(screenModeType));
        if (functionWidgetTokenShowWidget != null) {
            q.b bVar = new q.b(list, 2);
            AbsFunctionWidgetService absFunctionWidgetService3 = uVar.f80939k;
            if (absFunctionWidgetService3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService3 = null;
            }
            absFunctionWidgetService3.updateFunctionWidgetConfiguration(functionWidgetTokenShowWidget, bVar);
        }
        return Unit.INSTANCE;
    }

    public static Unit m(u uVar, DanmakuFeedbackInfo danmakuFeedbackInfo) {
        AbsFunctionWidgetService absFunctionWidgetService = uVar.f80939k;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(uVar.getToken());
        IControlContainerService iControlContainerService = uVar.f80938j;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
        ScreenModeType screenModeType2 = ScreenModeType.VERTICAL_FULLSCREEN;
        (screenModeType == screenModeType2 ? new IFunctionContainer.LayoutParams(-1, NewPlayerUtilsKt.toPx(380.0f)) : new IFunctionContainer.LayoutParams(NewPlayerUtilsKt.toPx(280.0f), -1)).setLayoutType(screenModeType == screenModeType2 ? 8 : 4);
        IInteractLayerService iInteractLayerService = uVar.f80940l;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        IRemoteHandler remoteHandler = iInteractLayerService2.getRemoteHandler();
        if (remoteHandler != null) {
            IRemoteHandler.requestRpcDanmakuList$default(remoteHandler, 0, new E0(1, uVar, screenModeType), 1, (Object) null);
        }
        uVar.p(6, danmakuFeedbackInfo);
        return Unit.INSTANCE;
    }

    public static Unit n(u uVar, Function0 function0, DanmakuFeedbackInfo danmakuFeedbackInfo) {
        AbsFunctionWidgetService absFunctionWidgetService = uVar.f80939k;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(uVar.getToken());
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(uVar.f80936g);
        if (activityFindActivityOrNull != null) {
            activityFindActivityOrNull.onBackPressed();
        }
        if (function0 != null) {
            function0.invoke();
        }
        uVar.p(5, danmakuFeedbackInfo);
        return Unit.INSTANCE;
    }

    public static Unit o(u uVar, DanmakuFeedbackInfo danmakuFeedbackInfo) {
        AbsFunctionWidgetService absFunctionWidgetService = uVar.f80939k;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(uVar.getToken());
        Context context = uVar.f80936g;
        Long longOrNull = StringsKt.toLongOrNull(danmakuFeedbackInfo.getOid());
        long jLongValue = 0;
        long jLongValue2 = longOrNull != null ? longOrNull.longValue() : 0L;
        Long longOrNull2 = StringsKt.toLongOrNull(danmakuFeedbackInfo.getDmId());
        if (longOrNull2 != null) {
            jLongValue = longOrNull2.longValue();
        }
        String userHash = danmakuFeedbackInfo.getUserHash();
        IInteractLayerService iInteractLayerService = uVar.f80940l;
        IInteractLayerService iInteractLayerService2 = iInteractLayerService;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService2 = null;
        }
        IToastService iToastService = uVar.h;
        if (iToastService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toastService");
            iToastService = null;
        }
        h.e(context, jLongValue2, jLongValue, userHash, iInteractLayerService2, iToastService, true);
        uVar.p(3, danmakuFeedbackInfo);
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(this.f80942n);
        return recyclerView;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.persistent(false);
        builder.changeOrientationDisableWhenShow(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerDanmakuFeedbackFunctionWidget";
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        Function0<Unit> function0 = this.f80944p;
        if (function0 != null) {
            function0.invoke();
        }
        this.f80944p = null;
        ((ArrayList) this.f80943o).clear();
        this.f80942n.N(CollectionsKt.emptyList());
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        if (configuration instanceof a) {
            IControlContainerService iControlContainerService = this.f80938j;
            IControlContainerService iControlContainerService2 = iControlContainerService;
            if (iControlContainerService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
                iControlContainerService2 = null;
            }
            iControlContainerService2.hide();
            a aVar = (a) configuration;
            this.f80944p = aVar.f80949e;
            List<RunningUIComponent> list = this.f80943o;
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            final DanmakuFeedbackInfo danmakuFeedbackInfo = aVar.f80945a;
            listCreateListBuilder.add(new RunningUIComponent(new k(new k.a(danmakuFeedbackInfo.getContent(), danmakuFeedbackInfo.getNickname(), R$color.Text_white, 42), new Od1.h(2, danmakuFeedbackInfo, this)), 0, (Function1) null, 6));
            String string = this.f80936g.getString(2131845799);
            DanmakuSettingsStyle danmakuSettingsStyle = DanmakuSettingsStyle.TOP;
            listCreateListBuilder.add(new RunningUIComponent(new n(new n.a(2131239016, string, null, -1, danmakuSettingsStyle, R$color.Graph_white, 2131104486, 2131104533, 284), new Function0(this, danmakuFeedbackInfo) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final u f80920a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DanmakuFeedbackInfo f80921b;

                {
                    this.f80920a = this;
                    this.f80921b = danmakuFeedbackInfo;
                }

                public final Object invoke() {
                    return u.i(this.f80920a, this.f80921b);
                }
            }), 0, (Function1) null, 6));
            n.a aVar2 = new n.a(2131239043, this.f80936g.getString(2131846932), null, 0, null, R$color.Graph_white, 2131104486, 2131104533, 380);
            final Function0<Unit> function0 = aVar.f80948d;
            listCreateListBuilder.add(new RunningUIComponent(new n(aVar2, new Function0(this, function0, danmakuFeedbackInfo) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final u f80922a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function0 f80923b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final DanmakuFeedbackInfo f80924c;

                {
                    this.f80922a = this;
                    this.f80923b = function0;
                    this.f80924c = danmakuFeedbackInfo;
                }

                public final Object invoke() {
                    return u.k(this.f80922a, this.f80923b, this.f80924c);
                }
            }), 0, (Function1) null, 6));
            listCreateListBuilder.add(new RunningUIComponent(new n(new n.a(2131238941, this.f80936g.getString(2131854372), null, 0, null, R$color.Graph_white, 2131104486, 2131104533, 380), new q(0, this, danmakuFeedbackInfo)), 0, (Function1) null, 6));
            String string2 = this.f80936g.getString(2131854355);
            String string3 = this.f80936g.getString(2131854287);
            DanmakuSettingsStyle danmakuSettingsStyle2 = DanmakuSettingsStyle.BOTTOM;
            listCreateListBuilder.add(new RunningUIComponent(new n(new n.a(2131238811, string2, string3, 0, danmakuSettingsStyle2, R$color.Graph_white, 2131104486, 2131104533, ErrorCode.E_SIGN_ERROR), new Function0(this, danmakuFeedbackInfo) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.r

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DanmakuFeedbackInfo f80928a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final u f80929b;

                {
                    this.f80928a = danmakuFeedbackInfo;
                    this.f80929b = this;
                }

                public final Object invoke() {
                    Lazy<String> lazy = u.f80935q;
                    DanmakuFeedbackInfo danmakuFeedbackInfo2 = this.f80928a;
                    h.c(danmakuFeedbackInfo2.getAid());
                    this.f80929b.p(4, danmakuFeedbackInfo2);
                    return Unit.INSTANCE;
                }
            }), 0, (Function1) null, 6));
            listCreateListBuilder.add(new RunningUIComponent(new w(16), 0, (Function1) null, 6));
            String string4 = this.f80936g.getString(2131846668);
            DanmakuFeedbackScene danmakuFeedbackScene = DanmakuFeedbackScene.Detail;
            DanmakuFeedbackScene danmakuFeedbackScene2 = aVar.f80946b;
            if (danmakuFeedbackScene2 != danmakuFeedbackScene) {
                danmakuSettingsStyle = DanmakuSettingsStyle.SINGLE;
            }
            listCreateListBuilder.add(new RunningUIComponent(new n(new n.a(2131244467, string4, null, 0, danmakuSettingsStyle, R$color.Graph_white, 2131104486, 2131104533, 316), new Function0(this, danmakuFeedbackInfo) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.s

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final u f80930a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DanmakuFeedbackInfo f80931b;

                {
                    this.f80930a = this;
                    this.f80931b = danmakuFeedbackInfo;
                }

                public final Object invoke() {
                    return u.m(this.f80930a, this.f80931b);
                }
            }), 0, (Function1) null, 6));
            if (danmakuFeedbackScene2 == danmakuFeedbackScene) {
                n.a aVar3 = new n.a(2131244391, this.f80936g.getString(2131854375), null, 0, danmakuSettingsStyle2, R$color.Graph_white, 2131104486, 2131104533, 316);
                final Function0<Unit> function02 = aVar.f80947c;
                listCreateListBuilder.add(new RunningUIComponent(new n(aVar3, new Function0(this, function02, danmakuFeedbackInfo) { // from class: com.bilibili.playerbizcommonv2.danmaku.feedback.t

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final u f80932a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Function0 f80933b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final DanmakuFeedbackInfo f80934c;

                    {
                        this.f80932a = this;
                        this.f80933b = function02;
                        this.f80934c = danmakuFeedbackInfo;
                    }

                    public final Object invoke() {
                        return u.n(this.f80932a, this.f80933b, this.f80934c);
                    }
                }), 0, (Function1) null, 6));
            }
            listCreateListBuilder.add(new RunningUIComponent(new w(46), 0, (Function1) null, 6));
            ((ArrayList) list).addAll(CollectionsKt.build(listCreateListBuilder));
            List<RunningUIComponent> list2 = this.f80943o;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                arrayList.add(((RunningUIComponent) it.next()).a);
            }
            this.f80942n.N(arrayList);
        }
    }

    public final void p(int i7, DanmakuFeedbackInfo danmakuFeedbackInfo) {
        IReporterService iReporterService = this.f80937i;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
            iReporterService2 = null;
        }
        String dmId = danmakuFeedbackInfo.getDmId();
        String content = danmakuFeedbackInfo.getContent();
        IPlayDirector iPlayDirector = this.f80941m;
        IPlayDirector iPlayDirector2 = iPlayDirector;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playDirector");
            iPlayDirector2 = null;
        }
        Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
        Video.DisplayParams displayParams = null;
        if (currentPlayableParams != null) {
            displayParams = currentPlayableParams.getDisplayParams();
        }
        boolean z6 = false;
        if (displayParams != null) {
            z6 = false;
            if (danmakuFeedbackInfo.getMid() == displayParams.getMid()) {
                z6 = true;
            }
        }
        h.b(iReporterService2, i7, dmId, content, z6);
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM;
    }
}
