package com.bilibili.lib.ui;

import Wf0.C3039l;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import com.bilibili.droid.text.LimitTextSizeUtil;
import com.bilibili.lib.performance.EntryAwait;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import dagger.hilt.android.AndroidEntryPoint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/ComposeActivity.class */
@EntryAwait
@AndroidEntryPoint(AppCompatActivity.class)
public class ComposeActivity extends AbstractActivityC5354o {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f64734B = 0;

    public ComposeActivity() {
        getDelegate().setLocalNightMode(MultipleThemeUtils.getCurrentNightMode(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public final Resources getResources() {
        return LimitTextSizeUtil.INSTANCE.limitTextSize(super.getResources());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3039l.a(this, null, "ComposeActivity");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    @Override // com.bilibili.lib.ui.AbstractActivityC5354o, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.ComposeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        PermissionsChecker.onPermissionResult(i7, strArr, iArr);
    }
}
