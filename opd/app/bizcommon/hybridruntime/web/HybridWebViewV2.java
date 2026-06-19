package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import Em0.InterfaceC1681b;
import Fm0.C1897e;
import Gm0.C1994Q;
import Gm0.C1996T;
import Gm0.C2008l;
import Gm0.C2014r;
import N1.p;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.bilibili.api.BiliConfig;
import com.bilibili.app.comm.bh.BiliWebChromeClient;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bh.BiliWebViewClient;
import com.bilibili.app.comm.bhcommon.interceptor.WebInterceptorManager;
import com.bilibili.app.comm.bhwebview.api.IBiliWebSettings;
import com.bilibili.app.comm.bhwebview.api.interfaces.SslError;
import com.bilibili.app.comm.bhwebview.api.interfaces.SslErrorHandler;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceError;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceRequest;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceResponse;
import com.bilibili.base.BiliContext;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.droid.WindowManagerHelper;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.lib.jsbridge.special.PvInfo;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.opd.app.bizcommon.biliapm.APMRecorder;
import com.bilibili.opd.app.bizcommon.context.utils.TraceLog;
import com.bilibili.opd.app.bizcommon.hybridruntime.core.context.HybridContext;
import com.bilibili.opd.app.bizcommon.hybridruntime.neul.NeulPool;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.b;
import com.bilibili.opd.app.sentinel.SentinelXXX;
import com.bilibili.recommendmode.RecommendMode;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.ResponseBody;
import tv.danmaku.android.log.BLog;
import tv.danmaku.app.AppConfig;
import vm0.C8834a;
import vm0.C8836c;
import wm0.C8900a;
import ym0.C9063a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/HybridWebViewV2.class */
public class HybridWebViewV2 extends FrameLayout implements com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b {
    public static final int LOAD_URL_FINISH = 2;
    public static final int LOAD_URL_RECEIVE_ERROR = 4;
    public static final int LOAD_URL_START = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f73633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BiliWebViewHybridBridgeV2 f73634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f73635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1994Q f73636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C8900a f73637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public HybridWebContext f73638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f73639g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f73640i;
    public boolean isNeulErrorPage;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f73641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final BiliWebView f73642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f73643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f73644m;

    @Nullable
    public String mLoadUrl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f73645n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f73646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f73647p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f73648q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f73649r;
    public boolean realSizeGot;
    public int reuseCount;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f73650s;
    public int screenRealHeight;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f73651t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SentinelXXX f73652u;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/HybridWebViewV2$a.class */
    public final class a extends C1996T {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final um0.c f73653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HybridWebViewV2 f73654c;

        public a(HybridWebViewV2 hybridWebViewV2) {
            this.f73654c = hybridWebViewV2;
            HybridWebContext hybridWebContext = hybridWebViewV2.f73638f;
            this.f73653b = new um0.c(hybridWebContext == null ? hybridWebViewV2.getContext() : hybridWebContext);
        }

