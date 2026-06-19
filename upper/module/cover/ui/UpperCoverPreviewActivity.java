package com.bilibili.upper.module.cover.ui;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.bplus.followingpublish.fragments.V;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover/ui/UpperCoverPreviewActivity.class */
@StabilityInferred(parameters = 0)
public final class UpperCoverPreviewActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f112723H = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ImageView f112724B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TabLayout f112725C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ViewPager f112726D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f112727E = true;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public String f112728F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public String f112729G;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131502800);
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        if (bundleExtra != null) {
            this.f112727E = bundleExtra.getBoolean("key_show_main_cover", true);
            this.f112728F = bundleExtra.getString("key_main_cover_path");
            this.f112729G = bundleExtra.getString("key_sub_cover_path");
        }
        this.f112724B = (ImageView) findViewById(2131302458);
        this.f112725C = findViewById(2131317080);
        this.f112726D = (ViewPager) findViewById(2131312992);
        ImageView imageView = this.f112724B;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvBack");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new V(this, 2));
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new String[]{getString(2131857606), getString(2131857607)});
        ViewPager viewPager = this.f112726D;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVpContent");
            viewPager2 = null;
        }
        viewPager2.setAdapter(new m(arrayListArrayListOf, this, getSupportFragmentManager()));
        TabLayout tabLayout = this.f112725C;
        TabLayout tabLayout2 = tabLayout;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabIndicator");
            tabLayout2 = null;
        }
        ViewPager viewPager3 = this.f112726D;
        ViewPager viewPager4 = viewPager3;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVpContent");
            viewPager4 = null;
        }
        tabLayout2.setupWithViewPager(viewPager4);
        ViewPager viewPager5 = this.f112726D;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVpContent");
            viewPager5 = null;
        }
        viewPager5.setCurrentItem(!this.f112727E ? 1 : 0);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure() || curGarb.isPrimaryOnly()) {
            StatusBarCompat.tintStatusBar(this, ThemeUtils.getThemeAttrColor(this, 2130968986));
        } else {
            StatusBarCompat.tintStatusBar(this, curGarb.getSecondaryPageColor(), curGarb.isDarkMode() ? 1 : 2);
        }
        ImageView imageView = this.f112724B;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImvBack");
            imageView2 = null;
        }
        imageView2.setColorFilter(ContextCompat.getColor(this, R$color.Ga7));
    }
}
