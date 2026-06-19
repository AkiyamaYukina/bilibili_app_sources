package com.bilibili.ship.theseus.ugc.intro.iframe;

import Vu0.z;
import android.net.Uri;
import android.widget.ProgressBar;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliConfig;
import com.bilibili.app.comm.IJsBridgeContextV2;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.provider.BaseAuthLoginBehavior;
import com.bilibili.app.provider.IGlobalCloseBrowserBehavior;
import com.bilibili.app.provider.IGlobalGetContainerInfoBehavior;
import com.bilibili.common.webview.js.JsbProxy;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.ship.theseus.ugc.intro.iframe.b;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeComponent$initWebView$2.class */
final class UgcIntroIframeComponent$initWebView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final z $viewBinding;
    private Object L$0;
    int label;
    final com.bilibili.ship.theseus.ugc.intro.iframe.b this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeComponent$initWebView$2$a.class */
    public static final class a implements IGlobalCloseBrowserBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoroutineScope f97014a;

        public a(CoroutineScope coroutineScope) {
            this.f97014a = coroutineScope;
        }

        public final void closeBrowser() {
        }

        public final boolean isDestroyed() {
            return !CoroutineScopeKt.isActive(this.f97014a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeComponent$initWebView$2$b.class */
    public static final class b implements IGlobalGetContainerInfoBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoroutineScope f97015a;

        public b(CoroutineScope coroutineScope) {
            this.f97015a = coroutineScope;
        }

        public final String getContainerName() {
            return "mainsite web container 1.0";
        }

        public final JSONObject getExtraInfoContainerInfo() {
            return new JSONObject();
        }

        public final boolean isDestroyed() {
            return !CoroutineScopeKt.isActive(this.f97015a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/iframe/UgcIntroIframeComponent$initWebView$2$c.class */
    public static final class c extends BaseAuthLoginBehavior {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliWebView f97016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CoroutineScope f97017c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IJsBridgeContextV2 iJsBridgeContextV2, BiliWebView biliWebView, CoroutineScope coroutineScope) {
            super(iJsBridgeContextV2);
            this.f97016b = biliWebView;
            this.f97017c = coroutineScope;
        }

        public final boolean isDestroyed() {
            return !CoroutineScopeKt.isActive(this.f97017c);
        }

        public final void loadNewUrl(Uri uri, boolean z6) {
            BLRouter.routeTo(Yb.a.b(uri), this.f97016b.getContext());
        }

        public final void release() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroIframeComponent$initWebView$2(com.bilibili.ship.theseus.ugc.intro.iframe.b bVar, z zVar, Continuation<? super UgcIntroIframeComponent$initWebView$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$viewBinding = zVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcIntroIframeComponent$initWebView$2 ugcIntroIframeComponent$initWebView$2 = new UgcIntroIframeComponent$initWebView$2(this.this$0, this.$viewBinding, continuation);
        ugcIntroIframeComponent$initWebView$2.L$0 = obj;
        return ugcIntroIframeComponent$initWebView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        IJsBridgeContextV2 jsbContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            String str = this.this$0.f97021a.f97026a;
            Uri uri = !StringsKt.isBlank(str) ? Uri.parse(str) : Uri.EMPTY;
            BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2 = new BiliWebViewConfigHolderV2(this.$viewBinding.h, (ProgressBar) null);
            biliWebViewConfigHolderV2.configBiliWebSettings(uri, BiliConfig.getBiliVersionCode(), false);
            biliWebViewConfigHolderV2.configBiliWebCookie();
            biliWebViewConfigHolderV2.enableWebContentDebug(false);
            this.$viewBinding.h.setWebViewClient(new b.d(biliWebViewConfigHolderV2, this.this$0.f97025e));
            this.$viewBinding.h.setWebChromeClient(new b.C0834b(biliWebViewConfigHolderV2, this.this$0.f97025e));
            JsbProxy jsbProxy = this.$viewBinding.h.getJsbProxy();
            BiliWebView biliWebView = this.$viewBinding.h;
            biliWebView.registerGlobalCloseBrowserBehavior(new a(coroutineScope));
            biliWebView.registerGlobalGetContainerInfoBehavior(new b(coroutineScope));
            if (jsbProxy != null && (jsbContext = jsbProxy.getJsbContext()) != null) {
                biliWebView.registerAuthLoginBehavior(new c(jsbContext, biliWebView, coroutineScope));
            }
            this.$viewBinding.h.loadUrl(str);
            com.bilibili.ship.theseus.ugc.intro.iframe.b bVar = this.this$0;
            bVar.f97022b = true;
            bVar.f97023c = jsbProxy;
            bVar.f97024d = biliWebViewConfigHolderV2;
            this.label = 1;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
