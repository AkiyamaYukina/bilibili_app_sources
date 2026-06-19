package com.bilibili.pegasus.promo.setting;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.feed.PegasusStyle;
import com.bilibili.app.comm.list.common.feed.PegasusStyleEnum;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pvtracker.IPvTracker;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/RecommendColumnSettingFragment.class */
@StabilityInferred(parameters = 0)
public final class RecommendColumnSettingFragment extends BaseFragment implements IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f78542b = StateFlowKt.MutableStateFlow(new a(0));

    public static final void kf(RecommendColumnSettingFragment recommendColumnSettingFragment, PegasusStyleEnum pegasusStyleEnum) {
        a aVar = (a) recommendColumnSettingFragment.f78542b.getValue();
        if (aVar.f78550b && aVar.f78549a == pegasusStyleEnum) {
            return;
        }
        boolean z6 = false;
        boolean z7 = pegasusStyleEnum == PegasusStyleEnum.USER_SINGLE_COLUMN;
        Op0.g.a("homepage", z7 ? "2" : "1");
        Neurons.reportClick(false, "main.detail-setting-layout.layoutstyle.1.click", MapsKt.mapOf(TuplesKt.to("options", String.valueOf(z7 ? 1 : 2))));
        PegasusStyle.INSTANCE.setStyle(pegasusStyleEnum);
        ToastHelper.showToastShort(recommendColumnSettingFragment.getContext(), 2131845211);
        MutableStateFlow<a> mutableStateFlow = recommendColumnSettingFragment.f78542b;
        if (pegasusStyleEnum == PegasusStyleEnum.USER_DOUBLE_COLUMN) {
            z6 = true;
        }
        mutableStateFlow.setValue(new a(pegasusStyleEnum, aVar.f78550b, z6, aVar.f78552d));
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "main.column-setting.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jf(final java.lang.String r27, final boolean r28, boolean r29, final kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.promo.setting.RecommendColumnSettingFragment.jf(java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView;
        Context context = getContext();
        if (context != null) {
            composeView = new ComposeView(context, null, 0, 6, null);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1673405825, true, new Function2(this) { // from class: com.bilibili.pegasus.promo.setting.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final RecommendColumnSettingFragment f78561a;

                {
                    this.f78561a = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1673405825, iIntValue, -1, "com.bilibili.pegasus.promo.setting.RecommendColumnSettingFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (RecommendColumnSettingFragment.kt:72)");
                        }
                        BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(542716359, true, new Ap0.f(this.f78561a, 1), composer, 54), composer, 384, 3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }));
        } else {
            composeView = null;
        }
        return composeView;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            RecommendColumnSwitchData recommendColumnSwitchData = ((a) this.f78542b.getValue()).f78552d;
            String title = recommendColumnSwitchData != null ? recommendColumnSwitchData.getTitle() : null;
            if (title == null || StringsKt.isBlank(title)) {
                title = null;
            }
            if (title == null) {
                Context context = getContext();
                title = null;
                if (context != null) {
                    Resources resources = context.getResources();
                    title = null;
                    if (resources != null) {
                        title = resources.getString(2131845385);
                    }
                }
                if (title == null) {
                    title = "首页单双列切换";
                }
            }
            fragmentActivityP3.setTitle(title);
        }
    }
}
