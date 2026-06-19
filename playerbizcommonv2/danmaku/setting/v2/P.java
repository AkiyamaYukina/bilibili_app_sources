package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/P.class */
@StabilityInferred(parameters = 0)
public final class P extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f81394g;

    @InjectPlayerService
    private IControlContainerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f81395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    private IInteractLayerService f81396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    private IPlayDirector f81397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    private Er0.a f81398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f81399m;

    public P(@NotNull Context context) {
        super(context);
    }

    public static Unit i(P p7) {
        IControlContainerService iControlContainerService = p7.h;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        if (iControlContainerService2.getScreenModeType() == ScreenModeType.THUMB) {
            AbsFunctionWidgetService absFunctionWidgetService = p7.f81395i;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService = null;
            }
            absFunctionWidgetService.hideWidget(p7);
        }
        return Unit.INSTANCE;
    }

    public static Unit k(P p7) {
        AbsFunctionWidgetService absFunctionWidgetService = p7.f81395i;
        AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService2 = null;
        }
        absFunctionWidgetService2.hideWidget(p7);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        IReporterService iReporterService = this.f81394g;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reporterService");
            iReporterService = null;
        }
        IControlContainerService iControlContainerService = this.h;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService = null;
        }
        AbsFunctionWidgetService absFunctionWidgetService = this.f81395i;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService = null;
        }
        IInteractLayerService iInteractLayerService = this.f81396j;
        if (iInteractLayerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danmakuService");
            iInteractLayerService = null;
        }
        IPlayDirector iPlayDirector = this.f81397k;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playDirector");
            iPlayDirector = null;
        }
        Er0.a aVar = this.f81398l;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
            aVar = null;
        }
        x xVar = new x(context, iReporterService, iControlContainerService, absFunctionWidgetService, iInteractLayerService, iPlayDirector, aVar, LifecycleOwnerKt.getLifecycleScope(this), new XR0.b(this, 3), new com.bilibili.ad.reward.activity.L(this, 1));
        this.f81399m = xVar;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(xVar.f81492o);
        recyclerView.setPadding(NewPlayerUtilsKt.toPx(16.0f), NewPlayerUtilsKt.toPx(7.0f), NewPlayerUtilsKt.toPx(16.0f), 0);
        recyclerView.setAdapter(xVar.f81491n);
        recyclerView.setItemAnimator(null);
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
        return "PlayerDanmakuSettingFunctionWidgetV2";
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        x xVar = this.f81399m;
        if (xVar != null) {
            xVar.f81491n.N(CollectionsKt.emptyList());
            com.bilibili.playerbizcommonv2.utils.B b7 = xVar.f81490m;
            if (b7 != null) {
                Job job = b7.f81893e;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                b7.f81893e = null;
                b7.f81894f = null;
            }
            xVar.f81490m = null;
        }
    }

    public final void onWidgetShow() {
        super.onWidgetShow();
        x xVar = this.f81399m;
        x xVar2 = xVar;
        if (xVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panelController");
            xVar2 = null;
        }
        xVar2.f81481c.hide();
        xVar2.b();
        com.bilibili.playerbizcommonv2.utils.B b7 = new com.bilibili.playerbizcommonv2.utils.B(xVar2.f81485g, xVar2.h, xVar2.f81486i, new Bs.r(xVar2, 2));
        b7.a();
        xVar2.f81490m = b7;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM;
    }
}
