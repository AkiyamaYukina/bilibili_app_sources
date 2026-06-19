package com.bilibili.lib.ui;

import android.content.Context;
import com.bilibili.lib.tribe.core.internal.Hooks;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BehindGeneralActivity.class */
public final class BehindGeneralActivity extends GeneralActivity {
    @Override // com.bilibili.lib.ui.GeneralActivity, androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }
}
