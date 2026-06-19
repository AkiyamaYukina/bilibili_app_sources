package com.bilibili.opd.app.bizcommon.hybridruntime.web;

import Dm0.C1604b;
import Fm0.C1897e;
import Fm0.C1898f;
import Fm0.C1900h;
import Fm0.RunnableC1895c;
import G.p;
import Gm0.C1980C;
import Gm0.C1984G;
import Gm0.C1988K;
import Gm0.C1992O;
import Gm0.C2005i;
import Gm0.C2006j;
import Gm0.C2011o;
import Gm0.C2012p;
import Gm0.C2013q;
import Gm0.C2014r;
import Gm0.RunnableC1985H;
import Gm0.RunnableC1986I;
import Gm0.RunnableC1989L;
import Gm0.RunnableC1990M;
import XM.a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.authorspace.local.service.j;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.base.BiliContext;
import com.bilibili.bililive.usblivekit.pccon.protocol.TypeEnum;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.biliweb.BiliBaseImgChooserChromeClient;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.lib.jsbridge.special.PvInfo;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.lib.ui.webview2.WebSuicide;
import com.bilibili.live.streaming.push.BiliUSBFlashpoint;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.opd.app.bizcommon.biliapm.APMRecorder;
import com.bilibili.opd.app.bizcommon.context.Environment;
import com.bilibili.opd.app.bizcommon.context.ISValue;
import com.bilibili.opd.app.bizcommon.context.KFCFragmentLoaderActivity;
import com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment;
import com.bilibili.opd.app.bizcommon.context.ModuleEnviroment;
import com.bilibili.opd.app.bizcommon.context.StatusBarMode;
import com.bilibili.opd.app.bizcommon.context.session.MallSession;
import com.bilibili.opd.app.bizcommon.context.session.MallSessionHelper;
import com.bilibili.opd.app.bizcommon.context.utils.LifeCycleChecker;
import com.bilibili.opd.app.bizcommon.context.utils.TraceLog;
import com.bilibili.opd.app.bizcommon.hybridruntime.core.context.HybridContext;
import com.bilibili.opd.app.bizcommon.hybridruntime.neul.NeulPool;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.HybridWebViewV2;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.a;
import com.bilibili.opd.app.bizcommon.radar.Radar;
import com.bilibili.opd.app.bizcommon.radar.core.i;
import com.bilibili.opd.app.bizcommon.sentinel.page.PageDetector;
import com.bilibili.opd.app.sentinel.SentinelXXX;
import com.bilibili.pvtracker.PageViewTracker;
import com.google.android.material.snackbar.Snackbar;
import com.mall.ui.page.home.h5.MallHomeWebFragment;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import tv.danmaku.android.log.BLog;
import vm0.InterfaceC8835b;
import vm0.d;
import vm0.h;
import wm0.C8900a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/KFCWebFragmentV2.class */
public class KFCWebFragmentV2 extends KFCToolbarFragment implements a.b, ISValue {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f73655O = {2130970030};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Pattern f73656P = Pattern.compile("\\bisNotchWindow/\\d+\\sNotchHeight=\\d+");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f73657A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1992O f73658B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f73659C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Integer f73660D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f73661E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f73662F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f73663G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Handler f73664H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C1604b.a f73665I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final c f73666J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f73667K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f73668L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C1984G f73669M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final RunnableC1985H f73670N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public HybridWebViewV2 f73673d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f73680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f73681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f73682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public BiliBaseImgChooserChromeClient f73683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f73684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public StatusBarMode f73685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Map<String, String> f73686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f73687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f73688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PvInfo f73689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PvInfo f73690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f73691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f73692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f73693y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.bilibili.opd.app.bizcommon.hybridruntime.web.b f73694z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public LinearLayout f73671b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ProgressBar f73672c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View f73674e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f73675f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public C2005i f73676g = null;
    public boolean h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f73677i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Uri f73678j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Uri f73679k = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/KFCWebFragmentV2$a.class */
    public static final class a extends BiliBaseImgChooserChromeClient {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final WeakReference<KFCWebFragmentV2> f73695g;

        public a(KFCWebFragmentV2 kFCWebFragmentV2) {
            this.f73695g = new WeakReference<>(kFCWebFragmentV2);
        }

        @NonNull
        public final Context getContext() {
            return this.f73695g.get() != null ? this.f73695g.get().getApplicationContext() : BiliContext.application();
        }

        public final Activity getHostActivity() {
            return this.f73695g.get() == null ? null : this.f73695g.get().p3();
        }

