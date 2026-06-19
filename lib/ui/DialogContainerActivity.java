package com.bilibili.lib.ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bilibili.droid.text.LimitTextSizeUtil;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/DialogContainerActivity.class */
@AndroidEntryPoint(AppCompatActivity.class)
public final class DialogContainerActivity extends q {
    public DialogContainerActivity() {
        getDelegate().setLocalNightMode(MultipleThemeUtils.getCurrentNightMode(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public final Resources getResources() {
        return LimitTextSizeUtil.INSTANCE.limitTextSize(super.getResources());
    }

    @Override // com.bilibili.lib.ui.q, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getSupportFragmentManager().findFragmentById(R.id.content) == null) {
            String stringExtra = getIntent().getStringExtra("fragment");
            if (stringExtra == null || !(!StringsKt.isBlank(stringExtra))) {
                throw new IllegalArgumentException("The specified Fragment class name is empty!");
            }
            Fragment fragmentInstantiate = getSupportFragmentManager().getFragmentFactory().instantiate(getClassLoader(), stringExtra);
            Bundle extras = getIntent().getExtras();
            fragmentInstantiate.setArguments(extras != null ? extras.getBundle("fragment_args") : null);
            if (!(fragmentInstantiate instanceof DialogFragment)) {
                getSupportFragmentManager().beginTransaction().add(R.id.content, fragmentInstantiate).commit();
            } else {
                ((DialogFragment) fragmentInstantiate).show(getSupportFragmentManager(), "DialogContainerActivity");
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        PermissionsChecker.onPermissionResult(i7, strArr, iArr);
    }
}
