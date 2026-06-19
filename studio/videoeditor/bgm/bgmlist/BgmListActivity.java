package com.bilibili.studio.videoeditor.bgm.bgmlist;

import GA0.b;
import Xz0.g;
import Xz0.j;
import Xz0.k;
import aD0.f;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import bB0.C4937a;
import cB0.d;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.editor.musictpl.UpperLoadingDialogFragment;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.H;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmTab;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListSheetBehavior;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.AbstractSheetFragment;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BgmListLocalDetailSheetFragment;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BgmListManageSheetFragment;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BgmListSheetFragment;
import com.bilibili.studio.videoeditor.bgm.e;
import com.bilibili.studio.videoeditor.bgm.favorite.net.IEditMaterialFavService;
import com.bilibili.studio.videoeditor.bgm.h;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import com.bilibili.studio.videoeditor.common.intent.a;
import com.bilibili.studio.videoeditor.picker.bean.AudioItem;
import com.bilibili.studio.videoeditor.template.bean.BiliBgmData;
import com.bilibili.studio.videoeditor.util.C6635h;
import com.bilibili.studio.videoeditor.util.MusicDownloadHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import xw0.InterfaceC9010a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListActivity.class */
public class BgmListActivity extends FragmentActivity implements InterfaceC9010a {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f108940N = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public FrameLayout f108941A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Animation f108942B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Animation f108943C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public CoordinatorLayout f108944D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f108945E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f108954x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FrameLayout f108956z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f108955y = -1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f108946F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f108947G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f108948H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f108949I = "0";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f108950J = false;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Bundle f108951K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f108952L = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f108953M = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListActivity$a.class */
    public final class a extends BgmListSheetBehavior.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BgmListActivity f108957a;

        public a(BgmListActivity bgmListActivity) {
            this.f108957a = bgmListActivity;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.studio.videoeditor.util.MusicDownloadHelper, java.lang.Object] */
    public final void P6(Intent intent, final Bgm bgm) {
        UpperLoadingDialogFragment upperLoadingDialogFragment = new UpperLoadingDialogFragment();
        upperLoadingDialogFragment.f108208d = getString(2131842240);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (!supportFragmentManager.isDestroyed() && !supportFragmentManager.isStateSaved()) {
            upperLoadingDialogFragment.show(getSupportFragmentManager(), "downloadLoadingDialog");
        }
        ?? obj = new Object();
        obj.f110208a = new MusicDownloadHelper.a(this, bgm) { // from class: aB0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BgmListActivity f31091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Bgm f31092b;

            {
                this.f31091a = this;
                this.f31092b = bgm;
            }

            @Override // com.bilibili.studio.videoeditor.util.MusicDownloadHelper.a
            public final void a(long j7, String str, String str2) {
                int i7 = BgmListActivity.f108940N;
                BgmListActivity bgmListActivity = this.f31091a;
                bgmListActivity.getClass();
                Bgm bgm2 = this.f31092b;
                bgm2.localPath = str;
                Intent intent2 = new Intent();
                Bundle bundle = bgmListActivity.f108951K;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new BiliBgmData(true, bgm2.sid, bgm2.localPath, bgm2.name, bgm2.getStartTime()));
                bundle.putSerializable("bbs_key_material_select_musics", arrayList);
                if (TextUtils.isEmpty(bgmListActivity.f108952L)) {
                    intent2.putExtra("bili_param_control", bundle);
                } else {
                    Lazy<com.bilibili.studio.videoeditor.common.intent.a> lazy = com.bilibili.studio.videoeditor.common.intent.a.f109426c;
                    a.C1206a.a().c(bgmListActivity, bgmListActivity.f108952L, bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("bili_largeBundleKey", bgmListActivity.f108952L);
                    intent2.putExtra("bili_param_control", bundle2);
                }
                bgmListActivity.setResult(-1, intent2);
                bgmListActivity.finish();
            }
        };
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        String string = extras.getString("key_bgm_path");
        String string2 = extras.getString("key_bgm_name");
        long j7 = extras.getLong("key_bgm_start_time");
        if (TextUtils.isEmpty(string)) {
            MusicInfo musicInfo = new MusicInfo(0L, null, 0, null, null, 0L, 0L, 0L, 0, 0, null, 2047, null);
            CB0.a.b(musicInfo, bgm);
            obj.d(musicInfo);
        } else {
            MusicDownloadHelper.a aVar = obj.f110208a;
            if (aVar != null) {
                aVar.a(j7, string, string2);
            }
        }
    }

