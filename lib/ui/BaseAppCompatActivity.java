package com.bilibili.lib.ui;

import android.app.ActivityManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import com.bilibili.droid.text.LimitTextSizeUtil;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.ui.brightness.BrightnessManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.spmid.SPMID;
import com.bilibili.spmid.SPMTrackNodeWrapper;
import java.util.HashMap;
import kotlin.Pair;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseAppCompatActivity.class */
public abstract class BaseAppCompatActivity extends com.bilibili.lib.spy.generated.a implements SPMTrackNodeWrapper {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f64709A = 0;
    public Tv0.a mCurrent;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f64711y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f64710x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f64712z = false;

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override // com.bilibili.spmid.SPMTrackNodeWrapper
    @Nullable
    public Pair<SPMID, HashMap<String, String>> fillTrackParams() {
        return new Pair<>(new SPMID(getClass().getName(), SPMID.Segment.First), (Object) null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resourcesLimitTextSize = LimitTextSizeUtil.INSTANCE.limitTextSize(super.getResources());
        Resources resourcesUpdateNightMode = resourcesLimitTextSize;
        if (!this.f64710x) {
            resourcesUpdateNightMode = ThemeUtils.updateNightMode(resourcesLimitTextSize, isNightTheme().booleanValue());
        }
        return resourcesUpdateNightMode;
    }

    public int getUserSceneTagId() {
        return -1;
    }

    public boolean isDestroyCalled() {
        return this.f64712z;
    }

    public boolean isFragmentStateSaved() {
        return this.f64711y;
    }

    public Boolean isNightTheme() {
        return Boolean.valueOf(MultipleThemeUtils.isNightTheme(getApplicationContext()));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean zPopBackStackImmediate;
        Contract contractAb = ConfigManager.ab();
        Boolean bool = Boolean.TRUE;
        if (contractAb.get("infra_super_onbackpressed", bool) == bool) {
            super.onBackPressed();
            return;
        }
        try {
            zPopBackStackImmediate = getSupportFragmentManager().popBackStackImmediate();
        } catch (IllegalStateException e7) {
            zPopBackStackImmediate = false;
        }
        if (zPopBackStackImmediate) {
            return;
        }
        supportFinishAfterTransition();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        if (!this.f64710x) {
            getDelegate().setLocalNightMode(MultipleThemeUtils.getCurrentNightMode(this));
        }
        super.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Tv0.a, java.lang.Object] */
    @Override // com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (AppBuildConfig.isHDApp() && Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(11);
        }
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_spm_refer");
        getWindow().getDecorView().getRootView().setTag(2131311980, this);
        this.mCurrent = new Object();
        defpackage.a.b("spmid is ", stringExtra, "SPMService");
        if (!this.f64710x) {
            getDelegate().setLocalNightMode(MultipleThemeUtils.getCurrentNightMode(this));
        }
        setTaskDescription();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f64712z = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onRequestPermissionsResult(int i7, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (PermissionsChecker.onPermissionResult(this, i7, strArr, iArr)) {
            PermissionRequestUtils.onRequestPermissionsResult(this, i7, strArr, iArr);
        } else {
            super.onRequestPermissionsResult(i7, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onResume() {
        super.onResume();
        BrightnessManager brightnessManager = BrightnessManager.INSTANCE;
        if (brightnessManager.getBrightnessEnable()) {
            brightnessManager.setAppBrightness(this);
        }
        if (com.bilibili.base.i.a) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(this) { // from class: com.bilibili.lib.ui.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BaseAppCompatActivity f64829a;

                {
                    this.f64829a = this;
                }

                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    BaseAppCompatActivity baseAppCompatActivity = this.f64829a;
                    int i7 = BaseAppCompatActivity.f64709A;
                    baseAppCompatActivity.getClass();
                    HandlerThreads.runOn(2, new TK0.a(baseAppCompatActivity, 1));
                    BiliImageLoader.INSTANCE.clearMemoryCaches();
                    HandlerThreads.postDelayed(2, new RunnableC5341b(baseAppCompatActivity), 4000L);
                    return false;
                }
            });
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f64711y = false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f64711y = true;
    }

    public void removeShade() {
        View viewFindViewWithTag;
        View decorView = getWindow().getDecorView();
        if (!(decorView instanceof ViewGroup) || (viewFindViewWithTag = decorView.findViewWithTag("shade_tag")) == null) {
            return;
        }
        ((ViewGroup) decorView).removeView(viewFindViewWithTag);
    }

    public void setDisableNightModeManipulation(boolean z6) {
        this.f64710x = z6;
    }

    public void setTaskDescription() {
        setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, ThemeUtils.getThemeAttrColor(this, 2130968986)));
    }
}
