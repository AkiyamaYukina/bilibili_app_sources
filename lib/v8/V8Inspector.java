package com.bilibili.lib.v8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.constraintlayout.compose.I;
import com.bilibili.extra.websocket.NanoHTTPD;
import com.bilibili.extra.websocket.NanoWSD;
import com.bilibili.lib.v8.V8Engine;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.sistersplayer.httpserver.SimpleHttpServer;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Inspector.class */
public class V8Inspector {
    private static V8InspectorCallBack sV8InspectorCallBack;
    private String appId;
    private String appName;
    private Context context;
    private InspectorBackend mBackend;
    private volatile V8InspectorServer server;
    private static AtomicBoolean readyToProcessMessages = new AtomicBoolean(false);
    public static final Object REMOTE_CONNECTION_MARKER = new Object();
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
    private Date currentDate = new Date();
    private LinkedBlockingQueue<String> inspectorMessages = new LinkedBlockingQueue<>();
    private LinkedBlockingQueue<String> pendingInspectorMessages = new LinkedBlockingQueue<>();
    private final Object debugLocker = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Inspector$V8InspectorCallBack.class */
    public interface V8InspectorCallBack {
        String getInspectorMessage(Object obj);

        void initV8Inspector(String str, String str2, V8Engine v8Engine, LinkedBlockingQueue<String> linkedBlockingQueue, V8Engine.CallBack callBack);

        void sendToDevTools(Object obj, String str);

