package com.bilibili.upper.module.manuscript.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import bF0.C4952G;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.upper.module.manuscript.bean.AuditReason;
import com.bilibili.upper.module.template.dialog.UpperFullScreenLoadingDialog;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ViolationPicItemActivity.class */
@StabilityInferred(parameters = 0)
public final class ViolationPicItemActivity extends BaseToolbarActivity {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f113527J = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public C4952G f113528D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public UpperFullScreenLoadingDialog f113529E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public Integer f113530F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public Integer f113531G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public List<? extends AuditReason.ViolationPic> f113532H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public AuditReason.ViolationPic f113533I;

    public final void Q6(int i7) {
        TintTextView tintTextView;
        C4952G c4952g = this.f113528D;
        if (c4952g == null || (tintTextView = c4952g.f54760d) == null) {
            return;
        }
        tintTextView.setText((i7 + 1) + "/" + this.f113530F);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        C4952G c4952gInflate = C4952G.inflate(getLayoutInflater());
        this.f113528D = c4952gInflate;
        setContentView(c4952gInflate != null ? c4952gInflate.f54757a : null);
        ensureToolbar();
        showBackButton();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
        getToolbar().setNavigationIcon((Drawable) null);
        Bundle bundleExtra = getIntent().getBundleExtra("violation_item");
        this.f113531G = Integer.valueOf(bundleExtra != null ? bundleExtra.getInt("pic_index") : 1);
        ArrayList parcelableArrayList = bundleExtra != null ? bundleExtra.getParcelableArrayList("pic_list") : null;
        this.f113532H = parcelableArrayList;
        this.f113530F = parcelableArrayList != null ? Integer.valueOf(parcelableArrayList.size()) : null;
        Integer num = this.f113531G;
        if (num != null) {
            int iIntValue = num.intValue();
            List<? extends AuditReason.ViolationPic> list = this.f113532H;
            AuditReason.ViolationPic violationPic = null;
            if (list != null) {
                violationPic = list.get(iIntValue);
            }
            this.f113533I = violationPic;
        }
        Integer num2 = this.f113531G;
        if (num2 != null) {
            Q6(num2.intValue());
        }
        C4952G c4952g = this.f113528D;
        if (c4952g != null) {
            c4952g.f54761e.addOnPageChangeListener(new F(this));
        }
        C4952G c4952g2 = this.f113528D;
        if (c4952g2 != null) {
            c4952g2.f54761e.setAdapter(new E(this, getSupportFragmentManager()));
        }
        Integer num3 = this.f113531G;
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            C4952G c4952g3 = this.f113528D;
            if (c4952g3 != null) {
                c4952g3.f54761e.setCurrentItem(iIntValue2);
            }
        }
        C4952G c4952g4 = this.f113528D;
        if (c4952g4 != null) {
            c4952g4.f54759c.setOnClickListener(new com.bilibili.bplus.followingcard.widget.x(this));
        }
        C4952G c4952g5 = this.f113528D;
        if (c4952g5 != null) {
            c4952g5.f54758b.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.i(this, 2));
        }
    }
}
