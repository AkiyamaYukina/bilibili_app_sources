package com.bilibili.upper.module.editthumb;

import EH0.i;
import EH0.p;
import HA0.b;
import JH0.a;
import NE0.n;
import ZH0.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import bolts.Task;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.opd.app.core.config.ConfigService;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.studio.centerplus.model.h;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import com.bilibili.studio.centerplus.util.a;
import com.bilibili.studio.comm.manager.v;
import com.bilibili.studio.videoeditor.bean.EditorMaterialEntity;
import com.bilibili.upper.module.contribute.picker.ui.ImgPickerFragment;
import com.bilibili.upper.module.contribute.picker.ui.PhotoChooseFragment;
import com.bilibili.upper.module.cover.editor.ManagerType;
import com.bilibili.upper.module.cover.editor.g;
import com.bilibili.upper.module.editthumb.EditThumbActivity;
import com.bilibili.upper.widget.NoScrollViewPager;
import com.bilibili.upper.widget.thumb.ThumbFragment;
import gG0.r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/editthumb/EditThumbActivity.class */
public class EditThumbActivity extends BaseToolbarActivity implements IPvTracker {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f113127R = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PagerSlidingTabStrip f113128D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public NoScrollViewPager f113129E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public n f113130F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ImageView f113131G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public FrameLayout f113132H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public PhotoChooseFragment f113133I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public TextView f113134J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public LinearLayout f113135K;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f113138N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f113139O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f113141Q;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f113136L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f113137M = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f113140P = true;

    public final String Q6() {
        n nVar = this.f113130F;
        if (nVar == null) {
            return "";
        }
        Fragment item = nVar.getItem(this.f113129E.getCurrentItem());
        return item instanceof ThumbFragment ? "视频截取" : item instanceof ImgPickerFragment ? "相册选择" : "";
    }

    public final void R6(final String str) {
        if (this.f113137M) {
            SharedPreferencesHelper sharedPreferencesHelper = a.f11357a;
            a.b(this.f113139O);
            a.c(this.f113139O);
        }
        Task.callInBackground(new h(true, false, new Function2(this, str) { // from class: ZH0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EditThumbActivity f29576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f29577b;

            {
                this.f29576a = this;
                this.f29577b = str;
            }

            public final Object invoke(Object obj, Object obj2) {
                PreviewData previewData = (PreviewData) obj2;
                int i7 = EditThumbActivity.f113127R;
                EditThumbActivity editThumbActivity = this.f29576a;
                editThumbActivity.getClass();
                boolean z6 = previewData != null ? previewData.cover43Auth : false;
                g.a aVar = g.f112681d;
                com.bilibili.upper.module.cover.editor.h hVarB = aVar.b().b();
                if ((hVarB != null ? hVarB.a() : null) != null) {
                    ToastHelper.showToastShort(editThumbActivity, "16:9封面已重置");
                }
                com.bilibili.upper.module.cover.editor.h hVarB2 = aVar.a().b();
                if (hVarB2 != null) {
                    hVarB2.d(editThumbActivity);
                }
                com.bilibili.upper.module.cover.editor.h hVarB3 = aVar.b().b();
                if (hVarB3 != null) {
                    hVarB3.d(editThumbActivity);
                }
                aVar.a();
                aVar.b();
                g gVarA = aVar.a();
                ManagerType managerType = gVarA.f112684a;
                ManagerType managerType2 = ManagerType.TYPE_4_3;
                if (managerType == managerType2) {
                    g.f112682e = null;
                } else {
                    g.f112683f = null;
                }
                com.bilibili.upper.module.cover.editor.h hVarB4 = gVarA.b();
                if (hVarB4 != null) {
                    hVarB4.release();
                }
                g gVarB = aVar.b();
                if (gVarB.f112684a == managerType2) {
                    g.f112682e = null;
                } else {
                    g.f112683f = null;
                }
                com.bilibili.upper.module.cover.editor.h hVarB5 = gVarB.b();
                if (hVarB5 != null) {
                    hVarB5.release();
                }
                String str2 = editThumbActivity.f113141Q;
                String str3 = editThumbActivity.f113139O;
                String strQ6 = editThumbActivity.Q6();
                boolean z7 = true;
                boolean z8 = z6 && editThumbActivity.f113140P;
                String str4 = editThumbActivity.f113138N;
                p.f4125a.getClass();
                if (p.f4130f == null) {
                    z7 = false;
                }
                String str5 = this.f29577b;
                if (z7) {
                    if (!p.a(editThumbActivity)) {
                        BLog.i("CoverUtil", "startCover1 entity available,environment is not ok");
                        return null;
                    }
                    p.l(editThumbActivity, str3, str5, z8, p.f4128d, strQ6, str4);
                    p.f4126b = false;
                    return null;
                }
                if (!p.a(editThumbActivity)) {
                    BLog.i("CoverUtil", "startCover1 environment is not ok");
                    return null;
                }
                p.c(editThumbActivity);
                BLog.i("CoverUtil", "startCover1 requestMaterialEntity");
                p.j(new com.bilibili.studio.editor.moudle.material.h(new i(editThumbActivity, 0), new Function1(editThumbActivity, str2, str3, z8, str5, strQ6, str4) { // from class: EH0.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Activity f4075a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f4076b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f4077c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f4078d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final boolean f4079e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final String f4080f;

                    {
                        this.f4075a = editThumbActivity;
                        this.f4076b = str3;
                        this.f4077c = str5;
                        this.f4078d = strQ6;
                        this.f4079e = z8;
                        this.f4080f = str4;
                    }

                    public final Object invoke(Object obj3) {
                        p.f4130f = new EditorMaterialEntity();
                        p.f4132i = false;
                        p pVar = p.f4125a;
                        String str6 = p.f4128d;
                        String str7 = this.f4078d;
                        pVar.getClass();
                        p.l(this.f4075a, this.f4076b, this.f4077c, this.f4079e, str6, str7, this.f4080f);
                        return Unit.INSTANCE;
                    }
                }, new Function1(editThumbActivity, str2, str3, z8, str5, strQ6, str4) { // from class: EH0.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Activity f4081a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f4082b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final String f4083c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f4084d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final boolean f4085e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final String f4086f;

                    {
                        this.f4081a = editThumbActivity;
                        this.f4082b = str3;
                        this.f4083c = str5;
                        this.f4084d = strQ6;
                        this.f4085e = z8;
                        this.f4086f = str4;
                    }

                    public final Object invoke(Object obj3) {
                        p.f4132i = false;
                        p.f4130f = (EditorMaterialEntity) obj3;
                        p pVar = p.f4125a;
                        String str6 = p.f4128d;
                        String str7 = this.f4084d;
                        pVar.getClass();
                        p.l(this.f4081a, this.f4082b, this.f4083c, this.f4085e, str6, str7, this.f4086f);
                        return Unit.INSTANCE;
                    }
                }));
                return null;
            }
        }));
    }

