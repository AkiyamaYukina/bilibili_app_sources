package com.bilibili.lib.projection.internal.widget.halfscreen;

import Qe0.C2814A;
import Qe0.C2815B;
import Qe0.C2816C;
import Qe0.C2817D;
import Qe0.C2818E;
import Qe0.y;
import Qe0.z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.reporter.a;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.AbstractC7761i;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import we0.InterfaceC8880b;
import xe0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionSpeedWidget.class */
public final class ProjectionSpeedWidget extends AbstractC7761i implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f64092f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextView f64093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC8880b f64095e;

    @JvmOverloads
    public ProjectionSpeedWidget(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public ProjectionSpeedWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ProjectionSpeedWidget(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        FrameLayout.inflate(context, 2131496555, this);
        setOnClickListener(this);
        setMRootView(findViewById(2131309496));
        this.f64093c = (TextView) findViewById(2131309497);
        setClickable(false);
    }

    @Override // ke0.AbstractC7761i, ke0.InterfaceC7753a
    /* JADX INFO: renamed from: g */
    public final void b(@NotNull InterfaceC7845m.a aVar) {
        super.b(aVar);
        this.f64094d = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        InterfaceC7845m.a aVar2 = aVar;
        this.f64095e = aVar2.getContainer();
        this.f64094d = aVar2.getContainer().getClient();
        aVar2.getContainer().getClient().isGlobalLinkMode();
        InterfaceC7845m client = aVar2.getContainer().getClient();
        if (client == null) {
            return;
        }
        setMDisposable(new CompositeDisposable());
        CompositeDisposable mDisposable = getMDisposable();
        if (mDisposable != null) {
            mDisposable.add(client.f().switchMap(y.f19923a).subscribe(new z(this)));
        }
        CompositeDisposable mDisposable2 = getMDisposable();
        if (mDisposable2 != null) {
            mDisposable2.add(client.f().switchMap(C2814A.f19875a).subscribe(new C2815B(this)));
        }
        CompositeDisposable mDisposable3 = getMDisposable();
        if (mDisposable3 != null) {
            mDisposable3.add(client.mo11256getPlaySpeed().subscribe(new C2816C(this)));
        }
        Disposable disposableSubscribe = client.f().switchMap(C2817D.f19879a).subscribe(new C2818E(this));
        CompositeDisposable mDisposable4 = getMDisposable();
        if (mDisposable4 != null) {
            mDisposable4.add(disposableSubscribe);
        }
    }

    public final void k(Float f7) {
        if (Intrinsics.areEqual(f7, 1.0f)) {
            TextView textView = this.f64093c;
            if (textView != null) {
                textView.setText(getContext().getResources().getString(2131845530));
                return;
            }
            return;
        }
        TextView textView2 = this.f64093c;
        if (textView2 != null) {
            textView2.setText(f7 + "X");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        a reporter2;
        com.bilibili.lib.projection.internal.device.a aVarS2;
        j jVar = new j(getContext());
        InterfaceC8880b interfaceC8880b = this.f64095e;
        if (interfaceC8880b != null) {
            interfaceC8880b.B(jVar);
        }
        InterfaceC7845m interfaceC7845m = this.f64094d;
        if (interfaceC7845m != null && (reporter2 = interfaceC7845m.getReporter()) != null) {
            InterfaceC7845m interfaceC7845m2 = this.f64094d;
            Float fValueOf = interfaceC7845m2 != null ? Float.valueOf(interfaceC7845m2.getPlaySpeed()) : null;
            InterfaceC7845m interfaceC7845m3 = this.f64094d;
            ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS2 = interfaceC7845m3.s()) == null) ? null : aVarS2.getDevice();
            InterfaceC7845m interfaceC7845m4 = this.f64094d;
            IProjectionItem iProjectionItemN = interfaceC7845m4 != null ? interfaceC7845m4.n(true) : null;
            reporter2.T(1, fValueOf, device, iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null);
        }
        InterfaceC7845m interfaceC7845m5 = this.f64094d;
        if (interfaceC7845m5 == null || (reporter = interfaceC7845m5.getReporter()) == null) {
            return;
        }
        ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Half;
        ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.VideoSpeedButton;
        InterfaceC7845m interfaceC7845m6 = this.f64094d;
        ProjectionDeviceInternal device2 = (interfaceC7845m6 == null || (aVarS = interfaceC7845m6.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m interfaceC7845m7 = this.f64094d;
        IProjectionItem iProjectionItemN2 = null;
        if (interfaceC7845m7 != null) {
            iProjectionItemN2 = interfaceC7845m7.n(true);
        }
        reporter.o(panelMode, controlPageButtonType, device2, iProjectionItemN2);
    }
}