    public final BgmListManageSheetFragment Q6() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i7 = BgmListManageSheetFragment.f109012v;
        BgmListManageSheetFragment bgmListManageSheetFragment = (BgmListManageSheetFragment) supportFragmentManager.findFragmentByTag("BgmListManageSheetFragment");
        BgmListManageSheetFragment bgmListManageSheetFragment2 = bgmListManageSheetFragment;
        if (bgmListManageSheetFragment == null) {
            bgmListManageSheetFragment2 = new BgmListManageSheetFragment();
        }
        return bgmListManageSheetFragment2;
    }

    public final void R6(androidx_fragment_app_Fragment androidx_fragment_app_fragment, String str) {
        Q6().mf(false);
        getSupportFragmentManager().beginTransaction().replace(2131300036, androidx_fragment_app_fragment, str).commitAllowingStateLoss();
        this.f108956z.startAnimation(this.f108942B);
        this.f108956z.setVisibility(0);
    }

    @Override // lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        CoordinatorLayout coordinatorLayout = this.f108944D;
        if (coordinatorLayout != null) {
            coordinatorLayout.setBackgroundColor(0);
        }
        f.d().a("BgmListActivity finish");
        super.finish();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final String getPvEventId() {
        return "creation.music-choose.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final Bundle getPvExtra() {
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        HashMap map = (HashMap) j.b(k.f28475b);
        map.put("fast_video", this.f108949I);
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f108956z.getVisibility() == 0) {
            for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                if (fragment instanceof AbstractSheetFragment) {
                    if (((AbstractSheetFragment) fragment).mo10409if()) {
                        return;
                    }
                } else if (fragment instanceof BgmListSheetFragment) {
                    BgmListSheetFragment bgmListSheetFragment = (BgmListSheetFragment) fragment;
                    e eVar = bgmListSheetFragment.f108991c;
                    eVar.N();
                    eVar.notifyDataSetChanged();
                    f.d().f("BgmListSheetFragment 1");
                    BgmListActivity bgmListActivity = bgmListSheetFragment.f108992d;
                    bgmListActivity.Q6().mf(true);
                    bgmListActivity.f108956z.startAnimation(bgmListActivity.f108943C);
                    bgmListActivity.f108956z.setVisibility(8);
                    return;
                }
            }
        }
        super.onBackPressed();
        InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_musiclist_back_click", "click", C6635h.e(), String.valueOf(this.f108954x)});
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View decorView;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setSystemUiVisibility(4102);
        }
        if (b.a(this)) {
            finish();
            return;
        }
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("bili_param_control");
        this.f108951K = bundleExtra;
        if (bundleExtra != null) {
            String string = bundleExtra.getString("bili_largeBundleKey");
            this.f108952L = string;
            if (!TextUtils.isEmpty(string)) {
                Lazy<com.bilibili.studio.videoeditor.common.intent.a> lazy = com.bilibili.studio.videoeditor.common.intent.a.f109426c;
                this.f108951K = (Bundle) a.C1206a.a().a(this, Bundle.class, this.f108952L);
            }
        }
        if (this.f108951K == null) {
            this.f108951K = intent.getBundleExtra("param_control");
        }
        Bundle bundle2 = this.f108951K;
        if (bundle2 != null) {
            this.f108954x = bundle2.getInt("caller", 2);
            this.f108948H = this.f108951K.getBoolean("only_support_select_from_local_file", false);
            this.f108950J = this.f108951K.getBoolean("key_bgm_from_music_edit_page", false);
            this.f108955y = this.f108951K.getLong("bgm_activity_sid", -1L);
            this.f108947G = this.f108951K.getBoolean("bili_needDownload", false);
            this.f108949I = this.f108951K.getString("fast_video", "0");
        } else {
            this.f108954x = intent.getIntExtra("caller", 2);
            this.f108955y = intent.getLongExtra("bgm_activity_sid", -1L);
            this.f108947G = intent.getBooleanExtra("bili_needDownload", false);
        }
        d.a().b(getApplicationContext(), this.f108954x, getLoaderManager());
        iB0.b bVar = iB0.b.d;
        U60.d dVar = new U60.d(this);
        bVar.a.clear();
        int i7 = H.a().f108867b;
        iB0.a aVar = new iB0.a(bVar, dVar);
        IEditMaterialFavService iEditMaterialFavService = (IEditMaterialFavService) ServiceGenerator.createService(IEditMaterialFavService.class);
        String accessToken = null;
        AccountService accountService = (AccountService) BLRouter.get$default(BLRouter.INSTANCE, AccountService.class, (String) null, 2, (Object) null);
        if (accountService != null) {
            accessToken = accountService.getAccessToken();
        }
        iEditMaterialFavService.queryFavBgmMaterials(accessToken).enqueue(new kB0.b(aVar));
        setContentView(2131498243);
        this.f108944D = (CoordinatorLayout) findViewById(2131297501);
        this.f108941A = (FrameLayout) findViewById(2131301632);
        this.f108956z = (FrameLayout) findViewById(2131300036);
        this.f108945E = findViewById(2131297500);
        BgmListSheetBehavior.from(this.f108941A).setBottomSheetCallback(new a(this));
        Context applicationContext = getApplicationContext();
        this.f108942B = AnimationUtils.loadAnimation(applicationContext, 2130771991);
        this.f108943C = AnimationUtils.loadAnimation(applicationContext, 2130771990);
        if (this.f108948H) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i8 = BgmListLocalDetailSheetFragment.f109002j;
            BgmListLocalDetailSheetFragment bgmListLocalDetailSheetFragment = (BgmListLocalDetailSheetFragment) supportFragmentManager.findFragmentByTag("BgmListLocalDetailSheetFragment");
            BgmListLocalDetailSheetFragment bgmListLocalDetailSheetFragment2 = bgmListLocalDetailSheetFragment;
            if (bgmListLocalDetailSheetFragment == null) {
                bgmListLocalDetailSheetFragment2 = new BgmListLocalDetailSheetFragment();
            }
            R6(bgmListLocalDetailSheetFragment2, "BgmListLocalDetailSheetFragment");
            return;
        }
        BgmListManageSheetFragment bgmListManageSheetFragmentQ6 = Q6();
        bgmListManageSheetFragmentQ6.f109027t = this.f108949I;
        if (bgmListManageSheetFragmentQ6.isAdded()) {
            getSupportFragmentManager().beginTransaction().show(bgmListManageSheetFragmentQ6).commitAllowingStateLoss();
        } else {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i9 = BgmListManageSheetFragment.f109012v;
            fragmentTransactionBeginTransaction.add(2131306044, bgmListManageSheetFragmentQ6, "BgmListManageSheetFragment").commitAllowingStateLoss();
        }
        this.f108953M = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        this.f108946F = true;
        BgmListManageSheetFragment bgmListManageSheetFragmentQ6 = Q6();
        C4937a c4937a = bgmListManageSheetFragmentQ6.f109026s;
        if (c4937a != null) {
            c4937a.a();
        }
        bgmListManageSheetFragmentQ6.mf(true);
        getSupportFragmentManager().beginTransaction().remove(Q6()).commitNowAllowingStateLoss();
        h hVar = h.f109078b;
        HashMap<String, Bgm> map = hVar.f109079a;
        if (map != null) {
            map.clear();
        }
        hVar.f109079a = null;
        d dVarA = d.a();
        List<Bgm> list = dVarA.f58761b;
        if (list != null) {
            list.clear();
        }
        List<BgmTab> list2 = dVarA.f58762c;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
        List<d.a> list3 = dVarA.f58764e;
        if (list3 != null) {
            ((ArrayList) list3).clear();
        }
        List<AudioItem> list4 = dVarA.f58763d;
        if (list4 != null) {
            ((ArrayList) list4).clear();
        }
        if (dVarA.f58760a != null) {
            dVarA.f58760a = null;
        }
        d.f58757k = 0;
        YC0.d dVar = dVarA.h;
        if (dVar != null) {
            dVar.f28642e = null;
            LoaderManager loaderManager = dVar.f28639b;
            if (loaderManager != null) {
                loaderManager.destroyLoader(dVar.f28640c);
            }
            dVarA.h = null;
        }
        d.f58758l = 0;
        dVarA.f58767i = null;
        dVarA.f58768j = null;
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Bgm bgm;
        int i7;
        super.onNewIntent(intent);
        String dataString = intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            bgm = null;
        } else {
            String strDecode = Uri.decode(dataString);
            bgm = new Bgm();
            int iIndexOf = strDecode.indexOf("?");
            if (iIndexOf >= 0 && strDecode.length() > (i7 = iIndexOf + 1)) {
                String strSubstring = strDecode.substring(i7);
                if (!TextUtils.isEmpty(strSubstring)) {
                    for (String str : strSubstring.split("&")) {
                        String[] strArrSplit = str.split("=");
                        if (strArrSplit.length != 2) {
                            break;
                        }
                        String str2 = strArrSplit[0];
                        String str3 = strArrSplit[1];
                        if (str3 != null) {
                            if ("bgm_id".equals(str2)) {
                                bgm.sid = Integer.valueOf(str3).intValue();
                            } else if ("bgm_name".equals(str2)) {
                                bgm.name = str3;
                            } else if ("bgm_point".equals(str2)) {
                                bgm.setStartTime(Long.valueOf(str3).longValue());
                            }
                        }
                    }
                }
            }
        }
        if (bgm == null || bgm.sid == 0 || TextUtils.isEmpty(bgm.name)) {
            return;
        }
        TC0.h.a(getApplicationContext(), bgm.sid, new aB0.b(this, com.bilibili.studio.videoeditor.widgets.a.j(this), bgm, dataString));
    }

    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        BgmListManageSheetFragment bgmListManageSheetFragmentQ6 = Q6();
        C4937a c4937a = bgmListManageSheetFragmentQ6.f109026s;
        if (c4937a != null) {
            c4937a.a();
        }
        bgmListManageSheetFragmentQ6.mf(true);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() >= this.f108941A.getY()) {
            return super.onTouchEvent(motionEvent);
        }
        finish();
        return true;
    }
}