        public final boolean onJsAlert(BiliWebView biliWebView, String str, String str2, dg.d dVar) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject object = JSON.parseObject(str2);
                    if (TextUtils.equals(object.getString("callback"), "hasMethod") && this.f73695g.get() != null) {
                        boolean zBooleanValue = object.getBoolean("value").booleanValue();
                        KFCWebFragmentV2 kFCWebFragmentV2 = this.f73695g.get();
                        if (zBooleanValue) {
                            int[] iArr = KFCWebFragmentV2.f73655O;
                            kFCWebFragmentV2.getClass();
                        } else if (kFCWebFragmentV2.f73673d != null) {
                            kFCWebFragmentV2.lg();
                        }
                    }
                } catch (Exception e7) {
                }
            }
            dVar.confirm();
            return super/*com.bilibili.app.comm.bh.BiliWebChromeClient*/.onJsAlert(biliWebView, str, str2, dVar);
        }

        public final void onProgressChanged(BiliWebView biliWebView, int i7) {
            super/*com.bilibili.app.comm.bh.BiliWebChromeClient*/.onProgressChanged(biliWebView, i7);
            if (this.f73695g.get() != null && this.f73695g.get().f73672c != null) {
                this.f73695g.get().f73672c.setProgress(i7);
            }
            String url = biliWebView.getUrl();
            if (i7 != 100 || this.f73695g.get() == null) {
                return;
            }
            KFCWebFragmentV2 kFCWebFragmentV2 = this.f73695g.get();
            int[] iArr = KFCWebFragmentV2.f73655O;
            kFCWebFragmentV2.Eg(url);
        }

        public final void onReceivedTitle(BiliWebView biliWebView, String str) {
            super/*com.bilibili.app.comm.bh.BiliWebChromeClient*/.onReceivedTitle(biliWebView, str);
            if (this.f73695g.get() == null || this.f73695g.get().f73677i != null) {
                return;
            }
            String string = str;
            if (TextUtils.equals(str, "about:blank")) {
                string = this.f73695g.get().getString(2131827698);
            }
            this.f73695g.get().setTitle(string);
        }

        public final boolean onShowFileChooser(Intent intent) {
            try {
                if (this.f73695g.get() == null) {
                    return false;
                }
                this.f73695g.get().startActivityForResult(intent, 255);
                return true;
            } catch (ActivityNotFoundException e7) {
                return false;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/web/KFCWebFragmentV2$b.class */
    public static final class b extends BiliBaseImgChooserChromeClient {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final WeakReference<KFCWebFragmentV2> f73696g;

        public b(KFCWebFragmentV2 kFCWebFragmentV2) {
            this.f73696g = new WeakReference<>(kFCWebFragmentV2);
        }

        @NonNull
        public final Context getContext() {
            return this.f73696g.get() != null ? this.f73696g.get().getApplicationContext() : BiliContext.application();
        }

        public final Bitmap getDefaultVideoPoster() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawARGB(0, 0, 0, 0);
            return bitmapCreateBitmap;
        }

        public final Activity getHostActivity() {
            return this.f73696g.get() == null ? null : this.f73696g.get().p3();
        }

        public final boolean onJsAlert(BiliWebView biliWebView, String str, String str2, dg.d dVar) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject object = JSON.parseObject(str2);
                    if (TextUtils.equals(object.getString("callback"), "hasMethod") && this.f73696g.get() != null) {
                        boolean zBooleanValue = object.getBoolean("value").booleanValue();
                        KFCWebFragmentV2 kFCWebFragmentV2 = this.f73696g.get();
                        if (zBooleanValue) {
                            int[] iArr = KFCWebFragmentV2.f73655O;
                            kFCWebFragmentV2.getClass();
                        } else if (kFCWebFragmentV2.f73673d != null) {
                            kFCWebFragmentV2.lg();
                        }
                    }
                } catch (Exception e7) {
                }
            }
            dVar.confirm();
            return super/*com.bilibili.app.comm.bh.BiliWebChromeClient*/.onJsAlert(biliWebView, str, str2, dVar);
        }

        public final void onProgressChanged(BiliWebView biliWebView, int i7) {
            super/*com.bilibili.app.comm.bh.BiliWebChromeClient*/.onProgressChanged(biliWebView, i7);
            if (this.f73696g.get() != null && this.f73696g.get().f73672c != null) {
                this.f73696g.get().f73672c.setProgress(i7);
            }
            String url = biliWebView.getUrl();
            if (i7 != 100 || this.f73696g.get() == null) {
                return;
            }
            KFCWebFragmentV2 kFCWebFragmentV2 = this.f73696g.get();
            int[] iArr = KFCWebFragmentV2.f73655O;
            kFCWebFragmentV2.Eg(url);
        }

        public final void onReceivedTitle(BiliWebView biliWebView, String str) {
            super/*com.bilibili.app.comm.bh.BiliWebChromeClient*/.onReceivedTitle(biliWebView, str);
            if (this.f73696g.get() == null || this.f73696g.get().f73677i != null) {
                return;
            }
            String string = str;
            if (TextUtils.equals(str, "about:blank")) {
                string = this.f73696g.get().getString(2131827698);
            }
            this.f73696g.get().setTitle(string);
        }

        public final boolean onShowFileChooser(Intent intent) {
            try {
                if (this.f73696g.get() == null) {
                    return false;
                }
                this.f73696g.get().startActivityForResult(intent, 255);
                return true;
            } catch (ActivityNotFoundException e7) {
                return false;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [com.bilibili.opd.app.bizcommon.hybridruntime.web.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [Gm0.G] */
    /* JADX WARN: Type inference failed for: r1v28, types: [Gm0.H] */
    public KFCWebFragmentV2() {
        SparseArray<int[]> sparseArray = C1897e.f6313a;
        this.f73682n = "0";
        this.f73684p = "default";
        this.f73685q = StatusBarMode.IMMERSIVE;
        this.f73686r = new HashMap();
        this.f73687s = -1L;
        this.f73688t = -1L;
        this.f73691w = false;
        this.f73692x = false;
        this.f73657A = false;
        Lazy<NeulPool> lazy = NeulPool.f73574l;
        this.f73661E = NeulPool.a.a().f73583i;
        this.f73662F = false;
        this.f73663G = false;
        this.f73664H = new Handler();
        this.f73665I = new C1604b.a();
        this.f73666J = new Object();
        this.f73667K = false;
        this.f73668L = false;
        this.f73669M = new PageViewTracker.OnSwitchToBackgroundListener(this) { // from class: Gm0.G

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KFCWebFragmentV2 f7225a;

            {
                this.f7225a = this;
            }

            @Override // com.bilibili.pvtracker.PageViewTracker.OnSwitchToBackgroundListener
            public final void switchToBackground() {
                this.f7225a.f73691w = true;
            }
        };
        this.f73670N = new Runnable(this) { // from class: Gm0.H

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KFCWebFragmentV2 f7226a;

            {
                this.f7226a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                HybridWebViewV2 hybridWebViewV2;
                KFCWebFragmentV2 kFCWebFragmentV2 = this.f7226a;
                int[] iArr = KFCWebFragmentV2.f73655O;
                if (kFCWebFragmentV2.activityDie() || (hybridWebViewV2 = kFCWebFragmentV2.f73673d) == null || hybridWebViewV2.isNeulComplete()) {
                    return;
                }
                kFCWebFragmentV2.lg();
            }
        };
    }

    public static void mf(KFCWebFragmentV2 kFCWebFragmentV2, String str, String str2, String str3, String str4) {
        kFCWebFragmentV2.getClass();
        try {
            kFCWebFragmentV2.mToolbar.setBackgroundColor(Color.parseColor(str));
            if (TextUtils.equals(str2, "0")) {
                StatusBarCompat.setStatusBarDarkMode(kFCWebFragmentV2.p3());
            } else if (TextUtils.equals(str2, "1")) {
                StatusBarCompat.setStatusBarLightMode(kFCWebFragmentV2.p3());
            }
        } catch (Exception e7) {
        }
        Toolbar toolbar = kFCWebFragmentV2.mToolbar;
        if (toolbar instanceof WebToolbar) {
            WebToolbar webToolbar = (WebToolbar) toolbar;
            webToolbar.getClass();
            try {
                webToolbar.f73698e.setTextColor(Color.parseColor(str3));
            } catch (Exception e8) {
            }
            try {
                webToolbar.f73705m = Color.parseColor(str4);
                TintImageView tintImageView = webToolbar.f73699f;
                tintImageView.setImageDrawable(ThemeUtils.tintDrawable(tintImageView.getDrawable(), webToolbar.f73705m));
                TintImageView tintImageView2 = webToolbar.f73700g;
                tintImageView2.setImageDrawable(ThemeUtils.tintDrawable(tintImageView2.getDrawable(), webToolbar.f73705m));
                StaticImageView2 staticImageView2 = webToolbar.h;
                if (staticImageView2 != null) {
                    staticImageView2.setColorFilter(webToolbar.f73705m);
                }
                StaticImageView2 staticImageView22 = webToolbar.f73701i;
                if (staticImageView22 != null) {
                    staticImageView22.setColorFilter(webToolbar.f73705m);
                }
            } catch (Exception e9) {
            }
        }
    }

    public static /* synthetic */ void nf(KFCWebFragmentV2 kFCWebFragmentV2, List list) {
        ((WebToolbar) kFCWebFragmentV2.mToolbar).setOnRightButtonClickListener(new C1980C(kFCWebFragmentV2));
        ((WebToolbar) kFCWebFragmentV2.mToolbar).setRightIcons(list);
    }

    public static Map uf(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Af(com.bilibili.lib.jsbridge.special.PvInfo r7) {
        /*
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r7
            java.util.Map r0 = r0.getParamsMap()
            java.util.Map r0 = uf(r0)
            r9 = r0
            r0 = r6
            r1 = r9
            r0.Xf(r1)
            r0 = r6
            r1 = r9
            r0.Wf(r1)
            r0 = r9
            if (r0 == 0) goto L3e
            r0 = r9
            java.util.HashMap r0 = (java.util.HashMap) r0
            r10 = r0
            r0 = r10
            java.lang.String r1 = "loadType"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L3e
            r0 = r10
            java.lang.String r1 = "loadType"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = Fm0.C1900h.b(r0)
            r8 = r0
            goto L40
        L3e:
            r0 = 0
            r8 = r0
        L40:
            r0 = r7
            java.lang.String r0 = r0.getEventId()     // Catch: java.lang.Exception -> L6d
            r1 = r8
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L6d
            r3 = r9
            com.bilibili.pvtracker.PageViewTracker.endInH5(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6d
            r9 = r0
            r0 = r9
            java.lang.String r1 = "end report"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L6d
            r0 = r9
            r1 = r7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = "kfc_webfragment"
            r1 = r9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6d
            tv.danmaku.android.log.BLog.d(r0, r1)     // Catch: java.lang.Exception -> L6d
            goto L78
        L6d:
            r7 = move-exception
            java.lang.String r0 = "kfc_webfragment"
            r1 = r7
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.e(r0, r1)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.Af(com.bilibili.lib.jsbridge.special.PvInfo):void");
    }

    public void Ag() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Bf(com.bilibili.lib.jsbridge.special.PvInfo r7) {
        /*
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r7
            java.util.Map r0 = r0.getParamsMap()
            java.util.Map r0 = uf(r0)
            r9 = r0
            r0 = r6
            r1 = r9
            r0.Xf(r1)
            r0 = r6
            r1 = r9
            r0.Wf(r1)
            r0 = r9
            if (r0 == 0) goto L3e
            r0 = r9
            java.util.HashMap r0 = (java.util.HashMap) r0
            r10 = r0
            r0 = r10
            java.lang.String r1 = "loadType"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L3e
            r0 = r10
            java.lang.String r1 = "loadType"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = Fm0.C1900h.b(r0)
            r8 = r0
            goto L40
        L3e:
            r0 = 0
            r8 = r0
        L40:
            r0 = r6
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L71
            r0.f73688t = r1     // Catch: java.lang.Exception -> L71
            r0 = r7
            java.lang.String r0 = r0.getEventId()     // Catch: java.lang.Exception -> L71
            r1 = r8
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L71
            r3 = r9
            com.bilibili.pvtracker.PageViewTracker.startInH5(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L71
            r9 = r0
            r0 = r9
            java.lang.String r1 = "start report"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L71
            r0 = r9
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = "kfc_webfragment"
            r1 = r9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L71
            tv.danmaku.android.log.BLog.d(r0, r1)     // Catch: java.lang.Exception -> L71
            goto L7c
        L71:
            r7 = move-exception
            java.lang.String r0 = "kfc_webfragment"
            r1 = r7
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.e(r0, r1)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.Bf(com.bilibili.lib.jsbridge.special.PvInfo):void");
    }

    public boolean Bg() {
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x006e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void C1() {
        /*
            r6 = this;
            r0 = r6
            boolean r0 = r0.activityDie()
            if (r0 != 0) goto L6d
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7 = r0
            r0 = r6
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f73686r
            r9 = r0
            r0 = r7
            java.lang.String r1 = ""
            java.lang.String r0 = com.bilibili.app.authorspace.local.service.j.a(r0, r1)
            r10 = r0
            r0 = r9
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "render-error"
            r2 = r10
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r6
            com.bilibili.opd.app.bizcommon.sentinel.page.PageDetector r0 = r0.getPageDetector()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L37
            r0 = r9
            r1 = r6
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f73686r
            r0.setExtras(r1)
        L37:
            r0 = r6
            android.widget.TextView r0 = r0.mTitleTextView
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L4e
            r0 = r9
            Gm0.A r1 = new Gm0.A
            r2 = r1
            r3 = r6
            r4 = 0
            r2.<init>(r3, r4)
            boolean r0 = r0.post(r1)
        L4e:
            Gm0.M r0 = new Gm0.M     // Catch: java.lang.Exception -> L6e
            r9 = r0
            r0 = r9
            r1 = r6
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L6e
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Exception -> L6e
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L6e
            if (r0 != r1) goto L68
            r0 = r9
            r0.run()     // Catch: java.lang.Exception -> L6e
            goto L6d
        L68:
            r0 = 0
            r1 = r9
            com.bilibili.droid.thread.HandlerThreads.post(r0, r1)     // Catch: java.lang.Exception -> L6e
        L6d:
            return
        L6e:
            r9 = move-exception
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.C1():void");
    }

    public void Cf(JSONObject jSONObject, d.a aVar) {
    }

    public boolean Cg() {
        boolean z6 = true;
        if (this.f73681m != 1) {
            z6 = false;
        }
        return z6;
    }

    public void Df(JSONObject jSONObject) {
    }

    public void Dg(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    @Nullable
    public h Ef(@Nullable InterfaceC8835b.C1367b c1367b, @Nullable JSONObject jSONObject, @Nullable HybridContext hybridContext, @Nullable C2011o c2011o) {
        return new h(1002, null, null);
    }

    public final void Eg(@Nullable String str) {
        Uri uri;
        if (TextUtils.isEmpty(str) || this.f73675f || this.f73674e == null || this.f73678j == null || TextUtils.equals(str, "about:blank") || activityDie() || (uri = Uri.parse(str)) == null) {
            return;
        }
        Fg(uri);
    }

    public void Ff(JSONObject jSONObject, d.a aVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Fg(android.net.Uri r8) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.Fg(android.net.Uri):void");
    }

    @Override // com.bilibili.opd.app.bizcommon.hybridruntime.web.a.b
    public final void Gb(String str) {
        SparseArray<int[]> sparseArray = C1897e.f6313a;
        this.f73682n = C1900h.a(C1897e.a.a(str));
        C2012p.b(getApplicationContext(), "themeType", this.f73682n);
        HybridWebViewV2 hybridWebViewV2 = this.f73673d;
        if (hybridWebViewV2 != null) {
            hybridWebViewV2.getHybridBridge().evaluateJavascript("if(window.themeDidChange) {window.themeDidChange({ themeType : " + this.f73682n + "})};");
        }
    }

    public void Gf(d.a aVar) {
    }

    public void Hf(JSONObject jSONObject) {
    }

    public final com.bilibili.opd.app.bizcommon.hybridruntime.web.b If() {
        HybridWebViewV2 hybridWebViewV2;
        if (this.f73694z == null) {
            this.f73694z = new com.bilibili.opd.app.bizcommon.hybridruntime.web.b(this.f73679k, this);
        }
        com.bilibili.opd.app.bizcommon.hybridruntime.web.b bVar = this.f73694z;
        if (bVar.f73719c == null && (hybridWebViewV2 = this.f73673d) != null) {
            bVar.f73719c = hybridWebViewV2;
        }
        return bVar;
    }

    public void Jf(d.a aVar) {
    }

    public void Kf(JSONObject jSONObject, d.a aVar) {
    }

    public Map<String, String> Lf() {
        return null;
    }

    public final HybridWebViewV2 Mf() {
        HybridWebViewV2 hybridWebViewV2 = null;
        if (!C1898f.a()) {
            return null;
        }
        Boolean bool = (Boolean) ConfigManager.ab().get("mallwebviewloading", Boolean.FALSE);
        HybridWebViewV2 hybridWebViewV22 = null;
        if (bool != null) {
            hybridWebViewV22 = null;
            if (bool.booleanValue()) {
                C2006j c2006j = (C2006j) C2006j.f7265c.getValue();
                c2006j.getClass();
                if (!C1898f.a()) {
                    BLog.e(c2006j.f7267b, "pop just for web process");
                } else if (c2006j.f7266a.size() > 0) {
                    hybridWebViewV2 = c2006j.f7266a.get(0);
                    c2006j.f7266a.remove(hybridWebViewV2);
                }
                final C8900a c8900a = new C8900a(getApplicationContext());
                final int i7 = 0;
                HandlerThreads.getHandler(0).postDelayed(new Runnable(i7, this, c8900a) { // from class: Gm0.B

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f7214a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f7215b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f7216c;

                    {
                        this.f7214a = i7;
                        this.f7215b = this;
                        this.f7216c = c8900a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte[] bArr;
                        switch (this.f7214a) {
                            case 0:
                                KFCWebFragmentV2 kFCWebFragmentV2 = (KFCWebFragmentV2) this.f7215b;
                                C8900a c8900a2 = (C8900a) this.f7216c;
                                int[] iArr = KFCWebFragmentV2.f73655O;
                                kFCWebFragmentV2.getClass();
                                C2006j c2006j2 = (C2006j) C2006j.f7265c.getValue();
                                String str = kFCWebFragmentV2.f73684p;
                                c2006j2.getClass();
                                if (!C1898f.a()) {
                                    BLog.e(c2006j2.f7267b, "prepare just for web process");
                                } else if (c2006j2.f7266a.size() < 1) {
                                    c2006j2.f7266a.add(new HybridWebViewV2(c8900a2, str));
                                }
                                break;
                            default:
                                FileInputStream fileInputStream = (FileInputStream) this.f7215b;
                                ZM.a aVar = (ZM.a) this.f7216c;
                                byte[] bArr2 = new byte[20];
                                while (true) {
                                    try {
                                        a.a.a("PCFLVPush", "onReceive readSize = " + fileInputStream.read(aVar.i));
                                        int i8 = 0;
                                        int i9 = 0;
                                        while (true) {
                                            bArr = aVar.i;
                                            if (i8 < 20) {
                                                byte b7 = bArr2[i8];
                                                bArr2[i9] = bArr[i9];
                                                i8++;
                                                i9++;
                                            }
                                        }
                                        ArraysKt.g(bArr, bArr2, 0, 0, 19, 2);
                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
                                        aN.b bVar = new aN.b();
                                        bVar.a = TypeEnum.NONE.getValue();
                                        byteBufferOrder.getInt();
                                        bVar.a = byteBufferOrder.getInt();
                                        byteBufferOrder.getInt();
                                        bVar.b = byteBufferOrder.getInt();
                                        byteBufferOrder.getInt();
                                        aVar.a(bVar, bArr);
                                        ArraysKt.u(aVar.i);
                                    } catch (Exception e7) {
                                        a.a.a.e("PCFLVPush", String.valueOf(e7.getMessage()), e7);
                                        BiliUSBFlashpoint biliUSBFlashpoint = aVar.a;
                                        if (biliUSBFlashpoint != null) {
                                            biliUSBFlashpoint.onError("receiveError");
                                        }
                                        return;
                                    }
                                }
                                break;
                        }
                    }
                }, 200L);
                hybridWebViewV22 = hybridWebViewV2;
                if (this.f73678j != null) {
                    JSONObject jSONObject = new JSONObject();
                    String string = this.f73678j.toString();
                    String str = string;
                    if (string == null) {
                        str = "";
                    }
                    APMRecorder.Builder builder = new APMRecorder.Builder();
                    APMRecorder.Builder builderBizCode = builder.product("hyg").subEvent("mallwebviewByloading").bizCode(1001);
                    String jSONString = str;
                    if (str.length() == 0) {
                        jSONString = jSONObject.toJSONString();
                    }
                    builderBizCode.extJson(jSONString).networkCode("").duration("").build();
                    APMRecorder.Companion.getInstance().record(builder);
                    hybridWebViewV22 = hybridWebViewV2;
                }
            }
        }
        return hybridWebViewV22;
    }

    public void Nf(HybridContext hybridContext, d.a aVar) {
    }

    public void Of(d.a aVar) {
    }

    @Nullable
    public SentinelXXX Pf() {
        return null;
    }

    public void Qf(d.a aVar) {
    }

    public void Rf(JSONObject jSONObject, d.a aVar) {
    }

    public boolean Sf(@Nullable InterfaceC8835b.C1367b c1367b) {
        return false;
    }

    public final void Tf(final boolean z6, int i7, boolean z7, boolean z8) {
        if (!z6 && this.f73673d != null) {
            if (z8) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (z7) {
                    ((HashMap) this.f73686r).put("render-hideLoading", j.a(jElapsedRealtime, ""));
                    if (this.f73673d.isNeul()) {
                        this.f73673d.setNeulComplete(true);
                    }
                    mg("h5d_" + i7);
                }
                if (this.f73687s == -1) {
                    this.f73687s = jElapsedRealtime;
                }
            }
            HandlerThreads.post(0, new Runnable(this) { // from class: Gm0.N

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final KFCWebFragmentV2 f7238a;

                {
                    this.f7238a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f7238a.hideLoading();
                }
            });
        }
        HandlerThreads.post(0, new Runnable(this, z6) { // from class: Gm0.z

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KFCWebFragmentV2 f7301a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f7302b;

            {
                this.f7301a = this;
                this.f7302b = z6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                KFCWebFragmentV2 kFCWebFragmentV2 = this.f7301a;
                boolean z9 = this.f7302b;
                int[] iArr = KFCWebFragmentV2.f73655O;
                kFCWebFragmentV2.zf(z9);
            }
        });
        if (z6 || !z8 || getPageDetector() == null) {
            return;
        }
        getPageDetector().stop();
    }

    public void Uf() {
    }

    public String Vf() {
        return getQueryParameter("url");
    }

    public final void Wf(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (map == null) {
            map2 = new HashMap();
        }
        String str = this.prePageId;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        map2.put("pre_mall_pageId", str2);
        String str3 = this.curPageId;
        if (str3 == null) {
            str3 = "";
        }
        map2.put("cur_mall_pageId", str3);
    }

    public final void Xf(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (map == null) {
            map2 = new HashMap();
        }
        MallSession mallSession = MallSessionHelper.INSTANCE.getMallSession();
        String sessionId = mallSession.getSessionId();
        String string = mallSession.getSourceType() == null ? "" : mallSession.getSourceType().toString();
        String str = this.f73659C;
        if (str != null) {
            sessionId = str;
        }
        map2.put("mallSessionId", sessionId);
        Integer num = this.f73660D;
        if (num != null) {
            string = num.toString();
        }
        map2.put("mallSourceType", string);
    }

    public boolean Yf() {
        return false;
    }

    public boolean Zf() {
        return !(this instanceof MallHomeWebFragment);
    }

    public void ag(JSONObject jSONObject, d.a aVar) {
    }

    public void bg(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    public void cg(LayoutInflater layoutInflater, View view, ViewGroup viewGroup) {
    }

    public void dg(BiliWebView biliWebView, String str) {
        hideLoading();
        Eg(str);
        if (this.f73673d != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((HashMap) this.f73686r).put("render-loaded", j.a(jElapsedRealtime, ""));
            for (Map.Entry<String, String> entry : this.f73673d.getOfflineStatus().entrySet()) {
                ((HashMap) this.f73686r).put("pageFinished_" + entry.getKey(), entry.getValue());
            }
            if (TextUtils.equals(str, "about:blank") || TextUtils.equals(this.f73693y, "about:blank")) {
                biliWebView.clearHistory();
            }
        }
    }

    public void eg(BiliWebView biliWebView, String str, Bitmap bitmap) {
        pg(Uri.parse(str));
        if (this.f73672c != null && Cg()) {
            this.f73672c.setVisibility(0);
        }
        if (this.h) {
            getToolbar().setVisibility(8);
        }
        mg("l1");
    }

    public void fg() {
        PageDetector pageDetector = getPageDetector();
        HybridWebViewV2 hybridWebViewV2 = this.f73673d;
        if (hybridWebViewV2 == null || !hybridWebViewV2.isNeul() || this.f73673d.isNeulErrorPage) {
            HybridWebViewV2 hybridWebViewV22 = this.f73673d;
            if (hybridWebViewV22 != null) {
                if (!this.f73667K) {
                    Uri uri = this.f73678j;
                    hybridWebViewV22.loadUrl(uri != null ? uri.toString() : "");
                } else if (hybridWebViewV22.isPreloadComplete()) {
                    Tf(false, -2, false, false);
                    BLog.i("kfc_webfragment", "onNormalWebViewLoad manualLoaded");
                }
                if (pageDetector != null) {
                    pageDetector.getAPMPageExtra().put(PageDetector.NETWORK_CODE, "1024");
                    return;
                }
                return;
            }
            return;
        }
        this.f73680l = true;
        if (pageDetector != null) {
            pageDetector.getAPMPageExtra().put(PageDetector.NETWORK_CODE, "1025");
            Boolean bool = (Boolean) ConfigManager.ab().get("mall_neul_more_webview", Boolean.FALSE);
            if (bool != null) {
                ((HashMap) this.f73686r).put("supportMoreWebview", bool + "");
            }
        }
        HybridWebViewV2 hybridWebViewV23 = this.f73673d;
        if (hybridWebViewV23 == null || !hybridWebViewV23.isNeulComplete()) {
            HybridWebViewV2 hybridWebViewV24 = this.f73673d;
            if (hybridWebViewV24 != null) {
                hybridWebViewV24.postDelayed(this.f73670N, hybridWebViewV24.getNeulTimeout());
                return;
            }
            return;
        }
        Tf(false, -2, false, false);
        if (this.f73673d.getNeulHideLoadingTime() > -1) {
            this.f73687s = this.f73673d.getNeulHideLoadingTime();
        }
        hideLoading();
    }

    @Nullable
    public PageDetector getPageDetector() {
        try {
            if (!(p3() instanceof KFCFragmentLoaderActivity)) {
                return null;
            }
            PageDetector pageDetector = (PageDetector) ((KFCFragmentLoaderActivity) p3()).getPageDetector();
            if (pageDetector != null) {
                pageDetector.setIsWebPage();
            }
            return pageDetector;
        } catch (Exception e7) {
            BLog.e("kfc_webfragment", e7.toString());
            return null;
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.context.ISValue
    public final String getProbeId() {
        if (this.f73678j == null) {
            return null;
        }
        return this.f73678j.getHost() + this.f73678j.getPath();
    }

    @Override // com.bilibili.opd.app.bizcommon.context.ISValue
    public final String getSchema() {
        Uri uri = this.f73678j;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public void gg(JSONObject jSONObject, d.a aVar) {
    }

    public void hg(JSONObject jSONObject) {
    }

    public final void hideLoading() {
        ProgressBar progressBar = this.f73672c;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        mg("l0");
    }

    public void ig(JSONObject jSONObject, d.a aVar) {
    }

    public void jg(JSONObject jSONObject, d.a aVar) {
    }

    public void kg(JSONObject jSONObject) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lg() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.lg():void");
    }

    public final void mg(String str) {
        Lazy lazy = C1604b.f2988a;
        C1604b.b(this.f73665I, str, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ng() {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.ng():void");
    }

    public void of(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    public void og(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        BiliBaseImgChooserChromeClient biliBaseImgChooserChromeClient;
        if (i7 != 255 || (biliBaseImgChooserChromeClient = this.f73683o) == null) {
            super.onActivityResult(i7, i8, intent);
        } else {
            biliBaseImgChooserChromeClient.onReceiveFile(i8, intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a1  */
    /* JADX WARN: Type inference failed for: r0v79, types: [Gm0.i, java.lang.Object] */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttach(android.content.Context r6) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.onAttach(android.content.Context):void");
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment
    public void onBackPressed() {
        if (this.f73692x) {
            HybridWebViewV2 hybridWebViewV2 = this.f73673d;
            if (hybridWebViewV2 == null || hybridWebViewV2.getWebView() == null) {
                return;
            }
            BiliWebView webView = this.f73673d.getWebView();
            webView.post(new RunnableC1895c(webView, "if (window.onWebViewBack) { window.onWebViewBack(); }"));
            return;
        }
        HybridWebViewV2 hybridWebViewV22 = this.f73673d;
        if (hybridWebViewV22 == null || !hybridWebViewV22.onBackPressed()) {
            HybridWebViewV2 hybridWebViewV23 = this.f73673d;
            if (hybridWebViewV23 != null && hybridWebViewV23.getWebView() != null && this.f73673d.getWebView().canGoBack()) {
                this.f73673d.getWebView().goBack();
                this.f73673d.postDelayed(new RunnableC1989L(this, 0), 1000L);
            } else {
                if (i.a.a(p3())) {
                    return;
                }
                super.onBackPressed();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        String host;
        super.onConfigurationChanged(configuration);
        c cVar = this.f73666J;
        Uri uri = this.f73679k;
        cVar.getClass();
        String strA = (uri == null || (host = uri.getHost()) == null) ? null : p.a(host, uri.getPath());
        JSONObject jSONObject = new JSONObject();
        String str = strA;
        if (strA == null) {
            str = "";
        }
        APMRecorder.Builder builder = new APMRecorder.Builder();
        APMRecorder.Builder builderBizCode = builder.product("hyg").subEvent("mallWebPageConfigChange").bizCode(0);
        String jSONString = str;
        if (str.length() == 0) {
            jSONString = jSONObject.toJSONString();
        }
        builderBizCode.extJson(jSONString).networkCode("").duration("").build();
        APMRecorder.Companion.getInstance().record(builder);
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Zf()) {
            WebSuicide.enter("kfc_webfragment");
        }
        mg("onCreate");
        com.bilibili.opd.app.bizcommon.hybridruntime.web.a aVarA = com.bilibili.opd.app.bizcommon.hybridruntime.web.a.a(getApplicationContext());
        aVarA.getClass();
        if (aVarA.f73714b == null) {
            a.SharedPreferencesOnSharedPreferenceChangeListenerC0467a sharedPreferencesOnSharedPreferenceChangeListenerC0467a = new a.SharedPreferencesOnSharedPreferenceChangeListenerC0467a(aVarA);
            aVarA.f73714b = sharedPreferencesOnSharedPreferenceChangeListenerC0467a;
            aVarA.f73713a.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC0467a);
        }
        List<a.b> list = aVarA.f73715c;
        if (list != null) {
            ((ArrayList) list).add(this);
        }
        PageViewTracker.getInstance().registerSwitchToBackgroundListener(this.f73669M);
        Environment environment = getEnvironment();
        if (ModuleEnviroment.class.isInstance(environment)) {
            this.f73684p = ((ModuleEnviroment) environment).getModuleName();
        } else {
            this.f73684p = "default";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0306  */
    /* JADX WARN: Type inference failed for: r1v0, types: [Gm0.O, java.lang.Object] */
    @Override // com.bilibili.opd.app.bizcommon.context.KFCToolbarFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateContentView(android.view.LayoutInflater r9, @androidx.annotation.Nullable android.view.ViewGroup r10, @androidx.annotation.Nullable android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.onCreateContentView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        a.SharedPreferencesOnSharedPreferenceChangeListenerC0467a sharedPreferencesOnSharedPreferenceChangeListenerC0467a;
        Snackbar snackbar;
        C2005i c2005i = this.f73676g;
        if (c2005i != null && (snackbar = c2005i.f7263a) != null && snackbar.isShownOrQueued()) {
            c2005i.f7263a.dismiss();
        }
        com.bilibili.opd.app.bizcommon.hybridruntime.web.a aVarA = com.bilibili.opd.app.bizcommon.hybridruntime.web.a.a(getApplicationContext());
        List<a.b> list = aVarA.f73715c;
        if (list == null) {
            Log.e("KFCThemeChangeHelper", "mPrefChangeListenerList == null");
        } else {
            ((ArrayList) list).remove(this);
            if (((ArrayList) aVarA.f73715c).isEmpty() && (sharedPreferencesOnSharedPreferenceChangeListenerC0467a = aVarA.f73714b) != null) {
                aVarA.f73713a.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC0467a);
                aVarA.f73714b = null;
            }
        }
        HybridWebViewV2 hybridWebViewV2 = this.f73673d;
        if (hybridWebViewV2 != null) {
            hybridWebViewV2.destroy();
            this.f73673d = null;
        }
        PageViewTracker.getInstance().unregisterSwitchToBackgroundListener(this.f73669M);
        if (Zf()) {
            WebSuicide.leave("kfc_webfragment");
        }
        super.onDestroy();
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Toolbar toolbar = getToolbar();
        if (toolbar instanceof WebToolbar) {
            ((WebToolbar) toolbar).setOnTitleEventListener(null);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        Uri uri = this.f73679k;
        String string = uri == null ? "" : uri.toString();
        JSONObject jSONObject = new JSONObject();
        String str = string;
        if (string == null) {
            str = "";
        }
        APMRecorder.Builder builder = new APMRecorder.Builder();
        APMRecorder.Builder builderBizCode = builder.product("hyg").subEvent("lowMemory").bizCode(0);
        String jSONString = str;
        if (str.length() == 0) {
            jSONString = jSONObject.toJSONString();
        }
        builderBizCode.extJson(jSONString).networkCode("").duration("").build();
        APMRecorder.Companion.getInstance().record(builder);
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MallSession mallSession = MallSessionHelper.INSTANCE.getMallSession();
        this.f73659C = mallSession.getSessionId();
        this.f73660D = mallSession.getSourceType();
        TraceLog.i("onPause mPauseSessionId: " + this.f73659C + " mPauseSourceType: " + this.f73660D);
        PvInfo pvInfo = this.f73689u;
        if (pvInfo == null) {
            return;
        }
        Radar.emitPvEndEvent(pvInfo.getEventId(), this.f73689u.getParamsMap(), true, this.f73688t);
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        String str = this.f73677i;
        if (str != null) {
            setTitle(str);
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, String> map = this.f73686r;
        ((HashMap) map).put("render-start", j.a(jElapsedRealtime, ""));
        PvInfo pvInfo = this.f73689u;
        if (pvInfo == null) {
            return;
        }
        if (!pvInfo.equals(this.f73690v) || this.f73691w) {
            if (this.f73691w) {
                this.f73689u.getParamsMap().put("loadType", 0);
            }
            Bf(this.f73689u);
            this.f73690v = this.f73689u;
            this.f73691w = false;
        }
    }

    @Override // com.bilibili.opd.app.bizcommon.context.KFCFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        try {
            Lazy lazy = C1604b.f2988a;
            HashMap<String, String> mapA = C1604b.a(this.f73665I);
            ((HashMap) this.f73686r).putAll(mapA);
            String stringExtra = p3().getIntent().getStringExtra(PageDetector.PAGE_WEB_KEY);
            ((HashMap) this.f73686r).put("webPrStarted", stringExtra);
            c cVar = this.f73666J;
            HybridWebViewV2 hybridWebViewV2 = this.f73673d;
            HashMap<String, Object> mapA2 = cVar.a(hybridWebViewV2, this.f73679k, hybridWebViewV2 != null && hybridWebViewV2.isNeul(), mapA, stringExtra);
            HybridWebViewV2 hybridWebViewV22 = this.f73673d;
            if (hybridWebViewV22 != null && hybridWebViewV22.getWebView() != null) {
                BiliWebView webView = this.f73673d.getWebView();
                if (!LifeCycleChecker.isAlive(this)) {
                    Build.BRAND.contains("vivo");
                    if (webView != null) {
                        webView.loadUrl("");
                    }
                }
                this.f73673d.removeCallbacks(this.f73670N);
                try {
                    if (this.f73673d.getWebView().getWebViewType() == 1) {
                        C2014r.a(p3()).getClass();
                        try {
                            BiliWebView.getCookieManager().flush();
                        } catch (Exception e7) {
                            BLog.e("KFCWebView", "cookiesFlush error", e7);
                        }
                    } else {
                        C2013q.b(p3()).getClass();
                        C2013q.a().flush();
                    }
                } catch (Exception e8) {
                }
            }
            ng();
            HybridWebViewV2 hybridWebViewV23 = this.f73673d;
            If().a(mapA2, mapA, hybridWebViewV23 != null ? hybridWebViewV23.getOfflineStatus() : null);
            PvInfo pvInfo = this.f73689u;
            if (pvInfo != null) {
                Af(pvInfo);
                this.f73689u.getParamsMap().put("loadType", 1);
                this.f73690v = null;
            }
            Handler handler = this.f73664H;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f73664H = null;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = getToolbar();
        if (toolbar instanceof WebToolbar) {
            ((WebToolbar) toolbar).setOnTitleEventListener(new C1988K(this));
        }
        try {
            if (this.h) {
                RunnableC1986I runnableC1986I = new RunnableC1986I(this);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnableC1986I.run();
                } else {
                    HandlerThreads.post(0, runnableC1986I);
                }
            } else {
                RunnableC1990M runnableC1990M = new RunnableC1990M(this, 0);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnableC1990M.run();
                } else {
                    HandlerThreads.post(0, runnableC1990M);
                }
            }
        } catch (Exception e7) {
        }
        HybridWebViewV2 hybridWebViewV2 = this.f73673d;
        if (hybridWebViewV2 == null) {
            finishAttachedActivity();
            return;
        }
        if (hybridWebViewV2.isNeulErrorPage) {
            C1();
        }
        fg();
    }

    public void pf(JSONObject jSONObject, d.a aVar) {
    }

    public final void pg(@Nullable Uri uri) {
        if (uri == null || !uri.isHierarchical()) {
            return;
        }
        String queryParameter = uri.getQueryParameter("noTitleBar");
        if (queryParameter != null) {
            this.h = "1".equals(queryParameter);
        }
        this.f73677i = uri.getQueryParameter("title");
        try {
            if (this.h) {
                RunnableC1986I runnableC1986I = new RunnableC1986I(this);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnableC1986I.run();
                } else {
                    HandlerThreads.post(0, runnableC1986I);
                }
            } else {
                RunnableC1990M runnableC1990M = new RunnableC1990M(this, 0);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnableC1990M.run();
                } else {
                    HandlerThreads.post(0, runnableC1990M);
                }
            }
        } catch (Exception e7) {
        }
        String str = this.f73677i;
        if (str != null) {
            setTitle(str);
        }
        this.f73679k = uri;
        If().f73720d = this.f73679k;
    }

    public boolean qf(InterfaceC8835b.C1367b c1367b, JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
        return false;
    }

    public void qg(JSONObject jSONObject, d.a aVar) {
    }

    public final void rf(final String str, final String str2, final String str3, final String str4) {
        if (this.mToolbar == null || activityDie() || p3() == null) {
            return;
        }
        p3().runOnUiThread(new Runnable(this, str, str4, str2, str3) { // from class: Gm0.J

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KFCWebFragmentV2 f7228a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f7229b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f7230c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f7231d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f7232e;

            {
                this.f7228a = this;
                this.f7229b = str;
                this.f7230c = str4;
                this.f7231d = str2;
                this.f7232e = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                KFCWebFragmentV2.mf(this.f7228a, this.f7229b, this.f7230c, this.f7231d, this.f7232e);
            }
        });
    }

    public void rg() {
    }

    @Override // com.bilibili.opd.app.bizcommon.context.ISValue
    public boolean sValueEnable() {
        return false;
    }

    public void sf(JSONObject jSONObject, HybridContext hybridContext) {
    }

    public void sg(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    public void tf() {
    }

    public void tg(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    public void ug(JSONObject jSONObject, d.a aVar) {
    }

    public View vf(HybridWebViewV2 hybridWebViewV2, LinearLayout linearLayout) {
        return hybridWebViewV2;
    }

    public void vg(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0491  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bilibili.opd.app.bizcommon.hybridruntime.web.HybridWebViewV2 wf() {
        /*
            Method dump skipped, instruction units count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.wf():com.bilibili.opd.app.bizcommon.hybridruntime.web.HybridWebViewV2");
    }

    public void wg(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean xf(com.bilibili.app.comm.bh.BiliWebView r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = r6
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 == 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r4
            android.net.Uri r0 = r0.f73678j
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L23
            r0 = r9
            java.lang.String r0 = r0.toString()
            r9 = r0
            goto L26
        L23:
            r0 = 0
            r9 = r0
        L26:
            r0 = r9
            java.lang.String r1 = "https://b23.tv"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L38
            r0 = r5
            r1 = r6
            r0.loadUrl(r1)
            r0 = 1
            return r0
        L38:
            r0 = r6
            java.lang.String r1 = "bilibili://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L4b
            r0 = r4
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r1 = r6
            boolean r0 = com.bilibili.opd.app.bizcommon.hybridruntime.web.UrlHelper.openByRouter(r0, r1)
            return r0
        L4b:
            r0 = r8
            r7 = r0
            r0 = r9
            boolean r0 = com.bilibili.opd.app.bizcommon.hybridruntime.web.UrlHelper.isMallDomain(r0)
            if (r0 != 0) goto Laa
            r0 = r8
            r7 = r0
            r0 = r9
            boolean r0 = com.bilibili.opd.app.bizcommon.hybridruntime.web.UrlHelper.isShowDomain(r0)
            if (r0 != 0) goto Laa
            r0 = r6
            boolean r0 = com.bilibili.opd.app.bizcommon.hybridruntime.web.UrlHelper.isMallDomain(r0)
            if (r0 != 0) goto L72
            r0 = r8
            r7 = r0
            r0 = r6
            boolean r0 = com.bilibili.opd.app.bizcommon.hybridruntime.web.UrlHelper.isShowDomain(r0)
            if (r0 == 0) goto Laa
        L72:
            r0 = r6
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = "innerOpen"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch: java.lang.Exception -> L80
            r5 = r0
            goto L8f
        L80:
            r5 = move-exception
            java.lang.String r0 = "kfc_webfragment"
            java.lang.String r1 = "getQueryParameter exception:"
            r2 = r5
            int r0 = android.util.Log.e(r0, r1, r2)
            java.lang.String r0 = "0"
            r5 = r0
        L8f:
            r0 = r8
            r7 = r0
            r0 = r5
            int r0 = Fm0.C1900h.b(r0)
            r1 = 1
            if (r0 == r1) goto Laa
            r0 = r8
            r7 = r0
            r0 = r4
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r1 = r6
            boolean r0 = com.bilibili.opd.app.bizcommon.hybridruntime.web.UrlHelper.openByRouter(r0, r1)
            if (r0 == 0) goto Laa
            r0 = 1
            r7 = r0
        Laa:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.web.KFCWebFragmentV2.xf(com.bilibili.app.comm.bh.BiliWebView, java.lang.String):boolean");
    }

    public void xg(JSONObject jSONObject, HybridContext hybridContext, d.a aVar) {
    }

    public void yf(JSONObject jSONObject, d.a aVar) {
    }

    public final void yg(final List<WebToolbarButtonBean> list) {
        if (this.mToolbar == null || activityDie() || p3() == null || !(this.mToolbar instanceof WebToolbar)) {
            return;
        }
        p3().runOnUiThread(new Runnable(this, list) { // from class: Gm0.F

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KFCWebFragmentV2 f7223a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f7224b;

            {
                this.f7223a = this;
                this.f7224b = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                KFCWebFragmentV2.nf(this.f7223a, this.f7224b);
            }
        });
    }

    public void zf(boolean z6) {
        Animatable animatable;
        Animatable animatable2;
        Animatable animatable3;
        C1992O c1992o = this.f73658B;
        View view = c1992o.f7239a;
        if (view != null) {
            view.setVisibility(z6 ? 0 : 8);
        }
        if (z6 && (animatable3 = c1992o.f7240b) != null && animatable3.isRunning()) {
            Animatable animatable4 = c1992o.f7240b;
            if (animatable4 != null) {
                animatable4.start();
                return;
            }
            return;
        }
        if (z6 || (animatable = c1992o.f7240b) == null || !animatable.isRunning() || (animatable2 = c1992o.f7240b) == null) {
            return;
        }
        animatable2.stop();
    }

    public void zg(JSONObject jSONObject, d.a aVar) {
    }
}
