package com.bilibili.paycoin;

import L3.C2511c;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.LongSparseArray;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.bilibili.api.BiliApiException;
import com.bilibili.bplus.followinglist.service.p0;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.router.Router;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.pvtracker.PageViewTracker;
import dq0.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.paycoin.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/c.class */
public final class C5579c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ComponentActivity f74761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PayCoinsView f74762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public j f74763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final InterfaceC5577a f74764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public i f74765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public h f74766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.page.intro.module.kingposition.s f74767g;

    @NotNull
    public final LongSparseArray<h> h = new LongSparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f74768i = LazyKt.lazy(new C2511c(4));

    /* JADX INFO: renamed from: com.bilibili.paycoin.c$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/c$a.class */
    public static final class a extends AsyncTask<Context, Void, AccountInfo> {
        @Override // android.os.AsyncTask
        public final AccountInfo doInBackground(Context[] contextArr) {
            AccountInfo accountInfoRequestForMyAccountInfo;
            try {
                accountInfoRequestForMyAccountInfo = BiliAccountInfo.Companion.get().requestForMyAccountInfo();
            } catch (Exception e7) {
                accountInfoRequestForMyAccountInfo = null;
            }
            return accountInfoRequestForMyAccountInfo;
        }
    }

    public C5579c(@Nullable ComponentActivity componentActivity, @NotNull InterfaceC5577a interfaceC5577a) {
        this.f74761a = componentActivity;
        this.f74764d = interfaceC5577a;
    }

    public C5579c(@NotNull Fragment fragment, @NotNull p0 p0Var) {
        this.f74761a = fragment.p3();
        this.f74764d = p0Var;
    }

    public static final void a(C5579c c5579c, int i7, Throwable th, InterfaceC5577a interfaceC5577a) {
        String str;
        ComponentActivity componentActivity = c5579c.f74761a;
        if (componentActivity == null) {
            return;
        }
        if (th instanceof BiliApiException) {
            BiliApiException biliApiException = (BiliApiException) th;
            int i8 = biliApiException.mCode;
            String message = biliApiException.getMessage();
            str = message;
            if (i8 == -110) {
                AccountService accountService = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default");
                str = message;
                if (accountService != null) {
                    accountService.bindPhone(componentActivity);
                    str = message;
                }
            }
        } else {
            str = null;
        }
        new AsyncTask().execute(componentActivity);
        String string = componentActivity.getString(2131847110);
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        }
        k kVarA = k.a(i7, string + str2, false, false);
        if (interfaceC5577a != null) {
            interfaceC5577a.a(kVarA);
        }
        BLog.e("PayCoinHelper", th);
    }

    public static final void b(C5579c c5579c, boolean z6, boolean z7, String str, String str2, int i7, int i8, InterfaceC5577a interfaceC5577a) {
        h hVar;
        ComponentActivity componentActivity = c5579c.f74761a;
        if (componentActivity == null) {
            return;
        }
        if (interfaceC5577a != null) {
            k kVarA = k.a(i8, componentActivity.getString(2131845805), true, z7);
            kVarA.f74802e = str;
            interfaceC5577a.a(kVarA);
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"coin_to_like_success", "click"});
        }
        new AsyncTask().execute(componentActivity);
        if (i7 != 1 || (hVar = c5579c.f74766f) == null) {
            return;
        }
        hVar.f74788b += i8;
    }

    public final void c(int i7, boolean z6, String str, m mVar, d.a aVar) {
        int i8 = mVar.f74805b;
        long j7 = i8 == 2 ? mVar.f74810g : 0L;
        int i9 = 0;
        if (i8 != 2 && z6) {
            i9 = 1;
        }
        long j8 = mVar.f74804a;
        String str2 = mVar.f74806c;
        String str3 = mVar.f74807d;
        String str4 = mVar.f74808e;
        String str5 = mVar.f74814l;
        String str6 = mVar.f74815m;
        String str7 = mVar.f74816n;
        String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
        dq0.d dVar = (dq0.d) this.f74768i.getValue();
        if (dVar != null) {
            dVar.a(new d.b(j8, i7, i8, str2, Integer.valueOf(i9), Long.valueOf(j7), str3, str4, str5, str6, str7, str, strCurrentPolarisActionId), aVar);
        }
    }

    public final void d() {
        PayCoinsView payCoinsView = this.f74762b;
        if (payCoinsView == null || !payCoinsView.isShowing()) {
            return;
        }
        payCoinsView.cancel();
    }

    @JvmOverloads
    public final void e(@Nullable m mVar, @Nullable String str) {
        ComponentActivity componentActivity = this.f74761a;
        if (componentActivity == null) {
            return;
        }
        if (!BiliAccounts.get(componentActivity).isLogin()) {
            Router.RouterProxy routerProxyWith = Router.Companion.global().with(componentActivity);
            if (!TextUtils.isEmpty(str)) {
                routerProxyWith.with("key_toast", str);
            }
            routerProxyWith.with("key_prompt_scene", mVar.f74811i);
            routerProxyWith.with("from_spmid", mVar.f74812j);
            routerProxyWith.with("extend", mVar.f74813k);
            routerProxyWith.open("activity://main/login/");
            return;
        }
        long j7 = mVar.f74804a;
        h hVar = this.h.get(j7);
        if (hVar == null) {
            h hVar2 = new h();
            hVar2.f74787a = mVar.f74809f;
            this.f74766f = hVar2;
            this.h.put(j7, hVar2);
        } else {
            this.f74766f = hVar;
        }
        if (BiliAccountInfo.Companion.get().getAccountInfoFromCache() == null) {
            Router.Companion.global().with(componentActivity).open("activity://main/login/");
            return;
        }
        d();
        PayCoinsView payCoinsView = new PayCoinsView(componentActivity);
        payCoinsView.setOnCancelListener(null);
        payCoinsView.setOnDismissListener(this.f74767g);
        payCoinsView.f74717E = mVar.f74809f;
        i iVar = this.f74765e;
        if (iVar != null) {
            payCoinsView.f74721I = iVar;
        }
        payCoinsView.f74719G = mVar.h;
        int i7 = mVar.f74805b;
        payCoinsView.f74720H = i7 == 2;
        if (i7 == 1 || i7 == 2) {
            payCoinsView.f74718F = false;
        } else {
            payCoinsView.f74718F = true;
        }
        payCoinsView.show();
        payCoinsView.f74716D = new g(this, componentActivity, mVar);
        this.f74762b = payCoinsView;
    }
}
