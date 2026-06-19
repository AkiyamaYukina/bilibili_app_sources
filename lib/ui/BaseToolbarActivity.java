package com.bilibili.lib.ui;

import android.R;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseToolbarActivity.class */
public abstract class BaseToolbarActivity extends BaseAppCompatActivity implements GarbWatcher.Observer {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f64727C = {R.attr.windowActionBar};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f64728B;
    protected Toolbar mToolbar;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/BaseToolbarActivity$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseToolbarActivity f64729a;

        public a(BaseToolbarActivity baseToolbarActivity) {
            this.f64729a = baseToolbarActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.f64729a.isFragmentStateSaved()) {
                return;
            }
            this.f64729a.onBackPressed();
        }
    }

    public final void P6(Garb garb) {
        if (shouldTintIcon()) {
            ((TintToolbar) this.mToolbar).setIconTintColorWithGarb(garb.getFontColor());
            MultipleThemeUtils.refreshMenuIconTint(this, this.mToolbar, garb.isPure() ? 0 : garb.getFontColor());
        }
        if (shouldTintTitle()) {
            if (garb.isPrimaryOnly()) {
                ((TintToolbar) this.mToolbar).setTitleColorWithGarb(ThemeUtils.getColorById(this, 2131103914));
            } else {
                ((TintToolbar) this.mToolbar).setTitleColorWithGarb(garb.getFontColor());
            }
        }
        if (shouldTintIcon() && shouldTintBackground()) {
            ((TintToolbar) this.mToolbar).setBackgroundColorWithGarb(garb.getSecondaryPageColor());
        }
    }

    public void ensureToolbar() {
        if (this.mToolbar == null) {
            View viewFindViewById = findViewById(2131304944);
            View viewA = viewFindViewById;
            if (viewFindViewById == null) {
                viewA = P.a((ViewGroup) findViewById(R.id.content), Toolbar.class);
            }
            if (viewA == null) {
                this.mToolbar = (Toolbar) getLayoutInflater().inflate(2131494540, (ViewGroup) findViewById(R.id.content)).findViewById(2131304944);
            } else {
                this.mToolbar = (Toolbar) viewA;
            }
            this.mToolbar.setContentInsetsAbsolute(0, 0);
            setSupportActionBar(this.mToolbar);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public ActionBar getSupportActionBar() {
        if (!this.f64728B) {
            ensureToolbar();
        }
        return super.getSupportActionBar();
    }

    public Toolbar getToolbar() {
        ensureToolbar();
        return this.mToolbar;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(f64727C);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f64728B = z6;
        if (z6) {
            Log.e("BaseToolbarActivity", "The theme you applied seems will have a WindowDecorActionBar! set attribute 'windowActionBar' to false in your theme!");
        }
        typedArrayObtainStyledAttributes.recycle();
        GarbWatcher.INSTANCE.subscribe(this);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public void onDestroy() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(null);
            this.mToolbar = null;
        }
        GarbWatcher.INSTANCE.unSubscribe(this);
        super.onDestroy();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        tintSystemBar();
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure()) {
            return;
        }
        P6(curGarb);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (shouldTintIcon()) {
            Garb curGarb = GarbManager.getCurGarb();
            MultipleThemeUtils.refreshMenuIconTint(this, this.mToolbar, curGarb.isPure() ? 0 : curGarb.getFontColor());
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public void onSkinChange(@NotNull Garb garb) {
        if (!garb.isPure()) {
            tintSystemBar();
            P6(garb);
            return;
        }
        tintSystemBar();
        if (shouldTintIcon()) {
            ((TintToolbar) this.mToolbar).setIconTintColorResource(2131103911);
            MultipleThemeUtils.refreshMenuIconTint(this, this.mToolbar, 0);
        }
        if (shouldTintTitle()) {
            ((TintToolbar) this.mToolbar).setTitleTintColorResource(2131103914);
        }
        if (shouldTintIcon() && shouldTintBackground()) {
            ((TintToolbar) this.mToolbar).setBackgroundResource(2131103971);
        }
    }

    public boolean shouldTintBackground() {
        return true;
    }

    public boolean shouldTintIcon() {
        Toolbar toolbar = this.mToolbar;
        return (toolbar instanceof TintToolbar) && ((TintToolbar) toolbar).hasIconTint();
    }

    public boolean shouldTintTitle() {
        Toolbar toolbar = this.mToolbar;
        return (toolbar instanceof TintToolbar) && ((TintToolbar) toolbar).hasTitleTint();
    }

    public void showBackButton() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.mToolbar.setNavigationOnClickListener(new a(this));
    }

    public void tintSystemBar() {
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isPure() || curGarb.isPrimaryOnly()) {
            StatusBarCompat.tintStatusBar(this, ThemeUtils.getThemeAttrColor(this, 2130968986));
        } else {
            StatusBarCompat.tintStatusBar(this, curGarb.getSecondaryPageColor(), curGarb.isDarkMode() ? 1 : 2);
        }
    }
}
