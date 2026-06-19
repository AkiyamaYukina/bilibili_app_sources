package com.bilibili.pegasus.fakepegasus;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.pegasus.utils.x;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.Nullable;
import u00.s;
import u00.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/FakeVideoDetailActivity.class */
@StabilityInferred(parameters = 0)
public final class FakeVideoDetailActivity extends BaseAppCompatActivity {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/FakeVideoDetailActivity$a.class */
    public static final class a extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FakeVideoDetailActivity f77443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FakeVideoDetailActivity fakeVideoDetailActivity, Lifecycle lifecycle) {
            super(lifecycle);
            this.f77443b = fakeVideoDetailActivity;
        }

        public final void a(boolean z6) {
            super.a(z6);
            FakeVideoDetailActivity fakeVideoDetailActivity = this.f77443b;
            if (x.a(fakeVideoDetailActivity)) {
                return;
            }
            fakeVideoDetailActivity.onBackPressed();
        }

        public final void b() {
            y yVar = (y) BLRouter.get$default(BLRouter.INSTANCE, y.class, (String) null, 2, (Object) null);
            if (yVar != null) {
                yVar.d(this);
            }
            String stringExtra = this.f77443b.getIntent().getStringExtra("jump_url");
            String str = stringExtra;
            if (stringExtra == null) {
                str = "";
            }
            BLRouter.routeTo$default(new RouteRequest.Builder(str).extras(new RX0.i(1)).overridePendingTransition(0, 0).build(), (Context) null, 2, (Object) null);
            e.a();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492911);
        Window window = getWindow();
        window.clearFlags(1024);
        if (NotchCompat.hasDisplayCutout(window)) {
            NotchCompat.resetDisplayCutout(window);
        }
        window.setBackgroundDrawable(null);
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(StatusBarCompat.setNavigationBarMode(this, window.getDecorView().getSystemUiVisibility() | 1280, MultipleThemeUtils.isNightTheme(this)));
        Lifecycle lifecycle = getLifecycle();
        ((Set) e.f77448a.getValue()).add(this);
        if (lifecycle != null) {
            lifecycle.addObserver(new d(this));
        }
        View viewFindViewById = findViewById(2131316323);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        layoutParams.height = StatusBarCompat.getStatusBarHeight(this);
        viewFindViewById.setLayoutParams(layoutParams);
        getSupportFragmentManager().beginTransaction().replace(2131298661, new FakeVideoDetailFragment()).commitAllowingStateLoss();
        String stringExtra = getIntent().getStringExtra(GameCardButton.extraAvid);
        String str = stringExtra;
        if (stringExtra == null) {
            str = "";
        }
        String stringExtra2 = getIntent().getStringExtra("card_pos");
        String str2 = stringExtra2 != null ? stringExtra2 : "";
        y yVarA = m.a();
        if (yVarA != null) {
            yVarA.b(MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("click_pos", "video_card"), TuplesKt.to(GameCardButton.extraAvid, str), TuplesKt.to("card_pos", str2)}));
        }
        y yVarA2 = m.a();
        if (yVarA2 != null) {
            yVarA2.a(this, "FAKE_VIDEO_DETAIL", new a(this, getLifecycle()));
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        StatusBarCompat.tintStatusBarForDrawer(this, ThemeUtils.getThemeAttrColor(this, 2130968986), 2);
    }
}
