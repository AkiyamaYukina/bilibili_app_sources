package com.bilibili.opd.app.bizcommon.sentinel.page;

import G.p;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.c;
import com.alibaba.fastjson.JSON;
import com.bilibili.droid.ToastHelper;
import com.bilibili.opd.app.bizcommon.biliapm.APMRecorder;
import com.bilibili.opd.app.bizcommon.context.KFCFragmentLoaderActivity;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.opd.app.bizcommon.sentinel.page.PageDetector;
import com.bilibili.opd.app.sentinel.SentinelXXX;
import com.bilibili.playerbizcommon.features.background.b;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sn0.C8602b;
import sn0.C8603c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/page/PageDetector.class */
public class PageDetector {
    public static final String IS_DYNAMIC = "isDynamic";
    public static final String NETWORK_CODE = "networkCode";
    public static final String PAGE_DROP = "page_drop";
    public static final String PAGE_START_KEY = "_page_start";
    public static final String PAGE_START_KEY_2 = "_page_start2";
    public static final String PAGE_WEB_KEY = "_page_webStared";
    public static final String TAG_PAGE_ERROR = "page_error";
    public static final String TAG_PAGE_RENDERED = "page_rendered";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final PageDetector f74505p = new PageDetector();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C8603c f74506q = new C8603c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SentinelXXX f74507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SoftReference<View> f74508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SoftReference<Context> f74509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f74510d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f74512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f74513g;
    public long h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<String> f74516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f74517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f74518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f74519n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f74514i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<String, String> f74515j = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map<String, Object> f74520o = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f74511e = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/sentinel/page/PageDetector$a.class */
    public final class a implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PageDetector f74521a;

        public a(PageDetector pageDetector) {
            this.f74521a = pageDetector;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j7) {
            View view;
            PageDetector pageDetector = this.f74521a;
            if (pageDetector.f74511e) {
                return;
            }
            SoftReference<View> softReference = pageDetector.f74508b;
            if (softReference == null || (view = softReference.get()) == null) {
                this.f74521a.stop();
                return;
            }
            if (view.findViewWithTag("page_rendered") != null) {
                PageDetector pageDetector2 = this.f74521a;
                if (!pageDetector2.f74514i) {
                    pageDetector2.suc();
                    this.f74521a.stop();
                    return;
                }
            }
            C8603c c8603c = PageDetector.f74506q;
            if (view.findViewWithTag(c8603c) != null && !this.f74521a.f74514i) {
                C8602b.b("pageDetector frame catch: " + SystemClock.elapsedRealtime());
                Object tag = view.findViewWithTag(c8603c).getTag();
                if (tag instanceof C8603c) {
                    this.f74521a.suc(((C8603c) tag).f127287a);
                    this.f74521a.stop();
                    return;
                }
            } else if (view.findViewWithTag(PageDetector.TAG_PAGE_ERROR) != null) {
                this.f74521a.error();
                this.f74521a.stop();
                return;
            }
            if (!this.f74521a.b()) {
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
            this.f74521a.stop();
            if (this.f74521a.f74507a.isDebug()) {
                this.f74521a.c("页面速度检测超时，请确认埋点是否正确");
            }
        }
    }

