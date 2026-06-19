package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.screen.adjust.widget.ScreenAdjustMenuItemData;
import com.bilibili.lib.ui.menu.IFloatMenuItem;
import com.bilibili.lib.ui.menu.NormalMenuItem;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/K0.class */
@StabilityInferred(parameters = 0)
public final class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Activity f101021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f101022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<IFloatMenuItem> f101023c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<ScreenAdjustMenuItemData> f101024d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f101025e = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    @Inject
    public K0(@NotNull Activity activity, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f101021a = activity;
        this.f101022b = aVar;
    }

    public final void a(@NotNull String str, @NotNull Function0<Unit> function0) {
        this.f101023c.add(new NormalMenuItem(str, new W60.X(function0)));
        this.f101024d.add(new ScreenAdjustMenuItemData.Normal(str, 0, false, new com.bilibili.playerbizcommonv2.danmaku.feedback.q(1, function0, this), 6, (DefaultConstructorMarker) null));
    }
}
