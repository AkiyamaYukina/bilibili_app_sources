package com.bilibili.lib.ui;

import WQ.a3;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.lib.ui.util.StatusBarCompat;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/TransparentContainerActivity.class */
@AndroidEntryPoint(BaseAppCompatActivity.class)
public final class TransparentContainerActivity extends u {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f64825I = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final LinkedList<Fragment> f64826F = new LinkedList<>();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final Lazy f64827G = LazyKt.lazy(new a3(this, 4));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final Lazy f64828H = LazyKt.lazy(new ZF0.i(this, 4));

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        Pair pairA = M.a(((Number) this.f64828H.getValue()).intValue());
        overridePendingTransition(((Number) pairA.getFirst()).intValue(), ((Number) pairA.getSecond()).intValue());
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = (Fragment) this.f64826F.peek();
        if (activityResultCaller == null) {
            super.onBackPressed();
        } else {
            if ((activityResultCaller instanceof IBackPress) && ((IBackPress) activityResultCaller).onBackPressed()) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.bilibili.lib.ui.u, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT == 26) {
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                ActivityInfo activityInfo = obj instanceof ActivityInfo ? (ActivityInfo) obj : null;
                if (activityInfo != null) {
                    activityInfo.screenOrientation = -1;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        super.onCreate(bundle);
        Pair pairA = M.a(((Number) this.f64828H.getValue()).intValue());
        overridePendingTransition(((Number) pairA.getFirst()).intValue(), ((Number) pairA.getSecond()).intValue());
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        Fragment fragmentInstantiate = fragmentFindFragmentById;
        if (fragmentFindFragmentById == null) {
            String stringExtra = getIntent().getStringExtra("fragment");
            if (TextUtils.isEmpty(stringExtra)) {
                throw new NullPointerException("The specified Fragment class name is empty!");
            }
            fragmentInstantiate = Fragment.instantiate(this, stringExtra, (Bundle) this.f64827G.getValue());
            getSupportFragmentManager().beginTransaction().add(R.id.content, fragmentInstantiate).commit();
        }
        LinkedList<Fragment> linkedList = this.f64826F;
        linkedList.clear();
        linkedList.push(fragmentInstantiate);
        StatusBarCompat.tintStatusBar(getWindow(), getResources().getColor(R.color.transparent));
    }

    @Override // com.bilibili.lib.ui.u, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        this.f64826F.clear();
        super.onDestroy();
    }
}
