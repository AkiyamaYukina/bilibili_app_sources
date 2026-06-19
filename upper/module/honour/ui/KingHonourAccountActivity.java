package com.bilibili.upper.module.honour.ui;

import GO.q;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import dI0.InterfaceC6794b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourAccountActivity.class */
@StabilityInferred(parameters = 0)
public final class KingHonourAccountActivity extends BaseAppCompatActivity implements View.OnClickListener, InterfaceC6794b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final String f113212B = "HonourAccountActivity";

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131315807) {
            finish();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        q.a(this, 2131104159);
        super.onCreate(bundle);
        setContentView(2131500628);
        ImageView imageView = (ImageView) findViewById(2131315807);
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackView");
            imageView2 = null;
        }
        imageView2.setOnClickListener(this);
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        if (bundleExtra != null) {
            try {
                FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                KingHonourAccountFragment kingHonourAccountFragment = new KingHonourAccountFragment();
                kingHonourAccountFragment.setArguments(bundleExtra);
                fragmentTransactionBeginTransaction.add(2131315789, kingHonourAccountFragment).commit();
            } catch (Exception e7) {
                BLog.e(this.f113212B, e7);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