        public final WebResourceResponse b(String str) throws Throwable {
            WebResourceResponse webResourceResponseA;
            InputStream inputStreamByteStream;
            Uri uri = Uri.parse(str);
            if ("/res".equals(uri.getPath()) && "mall.bilibili.com".equals(uri.getHost())) {
                String queryParameter = uri.getQueryParameter("url");
                WebResourceResponse webResourceResponseB = null;
                if (queryParameter != null) {
                    webResourceResponseB = null;
                    if (!TextUtils.isEmpty(queryParameter)) {
                        um0.c cVar = this.f73653b;
                        cVar.getClass();
                        try {
                            String strA = um0.c.a(queryParameter);
                            String str2 = strA;
                            if (strA.length() == 0) {
                                str2 = "png";
                            }
                            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2);
                            ResponseBody responseBodyBody = cVar.f127884a.newCall(new Request.Builder().cacheControl(CacheControl.FORCE_NETWORK).url(queryParameter).build()).execute().body();
                            inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
                            if (inputStreamByteStream != null) {
                                try {
                                    webResourceResponseB = bg.a.b(mimeTypeFromExtension, "UTF-8", inputStreamByteStream, (Map) null);
                                } catch (Exception e7) {
                                    webResourceResponseB = null;
                                    if (inputStreamByteStream != null) {
                                        webResourceResponseB = null;
                                    }
                                    return webResourceResponseB;
                                } catch (Throwable th) {
                                    th = th;
                                    if (inputStreamByteStream != null) {
                                        inputStreamByteStream.close();
                                    }
                                    throw th;
                                }
                            } else {
                                webResourceResponseB = null;
                                if (inputStreamByteStream != null) {
                                    webResourceResponseB = null;
                                }
                            }
                        } catch (Exception e8) {
                            inputStreamByteStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStreamByteStream = null;
                        }
                        inputStreamByteStream.close();
                    }
                }
                return webResourceResponseB;
            }
            TraceLog.i("uri: " + uri.toString());
            List<String> pathSegments = uri.getPathSegments();
            StringBuilder sb = new StringBuilder();
            for (String str3 : pathSegments) {
                sb.append(File.separator);
                sb.append(str3);
            }
            String string = sb.toString();
            String str4 = string;
            if (TextUtils.isEmpty(string)) {
                str4 = "/index.html";
            }
            TraceLog.i("modPath: " + str4);
            Lazy<C2008l> lazy = C2008l.f7269c;
            C2008l c2008lA = C2008l.a.a();
            String string2 = uri.toString();
            if (c2008lA.e() && FlutterWebModCheckerKt.isNotNullAndNotEmpty(c2008lA.f7271b)) {
                ModResource modResource = ModResourceClient.getInstance().get(BiliContext.application(), "mall", c2008lA.f7271b);
                String resourceDirPath = modResource.getResourceDirPath();
                webResourceResponseA = null;
                if (resourceDirPath != null) {
                    if (resourceDirPath.length() == 0) {
                        webResourceResponseA = null;
                    } else {
                        String[] list = new File(resourceDirPath).list();
                        if (list == null || list.length != 1) {
                            File fileRetrieveFile = modResource.retrieveFile(Uri.parse(string2).getLastPathSegment());
                            webResourceResponseA = null;
                            if (fileRetrieveFile != null) {
                                webResourceResponseA = C2008l.a(c2008lA, string2, fileRetrieveFile);
                            }
                        } else {
                            File fileRetrieveFileByPath = modResource.retrieveFileByPath(((String) ArraysKt.firstOrNull(list)) + str4);
                            webResourceResponseA = null;
                            if (fileRetrieveFileByPath != null) {
                                webResourceResponseA = C2008l.a(c2008lA, string2, fileRetrieveFileByPath);
                            }
                        }
                    }
                }
            } else {
                TraceLog.e("getModeFile error");
                webResourceResponseA = null;
            }
            return webResourceResponseA;
        }

        @Override // Gm0.C1996T
        public final void onPageFinished(BiliWebView biliWebView, String str) {
            super.onPageFinished(biliWebView, str);
            HybridWebViewV2 hybridWebViewV2 = this.f73654c;
            hybridWebViewV2.h |= 2;
            if (hybridWebViewV2.f73643l) {
                if (biliWebView == null || TextUtils.isEmpty(hybridWebViewV2.mLoadUrl) || hybridWebViewV2.f73644m) {
                    Xi1.b.a(new StringBuilder("ark page onPageFinished else: "), hybridWebViewV2.mLoadUrl, "Neul");
                } else {
                    hybridWebViewV2.onArkLoaded();
                }
            }
        }

        @Override // Gm0.C1996T
        public final void onPageStarted(BiliWebView biliWebView, String str, Bitmap bitmap) {
            super.onPageStarted(biliWebView, str, bitmap);
            this.f73654c.h |= 1;
        }

