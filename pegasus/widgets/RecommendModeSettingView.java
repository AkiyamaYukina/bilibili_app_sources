package com.bilibili.pegasus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.recommendmode.RecommendMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/RecommendModeSettingView.class */
@StabilityInferred(parameters = 0)
public final class RecommendModeSettingView extends TintLinearLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79190e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<p> f79191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f79192d;

    @JvmOverloads
    public RecommendModeSettingView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public RecommendModeSettingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.pegasus.widgets.j] */
    public RecommendModeSettingView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f79191c = StateFlowKt.MutableStateFlow(new p((String) null, false, (q) null, (q) null, 31));
        this.f79192d = new PassportObserver(this) { // from class: com.bilibili.pegasus.widgets.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecommendModeSettingView f79244a;

            {
                this.f79244a = this;
            }

            public final void onChange(Topic topic) {
                int i9 = RecommendModeSettingView.f79190e;
                if (topic == Topic.SIGN_IN) {
                    RecommendModeSettingView recommendModeSettingView = this.f79244a;
                    if (((p) recommendModeSettingView.f79191c.getValue()).f79260c) {
                        recommendModeSettingView.d(true);
                    }
                }
            }
        };
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(545729448, true, new com.bilibili.biligame.ui.pointmall.address.dialog.f(this, 1)));
        addView(composeView);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final com.bilibili.pegasus.widgets.q r27, final boolean r28, final boolean r29, final kotlin.jvm.functions.Function0 r30, androidx.compose.runtime.Composer r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.widgets.RecommendModeSettingView.c(com.bilibili.pegasus.widgets.q, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public final void d(boolean z6) {
        if (z6 == ((p) this.f79191c.getValue()).f79259b) {
            return;
        }
        int i7 = z6 ? 2 : 1;
        Neurons.reportClick(false, "main.detail-setting-layout.type-of-recommend.2.click", MapsKt.mapOf(TuplesKt.to("options", String.valueOf(i7))));
        Op0.g.a("recommend", String.valueOf(i7));
        if (BiliAccounts.get(getContext()).isLogin() || !z6) {
            Lh.n.i(i7);
            MutableStateFlow<p> mutableStateFlow = this.f79191c;
            mutableStateFlow.setValue(p.a((p) mutableStateFlow.getValue(), z6, false, 25));
        } else {
            Qp0.c.b(null);
            MutableStateFlow<p> mutableStateFlow2 = this.f79191c;
            mutableStateFlow2.setValue(p.a((p) mutableStateFlow2.getValue(), false, true, 27));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BiliAccounts.get(getContext()).subscribe(this.f79192d, new Topic[]{Topic.SIGN_IN});
        Map mapA = Lh.n.a();
        boolean zF = Lh.n.f();
        String string = getResources().getString(2131845197);
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapA;
        String str = (String) linkedHashMap.get("recommend_pegasus_settint_key_title_normal");
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        String string2 = RecommendMode.isRecommendModeEnable() ? (String) linkedHashMap.get("recommend_pegasus_settint_key_desc_normal") : getResources().getString(2131845379);
        String str3 = string2;
        if (string2 == null) {
            str3 = "";
        }
        q qVar = new q(str2, str3, 4);
        String str4 = (String) linkedHashMap.get("recommend_pegasus_settint_key_title_follow");
        String str5 = str4;
        if (str4 == null) {
            str5 = "";
        }
        String str6 = (String) linkedHashMap.get("recommend_pegasus_settint_key_desc_follow");
        if (str6 == null) {
            str6 = "";
        }
        this.f79191c.setValue(new p(string, zF, qVar, new q(str5, str6, 4), 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BiliAccounts.get(getContext()).unsubscribe(this.f79192d, new Topic[0]);
    }
}
