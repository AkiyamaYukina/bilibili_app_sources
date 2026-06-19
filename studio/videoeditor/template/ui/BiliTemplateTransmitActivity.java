package com.bilibili.studio.videoeditor.template.ui;

import android.content.Context;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/ui/BiliTemplateTransmitActivity.class */
public final class BiliTemplateTransmitActivity extends BaseAppCompatActivity {
    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008d  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r13, int r14, @org.jetbrains.annotations.Nullable android.content.Intent r15) {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.ui.BiliTemplateTransmitActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.template.ui.BiliTemplateTransmitActivity.onCreate(android.os.Bundle):void");
    }
}
