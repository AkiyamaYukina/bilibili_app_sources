package com.bilibili.lib.projection.internal.widget;

import Je0.C2406d;
import Je0.C2410h;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.InternalScreenAdjustDialog;
import com.bilibili.app.screen.adjust.widget.a;
import com.bilibili.lib.projection.constant.DirectionConst;
import com.bilibili.lib.projection.internal.api.model.ProjectionSpeedInfo;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a;
import com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogSeekTextWidget;
import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogSeekWidget;
import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogSpeedWidget;
import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogSwitchWidget;
import com.bilibili.lib.theme.R$color;
import he0.C7433b;
import ie0.C7564c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.CancellationException;
import ke0.InterfaceC7754b;
import ke0.InterfaceC7755c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import le0.C7838f;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/o.class */
public final class o implements InterfaceC5317a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f64104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64105b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Job f64107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public VV.d f64109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.screen.adjust.widget.q f64110g;

    @Nullable
    public View h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64111i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ProjectionDialogSwitchWidget f64113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public ProjectionDialogSpeedWidget f64114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public ProjectionDialogSeekWidget f64115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ProjectionDialogSeekTextWidget f64116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ImageView f64117o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ImageView f64118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public TextView f64119q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f64106c = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f64112j = new CompositeDisposable();

    public o(@NotNull ComponentActivity componentActivity, int i7) {
        this.f64104a = componentActivity;
        this.f64105b = i7;
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    @Nullable
    public final InterfaceC7845m M6() {
        return this.f64111i;
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    public final void Td(@NotNull ProjectionDialogFragment projectionDialogFragment) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view) {
        if (view instanceof InterfaceC7754b) {
            InterfaceC7845m interfaceC7845m = this.f64111i;
            if (interfaceC7845m != null) {
                ((InterfaceC7754b) view).i(interfaceC7845m);
                return;
            }
            return;
        }
        if (view instanceof InterfaceC7755c) {
            InterfaceC7845m interfaceC7845m2 = this.f64111i;
            if (interfaceC7845m2 != null) {
                ((InterfaceC7755c) view).i(interfaceC7845m2);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                a(viewGroup.getChildAt(i7));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (view instanceof InterfaceC7754b) {
            InterfaceC7845m interfaceC7845m = this.f64111i;
            if (interfaceC7845m != null) {
                ((InterfaceC7754b) view).b(interfaceC7845m);
                return;
            }
            return;
        }
        if (view instanceof InterfaceC7755c) {
            InterfaceC7845m interfaceC7845m2 = this.f64111i;
            if (interfaceC7845m2 != null) {
                ((InterfaceC7755c) view).b(interfaceC7845m2);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                b(viewGroup.getChildAt(i7));
            }
        }
    }

    public final void c() {
        com.bilibili.lib.projection.internal.device.a aVarS;
        C7838f.a aVarI;
        ComponentActivity componentActivity = this.f64104a;
        if (componentActivity.isFinishing() || componentActivity.isDestroyed()) {
            return;
        }
        this.f64111i = C7564c.f121625a.h(this.f64105b);
        this.f64108e = true;
        this.f64106c.setValue(Boolean.FALSE);
        View viewInflate = LayoutInflater.from(componentActivity).inflate(2131497495, (ViewGroup) null, false);
        this.h = viewInflate;
        this.f64118p = viewInflate != null ? (ImageView) viewInflate.findViewById(2131309374) : null;
        View view = this.h;
        this.f64117o = view != null ? (ImageView) view.findViewById(2131309386) : null;
        View view2 = this.h;
        this.f64119q = view2 != null ? (TextView) view2.findViewById(2131309407) : null;
        ImageView imageView = this.f64118p;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.lib.projection.internal.widget.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final o f64052a;

                {
                    this.f64052a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    com.bilibili.lib.projection.internal.device.a aVarS2;
                    ProjectionDeviceInternal device;
                    com.bilibili.lib.projection.internal.device.a aVarS3;
                    ProjectionDeviceInternal device2;
                    o oVar = this.f64052a;
                    oVar.f64106c.setValue(Boolean.TRUE);
                    InterfaceC7845m interfaceC7845m = oVar.f64111i;
                    ProjectionDeviceInternal.PlayerState playerState = (interfaceC7845m == null || (aVarS3 = interfaceC7845m.s()) == null || (device2 = aVarS3.getDevice()) == null) ? null : device2.getPlayerState();
                    InterfaceC7845m interfaceC7845m2 = oVar.f64111i;
                    ProjectionDeviceInternal.DeviceState deviceStateB = (interfaceC7845m2 == null || (aVarS2 = interfaceC7845m2.s()) == null || (device = aVarS2.getDevice()) == null) ? null : device.b();
                    InterfaceC7845m interfaceC7845m3 = oVar.f64111i;
                    ProjectionDeviceInternal device3 = null;
                    if (interfaceC7845m3 != null) {
                        com.bilibili.lib.projection.internal.device.a aVarS4 = interfaceC7845m3.s();
                        device3 = null;
                        if (aVarS4 != null) {
                            device3 = aVarS4.getDevice();
                        }
                    }
                    he0.j.g("player.player.screencast.close.player", device3, null, oVar.f64111i, null, new j(0, playerState, deviceStateB), 48);
                }
            });
        }
        ImageView imageView2 = this.f64117o;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.lib.projection.internal.widget.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final o f64096a;

                {
                    this.f64096a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    o oVar = this.f64096a;
                    InterfaceC7845m interfaceC7845m = oVar.f64111i;
                    if (interfaceC7845m != null) {
                        interfaceC7845m.stop();
                    }
                    InterfaceC7845m interfaceC7845m2 = oVar.f64111i;
                    if (interfaceC7845m2 != null) {
                        interfaceC7845m2.reportStop();
                    }
                    oVar.f64106c.setValue(Boolean.TRUE);
                }
            });
        }
        InterfaceC7845m interfaceC7845m = this.f64111i;
        CompositeDisposable compositeDisposable = this.f64112j;
        if (interfaceC7845m != null) {
            compositeDisposable.add(interfaceC7845m.f().subscribe(new m(this)));
        }
        View view3 = this.h;
        this.f64113k = view3 != null ? (ProjectionDialogSwitchWidget) view3.findViewById(2131309405) : null;
        View view4 = this.h;
        this.f64114l = view4 != null ? (ProjectionDialogSpeedWidget) view4.findViewById(2131309395) : null;
        List<Float> list = C7433b.f120827a;
        InterfaceC7845m interfaceC7845m2 = this.f64111i;
        if (C7433b.e((interfaceC7845m2 == null || (aVarI = interfaceC7845m2.i()) == null) ? null : aVarI.c())) {
            ProjectionDialogSwitchWidget projectionDialogSwitchWidget = this.f64113k;
            if (projectionDialogSwitchWidget != null) {
                projectionDialogSwitchWidget.k(DirectionConst.LEFT, componentActivity);
            }
            ProjectionDialogSpeedWidget projectionDialogSpeedWidget = this.f64114l;
            if (projectionDialogSpeedWidget != null) {
                projectionDialogSpeedWidget.k(DirectionConst.RIGHT, componentActivity);
            }
        } else {
            ProjectionDialogSwitchWidget projectionDialogSwitchWidget2 = this.f64113k;
            if (projectionDialogSwitchWidget2 != null) {
                projectionDialogSwitchWidget2.k(DirectionConst.NONE, componentActivity);
            }
            ProjectionDialogSpeedWidget projectionDialogSpeedWidget2 = this.f64114l;
            if (projectionDialogSpeedWidget2 != null) {
                projectionDialogSpeedWidget2.setVisibility(8);
            }
        }
        ProjectionDialogSwitchWidget projectionDialogSwitchWidget3 = this.f64113k;
        if (projectionDialogSwitchWidget3 != null) {
            projectionDialogSwitchWidget3.setDeviceSwitchCallback(new n(this));
        }
        ProjectionDialogSpeedWidget projectionDialogSpeedWidget3 = this.f64114l;
        if (projectionDialogSpeedWidget3 != null) {
            projectionDialogSpeedWidget3.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.lib.projection.internal.widget.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final o f63915a;

                {
                    this.f63915a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    com.bilibili.lib.projection.internal.reporter.a reporter;
                    com.bilibili.lib.projection.internal.device.a aVarS2;
                    com.bilibili.lib.projection.internal.device.a aVarS3;
                    ProjectionDeviceInternal device;
                    Observable<ge0.f> observableA;
                    Disposable disposableSubscribe;
                    com.bilibili.lib.projection.internal.device.a aVarS4;
                    o oVar = this.f63915a;
                    ComponentActivity componentActivity2 = oVar.f64104a;
                    w wVar = new w(componentActivity2, oVar.f64105b);
                    if (!componentActivity2.isFinishing() && !componentActivity2.isDestroyed()) {
                        Boolean bool = Boolean.FALSE;
                        MutableStateFlow<Boolean> mutableStateFlow = wVar.f64146b;
                        mutableStateFlow.setValue(bool);
                        View viewInflate2 = LayoutInflater.from(componentActivity2).inflate(2131497496, (ViewGroup) null, false);
                        List<Float> list2 = C7433b.f120827a;
                        InterfaceC7845m interfaceC7845m3 = wVar.f64149e;
                        wVar.f64148d = new C2406d(C7433b.b((interfaceC7845m3 == null || (aVarS4 = interfaceC7845m3.s()) == null) ? null : aVarS4.getDevice()));
                        RecyclerView recyclerView = (RecyclerView) viewInflate2.findViewById(2131309602);
                        if (recyclerView != null) {
                            recyclerView.setClipToOutline(true);
                            recyclerView.setLayoutManager(new LinearLayoutManager(componentActivity2, 1, false));
                            recyclerView.setAdapter(wVar.f64148d);
                            C2406d c2406d = wVar.f64148d;
                            if (c2406d != null) {
                                c2406d.f11386c = wVar;
                            }
                            if (c2406d != null) {
                                ProjectionSpeedInfo.a aVar = ProjectionSpeedInfo.Companion;
                                InterfaceC7845m interfaceC7845m4 = wVar.f64149e;
                                float playSpeed = interfaceC7845m4 != null ? interfaceC7845m4.getPlaySpeed() : 1.0f;
                                List<Float> list3 = C7564c.f121633j.f124073c;
                                aVar.getClass();
                                c2406d.N(new ProjectionSpeedInfo(playSpeed, list3, false, 4, null));
                            }
                            Drawable drawable = ResourcesCompat.getDrawable(componentActivity2.getResources(), 2131238644, null);
                            if (drawable != null) {
                                recyclerView.addItemDecoration(new C2410h(drawable));
                            }
                        }
                        InterfaceC7845m interfaceC7845m5 = wVar.f64149e;
                        if (interfaceC7845m5 != null && (aVarS3 = interfaceC7845m5.s()) != null && (device = aVarS3.getDevice()) != null && (observableA = device.A()) != null && (disposableSubscribe = observableA.subscribe(new WK0.l(wVar))) != null) {
                            wVar.f64150f.add(disposableSubscribe);
                        }
                        Job job = wVar.f64147c;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        wVar.f64147c = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity2), (CoroutineContext) null, (CoroutineStart) null, new ProjectionSpeedDialog$observeDismissFlow$1(wVar, null), 3, (Object) null);
                        new InternalScreenAdjustDialog(componentActivity2, viewInflate2, G.b.a, "", 0.5f, 0, true, true, false, 3, a.b.a, mutableStateFlow, R$color.Bg2_float, true).show();
                    }
                    InterfaceC7845m interfaceC7845m6 = oVar.f64111i;
                    if (interfaceC7845m6 == null || (reporter = interfaceC7845m6.getReporter()) == null) {
                        return;
                    }
                    InterfaceC7845m interfaceC7845m7 = oVar.f64111i;
                    Float fValueOf = interfaceC7845m7 != null ? Float.valueOf(interfaceC7845m7.getPlaySpeed()) : null;
                    InterfaceC7845m interfaceC7845m8 = oVar.f64111i;
                    ProjectionDeviceInternal device2 = (interfaceC7845m8 == null || (aVarS2 = interfaceC7845m8.s()) == null) ? null : aVarS2.getDevice();
                    InterfaceC7845m interfaceC7845m9 = oVar.f64111i;
                    IProjectionItem iProjectionItemN = interfaceC7845m9 != null ? interfaceC7845m9.n(true) : null;
                    reporter.T(1, fValueOf, device2, iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null);
                }
            });
        }
        View view5 = this.h;
        this.f64115m = view5 != null ? (ProjectionDialogSeekWidget) view5.findViewById(2131309394) : null;
        View view6 = this.h;
        this.f64116n = view6 != null ? (ProjectionDialogSeekTextWidget) view6.findViewById(2131309387) : null;
        ProjectionDialogSeekWidget projectionDialogSeekWidget = this.f64115m;
        if (projectionDialogSeekWidget != null) {
            projectionDialogSeekWidget.f63895m = new g(this);
        }
        a(this.h);
        InterfaceC7845m interfaceC7845m3 = this.f64111i;
        if (interfaceC7845m3 != null) {
            compositeDisposable.add(interfaceC7845m3.getContext().c().f126652a.subscribe(k.f64100a));
            compositeDisposable.add(interfaceC7845m3.getContext().c().f126653b.subscribe(new l(this)));
            compositeDisposable.add(interfaceC7845m3.getContext().c().f126654c.subscribe(new Ed.f(this)));
        }
        com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
        InterfaceC7845m interfaceC7845m4 = this.f64111i;
        IProjectionItem iProjectionItemN = interfaceC7845m4 != null ? interfaceC7845m4.n(false) : null;
        InterfaceC7845m interfaceC7845m5 = this.f64111i;
        ProjectionDeviceInternal device = (interfaceC7845m5 == null || (aVarS = interfaceC7845m5.s()) == null) ? null : aVarS.getDevice();
        aVar.getClass();
        he0.j.e("player.player.screencast.0.show", device, iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null, aVar.f63524a, null, 16);
        this.f64110g = new com.bilibili.app.screen.adjust.widget.q(this.f64104a, this.h, G.b.a, (String) null, 0.0f, false, false, 0, a.b.a, this.f64106c, 2131103404, 9208);
        Job job = this.f64107d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f64107d = BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), (CoroutineContext) null, (CoroutineStart) null, new ProjectionControlDialog$observeDismissFlow$1(this, null), 3, (Object) null);
        this.f64110g.b();
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.InterfaceC5317a
    public final void showPanel(@NotNull String str) {
    }
}
