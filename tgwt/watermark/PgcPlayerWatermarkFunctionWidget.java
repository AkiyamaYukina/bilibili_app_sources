package com.bilibili.tgwt.watermark;

import QK.F;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.bangumi.logic.page.detail.service.DetailRightPanelService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.player.commonplayer.functionwidget.PGCFunctionWidget;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.ogvcommon.play.resolver.ViewInfoExtraVo;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/PgcPlayerWatermarkFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class PgcPlayerWatermarkFunctionWidget extends PGCFunctionWidget {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ScreenStateService f112298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DetailRightPanelService f112299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public IControlContainerService f112300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f112301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f112302g;

    @InjectPlayerService
    private IControlContainerService h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/PgcPlayerWatermarkFunctionWidget$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PgcPlayerWatermarkFunctionWidget f112303a;

        public a(PgcPlayerWatermarkFunctionWidget pgcPlayerWatermarkFunctionWidget) {
            this.f112303a = pgcPlayerWatermarkFunctionWidget;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Pair pair = (Pair) obj;
            a.b bVar = (a.b) pair.component1();
            boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
            this.f112303a.f112301f.f112329b.setValue(!bVar.a ? zBooleanValue ? WatermarkUiMode.LandscapeSmall : WatermarkUiMode.Landscape : bVar.b ? WatermarkUiMode.PortraitFullscreen : WatermarkUiMode.HalfScreen);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public PgcPlayerWatermarkFunctionWidget(@NotNull Context context, @NotNull ScreenStateService screenStateService, @NotNull DetailRightPanelService detailRightPanelService) {
        super(context);
        this.f112298c = screenStateService;
        this.f112299d = detailRightPanelService;
        this.f112301f = new h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final View createContentView(@NotNull Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(197790169, true, new F(2, this)));
        return composeView;
    }

    @Nullable
    public final Object g(@NotNull Continuation<? super Unit> continuation) {
        ExtraInfo extraInfo;
        ViewInfoExtraVo viewInfoExtraVoB;
        IControlContainerService iControlContainerService = this.h;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
            iControlContainerService2 = null;
        }
        this.f112300e = iControlContainerService2;
        IPlayerCoreService iPlayerCoreService = this.f112302g;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService2 = null;
        }
        MediaResource mediaResource = iPlayerCoreService2.getMediaResource();
        this.f112301f.f112328a.setValue((mediaResource == null || (extraInfo = mediaResource.getExtraInfo()) == null || (viewInfoExtraVoB = com.bilibili.ogvcommon.play.resolver.c.b(extraInfo)) == null) ? null : viewInfoExtraVoB.f73246k);
        Object objCollect = FlowKt.flowCombine(this.f112298c.getScreenStateHelper().a, this.f112299d.getPanelShowingFlow(), new PgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2(null)).collect(new a(this), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().dismissWhenScreenModeChange(false).dismissWhenActivityStop(false).changeOrientationDisableWhenShow(false).dismissWhenVideoChange(true).persistent(false).launchType(2).build();
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        h hVar = this.f112301f;
        hVar.f112328a.setValue(null);
        hVar.f112329b.setValue(null);
    }
}