    public static PageDetector create(String str, SentinelXXX sentinelXXX, View view, Intent intent, Context context, long j7) {
        return create(str, sentinelXXX, view, intent, context, j7, PAGE_START_KEY);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.bilibili.opd.app.bizcommon.sentinel.page.PageDetector, java.lang.Object] */
    public static PageDetector create(String str, SentinelXXX sentinelXXX, View view, Intent intent, Context context, long j7, String str2) {
        long j8;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        PageDetector pageDetector = f74505p;
        if (!zIsEmpty && sentinelXXX != null && view != null && intent != null) {
            if (!sentinelXXX.isEnabled()) {
                return pageDetector;
            }
            try {
                String stringExtra = intent.getStringExtra(str2);
                if (TextUtils.isEmpty(stringExtra)) {
                    return pageDetector;
                }
                intent.putExtra(str2, "");
                ?? obj = new Object();
                obj.f74514i = false;
                obj.f74515j = new HashMap();
                obj.f74520o = new HashMap();
                obj.f74510d = str;
                if (str != null && str.startsWith("http")) {
                    try {
                        String strDecode = URLDecoder.decode(str, "utf-8");
                        obj.f74518m = strDecode;
                        String strReplaceAll = strDecode.replaceAll("^(https|http)://", "");
                        obj.f74518m = strReplaceAll;
                        if (strReplaceAll.contains("?")) {
                            String str3 = obj.f74518m;
                            obj.f74518m = URLEncoder.encode(str3.substring(0, str3.indexOf(63)), "utf-8");
                        }
                    } catch (UnsupportedEncodingException e7) {
                        Log.e("PageDetector", "PageDetector: ", e7);
                    }
                }
                obj.f74507a = sentinelXXX;
                obj.f74508b = new SoftReference<>(view);
                obj.f74511e = !sentinelXXX.isEnabled();
                try {
                    j8 = Long.parseLong(stringExtra);
                } catch (Exception e8) {
                    j8 = -1;
                }
                obj.f74512f = j8;
                C8602b.a("create pageName: " + str + " mPageStart:" + j8);
                obj.f74509c = new SoftReference<>(context);
                obj.h = j7;
                return obj;
            } catch (Exception e9) {
            }
        }
        return pageDetector;
    }

    public static void drop(String str, SentinelXXX sentinelXXX, long j7) {
        if (TextUtils.isEmpty(str) || sentinelXXX == null || !sentinelXXX.isEnabled() || j7 < 500) {
            return;
        }
        sentinelXXX.customLog(PAGE_DROP, str).duration(j7).monitorBySucRate(false).report();
    }

    public static void error(String str, SentinelXXX sentinelXXX, String str2) {
        error(str, sentinelXXX, str2, null);
    }

