package com.bilibili.opd.app.bizcommon.mallcommon.arentrance.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mallcommon/arentrance/fragment/AREntranceActivity.class */
@StabilityInferred(parameters = 0)
public final class AREntranceActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public AREntranceFragment f73983B;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        AREntranceFragment aREntranceFragment;
        super.onActivityResult(i7, i8, intent);
        if (i7 != 103 || (aREntranceFragment = this.f73983B) == null) {
            return;
        }
        aREntranceFragment.onActivityResult(i7, i8, intent);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131499184);
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(2131296820);
        this.f73983B = fragmentFindFragmentById instanceof AREntranceFragment ? (AREntranceFragment) fragmentFindFragmentById : null;
    }
}
