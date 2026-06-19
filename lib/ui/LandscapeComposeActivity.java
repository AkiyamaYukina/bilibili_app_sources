package com.bilibili.lib.ui;

import android.content.Context;
import com.bilibili.lib.performance.EntryAwait;
import com.bilibili.lib.tribe.core.internal.Hooks;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/LandscapeComposeActivity.class */
@EntryAwait
public final class LandscapeComposeActivity extends ComposeActivity {
    @Override // com.bilibili.lib.ui.ComposeActivity, androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }
}
