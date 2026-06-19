package com.bilibili.lib.projection.internal.widget.dialog;

import Ke0.n;
import Ke0.o;
import Ke0.p;
import Ke0.q;
import Ke0.r;
import Ke0.s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.device.a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import ge0.f;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.AbstractC7759g;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/dialog/ProjectionDialogSpeedWidget.class */
public final class ProjectionDialogSpeedWidget extends AbstractC7759g implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f63900e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TextView f63901d;

    @JvmOverloads
    public ProjectionDialogSpeedWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public ProjectionDialogSpeedWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ProjectionDialogSpeedWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        FrameLayout.inflate(context, 2131496555, this);
        setMRootView(findViewById(2131309496));
        setOnClickListener(this);
        this.f63901d = (TextView) findViewById(2131309497);
        setClickable(false);
    }

    @Override // ke0.AbstractC7759g, ke0.InterfaceC7753a
    /* JADX INFO: renamed from: g */
    public final void i(@NotNull InterfaceC7845m interfaceC7845m) {
        ProjectionDeviceInternal device;
        Observable<f> observableA;
        Disposable disposableSubscribe;
        setMProjectionClient(interfaceC7845m);
        interfaceC7845m.isGlobalLinkMode();
        getMDisposable().add(interfaceC7845m.f().switchMap(n.f12802a).subscribe(new o(this)));
        getMDisposable().add(interfaceC7845m.f().switchMap(p.f12805a).subscribe(new q(this)));
        getMDisposable().add(interfaceC7845m.mo11256getPlaySpeed().subscribe(new r(this, 0)));
        a aVarS = interfaceC7845m.s();
        if (aVarS == null || (device = aVarS.getDevice()) == null || (observableA = device.A()) == null || (disposableSubscribe = observableA.subscribe(new s(this, 0))) == null) {
            return;
        }
        getMDisposable().add(disposableSubscribe);
    }

    @Override // ke0.AbstractC7759g, ke0.InterfaceC7753a
    /* JADX INFO: renamed from: j */
    public final void b(@NotNull InterfaceC7845m interfaceC7845m) {
        super.b(interfaceC7845m);
        setMProjectionClient(null);
    }

    public final void l(Float f7) {
        if (Intrinsics.areEqual(f7, 1.0f)) {
            TextView textView = this.f63901d;
            if (textView != null) {
                textView.setText(getContext().getResources().getString(2131845530));
                return;
            }
            return;
        }
        TextView textView2 = this.f63901d;
        if (textView2 != null) {
            textView2.setText(f7 + "X");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        a aVarS;
        InterfaceC7845m mProjectionClient = getMProjectionClient();
        if (mProjectionClient == null || (reporter = mProjectionClient.getReporter()) == null) {
            return;
        }
        InterfaceC7845m mProjectionClient2 = getMProjectionClient();
        StandardProjectionItem standardProjectionItem = null;
        Float fValueOf = mProjectionClient2 != null ? Float.valueOf(mProjectionClient2.getPlaySpeed()) : null;
        InterfaceC7845m mProjectionClient3 = getMProjectionClient();
        ProjectionDeviceInternal device = (mProjectionClient3 == null || (aVarS = mProjectionClient3.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m mProjectionClient4 = getMProjectionClient();
        IProjectionItem iProjectionItemN = mProjectionClient4 != null ? mProjectionClient4.n(true) : null;
        if (iProjectionItemN instanceof StandardProjectionItem) {
            standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
        }
        reporter.T(1, fValueOf, device, standardProjectionItem);
    }
}
