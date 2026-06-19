package com.bilibili.search2;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.search2.main.BiliMainSearchActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/BiliMainSearchActivityForRouter.class */
@StabilityInferred(parameters = 0)
public final class BiliMainSearchActivityForRouter extends BiliMainSearchActivity {
    @Override // com.bilibili.search2.main.BiliMainSearchActivity, androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.search2.main.BiliMainSearchActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f86624G = true;
        S6().b(true);
        finish();
    }
}
