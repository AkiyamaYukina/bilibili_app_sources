package com.bilibili.teenagersmode.ui;

import Pi0.C2779a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.StringUtil;
import com.bilibili.lib.blrouter.RouteInterceptor;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.teenagersmode.TeenagersMode;
import com.bilibili.teenagersmode.c;
import com.bilibili.teenagersmode.utils.TeenagersRouter;
import org.jetbrains.annotations.NotNull;
import sD0.InterfaceC8578a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeActivity.class */
public class TeenagersModeActivity extends BaseToolbarActivity implements InterfaceC8578a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f110612G = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f110613D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f110614E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public FragmentManager f110615F;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/TeenagersModeActivity$a.class */
    public static final class a implements RouteInterceptor {
        @NotNull
        public final RouteResponse intercept(@NotNull RouteInterceptor.Chain chain) {
            String string = chain.getRequest().getTargetUri().toString();
            string.getClass();
            String strValueOf = !string.equals("bilibili://main/teenagersmode/close") ? !string.equals("bilibili://main/teenagersmode/intercept-page") ? null : String.valueOf(1) : String.valueOf(3);
            RouteRequest.Builder builderNewBuilder = chain.getRequest().newBuilder();
            if (StringUtil.isNotBlank(strValueOf)) {
                builderNewBuilder.extras(new Sa0.d(strValueOf, 4));
            }
            if (chain.getContext() instanceof Application) {
                builderNewBuilder.addFlag(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
            }
            return chain.next(builderNewBuilder.build());
        }
    }

    public static Intent Q6(Context context, int i7, @Nullable TeenagersRouter.SourceEvent sourceEvent) {
        Intent intent = new Intent(context, (Class<?>) TeenagersModeActivity.class);
        intent.putExtra("page_type", String.valueOf(i7));
        if (sourceEvent != null) {
            intent.putExtra("source_event", sourceEvent.getValue());
        }
        return intent;
    }

    @Override // sD0.InterfaceC8578a
    public final void G(Bundle bundle, String str, boolean z6) {
        Fragment fragmentInstantiate = Fragment.instantiate(this, str, bundle);
        if (!(fragmentInstantiate instanceof TeenagersModeInterceptFragment)) {
            showBackButton();
        }
        FragmentTransaction fragmentTransactionBeginTransaction = this.f110615F.beginTransaction();
        fragmentTransactionBeginTransaction.replace(2131299392, fragmentInstantiate, str);
        if (z6) {
            fragmentTransactionBeginTransaction.addToBackStack(str);
        }
        fragmentTransactionBeginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        int backStackEntryCount = this.f110615F.getBackStackEntryCount();
        if (backStackEntryCount >= 1 && TextUtils.equals(this.f110615F.getBackStackEntryAt(backStackEntryCount - 1).getName(), TeenagersModeStateFragment.class.getName())) {
            c.C1213c.f110575a.getClass();
            com.bilibili.teenagersmode.c.c(this, null);
        } else {
            if (this.f110613D == 1) {
                C2779a.a("main.teenagermodel.enter-detail.forbidden-page-continue.click", false);
            }
            super.onBackPressed();
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131500140);
        this.f110615F = getSupportFragmentManager();
        ensureToolbar();
        showBackButton();
        Bundle extras = getIntent().getExtras();
        this.f110613D = BundleUtil.getInteger(extras, "page_type", new Integer[]{0}).intValue();
        this.f110614E = BundleUtil.getInteger(extras, "source_event", new Integer[]{0}).intValue();
        int i7 = this.f110613D;
        if (i7 == 0) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("source_event", this.f110614E);
            if (TeenagersMode.getInstance().isEnable()) {
                bundle2.putInt("teenagers_mode_state", 1);
            } else {
                bundle2.putInt("teenagers_mode_state", 0);
            }
            G(bundle2, TeenagersModeStateFragment.class.getName(), false);
        } else if (i7 == 1) {
            G(null, TeenagersModeInterceptFragment.class.getName(), false);
        } else if (i7 == 2) {
            Bundle bundleB = B1.a.b(8, "state");
            if (TeenagersMode.getInstance().isForce()) {
                G(bundleB, TeenagersForceModeGuardianCertificationFragment.class.getName(), false);
            } else {
                G(bundleB, TeenagersModePwdFragment.class.getName(), false);
            }
        } else if (i7 == 3) {
            Bundle bundleB2 = B1.a.b(5, "state");
            bundleB2.putInt("source_event", this.f110614E);
            if (TeenagersMode.getInstance().isForce()) {
                G(bundleB2, TeenagersForceModeGuardianCertificationFragment.class.getName(), false);
            } else {
                G(bundleB2, TeenagersModePwdFragment.class.getName(), false);
            }
        } else if (i7 == 4) {
            G(B1.a.b(9, "state"), (TeenagersMode.getInstance().isForce() ? TeenagersForceModeGuardianCertificationFragment.class : TeenagersModePwdFragment.class).getName(), false);
        } else if (i7 == 5) {
            G(com.bilibili.biligame.router.k.a(11, BundleUtil.getInteger(extras, "age_set", new Integer[]{-1}).intValue(), "state", "age_set"), TeenagersModePwdFragment.class.getName(), false);
        }
        getToolbar().setNavigationOnClickListener(new h(0, this));
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setElevation(0.0f);
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void showBackButton() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (shouldTintIcon()) {
            ((TintToolbar) this.mToolbar).setIconTintColorWithGarb(GarbManager.getCurGarb().getFontColor());
        }
    }
}
