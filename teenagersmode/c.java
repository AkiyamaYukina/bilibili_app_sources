package com.bilibili.teenagersmode;

import By0.r;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.app.comm.restrict.utils.TeenagersModeKt;
import com.bilibili.app.comm.restrict.utils.TeenagersModeSource;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.droid.BundleUtil;
import com.bilibili.droid.ToastHelper;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.biliid.api.BiliIds;
import com.bilibili.lib.biliid.api.EnvironmentManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.router.Router;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.region.RegionManager;
import com.bilibili.teenagersmode.TeenagersMode;
import com.bilibili.teenagersmode.model.TeenagersModeApiService;
import com.bilibili.teenagersmode.model.TeenagersModeGetTime;
import com.bilibili.teenagersmode.ui.TeenagersModeTimeUpActivity;
import com.bilibili.teenagersmode.ui.g;
import ej.h;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kntr.base.android.legacy.context.ContextUtilKt;
import q4.Q;
import retrofit2.Callback;
import sD0.e;
import sD0.f;
import sD0.j;
import sg.s;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.AppBuildConfig;
import tv.danmaku.bili.MainActivityV2;
import w8.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f110556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f110557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f110558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f110559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f110560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f110561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f110562g;
    public WeakReference<TeenagersModeTimeUpActivity> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f110563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference<TeenagersModeTimeUpActivity> f110564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f110565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f110566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f110567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f110568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Boolean f110569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j f110570p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/c$a.class */
    public final class a implements MainDialogManager.IDialogInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f110571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f110572b;

        public a(c cVar, WeakReference weakReference) {
            this.f110572b = cVar;
            this.f110571a = weakReference;
        }

        public final void onShow() {
            try {
                Context context = (Context) this.f110571a.get();
                if (context == null) {
                    return;
                }
                BLRouter.routeTo(new RouteRequest.Builder("bilibili://teenagers_mode/dialog").build(), context);
                this.f110572b.f110558c = true;
                BiliGlobalPreferenceHelper.getInstance(context).setLong("teenagers_mode_dialog_show_time", System.currentTimeMillis());
                Neurons.reportExposure(false, "main.teenagermodel.teenager-model.smallwidow.show", new HashMap());
                BLog.i("TeenagersMode", "Dialog showed.");
            } catch (Exception e7) {
                BLog.e("TeenagersMode", e7.getMessage(), e7);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/c$b.class */
    public final class b implements Continuation<Long, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<Context> f110573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f110574b;

        public b(c cVar, Context context) {
            this.f110574b = cVar;
            this.f110573a = new WeakReference<>(context);
        }

        @Override // bolts.Continuation
        public final Object then(Task<Long> task) throws Exception {
            BLog.i("TeenagersMode", "fetchCurrentTimeMillis " + task.getResult());
            Long result = task.getResult();
            c cVar = this.f110574b;
            if (result != null) {
                cVar.i(task.getResult().longValue(), this.f110573a.get());
                return null;
            }
            cVar.i(ServerClock.unreliableNow(), this.f110573a.get());
            return null;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.teenagersmode.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/c$c.class */
    public static final class C1213c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f110575a;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.teenagersmode.c, java.lang.Object] */
        static {
            ?? obj = new Object();
            obj.f110559d = false;
            obj.f110561f = false;
            obj.f110562g = false;
            obj.f110563i = false;
            obj.f110565k = false;
            obj.f110566l = false;
            obj.f110567m = false;
            obj.f110568n = false;
            obj.f110569o = null;
            obj.f110570p = j.d.a;
            f110575a = obj;
        }
    }

    public static void a(Context context, boolean z6) {
        MainCommonService mainCommonService = (MainCommonService) d.a(BLRouter.INSTANCE, MainCommonService.class, "default");
        if (z6) {
            MainDialogManager.removeDialog("teenager_force_mode");
            MainDialogManager.removeDialog("teenager_force_mode_real_name");
        } else {
            h.c(context);
        }
        if (mainCommonService != null) {
            mainCommonService.changeTeenagersModeStatus(z6);
        }
    }

    public static void c(Context context, String str) {
        BLog.i("TeenagersMode", "Go back home.");
        Router.global().with(context).add(268468224).with("special_mode_clear_task", "true").with("special_mode_show_force_popup_window", str).open("bilibili://root");
    }

    public static boolean h(Context context) {
        Context contextApplication = context;
        if (context == null) {
            contextApplication = BiliContext.application();
        }
        return com.bilibili.teenagersmode.b.f(contextApplication) || TeenagersModeKt.d();
    }

    public static void l(boolean z6) {
        TeenagersMode teenagersMode = TeenagersMode.getInstance();
        teenagersMode.getClass();
        BLog.i("TeenagersMode", "Teenagers mode time up page show: ".concat(z6 ? "show" : "hide"));
        if (((ConcurrentHashMap) teenagersMode.f110551b).isEmpty()) {
            return;
        }
        Iterator it = ((ConcurrentHashMap) teenagersMode.f110551b).keySet().iterator();
        while (it.hasNext()) {
            ((TeenagersMode.OnTeenagersModeChangeListener) it.next()).onTeenagerModePageShow(z6);
        }
    }

    public static void m(Context context, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        TeenagersMode teenagersMode = TeenagersMode.getInstance();
        teenagersMode.f110550a = z6;
        HandlerThreads.getHandler(0).post(new com.bilibili.teenagersmode.a(teenagersMode, z6, z10));
        a(context, z6);
        if (z7 || z9) {
            ToastHelper.showToast(context.getApplicationContext(), z9 ? z6 ? 2131855976 : 2131856007 : BiliAccounts.get(context).isLogin() ? 2131855987 : 2131855971, 0);
        }
        Q.a("Teenagers status change: ", " is_from_OS? ", "TeenagersMode", z6, z10);
        c(context, z8 ? z6 ? "force_entry" : "force_exit" : null);
        if (z6) {
            return;
        }
        boolean z11 = lj.h.a;
        lj.h.c(context);
    }

    public static boolean q() {
        boolean z6 = true;
        if (!DeviceDecision.INSTANCE.getBoolean("dd_overseas_age_gate_enabled", true) || RegionManager.INSTANCE.isChina() || TeenagersMode.getInstance().isEnable()) {
            z6 = false;
        }
        return z6;
    }

    public static void s(Context context) {
        BLog.i("TeenagersMode", "showAgeGatePage");
        MainDialogManager.block();
        com.bilibili.app.comm.restrict.b.a = true;
        s.b(context, "bilibili://oversea/teenager/age_gate");
    }

    public final void b(Context context) {
        TeenagersModeTimeUpActivity teenagersModeTimeUpActivity;
        TeenagersModeTimeUpActivity teenagersModeTimeUpActivity2;
        if (ContextUtilKt.findTypedActivityOrNull(context, TeenagersModeTimeUpActivity.class) == null) {
            WeakReference<TeenagersModeTimeUpActivity> weakReference = this.f110564j;
            if (weakReference != null && (teenagersModeTimeUpActivity2 = weakReference.get()) != null && !((g) new ViewModelProvider(teenagersModeTimeUpActivity2).get(g.class)).f110672a && this.f110561f) {
                teenagersModeTimeUpActivity2.finish();
                this.f110564j = null;
                this.f110561f = false;
            }
            if (this.f110566l) {
                return;
            }
            WeakReference<TeenagersModeTimeUpActivity> weakReference2 = this.h;
            if (weakReference2 != null && (teenagersModeTimeUpActivity = weakReference2.get()) != null && !((g) new ViewModelProvider(teenagersModeTimeUpActivity).get(g.class)).f110672a && this.f110561f) {
                teenagersModeTimeUpActivity.finish();
                this.h = null;
                this.f110561f = false;
            }
        }
        boolean zN = com.bilibili.teenagersmode.b.n(context);
        if (zN || ServerClock.now() > 0) {
            i(zN ? System.currentTimeMillis() : ServerClock.unreliableNow(), context);
        } else {
            ServerClock.fetchCurrentTimeMillis().continueWith(new b(this, context), Task.UI_THREAD_EXECUTOR);
        }
    }

    public final void d() {
        WeakReference<Context> weakReference = this.f110556a;
        if (weakReference == null) {
            return;
        }
        Context context = weakReference.get();
        Context contextApplication = context;
        if (context == null) {
            contextApplication = BiliContext.application();
        }
        if (contextApplication == null) {
            return;
        }
        this.f110565k = true;
        try {
            BLRouter.routeTo(new RouteRequest.Builder("bilibili://teenagers_mode/forbidden_page").extras(new e()).build(), contextApplication);
            l(true);
            this.f110570p.d(contextApplication);
            BLog.i("TeenagersMode", "Show curfew page.");
        } catch (Exception e7) {
            BLog.e("TeenagersMode", e7.getMessage(), e7);
        }
    }

    public final void e() {
        WeakReference<Context> weakReference = this.f110556a;
        if (weakReference == null) {
            return;
        }
        Context context = weakReference.get();
        Context contextApplication = context;
        if (context == null) {
            contextApplication = BiliContext.application();
        }
        if (contextApplication == null) {
            return;
        }
        com.bilibili.teenagersmode.b.m(contextApplication, false);
        C1213c.f110575a.f110570p.c = false;
        this.f110563i = true;
        try {
            BLRouter.routeTo(new RouteRequest.Builder("bilibili://teenagers_mode/forbidden_page").extras(new com.bilibili.bplus.followinglist.home.synthesis.vm.a(2)).build(), contextApplication);
            l(true);
            BLog.i("TeenagersMode", "Show time limit page.");
        } catch (Exception e7) {
            BLog.e("TeenagersMode", e7.getMessage(), e7);
        }
    }

    public final boolean f() {
        TeenagersModeTimeUpActivity teenagersModeTimeUpActivity;
        WeakReference<TeenagersModeTimeUpActivity> weakReference = this.f110564j;
        boolean z6 = true;
        if (weakReference != null && (teenagersModeTimeUpActivity = weakReference.get()) != null && ((g) new ViewModelProvider(teenagersModeTimeUpActivity).get(g.class)).f110672a) {
            return true;
        }
        WeakReference<TeenagersModeTimeUpActivity> weakReference2 = this.h;
        if (weakReference2 == null) {
            return false;
        }
        TeenagersModeTimeUpActivity teenagersModeTimeUpActivity2 = weakReference2.get();
        if (teenagersModeTimeUpActivity2 == null || !((g) new ViewModelProvider(teenagersModeTimeUpActivity2).get(g.class)).f110672a) {
            z6 = false;
        }
        return z6;
    }

    public final boolean g(Context context) {
        if (this.f110569o == null) {
            this.f110569o = Boolean.valueOf(com.bilibili.teenagersmode.b.a(context).getBoolean("teenagers_mode_parent_control", false));
        }
        return this.f110569o.booleanValue();
    }

    public final void i(long j7, @Nullable Context context) {
        boolean z6;
        TeenagersModeTimeUpActivity teenagersModeTimeUpActivity;
        if (TeenagersModeKt.c() != TeenagersModeSource.App) {
            return;
        }
        boolean z7 = this.f110563i;
        j jVar = this.f110570p;
        if (z7) {
            z6 = true;
        } else {
            TeenagersModeTimeUpActivity teenagersModeTimeUpActivity2 = (TeenagersModeTimeUpActivity) ContextUtilKt.findTypedActivityOrNull(context, TeenagersModeTimeUpActivity.class);
            if (teenagersModeTimeUpActivity2 != null) {
                if (teenagersModeTimeUpActivity2.f110654D == 2 && jVar.h()) {
                    HandlerThreads.remove(0, jVar.i);
                    HandlerThreads.postDelayed(0, jVar.i, jVar.a());
                }
            } else if (!f() && !com.bilibili.teenagersmode.b.a(context).getBoolean("teenagers_mode_time_limited_pwd_finished", true)) {
                e();
                if (jVar.h()) {
                    HandlerThreads.remove(0, jVar.i);
                    HandlerThreads.postDelayed(0, jVar.i, jVar.a());
                }
                z6 = false;
            }
            z6 = true;
        }
        if (!this.f110565k) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j7);
            int i7 = calendar.get(11);
            if ((i7 < 6 || i7 >= 22) && (((teenagersModeTimeUpActivity = (TeenagersModeTimeUpActivity) ContextUtilKt.findTypedActivityOrNull(context, TeenagersModeTimeUpActivity.class)) == null || teenagersModeTimeUpActivity.f110654D != 1) && !f() && (!com.bilibili.teenagersmode.b.a(context).getBoolean("teenagers_mode_curfew_pwd_finished", true) || Math.abs(j7 - com.bilibili.teenagersmode.b.a(context).getLong("teenagers_mode_curfew_page_show_time", 0L)) > 57600000))) {
                d();
                z6 = false;
            }
        }
        if (z6 && ContextUtilKt.findTypedActivityOrNull(context, TeenagersModeTimeUpActivity.class) == null) {
            jVar.i(context, false);
        }
    }

    public final void j(MainActivityV2 mainActivityV2) {
        this.f110556a = new WeakReference<>(mainActivityV2);
        k(mainActivityV2, true);
        Intent intent = mainActivityV2.getIntent();
        if (intent != null) {
            String string = BundleUtil.getString(intent.getExtras(), "special_mode_show_force_popup_window", new String[0]);
            if (TextUtils.isEmpty(string)) {
                if (TeenagersMode.getInstance().isEnable()) {
                    return;
                }
                boolean z6 = lj.h.a;
                lj.h.c(mainActivityV2);
                return;
            }
            if (com.bilibili.teenagersmode.b.a(mainActivityV2).getBoolean("teenagers_mode_dialog_is_appeared", false)) {
                return;
            }
            if ("force_exit".equals(string)) {
                BiliGlobalPreferenceHelper.getInstance(mainActivityV2).setLong("teenagers_mode_dialog_show_time", System.currentTimeMillis());
            }
            intent.removeExtra("special_mode_show_force_popup_window");
            BLRouter.routeTo(new RouteRequest.Builder("bilibili://teenagers_mode/dialog").extras(new r(string, 1)).build(), mainActivityV2);
        }
    }

    public final void k(Context context, boolean z6) {
        if (h(context)) {
            if (this.f110562g) {
                this.f110562g = false;
                return;
            } else {
                b(context);
                return;
            }
        }
        if (z6 || !r(context)) {
            return;
        }
        t(context, false);
    }

    public final void n(TeenagersModeTimeUpActivity teenagersModeTimeUpActivity) {
        if (teenagersModeTimeUpActivity != null) {
            this.f110564j = new WeakReference<>(teenagersModeTimeUpActivity);
            return;
        }
        this.f110564j = null;
        if (this.h == null) {
            this.f110561f = false;
        }
    }

    public final void o(Context context, boolean z6) {
        com.bilibili.teenagersmode.b.l(context, z6, false, false, true);
        TeenagersMode teenagersMode = TeenagersMode.getInstance();
        teenagersMode.f110550a = z6;
        HandlerThreads.getHandler(0).post(new com.bilibili.teenagersmode.a(teenagersMode, z6, false));
        this.f110557b = z6;
        if (z6) {
            u(context);
            if (!com.bilibili.teenagersmode.b.n(context)) {
                Callback<GeneralResponse<TeenagersModeGetTime>> fVar = new f<>(this, context);
                BLog.i("TeenagersModeApiHelper", "getTeenUserTime querying");
                if (vD0.f.a == null) {
                    vD0.f.a = (TeenagersModeApiService) ServiceGenerator.createService(TeenagersModeApiService.class);
                }
                vD0.f.a.getTime(BiliAccounts.get(context).getAccessKey(), BiliIds.buvidServer()).enqueue(fVar);
            }
        } else {
            this.f110570p.j(false, false, this.f110560e, context);
            com.bilibili.teenagersmode.b.a(context).edit().putLong("teenagers_mode_curfew_page_show_time", 0L).apply();
        }
        a(context, z6);
    }

    public final void p(TeenagersModeTimeUpActivity teenagersModeTimeUpActivity) {
        if (teenagersModeTimeUpActivity != null) {
            this.h = new WeakReference<>(teenagersModeTimeUpActivity);
            return;
        }
        this.h = null;
        if (this.f110564j == null) {
            this.f110561f = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.teenagersmode.c.r(android.content.Context):boolean");
    }

    public final void t(Context context, boolean z6) {
        if (context == null || (EnvironmentManager.getInstance().isFirstStart() && z6)) {
            BLog.i("TeenagersMode", "First start, no need show dialog.");
            return;
        }
        if (context.getResources().getConfiguration().orientation != 1 && !AppBuildConfig.isHDApp(context)) {
            BLog.i("TeenagersMode", "only can display dialog in portrait orientation");
        } else {
            if (com.bilibili.teenagersmode.b.a(context).getBoolean("teenagers_mode_dialog_is_appeared", false)) {
                return;
            }
            BLog.i("TeenagersMode", "Ready show dialog.");
            MainDialogManager.DialogManagerInfo dialogManagerInfo = new MainDialogManager.DialogManagerInfo("teenager", new a(this, new WeakReference(context)), 101, false);
            dialogManagerInfo.setMainOnly(false);
            MainDialogManager.addDialog(dialogManagerInfo, context);
        }
    }

    public final void u(Context context) {
        if (TeenagersModeKt.c() == TeenagersModeSource.App) {
            this.f110570p.i(context, true);
        }
    }
}
