package com.bilibili.ship.theseus.united.page.weblayer;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliConfig;
import com.bilibili.app.comm.IJsBridgeContextV2;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bh.interfaces.WebViewCallbackClient;
import com.bilibili.app.comm.bhwebview.api.IBiliWebSettings;
import com.bilibili.app.provider.BaseAuthLoginBehavior;
import com.bilibili.app.provider.IGlobalCloseBrowserBehavior;
import com.bilibili.app.provider.IGlobalGetContainerInfoBehavior;
import com.bilibili.app.provider.IUiObserveContainerStatusBehavior;
import com.bilibili.common.webview.js.JsbProxy;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import dv0.K0;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$initWebView$2.class */
final class TheseusWebUIComponent$initWebView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation, Object> {
    final K0 $viewBinding;
    private Object L$0;
    Object L$1;
    int label;
    final TheseusWebUIComponent this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$initWebView$2$a.class */
    public static final class a implements WebViewCallbackClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f104231b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BiliWebView f104232c;

        public a(TheseusWebUIComponent theseusWebUIComponent, BiliWebView biliWebView) {
            this.f104232c = biliWebView;
            this.f104230a = theseusWebUIComponent.f104184c.f104211m;
        }

        public final void computeScroll(View view) {
            this.f104232c.super_computeScroll();
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
            return this.f104232c.super_dispatchTouchEvent(motionEvent);
        }

        public final void invalidate() {
            this.f104232c.super_invalidate();
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent, View view) {
            return this.f104232c.super_onInterceptTouchEvent(motionEvent);
        }

        public final void onOverScrolled(int i7, int i8, boolean z6, boolean z7, View view) {
            boolean z8 = i8 == 0 && z7;
            this.f104231b = z8;
            BiliWebView biliWebView = this.f104232c;
            if (z8 || this.f104230a) {
                biliWebView.requestDisallowInterceptTouchEvent(false);
            }
            biliWebView.super_onOverScrolled(i7, i8, z6, z7);
        }

        public final void onScrollChanged(int i7, int i8, int i9, int i10, View view) {
            this.f104232c.super_onScrollChanged(i7, i8, i9, i10);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent, View view) {
            boolean z6 = this.f104231b;
            BiliWebView biliWebView = this.f104232c;
            if ((!z6 || this.f104230a) && motionEvent != null && motionEvent.getAction() == 0) {
                biliWebView.requestDisallowInterceptTouchEvent(true);
            }
            return biliWebView.super_onTouchEvent(motionEvent);
        }

