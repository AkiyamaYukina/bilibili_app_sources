package com.bilibili.playerbizcommonv2.widget.subtitle;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.AnnotatedString;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import com.bilibili.playerbizcommonv2.widget.subtitle.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/C.class */
@StabilityInferred(parameters = 0)
public final class C extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f83459g;

    @InjectPlayerService
    public AbsFunctionWidgetService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    public com.bilibili.playerbizcommonv2.service.ai.a f83460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    public IControlContainerService f83461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableState<AnnotatedString> f83462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableState<q0> f83463l;

    public C(@NotNull Context context) {
        super(context);
        this.f83459g = context;
        this.f83462k = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f83463l = SnapshotStateKt.mutableStateOf$default(q0.c.f83767a, null, 2, null);
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-157964214, true, new C5893z(this, 0)));
        return composeView;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.launchType(2);
        builder.dismissWhenActivityStop(true);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.changeOrientationDisableWhenShow(true);
        return builder.build();
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    public final boolean getVerticalWrapContent() {
        return true;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    public final void onRelease() {
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        if (configuration instanceof B) {
            B b7 = (B) configuration;
            this.f83462k.setValue(b7.f83455a);
            this.f83463l.setValue(b7.f83456b);
        }
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM;
    }
}
