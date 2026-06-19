package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import Fm0.C1896d;
import Fm0.RunnableC1895c;
import Gm0.C1998b;
import Gm0.C1999c;
import Gm0.C2000d;
import Gm0.C2001e;
import Gm0.C2002f;
import Gm0.C2003g;
import Gm0.C2009m;
import Gm0.C2011o;
import Pb.E;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsbProxy;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.jsbridge.legacy.WebBehavior;
import com.bilibili.lib.jsbridge.legacy.WebProxyV2;
import com.bilibili.lib.ui.webview2.WebProxy;
import com.bilibili.opd.app.bizcommon.context.KFCAppCompatActivity;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import com.bilibili.opd.app.bizcommon.hybridruntime.core.context.HybridContext;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.BiliWebViewHybridBridgeV2;
import java.util.Map;
import java.util.Objects;
import vm0.C8834a;
import vm0.C8836c;
import vm0.InterfaceC8835b;
import vm0.e;
import vm0.f;
import vm0.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/BiliWebViewHybridBridgeV2.class */
public class BiliWebViewHybridBridgeV2 implements InterfaceC8835b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HybridWebViewV2 f73624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73625b;
    public boolean h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f73632j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public HybridWebContext f73626c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public e f73627d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public WebProxyV2 f73628e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public JsbProxy f73629f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public f f73630g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public C2009m f73631i = null;

    public BiliWebViewHybridBridgeV2(HybridWebViewV2 hybridWebViewV2, String str) {
        if (hybridWebViewV2 == null || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f73624a = hybridWebViewV2;
        this.f73625b = str;
        Map<String, Map<String, C8834a>> map = C8836c.f128300a;
    }

    public final boolean a() {
        HybridWebContext hybridWebContext = this.f73626c;
        return (hybridWebContext == null || !hybridWebContext.checkLifecycle() || this.f73624a.isDestroied()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [Gm0.m, java.lang.Object] */
    public void attach(HybridWebContext hybridWebContext) {
        if (hybridWebContext == null) {
            return;
        }
        this.f73626c = hybridWebContext;
        checkAndInitBridge(hybridWebContext.getCurUri().toString());
        if (!isEnabled() || this.f73628e == null || this.f73629f == null) {
            return;
        }
        if (C8836c.f128301b) {
            Objects.toString(hybridWebContext.getCurUri());
        }
        this.f73632j = true;
        AppCompatActivity activity = hybridWebContext.getActivity();
        this.f73628e.attach(activity);
        if (this.f73629f != null) {
            BiliWebView webView = this.f73624a.getWebView();
            webView.registerAbilityOpenSchemeBehavior(new C1998b(hybridWebContext));
            webView.registerAbilityCurrentThemeTypeBehavior(new C1999c(hybridWebContext));
            webView.registerAbilityReportEventV3Behavior(new C2000d(this, hybridWebContext));
            webView.registerAuthLoginBehavior(new C2001e(webView.getJsbProxy().getJsbContext(), hybridWebContext));
            webView.registerUiSetTitleBehavior(new C2002f(hybridWebContext));
            webView.setBiliSpecialJsBridgeCallback(new C2003g(hybridWebContext));
        }
        WebProxyV2 webProxyV2 = this.f73628e;
        JsbProxy jsbProxy = this.f73629f;
        ?? obj = new Object();
        obj.f7275a = webProxyV2;
        obj.f7276b = jsbProxy;
        obj.f7277c = hybridWebContext;
        obj.f7278d = this;
        this.f73631i = obj;
        if (KFCAppCompatActivity.class.isInstance(activity)) {
            ((KFCAppCompatActivity) activity).registerLifecycleListener(this.f73631i);
        } else {
            hybridWebContext.registerLifecycleListener(this.f73631i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vm0.h callNative(vm0.InterfaceC8835b.C1367b r7, com.alibaba.fastjson.JSONObject r8) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.BiliWebViewHybridBridgeV2.callNative(vm0.b$b, com.alibaba.fastjson.JSONObject):vm0.h");
    }

    @Nullable
    public h callNative(InterfaceC8835b.C1367b c1367b, JSONObject jSONObject, HybridContext hybridContext) {
        h hVar;
        if (c1367b == null || !c1367b.b()) {
            hVar = new h(1000, null, null);
        } else if (a()) {
            if (C8836c.f128301b) {
                jSONObject.toJSONString();
            }
            try {
                C2011o c2011o = c1367b.a() ? new C2011o(c1367b.f128299d, this) : null;
                if (this.f73627d == null) {
                    this.f73627d = new e(C8836c.a(this.f73625b));
                }
                h hVarA = this.f73627d.a(c1367b, jSONObject, hybridContext, c2011o);
                hVar = hVarA;
                if (hVarA != null) {
                    return hVarA;
                }
            } catch (Exception e7) {
                hVar = new h(1001, e7.getMessage(), null);
            }
        } else {
            hVar = new h(1003, null, null);
        }
        if (c1367b != null && c1367b.a()) {
            InterfaceC8835b.a aVar = c1367b.f128299d;
            if (aVar.a()) {
                callbackToJavascrpt(aVar, hVar);
                return null;
            }
        }
        if (C8836c.f128301b && hVar != null) {
            hVar.toString();
        }
        return hVar;
    }

    @Override // vm0.InterfaceC8835b
    public void callbackToJavascriptRightNow(InterfaceC8835b.a aVar, final h hVar) {
        if (aVar == null || !aVar.a() || hVar == null) {
            return;
        }
        hVar.toString();
        Map<String, Map<String, C8834a>> map = C8836c.f128300a;
        final String str = aVar.f128294a;
        if (aVar.f128295b) {
            HandlerThreads.runOn(0, new Runnable(this, str, hVar) { // from class: Gm0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BiliWebViewHybridBridgeV2 f7249a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f7250b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final vm0.h f7251c;

                {
                    this.f7249a = this;
                    this.f7250b = str;
                    this.f7251c = hVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1896d.b(this.f7249a.f73624a.getWebView(), C1896d.a(this.f7250b, this.f7251c.c()));
                }
            });
            return;
        }
        JsbProxy jsbProxy = this.f73629f;
        if (jsbProxy != null) {
            jsbProxy.jsonCallbackToJs(new Object[]{str, hVar.c()});
        }
    }

    @Override // vm0.InterfaceC8835b
    public void callbackToJavascrpt(InterfaceC8835b.a aVar, @Nullable h hVar) {
        if (aVar == null || !aVar.a() || hVar == null || !a()) {
            return;
        }
        hVar.toString();
        Map<String, Map<String, C8834a>> map = C8836c.f128300a;
        String str = aVar.f128294a;
        if (aVar.f128295b) {
            WebProxyV2.jsonCallback(this.f73624a.getWebView(), new Object[]{str, hVar.c()});
            return;
        }
        JsbProxy jsbProxy = this.f73629f;
        if (jsbProxy != null) {
            jsbProxy.jsonCallbackToJs(new Object[]{str, hVar.c()});
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [Gm0.v, com.bilibili.lib.jsbridge.legacy.WebBehavior] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, vm0.f] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2, java.lang.Object, vm0.g$a] */
    public void checkAndInitBridge(String str) {
        Map<String, Map<String, C8834a>> map = C8836c.f128300a;
        String str2 = this.f73625b;
        Map<String, C8834a> mapA = C8836c.a(str2);
        JsbProxy jsbProxy = this.f73629f;
        HybridWebViewV2 hybridWebViewV2 = this.f73624a;
        if (jsbProxy == null && mapA != null) {
            JsbProxy jsbProxy2 = hybridWebViewV2.getWebView().getJsbProxy();
            this.f73629f = jsbProxy2;
            if (jsbProxy2 != null) {
                if (mapA.isEmpty()) {
                    if (!ProcessUtils.isMainProcess()) {
                        throw new IllegalStateException(android.support.v4.media.a.a("please call KFCHybrid.init(", str2, ", Configuration) first!"));
                    }
                    E.a("please call KFCHybrid.init(", str2, ", Configuration) first!", "kfc_hybridbridge");
                }
                for (String str3 : mapA.keySet()) {
                    if (!TextUtils.isEmpty(str3)) {
                        JsbProxy jsbProxy3 = this.f73629f;
                        ?? obj = new Object();
                        obj.f128306a = this;
                        obj.f128307b = str3;
                        jsbProxy3.registerBuiltin(str3, (JsBridgeCallHandlerFactoryV2) obj);
                        Map<String, Map<String, C8834a>> map2 = C8836c.f128300a;
                    }
                }
            }
        }
        if (this.f73628e == null) {
            Uri uri = Uri.parse(str);
            ?? webBehavior = new WebBehavior((AppCompatActivity) null);
            webBehavior.f7293b = hybridWebViewV2;
            this.f73628e = new WebProxyV2.Builder((AppCompatActivity) null, hybridWebViewV2.getWebView()).with((WebBehavior) webBehavior).of(uri).build();
            if (WebProxy.d(uri)) {
                if (this.f73630g == null) {
                    ?? obj2 = new Object();
                    obj2.f128303a = this;
                    this.f73630g = obj2;
                }
                hybridWebViewV2.getWebView().removeJavascriptInterface(KFCHybridV2.Configuration.BASE_NATIVEACTIONS_NAMESPACE);
                hybridWebViewV2.getWebView().addJavascriptInterface(this.f73630g, KFCHybridV2.Configuration.BASE_NATIVEACTIONS_NAMESPACE);
            }
        }
        this.f73627d = new e(mapA);
    }

    public void destroy() {
        Map<String, Map<String, C8834a>> map = C8836c.f128300a;
        this.f73632j = false;
        HybridWebContext hybridWebContext = this.f73626c;
        if (hybridWebContext != null && this.f73631i != null) {
            AppCompatActivity activity = hybridWebContext.getActivity();
            if (KFCAppCompatActivity.class.isInstance(activity)) {
                ((KFCAppCompatActivity) activity).unregisterLifecycleListener(this.f73631i);
            } else {
                this.f73626c.unregisterLifecycleListener(this.f73631i);
            }
        }
        WebProxyV2 webProxyV2 = this.f73628e;
        if (webProxyV2 != null) {
            webProxyV2.onDestroy();
        }
        JsbProxy jsbProxy = this.f73629f;
        if (jsbProxy != null) {
            jsbProxy.onDestroy();
        }
    }

    @Override // vm0.InterfaceC8835b
    public void evaluateJavascript(String str) {
        if (!TextUtils.isEmpty(str) && a()) {
            Map<String, Map<String, C8834a>> map = C8836c.f128300a;
            BiliWebView webView = this.f73624a.getWebView();
            webView.post(new RunnableC1895c(webView, str));
        }
    }

    @Override // vm0.InterfaceC8835b
    public void evaluateJavascriptRightNow(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, Map<String, C8834a>> map = C8836c.f128300a;
        try {
            C1896d.b(this.f73624a.getWebView(), str);
        } catch (Exception e7) {
        }
    }

    public JsbProxy getWebProxyNew() {
        return this.f73629f;
    }

    public boolean isAlive() {
        return this.f73632j;
    }

    public boolean isEnabled() {
        return this.h;
    }

    public boolean onBackPressed() {
        WebProxyV2 webProxyV2 = this.f73628e;
        if (webProxyV2 == null) {
            return false;
        }
        return webProxyV2.onBackPressed();
    }

    public void onWebReload() {
        WebProxyV2 webProxyV2 = this.f73628e;
        if (webProxyV2 == null) {
            return;
        }
        webProxyV2.onWebReload();
    }

    public void setEnabled(boolean z6) {
        Map<String, Map<String, C8834a>> map = C8836c.f128300a;
        this.h = z6;
        if (z6) {
            attach(this.f73626c);
            return;
        }
        WebProxyV2 webProxyV2 = this.f73628e;
        if (webProxyV2 != null) {
            webProxyV2.attach((AppCompatActivity) null);
            Map<String, Map<String, C8834a>> map2 = C8836c.f128300a;
        }
    }
}