    public static void error(String str, SentinelXXX sentinelXXX, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || sentinelXXX == null || !sentinelXXX.isEnabled()) {
            return;
        }
        sentinelXXX.customLog(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, str).putExtras(map).error(str2, null).monitorBySucRate(false).report();
    }

    public static void suc(String str, SentinelXXX sentinelXXX, long j7) {
        if (TextUtils.isEmpty(str) || sentinelXXX == null || !sentinelXXX.isEnabled()) {
            return;
        }
        sentinelXXX.customLog(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, str).duration(j7).monitorBySucRate(true).report();
        sentinelXXX.customLog(PAGE_DROP, str).duration(j7).monitorBySucRate(true).report();
    }

    public final void a(int i7, long j7, String str) {
        Object obj;
        APMRecorder.Builder builder = new APMRecorder.Builder();
        boolean zIsEmpty = TextUtils.isEmpty(this.f74518m);
        String str2 = this.f74510d;
        String str3 = !zIsEmpty ? this.f74518m : str2;
        builder.subEvent(str3).bizCode(i7).duration(j7 + "");
        if (((HashMap) this.f74520o).containsKey(NETWORK_CODE) && (obj = ((HashMap) this.f74520o).get(NETWORK_CODE)) != null) {
            builder.networkCode(obj.toString());
        }
        if (TextUtils.isEmpty(str)) {
            SentinelXXX sentinelXXX = this.f74507a;
            if (sentinelXXX != null && !TextUtils.isEmpty(sentinelXXX.getProductKey())) {
                builder.product(sentinelXXX.getProductKey());
            }
        } else {
            String strA = str;
            if (this.f74519n) {
                strA = p.a(str, "-web");
            }
            builder.product(strA);
        }
        Map<String, String> map = this.f74515j;
        if (map != null) {
            map.put("originUrl", str2);
            builder.extJson(JSON.toJSONString(this.f74515j));
        }
        C8602b.a("apmReport subEvent: " + str3 + " duration: " + j7);
        APMRecorder.Companion.getInstance().record(builder.build());
    }

    public final boolean b() {
        return SystemClock.elapsedRealtime() - this.f74513g > 45000;
    }

    public final void c(final String str) {
        final Context context = this.f74509c.get();
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable(context, str) { // from class: sn0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f127285a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f127286b;

            {
                this.f127285a = context;
                this.f127286b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = this.f127285a;
                String str2 = this.f127286b;
                String str3 = PageDetector.TAG_PAGE_RENDERED;
                ToastHelper.showToastShort(context2, str2);
            }
        });
    }

    public void drop() {
        Object obj;
        if (this.f74511e) {
            return;
        }
        stop();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f74512f;
        SentinelXXX sentinelXXX = this.f74507a;
        String productKey = sentinelXXX.getProductKey();
        APMRecorder.Builder builder = new APMRecorder.Builder();
        boolean zIsEmpty = TextUtils.isEmpty(this.f74518m);
        String str = this.f74510d;
        String str2 = !zIsEmpty ? this.f74518m : str;
        int i7 = jElapsedRealtime < 10 ? 0 : jElapsedRealtime < 100 ? -100 : jElapsedRealtime < 5000 ? (-((((int) jElapsedRealtime) / 100) + 1)) * 100 : jElapsedRealtime < 10000 ? (-((((int) jElapsedRealtime) / 1000) + 1)) * 1000 : jElapsedRealtime < UpperTimeline.MIN_CLIP_DURATION ? (-((((int) jElapsedRealtime) / KFCFragmentLoaderActivity.REQ_CODE_LOGIN) + 1)) * KFCFragmentLoaderActivity.REQ_CODE_LOGIN : -100000;
        builder.subEvent(str2 + "_drop");
        builder.bizCode(i7).duration(jElapsedRealtime + "");
        if (((HashMap) this.f74520o).containsKey(NETWORK_CODE) && (obj = ((HashMap) this.f74520o).get(NETWORK_CODE)) != null) {
            builder.networkCode(obj.toString());
        }
        if (!TextUtils.isEmpty(productKey)) {
            String strA = productKey;
            if (this.f74519n) {
                strA = p.a(productKey, "-web");
            }
            builder.product(strA);
        } else if (!TextUtils.isEmpty(sentinelXXX.getProductKey())) {
            builder.product(sentinelXXX.getProductKey());
        }
        Map<String, String> map = this.f74515j;
        if (map != null && map.size() > 0) {
            builder.extJson(JSON.toJSONString(this.f74515j));
        }
        C8602b.a("apmDrop subEvent: " + str2 + "_drop, duration: " + jElapsedRealtime);
        APMRecorder.Companion.getInstance().record(builder.build());
        if (!this.f74519n) {
            a(-2, jElapsedRealtime, sentinelXXX.getProductKey());
        }
        if (jElapsedRealtime < 500 || b()) {
            return;
        }
        sentinelXXX.customLog(PAGE_DROP, str).duration(jElapsedRealtime).monitorBySucRate(false).report();
        if (sentinelXXX.isDebug()) {
            c("放弃访问页面:" + str);
        }
    }

    public void endByUserDefine(long j7) {
        List<String> list;
        if (this == f74505p) {
            return;
        }
        try {
            String str = this.f74510d;
            long j8 = j7 - this.f74512f;
            SentinelXXX sentinelXXX = this.f74507a;
            if (j8 >= 60000 || j8 < 0) {
                com.bilibili.opd.app.sentinel.Log logNeedTruncation = sentinelXXX.customLog("page_unusual", str).needTruncation(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f74512f;
                if (j8 < 0 && jElapsedRealtime > 10000 && (list = this.f74516k) != null && !list.isEmpty()) {
                    logNeedTruncation.needTruncation(false);
                    this.f74515j.put("pageDebugLog", Arrays.toString(this.f74516k.toArray()));
                }
                this.f74515j.put("pageStart", this.f74512f + "");
                this.f74515j.put("finishTime", j7 + "");
                this.f74515j.put("mDetectStart", this.f74513g + "");
                this.f74515j.put("endToStart", jElapsedRealtime + "");
                logNeedTruncation.duration(j8).putExtras(this.f74515j).monitorBySucRate(true).report();
                if (j8 < 0) {
                    C8602b.a("endByUserDefine subEvent: " + str + " duration<0: " + jElapsedRealtime);
                    a(-2, jElapsedRealtime, "hyg");
                }
            } else {
                sentinelXXX.customLog(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, str).duration(j8).putExtras(this.f74515j).needTruncation(false).monitorBySucRate(true).report();
                sentinelXXX.customLog(PAGE_DROP, str).duration(j8).putExtras(this.f74515j).needTruncation(false).monitorBySucRate(true).report();
                C8602b.a("endByUserDefine subEvent: " + str + " duration0..60: " + j8);
                a(200, j8, "hyg");
            }
            stop();
        } catch (Exception e7) {
        }
    }

    public void error() {
        if (this.f74511e) {
            return;
        }
        if (!b()) {
            SentinelXXX sentinelXXX = this.f74507a;
            String str = this.f74510d;
            sentinelXXX.customLog(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, str).putExtras(this.f74515j).monitorBySucRate(false).report();
            if (sentinelXXX.isDebug()) {
                c("页面打开失败:" + str);
            }
            C8602b.a("error subEvent: " + str + " duration: -1");
            a(-1, -1L, sentinelXXX.getProductKey());
        }
        stop();
    }

    @NonNull
    public Map<String, Object> getAPMPageExtra() {
        return this.f74520o;
    }

    public String getAPMPageName() {
        return this.f74518m;
    }

    public Map<String, String> getExtras() {
        return this.f74515j;
    }

    public void isStopByUserDefine(boolean z6) {
        this.f74514i = z6;
    }

    public void putExtra(String str, String str2) {
        if (str != null) {
            this.f74515j.put(str, str2);
        }
    }

    public void setAPMPageName(String str) {
        this.f74518m = str;
    }

    public void setExtras(Map<String, String> map) {
        if (this.f74515j.size() > 0) {
            this.f74515j.putAll(map);
        } else {
            this.f74515j = map;
        }
    }

    public void setIsWebPage() {
        this.f74519n = true;
    }

    public void setWebViewLogList(List<String> list) {
        this.f74516k = list;
    }

    public void start() {
        synchronized (this) {
            if (!this.f74511e && !this.f74519n) {
                if (this.f74517l == null) {
                    this.f74517l = new a(this);
                }
                Choreographer.getInstance().postFrameCallbackDelayed(this.f74517l, this.h);
                this.f74513g = SystemClock.elapsedRealtime();
                if (this.f74507a.isDebug()) {
                    c("开始检测页面速度:" + this.f74510d);
                }
            }
        }
    }

    public void stop() {
        if (this.f74511e) {
            return;
        }
        this.f74511e = true;
        if (this.f74517l != null) {
            Choreographer.getInstance().removeFrameCallback(this.f74517l);
        }
    }

    public void suc() {
        if (this.f74511e) {
            return;
        }
        if (!b()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f74512f;
            SentinelXXX sentinelXXX = this.f74507a;
            String str = this.f74510d;
            sentinelXXX.customLog(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, str).duration(jElapsedRealtime).putExtras(this.f74515j).monitorBySucRate(true).report();
            sentinelXXX.customLog(PAGE_DROP, str).duration(jElapsedRealtime).putExtras(this.f74515j).monitorBySucRate(true).report();
            if (sentinelXXX.isDebug()) {
                c(c.b(jElapsedRealtime, "页面打开成功:", str, " 耗时："));
            }
            C8602b.a("suc subEvent: " + str + " " + jElapsedRealtime);
            a(200, jElapsedRealtime, null);
        }
        stop();
    }

    public void suc(long j7) {
        if (this.f74511e) {
            return;
        }
        if (!b()) {
            long j8 = j7 - this.f74512f;
            SentinelXXX sentinelXXX = this.f74507a;
            String str = this.f74510d;
            sentinelXXX.customLog(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, str).duration(j8).putExtras(this.f74515j).monitorBySucRate(true).report();
            sentinelXXX.customLog(PAGE_DROP, str).duration(j8).putExtras(this.f74515j).monitorBySucRate(true).report();
            if (sentinelXXX.isDebug()) {
                c(c.b(j8, "页面打开成功:", str, " 耗时："));
            }
            StringBuilder sbA = b.a(j7, "pageDetector suc pageName ", str, " endTime: ");
            sbA.append(" duration: ");
            sbA.append(j8);
            C8602b.b(sbA.toString());
            a(200, j8, null);
        }
        stop();
    }
}
