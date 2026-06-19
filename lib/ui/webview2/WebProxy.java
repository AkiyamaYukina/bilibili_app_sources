package com.bilibili.lib.ui.webview2;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.ui.webview2.k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tv.danmaku.android.log.BLog;
import tv.danmaku.app.AppConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/WebProxy.class */
public final class WebProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatActivity f64956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebView f64957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f64958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f64959d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f64960e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/WebProxy$Builder.class */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppCompatActivity f64961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WebView f64962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j f64963c;
        public String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Uri f64968i;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<Pair<Object, String>> f64964d = Collections.emptyList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f64965e = "biliInject";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f64966f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f64967g = 20;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Map<String, Set<Class<? extends b>>> f64969j = new HashMap();

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/WebProxy$Builder$a.class */
        public final class a extends com.bilibili.lib.ui.webview2.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final JavaScriptBridgeUniversal f64974b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Builder f64975c;

            public a(Builder builder, WebProxy webProxy, JavaScriptBridgeUniversal javaScriptBridgeUniversal) {
                this.f64975c = builder;
                this.f64974b = javaScriptBridgeUniversal;
                this.f64980a = new WebViewClient();
            }

            @Override // com.bilibili.lib.ui.webview2.a, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                this.f64974b.checkAndInjectSupportJS(this.f64975c.h);
                super.onPageFinished(webView, str);
            }
        }

        public Builder(@Nullable AppCompatActivity appCompatActivity, @NonNull WebView webView) {
            this.f64961a = appCompatActivity;
            this.f64962b = webView;
        }

        /* JADX WARN: Type inference failed for: r0v55, types: [com.bilibili.lib.ui.webview2.j, java.lang.Object] */
        public final WebProxy a() {
            k.a().getClass();
            WebProxy webProxy = new WebProxy(this.f64961a, this.f64962b);
            for (Pair<Object, String> pair : this.f64964d) {
                ((HashMap) webProxy.f64959d).put(pair.second, pair.first);
            }
            Uri uri = this.f64968i;
            if (uri != null && WebProxy.d(uri)) {
                k.b bVar = k.a().f64992b;
                String str = this.f64965e;
                JavaScriptBridgeUniversal javaScriptBridgeUniversal = new JavaScriptBridgeUniversal(str);
                javaScriptBridgeUniversal.attachProxy(webProxy);
                this.f64962b.removeJavascriptInterface(str);
                this.f64962b.addJavascriptInterface(javaScriptBridgeUniversal, str);
                if (this.f64966f) {
                    if (this.h == null) {
                        this.h = "https://s1.hdslb.com/bfs/static/activity/misc/app/biliapp-inject-bridging.js";
                    }
                    this.f64962b.setWebChromeClient(new BaseWebView$WebChromeClientWrapper(this, webProxy, javaScriptBridgeUniversal) { // from class: com.bilibili.lib.ui.webview2.WebProxy.Builder.1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final int f64970b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public boolean f64971c = false;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final JavaScriptBridgeUniversal f64972d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final Builder f64973e;

                        {
                            this.f64973e = this;
                            this.f64972d = javaScriptBridgeUniversal;
                            this.f64970b = this.f64967g;
                        }

                        @Override // com.bilibili.lib.ui.webview2.BaseWebView$WebChromeClientWrapper, android.webkit.WebChromeClient
                        public void onProgressChanged(WebView webView, int i7) {
                            if (i7 < this.f64970b) {
                                if (this.f64971c) {
                                    this.f64971c = false;
                                }
                            } else if (!this.f64971c) {
                                this.f64971c = true;
                                this.f64972d.injectSupportJS(this.f64973e.h);
                            }
                            super.onProgressChanged(webView, i7);
                        }
                    });
                    this.f64962b.setWebViewClient(new a(this, webProxy, javaScriptBridgeUniversal));
                }
            }
            if (this.f64963c == null) {
                ?? obj = new Object();
                k.a aVar = k.a().f64991a;
                this.f64963c = obj;
            }
            webProxy.f64958c = this.f64963c;
            for (Map.Entry entry : ((HashMap) this.f64969j).entrySet()) {
                String str2 = (String) entry.getKey();
                for (final Class cls : (Set) entry.getValue()) {
                    i iVar = webProxy.f64960e;
                    Set set = (Set) ((HashMap) iVar.f64988b).get(str2);
                    Set hashSet = set;
                    if (set == null) {
                        hashSet = new HashSet();
                        ((HashMap) iVar.f64988b).put(str2, hashSet);
                    }
                    final HashSet hashSet2 = new HashSet(hashSet);
                    HandlerThreads.post(2, new Runnable(cls, hashSet2) { // from class: com.bilibili.lib.ui.webview2.g

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Class f64985a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Set f64986b;

                        {
                            this.f64985a = cls;
                            this.f64986b = hashSet2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zIsPublic;
                            IllegalArgumentException illegalArgumentException;
                            Class cls2 = this.f64985a;
                            Set set2 = this.f64986b;
                            Constructor<?>[] constructors = cls2.getConstructors();
                            int length = constructors.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    zIsPublic = false;
                                    break;
                                }
                                Constructor<?> constructor = constructors[i7];
                                if (constructor.getParameterTypes().length == 0) {
                                    zIsPublic = Modifier.isPublic(constructor.getModifiers());
                                    break;
                                }
                                i7++;
                            }
                            if (zIsPublic) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = ((HashSet) set2).iterator();
                                while (it.hasNext()) {
                                    for (Method method : ((Class) it.next()).getMethods()) {
                                        if (i.f(method)) {
                                            arrayList.add(method.getName());
                                        }
                                    }
                                }
                                Method[] methods = cls2.getMethods();
                                int length2 = methods.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= length2) {
                                        illegalArgumentException = null;
                                        break;
                                    }
                                    Method method2 = methods[i8];
                                    if (i.f(method2) && arrayList.contains(method2.getName())) {
                                        illegalArgumentException = new IllegalArgumentException("Duplicated jsb method, name = " + method2.getName());
                                        break;
                                    }
                                    i8++;
                                }
                            } else {
                                illegalArgumentException = new IllegalArgumentException("Class should have non-parameter constructor, name = ".concat(cls2.getName()));
                            }
                            if (illegalArgumentException != null) {
                                final IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                                HandlerThreads.post(0, new Runnable(illegalArgumentException2) { // from class: com.bilibili.lib.ui.webview2.h

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final RuntimeException f64987a;

                                    {
                                        this.f64987a = illegalArgumentException2;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        throw this.f64987a;
                                    }
                                });
                            }
                        }
                    });
                    hashSet.add(cls);
                }
                webProxy.b(str2);
            }
            return webProxy;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/WebProxy$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppCompatActivity f64976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WebView f64977b;

        public a(AppCompatActivity appCompatActivity, WebView webView) {
            this.f64976a = appCompatActivity;
            this.f64977b = webView;
        }
    }

    public WebProxy(AppCompatActivity appCompatActivity, WebView webView) {
        this.f64956a = appCompatActivity;
        this.f64957b = webView;
        i iVar = new i();
        this.f64960e = iVar;
        iVar.f64981a = this;
    }

    public static boolean d(Uri uri) {
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        return AppConfig.BILI_HOST_PATTERN.matcher(host).find();
    }

    @Nullable
    public final a a() {
        if (e()) {
            return null;
        }
        return new a(this.f64956a, this.f64957b);
    }

    public final void b(String str) {
        i iVar = this.f64960e;
        Set<Class<?>> set = (Set) ((HashMap) iVar.f64988b).get(str);
        if (set != null) {
            for (Class<?> cls : set) {
                List list = (List) ((HashMap) iVar.f64989c).get(str);
                boolean z6 = false;
                boolean z7 = false;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        z6 = z7;
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().getClass() == cls) {
                            BLog.w("JavaScriptInvocation", cls.getName().concat(" has been imported once, skip."));
                            z7 = true;
                        }
                    }
                }
                if (!z6) {
                    try {
                        b bVar = (b) cls.newInstance();
                        bVar.f64981a = iVar.f64981a;
                        iVar.e(str, bVar);
                    } catch (IllegalAccessException | InstantiationException e7) {
                    }
                }
            }
        }
    }

    public final void c(String str, String str2, String str3) {
        Object obj = ((HashMap) this.f64959d).get(str);
        if (obj == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str3)) {
                Method method = obj.getClass().getMethod(str2, null);
                if (method != null) {
                    method.invoke(obj, null);
                }
            } else {
                Method method2 = obj.getClass().getMethod(str2, String.class);
                if (method2 != null) {
                    method2.invoke(obj, str3);
                }
            }
        } catch (Exception e7) {
            BLog.w("WebProxy", e7);
        }
    }

    public final boolean e() {
        AppCompatActivity appCompatActivity;
        return this.f64957b == null || (appCompatActivity = this.f64956a) == null || appCompatActivity.isFinishing();
    }
}
