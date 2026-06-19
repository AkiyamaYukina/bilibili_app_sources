package com.bilibili.opd.app.bizcommon.hybridruntime.neul;

import Am0.C1412a;
import Am0.e;
import Am0.f;
import Fm0.C1896d;
import Fm0.C1897e;
import Fm0.C1900h;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.compose.ui.text.font.Font;
import com.bilibili.base.MainThread;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.opd.app.bizcommon.biliapm.APMRecorder;
import com.bilibili.opd.app.bizcommon.hybridruntime.neul.NeulConfig;
import com.bilibili.opd.app.bizcommon.hybridruntime.neul.NeulPool;
import com.bilibili.opd.app.bizcommon.hybridruntime.neul.NeulService;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.HybridWebViewV2;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.UrlHelper;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/NeulService.class */
public final class NeulService extends IntentService {
    public static final int ACTION_NEUL_CLOSE = 3;
    public static final int ACTION_NEUL_FORCE_LOAD = 4;
    public static final int ACTION_NEUL_OPEN = 1;
    public static final int ACTION_NEUL_THEME_CHANGED = 2;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int SUB_ACTION_NEUL_COLD_LAUNCH = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static NeulConfig f73586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f73587b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/neul/NeulService$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getMidInNeulBlackList() {
            return NeulService.f73587b;
        }

        @Nullable
        public final NeulConfig getNeulConfig() {
            return NeulService.f73586a;
        }

        public final void setMidInNeulBlackList(boolean z6) {
            NeulService.f73587b = z6;
        }

