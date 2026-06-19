package com.bilibili.lib.projection.internal.widget.fullscreen;

import Me0.C2644F;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionQualityFullScreenWidget.class */
public final class ProjectionQualityFullScreenWidget extends FrameLayout implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f63961g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Disposable f63962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f63964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f63965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f63966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public InterfaceC5317a f63967f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/ProjectionQualityFullScreenWidget$a.class */
    public static final class a implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionQualityFullScreenWidget f63968a;

        public a(ProjectionQualityFullScreenWidget projectionQualityFullScreenWidget) {
            this.f63968a = projectionQualityFullScreenWidget;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            ProjectionQualityFullScreenWidget projectionQualityFullScreenWidget = this.f63968a;
            ProjectionDeviceInternal projectionDeviceInternal = projectionQualityFullScreenWidget.f63964c;
            if (projectionDeviceInternal != null) {
                com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                InterfaceC7845m interfaceC7845m = projectionQualityFullScreenWidget.f63963b;
                StandardProjectionItem standardProjectionItem = null;
                boolean z7 = true;
                IProjectionItem iProjectionItemN = interfaceC7845m != null ? interfaceC7845m.n(true) : null;
                if (iProjectionItemN instanceof StandardProjectionItem) {
                    standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
                }
                InterfaceC7845m interfaceC7845m2 = projectionQualityFullScreenWidget.f63963b;
                if (interfaceC7845m2 == null || !interfaceC7845m2.isGlobalLinkMode()) {
                    z7 = false;
                }
                aVar.K(standardProjectionItem, projectionDeviceInternal, z7, 2);
            }
            InterfaceC5317a interfaceC5317a = projectionQualityFullScreenWidget.f63967f;
            if (interfaceC5317a != null) {
                interfaceC5317a.showPanel("ProjectionClientQualityPanel");
            }
        }
    }

    public ProjectionQualityFullScreenWidget(@NotNull Context context) {
        super(context);
        g(context);
    }

    public ProjectionQualityFullScreenWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        g(context);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        Disposable disposable = this.f63962a;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f63962a = null;
        this.f63964c = null;
    }

    public final void g(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131496558, (ViewGroup) this, false);
        addView(viewInflate);
        this.f63965d = (TextView) viewInflate.findViewById(2131309530);
        this.f63966e = (TextView) viewInflate.findViewById(2131309532);
        ((TextView) viewInflate.findViewById(2131309533)).setText("清晰度");
        setOnClickListener(this);
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        InterfaceC7845m interfaceC7845m2 = interfaceC7845m;
        this.f63963b = interfaceC7845m2;
        interfaceC7845m2.isGlobalLinkMode();
        this.f63962a = interfaceC7845m2.f().switchMap(new C2644F(this)).subscribe();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        BLog.i("Projection", "[blink] ------>, full screen quality clicked");
        C7564c.f121625a.j(new a(this));
    }

    @Override // ke0.InterfaceC7755c
    public void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
        this.f63967f = interfaceC5317a;
    }
}
