package com.bilibili.ship.theseus.united.page.videoquality;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusQualityFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class TheseusQualityFunctionWidget extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final InterfaceC6451z f103830g;

    @NotNull
    public final AbsFunctionWidgetService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C6450y f103832j;

    @Inject
    public TheseusQualityFunctionWidget(@NotNull Context context, @NotNull InterfaceC6451z interfaceC6451z, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IControlContainerService iControlContainerService) {
        super(context);
        this.f103830g = interfaceC6451z;
        this.h = absFunctionWidgetService;
        this.f103831i = iControlContainerService;
        this.f103832j = interfaceC6451z.a(new TheseusQualityFunctionWidget$panel$1(this));
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-691886870, true, new androidx.compose.material.B(this, 1)));
        return composeView;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, false);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    public final void onRelease() {
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return this.f103831i.getScreenModeType() == ScreenModeType.VERTICAL_FULLSCREEN ? RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM : RightInsetWithShadowFunctionWidget.ShadowSize.SMALL;
    }
}
