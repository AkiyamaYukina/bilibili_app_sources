package com.bilibili.studio.comm.manager;

import Co.C1521a;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.comm.api.bean.ABData;
import com.google.gson.Gson;
import iw0.InterfaceC7621a;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import yw0.C9103a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/n.class */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy<n> f105410f = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Cn.b(11));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f105411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f105412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f105413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f105414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f105415e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/n$a.class */
    public static final class a {
        @NotNull
        public static n a() {
            return (n) n.f105410f.getValue();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/n$b.class */
    public static final class b extends BiliApiCallback<GeneralResponse<ABData>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f105416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f105417c;

        public b(long j7, n nVar) {
            this.f105416b = j7;
            this.f105417c = nVar;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            v0.b(System.currentTimeMillis() - this.f105416b, "initAb onError time=", "UpperABTestManager");
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onSuccess(GeneralResponse<ABData> generalResponse) {
            ABData aBData;
            GeneralResponse<ABData> generalResponse2 = generalResponse;
            HashMap<String, String> map = (generalResponse2 == null || (aBData = generalResponse2.data) == null) ? null : aBData.map;
            BLog.e("UpperABTestManager", "initAb time=" + (System.currentTimeMillis() - this.f105416b) + "," + map);
            if (map == null || map.isEmpty()) {
                BLog.e("UpperABTestManager", "initAb fail isEmpty");
                return;
            }
            n nVar = this.f105417c;
            nVar.f105413c.clear();
            nVar.f105413c.putAll(map);
            nVar.f105414d.clear();
            nVar.f105414d.putAll(map);
            n.a(nVar);
        }
    }

    public n() {
        Lazy lazy = LazyKt.lazy(new Cn.c(9));
        this.f105411a = lazy;
        Lazy lazy2 = LazyKt.lazy(new C1521a(12));
        this.f105412b = lazy2;
        this.f105413c = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();
        this.f105414d = map;
        SharedPrefX sharedPrefX = (SharedPrefX) lazy.getValue();
        String string = sharedPrefX != null ? sharedPrefX.getString("key_upper_ab_test", "") : null;
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            HashMap map2 = (HashMap) ((Gson) lazy2.getValue()).fromJson(string, new q().getType());
            if (map2.isEmpty()) {
                return;
            }
            map.clear();
            map.putAll(map2);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public static final void a(n nVar) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if (nVar.f105414d.isEmpty()) {
            return;
        }
        String json = ((Gson) nVar.f105412b.getValue()).toJson(nVar.f105414d);
        SharedPrefX sharedPrefX = (SharedPrefX) nVar.f105411a.getValue();
        if (sharedPrefX == null || (editorEdit = sharedPrefX.edit()) == null || (editorPutString = editorEdit.putString("key_upper_ab_test", json)) == null) {
            return;
        }
        editorPutString.commit();
    }

    public static void b(String str, BiliApiCallback biliApiCallback) {
        long jMid = BiliAccounts.get(BiliContext.application()).mid();
        String str2 = C9103a.f129912a;
        BiliCall<GeneralResponse<ABData>> aBData = ((InterfaceC7621a) ServiceGenerator.createService(InterfaceC7621a.class)).getABData(str, String.valueOf(jMid), C9103a.C1393a.a());
        if (aBData != null) {
            aBData.enqueue(biliApiCallback);
        }
    }

    public final String c(String str, String str2, boolean z6) {
        String str3 = this.f105413c.get(str);
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        if (z6) {
            String str4 = this.f105414d.get(str);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
        }
        return str2;
    }

    public final void d() {
        if (this.f105415e) {
            BLog.e("UpperABTestManager", "isInitData == true return");
            return;
        }
        this.f105415e = true;
        b(C4496a.a("upper_igv_process,", r.f105422a), new b(System.currentTimeMillis(), this));
    }
}
