package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import Ne0.C2739s;
import Ne0.r;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import ke0.InterfaceC7755c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiTopBarWidget.class */
public final class ProjectionNewUiTopBarWidget extends FrameLayout implements InterfaceC7755c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final View f64012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final View f64013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextView f64014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public a f64016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CompositeDisposable f64017f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiTopBarWidget$a.class */
    public interface a {
        void onBackClick();

        void onCloseClick();
    }

    public ProjectionNewUiTopBarWidget(@NotNull Context context) {
        this(context, null);
    }

    public ProjectionNewUiTopBarWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, 2131495227, this);
        View viewFindViewById = findViewById(2131309498);
        this.f64012a = viewFindViewById;
        View viewFindViewById2 = findViewById(2131309499);
        this.f64013b = viewFindViewById2;
        TextView textView = (TextView) findViewById(2131309517);
        this.f64014c = textView;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Ne0.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionNewUiTopBarWidget f17172a;

                {
                    this.f17172a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.bilibili.lib.projection.internal.reporter.a reporter;
                    com.bilibili.lib.projection.internal.device.a aVarS;
                    ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget = this.f17172a;
                    ProjectionNewUiTopBarWidget.a aVar = projectionNewUiTopBarWidget.f64016e;
                    if (aVar != null) {
                        aVar.onBackClick();
                    }
                    InterfaceC7845m interfaceC7845m = projectionNewUiTopBarWidget.f64015d;
                    if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                        return;
                    }
                    ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Full;
                    ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.LeftTopBackButton;
                    InterfaceC7845m interfaceC7845m2 = projectionNewUiTopBarWidget.f64015d;
                    IProjectionItem iProjectionItemN = null;
                    ProjectionDeviceInternal device = (interfaceC7845m2 == null || (aVarS = interfaceC7845m2.s()) == null) ? null : aVarS.getDevice();
                    InterfaceC7845m interfaceC7845m3 = projectionNewUiTopBarWidget.f64015d;
                    if (interfaceC7845m3 != null) {
                        iProjectionItemN = interfaceC7845m3.n(true);
                    }
                    reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN);
                }
            });
        }
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: Ne0.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProjectionNewUiTopBarWidget f17173a;

                {
                    this.f17173a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.bilibili.lib.projection.internal.reporter.a reporter;
                    com.bilibili.lib.projection.internal.device.a aVarS;
                    ProjectionNewUiTopBarWidget projectionNewUiTopBarWidget = this.f17173a;
                    ProjectionNewUiTopBarWidget.a aVar = projectionNewUiTopBarWidget.f64016e;
                    if (aVar != null) {
                        aVar.onCloseClick();
                    }
                    InterfaceC7845m interfaceC7845m = projectionNewUiTopBarWidget.f64015d;
                    if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
                        return;
                    }
                    ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Full;
                    ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.RightTopCloseButton;
                    InterfaceC7845m interfaceC7845m2 = projectionNewUiTopBarWidget.f64015d;
                    IProjectionItem iProjectionItemN = null;
                    ProjectionDeviceInternal device = (interfaceC7845m2 == null || (aVarS = interfaceC7845m2.s()) == null) ? null : aVarS.getDevice();
                    InterfaceC7845m interfaceC7845m3 = projectionNewUiTopBarWidget.f64015d;
                    if (interfaceC7845m3 != null) {
                        iProjectionItemN = interfaceC7845m3.n(true);
                    }
                    reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN);
                }
            });
        }
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setSingleLine(true);
            textView.setFocusable(true);
            textView.setFocusableInTouchMode(true);
            textView.setMarqueeRepeatLimit(-1);
            textView.setHorizontallyScrolling(true);
            textView.setTextSize(14.0f);
            textView.setSelected(true);
        }
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        CompositeDisposable compositeDisposable = this.f64017f;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.f64017f = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        io.reactivex.rxjava3.subjects.a aVarF;
        Observable observableSwitchMap;
        Disposable disposableSubscribe;
        CompositeDisposable compositeDisposable;
        this.f64015d = interfaceC7845m;
        this.f64017f = new CompositeDisposable();
        InterfaceC7845m interfaceC7845m2 = this.f64015d;
        if (interfaceC7845m2 == null || (aVarF = interfaceC7845m2.f()) == null || (observableSwitchMap = aVarF.switchMap(r.f17174a)) == null || (disposableSubscribe = observableSwitchMap.subscribe(new C2739s(this))) == null || (compositeDisposable = this.f64017f) == null) {
            return;
        }
        compositeDisposable.add(disposableSubscribe);
    }

    public final void setClickAction(@NotNull a aVar) {
        this.f64016e = aVar;
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }

    public final void setTitle(@NotNull String str) {
        TextView textView = this.f64014c;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
