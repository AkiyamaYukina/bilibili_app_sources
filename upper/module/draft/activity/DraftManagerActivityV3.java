package com.bilibili.upper.module.draft.activity;

import WH0.p;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.upper.module.draft.fragment.DraftsFragmentV3;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/activity/DraftManagerActivityV3.class */
public class DraftManagerActivityV3 extends BaseToolbarActivity {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f113098D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f113099E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public PagerSlidingTabStrip f113100F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ViewPager f113101G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public FrameLayout f113102H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public p f113103I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public DraftsFragmentV3 f113104J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f113105K = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f113106L = 0;

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.draft.activity.DraftManagerActivityV3.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        p pVar = this.f113103I;
        if (pVar != null) {
            DraftsFragmentV3 draftsFragmentV3 = (DraftsFragmentV3) pVar.getItem(0);
            if (draftsFragmentV3.isAdded()) {
                draftsFragmentV3.mf();
                return;
            }
            return;
        }
        DraftsFragmentV3 draftsFragmentV32 = this.f113104J;
        if (draftsFragmentV32 == null || !draftsFragmentV32.isAdded()) {
            return;
        }
        this.f113104J.mf();
    }
}
