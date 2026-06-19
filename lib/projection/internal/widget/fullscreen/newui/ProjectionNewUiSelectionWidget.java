package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import Ne0.C2735n;
import Ne0.C2736o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.datasource.ProjectionDataSource;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.InterfaceC7755c;
import le0.C7838f;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.dialog.CommonDialogUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiSelectionWidget.class */
public final class ProjectionNewUiSelectionWidget extends FrameLayout implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f64006f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextView f64007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f64009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f64010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public InterfaceC5317a f64011e;

    public ProjectionNewUiSelectionWidget(@NotNull Context context) {
        this(context, null);
    }

    public ProjectionNewUiSelectionWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f64010d = new CompositeDisposable();
        FrameLayout.inflate(context, 2131495226, this);
        TextView textView = (TextView) findViewById(2131311315);
        this.f64007a = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        this.f64008b = null;
    }

    public final void g(boolean z6) {
        C7838f.a aVarI;
        ProjectionDataSource projectionDataSourceB;
        ProjectionClient.ClientCallback callback;
        if (!z6) {
            TextView textView = this.f64007a;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        InterfaceC7845m interfaceC7845m = this.f64008b;
        if (interfaceC7845m == null || (aVarI = interfaceC7845m.i()) == null || (projectionDataSourceB = aVarI.b()) == null) {
            return;
        }
        if (projectionDataSourceB.getItemCount() > 1) {
            InterfaceC7845m interfaceC7845m2 = this.f64008b;
            if (((interfaceC7845m2 == null || (callback = interfaceC7845m2.getCallback()) == null) ? null : callback.onShowSelector()) != null) {
                TextView textView2 = this.f64007a;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        TextView textView3 = this.f64007a;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        io.reactivex.rxjava3.subjects.a aVarF;
        Observable observableSwitchMap;
        Disposable disposableSubscribe;
        this.f64008b = interfaceC7845m;
        TextView textView = this.f64007a;
        if (textView != null) {
            CommonDialogUtilsKt.setVisibility(textView, false);
        }
        InterfaceC7845m interfaceC7845m2 = this.f64008b;
        if (interfaceC7845m2 == null || (aVarF = interfaceC7845m2.f()) == null || (observableSwitchMap = aVarF.switchMap(new C2735n(this))) == null || (disposableSubscribe = observableSwitchMap.subscribe(new C2736o(this))) == null) {
            return;
        }
        this.f64010d.add(disposableSubscribe);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        InterfaceC7845m interfaceC7845m;
        com.bilibili.lib.projection.internal.reporter.a reporter2;
        InterfaceC5317a interfaceC5317a = this.f64011e;
        if (interfaceC5317a != null) {
            interfaceC5317a.showPanel("ProjectionSelectorPanel");
        }
        ProjectionDeviceInternal projectionDeviceInternal = this.f64009c;
        IProjectionItem iProjectionItemN = null;
        if (projectionDeviceInternal != null && (interfaceC7845m = this.f64008b) != null && (reporter2 = interfaceC7845m.getReporter()) != null) {
            reporter2.S(projectionDeviceInternal, null);
        }
        InterfaceC7845m interfaceC7845m2 = this.f64008b;
        if (interfaceC7845m2 == null || (reporter = interfaceC7845m2.getReporter()) == null) {
            return;
        }
        ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Full;
        ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.SelectionButton;
        InterfaceC7845m interfaceC7845m3 = this.f64008b;
        ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m interfaceC7845m4 = this.f64008b;
        if (interfaceC7845m4 != null) {
            iProjectionItemN = interfaceC7845m4.n(true);
        }
        reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN);
    }

    @Override // ke0.InterfaceC7755c
    public void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
        this.f64011e = interfaceC5317a;
    }
}
