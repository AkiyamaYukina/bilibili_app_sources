package com.bilibili.playerbizcommonv2.widget.speed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.sdk.app.PayTask;
import com.bilibili.playerbizcommonv2.widget.speed.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/e.class */
@StabilityInferred(parameters = 0)
public final class e extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f83416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f83417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerSettingService f83418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f83419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f83420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InjectPlayerService
    private IToastService f83421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f83422g;

    @InjectPlayerService
    private IControlContainerService h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/e$a.class */
    public static final class a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f83423a;

        public a(e eVar) {
            this.f83423a = eVar;
        }

        @Override // com.bilibili.playerbizcommonv2.widget.speed.f.a
        public final void a(float f7) {
            e.g(this.f83423a, f7);
        }
    }

    public e(@NotNull Context context) {
        super(context);
    }

    public static final void g(e eVar, float f7) {
        IReporterService iReporterService = eVar.f83422g;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReporterService");
            iReporterService2 = null;
        }
        iReporterService2.report(new NeuronsEvents.NormalEvent("player.player.choose-speed.0.player", new String[]{"level", String.valueOf(f7)}));
        IPlayerCoreService iPlayerCoreService = eVar.f83419d;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.setPlaySpeed(f7);
        PlayerLog.i("BiliPlayerV2", "[player]playbackrate list widget hide;[player]current playbackrate=" + f7);
        AbsFunctionWidgetService absFunctionWidgetService = eVar.f83420e;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFunctionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(eVar.getToken());
        String string = eVar.getMContext().getString(2131845656, String.valueOf(f7));
        IControlContainerService iControlContainerService = eVar.h;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mControlContainerService");
            iControlContainerService2 = null;
        }
        ScreenModeType screenModeType = iControlContainerService2.getScreenModeType();
        if ((screenModeType == ScreenModeType.VERTICAL_FULLSCREEN || screenModeType == ScreenModeType.LANDSCAPE_FULLSCREEN || com.bilibili.playerbizcommonv2.utils.p.d()) && string != null && string.length() > 0) {
            PlayerToast playerToastBuild = new PlayerToast.Builder().toastItemType(17).location(34).setExtraString("extra_title", string).duration(PayTask.f60018j).build();
            IToastService iToastService = eVar.f83421f;
            if (iToastService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mToastService");
                iToastService = null;
            }
            iToastService.showToast(playerToastBuild);
        }
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(getMContext()).inflate(2131496519, (ViewGroup) null);
        IControlContainerService iControlContainerService = this.h;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mControlContainerService");
            iControlContainerService2 = null;
        }
        if (iControlContainerService2.getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN) {
            viewInflate.setPadding(viewInflate.getPaddingLeft(), viewInflate.getPaddingTop(), (int) DpUtils.dp2px(context, 56.0f), viewInflate.getPaddingBottom());
        }
        this.f83416a = (RecyclerView) viewInflate.findViewById(2131306580);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMContext(), 1, false);
        RecyclerView recyclerView = this.f83416a;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        return viewInflate;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, true);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    @NotNull
    public final String getTag() {
        return "SpeedFunctionWidget";
    }

    public final void onRelease() {
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        if (this.f83417b == null) {
            IPlayerSettingService iPlayerSettingService = this.f83418c;
            IPlayerSettingService iPlayerSettingService2 = iPlayerSettingService;
            if (iPlayerSettingService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerSettingService");
                iPlayerSettingService2 = null;
            }
            this.f83417b = new f(iPlayerSettingService2.getPlayerParamsConfig().getTheme());
            RecyclerView recyclerView = this.f83416a;
            RecyclerView recyclerView2 = recyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
                recyclerView2 = null;
            }
            f fVar = this.f83417b;
            f fVar2 = fVar;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpeedAdapter");
                fVar2 = null;
            }
            recyclerView2.setAdapter(fVar2);
            f fVar3 = this.f83417b;
            f fVar4 = fVar3;
            if (fVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSpeedAdapter");
                fVar4 = null;
            }
            fVar4.f83425b = new a(this);
        }
        IPlayerCoreService iPlayerCoreService = this.f83419d;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
            iPlayerCoreService2 = null;
        }
        float playSpeed$default = IPlayerCoreService.getPlaySpeed$default(iPlayerCoreService2, false, 1, (Object) null);
        f fVar5 = this.f83417b;
        f fVar6 = fVar5;
        if (fVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSpeedAdapter");
            fVar6 = null;
        }
        fVar6.N(playSpeed$default);
        f fVar7 = this.f83417b;
        if (fVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSpeedAdapter");
            fVar7 = null;
        }
        fVar7.notifyDataSetChanged();
        PlayerLog.i("BiliPlayerV2", "[player]playbackrate list widget show;[player]current playbackrate=" + playSpeed$default);
    }
}
