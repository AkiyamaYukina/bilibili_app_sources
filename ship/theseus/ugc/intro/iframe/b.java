package com.bilibili.ship.theseus.ugc.intro.iframe;

import Vu0.z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.A;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bh.interfaces.WebResourceError;
import com.bilibili.app.comm.bh.interfaces.WebResourceRequest;
import com.bilibili.app.comm.bhwebview.api.interfaces.SslError;
import com.bilibili.app.comm.bhwebview.api.interfaces.SslErrorHandler;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceResponse;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.common.webview.js.JsbProxy;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.lib.ui.RouteConstKt;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/b.class */
@StabilityInferred(parameters = 0)
public final class b extends m<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f97021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f97022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public JsbProxy f97023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BiliWebViewConfigHolderV2 f97024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f97025e = StateFlowKt.MutableStateFlow(c.C0835b.f97034a);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/b$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f97026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f97027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Integer f97028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Integer f97029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Integer f97030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Integer f97031f;

        public a(@NotNull String str, double d7, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
            this.f97026a = str;
            this.f97027b = d7;
            this.f97028c = num;
            this.f97029d = num2;
            this.f97030e = num3;
            this.f97031f = num4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f97026a, aVar.f97026a) && Double.compare(this.f97027b, aVar.f97027b) == 0 && Intrinsics.areEqual(this.f97028c, aVar.f97028c) && Intrinsics.areEqual(this.f97029d, aVar.f97029d) && Intrinsics.areEqual(this.f97030e, aVar.f97030e) && Intrinsics.areEqual(this.f97031f, aVar.f97031f);
        }

        public final int hashCode() {
            int iA = A.a(this.f97027b, this.f97026a.hashCode() * 31, 31);
            int iHashCode = 0;
            Integer num = this.f97028c;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            Integer num2 = this.f97029d;
            int iHashCode3 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.f97030e;
            int iHashCode4 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.f97031f;
            if (num4 != null) {
                iHashCode = num4.hashCode();
            }
            return ((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("IframeState(url=");
            sb.append(this.f97026a);
            sb.append(", aspectRatio=");
            sb.append(this.f97027b);
            sb.append(", bgColor=");
            sb.append(this.f97028c);
            sb.append(", textColor=");
            sb.append(this.f97029d);
            sb.append(", buttonTextColor=");
            sb.append(this.f97030e);
            sb.append(", buttonBgColor=");
            return e4.c.a(sb, this.f97031f, ")");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.iframe.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/b$b.class */
    public static final class C0834b extends BiliWebViewConfigHolderV2.BiliWebChromeClient {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<c> f97032g;

        public C0834b(@NotNull BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2, @NotNull MutableStateFlow<c> mutableStateFlow) {
            super(biliWebViewConfigHolderV2);
            this.f97032g = mutableStateFlow;
        }

        public final void onProgressChanged(@Nullable BiliWebView biliWebView, int i7) {
            super.onProgressChanged(biliWebView, i7);
            if (i7 == 100) {
                MutableStateFlow<c> mutableStateFlow = this.f97032g;
                if (Intrinsics.areEqual(mutableStateFlow.getValue(), c.a.f97033a)) {
                    return;
                }
                mutableStateFlow.tryEmit(c.C0836c.f97035a);
            }
        }

        public final void onShowWarningWhenProgressMax(@Nullable Uri uri) {
        }

        public final void onStartFileChooserForResult(@NotNull Intent intent) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/b$c.class */
    public interface c {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/b$c$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f97033a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -809028026;
            }

            @NotNull
            public final String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.iframe.b$c$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/b$c$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0835b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0835b f97034a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0835b);
            }

            public final int hashCode() {
                return 1728785914;
            }

            @NotNull
            public final String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.iframe.b$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/b$c$c.class */
        @StabilityInferred(parameters = 1)
        public static final class C0836c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0836c f97035a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0836c);
            }

            public final int hashCode() {
                return -475034431;
            }

            @NotNull
            public final String toString() {
                return "Success";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/b$d.class */
    public static final class d extends BiliWebViewConfigHolderV2.BiliWebViewClient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<c> f97036b;

        public d(@NotNull BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2, @NotNull MutableStateFlow<c> mutableStateFlow) {
            super(biliWebViewConfigHolderV2);
            this.f97036b = mutableStateFlow;
        }

        public final boolean customOverrideUrlLoading(@Nullable BiliWebView biliWebView, @Nullable String str) {
            Uri uriBuild;
            String scheme;
            if (biliWebView == null || str == null || StringsKt.isBlank(str) || (scheme = (uriBuild = Uri.parse(str).buildUpon().build()).getScheme()) == null || scheme.length() == 0) {
                return false;
            }
            if (!Intrinsics.areEqual("http", scheme) && !Intrinsics.areEqual("https", scheme)) {
                return BLRouter.routeTo(Yb.a.b(uriBuild), biliWebView.getContext()).isSuccess();
            }
            final int i7 = 0;
            RouteResponse routeResponseRouteTo = BLRouter.routeTo(new RouteRequest.Builder(uriBuild).props(new Function1(i7) { // from class: com.bilibili.ship.theseus.ugc.intro.iframe.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f97037a;

                {
                    this.f97037a = i7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f97037a) {
                        case 0:
                            ((MutableBundleLike) obj).put(RouteConstKt.PROPS_PAGE_FROM, "mweb");
                            return Unit.INSTANCE;
                        default:
                            FrameLayout frameLayout = new FrameLayout((Context) obj);
                            frameLayout.setId(View.generateViewId());
                            return frameLayout;
                    }
                }
            }).build(), biliWebView.getContext());
            if (routeResponseRouteTo.getCode() == RouteResponse.Code.FORBIDDEN) {
                return true;
            }
            return routeResponseRouteTo.isSuccess();
        }

        public final void onReceivedError(@Nullable BiliWebView biliWebView, int i7, @Nullable String str, @Nullable String str2) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedError(biliWebView, i7, str, str2);
            this.f97036b.tryEmit(c.a.f97033a);
        }

        @Deprecated(message = "兼容小程序二进制检查，即将删除", replaceWith = @ReplaceWith(expression = "onReceivedError", imports = {"com.bilibili.app.comm.bh"}))
        public final void onReceivedError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedError(biliWebView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            this.f97036b.tryEmit(c.a.f97033a);
        }

        public final void onReceivedError(@Nullable BiliWebView biliWebView, @Nullable com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceRequest webResourceRequest, @Nullable com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceError webResourceError) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedError(biliWebView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            this.f97036b.tryEmit(c.a.f97033a);
        }

        public final void onReceivedHttpError(@Nullable BiliWebView biliWebView, @Nullable com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedHttpError(biliWebView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            this.f97036b.tryEmit(c.a.f97033a);
        }

        public final void onReceivedSslError(@Nullable BiliWebView biliWebView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
            super/*com.bilibili.lib.biliweb.f*/.onReceivedSslError(biliWebView, sslErrorHandler, sslError);
            this.f97036b.tryEmit(c.a.f97033a);
        }

        public final void onShowWarningWhenPageFinished(@Nullable Uri uri) {
        }
    }

    public b(@NotNull a aVar) {
        this.f97021a = aVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.ugc.intro.iframe.b r6, Vu0.z r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$initWebView$1
            if (r0 == 0) goto L2e
            r0 = r8
            com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$initWebView$1 r0 = (com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$initWebView$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L38
        L2e:
            com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$initWebView$1 r0 = new com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$initWebView$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L38:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L63
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L5b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5b:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L85
        L63:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$initWebView$2 r0 = new com.bilibili.ship.theseus.ugc.intro.iframe.UgcIntroIframeComponent$initWebView$2
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = 0
            r1.<init>(r2, r3, r4)
            r6 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r6
            r1 = r8
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r10
            if (r0 != r1) goto L85
            r0 = r10
            return r0
        L85:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.iframe.b.c(com.bilibili.ship.theseus.ugc.intro.iframe.b, Vu0.z, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        z zVar = (z) viewBinding;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcIntroIframeComponent$bind$2(this, zVar, zVar.f25994a.getContext(), null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z.inflate(LayoutInflater.from(context), viewGroup, false);
    }
}
