package com.bilibili.topix.compose.create;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.droid.text.LimitTextSizeUtil;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/CreateTopicActivity.class */
@StabilityInferred(parameters = 0)
public final class CreateTopicActivity extends com.bilibili.lib.spy.generated.a {
    public CreateTopicActivity() {
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

    @Override // com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        StatusBarCompat.tintStatusBar(this, getResources().getColor(2131103990));
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        setContentView(2131500538);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        CreateTopicComposeFragment createTopicComposeFragment = new CreateTopicComposeFragment();
        Intent intent = getIntent();
        createTopicComposeFragment.setArguments(intent != null ? intent.getExtras() : null);
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.replace(2131313816, createTopicComposeFragment);
        fragmentTransactionBeginTransaction.commit();
    }
}
