package com.bilibili.upper.module.manuscript.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import bw0.InterfaceC5167a;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.lib.ui.RouteConstKt;
import com.bilibili.lib.ui.Target;
import com.bilibili.lib.videoupload.speeddetect.UploadLineSpeedDetect;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.comm.material.MaterialCollection;
import com.bilibili.studio.videoeditor.util.S;
import com.bilibili.upper.module.manuscript.fragment.ManuscriptsListFragment;
import jI0.InterfaceC7648a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lB0.a;
import lB0.a$b;
import qw0.C8488a;
import rw0.C8554a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/ArchiveManagerActivity.class */
public class ArchiveManagerActivity extends BaseToolbarActivity implements InterfaceC7648a {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f113400K = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PagerSlidingTabStrip f113401D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ViewPager f113402E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f113403F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public NE0.c f113404G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f113405H = 2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f113406I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public a.a f113407J;

    public static void Q6(Intent intent, String str) {
        if (intent.getBooleanExtra("key_page_from_notify", false)) {
            String stringExtra = intent.getStringExtra("key_notify_type");
            j4.o.a("notifyType:", stringExtra, ",pageScene=", str, "ArchiveManagerActivity");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            Neurons.trackT(false, "creation.archive.notify.track", O4.c.c("archive_type", stringExtra, "page_scene", str), 1, new AT0.c(8));
        }
    }

    @Override // jI0.InterfaceC7648a
    public final void Pb(@NonNull RouteRequest routeRequest, int i7) {
        BLRouter.routeTo(routeRequest, this);
    }

    public final Fragment R6(String str) {
        Target targetFindRoute = RouteConstKt.findRoute(BLRouter.INSTANCE, RouteRequestKt.toRouteRequest(str));
        return (targetFindRoute == null || !Fragment.class.isAssignableFrom(targetFindRoute.getClazz())) ? null : Fragment.instantiate(this, targetFindRoute.getClazz().getName(), targetFindRoute.getArgs());
    }

    public final void S6() {
        PreviewData.LotteryConf lotteryConf;
        boolean z6;
        Bundle bundleExtra;
        this.f113406I = false;
        if (getIntent() == null || (bundleExtra = getIntent().getBundleExtra("param_control")) == null) {
            lotteryConf = null;
            z6 = false;
        } else {
            z6 = bundleExtra.getBoolean("show_lottery", false);
            lotteryConf = (PreviewData.LotteryConf) bundleExtra.getSerializable("lottery");
        }
        if (!z6) {
            T6(false);
            return;
        }
        if (lotteryConf == null || TextUtils.isEmpty(lotteryConf.lotteryLink) || lotteryConf.lotteryRemain <= 0) {
            T6(false);
            return;
        }
        this.f113406I = true;
        T6(true);
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/transweb/")).data(Uri.parse(lotteryConf.lotteryLink + "?lottery_remain=" + lotteryConf.lotteryRemain + "&lottery_time=" + System.currentTimeMillis())).build(), this);
    }

