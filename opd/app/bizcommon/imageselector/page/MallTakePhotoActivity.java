package com.bilibili.opd.app.bizcommon.imageselector.page;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/MallTakePhotoActivity.class */
@StabilityInferred(parameters = 0)
public final class MallTakePhotoActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f73867C = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final MallMediaTakePhotoFragment f73868B = new MallMediaTakePhotoFragment();

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131499024);
        Bundle extras = getIntent().getExtras();
        MallMediaTakePhotoFragment mallMediaTakePhotoFragment = this.f73868B;
        mallMediaTakePhotoFragment.setArguments(extras);
        getSupportFragmentManager().beginTransaction().add(2131306546, mallMediaTakePhotoFragment).commit();
    }
}