    public final void S6() {
        Fragment item = this.f113130F.getItem(this.f113129E.getCurrentItem());
        if (item instanceof ThumbFragment) {
            this.f113131G.setVisibility(8);
            this.f113132H.setVisibility(8);
            this.f113135K.setEnabled(false);
            this.f113134J.setText(2131851150);
        }
        if (item instanceof ImgPickerFragment) {
            this.f113131G.setVisibility(0);
            this.f113132H.setVisibility(0);
            this.f113135K.setEnabled(true);
            this.f113134J.setText(2131849162);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "creation.cover-editor.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("experiment_num", "4");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v.a(linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            bundleM.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundleM;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i8 == -1 && i7 == 2233) {
            b bVar = (intent == null || intent.getExtras() == null) ? null : new b(intent);
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_frame_next_click", "click", TextUtils.concat(String.valueOf(bVar.a("image_width")), ConfigService.ANY, String.valueOf(bVar.a("image_height"))).toString()});
            Intent intent2 = new Intent();
            intent2.putExtra("output_image_path", intent.getStringExtra("output_image_path"));
            intent2.putExtra("output_image_sub_path", intent.getStringExtra("output_image_sub_path"));
            setResult(-1, intent2);
            finish();
        }
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        PhotoChooseFragment photoChooseFragment = this.f113133I;
        if (photoChooseFragment == null) {
            super.onBackPressed();
            return;
        }
        if (!photoChooseFragment.isVisible()) {
            super.onBackPressed();
            return;
        }
        PhotoChooseFragment photoChooseFragment2 = this.f113133I;
        r rVar = photoChooseFragment2.d;
        if (rVar.e != 0) {
            rVar.N();
        } else if (!photoChooseFragment2.isVisible()) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().beginTransaction().hide(this.f113133I).commit();
            this.f113131G.setImageResource(2131236396);
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(2131493803);
        Window window = getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(4098);
            window.setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
        }
        ensureToolbar();
        showBackButton();
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.f113128D = findViewById(2131308542);
        this.f113129E = (NoScrollViewPager) findViewById(2131316342);
        this.f113131G = (ImageView) findViewById(2131304056);
        this.f113132H = (FrameLayout) findViewById(2131301624);
        this.f113134J = (TextView) findViewById(2131310619);
        this.f113135K = (LinearLayout) findViewById(2131315393);
        findViewById(2131311654).setOnClickListener(new ZH0.a(this, 0));
        this.f113135K.setOnClickListener(new ZH0.b(this, 0));
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        if (bundleExtra != null) {
            string = bundleExtra.getString("PATH_EXTRA");
            this.f113138N = bundleExtra.getString("TYPE_EXTRA");
            this.f113139O = bundleExtra.getString("COVER_KEY_EXTRA");
            this.f113136L = bundleExtra.getInt("SELECT_TYPE", 0);
            this.f113137M = bundleExtra.getBoolean("COVER_CLEAN_DRAFT", false);
            this.f113140P = bundleExtra.getBoolean("SUPPORT_169", true);
            this.f113141Q = bundleExtra.getString("COVER_EDITOR_STRATEGY_ID");
        } else {
            string = null;
        }
        n nVar = new n(getSupportFragmentManager(), string);
        this.f113130F = nVar;
        this.f113129E.setAdapter(nVar);
        if (TextUtils.isEmpty(string)) {
            this.f113128D.setVisibility(8);
        } else {
            this.f113128D.setViewPager(this.f113129E);
        }
        this.f113129E.addOnPageChangeListener(new d(this));
        TE0.b bVar = TE0.b.f24088a;
        String strQ6 = Q6();
        bVar.getClass();
        TE0.b.H(strQ6);
        S6();
        Map<String, com.bilibili.studio.centerplus.util.a> map = com.bilibili.studio.centerplus.util.a.f105281c;
        a.C1184a.a("Key_Cover_Album").f105282a = registerForActivityResult(new ActivityResultContract(), new Object());
        InfoEyesManager.getInstance().report2(false, "000377", new String[]{"contribute_cover_show", "show"});
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Map<String, com.bilibili.studio.centerplus.util.a> map = com.bilibili.studio.centerplus.util.a.f105281c;
        com.bilibili.studio.centerplus.util.a aVarA = a.C1184a.a("Key_Cover_Album");
        aVarA.f105282a = null;
        aVarA.f105283b = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        StatusBarCompat.tintStatusBar(this, ContextCompat.getColor(getApplicationContext(), 2131104278));
        StatusBarCompat.setStatusBarLightMode(this);
    }
}