    public final void T6(boolean z6) {
        this.f113403F.setVisibility(z6 ? 0 : 8);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        ManuscriptsListFragment manuscriptsListFragment = (ManuscriptsListFragment) this.f113404G.getItem(0);
        if (manuscriptsListFragment != null) {
            if (i8 == -1 && i7 == 1000) {
                manuscriptsListFragment.lf(true);
            } else if (i8 == 134 && i7 == 1002) {
                manuscriptsListFragment.lf(true);
            } else if (i8 == 11 && i7 == 1001) {
                manuscriptsListFragment.mf();
            } else if (i8 == -1 && i7 == 123) {
                manuscriptsListFragment.mf();
            } else if (i8 == 11 && i7 == 1002) {
                manuscriptsListFragment.lf(true);
            } else if (i8 == -1 && i7 == 1002) {
                manuscriptsListFragment.lf(true);
            } else if (i8 == 123 && i7 == 1000) {
                manuscriptsListFragment.lf(true);
            } else if ((i8 == -1 || i7 == 123 || i7 == 134) && i7 == 1003) {
                manuscriptsListFragment.lf(true);
            } else if ((i8 == -1 || i7 == 123 || i7 == 134) && i7 == 1004) {
                manuscriptsListFragment.lf(true);
            } else if (i8 == -1 && i7 == 1005) {
                manuscriptsListFragment.lf(true);
            } else if (i8 == -1 && (i7 == 1001 || i7 == 1002)) {
                manuscriptsListFragment.lf(true);
            }
        }
        super.onActivityResult(i7, i8, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.viewpager.widget.ViewPager$OnPageChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        NE0.c cVar;
        super.onCreate(bundle);
        if (GA0.b.a(this)) {
            finish();
            return;
        }
        setContentView(2131493783);
        ensureToolbar();
        showBackButton();
        getSupportActionBar().setTitle(2131851311);
        this.f113401D = findViewById(2131308542);
        this.f113402E = (ViewPager) findViewById(2131316342);
        View viewFindViewById = findViewById(2131306619);
        this.f113403F = viewFindViewById;
        viewFindViewById.setOnClickListener(new Object());
        this.f113402E.addOnPageChangeListener(new Object());
        if (getIntent() != null) {
            Bundle bundleExtra = getIntent().getBundleExtra("param_control");
            if (bundleExtra != null) {
                this.f113405H = bundleExtra.getInt("key_from", 2);
            }
            Q6(getIntent(), "onCreate");
        }
        S6();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.getFragments() != null) {
            Iterator<Fragment> it = supportFragmentManager.getFragments().iterator();
            while (it.hasNext()) {
                supportFragmentManager.beginTransaction().remove(it.next()).commitNowAllowingStateLoss();
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new ManuscriptsListFragment());
        arrayList2.add(getString(2131851190));
        Fragment fragmentR6 = R6("bilibili://article/column-manager-fragment/");
        if (fragmentR6 != null) {
            arrayList.add(fragmentR6);
            if (ConfigManager.Companion.isHitFF("ff_column_upgrade_opus_enable")) {
                arrayList2.add(getString(2131851405));
            } else {
                arrayList2.add(getString(2131850883));
            }
        }
        Fragment fragmentR62 = R6("bilibili://music/contributions");
        if (fragmentR62 != null) {
            arrayList.add(fragmentR62);
            arrayList2.add(getString(2131851189));
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        this.f113402E.setOffscreenPageLimit(2);
        NE0.c cVar2 = new NE0.c(getSupportFragmentManager(), arrayList, strArr);
        this.f113404G = cVar2;
        this.f113402E.setAdapter(cVar2);
        this.f113401D.setViewPager(this.f113402E);
        this.f113401D.setAllCaps(false);
        fA0.j.a(this.f113401D);
        InfoEyesManager.getInstance().report2(false, "000377", new String[]{"ugc_center_contribution_manage_view", "show", String.valueOf(1)});
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundleExtra2 = intent.getBundleExtra("param_control");
            int intExtra = bundleExtra2 == null ? intent.getIntExtra("SELECT_TAB", 0) : bundleExtra2.getInt("SELECT_TAB", 0);
            String stringExtra = bundleExtra2 == null ? intent.getStringExtra("index") : bundleExtra2.getString("index");
            int i7 = intExtra;
            if (intExtra == 0) {
                i7 = intExtra;
                if (S.b(stringExtra)) {
                    i7 = Integer.parseInt(stringExtra);
                }
            }
            if (this.f113402E != null && (cVar = this.f113404G) != null) {
                if (i7 >= cVar.getCount()) {
                    i7 = 0;
                }
                this.f113402E.setCurrentItem(i7);
            }
        }
        lB0.a aVarA = lB0.a.a();
        a$b a_b = new a$b(this) { // from class: com.bilibili.upper.module.manuscript.activity.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArchiveManagerActivity f113539a;

            {
                this.f113539a = this;
            }

            @Override // lB0.a$b
            public final void onBusEvent(Object obj) {
                ManuscriptsListFragment manuscriptsListFragment;
                ArchiveManagerActivity archiveManagerActivity = this.f113539a;
                NE0.c cVar3 = archiveManagerActivity.f113404G;
                if (cVar3 == null || cVar3.getCount() <= 0 || (manuscriptsListFragment = (ManuscriptsListFragment) archiveManagerActivity.f113404G.getItem(0)) == null) {
                    return;
                }
                manuscriptsListFragment.lf(true);
            }
        };
        aVarA.getClass();
        this.f113407J = lB0.a.b(uC0.e.class, a_b);
        Xz0.j.c("first_entrance", "稿件管理");
        Lazy lazy = zw0.b.f130950a;
        if (Intrinsics.areEqual(Contract.get$default(ConfigManager.Companion.ab(), "uper.enable_get_profiles", (Object) null, 2, (Object) null), Boolean.TRUE)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            BLog.wfmt("~0bitian~", "\n------------------------   \n \n%s\n\n------------------------\n  ", new Object[]{"开始拉 x/app/v1/user/profiles接口"});
            ((InterfaceC5167a) ServiceGenerator.createService(InterfaceC5167a.class)).getUserProfiles().enqueue(new com.bilibili.studio.comm.manager.t(jCurrentTimeMillis));
        }
        Lazy<C8554a> lazy2 = C8554a.f127050c;
        C8554a.C1351a.a().a();
        Lazy<C8488a> lazy3 = C8488a.f126360e;
        C8488a.C1345a.a().a();
        MaterialCollection.c();
        UploadLineSpeedDetect.c();
        Map<String, String> map = ABManager.f105341a;
        ABManager.d(com.bilibili.studio.comm.ab.d.f105368t);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558441, menu);
        menu.findItem(2131300323);
        getApplicationContext();
        return true;
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        if (this.f113406I) {
            Intent intent = new Intent("finish_uper_transparent_web_act_action");
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
        }
        super.onDestroy();
        Lazy<C8488a> lazy = C8488a.f126360e;
        C8488a.C1345a.a().b();
        a.a aVar = this.f113407J;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        ManuscriptsListFragment manuscriptsListFragment;
        ManuscriptsListFragment manuscriptsListFragment2;
        super.onNewIntent(intent);
        setIntent(intent);
        Q6(intent, "onNewIntent");
        NE0.c cVar = this.f113404G;
        if (cVar != null && (manuscriptsListFragment2 = (ManuscriptsListFragment) cVar.getItem(0)) != null && manuscriptsListFragment2.isAdded()) {
            manuscriptsListFragment2.rf();
            manuscriptsListFragment2.refresh();
        }
        Bundle bundleExtra = getIntent().getBundleExtra("param_control");
        int intExtra = bundleExtra == null ? intent.getIntExtra("SELECT_TAB", 0) : bundleExtra.getInt("SELECT_TAB", 0);
        ViewPager viewPager = this.f113402E;
        if (viewPager != null && this.f113404G != null) {
            viewPager.setCurrentItem(intExtra);
            if (intExtra == 0 && (manuscriptsListFragment = (ManuscriptsListFragment) this.f113404G.getItem(0)) != null) {
                manuscriptsListFragment.mf();
            }
        }
        S6();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else if (menuItem.getItemId() == 2131300323 && !QE0.a.a()) {
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/user_center/draft/")).extras((Function1) new Object()).build(), this);
            NE0.c cVar = this.f113404G;
            if (cVar != null && cVar.getCount() > 0) {
                int currentItem = this.f113402E.getCurrentItem();
                int i7 = this.f113405H;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) Integer.valueOf(currentItem + 1));
                jSONObject.put("from", (Object) Integer.valueOf(i7));
                InfoEyesManager.getInstance().report2(false, "000377", new String[]{"ugc_center_contribution_draft_view", "show", jSONObject.toJSONString()});
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onPause() {
        super.onPause();
        T6(false);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        ManuscriptsListFragment manuscriptsListFragment;
        super.onResume();
        NE0.c cVar = this.f113404G;
        if (cVar != null && (manuscriptsListFragment = (ManuscriptsListFragment) cVar.getItem(0)) != null && manuscriptsListFragment.isAdded()) {
            manuscriptsListFragment.rf();
            manuscriptsListFragment.refresh();
        }
        Xz0.g.f28463b = "";
    }
}
