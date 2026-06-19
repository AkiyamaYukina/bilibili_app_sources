package com.bilibili.lib.ui.webview2;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.room.B;
import bolts.Continuation;
import bolts.Task;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.material.util.UtilsKt;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/webview2/JavaScriptBridgeUniversal.class */
public class JavaScriptBridgeUniversal {
    private static final List<String> BUILTIN_METHODS = Arrays.asList("global.import", "global.getAllSupport");
    private static final String TAG = "JavaScriptBridgeUniversal";
    private Task<String> mBuiltinTask;
    private final String mCallbackMethodName;
    private final String mObjectName;
    private WebProxy mProxy;
    private String mSupportJS;

    public JavaScriptBridgeUniversal(String str) {
        this.mObjectName = str;
        this.mCallbackMethodName = android.support.v4.media.a.a("window.", str, ".biliCallbackReceived");
    }

    private void callbackToJavaScript(WebView webView, final Object... objArr) {
        final WebProxy webProxy = this.mProxy;
        final String str = this.mObjectName;
        final String str2 = this.mCallbackMethodName;
        if (webProxy.e()) {
            return;
        }
        webProxy.f64957b.post(new Runnable(webProxy, str2, objArr, str) { // from class: com.bilibili.lib.ui.webview2.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WebProxy f64993a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64994b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object[] f64995c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f64996d;

            {
                this.f64993a = webProxy;
                this.f64994b = str2;
                this.f64995c = objArr;
                this.f64996d = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebProxy webProxy2 = this.f64993a;
                String str3 = this.f64994b;
                Object[] objArr2 = this.f64995c;
                String str4 = this.f64996d;
                if (webProxy2.e()) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("javascript:try{");
                sb.append(str3);
                sb.append('(');
                for (Object obj : objArr2) {
                    if (obj != null) {
                        if ((obj instanceof JSONObject) || (obj instanceof JSONArray)) {
                            sb.append(JSON.toJSONString(obj));
                        } else {
                            sb.append('\'');
                            sb.append(obj.toString());
                            sb.append('\'');
                        }
                        sb.append(',');
                    }
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append(");");
                sb.append("window.");
                sb.append(str4);
                B.a(".success('", str3, "');", "}catch(error){", sb);
                B.a("console.error('", str4, ":'+error.message);", "window.", sb);
                B.a(str4, ".error('", str3, "');}", sb);
                WebView webView2 = webProxy2.f64957b;
                webView2.post(new Qt.i(2, sb.toString(), webView2));
            }
        });
    }

    private boolean checkAlive() {
        WebProxy webProxy = this.mProxy;
        return (webProxy == null || webProxy.a() == null) ? false : true;
    }

    private Object invokeNative(String str, String str2, JSONObject jSONObject) throws WebError {
        str.getClass();
        if (str.equals("global.import")) {
            if (jSONObject != null) {
                String string = jSONObject.getString("namespace");
                if (!TextUtils.isEmpty(string)) {
                    this.mProxy.b(string);
                    return null;
                }
            }
            throw new WebError("Can not find namespace.", 400);
        }
        if (!str.equals("global.getAllSupport")) {
            i iVar = this.mProxy.f64960e;
            iVar.getClass();
            if (!str.contains(UtilsKt.DOT)) {
                return null;
            }
            int iIndexOf = str.indexOf(UtilsKt.DOT);
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            List list = (List) ((HashMap) iVar.f64989c).get(strSubstring);
            if (list != null) {
                for (Object obj : list) {
                    try {
                        Method method = obj.getClass().getMethod(strSubstring2, JSONObject.class);
                        if (method != null && i.f(method)) {
                            try {
                                return null;
                            } catch (Exception e7) {
                                throw new WebError(e7, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE);
                            }
                        }
                    } catch (Exception e8) {
                    }
                }
            }
            throw new WebError("Method not found.", 404);
        }
        i iVar2 = this.mProxy.f64960e;
        iVar2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) iVar2.f64989c).entrySet()) {
            String str3 = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                for (Method method2 : it.next().getClass().getMethods()) {
                    if (i.f(method2)) {
                        StringBuilder sbA = C0.d.a(str3, UtilsKt.DOT);
                        sbA.append(method2.getName());
                        arrayList.add(sbA.toString());
                    }
                }
            }
        }
        arrayList.addAll(BUILTIN_METHODS);
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(arrayList);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        callbackToJavaScript(this.mProxy.a().f64977b, str2, jSONArray);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$injectSupportJS$0() throws Exception {
        this.mBuiltinTask.waitForCompletion();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$injectSupportJS$1(Task task) throws Exception {
        checkAndInjectSupportJS(this.mSupportJS);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|45|3|4|(3:40|5|6)|42|7|27|28|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String lambda$injectSupportJS$2() throws java.lang.Exception {
        /*
            r0 = 0
            r8 = r0
            r0 = 0
            r5 = r0
            r0 = 0
            r7 = r0
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3a
            r4 = r0
            r0 = r4
            android.app.Application r1 = com.bilibili.base.Applications.getCurrent()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3a
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3a
            java.lang.String r2 = "bilingsp.bs"
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3a
            r2 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L36 java.io.IOException -> L3a
            r0 = r4
            r5 = r0
            r0 = r4
            java.lang.String r0 = com.bilibili.commons.io.IOUtils.toString(r0)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            r6 = r0
            r0 = r6
            r5 = r0
        L27:
            r0 = r4
            r0.close()     // Catch: java.io.IOException -> L7e
            goto L72
        L2e:
            r4 = move-exception
            goto L74
        L32:
            r6 = move-exception
            goto L3d
        L36:
            r4 = move-exception
            goto L74
        L3a:
            r6 = move-exception
            r0 = 0
            r4 = r0
        L3d:
            r0 = r4
            r5 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r9 = r0
            r0 = r4
            r5 = r0
            r0 = r9
            java.lang.String r1 = "load from assets failed, "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r0 = r4
            r5 = r0
            r0 = r9
            r1 = r6
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            r0 = r4
            r5 = r0
            java.lang.String r0 = "JavaScriptBridgeUniversal"
            r1 = r9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            tv.danmaku.android.log.BLog.w(r0, r1)     // Catch: java.lang.Throwable -> L2e
            r0 = r8
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L72
            r0 = r7
            r5 = r0
            goto L27
        L72:
            r0 = r5
            return r0
        L74:
            r0 = r5
            if (r0 == 0) goto L7c
            r0 = r5
            r0.close()     // Catch: java.io.IOException -> L82
        L7c:
            r0 = r4
            throw r0
        L7e:
            r4 = move-exception
            goto L72
        L82:
            r5 = move-exception
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.webview2.JavaScriptBridgeUniversal.lambda$injectSupportJS$2():java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$injectSupportJS$3(Task task) throws Exception {
        WebView webView;
        String str = (String) task.getResult();
        if (TextUtils.isEmpty(str) || (webView = this.mProxy.f64957b) == null) {
            return null;
        }
        webView.post(new Qt.i(2, str, webView));
        return null;
    }

    public void attachProxy(@NonNull WebProxy webProxy) {
        this.mProxy = webProxy;
    }

    public void checkAndInjectSupportJS(String str) {
        this.mSupportJS = str;
        WebProxy webProxy = this.mProxy;
        if (webProxy == null || webProxy.a() == null) {
            return;
        }
        WebProxy webProxy2 = this.mProxy;
        String str2 = "javascript:try{window." + this.mObjectName + ".isSupportJSInjected(window.biliapp!=null);}catch(error){console.error('" + this.mObjectName + ":'+error.message);}";
        WebView webView = webProxy2.f64957b;
        if (webView == null) {
            return;
        }
        webView.post(new Qt.i(2, str2, webView));
    }

    @JavascriptInterface
    public void error(String str) {
        if (checkAlive() && this.mCallbackMethodName.equals(str)) {
            WebProxy webProxy = this.mProxy;
            if (webProxy.e()) {
                return;
            }
            webProxy.f64960e.a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Callable] */
    public void injectSupportJS(String str) {
        WebProxy webProxy = this.mProxy;
        if (webProxy == null || webProxy.a() == null) {
            return;
        }
        BLog.d(TAG, "Inject builtin support js.");
        Task<String> task = this.mBuiltinTask;
        if (task != null && !task.isCompleted() && !this.mBuiltinTask.isFaulted()) {
            BLog.d(TAG, "Inject task in running, just wait and check.");
            Task.callInBackground(new Callable(this) { // from class: com.bilibili.lib.ui.webview2.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final JavaScriptBridgeUniversal f64982a;

                {
                    this.f64982a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f64982a.lambda$injectSupportJS$0();
                }
            }).continueWith(new Continuation(this) { // from class: com.bilibili.lib.ui.webview2.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final JavaScriptBridgeUniversal f64983a;

                {
                    this.f64983a = this;
                }

                @Override // bolts.Continuation
                public final Object then(Task task2) {
                    return this.f64983a.lambda$injectSupportJS$1(task2);
                }
            }, Task.UI_THREAD_EXECUTOR);
        } else {
            BLog.d(TAG, "Okay, let's inject.");
            Task<String> taskCallInBackground = Task.callInBackground(new Object());
            this.mBuiltinTask = taskCallInBackground;
            taskCallInBackground.continueWith(new Continuation(this) { // from class: com.bilibili.lib.ui.webview2.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final JavaScriptBridgeUniversal f64984a;

                {
                    this.f64984a = this;
                }

                @Override // bolts.Continuation
                public final Object then(Task task2) {
                    return this.f64984a.lambda$injectSupportJS$3(task2);
                }
            }, Task.UI_THREAD_EXECUTOR);
        }
    }

    @JavascriptInterface
    public void isSupportJSInjected(boolean z6) {
        if (z6) {
            return;
        }
        injectSupportJS(this.mSupportJS);
    }

    @JavascriptInterface
    public String postMessage(String str) {
        String string;
        String str2;
        WebError e7;
        String str3;
        Object obj;
        if (!checkAlive()) {
            return null;
        }
        try {
        } catch (WebError e8) {
            e = e8;
            str = str;
            string = null;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid input format.");
        }
        JSONObject object = JSON.parseObject(str);
        String string2 = object.getString("method");
        if (TextUtils.isEmpty(string2)) {
            throw new IllegalArgumentException("Invalid method.");
        }
        try {
        } catch (WebError e9) {
            e7 = e9;
            str2 = null;
            str3 = null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) Integer.valueOf(e7.code));
            jSONObject.put("message", (Object) e7.getLocalizedMessage());
            BLog.w(TAG, e7);
            Log.e(this.mProxy.a().f64976a + "", "Invalid args: postMessage(" + str2 + ")");
            obj = jSONObject;
        }
        if (string2.startsWith("biliapp.")) {
            if (TextUtils.isEmpty(string2.substring(string2.indexOf("biliapp.") + 8))) {
                throw new IllegalArgumentException("Invalid method.");
            }
            String string3 = object.getString("data");
            if (string3 != null && !string3.equalsIgnoreCase("undefined")) {
                URLDecoder.decode(string3);
            }
            this.mProxy.getClass();
            return null;
        }
        if (object.containsKey("is_legacy") && object.getBoolean("is_legacy").booleanValue()) {
            String strSubstring = string2.substring(0, string2.indexOf(UtilsKt.DOT));
            String strSubstring2 = string2.substring(string2.indexOf(UtilsKt.DOT) + 1);
            if (TextUtils.isEmpty(strSubstring) || TextUtils.isEmpty(strSubstring2)) {
                StringBuilder sb = new StringBuilder("Invalid method, value = ");
                sb.append(strSubstring2);
                throw new IllegalArgumentException(sb.toString());
            }
            String string4 = object.getString("data");
            this.mProxy.c(strSubstring, strSubstring2, string4 != null ? URLDecoder.decode(string4) : null);
            return null;
        }
        JSONObject jSONObject2 = object.getJSONObject("data");
        string = jSONObject2 != null ? jSONObject2.getString("callbackId") : null;
        try {
            invokeNative(string2, string, jSONObject2);
            str3 = string;
            obj = null;
        } catch (WebError e10) {
            e = e10;
            WebError webError = e;
            str2 = str;
            str3 = string;
            e7 = webError;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", (Object) Integer.valueOf(e7.code));
            jSONObject3.put("message", (Object) e7.getLocalizedMessage());
            BLog.w(TAG, e7);
            Log.e(this.mProxy.a().f64976a + "", "Invalid args: postMessage(" + str2 + ")");
            obj = jSONObject3;
        }
        if (!TextUtils.isEmpty(str3) && obj != null) {
            callbackToJavaScript(this.mProxy.a().f64977b, str3, "ok", obj);
        }
        if (obj != null) {
            return JSON.toJSONString(obj);
        }
        return null;
    }

    @JavascriptInterface
    public void success(String str) {
        if (checkAlive() && this.mCallbackMethodName.equals(str)) {
            WebProxy webProxy = this.mProxy;
            if (webProxy.e()) {
                return;
            }
            webProxy.f64960e.d();
        }
    }
}
