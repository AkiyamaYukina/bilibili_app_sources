package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallMediaPreviewActivity.class */
@StabilityInferred(parameters = 0)
public class MallMediaPreviewActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f73831B = 0;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(2131499021);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        MallMediaPreviewFragment.Companion.getClass();
        MallMediaPreviewFragment mallMediaPreviewFragment = new MallMediaPreviewFragment();
        mallMediaPreviewFragment.setArguments(extras);
        getSupportFragmentManager().beginTransaction().add(2131301680, mallMediaPreviewFragment).commitAllowingStateLoss();
    }
}
