package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import Ne0.C2732k;
import Ne0.C2733l;
import Ne0.C2734m;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiPlayControlWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget;
import com.bilibili.opd.app.bizcommon.context.KFCFragmentLoaderActivity;
import he0.k;
import ie0.C7564c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import ke0.InterfaceC7755c;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiPlayControlWidget.class */
public final class ProjectionNewUiPlayControlWidget extends FrameLayout implements InterfaceC7755c, View.OnClickListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f63987k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final View f63988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final View f63989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ProjectionSeekBarWidget f63990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ProjectionNewUiPositionTextWidget f63991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ProjectionNewUiDurationTextWidget f63992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f63993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.bilibili.lib.projection.internal.device.a f63994g;

    @Nullable
    public CompositeDisposable h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Integer f63995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f63996j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiPlayControlWidget$a.class */
    public static final class a implements ProjectionSeekBarWidget.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionNewUiPlayControlWidget f63997a;

        public a(ProjectionNewUiPlayControlWidget projectionNewUiPlayControlWidget) {
            this.f63997a = projectionNewUiPlayControlWidget;
        }

        @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget.a
        public final void a(int i7, int i8) {
            ProjectionNewUiPlayControlWidget projectionNewUiPlayControlWidget = this.f63997a;
            projectionNewUiPlayControlWidget.f63995i = Integer.valueOf(i7);
            String strA = k.a(i7);
            if (TextUtils.isEmpty(strA)) {
                strA = "00:00";
            }
            ProjectionNewUiPositionTextWidget projectionNewUiPositionTextWidget = projectionNewUiPlayControlWidget.f63991d;
            if (projectionNewUiPositionTextWidget != null) {
                projectionNewUiPositionTextWidget.setText(strA);
            }
            String strA2 = k.a(i8);
            if (TextUtils.isEmpty(strA2)) {
                strA2 = "00:00";
            }
            ProjectionNewUiDurationTextWidget projectionNewUiDurationTextWidget = projectionNewUiPlayControlWidget.f63992e;
            if (projectionNewUiDurationTextWidget != null) {
                projectionNewUiDurationTextWidget.setText(strA2);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/ProjectionNewUiPlayControlWidget$b.class */
    public static final class b implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionNewUiPlayControlWidget f63998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f63999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.ObjectRef<SeekOperation> f64000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.IntRef f64001d;

        public b(ProjectionNewUiPlayControlWidget projectionNewUiPlayControlWidget, Integer num, Ref.ObjectRef<SeekOperation> objectRef, Ref.IntRef intRef) {
            this.f63998a = projectionNewUiPlayControlWidget;
            this.f63999b = num;
            this.f64000c = objectRef;
            this.f64001d = intRef;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
            BLog.i("ProjectionNewUiPlayControlWidget", " seek recommend failed.");
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            com.bilibili.lib.projection.internal.device.a aVar;
            SeekOperation seekOperation = (SeekOperation) this.f64000c.element;
            int i7 = ProjectionNewUiPlayControlWidget.f63987k;
            Integer num = this.f63999b;
            ProjectionNewUiPlayControlWidget projectionNewUiPlayControlWidget = this.f63998a;
            if (!Intrinsics.areEqual(projectionNewUiPlayControlWidget.g(num, seekOperation), Boolean.TRUE) || (aVar = projectionNewUiPlayControlWidget.f63994g) == null) {
                return;
            }
            aVar.seekTo(this.f64001d.element, 2);
        }
    }

    public ProjectionNewUiPlayControlWidget(@NotNull Context context) {
        this(context, null);
    }

    public ProjectionNewUiPlayControlWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f63996j = new a(this);
        FrameLayout.inflate(context, 2131495225, this);
        this.f63988a = getRootView().findViewById(2131309509);
        this.f63989b = getRootView().findViewById(2131309508);
        this.f63990c = (ProjectionSeekBarWidget) getRootView().findViewById(2131309459);
        this.f63991d = (ProjectionNewUiPositionTextWidget) getRootView().findViewById(2131316159);
        this.f63992e = (ProjectionNewUiDurationTextWidget) getRootView().findViewById(2131316166);
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m interfaceC7845m) {
        ProjectionSeekBarWidget projectionSeekBarWidget = this.f63990c;
        if (projectionSeekBarWidget != null) {
            a aVar = this.f63996j;
            if (projectionSeekBarWidget.f64045l.contains(aVar)) {
                projectionSeekBarWidget.f64045l.remove(aVar);
            }
        }
        CompositeDisposable compositeDisposable = this.h;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        this.h = null;
        this.f63993f = null;
        this.f63995i = null;
    }

    public final Boolean g(Integer num, SeekOperation seekOperation) {
        if (seekOperation == SeekOperation.BACK) {
            return Boolean.TRUE;
        }
        Integer num2 = this.f63995i;
        Boolean boolValueOf = null;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            boolValueOf = null;
            if (num != null) {
                boolValueOf = Boolean.valueOf(iIntValue < num.intValue());
            }
        }
        return boolValueOf;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m interfaceC7845m) {
        ProjectionNewUiDurationTextWidget projectionNewUiDurationTextWidget;
        ProjectionSeekBarWidget projectionSeekBarWidget;
        io.reactivex.rxjava3.subjects.a aVarF;
        Observable observableSwitchMap;
        Disposable disposableSubscribe;
        CompositeDisposable compositeDisposable;
        io.reactivex.rxjava3.subjects.a aVarF2;
        Observable observableSwitchMap2;
        Observable observableDoOnDispose;
        Disposable disposableSubscribe2;
        CompositeDisposable compositeDisposable2;
        this.f63993f = interfaceC7845m;
        ProjectionNewUiPositionTextWidget projectionNewUiPositionTextWidget = this.f63991d;
        if ((projectionNewUiPositionTextWidget == null || !projectionNewUiPositionTextWidget.f64003b) && (((projectionNewUiDurationTextWidget = this.f63992e) == null || !projectionNewUiDurationTextWidget.f63985c) && (projectionSeekBarWidget = this.f63990c) != null)) {
            a aVar = this.f63996j;
            if (!projectionSeekBarWidget.f64045l.contains(aVar)) {
                projectionSeekBarWidget.f64045l.add(aVar);
            }
        }
        View view = this.f63988a;
        if (view != null) {
            view.setOnClickListener(this);
        }
        View view2 = this.f63989b;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        this.h = new CompositeDisposable();
        InterfaceC7845m interfaceC7845m2 = this.f63993f;
        if (interfaceC7845m2 != null && (aVarF2 = interfaceC7845m2.f()) != null && (observableSwitchMap2 = aVarF2.switchMap(new C2732k(this))) != null && (observableDoOnDispose = observableSwitchMap2.doOnDispose(new Action(this) { // from class: Ne0.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProjectionNewUiPlayControlWidget f17165a;

            {
                this.f17165a = this;
            }

            public final void run() {
                this.f17165a.f63994g = null;
            }
        })) != null && (disposableSubscribe2 = observableDoOnDispose.subscribe()) != null && (compositeDisposable2 = this.h) != null) {
            compositeDisposable2.add(disposableSubscribe2);
        }
        InterfaceC7845m interfaceC7845m3 = this.f63993f;
        if (interfaceC7845m3 == null || (aVarF = interfaceC7845m3.f()) == null || (observableSwitchMap = aVarF.switchMap(C2733l.f17167a)) == null || (disposableSubscribe = observableSwitchMap.subscribe(new C2734m(this))) == null || (compositeDisposable = this.h) == null) {
            return;
        }
        compositeDisposable.add(disposableSubscribe);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        com.bilibili.lib.projection.internal.reporter.a reporter2;
        com.bilibili.lib.projection.internal.device.a aVarS2;
        ProjectionDeviceInternal device;
        Pair<Integer, Integer> pairY;
        com.bilibili.lib.projection.internal.device.a aVar = this.f63994g;
        Integer num = (aVar == null || (device = aVar.getDevice()) == null || (pairY = device.y()) == null) ? null : (Integer) pairY.getSecond();
        Ref.IntRef intRef = new Ref.IntRef();
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() - 5000) : null;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = SeekOperation.UNKNOWN;
        Integer numValueOf2 = view != null ? Integer.valueOf(view.getId()) : null;
        int iCoerceAtMost = 0;
        if (numValueOf2 != null && numValueOf2.intValue() == 2131309509) {
            SeekOperation seekOperation = SeekOperation.FAST;
            objectRef.element = seekOperation;
            if (Intrinsics.areEqual(g(numValueOf, seekOperation), Boolean.TRUE)) {
                Integer num2 = this.f63995i;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    int iIntValue2 = 0;
                    if (numValueOf != null) {
                        iIntValue2 = numValueOf.intValue();
                    }
                    iCoerceAtMost = RangesKt.coerceAtMost(iIntValue + KFCFragmentLoaderActivity.REQ_CODE_LOGIN, iIntValue2);
                }
                intRef.element = iCoerceAtMost;
                ProjectionSeekBarWidget projectionSeekBarWidget = this.f63990c;
                if (projectionSeekBarWidget != null) {
                    projectionSeekBarWidget.k(iCoerceAtMost, ProjectionSeekBarWidget.SeekStatus.SeekRight);
                }
            }
            BLog.d("ProjectionNewUiPlayControlWidget", "seekTo: " + intRef.element + ", progress: " + this.f63995i + ", duration: " + num + ", seekRight");
            InterfaceC7845m interfaceC7845m = this.f63993f;
            if (interfaceC7845m != null && (reporter2 = interfaceC7845m.getReporter()) != null) {
                ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Full;
                ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.ProgressForwardButton;
                InterfaceC7845m interfaceC7845m2 = this.f63993f;
                ProjectionDeviceInternal device2 = (interfaceC7845m2 == null || (aVarS2 = interfaceC7845m2.s()) == null) ? null : aVarS2.getDevice();
                InterfaceC7845m interfaceC7845m3 = this.f63993f;
                IProjectionItem iProjectionItemN = null;
                if (interfaceC7845m3 != null) {
                    iProjectionItemN = interfaceC7845m3.n(true);
                }
                reporter2.o(panelMode, controlPageButtonType, device2, iProjectionItemN);
            }
        } else if (numValueOf2 != null && numValueOf2.intValue() == 2131309508) {
            objectRef.element = SeekOperation.BACK;
            Integer num3 = this.f63995i;
            int iCoerceAtLeast = 0;
            if (num3 != null) {
                iCoerceAtLeast = RangesKt.coerceAtLeast(num3.intValue() - KFCFragmentLoaderActivity.REQ_CODE_LOGIN, 0);
            }
            intRef.element = iCoerceAtLeast;
            ProjectionSeekBarWidget projectionSeekBarWidget2 = this.f63990c;
            if (projectionSeekBarWidget2 != null) {
                projectionSeekBarWidget2.k(iCoerceAtLeast, ProjectionSeekBarWidget.SeekStatus.SeekLeft);
            }
            BLog.d("ProjectionNewUiPlayControlWidget", "seekTo: " + intRef.element + ", progress: " + this.f63995i + ", duration: " + num + ", seekLeft");
            InterfaceC7845m interfaceC7845m4 = this.f63993f;
            if (interfaceC7845m4 != null && (reporter = interfaceC7845m4.getReporter()) != null) {
                ProjectionReporter.PanelMode panelMode2 = ProjectionReporter.PanelMode.Full;
                ProjectionReporter.ControlPageButtonType controlPageButtonType2 = ProjectionReporter.ControlPageButtonType.ProgressBackButton;
                InterfaceC7845m interfaceC7845m5 = this.f63993f;
                ProjectionDeviceInternal device3 = (interfaceC7845m5 == null || (aVarS = interfaceC7845m5.s()) == null) ? null : aVarS.getDevice();
                InterfaceC7845m interfaceC7845m6 = this.f63993f;
                IProjectionItem iProjectionItemN2 = null;
                if (interfaceC7845m6 != null) {
                    iProjectionItemN2 = interfaceC7845m6.n(true);
                }
                reporter.o(panelMode2, controlPageButtonType2, device3, iProjectionItemN2);
            }
        }
        C7564c.f121625a.j(new b(this, numValueOf, objectRef, intRef));
    }

    @Override // ke0.InterfaceC7755c
    public /* bridge */ /* synthetic */ void setPanelContext(@NotNull InterfaceC5317a interfaceC5317a) {
    }
}
