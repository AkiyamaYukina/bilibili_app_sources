package com.bilibili.lib.spy.generated;

import Sf0.C2860a;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.performance.PerformanceConfigKey;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/spy/generated/a.class */
public class a extends AppCompatActivity {
    public a() {
        __combined___init_();
    }

    private void __combined___init_() {
        com_bilibili_infra_base_aop_BadParcelableExceptionAppCompatActivityOnCreateFix__init_();
        com_bilibili_lib_ui_life_MixinAppCompatActivity__init_();
        com_bilibili_lib_spy_generated_androidx_appcompat_app_AppCompatActivity__init_();
    }

    private void com_bilibili_infra_base_aop_BadParcelableExceptionAppCompatActivityOnCreateFix__init_() {
    }

    private void com_bilibili_infra_base_aop_BadParcelableExceptionAppCompatActivityOnCreateFix_onCreate(@Nullable Bundle bundle) {
        if (EntryPointKt.getBooleanValue(PerformanceConfigKey.LAUNCH_FIX_BAD_PARCELABLE)) {
            BLog.i("BadParcelableExceptionFix", "fix_bad_parcelable:onCreate");
            setBundleClassLoaderRecursively(bundle);
        }
        com_bilibili_lib_ui_life_MixinAppCompatActivity_onCreate(bundle);
    }

    private final void com_bilibili_infra_base_aop_BadParcelableExceptionAppCompatActivityOnCreateFix_setBundleClassLoaderRecursively(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(getClassLoader());
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            if (obj instanceof Bundle) {
                setBundleClassLoaderRecursively((Bundle) obj);
            }
        }
    }

    private void com_bilibili_lib_spy_generated_androidx_appcompat_app_AppCompatActivity__init_() {
    }

    private void com_bilibili_lib_ui_life_MixinAppCompatActivity__init_() {
    }

    private void com_bilibili_lib_ui_life_MixinAppCompatActivity_onCreate(@Nullable Bundle bundle) {
        C2860a.f22925a.c(this, bundle);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onCreate(Bundle bundle) {
        com_bilibili_infra_base_aop_BadParcelableExceptionAppCompatActivityOnCreateFix_onCreate(bundle);
    }

    @Override // lf0.ActivityC7846a
    public void setBundleClassLoaderRecursively(Bundle bundle) {
        com_bilibili_infra_base_aop_BadParcelableExceptionAppCompatActivityOnCreateFix_setBundleClassLoaderRecursively(bundle);
    }
}