        @Override // Gm0.C1996T
        public final void onReceivedError(BiliWebView biliWebView, int i7, String str, String str2) {
            super.onReceivedError(biliWebView, i7, str, str2);
            HybridWebViewV2 hybridWebViewV2 = this.f73654c;
            hybridWebViewV2.h |= 4;
            String str3 = hybridWebViewV2.mLoadUrl;
            WeakReference<SentinelXXX> weakReference = C9063a.f129729a;
            String str4 = str;
            if (str == null) {
                str4 = "";
            }
            C9063a.C1390a.a(weakReference, str3, str2, String.valueOf(i7), str4);
            if (hybridWebViewV2.f73643l) {
                hybridWebViewV2.isNeulErrorPage = true;
                Xi1.b.a(new StringBuilder("ark page onReceivedError1: "), hybridWebViewV2.mLoadUrl, "Neul");
            }
        }

        @Override // Gm0.C1996T
        @RequiresApi(api = 21)
        public final void onReceivedError(BiliWebView biliWebView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(biliWebView, webResourceRequest, webResourceError);
            boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
            HybridWebViewV2 hybridWebViewV2 = this.f73654c;
            if (zIsForMainFrame) {
                hybridWebViewV2.h |= 4;
                C9063a.C1390a.b(webResourceError, webResourceRequest.getUrl().toString(), hybridWebViewV2.mLoadUrl);
                if (hybridWebViewV2.f73643l) {
                    hybridWebViewV2.isNeulErrorPage = true;
                }
            }
            if (hybridWebViewV2.f73643l) {
                Xi1.b.a(new StringBuilder("ark page onReceivedError2: "), hybridWebViewV2.mLoadUrl, "Neul");
            }
        }

        @Override // Gm0.C1996T
        public final void onReceivedHttpError(BiliWebView biliWebView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(biliWebView, webResourceRequest, webResourceResponse);
            C9063a.C1390a.b(webResourceResponse, webResourceRequest.getUrl().toString(), this.f73654c.mLoadUrl);
        }

        @Override // Gm0.C1996T
        public final void onReceivedSslError(BiliWebView biliWebView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(biliWebView, sslErrorHandler, sslError);
            String url = sslError.getUrl();
            HybridWebViewV2 hybridWebViewV2 = this.f73654c;
            C9063a.C1390a.b(sslError, url, hybridWebViewV2.mLoadUrl);
            if (hybridWebViewV2.f73643l) {
                Xi1.b.a(new StringBuilder("ark page onReceivedSslError: "), hybridWebViewV2.mLoadUrl, "Neul");
            }
        }