        public final void setNeulConfig(@Nullable NeulConfig neulConfig) {
            NeulService.f73586a = neulConfig;
        }
    }

    public NeulService() {
        super("NeulService");
    }

    public final void a(Bundle bundle) {
        ArrayList<String> stringArrayList;
        final NeulConfig neulConfig = f73586a;
        if (neulConfig == null || !neulConfig.available()) {
            return;
        }
        ConfigManager.Companion companion = ConfigManager.Companion;
        Object obj = Contract.get$default(companion.ab(), "mall_neul_ark_all", (Object) null, 2, (Object) null);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(obj, bool)) {
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> speedPageUrls = neulConfig.getSpeedPageUrls();
            if (speedPageUrls != null) {
                arrayList.addAll(speedPageUrls);
            }
            stringArrayList = arrayList;
            if (Intrinsics.areEqual(Contract.get$default(companion.ab(), "mall_neul_more_webview", (Object) null, 2, (Object) null), bool)) {
                ArrayList<String> testNeulUrls = neulConfig.getTestNeulUrls();
                stringArrayList = arrayList;
                if (testNeulUrls != null) {
                    arrayList.addAll(testNeulUrls);
                    stringArrayList = arrayList;
                }
            }
        } else {
            stringArrayList = bundle.getStringArrayList("urls");
        }
        if (stringArrayList != null) {
            for (String str : stringArrayList) {
                if (!TextUtils.isEmpty(str) && C1412a.b(neulConfig, str)) {
                    final String strA = C1412a.a(str);
                    MainThread.runOnMainThread(new Function0(this, strA, neulConfig) { // from class: Am0.g

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final NeulService f352a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f353b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final NeulConfig f354c;

                        {
                            this.f352a = this;
                            this.f353b = strA;
                            this.f354c = neulConfig;
                        }

                        public final Object invoke() {
                            HybridWebViewV2 hybridWebViewV2;
                            NeulService neulService = this.f352a;
                            String str2 = this.f353b;
                            NeulConfig neulConfig2 = this.f354c;
                            NeulService.Companion companion2 = NeulService.Companion;
                            Lazy<NeulPool> lazy = NeulPool.f73574l;
                            NeulPool neulPoolA = NeulPool.a.a();
                            int timeout = neulConfig2.getTimeout();
                            neulPoolA.getClass();
                            synchronized (NeulPool.f73575m) {
                                neulPoolA.f73583i = true;
                                if (!neulPoolA.f73576a.containsKey(str2)) {
                                    if (neulPoolA.f73578c.containsKey(str2) && (hybridWebViewV2 = neulPoolA.f73578c.get(str2)) != null) {
                                        long jElapsedRealtime = SystemClock.elapsedRealtime() - hybridWebViewV2.getNeulStartTime();
                                        if (jElapsedRealtime >= Font.MaximumAsyncTimeoutMillis) {
                                            BLog.d("Neul", "ark page timeout: " + hybridWebViewV2.mLoadUrl);
                                            neulPoolA.f73578c.remove(str2);
                                            APMRecorder.Builder builder = new APMRecorder.Builder();
                                            builder.product("hyg-web").duration(String.valueOf(jElapsedRealtime)).extJson("{\"loadPageCount\": " + neulPoolA.h + ", \"url\": \"" + str2 + "\"}").subEvent("ark_page_timeout");
                                            APMRecorder.Companion.getInstance().record(builder.build());
                                        }
                                    }
                                    if (!neulPoolA.f73582g) {
                                        neulPoolA.f73580e = SystemClock.elapsedRealtime();
                                        neulPoolA.f73582g = true;
                                    }
                                    Context applicationContext = neulService.getApplicationContext();
                                    if (applicationContext != null) {
                                        HybridWebViewV2 hybridWebViewV22 = new HybridWebViewV2(applicationContext, "mall");
                                        Uri uri = Uri.parse(str2);
                                        String str3 = "";
                                        if (uri != null) {
                                            String authority = uri.getAuthority();
                                            String str4 = authority;
                                            if (authority == null) {
                                                str4 = "";
                                            }
                                            str3 = str4 + uri.getPath();
                                            if (str3 == null) {
                                                str3 = "";
                                            }
                                        }
                                        neulPoolA.f73578c.put(str3, hybridWebViewV22);
                                        hybridWebViewV22.loadNeulPage("https://".concat(str3), timeout);
                                        BLog.d("Neul", "start loadNeulPage: ".concat(str3));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.IntentService, android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@Nullable Intent intent) {
        HybridWebViewV2 hybridWebViewV2;
        String strAppendFragments;
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i7 = extras.getInt("action", -1);
                BLog.d("NeulService=>" + i7);
                if (i7 != 1) {
                    if (i7 == 2) {
                        if (getApplicationContext() != null) {
                            MainThread.runOnMainThread(new e(0));
                            return;
                        }
                        return;
                    }
                    if (i7 == 3) {
                        f73587b = true;
                        MainThread.runOnMainThread(new f(0));
                        return;
                    }
                    if (i7 != 4) {
                        if (f73587b) {
                            MainThread.runOnMainThread(new f(0));
                            return;
                        } else {
                            a(extras);
                            return;
                        }
                    }
                    f73587b = false;
                    if (extras.getInt("sub_action", -1) == 5) {
                        Lazy<NeulPool> lazy = NeulPool.f73574l;
                        if (!NeulPool.a.a().f73583i) {
                            C1412a.c(MapsKt.mapOf(new Pair[]{TuplesKt.to("last_open_days", String.valueOf(extras.getInt("last_open_days", 0))), TuplesKt.to("report_action", "preload")}));
                        }
                    }
                    a(extras);
                    return;
                }
                String string = extras.getString("url");
                String string2 = extras.getString("data");
                if (string != null) {
                    Lazy<NeulPool> lazy2 = NeulPool.f73574l;
                    NeulPool neulPoolA = NeulPool.a.a();
                    Uri uri = Uri.parse(string);
                    String str = "";
                    if (uri != null) {
                        String authority = uri.getAuthority();
                        String str2 = authority;
                        if (authority == null) {
                            str2 = "";
                        }
                        str = str2 + uri.getPath();
                        if (str == null) {
                            str = "";
                        }
                    }
                    neulPoolA.getClass();
                    synchronized (NeulPool.f73575m) {
                        HybridWebViewV2 hybridWebViewV22 = neulPoolA.f73576a.get(str);
                        hybridWebViewV2 = hybridWebViewV22;
                        if (hybridWebViewV22 == null) {
                            Pair<String, HybridWebViewV2> pairA = neulPoolA.a("queryWebView", str);
                            hybridWebViewV2 = pairA != null ? (HybridWebViewV2) pairA.getSecond() : null;
                        }
                    }
                    if (hybridWebViewV2 != null) {
                        if (UrlHelper.isMallDomain(string) || UrlHelper.isShowDomain(string)) {
                            SparseArray<int[]> sparseArray = C1897e.f6313a;
                            String strA = C1900h.a(C1897e.a.a(null));
                            String str3 = strA;
                            if (TextUtils.isEmpty(strA)) {
                                str3 = "0";
                            }
                            strAppendFragments = UrlHelper.appendFragments(string, "themeType", str3);
                        } else {
                            strAppendFragments = string;
                        }
                        final String str4 = "if (!!window.kfptOpenUrl) { window.kfptOpenUrl('" + strAppendFragments + "', " + string2 + ", " + System.currentTimeMillis() + "); } else { location.replace('" + string + "'); }";
                        final HybridWebViewV2 hybridWebViewV23 = hybridWebViewV2;
                        MainThread.runOnMainThread(new Function0(hybridWebViewV23, str4) { // from class: Am0.d

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final HybridWebViewV2 f348a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f349b;

                            {
                                this.f348a = hybridWebViewV23;
                                this.f349b = str4;
                            }

                            public final Object invoke() {
                                NeulService.Companion companion = NeulService.Companion;
                                C1896d.b(this.f348a.getWebView(), this.f349b);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
            } catch (Exception e7) {
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i7, int i8) {
        return super.onStartCommand(intent, 1, i8);
    }
}
