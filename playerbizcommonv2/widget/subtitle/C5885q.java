package com.bilibili.playerbizcommonv2.widget.subtitle;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bapis.bilibili.community.service.dm.v1.SubtitleItem;
import com.bapis.bilibili.community.service.dm.v1.VideoSubtitle;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/q.class */
@StabilityInferred(parameters = 0)
public final class C5885q extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InjectPlayerService
    public IControlContainerService f83758g;

    @InjectPlayerService
    public AbsFunctionWidgetService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    public IInteractLayerService f83759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    public IPlayerSettingService f83760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    public IReporterService f83761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    public com.bilibili.playerbizcommonv2.service.ai.a f83762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f83763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f83764n;

    public C5885q(@NotNull Context context) {
        super(context);
        this.f83763m = LazyKt.lazy(new L9.u(this, 2));
        this.f83764n = LazyKt.lazy(new L9.v(this, 3));
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1661155766, true, new Function2(this) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C5885q f83741a;

            {
                this.f83741a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1661155766, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.subtitle.BilingualFuncWidget.contentView.<anonymous>.<anonymous> (BilingualFuncWidget.kt:65)");
                    }
                    BiliThemeKt.BiliTheme(ThemeStrategy.ForceDay, false, ComposableLambdaKt.rememberComposableLambda(487671186, true, new com.bilibili.bililive.room.ui.roomv3.superchat.d(1, this.f83741a), composer, 54), composer, 390, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        return composeView;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, false);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    @NotNull
    public final IInteractLayerService i() {
        IInteractLayerService iInteractLayerService = this.f83759i;
        if (iInteractLayerService != null) {
            return iInteractLayerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
        return null;
    }

    public final void k(String str, boolean z6) {
        if (!z6) {
            String keySubtitleSwitchOn = i().getSubtitleKeyConfig().getKeySubtitleSwitchOn();
            IPlayerSettingService iPlayerSettingService = this.f83760j;
            if (iPlayerSettingService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
                iPlayerSettingService = null;
            }
            iPlayerSettingService.putBoolean(keySubtitleSwitchOn, true);
        }
        i().loadSubtitle(Oi1.c.b(i().getSubtitleData(), str), i().getViceSubtitle());
        IInteractLayerService.recordSelectedSubtitle$default(i(), false, true, true, 1, (Object) null);
    }

    public final void l(String str, boolean z6) {
        if (!z6) {
            String keySubtitleSwitchOn = i().getSubtitleKeyConfig().getKeySubtitleSwitchOn();
            IPlayerSettingService iPlayerSettingService = this.f83760j;
            if (iPlayerSettingService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
                iPlayerSettingService = null;
            }
            iPlayerSettingService.putBoolean(keySubtitleSwitchOn, true);
        }
        VideoSubtitle subtitleData = i().getSubtitleData();
        SubtitleItem mainSubtitle = i().getMainSubtitle();
        SubtitleItem subtitleItemB = Oi1.c.b(subtitleData, str);
        IPlayerSettingService iPlayerSettingService2 = this.f83760j;
        if (iPlayerSettingService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
            iPlayerSettingService2 = null;
        }
        iPlayerSettingService2.putBoolean("danmaku_subtitle_multi", true);
        i().loadSubtitle(mainSubtitle, subtitleItemB);
        IInteractLayerService.recordSelectedSubtitle$default(i(), false, true, false, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.C5885q.m():void");
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    public final void onRelease() {
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM;
    }
}
