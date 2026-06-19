package com.bilibili.module.vip.router;

import Gh0.C1976b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/router/VipProxyActivity.class */
public class VipProxyActivity extends BaseToolbarActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i7 == 1001 && i8 == -1) {
            C1976b.a(this, "https://big.bilibili.com/mobile/home");
        }
        finish();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!BiliAccounts.get(this).isLogin()) {
            BLRouter.routeTo(new RouteRequest.Builder("activity://main/login/").requestCode(1001).build(), this);
        } else {
            C1976b.a(this, "https://big.bilibili.com/mobile/home");
            finish();
        }
    }
}
