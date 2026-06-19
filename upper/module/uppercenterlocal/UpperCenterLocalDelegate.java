package com.bilibili.upper.module.uppercenterlocal;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.K;
import com.bilibili.api.base.Config;
import com.bilibili.common.hilowebview.jsb.h;
import com.bilibili.common.hilowebview.jsb.i;
import com.bilibili.common.hilowebview.service.HiloBiz;
import com.bilibili.common.hilowebview.utils.TimeLineTag;
import com.bilibili.common.hilowebview.view.HiloWebView;
import com.bilibili.upper.module.uppercenterlocal.vm.UpperCenterLocalViewModel;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterLocalDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f114226a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f114229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.uppercenterlocal.service.e f114230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.uppercenterlocal.service.d f114231f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f114227b = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final b f114232g = new b(this);

    @NotNull
    public final UpperCenterLocalDelegate$hiloContainerServer$1 h = new h(this) { // from class: com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate$hiloContainerServer$1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperCenterLocalDelegate f114238a;

        {
            this.f114238a = this;
        }

        public final Flow A0() {
            BLog.e("UpperCenterLocalDelegate", "interceptPopGesture ");
            return FlowKt.callbackFlow(new UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2(new AtomicBoolean(false), this.f114238a, null));
        }

        public final void close() {
            UpperCenterLocalDelegate upperCenterLocalDelegate = this.f114238a;
            BuildersKt.launch$default(upperCenterLocalDelegate.f114226a.V3(), (CoroutineContext) null, (CoroutineStart) null, new UpperCenterLocalDelegate$hiloContainerServer$1$close$1(upperCenterLocalDelegate, null), 3, (Object) null);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f114233i = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate$a.class */
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UpperCenterLocalDelegate f114234a;

        public a(UpperCenterLocalDelegate upperCenterLocalDelegate) {
            this.f114234a = upperCenterLocalDelegate;
        }

        public final void a3(String str) {
            yW.h timeLine;
            defpackage.a.b("✅ onPageReady url=", str, "UpperCenterLocalDelegate");
            UpperCenterLocalDelegate upperCenterLocalDelegate = this.f114234a;
            HiloWebView hiloWebViewQa = upperCenterLocalDelegate.f114226a.Qa();
            if (hiloWebViewQa != null) {
                hiloWebViewQa.setVisibility(0);
            }
            HiloWebView hiloWebViewQa2 = upperCenterLocalDelegate.f114226a.Qa();
            if (hiloWebViewQa2 != null && (timeLine = hiloWebViewQa2.getTimeLine()) != null) {
                timeLine.c((Long) null, TimeLineTag.BonesReady.getValue());
            }
            upperCenterLocalDelegate.f114228c++;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate$b.class */
    public static final class b implements com.bilibili.common.hilowebview.http.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f114235a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UpperCenterLocalDelegate f114236b;

        public b(UpperCenterLocalDelegate upperCenterLocalDelegate) {
            this.f114236b = upperCenterLocalDelegate;
        }

        public final String[] a() {
            return new String[]{"/x/app/index/v4", "/c/spark/app/inspiration/rotate"};
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.lang.String r9, com.bilibili.common.hilowebview.http.h r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 633
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate.b.b(java.lang.String, com.bilibili.common.hilowebview.http.h, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate$hiloContainerServer$1] */
    public UpperCenterLocalDelegate(@NotNull d dVar) {
        this.f114226a = dVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate r5, boolean r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate.a(com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void d() {
        if (Config.isDebuggable()) {
            try {
                WebView.setWebContentsDebuggingEnabled(true);
                BLog.i("UpperCenterLocalDelegate", "WebView debugging enabled");
            } catch (Exception e7) {
                BLog.e("UpperCenterLocalDelegate", "Failed to enable WebView debugging", e7);
            }
        }
    }

    public final void b() {
        Object obj;
        d dVar = this.f114226a;
        HiloWebView hiloWebViewQa = dVar.Qa();
        if (hiloWebViewQa == null) {
            return;
        }
        FragmentActivity fragmentActivityH0 = dVar.h0();
        if (fragmentActivityH0 == null) {
            BLog.e("UpperCenterLocalDelegate", "hostActivity is null, skip service init");
            return;
        }
        if (this.f114230e == null) {
            this.f114230e = new com.bilibili.upper.module.uppercenterlocal.service.e(new WeakReference(fragmentActivityH0), dVar.V3());
        }
        if (this.f114231f == null) {
            this.f114231f = new com.bilibili.upper.module.uppercenterlocal.service.d(new WeakReference(fragmentActivityH0));
        }
        try {
            Result.Companion companion = Result.Companion;
            hiloWebViewQa.registerPrivacyController(Reflection.getOrCreateKotlinClass(i.class), this.f114233i);
            hiloWebViewQa.registerPrivacyController(Reflection.getOrCreateKotlinClass(h.class), this.h);
            com.bilibili.upper.module.uppercenterlocal.service.e eVar = this.f114230e;
            if (eVar != null) {
                hiloWebViewQa.registerPrivacyController(Reflection.getOrCreateKotlinClass(com.bilibili.upper.module.uppercenterlocal.service.b.class), eVar);
            }
            com.bilibili.upper.module.uppercenterlocal.service.d dVar2 = this.f114231f;
            if (dVar2 != null) {
                hiloWebViewQa.registerPrivacyController(Reflection.getOrCreateKotlinClass(com.bilibili.upper.module.uppercenterlocal.service.a.class), dVar2);
            }
            c();
            hiloWebViewQa.setVisibility(0);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            M.b("configJsBridge failed e=", th2.getMessage(), "UpperCenterLocalDelegate");
        }
    }

    public final void c() {
        try {
            HiloWebView hiloWebViewQa = this.f114226a.Qa();
            if (hiloWebViewQa == null) {
                return;
            }
            Field declaredField = HiloWebView.class.getDeclaredField("instance");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(hiloWebViewQa);
            WebView webView = obj instanceof WebView ? (WebView) obj : null;
            if (webView == null) {
                return;
            }
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate$enableWebConsoleLogcat$1

                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate$enableWebConsoleLogcat$1$a.class */
                public static final /* synthetic */ class a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final int[] f114237a;

                    static {
                        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
                        try {
                            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
                        } catch (NoSuchFieldError e7) {
                        }
                        try {
                            iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
                        } catch (NoSuchFieldError e8) {
                        }
                        try {
                            iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 3;
                        } catch (NoSuchFieldError e9) {
                        }
                        try {
                            iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 4;
                        } catch (NoSuchFieldError e10) {
                        }
                        try {
                            iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
                        } catch (NoSuchFieldError e11) {
                        }
                        f114237a = iArr;
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                @Override // android.webkit.WebChromeClient
                public boolean onConsoleMessage(ConsoleMessage consoleMessage) throws NoWhenBranchMatchedException {
                    ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
                    int iLineNumber = consoleMessage.lineNumber();
                    String strSourceId = consoleMessage.sourceId();
                    String strMessage = consoleMessage.message();
                    StringBuilder sb = new StringBuilder("[H5Console][");
                    sb.append(messageLevel);
                    sb.append("] ");
                    sb.append(strMessage);
                    sb.append(" (");
                    String strA = K.a(iLineNumber, strSourceId, ":", ")", sb);
                    int i7 = messageLevel == null ? -1 : a.f114237a[messageLevel.ordinal()];
                    if (i7 == 1) {
                        BLog.e("UpperCenterLocalDelegate", strA);
                        return true;
                    }
                    if (i7 == 2) {
                        BLog.w("UpperCenterLocalDelegate", strA);
                        return true;
                    }
                    if (i7 != 3 && i7 != 4 && i7 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BLog.i("UpperCenterLocalDelegate", strA);
                    return true;
                }
            });
            BLog.i("UpperCenterLocalDelegate", "✅ WebView console 已转发到 Logcat");
        } catch (Exception e7) {
            BLog.e("UpperCenterLocalDelegate", "配置 WebView 设置失败", e7);
        }
    }

    public final void e() {
        yW.h timeLine;
        d dVar = this.f114226a;
        HiloWebView hiloWebViewQa = dVar.Qa();
        if (hiloWebViewQa != null && (timeLine = hiloWebViewQa.getTimeLine()) != null) {
            timeLine.c(Long.valueOf(this.f114229d), TimeLineTag.ActivityCreate.getValue());
        }
        FragmentActivity fragmentActivityH0 = dVar.h0();
        if (fragmentActivityH0 == null) {
            return;
        }
        UpperCenterLocalViewModel upperCenterLocalViewModelH5 = dVar.H5();
        if (upperCenterLocalViewModelH5 != null) {
            upperCenterLocalViewModelH5.f114299c.f114259f = new com.bilibili.upper.module.uppercenterlocal.b(fragmentActivityH0);
        }
        UpperCenterLocalViewModel upperCenterLocalViewModelH52 = dVar.H5();
        if (upperCenterLocalViewModelH52 != null) {
            upperCenterLocalViewModelH52.I0();
        }
    }

    public final void f() {
        yW.h timeLine;
        HiloWebView hiloWebViewQa = this.f114226a.Qa();
        if (hiloWebViewQa == null || (timeLine = hiloWebViewQa.getTimeLine()) == null) {
            return;
        }
        yW.h.e(timeLine, "upper.timeline.local", MapsKt.mapOf(new Pair[]{TuplesKt.to("business_info", this.f114227b), TuplesKt.to("load_count", String.valueOf(this.f114228c)), TuplesKt.to("page_name", HiloBiz.UpperCenterMain.getKey())}));
    }
}
