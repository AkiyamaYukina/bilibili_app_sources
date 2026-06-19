package com.bilibili.opd.app.bizcommon.context;

import android.R;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.mobile.BLMobileHumanActionNative;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/KFCToolbarFragment.class */
public abstract class KFCToolbarFragment extends KFCFragment {
    public static final String ATTACH_ACTIVITY_MUST_BE_BASE_APP_COMPAT_ACTIVITY = "attach activity must be BaseAppCompatActivity";
    private static final String TAG = "kfc_BaseToolbarFrag";
    private static final int[] themeAttrs = {R.attr.windowActionBar};
    private boolean mHasActionBar;
    private boolean mStatusBarSetUp;
    protected TextView mTitleTextView;
    private boolean mToolBarSetUp;
    protected Toolbar mToolbar;
    private StatusBarMode mStatusBarMode = StatusBarMode.TINT;
    private boolean mHandleStatusBarFlag = true;
    private boolean mAdjustToolBarPaddingForImmersive = true;
    private boolean mShowBackButton = false;
    protected boolean mAutoGenerateToolbar = true;
    private CharSequence mTitle = "";
    private boolean mTintStatusBarAvailable = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/KFCToolbarFragment$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KFCToolbarFragment f73521a;

        public a(KFCToolbarFragment kFCToolbarFragment) {
            this.f73521a = kFCToolbarFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (this.f73521a.p3() == null || ((BaseAppCompatActivity) this.f73521a.p3()).isFragmentStateSaved()) {
                return;
            }
            this.f73521a.onBackPressed();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/KFCToolbarFragment$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f73522a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.opd.app.bizcommon.context.StatusBarMode[] r0 = com.bilibili.opd.app.bizcommon.context.StatusBarMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment.b.f73522a = r0
                r0 = r4
                com.bilibili.opd.app.bizcommon.context.StatusBarMode r1 = com.bilibili.opd.app.bizcommon.context.StatusBarMode.TINT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment.b.f73522a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                com.bilibili.opd.app.bizcommon.context.StatusBarMode r1 = com.bilibili.opd.app.bizcommon.context.StatusBarMode.IMMERSIVE     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment.b.f73522a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                com.bilibili.opd.app.bizcommon.context.StatusBarMode r1 = com.bilibili.opd.app.bizcommon.context.StatusBarMode.IMMERSIVE_FULL_TRANSPARENT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment.b.m7801clinit():void");
        }
    }

    @NotNull
    private View generateToolbar(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(2131499590, viewGroup, false);
        Toolbar toolbar = (Toolbar) viewGroup2.findViewById(2131304944);
        this.mToolbar = toolbar;
        toolbar.setContentInsetsAbsolute(0, 0);
        layoutInflater.inflate(2131499591, this.mToolbar);
        this.mTitleTextView = (TextView) this.mToolbar.findViewById(2131311356);
        View viewOnCreateContentView = onCreateContentView(layoutInflater, viewGroup2, bundle);
        if (viewOnCreateContentView.getParent() == null) {
            viewGroup2.addView(viewOnCreateContentView, 0);
        }
        viewOnCreateContentView.setPadding(viewOnCreateContentView.getPaddingLeft(), viewOnCreateContentView.getPaddingTop() + this.mToolbar.getLayoutParams().height, viewOnCreateContentView.getPaddingRight(), viewOnCreateContentView.getPaddingBottom());
        if (AppCompatActivity.class.isInstance(p3())) {
            ((AppCompatActivity) p3()).setSupportActionBar(this.mToolbar);
        }
        if (!TextUtils.isEmpty(this.mTitle)) {
            this.mTitleTextView.setText(this.mTitle);
        }
        return viewGroup2;
    }

    private void hideBackButtonInternal() {
        if (activityDie()) {
            return;
        }
        if (!BaseAppCompatActivity.class.isInstance(p3())) {
            throw new RuntimeException(ATTACH_ACTIVITY_MUST_BE_BASE_APP_COMPAT_ACTIVITY);
        }
        ActionBar supportActionBar = ((AppCompatActivity) p3()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        Toolbar toolbar = this.mToolbar;
        if (toolbar == null) {
            return;
        }
        toolbar.setNavigationOnClickListener(null);
    }

    private void showBackButtonInternal() {
        if (activityDie()) {
            return;
        }
        if (!BaseAppCompatActivity.class.isInstance(p3())) {
            throw new RuntimeException(ATTACH_ACTIVITY_MUST_BE_BASE_APP_COMPAT_ACTIVITY);
        }
        ActionBar supportActionBar = ((AppCompatActivity) p3()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        Toolbar toolbar = this.mToolbar;
        if (toolbar == null) {
            return;
        }
        toolbar.setNavigationOnClickListener(new a(this));
    }

    public TextView getTitleTextView() {
        if (this.mToolbar != null) {
            return this.mTitleTextView;
        }
        throw new RuntimeException("Can not get a TitleTextView,setAutoGenerateToolbar(true) or gave a TextView id == R.id.view_titletext");
    }

    public Toolbar getToolbar() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            return toolbar;
        }
        throw new RuntimeException("Can not get a toolbar,setAutoGenerateToolbar(true) or gave a toolbar id == R.id.nav_top_bar");
    }

    public void hideBackButton() {
        this.mShowBackButton = false;
        if (this.mToolbar == null) {
            return;
        }
        hideBackButtonInternal();
    }

    public boolean ismHandleStatusBarFlag() {
        return this.mHandleStatusBarFlag;
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        TypedArray typedArrayObtainStyledAttributes = p3().obtainStyledAttributes(themeAttrs);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.mHasActionBar = z6;
        if (z6) {
            Log.e("KFCToolbarActivity", "The theme you applied seems will have a WindowDecorActionBar! set attribute 'windowActionBar' to false in your theme!");
        }
        typedArrayObtainStyledAttributes.recycle();
        if (ismHandleStatusBarFlag()) {
            setupStatusBarUpperKitKat();
        }
        if (!BaseAppCompatActivity.class.isInstance(p3())) {
            throw new RuntimeException(ATTACH_ACTIVITY_MUST_BE_BASE_APP_COMPAT_ACTIVITY);
        }
        if (this.mShowBackButton) {
            showBackButtonInternal();
        }
    }

    public abstract View onCreateContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mToolBarSetUp = true;
        if (this.mAutoGenerateToolbar) {
            return generateToolbar(layoutInflater, viewGroup, bundle);
        }
        View viewOnCreateContentView = onCreateContentView(layoutInflater, viewGroup, bundle);
        if (viewOnCreateContentView == null) {
            return null;
        }
        Toolbar toolbar = (Toolbar) viewOnCreateContentView.findViewById(2131304944);
        this.mToolbar = toolbar;
        if (toolbar == null) {
            return viewOnCreateContentView;
        }
        TextView textView = (TextView) toolbar.findViewById(2131311356);
        this.mTitleTextView = textView;
        if (textView == null) {
            layoutInflater.inflate(2131499591, this.mToolbar);
            this.mTitleTextView = (TextView) this.mToolbar.findViewById(2131311356);
        }
        this.mToolbar.setContentInsetsAbsolute(0, 0);
        if (AppCompatActivity.class.isInstance(p3())) {
            ((AppCompatActivity) p3()).setSupportActionBar(this.mToolbar);
        }
        if (!TextUtils.isEmpty(this.mTitle)) {
            this.mTitleTextView.setText(this.mTitle);
        }
        return viewOnCreateContentView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        if (shouldTintIcon() && getContext() != null && this.mStatusBarMode != StatusBarMode.IMMERSIVE) {
            Garb curGarb = GarbManager.getCurGarb();
            MultipleThemeUtils.refreshMenuIconTint(getContext(), getToolbar(), curGarb.isPure() ? 0 : curGarb.getFontColor());
        }
        super.onPrepareOptionsMenu(menu);
    }

    public void setAjustToolBarPadingForImmersive(boolean z6) {
        if (this.mStatusBarSetUp) {
            Log.e(TAG, "status bar has been setup,please call setAdjustToolBarPaddingForImmersive before super.onCreate()!");
        } else {
            this.mAdjustToolBarPaddingForImmersive = z6;
        }
    }

    public void setAutoGenerateToolbar(boolean z6) {
        if (this.mToolBarSetUp) {
            Log.w(TAG, "Toolbar has been setup,please call setAutoGenerateToolbar before Fragment.onCreateView()!");
        } else {
            this.mAutoGenerateToolbar = z6;
        }
    }

    public void setStatusBarMode(StatusBarMode statusBarMode) {
        if (this.mStatusBarSetUp) {
            Log.e(TAG, "Toolbar has been setup,please call setStatusBarMode before super.onCreate()!");
        } else {
            this.mStatusBarMode = statusBarMode;
        }
    }

    public void setTintStatusBarAvailable(boolean z6) {
        this.mTintStatusBarAvailable = z6;
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.mTitle)) {
            return;
        }
        this.mTitle = charSequence;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setmHandleStatusBarFlag(boolean z6) {
        this.mHandleStatusBarFlag = z6;
    }

    public void setupStatusBarUpperKitKat() {
        Toolbar toolbar;
        this.mStatusBarSetUp = true;
        StatusBarMode statusBarMode = this.mStatusBarMode;
        int i7 = b.f73522a[statusBarMode.ordinal()];
        if (i7 == 1) {
            if (this.mTintStatusBarAvailable) {
                StatusBarCompat.tintStatusBar(p3(), ThemeUtils.getThemeAttrColor(p3(), 2130968986));
            }
        } else if (i7 == 2 || i7 == 3) {
            StatusBarCompat.immersiveStatusBar(p3());
            if (this.mAdjustToolBarPaddingForImmersive && (toolbar = this.mToolbar) != null) {
                toolbar.setPadding(toolbar.getPaddingLeft(), StatusBarCompat.getStatusBarHeight(p3()) + this.mToolbar.getPaddingTop(), this.mToolbar.getPaddingRight(), this.mToolbar.getPaddingBottom());
            }
            if (statusBarMode == StatusBarMode.IMMERSIVE_FULL_TRANSPARENT) {
                Window window = p3().getWindow();
                window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
            }
        }
    }

    public boolean shouldTintIcon() {
        return (getToolbar() instanceof TintToolbar) && ((TintToolbar) getToolbar()).hasIconTint();
    }

    public void showBackButton() {
        this.mShowBackButton = true;
        if (this.mToolbar == null) {
            return;
        }
        showBackButtonInternal();
    }
}
