package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.opd.app.bizcommon.sentinel.page.PageDetector;
import com.bilibili.opd.app.sentinel.Log;
import com.bilibili.opd.app.sentinel.SentinelXXX;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym0.C9065c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/b.class */
public final class b {
    public static boolean h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KFCWebFragmentV2 f73717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C9065c f73718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public HybridWebViewV2 f73719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Uri f73720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f73721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public Map<String, JSONObject> f73722f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public Map<String, Integer> f73723g = new LinkedHashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/b$a.class */
    public static final class a {
        public static void a(@Nullable String str, @Nullable SentinelXXX sentinelXXX, @Nullable String str2) {
            if (sentinelXXX == null) {
                return;
            }
            Boolean bool = (Boolean) ConfigManager.Companion.ab().get("mall_web_http_request_check", Boolean.FALSE);
            if (!(bool != null ? bool.booleanValue() : false) || str2 == null) {
                return;
            }
            boolean z6 = false;
            if (str != null) {
                z6 = false;
                if (StringsKt.Z(str, "http://")) {
                    z6 = true;
                }
            }
            if (z6) {
                Log logMonitorBySucRate = sentinelXXX.customLog(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, "public.apm.tracker.http").description(str).duration(0L).monitorBySucRate(true);
                logMonitorBySucRate.mMsg = str2;
                logMonitorBySucRate.report();
            }
        }

        @NotNull
        public static PageStatus b(@Nullable HybridWebViewV2 hybridWebViewV2, @Nullable Uri uri) {
            return (hybridWebViewV2 == null || hybridWebViewV2.getWebView() == null || hybridWebViewV2.getContext() == null) ? PageStatus.VIEW_EMPTY : uri == null ? PageStatus.URL_EMPTY : (hybridWebViewV2 == null || (hybridWebViewV2.getLoadState() & 4) != 4) ? (hybridWebViewV2 == null || (hybridWebViewV2.getLoadState() & 2) != 2) ? (hybridWebViewV2 == null || (hybridWebViewV2.getLoadState() & 1) != 1) ? PageStatus.UNKOWN : PageStatus.LOADING : PageStatus.SUCCESS : PageStatus.FAIL;
        }
    }

    public b(@Nullable Uri uri, @NotNull KFCWebFragmentV2 kFCWebFragmentV2) {
        this.f73717a = kFCWebFragmentV2;
        this.f73720d = uri;
        this.f73721e = -1L;
        this.f73721e = System.currentTimeMillis();
    }

    public final void a(@NotNull HashMap<String, Object> map, @Nullable HashMap<String, String> map2, @Nullable Map<String, String> map3) {
        String string;
        Map<String, String> extras;
        KFCWebFragmentV2 kFCWebFragmentV2 = this.f73717a;
        try {
            if (this.f73718b == null) {
                Uri uri = this.f73720d;
                this.f73718b = new C9065c("hyg-test", uri == null ? "pageRenderLogEmpty" : uri.getAuthority() + this.f73720d.getPath());
                HybridWebViewV2 hybridWebViewV2 = this.f73719c;
                int i7 = (hybridWebViewV2 == null || !Intrinsics.areEqual(PageDetector.TAG_PAGE_ERROR, hybridWebViewV2.getTag())) ? -1 : -2;
                C9065c c9065c = this.f73718b;
                c9065c.f129735c = i7;
                c9065c.f129736d = "0";
            }
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.f73722f.isEmpty()) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : ((LinkedHashMap) this.f73722f).entrySet()) {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    }
                    jSONObject.put("apm-log", jSONObject2);
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            JSONObject jSONObject3 = new JSONObject(new HashMap());
            try {
                PageDetector pageDetector = kFCWebFragmentV2.getPageDetector();
                if (pageDetector == null || (extras = pageDetector.getExtras()) == null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        jSONObject3.put(entry2.getKey(), (Object) entry2.getValue());
                    }
                    if (map3 != null) {
                        for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                            jSONObject3.put(entry3.getKey(), (Object) entry3.getValue());
                        }
                    }
                } else {
                    for (Map.Entry<String, String> entry4 : extras.entrySet()) {
                        jSONObject3.put(entry4.getKey(), (Object) entry4.getValue());
                    }
                }
                jSONObject3.put("webPageStatus", (Object) new JSONObject(map));
            } catch (Exception e8) {
            }
            jSONObject.put("na-log", jSONObject3);
            Uri uri2 = kFCWebFragmentV2.f73679k;
            if (uri2 != null && (string = uri2.toString()) != null) {
                jSONObject.put("originUrl", string);
            }
            C9065c c9065c2 = this.f73718b;
            if (c9065c2 != null) {
                String string2 = jSONObject.toString();
                String str = string2;
                if (string2 == null) {
                    str = "";
                }
                c9065c2.f129737e = str;
            }
            C9065c c9065c3 = this.f73718b;
            if (c9065c3 != null) {
                c9065c3.b();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:78|7|10|(1:12)(1:13)|14|(2:74|15)|(1:17)(13:18|20|(1:23)|24|(1:26)|76|27|30|70|31|(5:33|(1:35)|36|80|(3:72|38|(4:40|41|42|82)(1:81))(2:45|(5:47|(1:49)(1:52)|53|54|83)(2:55|56)))|61|(1:63)(2:64|(2:66|67)(1:85)))|19|20|(0)|24|(0)|76|27|30|70|31|(0)|61|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(21:78|7|10|(1:12)(1:13)|14|74|15|(1:17)(13:18|20|(1:23)|24|(1:26)|76|27|30|70|31|(5:33|(1:35)|36|80|(3:72|38|(4:40|41|42|82)(1:81))(2:45|(5:47|(1:49)(1:52)|53|54|83)(2:55|56)))|61|(1:63)(2:64|(2:66|67)(1:85)))|19|20|(0)|24|(0)|76|27|30|70|31|(0)|61|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r17 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0280, code lost:
    
        r16 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1 A[Catch: Exception -> 0x0280, TRY_LEAVE, TryCatch #0 {Exception -> 0x0280, blocks: (B:31:0x00b9, B:33:0x00c1, B:36:0x00d5), top: B:70:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0294 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(@org.jetbrains.annotations.NotNull com.alibaba.fastjson.JSONObject r8) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.b.b(com.alibaba.fastjson.JSONObject):void");
    }
}
