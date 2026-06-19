package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import com.bapis.bilibili.app.distribution.setting.play.CloudPlayConfig;
import com.bilibili.lib.device.settings.generated.api.DistributionSettings;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import com.bilibili.playerbizcommonv2.widget.quality.C5823u;
import com.bilibili.playerbizcommonv2.widget.setting.E;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/u.class */
@StabilityInferred(parameters = 0)
public final class C5823u extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f82882g;

    @InjectPlayerService
    private AbsFunctionWidgetService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    private IReporterService f82883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f82884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<com.bilibili.playerbizcommonv2.widget.setting.E> f82885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.widget.setting.F f82886l;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.u$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/u$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function1<Boolean, Unit> f82887a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super Boolean, Unit> function1) {
            this.f82887a = function1;
        }
    }

    public C5823u(@NotNull Context context) {
        super(context);
        this.f82882g = context;
        SnapshotStateList<com.bilibili.playerbizcommonv2.widget.setting.E> snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
        this.f82885k = snapshotStateListMutableStateListOf;
        this.f82886l = new com.bilibili.playerbizcommonv2.widget.setting.F(snapshotStateListMutableStateListOf);
    }

    public static Unit i(MutableState mutableState, boolean z6, a aVar, C5823u c5823u) {
        Function1<Boolean, Unit> function1;
        boolean z7 = !z6;
        mutableState.setValue(Boolean.valueOf(z7));
        if (aVar != null && (function1 = aVar.f82887a) != null) {
            function1.invoke(Boolean.valueOf(z7));
        }
        IReporterService iReporterService = c5823u.f82883i;
        IReporterService iReporterService2 = iReporterService;
        if (iReporterService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reportService");
            iReporterService2 = null;
        }
        iReporterService2.report(new NeuronsEvents.NormalEvent("player.player.clarity-type-more.0.player", new String[]{"switch", !z6 ? "1" : "2"}));
        AbsFunctionWidgetService absFunctionWidgetService = c5823u.h;
        if (absFunctionWidgetService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
            absFunctionWidgetService = null;
        }
        absFunctionWidgetService.hideWidget(c5823u.getToken());
        com.bilibili.playerbizcommon.utils.e eVar = com.bilibili.playerbizcommon.utils.e.f80284a;
        com.bilibili.playerbizcommon.utils.e.b(z7);
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-627562283, true, new ZL.d(this, 2)));
        return composeView;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.launchType(1);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.dismissWhenVideoChange(true);
        builder.persistent(false);
        builder.changeOrientationDisableWhenShow(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return "PlayerQualitySettingFunctionWidget";
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.bilibili.playerbizcommonv2.widget.quality.s] */
    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        a aVar = configuration instanceof a ? (a) configuration : null;
        SnapshotStateList<com.bilibili.playerbizcommonv2.widget.setting.E> snapshotStateList = this.f82885k;
        snapshotStateList.clear();
        com.bilibili.playerbizcommon.utils.e eVar = com.bilibili.playerbizcommon.utils.e.f80284a;
        DistributionSettings distributionSettings = (DistributionSettings) com.bilibili.playerbizcommon.utils.e.f80285b.getValue();
        boolean value = false;
        if (distributionSettings != null) {
            CloudPlayConfig cloudPlayConfig = distributionSettings.getCloudPlayConfig();
            if (cloudPlayConfig.hasPriorityUseDolbyHDR()) {
                value = cloudPlayConfig.getPriorityUseDolbyHDR().getValue();
            }
        }
        final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(value), null, 2, null);
        final boolean z6 = value;
        final a aVar2 = aVar;
        snapshotStateList.add(new E.a(this.f82882g.getString(2131851886), this.f82882g.getString(2131851887), mutableStateMutableStateOf$default, new Function1(mutableStateMutableStateOf$default, z6, aVar2, this) { // from class: com.bilibili.playerbizcommonv2.widget.quality.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableState f82877a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f82878b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final C5823u.a f82879c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final C5823u f82880d;

            {
                this.f82877a = mutableStateMutableStateOf$default;
                this.f82878b = z6;
                this.f82879c = aVar2;
                this.f82880d = this;
            }

            public final Object invoke(Object obj) {
                ((Integer) obj).getClass();
                return C5823u.i(this.f82877a, this.f82878b, this.f82879c, this.f82880d);
            }
        }));
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        IControlContainerService iControlContainerService = this.f82884j;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        return iControlContainerService2.getScreenModeType() == ScreenModeType.VERTICAL_FULLSCREEN ? RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM : RightInsetWithShadowFunctionWidget.ShadowSize.SMALL;
    }
}
