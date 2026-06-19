package com.bilibili.lib.ui.permission;

import AP.f;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/permission/PermissionSettingActivity.class */
public final class PermissionSettingActivity extends BaseToolbarActivity {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f64911D = 0;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131494715);
        getSupportFragmentManager();
        ensureToolbar();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setTitle(getString(2131832525));
        }
        showBackButton();
        getSupportFragmentManager().beginTransaction().add(2131299392, new PermissionManageFragment(), "PermissionSettingFragment").commitAllowingStateLoss();
        getToolbar().setNavigationOnClickListener(new f(this, 2));
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setElevation(0.0f);
        }
    }
}
