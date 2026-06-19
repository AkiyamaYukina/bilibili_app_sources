package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.I;
import Me0.J;
import Me0.K;
import Me0.M;
import Me0.N;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.device.a;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import ge0.f;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.AbstractC7760h;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionSpeedFullScreenWidget.class */
public final class ProjectionSpeedFullScreenWidget extends AbstractC7760h implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f63973f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TextView f63974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC7845m f63975e;

    @JvmOverloads
    public ProjectionSpeedFullScreenWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public ProjectionSpeedFullScreenWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ProjectionSpeedFullScreenWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        FrameLayout.inflate(context, 2131496577, this);
        setMRootView(findViewById(2131309434));
        this.f63974d = (TextView) findViewById(2131309457);
        setOnClickListener(this);
    }

    public final void g(Float f7) {
        TextView textView = this.f63974d;
        if (textView != null) {
            textView.setText(f7 + "X");
        }
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        ProjectionDeviceInternal device;
        Observable<f> observableA;
        Disposable disposableSubscribe;
        ProjectionDeviceInternal device2;
        Observable<IProjectionPlayableItem> observableJ;
        Disposable disposableSubscribe2;
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        this.f63975e = interfaceC7845m2;
        a aVarS = interfaceC7845m2.s();
        if (aVarS != null && (device2 = aVarS.getDevice()) != null && (observableJ = device2.j()) != null && (disposableSubscribe2 = observableJ.subscribe(new I(this, interfaceC7845m2))) != null) {
            getMDisposable().add(disposableSubscribe2);
        }
        CompositeDisposable mDisposable = getMDisposable();
        InterfaceC7845m interfaceC7845m3 = this.f63975e;
        InterfaceC7845m interfaceC7845m4 = interfaceC7845m3;
        if (interfaceC7845m3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProjectionClient");
            interfaceC7845m4 = null;
        }
        mDisposable.add(interfaceC7845m4.mo11256getPlaySpeed().subscribe(new J(this)));
        InterfaceC7845m interfaceC7845m5 = this.f63975e;
        InterfaceC7845m interfaceC7845m6 = interfaceC7845m5;
        if (interfaceC7845m5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProjectionClient");
            interfaceC7845m6 = null;
        }
        a aVarS2 = interfaceC7845m6.s();
        if (aVarS2 != null && (device = aVarS2.getDevice()) != null && (observableA = device.A()) != null && (disposableSubscribe = observableA.subscribe(new K(this))) != null) {
            getMDisposable().add(disposableSubscribe);
        }
        CompositeDisposable mDisposable2 = getMDisposable();
        InterfaceC7845m interfaceC7845m7 = this.f63975e;
        if (interfaceC7845m7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProjectionClient");
            interfaceC7845m7 = null;
        }
        mDisposable2.add(interfaceC7845m7.f().switchMap(new M(this)).subscribe(new N(this)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        InterfaceC5317a mPanelContext = getMPanelContext();
        if (mPanelContext == null) {
            return;
        }
        mPanelContext.showPanel("ProjectionClientSpeedPanel");
        InterfaceC7845m interfaceC7845m = this.f63975e;
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        if (interfaceC7845m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProjectionClient");
            interfaceC7845m2 = null;
        }
        com.bilibili.lib.projection.internal.reporter.a reporter = interfaceC7845m2.getReporter();
        InterfaceC7845m interfaceC7845m3 = this.f63975e;
        InterfaceC7845m interfaceC7845m4 = interfaceC7845m3;
        if (interfaceC7845m3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProjectionClient");
            interfaceC7845m4 = null;
        }
        float playSpeed = interfaceC7845m4.getPlaySpeed();
        InterfaceC7845m interfaceC7845m5 = this.f63975e;
        InterfaceC7845m interfaceC7845m6 = interfaceC7845m5;
        if (interfaceC7845m5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProjectionClient");
            interfaceC7845m6 = null;
        }
        a aVarS = interfaceC7845m6.s();
        ProjectionDeviceInternal device = aVarS != null ? aVarS.getDevice() : null;
        InterfaceC7845m interfaceC7845m7 = this.f63975e;
        InterfaceC7845m interfaceC7845m8 = interfaceC7845m7;
        if (interfaceC7845m7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProjectionClient");
            interfaceC7845m8 = null;
        }
        IProjectionItem iProjectionItemN = interfaceC7845m8.n(true);
        StandardProjectionItem standardProjectionItem = null;
        if (iProjectionItemN instanceof StandardProjectionItem) {
            standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
        }
        reporter.T(2, Float.valueOf(playSpeed), device, standardProjectionItem);
    }
}
