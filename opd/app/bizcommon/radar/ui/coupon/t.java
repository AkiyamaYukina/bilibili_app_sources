package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
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
import com.bilibili.api.base.Config;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/t.class */
@StabilityInferred(parameters = 0)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RadarTriggerContent f74416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final WeakReference<Activity> f74417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final US0.G f74418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ComposeView f74419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public WindowManager f74420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public FrameLayout f74421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f74422g;

    @Nullable
    public o h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f74423i = System.currentTimeMillis();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f74424j = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f74425k = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableState<Integer> f74426l = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    public t(@NotNull RadarTriggerContent radarTriggerContent, @NotNull WeakReference weakReference, @NotNull US0.G g7) {
        this.f74416a = radarTriggerContent;
        this.f74417b = weakReference;
        this.f74418c = g7;
    }

    public final void a() {
        if (this.f74422g) {
            this.f74422g = false;
            try {
                final Activity activity = this.f74417b.get();
                final ComposeView composeView = this.f74419d;
                if (composeView != null) {
                    if (composeView.isAttachedToWindow()) {
                        this.f74425k.setValue(Boolean.TRUE);
                        composeView.postDelayed(new Runnable(activity, this, composeView) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.n

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final Activity f74406a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final t f74407b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final ComposeView f74408c;

                            {
                                this.f74406a = activity;
                                this.f74407b = this;
                                this.f74408c = composeView;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                WindowManager windowManager;
                                Lifecycle lifecycle;
                                ComponentCallbacks2 componentCallbacks2 = this.f74406a;
                                t tVar = this.f74407b;
                                ComposeView composeView2 = this.f74408c;
                                try {
                                    LifecycleOwner lifecycleOwner = componentCallbacks2 instanceof LifecycleOwner ? (LifecycleOwner) componentCallbacks2 : null;
                                    o oVar = tVar.h;
                                    if (oVar != null && lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                                        lifecycle.removeObserver(oVar);
                                    }
                                    tVar.h = null;
                                    FrameLayout frameLayout = tVar.f74421f;
                                    if (frameLayout != null) {
                                        H.f74244a.getClass();
                                        H.b(frameLayout);
                                    } else if (composeView2.isAttachedToWindow() && (windowManager = tVar.f74420e) != null) {
                                        windowManager.removeView(composeView2);
                                    }
                                    tVar.f74421f = null;
                                    tVar.f74419d = null;
                                } catch (Exception e7) {
                                    String strA = N4.a.a("RadarCouponView dismiss error: ", e7);
                                    if (Config.isDebuggable()) {
                                        String str = strA;
                                        if (strA == null) {
                                            str = "null";
                                        }
                                        BLog.d("nov_test", str);
                                    }
                                }
                            }
                        }, 300L);
                    } else {
                        this.f74419d = null;
                    }
                }
                this.f74418c.invoke();
            } catch (Exception e7) {
                String strA = N4.a.a("RadarCouponView dismiss error: ", e7);
                if (Config.isDebuggable()) {
                    String str = strA;
                    if (strA == null) {
                        str = "null";
                    }
                    BLog.d("nov_test", str);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [com.bilibili.opd.app.bizcommon.radar.ui.coupon.o] */
    public final void b() {
        Activity activity = this.f74417b.get();
        if (activity == 0 || this.f74422g) {
            return;
        }
        try {
            Object systemService = activity.getSystemService("window");
            this.f74420e = systemService instanceof WindowManager ? (WindowManager) systemService : null;
            LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
            if (lifecycleOwner != null) {
                this.h = new LifecycleEventObserver(this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final t f74409a;

                    {
                        this.f74409a = this;
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            this.f74409a.a();
                        }
                    }
                };
                lifecycleOwner.getLifecycle().addObserver(this.h);
            }
            ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
            try {
                ViewTreeLifecycleOwner.set(composeView, activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null);
                ViewTreeViewModelStoreOwner.set(composeView, activity instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) activity : null);
                SavedStateRegistryOwner savedStateRegistryOwner = null;
                if (activity instanceof SavedStateRegistryOwner) {
                    savedStateRegistryOwner = (SavedStateRegistryOwner) activity;
                }
                ViewTreeSavedStateRegistryOwner.set(composeView, savedStateRegistryOwner);
            } catch (Exception e7) {
                String str = "RadarCouponView lifecycle setup error: " + e7;
                if (Config.isDebuggable()) {
                    String str2 = str;
                    if (str == null) {
                        str2 = "null";
                    }
                    BLog.d("nov_test", str2);
                }
            }
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1108229212, true, new QK.G(this, 1)));
            this.f74419d = composeView;
            float f7 = activity.getResources().getDisplayMetrics().density;
            float f8 = r0.getDisplayMetrics().widthPixels / (375.0f * f7);
            int i7 = (int) (190 * f8 * f7);
            int i8 = (int) (8 * f8 * f7);
            ComposeView composeView2 = this.f74419d;
            if (composeView2 == null) {
                return;
            }
            H h = H.f74244a;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
            layoutParams.setMarginEnd(i8);
            layoutParams.bottomMargin = i7;
            Unit unit = Unit.INSTANCE;
            h.getClass();
            FrameLayout frameLayoutA = H.a(activity, "itemsDetailCouponFloating", composeView2, layoutParams, "RadarCouponView");
            this.f74421f = frameLayoutA;
            if (frameLayoutA == null) {
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(-2, -2, 1003, 296, -3);
                layoutParams2.gravity = 8388693;
                layoutParams2.x = i8;
                layoutParams2.y = i7;
                WindowManager windowManager = this.f74420e;
                if (windowManager != null) {
                    windowManager.addView(composeView2, layoutParams2);
                }
            }
            this.f74422g = true;
            ComposeView composeView3 = this.f74419d;
            if (composeView3 != null) {
                composeView3.post(new Runnable(this) { // from class: com.bilibili.opd.app.bizcommon.radar.ui.coupon.p

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final t f74410a;

                    {
                        this.f74410a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f74410a.f74424j.setValue(Boolean.FALSE);
                    }
                });
            }
        } catch (Exception e8) {
            String strA = N4.a.a("RadarCouponView show error: ", e8);
            if (Config.isDebuggable()) {
                if (strA == null) {
                    strA = "null";
                }
                BLog.d("nov_test", strA);
            }
        }
    }
}
