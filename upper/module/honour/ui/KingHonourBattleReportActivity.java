package com.bilibili.upper.module.honour.ui;

import GO.q;
import OC0.h;
import TE0.b;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.studio.editor.timeline.UpperEngineScene;
import com.bilibili.studio.editor.timeline.k;
import com.bilibili.studio.videoeditor.exception.FileNotExistedError;
import com.google.android.material.tabs.TabLayout;
import dI0.C6800h;
import dI0.C6801i;
import eI0.C6921b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourBattleReportActivity.class */
@StabilityInferred(parameters = 0)
public final class KingHonourBattleReportActivity extends BaseAppCompatActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ImageView f113244B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TabLayout f113245C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f113246D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ViewPager f113247E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f113248F = true;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f113249G;

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
        } else if (numValueOf != null && numValueOf.intValue() == 2131315808) {
            new C6921b(this, null, false).show();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        View decorView;
        q.a(this, 2131104160);
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(4102);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, 2131104160)));
        }
        try {
            k.a.f108315a.e(this, UpperEngineScene.KING_HONOUR, null);
        } catch (FileNotExistedError | NullPointerException | UnsatisfiedLinkError e7) {
        }
        setContentView(2131500629);
        ImageView imageView = (ImageView) findViewById(2131315808);
        this.f113244B = imageView;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHelpView");
            imageView2 = null;
        }
        imageView2.setVisibility(0);
        this.f113246D = (ImageView) findViewById(2131315807);
        this.f113245C = findViewById(2131315844);
        this.f113247E = (ViewPager) findViewById(2131315853);
        h.x(this);
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        if (bundleExtra != null) {
            this.f113248F = bundleExtra.getBoolean("king_honour_user_is_grant", true);
            this.f113249G = bundleExtra.getBoolean("king_honour_is_from_game_factory", false);
        }
        String string = getString(2131851203);
        String string2 = getString(2131851244);
        TabLayout tabLayout = this.f113245C;
        TabLayout tabLayout2 = tabLayout;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleLayout");
            tabLayout2 = null;
        }
        TabLayout tabLayout3 = this.f113245C;
        TabLayout tabLayout4 = tabLayout3;
        if (tabLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleLayout");
            tabLayout4 = null;
        }
        tabLayout2.addTab(tabLayout4.newTab().setText(2131851203));
        TabLayout tabLayout5 = this.f113245C;
        TabLayout tabLayout6 = tabLayout5;
        if (tabLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleLayout");
            tabLayout6 = null;
        }
        TabLayout tabLayout7 = this.f113245C;
        TabLayout tabLayout8 = tabLayout7;
        if (tabLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleLayout");
            tabLayout8 = null;
        }
        tabLayout6.addTab(tabLayout8.newTab().setText(2131851244));
        TabLayout tabLayout9 = this.f113245C;
        TabLayout tabLayout10 = tabLayout9;
        if (tabLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleLayout");
            tabLayout10 = null;
        }
        ViewPager viewPager = this.f113247E;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager2 = null;
        }
        tabLayout10.setupWithViewPager(viewPager2);
        ViewPager viewPager3 = this.f113247E;
        ViewPager viewPager4 = viewPager3;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager4 = null;
        }
        viewPager4.setAdapter(new C6800h(new String[]{string, string2}, this, getSupportFragmentManager()));
        ImageView imageView3 = this.f113246D;
        ImageView imageView4 = imageView3;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBackView");
            imageView4 = null;
        }
        imageView4.setOnClickListener(this);
        ImageView imageView5 = this.f113244B;
        ImageView imageView6 = imageView5;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHelpView");
            imageView6 = null;
        }
        imageView6.setOnClickListener(this);
        TabLayout tabLayout11 = this.f113245C;
        if (tabLayout11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleLayout");
            tabLayout11 = null;
        }
        tabLayout11.addOnTabSelectedListener(new C6801i(this));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        b bVar = b.f24088a;
        boolean z6 = this.f113249G;
        bVar.getClass();
        b.h0(z6);
    }
}