        @Override // Gm0.C1996T
        public final WebResourceResponse shouldInterceptRequest(BiliWebView biliWebView, WebResourceRequest webResourceRequest) throws Throwable {
            if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                if (!webResourceRequest.getUrl().toString().startsWith("bilimmw://mall.bilibili.com/")) {
                    String string = webResourceRequest.getUrl().toString();
                    HybridWebViewV2 hybridWebViewV2 = this.f73654c;
                    b.a.a(string, hybridWebViewV2.f73652u, hybridWebViewV2.mLoadUrl);
                    um0.c cVar = this.f73653b;
                    cVar.getClass();
                    Boolean bool = (Boolean) ConfigManager.Companion.ab().get("mall_h5_file_cache", Boolean.FALSE);
                    WebResourceResponse webResourceResponseA = null;
                    if (bool != null ? bool.booleanValue() : false) {
                        cVar.f127885b.getClass();
                        String string2 = webResourceRequest.getUrl().toString();
                        webResourceResponseA = null;
                        if (um0.b.a(string2)) {
                            Map requestHeaders = webResourceRequest.getRequestHeaders();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it = null;
                            if (requestHeaders != null) {
                                it = requestHeaders.entrySet().iterator();
                            }
                            if (it != null) {
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (entry.getKey() != null && entry.getValue() != null) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            }
                            webResourceResponseA = um0.d.a(string2, linkedHashMap);
                        }
                    }
                    WebResourceResponse webResourceResponseShouldInterceptRequest = webResourceResponseA;
                    if (webResourceResponseA == null) {
                        webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(biliWebView, webResourceRequest);
                    }
                    return webResourceResponseShouldInterceptRequest;
                }
                WebResourceResponse webResourceResponseB = b(webResourceRequest.getUrl().toString());
                if (webResourceResponseB != null) {
                    return webResourceResponseB;
                }
            }
            return super.shouldInterceptRequest(biliWebView, webResourceRequest);
        }

        @Override // Gm0.C1996T
        public final WebResourceResponse shouldInterceptRequest(BiliWebView biliWebView, String str) throws Throwable {
            if (!TextUtils.isEmpty(str)) {
                if (!str.startsWith("bilimmw://mall.bilibili.com/")) {
                    HybridWebViewV2 hybridWebViewV2 = this.f73654c;
                    b.a.a(str, hybridWebViewV2.f73652u, hybridWebViewV2.mLoadUrl);
                    um0.c cVar = this.f73653b;
                    cVar.getClass();
                    Boolean bool = (Boolean) ConfigManager.Companion.ab().get("mall_h5_file_cache", Boolean.FALSE);
                    WebResourceResponse webResourceResponseA = null;
                    if (bool != null ? bool.booleanValue() : false) {
                        cVar.f127885b.getClass();
                        if (str.length() == 0) {
                            webResourceResponseA = null;
                        } else {
                            webResourceResponseA = null;
                            if (um0.b.a(str)) {
                                webResourceResponseA = um0.d.a(str, null);
                            }
                        }
                    }
                    WebResourceResponse webResourceResponseShouldInterceptRequest = webResourceResponseA;
                    if (webResourceResponseA == null) {
                        webResourceResponseShouldInterceptRequest = super.shouldInterceptRequest(biliWebView, str);
                    }
                    return webResourceResponseShouldInterceptRequest;
                }
                WebResourceResponse webResourceResponseB = b(str);
                if (webResourceResponseB != null) {
                    return webResourceResponseB;
                }
            }
            return super.shouldInterceptRequest(biliWebView, str);
        }
    }

    public HybridWebViewV2(Context context) {
        super(context);
        this.screenRealHeight = 0;
        this.realSizeGot = false;
        this.f73637e = null;
        this.f73638f = null;
        this.h = 0;
        this.isNeulErrorPage = false;
        this.f73640i = System.currentTimeMillis();
        this.mLoadUrl = null;
        this.f73643l = false;
        this.f73644m = false;
        this.f73645n = 2000;
        this.f73646o = false;
        this.f73647p = 0L;
        this.f73648q = -1L;
        this.f73649r = false;
        this.f73650s = false;
        SparseArray<int[]> sparseArray = C1897e.f6313a;
        this.f73651t = "0";
        this.reuseCount = 0;
        if (context instanceof C8900a) {
            this.f73637e = (C8900a) context;
        }
        this.f73642k = new BiliWebView(context);
        a();
    }

    public HybridWebViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.screenRealHeight = 0;
        this.realSizeGot = false;
        this.f73637e = null;
        this.f73638f = null;
        this.h = 0;
        this.isNeulErrorPage = false;
        this.f73640i = System.currentTimeMillis();
        this.mLoadUrl = null;
        this.f73643l = false;
        this.f73644m = false;
        this.f73645n = 2000;
        this.f73646o = false;
        this.f73647p = 0L;
        this.f73648q = -1L;
        this.f73649r = false;
        this.f73650s = false;
        SparseArray<int[]> sparseArray = C1897e.f6313a;
        this.f73651t = "0";
        this.reuseCount = 0;
        if (context instanceof C8900a) {
            this.f73637e = (C8900a) context;
        }
        this.f73642k = new BiliWebView(context, attributeSet);
        a();
    }

    public HybridWebViewV2(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.screenRealHeight = 0;
        this.realSizeGot = false;
        this.f73637e = null;
        this.f73638f = null;
        this.h = 0;
        this.isNeulErrorPage = false;
        this.f73640i = System.currentTimeMillis();
        this.mLoadUrl = null;
        this.f73643l = false;
        this.f73644m = false;
        this.f73645n = 2000;
        this.f73646o = false;
        this.f73647p = 0L;
        this.f73648q = -1L;
        this.f73649r = false;
        this.f73650s = false;
        SparseArray<int[]> sparseArray = C1897e.f6313a;
        this.f73651t = "0";
        this.reuseCount = 0;
        if (context instanceof C8900a) {
            this.f73637e = (C8900a) context;
        }
        this.f73642k = new BiliWebView(context, attributeSet, i7);
        a();
    }

    public HybridWebViewV2(Context context, AttributeSet attributeSet, int i7, String str) {
        super(context, attributeSet, i7);
        this.screenRealHeight = 0;
        this.realSizeGot = false;
        this.f73637e = null;
        this.f73638f = null;
        this.h = 0;
        this.isNeulErrorPage = false;
        this.f73640i = System.currentTimeMillis();
        this.mLoadUrl = null;
        this.f73643l = false;
        this.f73644m = false;
        this.f73645n = 2000;
        this.f73646o = false;
        this.f73647p = 0L;
        this.f73648q = -1L;
        this.f73649r = false;
        this.f73650s = false;
        SparseArray<int[]> sparseArray = C1897e.f6313a;
        this.f73651t = "0";
        this.reuseCount = 0;
        if (context instanceof C8900a) {
            this.f73637e = (C8900a) context;
        }
        this.f73642k = new BiliWebView(context, attributeSet, i7);
        this.f73633a = str;
        a();
    }

    public HybridWebViewV2(Context context, AttributeSet attributeSet, String str) {
        super(context, attributeSet);
        this.screenRealHeight = 0;
        this.realSizeGot = false;
        this.f73637e = null;
        this.f73638f = null;
        this.h = 0;
        this.isNeulErrorPage = false;
        this.f73640i = System.currentTimeMillis();
        this.mLoadUrl = null;
        this.f73643l = false;
        this.f73644m = false;
        this.f73645n = 2000;
        this.f73646o = false;
        this.f73647p = 0L;
        this.f73648q = -1L;
        this.f73649r = false;
        this.f73650s = false;
        SparseArray<int[]> sparseArray = C1897e.f6313a;
        this.f73651t = "0";
        this.reuseCount = 0;
        if (context instanceof C8900a) {
            this.f73637e = (C8900a) context;
        }
        this.f73642k = new BiliWebView(context, attributeSet);
        this.f73633a = str;
        a();
    }

    public HybridWebViewV2(Context context, String str) {
        super(context);
        this.screenRealHeight = 0;
        this.realSizeGot = false;
        this.f73637e = null;
        this.f73638f = null;
        this.h = 0;
        this.isNeulErrorPage = false;
        this.f73640i = System.currentTimeMillis();
        this.mLoadUrl = null;
        this.f73643l = false;
        this.f73644m = false;
        this.f73645n = 2000;
        this.f73646o = false;
        this.f73647p = 0L;
        this.f73648q = -1L;
        this.f73649r = false;
        this.f73650s = false;
        SparseArray<int[]> sparseArray = C1897e.f6313a;
        this.f73651t = "0";
        this.reuseCount = 0;
        if (context instanceof C8900a) {
            this.f73637e = (C8900a) context;
        }
        this.f73642k = new BiliWebView(context);
        this.f73633a = str;
        a();
    }

    public final void a() {
        String strB;
        String strA;
        String buvid;
        this.f73641j = SystemClock.elapsedRealtime();
        BiliWebView biliWebView = this.f73642k;
        if (biliWebView != null) {
            biliWebView.setWebViewInterceptor(new WebInterceptorManager());
            IBiliWebSettings iBiliWebSettings = biliWebView.getIBiliWebSettings();
            iBiliWebSettings.setJavaScriptEnabled(true);
            iBiliWebSettings.setUseWideViewPort(true);
            iBiliWebSettings.setSupportZoom(true);
            iBiliWebSettings.setBuiltInZoomControls(true);
            iBiliWebSettings.setLoadWithOverviewMode(true);
            iBiliWebSettings.setAllowFileAccess(false);
            iBiliWebSettings.setTextZoom(100);
            iBiliWebSettings.setMinimumFontSize(1);
            iBiliWebSettings.setMinimumLogicalFontSize(1);
            iBiliWebSettings.setMediaPlaybackRequiresUserGesture(false);
            iBiliWebSettings.setDomStorageEnabled(true);
            iBiliWebSettings.setDatabaseEnabled(true);
            iBiliWebSettings.setDisplayZoomControls(false);
            iBiliWebSettings.setAllowFileAccessFromFileURLs(false);
            iBiliWebSettings.setAllowUniversalAccessFromFileURLs(false);
            String userAgentString = iBiliWebSettings.getUserAgentString();
            String str = userAgentString;
            if (TextUtils.isEmpty(userAgentString)) {
                str = AppConfig.BILI_HTTP_UA_CHROME;
            }
            SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(biliWebView.getContext(), "bilibili.mall.share.preference");
            long jOptInteger = sharedPreferencesHelper.optInteger("screenNotchHeight", -1);
            boolean zOptBoolean = sharedPreferencesHelper.optBoolean("isNotchWindow", false);
            InterfaceC1681b interfaceC1681b = (InterfaceC1681b) BLRouter.INSTANCE.get(InterfaceC1681b.class, "default");
            boolean z6 = DeviceDecision.INSTANCE.getBoolean("mall.user_agent_magent_enable", true);
            if (interfaceC1681b != null) {
                strA = interfaceC1681b.a();
                buvid = interfaceC1681b.getBuvid();
                strB = z6 ? interfaceC1681b.b() : null;
            } else {
                strB = null;
                strA = null;
                buvid = null;
            }
            StringBuilder sbB = p.b(str, " BiliApp/");
            sbB.append(Foundation.instance().getApps().getVersionCode());
            sbB.append(" mobi_app/");
            sbB.append(BiliConfig.getMobiApp());
            sbB.append(" isNotchWindow/");
            sbB.append(zOptBoolean ? 1 : 0);
            sbB.append(" NotchHeight=");
            sbB.append((int) ((jOptInteger / biliWebView.getContext().getResources().getDisplayMetrics().density) + 0.5f));
            sbB.append(" mallVersion/");
            sbB.append(Foundation.instance().getApps().getVersionCode());
            sbB.append(" mVersion/");
            sbB.append(strA);
            sbB.append(" disable_rcmd/");
            sbB.append(!RecommendMode.isRecommendModeEnable() ? 1 : 0);
            Contract contractAb = ConfigManager.Companion.ab();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb.get("mall_risk_ua_replenish_open", bool), bool)) {
                sbB.append(" os/android model/");
                sbB.append(Build.MODEL);
                sbB.append(" build/");
                sbB.append(Foundation.instance().getApps().getVersionCode());
                sbB.append(" osVer/");
                sbB.append(Build.VERSION.RELEASE);
                sbB.append(" channel/");
                sbB.append(Foundation.instance().getApps().getChannel());
                sbB.append(" Buvid/");
                if (buvid == null) {
                    buvid = "";
                }
                sbB.append(buvid);
            }
            if (z6) {
                sbB.append(" magent/");
                sbB.append(strB);
            }
            sbB.append(" ");
            iBiliWebSettings.setUserAgentString(sbB.toString());
            if (C8836c.f128301b) {
                iBiliWebSettings.setCacheMode(2);
            }
            C2014r.a(biliWebView.getContext().getApplicationContext()).getClass();
            try {
                BiliWebView.getCookieManager().setAcceptCookie(true);
            } catch (Exception e7) {
                BLog.e("KFCWebView", "setAcceptCookie error", e7);
            }
            BiliWebView.enableDebugMode(true);
            biliWebView.removeJavascriptInterface("searchBoxJavaBridge_");
            biliWebView.removeJavascriptInterface("accessibility");
            biliWebView.removeJavascriptInterface("accessibilityTraversal");
        }
        a aVar = new a(this);
        if (FreeDataManager.getInstance().isTf()) {
            FreeDataManager.getInstance().initWebView(false, this.f73642k, aVar);
        } else {
            setWebViewClient(aVar);
        }
        this.f73635c = aVar;
        C1994Q c1994q = new C1994Q();
        setWebChromeClient(c1994q);
        this.f73636d = c1994q;
        if (TextUtils.isEmpty(this.f73633a)) {
            this.f73633a = "default";
        }
        this.f73634b = new BiliWebViewHybridBridgeV2(this, this.f73633a);
        this.f73642k.setVerticalTrackDrawable((Drawable) null);
        super.addView(this.f73642k, new FrameLayout.LayoutParams(-1, -1));
    }

    public void attach(@NonNull HybridWebContext hybridWebContext) {
        this.f73638f = hybridWebContext;
        C8900a c8900a = this.f73637e;
        if (c8900a != null) {
            try {
                Field declaredField = ContextWrapper.class.getDeclaredField("mBase");
                declaredField.setAccessible(true);
                declaredField.set(c8900a, hybridWebContext);
            } catch (Exception e7) {
                APMRecorder.Companion.getInstance().record(new APMRecorder.Builder().product("hyg").subEvent("replaceContextFail").build());
            }
        }
        this.f73634b.attach(hybridWebContext);
        BiliWebView biliWebView = this.f73642k;
        if (biliWebView != null) {
            biliWebView.attachActivity(hybridWebContext.getActivity());
        }
    }

    public void destroy() {
        Map<String, Map<String, C8834a>> map = C8836c.f128300a;
        if (!this.f73639g) {
            this.f73639g = true;
            this.f73634b.destroy();
        }
        ViewParent parent = getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this);
        }
        removeAllViews();
        this.f73642k.destroy();
    }

    public void detach() {
        this.f73638f = null;
        C8900a c8900a = this.f73637e;
        if (c8900a != null) {
            try {
                Field declaredField = ContextWrapper.class.getDeclaredField("mBase");
                declaredField.setAccessible(true);
                declaredField.set(c8900a, null);
            } catch (Exception e7) {
            }
        }
    }

    public void evaluateJavascript(String str) {
        this.f73634b.evaluateJavascript(str);
    }

    public long getCreateTime() {
        return this.f73641j;
    }

    @Override // com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b
    public View getCurrentScrollerView() {
        return this.f73642k;
    }

    public BiliWebViewHybridBridgeV2 getHybridBridge() {
        return this.f73634b;
    }

    public HybridContext getHybridContext() {
        HybridWebContext hybridWebContext = this.f73638f;
        if (hybridWebContext != null) {
            return hybridWebContext;
        }
        throw new IllegalStateException("please call HybridWebView.attach(HybridWebContext) first!");
    }

    public int getLoadState() {
        return this.h;
    }

    public long getNeulHideLoadingTime() {
        return this.f73648q;
    }

    public long getNeulStartTime() {
        return this.f73647p;
    }

    public int getNeulTimeout() {
        return this.f73645n;
    }

    public Map<String, String> getOfflineStatus() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_STATUS, this.f73642k.getOfflineStatus() + "");
        map.put("modName", this.f73642k.getOfflineModName());
        map.put("modVersion", this.f73642k.getOfflineModVersion());
        return map;
    }

    public long getOnCreateTime() {
        return this.f73640i;
    }

    public PvInfo getPvInfo() {
        return null;
    }

    @Override // com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b
    public List<View> getScrolledViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f73642k);
        return arrayList;
    }

    public BiliWebView getWebView() {
        return this.f73642k;
    }

    public boolean isDestroied() {
        return this.f73639g;
    }

    public boolean isNeul() {
        return this.f73643l;
    }

    public boolean isNeulComplete() {
        return this.f73646o;
    }

    public boolean isPreload() {
        return this.f73649r;
    }

    public boolean isPreloadComplete() {
        return this.f73650s;
    }

    public void loadNeulPage(String str, int i7) {
        if (getContext() != null && !this.realSizeGot) {
            this.screenRealHeight = WindowManagerHelper.getDisplayRealSize(getContext()).y;
            this.realSizeGot = true;
        }
        this.f73643l = true;
        this.f73645n = i7;
        this.f73647p = SystemClock.elapsedRealtime();
        BiliWebView biliWebView = this.f73642k;
        if (biliWebView != null && biliWebView.getInnerView() != null) {
            this.f73642k.getInnerView().layout(0, 0, getResources().getDisplayMetrics().widthPixels, this.screenRealHeight);
        }
        loadUrl(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadUrl(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.HybridWebViewV2.loadUrl(java.lang.String):void");
    }

    public void onArkLoaded() {
        if (this.f73643l) {
            String str = this.mLoadUrl;
            if (str == null || TextUtils.isEmpty(str) || this.f73644m) {
                Xi1.b.a(new StringBuilder("ark page onArkLoaded else: "), this.mLoadUrl, "Neul");
                return;
            }
            if (this.mLoadUrl.startsWith("bilimmw://mall.bilibili.com/")) {
                Lazy<NeulPool> lazy = NeulPool.f73574l;
                NeulPool.a.a().f73577b.add(this);
                this.f73644m = true;
                return;
            }
            Lazy<NeulPool> lazy2 = NeulPool.f73574l;
            NeulPool neulPoolA = NeulPool.a.a();
            String str2 = this.mLoadUrl;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = this.f73647p;
            neulPoolA.getClass();
            synchronized (NeulPool.f73575m) {
                if (isNeul()) {
                    neulPoolA.h++;
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
                    neulPoolA.f73578c.remove(str3);
                    neulPoolA.f73576a.put(str3, this);
                    APMRecorder.Builder builder = new APMRecorder.Builder();
                    builder.product("hyg-web").bizCode(200).networkCode(neulPoolA.f73579d ? "0" : "-1235").duration(String.valueOf(jElapsedRealtime - j7)).subEvent(str3.concat("_neul_ark_load"));
                    APMRecorder.Companion.getInstance().record(builder.build());
                    neulPoolA.f73579d = true;
                } else {
                    BLog.d("Neul", "ark page onNeulPageFinish else: " + str2);
                }
                Unit unit = Unit.INSTANCE;
            }
            this.f73644m = true;
        }
    }

    public boolean onBackPressed() {
        return this.f73634b.onBackPressed();
    }

    public void onWebReload() {
        this.f73634b.onWebReload();
    }

    public void preloadPage(String str, float f7) {
        if (getContext() != null && !this.realSizeGot) {
            this.screenRealHeight = WindowManagerHelper.getDisplayRealSize(getContext()).y;
            this.realSizeGot = true;
        }
        BiliWebView biliWebView = this.f73642k;
        if (biliWebView != null && biliWebView.getInnerView() != null) {
            this.f73642k.getInnerView().layout(0, 0, getResources().getDisplayMetrics().widthPixels, (int) (this.screenRealHeight * f7));
        }
        this.f73649r = true;
        loadUrl(str);
    }

    public void setEnableHybridBridge(boolean z6) {
        this.f73634b.setEnabled(z6);
    }

    public void setIsNeul(boolean z6) {
        this.f73643l = z6;
    }

    public void setIsPreload(boolean z6) {
        this.f73649r = z6;
    }

    public void setNeulComplete(boolean z6) {
        this.f73646o = z6;
        if (this.f73648q == -1) {
            this.f73648q = SystemClock.elapsedRealtime();
        }
    }

    public void setPreloadComplete(boolean z6) {
        this.f73650s = z6;
    }

    public void setSentinelXXX(SentinelXXX sentinelXXX) {
        this.f73652u = sentinelXXX;
    }

    public void setWebChromeClient(BiliWebChromeClient biliWebChromeClient) {
        C1994Q c1994q = this.f73636d;
        if (c1994q != null) {
            c1994q.a(biliWebChromeClient);
        } else {
            this.f73642k.setWebChromeClient(biliWebChromeClient);
        }
    }

    public void setWebViewClient(BiliWebViewClient biliWebViewClient) {
        a aVar = this.f73635c;
        if (aVar != null) {
            aVar.a(biliWebViewClient);
        } else {
            this.f73642k.setWebViewClient(biliWebViewClient);
        }
    }
}