        public final boolean overScrollBy(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z6, View view) {
            return this.f104232c.super_overScrollBy(i7, i8, i9, i10, i11, i12, i13, i14, z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$initWebView$2$b.class */
    public static final class b implements IGlobalCloseBrowserBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusWebUIComponent f104233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CoroutineScope f104234b;

        public b(TheseusWebUIComponent theseusWebUIComponent, CoroutineScope coroutineScope) {
            this.f104233a = theseusWebUIComponent;
            this.f104234b = coroutineScope;
        }

        public final void closeBrowser() {
            this.f104233a.d();
        }

        public final boolean isDestroyed() {
            return !CoroutineScopeKt.isActive(this.f104234b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$initWebView$2$c.class */
    public static final class c implements IGlobalGetContainerInfoBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoroutineScope f104235a;

        public c(CoroutineScope coroutineScope) {
            this.f104235a = coroutineScope;
        }

        public final String getContainerName() {
            return "mainsite web container 1.0";
        }

        public final JSONObject getExtraInfoContainerInfo() {
            return new JSONObject();
        }

        public final boolean isDestroyed() {
            return !CoroutineScopeKt.isActive(this.f104235a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$initWebView$2$d.class */
    public static final class d extends BaseAuthLoginBehavior {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusWebUIComponent f104236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BiliWebView f104237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CoroutineScope f104238d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IJsBridgeContextV2 iJsBridgeContextV2, TheseusWebUIComponent theseusWebUIComponent, BiliWebView biliWebView, CoroutineScope coroutineScope) {
            super(iJsBridgeContextV2);
            this.f104236b = theseusWebUIComponent;
            this.f104237c = biliWebView;
            this.f104238d = coroutineScope;
        }

        public final boolean isDestroyed() {
            return !CoroutineScopeKt.isActive(this.f104238d);
        }

        public final void loadNewUrl(Uri uri, boolean z6) {
            this.f104236b.d();
            BLRouter.routeTo(new RouteRequest.Builder(uri).build(), this.f104237c.getContext());
        }

        public final void release() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusWebUIComponent$initWebView$2(TheseusWebUIComponent theseusWebUIComponent, K0 k02, Continuation<? super TheseusWebUIComponent$initWebView$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusWebUIComponent;
        this.$viewBinding = k02;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusWebUIComponent$initWebView$2 theseusWebUIComponent$initWebView$2 = new TheseusWebUIComponent$initWebView$2(this.this$0, this.$viewBinding, continuation);
        theseusWebUIComponent$initWebView$2.L$0 = obj;
        return theseusWebUIComponent$initWebView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2;
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV22;
        Throwable th;
        JsbProxy jsbProxy;
        JsbProxy jsbProxy2;
        IJsBridgeContextV2 jsbContext;
        BiliWebViewConfigHolderV2 biliWebViewConfigHolderV23;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Uri uri = !StringsKt.isBlank(this.this$0.f104182a) ? Uri.parse(this.this$0.f104182a) : Uri.EMPTY;
            biliWebViewConfigHolderV2 = new BiliWebViewConfigHolderV2(this.$viewBinding.f116821o, (ProgressBar) null);
            boolean z6 = false;
            biliWebViewConfigHolderV2.configBiliWebSettings(uri, BiliConfig.getBiliVersionCode(), false);
            IBiliWebSettings iBiliWebSettings = this.$viewBinding.f116821o.getIBiliWebSettings();
            if (iBiliWebSettings != null) {
                iBiliWebSettings.setUserAgent(iBiliWebSettings.getUserAgent() + this.this$0.f104187f);
            }
            biliWebViewConfigHolderV2.configBiliWebCookie();
            biliWebViewConfigHolderV2.enableWebContentDebug(AppBuildConfig.Companion.getDebug());
            this.$viewBinding.f116821o.setWebViewClient(new TheseusWebUIComponent.d(biliWebViewConfigHolderV2, this.this$0.f104196p));
            K0 k02 = this.$viewBinding;
            BiliWebView biliWebView = k02.f116821o;
            TintTextView tintTextView = k02.f116817k;
            if (this.this$0.f104184c.f104201b.length() == 0) {
                z6 = true;
            }
            biliWebView.setWebChromeClient(new TheseusWebUIComponent.b(tintTextView, z6, biliWebViewConfigHolderV2));
            JsbProxy jsbProxy3 = this.$viewBinding.f116821o.getJsbProxy();
            BiliWebView biliWebView2 = this.$viewBinding.f116821o;
            TheseusWebUIComponent theseusWebUIComponent = this.this$0;
            biliWebView2.setVerticalScrollBarEnabled(theseusWebUIComponent.f104184c.f104212n);
            biliWebView2.setWebViewCallbackClient(new a(theseusWebUIComponent, biliWebView2));
            biliWebView2.registerGlobalCloseBrowserBehavior(new b(theseusWebUIComponent, coroutineScope));
            biliWebView2.registerGlobalGetContainerInfoBehavior(new c(coroutineScope));
            if (jsbProxy3 != null && (jsbContext = jsbProxy3.getJsbContext()) != null) {
                biliWebView2.registerAuthLoginBehavior(new d(jsbContext, theseusWebUIComponent, biliWebView2, coroutineScope));
            }
            IUiObserveContainerStatusBehavior iUiObserveContainerStatusBehavior = theseusWebUIComponent.f104186e;
            if (iUiObserveContainerStatusBehavior != null) {
                biliWebView2.registerUiObserveContainerStatusBehavior(iUiObserveContainerStatusBehavior);
            }
            if (jsbProxy3 == null) {
                return null;
            }
            final TheseusWebUIComponent theseusWebUIComponent2 = this.this$0;
            K0 k03 = this.$viewBinding;
            com.bilibili.ogv.infra.jsb.d dVar = theseusWebUIComponent2.f104183b;
            dVar.a(new com.bilibili.ogv.infra.jsb.f(theseusWebUIComponent2) { // from class: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$initWebView$2$2$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TheseusWebUIComponent f104229a;

                {
                    this.f104229a = theseusWebUIComponent2;
                }

                public final Object closeHalfBottomPopDialog(Continuation<? super Unit> continuation) {
                    this.f104229a.d();
                    return Unit.INSTANCE;
                }

                public final Object closeHalfBrowser(Continuation<? super Unit> continuation) {
                    this.f104229a.d();
                    return Unit.INSTANCE;
                }

                public final Object closeLandscapeWebContainer(Continuation<? super Unit> continuation) {
                    this.f104229a.d();
                    return Unit.INSTANCE;
                }
            }, "ogv");
            dVar.b(jsbProxy3);
            k03.f116821o.loadUrl(theseusWebUIComponent2.f104182a);
            try {
                this.L$0 = biliWebViewConfigHolderV2;
                this.L$1 = jsbProxy3;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jsbProxy2 = jsbProxy3;
            } catch (Throwable th2) {
                biliWebViewConfigHolderV22 = biliWebViewConfigHolderV2;
                th = th2;
                jsbProxy = jsbProxy3;
                biliWebViewConfigHolderV22.destroyWebView();
                jsbProxy.onDestroy();
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jsbProxy2 = (JsbProxy) this.L$1;
            BiliWebViewConfigHolderV2 biliWebViewConfigHolderV24 = (BiliWebViewConfigHolderV2) this.L$0;
            jsbProxy = jsbProxy2;
            biliWebViewConfigHolderV23 = biliWebViewConfigHolderV24;
            try {
                ResultKt.throwOnFailure(obj);
                biliWebViewConfigHolderV2 = biliWebViewConfigHolderV24;
            } catch (Throwable th3) {
                th = th3;
                biliWebViewConfigHolderV22 = biliWebViewConfigHolderV23;
                biliWebViewConfigHolderV22.destroyWebView();
                jsbProxy.onDestroy();
                throw th;
            }
        }
        jsbProxy = jsbProxy2;
        biliWebViewConfigHolderV23 = biliWebViewConfigHolderV2;
        throw new KotlinNothingValueException();
    }
}
