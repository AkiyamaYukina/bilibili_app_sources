package com.bilibili.teenagersmode.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.magicasakura.widgets.TintProgressDialog;
import com.bilibili.teenagersmode.TeenagersMode;
import com.bilibili.teenagersmode.c;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagerModeFindPwdComposeView.class */
@StabilityInferred(parameters = 0)
public final class TeenagerModeFindPwdComposeView extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f110604b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TintProgressDialog f110605c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagerModeFindPwdComposeView$a.class */
    public static final class a implements Function1<ConstrainScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f110606a = new Object();

        public final Object invoke(Object obj) {
            ConstrainScope constrainScope = (ConstrainScope) obj;
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getTop(), constrainScope.getParent().getTop(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.DefaultImpls.m4198linkToVpY3zN4$default(constrainScope.getBottom(), constrainScope.getParent().getBottom(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.DefaultImpls.m4207linkToVpY3zN4$default(constrainScope.getEnd(), constrainScope.getParent().getEnd(), Dp.m3880constructorimpl(16), 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jf(float r12, final java.lang.String r13, final kotlin.jvm.functions.Function0<kotlin.Unit> r14, androidx.compose.runtime.Composer r15, final int r16, final int r17) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.teenagersmode.ui.TeenagerModeFindPwdComposeView.jf(float, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-411590884, true, new Function2(this) { // from class: com.bilibili.teenagersmode.ui.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TeenagerModeFindPwdComposeView f110663a;

            {
                this.f110663a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-411590884, iIntValue, -1, "com.bilibili.teenagersmode.ui.TeenagerModeFindPwdComposeView.onCreateView.<anonymous>.<anonymous> (TeenagerModeFindPwdComposeView.kt:74)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(1767649380, true, new com.bilibili.bplus.following.home.ui.m(this.f110663a, 1), composer, 54), composer, 384, 3);
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

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.setTitle("");
        }
        c.C1213c.f110575a.f110566l = false;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.setTitle(getString(2131855981));
            InputMethodManagerHelper.tryHideSoftInput(p3());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) throws JSONException {
        super.onViewCreated(view, bundle);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("teenager-mode", TeenagersMode.getInstance().isEnable() ? 1 : 0);
        Neurons.reportPageView(false, "main.find-back-pswd.0.0.pv", "", 0, 0L, O4.b.c("model", jSONObject.toString()), 0L, 0L);
        Bundle arguments = getArguments();
        this.f110604b = arguments != null ? arguments.getString("from", "") : null;
    }
}
