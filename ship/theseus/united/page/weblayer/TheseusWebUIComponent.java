package com.bilibili.ship.theseus.united.page.weblayer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceError;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceRequest;
import com.bilibili.app.comm.bhwebview.api.interfaces.WebResourceResponse;
import com.bilibili.app.provider.IUiObserveContainerStatusBehavior;
import com.bilibili.jsb.IPrivacyController;
import com.bilibili.lib.biliweb.BiliWebViewConfigHolderV2;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import dv0.K0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent.class */
@StabilityInferred(parameters = 0)
public final class TheseusWebUIComponent extends com.bilibili.app.gemini.ui.m<K0> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f104181t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.infra.jsb.d f104183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f104184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<KClass<?>, IPrivacyController> f104185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final IUiObserveContainerStatusBehavior f104186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f104187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Function1<BiliWebView, Unit> f104188g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f104189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f104190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f104191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f104193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f104194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow f104195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f104196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public K0 f104197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f104198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f104199s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f104201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f104203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f104204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f104205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f104206g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f104207i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f104208j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f104209k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f104210l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f104211m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f104212n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f104213o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f104214p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f104215q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f104216r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final boolean f104217s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @NotNull
        public final StateFlow<Boolean> f104218t;

        public a(boolean z6, String str, int i7, int i8, int i9, boolean z7, int i10, boolean z8, int i11, int i12, boolean z9, boolean z10, StateFlow stateFlow, int i13) {
            z6 = (i13 & 1) != 0 ? true : z6;
            str = (i13 & 2) != 0 ? "" : str;
            i7 = (i13 & 4) != 0 ? 0 : i7;
            i8 = (i13 & 8) != 0 ? 0 : i8;
            i9 = (i13 & 16) != 0 ? 0 : i9;
            z7 = (i13 & 64) != 0 ? false : z7;
            int i14 = -1;
            i10 = (i13 & 128) != 0 ? -1 : i10;
            int i15 = (i13 & 256) != 0 ? -1 : 0;
            int i16 = (i13 & 512) != 0 ? -1 : 0;
            int i17 = (i13 & 1024) != 0 ? -1 : 0;
            i14 = (i13 & 2048) == 0 ? 0 : i14;
            boolean z11 = (i13 & 4096) != 0;
            z8 = (i13 & 8192) != 0 ? true : z8;
            i11 = (i13 & 16384) != 0 ? 0 : i11;
            i12 = (i13 & 32768) != 0 ? 0 : i12;
            z9 = (i13 & 65536) != 0 ? false : z9;
            z10 = (i13 & 131072) != 0 ? false : z10;
            boolean z12 = (i13 & 262144) != 0;
            stateFlow = (i13 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? StateFlowKt.MutableStateFlow(Boolean.FALSE) : stateFlow;
            this.f104200a = z6;
            this.f104201b = str;
            this.f104202c = i7;
            this.f104203d = i8;
            this.f104204e = i9;
            this.f104205f = 0;
            this.f104206g = z7;
            this.h = i10;
            this.f104207i = i15;
            this.f104208j = i16;
            this.f104209k = i17;
            this.f104210l = i14;
            this.f104211m = z11;
            this.f104212n = z8;
            this.f104213o = i11;
            this.f104214p = i12;
            this.f104215q = z9;
            this.f104216r = z10;
            this.f104217s = z12;
            this.f104218t = stateFlow;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b extends BiliWebViewConfigHolderV2.BiliWebChromeClient {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final TextView f104219g;
        public final boolean h;

        public b(@NotNull TextView textView, boolean z6, @NotNull BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2) {
            super(biliWebViewConfigHolderV2);
            this.f104219g = textView;
            this.h = z6;
        }

        public final void onReceivedTitle(@Nullable BiliWebView biliWebView, @Nullable String str) {
            if (this.h) {
                TextView textView = this.f104219g;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
            }
        }

        public final void onShowWarningWhenProgressMax(@Nullable Uri uri) {
        }

        public final void onStartFileChooserForResult(@NotNull Intent intent) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$c.class */
    public interface c {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$c$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f104223a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1852973472;
            }

            @NotNull
            public final String toString() {
                return "Error";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$c$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f104224a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 111717076;
            }

            @NotNull
            public final String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$c$c.class */
        @StabilityInferred(parameters = 1)
        public static final class C1158c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C1158c f104225a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C1158c);
            }

            public final int hashCode() {
                return -2092103269;
            }

            @NotNull
            public final String toString() {
                return "Success";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$d.class */
    @StabilityInferred(parameters = 0)
    public static final class d extends BiliWebViewConfigHolderV2.BiliWebViewClient {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableStateFlow<c> f104226b;

        public d(@NotNull BiliWebViewConfigHolderV2 biliWebViewConfigHolderV2, @NotNull MutableStateFlow<c> mutableStateFlow) {
            super(biliWebViewConfigHolderV2);
            this.f104226b = mutableStateFlow;
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
            RouteResponse routeResponseRouteTo = BLRouter.routeTo(new RouteRequest.Builder(uriBuild).props(new L80.g(1)).build(), biliWebView.getContext());
            return routeResponseRouteTo.getCode() == RouteResponse.Code.FORBIDDEN || routeResponseRouteTo.isSuccess();
        }

        public final void onPageFinished(@Nullable BiliWebView biliWebView, @Nullable String str) {
            super.onPageFinished(biliWebView, str);
            this.f104226b.tryEmit(c.C1158c.f104225a);
        }

        public final void onPageStarted(@Nullable BiliWebView biliWebView, @Nullable String str, @Nullable Bitmap bitmap) {
            super.onPageStarted(biliWebView, str, bitmap);
            this.f104226b.tryEmit(c.b.f104224a);
        }

        public final void onReceivedError(@Nullable BiliWebView biliWebView, int i7, @Nullable String str, @Nullable String str2) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedError(biliWebView, i7, str, str2);
            this.f104226b.tryEmit(c.a.f104223a);
        }

        public final void onReceivedError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedError(biliWebView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            this.f104226b.tryEmit(c.a.f104223a);
        }

        public final void onReceivedHttpError(@Nullable BiliWebView biliWebView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
            super/*com.bilibili.app.comm.bh.BiliWebViewClient*/.onReceivedHttpError(biliWebView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
                return;
            }
            this.f104226b.tryEmit(c.a.f104223a);
        }

        public final void onShowWarningWhenPageFinished(@Nullable Uri uri) {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusWebUIComponent$e.class */
    public static final class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K0 f104227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusWebUIComponent f104228b;

        public e(TheseusWebUIComponent theseusWebUIComponent, K0 k02) {
            this.f104227a = k02;
            this.f104228b = theseusWebUIComponent;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f104227a.f116808a.setAlpha(0.0f);
            this.f104228b.f104194n.tryEmit(Unit.INSTANCE);
        }
    }

    public TheseusWebUIComponent() {
        throw null;
    }

    public TheseusWebUIComponent(String str, com.bilibili.ogv.infra.jsb.d dVar, a aVar, Map map, IUiObserveContainerStatusBehavior iUiObserveContainerStatusBehavior, String str2, Function1 function1, int i7) {
        map = (i7 & 8) != 0 ? MapsKt.emptyMap() : map;
        iUiObserveContainerStatusBehavior = (i7 & 16) != 0 ? null : iUiObserveContainerStatusBehavior;
        str2 = (i7 & 32) != 0 ? "" : str2;
        function1 = (i7 & 64) != 0 ? null : function1;
        this.f104182a = str;
        this.f104183b = dVar;
        this.f104184c = aVar;
        this.f104185d = map;
        this.f104186e = iUiObserveContainerStatusBehavior;
        this.f104187f = str2;
        this.f104188g = function1;
        this.f104189i = StateFlowKt.MutableStateFlow(0);
        this.f104190j = StateFlowKt.MutableStateFlow(Integer.valueOf(aVar.f104214p));
        this.f104191k = StateFlowKt.MutableStateFlow(Integer.valueOf(aVar.f104213o));
        this.f104192l = StateFlowKt.MutableStateFlow(Boolean.valueOf(aVar.f104215q));
        this.f104193m = StateFlowKt.MutableStateFlow(0);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f104194n = mutableSharedFlowMutableSharedFlow$default;
        this.f104195o = mutableSharedFlowMutableSharedFlow$default;
        this.f104196p = StateFlowKt.MutableStateFlow(c.b.f104224a);
    }

    public static final void c(TheseusWebUIComponent theseusWebUIComponent, View view, float f7) {
        theseusWebUIComponent.getClass();
        view.setOutlineProvider(new q(f7));
        view.setClipToOutline(true);
    }

    public final /* bridge */ /* synthetic */ ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f(layoutInflater, viewGroup);
    }

    public final void d() {
        if (this.f104198r) {
            return;
        }
        K0 k02 = this.f104197q;
        a aVar = this.f104184c;
        if (!aVar.f104216r || k02 == null) {
            this.f104194n.tryEmit(Unit.INSTANCE);
            return;
        }
        this.f104198r = true;
        final boolean zBooleanValue = ((Boolean) aVar.f104218t.getValue()).booleanValue();
        ConstraintLayout constraintLayout = k02.f116808a;
        float width = zBooleanValue ? constraintLayout.getWidth() : constraintLayout.getHeight();
        final List listListOf = CollectionsKt.listOf(new View[]{k02.f116820n, k02.f116809b, k02.f116818l, k02.f116815i, k02.f116813f, k02.f116814g, k02.f116811d});
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, width);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(listListOf, zBooleanValue) { // from class: com.bilibili.ship.theseus.united.page.weblayer.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f104291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f104292b;

            {
                this.f104291a = listListOf;
                this.f104292b = zBooleanValue;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                List<View> list = this.f104291a;
                boolean z6 = this.f104292b;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (View view : list) {
                    if (z6) {
                        view.setTranslationX(fFloatValue);
                    } else {
                        view.setTranslationY(fFloatValue);
                    }
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(k02.f116816j.getAlpha(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new com.bilibili.app.authorspace.helpers.c(k02, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new e(this, k02));
        animatorSet.start();
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object a(@NotNull K0 k02, @NotNull Continuation<? super Unit> continuation) {
        this.f104197q = k02;
        Function1<BiliWebView, Unit> function1 = this.f104188g;
        if (function1 != null) {
            function1.invoke(k02.f116821o);
        }
        if (!this.f104185d.isEmpty()) {
            for (Map.Entry<KClass<?>, IPrivacyController> entry : this.f104185d.entrySet()) {
                k02.f116821o.registerPrivacyController(entry.getKey(), entry.getValue());
            }
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TheseusWebUIComponent$bind$3(this, k02, k02.f116808a.getContext(), null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @NotNull
    public final K0 f(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        K0 k0Inflate = K0.inflate(layoutInflater, viewGroup, false);
        if (this.f104184c.f104216r) {
            k0Inflate.f116808a.setAlpha(0.0f);
        }
        return k0Inflate;
    }

    public final void g() {
        MutableStateFlow<Integer> mutableStateFlow = this.f104193m;
        mutableStateFlow.setValue(Integer.valueOf(((Number) mutableStateFlow.getValue()).intValue() + 1));
    }

    public final void h(boolean z6) {
        this.f104192l.setValue(Boolean.valueOf(z6));
    }

    public final void i(int i7) {
        this.f104191k.setValue(Integer.valueOf(i7));
    }

    public final void j(int i7) {
        BLog.i("TheseusWebUIComponent", "updateWebViewHeight: " + i7);
        this.f104189i.setValue(Integer.valueOf(i7));
    }
}
