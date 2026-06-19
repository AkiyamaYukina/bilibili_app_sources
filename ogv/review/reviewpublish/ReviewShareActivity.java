package com.bilibili.ogv.review.reviewpublish;

import android.content.Context;
import android.os.Bundle;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.ogv.pub.review.bean.ReviewShareData;
import com.bilibili.ogv.review.reviewpublish.ReviewShareFragment;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareActivity.class */
public class ReviewShareActivity extends BaseToolbarActivity {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f72460F = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ReviewShareData f72461D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f72462E = false;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131499781);
        getToolbar().setVisibility(8);
        getWindow().getDecorView().setSystemUiVisibility(4);
        Bundle bundleExtra = getIntent().getBundleExtra("default_extra_bundle");
        if (bundleExtra != null) {
            this.f72461D = (ReviewShareData) bundleExtra.getParcelable("REVIEW_SHARE_DATA");
            this.f72462E = bundleExtra.getBoolean("is_newly_published_review", false);
        }
        ReviewShareData reviewShareData = this.f72461D;
        if (reviewShareData != null) {
            ReviewShareFragment.a aVar = ReviewShareFragment.f72464p;
            boolean z6 = this.f72462E;
            aVar.getClass();
            ReviewShareFragment reviewShareFragment = new ReviewShareFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("data", reviewShareData);
            bundle2.putString("page_name", null);
            bundle2.putBoolean("is_newly_published_review", z6);
            bundle2.putBoolean("should_show_background", true);
            reviewShareFragment.setArguments(bundle2);
            reviewShareFragment.f72475l = new E90.c(this, 6);
            getSupportFragmentManager().beginTransaction().add(2131298614, reviewShareFragment).commit();
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity
    public final void tintSystemBar() {
        StatusBarCompat.immersiveStatusBar(this);
        StatusBarCompat.setHeightAndPadding(this, getToolbar());
    }
}
