package com.bilibili.lib.projection.internal.widget.halfscreen;

import Qe0.F;
import Qe0.r;
import Qe0.w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import ke0.AbstractC7761i;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import we0.InterfaceC8880b;
import xe0.C8968d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionQualityWidget.class */
public final class ProjectionQualityWidget extends AbstractC7761i implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f64084i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public InterfaceC8880b f64085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f64086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f64087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f64088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64089g;

    @Nullable
    public F h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionQualityWidget$a.class */
    public static final class a implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionQualityWidget f64090a;

        public a(ProjectionQualityWidget projectionQualityWidget) {
            this.f64090a = projectionQualityWidget;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            InterfaceC7845m client;
            ProjectionQualityWidget projectionQualityWidget = this.f64090a;
            ProjectionDeviceInternal projectionDeviceInternal = projectionQualityWidget.f64086d;
            if (projectionDeviceInternal != null) {
                com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                InterfaceC8880b interfaceC8880b = projectionQualityWidget.f64085c;
                StandardProjectionItem standardProjectionItem = null;
                IProjectionItem iProjectionItemN = (interfaceC8880b == null || (client = interfaceC8880b.getClient()) == null) ? null : client.n(false);
                if (iProjectionItemN instanceof StandardProjectionItem) {
                    standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
                }
                InterfaceC8880b interfaceC8880b2 = projectionQualityWidget.f64085c;
                boolean z7 = false;
                if (interfaceC8880b2 != null) {
                    InterfaceC7845m client2 = interfaceC8880b2.getClient();
                    z7 = false;
                    if (client2 != null) {
                        z7 = false;
                        if (client2.isGlobalLinkMode()) {
                            z7 = true;
                        }
                    }
                }
                aVar.K(standardProjectionItem, projectionDeviceInternal, z7, 1);
            }
            C8968d c8968d = new C8968d(projectionQualityWidget.getContext());
            InterfaceC8880b interfaceC8880b3 = projectionQualityWidget.f64085c;
            if (interfaceC8880b3 != null) {
                interfaceC8880b3.B(c8968d);
            }
            F f7 = projectionQualityWidget.h;
            if (f7 != null) {
                f7.g();
            }
        }
    }

    public ProjectionQualityWidget(@NotNull Context context) {
        super(context, null, 6);
        l(context);
    }

    public ProjectionQualityWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 4);
        l(context);
    }

    public static final void k(ProjectionQualityWidget projectionQualityWidget, IProjectionPlayableItem iProjectionPlayableItem) {
        projectionQualityWidget.getClass();
        HandlerThreads.runOn(0, new r(0, iProjectionPlayableItem, projectionQualityWidget));
    }

    @Override // ke0.AbstractC7761i, ke0.InterfaceC7753a
    /* JADX INFO: renamed from: g */
    public final void b(@NotNull InterfaceC7845m.a aVar) {
        super.b(aVar);
        this.h = null;
        this.f64086d = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        InterfaceC7845m.a aVar2 = aVar;
        this.f64085c = aVar2.getContainer();
        aVar2.getContainer().getClient().isGlobalLinkMode();
        setMDisposable(new CompositeDisposable());
        CompositeDisposable mDisposable = getMDisposable();
        if (mDisposable != null) {
            mDisposable.add(aVar2.getContainer().getClient().f().switchMap(new w(this)).subscribe());
        }
    }

    public final void l(Context context) {
        setMRootView(LayoutInflater.from(context).inflate(2131496560, (ViewGroup) this, false));
        addView(getMRootView());
        View mRootView = getMRootView();
        this.f64087e = mRootView != null ? (TextView) mRootView.findViewById(2131309530) : null;
        View mRootView2 = getMRootView();
        TextView textView = null;
        if (mRootView2 != null) {
            textView = (TextView) mRootView2.findViewById(2131309532);
        }
        this.f64088f = textView;
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        InterfaceC7845m client;
        com.bilibili.lib.projection.internal.reporter.a reporter;
        InterfaceC7845m client2;
        com.bilibili.lib.projection.internal.device.a aVarS;
        InterfaceC8880b interfaceC8880b = this.f64085c;
        if (interfaceC8880b != null && (client = interfaceC8880b.getClient()) != null && (reporter = client.getReporter()) != null) {
            ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Half;
            ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.QualityButton;
            InterfaceC8880b interfaceC8880b2 = this.f64085c;
            ProjectionDeviceInternal device = (interfaceC8880b2 == null || (client2 = interfaceC8880b2.getClient()) == null || (aVarS = client2.s()) == null) ? null : aVarS.getDevice();
            InterfaceC8880b interfaceC8880b3 = this.f64085c;
            IProjectionItem iProjectionItemN = null;
            if (interfaceC8880b3 != null) {
                InterfaceC7845m client3 = interfaceC8880b3.getClient();
                iProjectionItemN = null;
                if (client3 != null) {
                    iProjectionItemN = client3.n(true);
                }
            }
            reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN);
        }
        C7564c.f121625a.j(new a(this));
    }

    public final void setShowBubbleCallback(@NotNull F f7) {
        this.h = f7;
    }
}
