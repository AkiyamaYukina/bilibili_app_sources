package com.bilibili.search2.main;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.tribe.core.internal.Hooks;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchActivityForInnerJump.class */
@StabilityInferred(parameters = 0)
public final class BiliMainSearchActivityForInnerJump extends BiliMainSearchActivity {
    @Override // com.bilibili.search2.main.BiliMainSearchActivity, androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }
}
