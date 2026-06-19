package com.bilibili.playerbizcommonv2.widget.subtitle;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget;
import com.bilibili.playerbizcommonv2.widget.setting.C5830b;
import com.bilibili.playerbizcommonv2.widget.subtitle.q0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/x0.class */
@StabilityInferred(parameters = 0)
public class x0 extends RightInsetWithShadowFunctionWidget {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InjectPlayerService
    public IControlContainerService f83808g;

    @InjectPlayerService
    public AbsFunctionWidgetService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InjectPlayerService
    public IInteractLayerService f83809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InjectPlayerService
    public IPlayerSettingService f83810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InjectPlayerService
    public IReporterService f83811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InjectPlayerService
    public com.bilibili.playerbizcommonv2.service.ai.a f83812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f83813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f83814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<C5830b> f83815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableIntState f83816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableState<String> f83817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Lazy f83818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f83819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableState<q0> f83820t;

    public x0(@NotNull Context context) {
        super(context);
        this.f83813m = SnapshotStateKt.mutableStateOf$default(context.getString(2131845417), null, 2, null);
        this.f83814n = SnapshotStateKt.mutableStateOf$default(context.getString(2131847180), null, 2, null);
        this.f83815o = SnapshotStateKt.mutableStateListOf();
        this.f83816p = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.f83817q = SnapshotStateKt.mutableStateOf$default(context.getString(2131855205), null, 2, null);
        this.f83818r = LazyKt.lazy(new com.bilibili.biligame.widget.dialog.D(this, 3));
        this.f83819s = LazyKt.lazy(new I9.d(this, 5));
        this.f83820t = SnapshotStateKt.mutableStateOf$default(q0.c.f83767a, null, 2, null);
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public final View contentView(@NotNull Context context) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2006978686, true, new r0(0, this, context)));
        return composeView;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, false);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    public final boolean getVerticalWrapContent() {
        return true;
    }

    @NotNull
    public final IInteractLayerService i() {
        IInteractLayerService iInteractLayerService = this.f83809i;
        if (iInteractLayerService != null) {
            return iInteractLayerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
        return null;
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    public final void onRelease() {
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        u0 u0Var;
        super.onWidgetShow(configuration);
        if (configuration instanceof v0) {
            v0 v0Var = (v0) configuration;
            q0 q0Var = v0Var.f83797a;
            MutableState<q0> mutableState = this.f83820t;
            mutableState.setValue(q0Var);
            q0.b bVar = q0.b.f83766a;
            q0 q0Var2 = v0Var.f83797a;
            if ((Intrinsics.areEqual(q0Var2, bVar) || Intrinsics.areEqual(q0Var2, q0.a.f83765a)) && (u0Var = v0Var.f83798b) != null) {
                SnapshotStateList<C5830b> snapshotStateList = this.f83815o;
                snapshotStateList.clear();
                snapshotStateList.addAll(u0Var.f83789a);
                this.f83816p.setIntValue(u0Var.f83790b);
                this.f83813m.setValue(u0Var.f83791c);
                this.f83814n.setValue(u0Var.f83792d);
            }
            ga.b.a(mutableState.getValue(), "onWidgetShow, displayMode: ", getTag());
        }
    }

    @Override // com.bilibili.playerbizcommonv2.widget.base.RightInsetWithShadowFunctionWidget
    @NotNull
    public RightInsetWithShadowFunctionWidget.ShadowSize shadowSize() {
        return RightInsetWithShadowFunctionWidget.ShadowSize.MEDIUM;
    }
}
