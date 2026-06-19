package com.bilibili.biligame.business.pegasus.view;

import ES0.w;
import Ob1.T;
import Pb.F;
import Pb.G;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.appcompat.app.n;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.api.BiligameApiService;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/view/GameBasePanelDialog.class */
@StabilityInferred(parameters = 0)
public class GameBasePanelDialog extends Dialog implements LifecycleObserver {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Handler f62720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f62721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f62722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f62723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f62724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f62725g;
    public boolean h;

    public GameBasePanelDialog(@NotNull Activity activity, int i7) {
        super(activity);
        this.f62719a = i7;
        this.f62720b = new Handler(BiliContext.getMainHandler().getLooper());
        this.f62721c = LazyKt.lazy(new w(this, 1));
        this.f62722d = LazyKt.lazy(new Ba0.b(6));
        this.f62723e = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.f62724f = 300;
        setupWindowLayout();
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOwnerActivity(activity);
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.app.Dialog"}, scope = {})
    public static void a(@NotNull GameBasePanelDialog gameBasePanelDialog) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        super.dismiss();
    }

    public boolean autoDismiss() {
        return true;
    }

    public final void b() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(this.f62724f);
        translateAnimation.setAnimationListener(new b(this));
        ((FrameLayout) this.f62721c.getValue()).startAnimation(translateAnimation);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        b();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        b();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void dismissWhenActivityDestroyed() {
        superDismiss();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void dismissWhenActivitySTOP() {
        superDismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        return (this.h || this.f62725g) ? true : super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final BiligameApiService getApiService() {
        return (BiligameApiService) this.f62722d.getValue();
    }

    @NotNull
    public final CoroutineScope getDialogScope() {
        return this.f62723e;
    }

    public final int getOffset() {
        return this.f62719a;
    }

    public long getShowDuration() {
        return 5000L;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Activity ownerActivity = getOwnerActivity();
        FragmentActivity fragmentActivity = ownerActivity instanceof FragmentActivity ? (FragmentActivity) ownerActivity : null;
        if (fragmentActivity != null) {
            fragmentActivity.getLifecycle().addObserver(this);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(this.f62724f);
        translateAnimation.setAnimationListener(new a(this));
        ((FrameLayout) this.f62721c.getValue()).startAnimation(translateAnimation);
        if (autoDismiss()) {
            this.f62720b.postDelayed(new T(this), getShowDuration());
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        if (this.h || this.f62725g) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Activity ownerActivity = getOwnerActivity();
        FragmentActivity fragmentActivity = ownerActivity instanceof FragmentActivity ? (FragmentActivity) ownerActivity : null;
        if (fragmentActivity != null) {
            fragmentActivity.getLifecycle().removeObserver(this);
        }
        this.f62720b.removeCallbacksAndMessages(null);
        CoroutineScopeKt.cancel$default(this.f62723e, (CancellationException) null, 1, (Object) null);
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        setContentView(LayoutInflater.from(getContext()).inflate(i7, (ViewGroup) this.f62721c.getValue(), false));
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(view);
        }
        ((FrameLayout) this.f62721c.getValue()).addView(view);
        super.setContentView((FrameLayout) this.f62721c.getValue());
    }

    public final void setOffset(int i7) {
        this.f62719a = i7;
    }

    public void setupWindowLayout() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.y = this.f62719a;
            attributes.flags = 40;
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    public final void superDismiss() {
        try {
            a(this);
        } catch (Exception e7) {
        }
    }
}