        void stopConnection();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Inspector$V8InspectorServer.class */
    public class V8InspectorServer extends NanoWSD {
        private static final String PAGE_ID = "1";
        public static final String PATH = "localhost:4000";
        private static final String PATH_ACTIVATE = "/json/activate/1";
        private static final String PATH_CLOSE = "/json/close1";
        private static final String PATH_OTHER_PAGE_LIST = "/json/list";
        private static final String PATH_PAGE_LIST = "/json";
        private static final String PATH_VERSION = "/json/version";
        private static final String PROTOCOL_VERSION = "1.1";
        private static final String USER_AGENT = "Inspector";
        private static final String V8_VERSION = "6.5.254.28";
        private static final String WEBKIT_REV = "@39dc6e329f34880986bdfc44f82aa35d9183bdda";
        private static final String WEBKIT_VERSION = "537.36 (@39dc6e329f34880986bdfc44f82aa35d9183bdda)";
        final V8Inspector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V8InspectorServer(V8Inspector v8Inspector, String str) {
            super(str);
            this.this$0 = v8Inspector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        
            if (kotlin.text.StringsKt.n(r0, r5) == true) goto L24;
         */
        @kotlin.jvm.JvmStatic
        @com.bilibili.lib.ghost.api.Invocation(category = com.bilibili.lib.ghost.api.InvocationCategory.INVOKE_NONE_STATIC, name = "getPackageInfo", owner = {"android.content.pm.PackageManager"})
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static android.content.pm.PackageInfo __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(@org.jetbrains.annotations.NotNull android.content.pm.PackageManager r4, @org.jetbrains.annotations.NotNull java.lang.String r5, int r6) throws android.content.pm.PackageManager.NameNotFoundException {
            /*
                com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L12
                com.bilibili.lib.blconfig.FeatureFlagContract r0 = r0.ab2()     // Catch: java.lang.Exception -> L12
                java.lang.String r1 = "ff.privacy.hook.agree.get_package_info"
                r2 = 1
                boolean r0 = r0.getWithDefault(r1, r2)     // Catch: java.lang.Exception -> L12
                r7 = r0
                goto L16
            L12:
                r9 = move-exception
                r0 = 1
                r7 = r0
            L16:
                com.bilibili.privacy.PrivacyHelper r0 = com.bilibili.privacy.PrivacyHelper.INSTANCE
                java.lang.String r1 = "pm_get_package_info"
                boolean r0 = r0.checkPrivacy$privacy_release(r1)
                r8 = r0
                r0 = 0
                r9 = r0
                r0 = r8
                if (r0 == 0) goto L2c
                r0 = r7
                if (r0 != 0) goto L80
            L2c:
                com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L92
                com.bilibili.lib.blconfig.Contract r0 = r0.config()     // Catch: java.lang.Exception -> L92
                java.lang.String r1 = "privacy.pkg_info_whitelist"
                r2 = 0
                java.lang.Object r0 = r0.get(r1, r2)     // Catch: java.lang.Exception -> L92
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L92
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L53
                r0 = r10
                r1 = r5
                boolean r0 = kotlin.text.StringsKt.n(r0, r1)     // Catch: java.lang.Exception -> L92
                r7 = r0
                r0 = r7
                r1 = 1
                if (r0 != r1) goto L53
                goto L80
            L53:
                r0 = r5
                boolean r0 = V0.f.c(r0)
                if (r0 == 0) goto L77
                r0 = r4
                r1 = 0
                android.content.pm.PackageInfo r0 = V0.e.a(r0, r1)
                r5 = r0
                r0 = r5
                r4 = r0
                r0 = r5
                if (r0 != 0) goto L75
                android.content.pm.PackageInfo r0 = new android.content.pm.PackageInfo
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = 2233(0x8b9, float:3.129E-42)
                r0.versionCode = r1
            L75:
                r0 = r4
                return r0
            L77:
                android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                throw r0
            L80:
                r0 = r4
                r1 = r5
                r2 = r6
                android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)
                r5 = r0
                r0 = r9
                r4 = r0
                r0 = r5
                if (r0 == 0) goto L90
                r0 = r5
                r4 = r0
            L90:
                r0 = r4
                return r0
            L92:
                r10 = move-exception
                goto L80
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.v8.V8Inspector.V8InspectorServer.__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(android.content.pm.PackageManager, java.lang.String, int):android.content.pm.PackageInfo");
        }

        private CharSequence getAppLabel() {
            return this.this$0.context.getPackageManager().getApplicationLabel(this.this$0.context.getApplicationInfo());
        }

        private String getAppLabelAndVersion() {
            StringBuilder sb = new StringBuilder();
            PackageManager packageManager = this.this$0.context.getPackageManager();
            sb.append(getAppLabel());
            sb.append("/6.5.254.28");
            try {
                __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(packageManager, this.this$0.context.getPackageName(), 0);
                return sb.toString();
            } catch (PackageManager.NameNotFoundException e7) {
                throw new RuntimeException(e7);
            }
        }

        private String handleActivate() {
            return "Target activation ignored\n";
        }

        private String handleClose() {
            return "Target activation ignored\n";
        }

        private String handlePageList() throws JSONException {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObjectA = I.a("type", MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE);
            jSONObjectA.put("title", this.this$0.appName + "[" + this.this$0.df.format(this.this$0.currentDate) + "] (powered by bilibili)");
            jSONObjectA.put("id", "1");
            jSONObjectA.put("url", "");
            jSONObjectA.put("description", "");
            jSONObjectA.put("webSocketDebuggerUrl", "ws://localhost:4000/devtools/page/1");
            jSONObjectA.put("devtoolsFrontendUrl", "devtools://devtools/bundled/js_app.html?experiments=true&v8only=true&ws=localhost:4000/devtools/page/1");
            jSONArray.put(jSONObjectA);
            return jSONArray.toString();
        }

        private String handleVersion() throws JSONException {
            JSONObject jSONObjectB = V7.e.b("WebKit-Version", WEBKIT_VERSION, Tm0.a.f24205b, USER_AGENT);
            jSONObjectB.put("Protocol-Version", PROTOCOL_VERSION);
            jSONObjectB.put("Browser", getAppLabelAndVersion());
            jSONObjectB.put("V8-Version", V8_VERSION);
            jSONObjectB.put("Android-Package", this.this$0.context.getPackageName());
            return jSONObjectB.toString();
        }

        public NanoWSD.a openWebSocket(NanoHTTPD.l lVar) {
            return new V8InspectorWebSocket(this.this$0, lVar);
        }

        public NanoHTTPD.Response serveHttp(NanoHTTPD.l lVar) {
            String strHandlePageList;
            try {
                if (PATH_VERSION.equals(((NanoHTTPD.k) lVar).f)) {
                    strHandlePageList = handleVersion();
                } else if (PATH_PAGE_LIST.equals(((NanoHTTPD.k) lVar).f) || PATH_OTHER_PAGE_LIST.equals(((NanoHTTPD.k) lVar).f)) {
                    strHandlePageList = handlePageList();
                } else {
                    if (PATH_ACTIVATE.equals(((NanoHTTPD.k) lVar).f)) {
                        NanoHTTPD.Response responseNewFixedLengthResponse = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, SimpleHttpServer.MIME_PLAINTEXT, handleActivate());
                        responseNewFixedLengthResponse.b("Accept-Ranges", "bytes");
                        return responseNewFixedLengthResponse;
                    }
                    if (PATH_CLOSE.equals(((NanoHTTPD.k) lVar).f)) {
                        NanoHTTPD.Response responseNewFixedLengthResponse2 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, SimpleHttpServer.MIME_PLAINTEXT, handleClose());
                        responseNewFixedLengthResponse2.b("Accept-Ranges", "bytes");
                        return responseNewFixedLengthResponse2;
                    }
                    strHandlePageList = "";
                }
                if (!strHandlePageList.isEmpty()) {
                    NanoHTTPD.Response responseNewFixedLengthResponse3 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.OK, "application/json", strHandlePageList);
                    responseNewFixedLengthResponse3.b("Accept-Ranges", "bytes");
                    return responseNewFixedLengthResponse3;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
            NanoHTTPD.Response responseNewFixedLengthResponse4 = NanoHTTPD.newFixedLengthResponse(NanoHTTPD.Response.Status.NOT_IMPLEMENTED, SimpleHttpServer.MIME_PLAINTEXT, "No support for " + ((NanoHTTPD.k) lVar).f + "\n");
            responseNewFixedLengthResponse4.b("Accept-Ranges", "bytes");
            return responseNewFixedLengthResponse4;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Inspector$V8InspectorWebSocket.class */
    public class V8InspectorWebSocket extends NanoWSD.a {
        final V8Inspector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public V8InspectorWebSocket(V8Inspector v8Inspector, NanoHTTPD.l lVar) {
            super(lVar);
            this.this$0 = v8Inspector;
        }

        private String getInspectorMessage(Object obj) {
            return ((V8InspectorWebSocket) obj).getInspectorMessage();
        }

        public String getInspectorMessage() {
            try {
                return (String) this.this$0.inspectorMessages.take();
            } catch (InterruptedException e7) {
                Log.e("debug", this.this$0.context.getPackageName() + e7.getMessage());
                return null;
            }
        }

        public void onClose(NanoWSD.WebSocketFrame.CloseCode closeCode, String str, boolean z6) {
            if (this.this$0.mBackend.isDisposed()) {
                return;
            }
            this.this$0.mBackend.disconnectInspector();
        }

        public void onException(IOException iOException) {
            Log.e("debug", this.this$0.context.getPackageName() + iOException.getMessage());
            if (this.this$0.mBackend.isDisposed()) {
                return;
            }
            this.this$0.mBackend.disconnectInspector();
        }

        public void onMessage(NanoWSD.WebSocketFrame webSocketFrame) {
            this.this$0.inspectorMessages.offer(webSocketFrame.b());
            if (!V8Inspector.readyToProcessMessages.get()) {
                String str = (String) this.this$0.inspectorMessages.poll();
                while (str != null) {
                    if (this.this$0.pendingInspectorMessages.offer(str)) {
                        str = (String) this.this$0.inspectorMessages.poll();
                    }
                }
                if (webSocketFrame.b().contains("Debugger.enable")) {
                    synchronized (this.this$0.debugLocker) {
                        this.this$0.debugLocker.notifyAll();
                    }
                    return;
                }
                return;
            }
            Object objPoll = this.this$0.inspectorMessages.poll();
            while (true) {
                String str2 = (String) objPoll;
                if (str2 == null) {
                    return;
                }
                if (!this.this$0.mBackend.isDisposed()) {
                    this.this$0.mBackend.dispatchInspectorMessage(str2);
                }
                objPoll = this.this$0.inspectorMessages.poll();
            }
        }

        public void onOpen() {
            if (this.this$0.mBackend.isDisposed()) {
                return;
            }
            this.this$0.mBackend.connectInspector(this);
        }

        public void onPong(NanoWSD.WebSocketFrame webSocketFrame) {
        }

        public void send(String str) throws IOException {
            super.send(str);
        }
    }

    public V8Inspector(InspectorBackend inspectorBackend, Context context, String str, String str2) {
        this.mBackend = inspectorBackend;
        this.context = context;
        this.appName = str;
        this.appId = str2;
    }

    private static String getInspectorMessage(Object obj) {
        if (obj instanceof V8InspectorWebSocket) {
            return ((V8InspectorWebSocket) obj).getInspectorMessage();
        }
        V8InspectorCallBack v8InspectorCallBack = sV8InspectorCallBack;
        return v8InspectorCallBack != null ? v8InspectorCallBack.getInspectorMessage(obj) : "";
    }

    private static String getMimeType(String str) {
        String mimeTypeFromExtension;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (!fileExtensionFromUrl.isEmpty()) {
            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            switch (fileExtensionFromUrl) {
                case "js":
                    mimeTypeFromExtension = "text/javascript";
                    break;
                case "so":
                    mimeTypeFromExtension = "application/binary";
                    break;
                case "ts":
                    mimeTypeFromExtension = "text/typescript";
                    break;
                case "css":
                    mimeTypeFromExtension = "text/css";
                    break;
                case "json":
                    mimeTypeFromExtension = "application/json";
                    break;
            }
        } else {
            mimeTypeFromExtension = null;
        }
        return mimeTypeFromExtension;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$0() {
        if (this.server != null) {
            this.server.stop();
            this.server = null;
        }
    }

    private void processDebugBreak() {
        processDebugBreakMessages();
        if (this.mBackend.isDisposed()) {
            return;
        }
        this.mBackend.scheduleInspectorBreak();
    }

    private void processDebugBreakMessages() {
        while (!this.pendingInspectorMessages.isEmpty()) {
            this.mBackend.dispatchInspectorMessage(this.pendingInspectorMessages.poll());
        }
    }

    public static void registerV8InspectorCallBack(V8InspectorCallBack v8InspectorCallBack) {
        sV8InspectorCallBack = v8InspectorCallBack;
    }

    public static void routeSend(Object obj, String str) {
        try {
            send(obj, str);
        } catch (IOException e7) {
            Log.w("V8Inspector", "routeSend failed: " + e7.getMessage());
        }
    }

    private static void send(Object obj, String str) throws IOException {
        if (obj != null) {
            if (obj instanceof V8InspectorWebSocket) {
                V8InspectorWebSocket v8InspectorWebSocket = (V8InspectorWebSocket) obj;
                if (v8InspectorWebSocket.isOpen()) {
                    v8InspectorWebSocket.send(str);
                    return;
                }
                return;
            }
            V8InspectorCallBack v8InspectorCallBack = sV8InspectorCallBack;
            if (v8InspectorCallBack != null) {
                v8InspectorCallBack.sendToDevTools(obj, str);
            }
        }
    }

    private static void sendToDevToolsConsole(Object obj, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", str2);
            jSONObject2.put("executionContextId", 0);
            jSONObject2.put("timestamp", 0.0d);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject2.put("args", jSONArray);
            jSONObject.put("method", "Runtime.consoleAPICalled");
            jSONObject.put("params", jSONObject2);
            send(obj, jSONObject.toString());
        } catch (IOException | JSONException e7) {
            e7.printStackTrace();
        }
    }

    public static void unRegisterV8InspectorCallBack() {
        sV8InspectorCallBack = null;
    }

    public void initRemoteV8Inspector(String str, String str2, V8Engine.CallBack callBack) {
        V8InspectorCallBack v8InspectorCallBack = sV8InspectorCallBack;
        if (v8InspectorCallBack != null) {
            InspectorBackend inspectorBackend = this.mBackend;
            v8InspectorCallBack.initV8Inspector(str, str2, inspectorBackend instanceof V8Engine ? (V8Engine) inspectorBackend : null, this.inspectorMessages, callBack);
            if (!this.mBackend.isDisposed()) {
                this.mBackend.connectInspector(REMOTE_CONNECTION_MARKER);
            }
        }
        waitForDebugger(false);
    }

    public void start() throws IOException {
        if (this.server == null) {
            this.server = new V8InspectorServer(this, "webview_devtools_remote_" + this.appId + this.context.getPackageName() + Process.myPid() + "_devtools_remote");
            this.server.start(-1);
        }
    }

    public void stop() {
        new Thread(new Runnable(this) { // from class: com.bilibili.lib.v8.k

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final V8Inspector f65052a;

            {
                this.f65052a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f65052a.lambda$stop$0();
            }
        }).start();
    }

    public void stopRealDebuggerConnection() {
        V8InspectorCallBack v8InspectorCallBack = sV8InspectorCallBack;
        if (v8InspectorCallBack != null) {
            v8InspectorCallBack.stopConnection();
            unRegisterV8InspectorCallBack();
        }
    }

    public void waitForDebugger(boolean z6) {
        if (!z6) {
            readyToProcessMessages.set(true);
            return;
        }
        synchronized (this.debugLocker) {
            try {
                try {
                    this.debugLocker.wait(30000L);
                    readyToProcessMessages.set(true);
                } catch (InterruptedException e7) {
                    e7.printStackTrace();
                    readyToProcessMessages.set(true);
                }
                processDebugBreak();
            } catch (Throwable th) {
                readyToProcessMessages.set(true);
                processDebugBreak();
                throw th;
            }
        }
    }
}
