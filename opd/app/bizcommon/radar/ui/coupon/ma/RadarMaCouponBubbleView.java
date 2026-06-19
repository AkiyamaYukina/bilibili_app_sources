package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.bilibili.opd.app.bizcommon.radar.data.AttachPageInfo;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import com.bilibili.opd.app.bizcommon.radar.ui.coupon.H;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/RadarMaCouponBubbleView.class */
@StabilityInferred(parameters = 0)
public final class RadarMaCouponBubbleView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RadarTriggerContent f74310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WeakReference<Activity> f74311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Pm.r f74312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f74313d = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final x f74314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ComposeView f74315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public WindowManager f74316g;

    @Nullable
    public FrameLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f74317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public c f74318j;

    public RadarMaCouponBubbleView(@NotNull RadarTriggerContent radarTriggerContent, @NotNull WeakReference weakReference, @NotNull Pm.r rVar) {
        this.f74310a = radarTriggerContent;
        this.f74311b = weakReference;
        this.f74312c = rVar;
        this.f74314e = w.a(radarTriggerContent);
    }

    public final void a() {
        Unit unit;
        WindowManager windowManager;
        Lifecycle lifecycle;
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final RadarMaCouponBubbleView f74341a;

                {
                    this.f74341a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f74341a.a();
                }
            });
            return;
        }
        if (this.f74317i) {
            this.f74317i = false;
            CoroutineScopeKt.cancel$default(this.f74313d, (CancellationException) null, 1, (Object) null);
            ComponentCallbacks2 componentCallbacks2 = (Activity) this.f74311b.get();
            LifecycleOwner lifecycleOwner = componentCallbacks2 instanceof LifecycleOwner ? (LifecycleOwner) componentCallbacks2 : null;
            c cVar = this.f74318j;
            if (cVar != null && lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(cVar);
            }
            this.f74318j = null;
            try {
                Result.Companion companion = Result.Companion;
                ComposeView composeView = this.f74315f;
                if (composeView != null) {
                    FrameLayout frameLayout = this.h;
                    if (frameLayout != null) {
                        H.f74244a.getClass();
                        H.b(frameLayout);
                    } else if (composeView.isAttachedToWindow() && (windowManager = this.f74316g) != null) {
                        windowManager.removeViewImmediate(composeView);
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                Result.constructor-impl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
            this.h = null;
            this.f74315f = null;
            this.f74312c.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.lifecycle.LifecycleObserver, com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.c] */
    public final void b() {
        float f7;
        int i7;
        Lifecycle lifecycle;
        final Activity activity = this.f74311b.get();
        if (activity == 0 || this.f74317i) {
            return;
        }
        Object systemService = activity.getSystemService("window");
        this.f74316g = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        boolean z6 = activity instanceof LifecycleOwner;
        LifecycleOwner lifecycleOwner = z6 ? (LifecycleOwner) activity : null;
        ?? r02 = new LifecycleEventObserver(this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RadarMaCouponBubbleView f74338a;

            {
                this.f74338a = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.f74338a.a();
                }
            }
        };
        this.f74318j = r02;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != 0) {
            lifecycle.addObserver(r02);
        }
        ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
        LifecycleOwner lifecycleOwner2 = z6 ? (LifecycleOwner) activity : null;
        if (lifecycleOwner2 != null) {
            ViewTreeLifecycleOwner.set(composeView, lifecycleOwner2);
        }
        ViewModelStoreOwner viewModelStoreOwner = activity instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) activity : null;
        if (viewModelStoreOwner != null) {
            ViewTreeViewModelStoreOwner.set(composeView, viewModelStoreOwner);
        }
        SavedStateRegistryOwner savedStateRegistryOwner = null;
        if (activity instanceof SavedStateRegistryOwner) {
            savedStateRegistryOwner = (SavedStateRegistryOwner) activity;
        }
        if (savedStateRegistryOwner != null) {
            ViewTreeSavedStateRegistryOwner.set(composeView, savedStateRegistryOwner);
        }
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1528778082, true, new Function2(this, activity) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RadarMaCouponBubbleView f74339a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Activity f74340b;

            {
                this.f74339a = this;
                this.f74340b = activity;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x019a  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x01d9  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 540
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        this.f74315f = composeView;
        AttachPageInfo attachInfo = this.f74310a.getAttachInfo();
        if (attachInfo == null || !attachInfo.isHomePage()) {
            f7 = Resources.getSystem().getDisplayMetrics().density;
            i7 = 61;
        } else {
            f7 = Resources.getSystem().getDisplayMetrics().density;
            i7 = 57;
        }
        int i8 = (int) ((i7 * f7) + 0.5f);
        H h = H.f74244a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 81);
        layoutParams.bottomMargin = i8;
        Unit unit = Unit.INSTANCE;
        h.getClass();
        FrameLayout frameLayoutA = H.a(activity, "ma_coupon_bubble", composeView, layoutParams, "RadarMaCouponBubbleView");
        this.h = frameLayoutA;
        if (frameLayoutA == null) {
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-1, -2, 1003, 296, -3);
            layoutParams2.gravity = 81;
            layoutParams2.y = i8;
            WindowManager windowManager = this.f74316g;
            if (windowManager != null) {
                windowManager.addView(composeView, layoutParams2);
            }
        }
        this.f74317i = true;
    }
}
