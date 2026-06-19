package com.bilibili.lib.projection.internal.panel.fullscreen;

import Je0.C2409g;
import Je0.InterfaceC2403a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qe0.C8425f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionSpeedFullscreenPanel.class */
public final class ProjectionSpeedFullscreenPanel extends ProjectionDialogFragment implements InterfaceC2403a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CompositeDisposable f63404d = new CompositeDisposable();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2409g f63405e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionSpeedFullscreenPanel$a.class */
    public static final class a<T> implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSpeedFullscreenPanel f63406a;

        public a(ProjectionSpeedFullscreenPanel projectionSpeedFullscreenPanel) {
            this.f63406a = projectionSpeedFullscreenPanel;
        }

        public final void accept(Object obj) {
            ge0.f fVar = (ge0.f) obj;
            if (fVar instanceof C8425f) {
                C2409g c2409g = this.f63406a.f63405e;
                C2409g c2409g2 = c2409g;
                if (c2409g == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSpeedAdapter");
                    c2409g2 = null;
                }
                c2409g2.N(((C8425f) fVar).f125999a);
            }
        }
    }

    @Override // Je0.InterfaceC2403a
    public final void a1(float f7, boolean z6) {
        InterfaceC5317a interfaceC5317a;
        InterfaceC7845m interfaceC7845mM6;
        Resources resources;
        Configuration configuration;
        InterfaceC7845m interfaceC7845mM62;
        com.bilibili.lib.projection.internal.reporter.a reporter;
        InterfaceC7845m interfaceC7845mM63;
        InterfaceC7845m interfaceC7845mM64;
        com.bilibili.lib.projection.internal.device.a aVarS;
        InterfaceC7845m interfaceC7845mM65;
        StandardProjectionItem standardProjectionItem = null;
        if (z6) {
            InterfaceC5317a interfaceC5317a2 = this.f63350b;
            if (interfaceC5317a2 != null && (interfaceC7845mM65 = interfaceC5317a2.M6()) != null) {
                ProjectionClient.setPlaySpeed$default(interfaceC7845mM65, f7, false, 2, null);
            }
            dismiss();
        } else {
            Context context = getContext();
            boolean z7 = ((context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? 0 : configuration.smallestScreenWidthDp) < 600;
            Context context2 = getContext();
            if (context2 != null && (interfaceC5317a = this.f63350b) != null && (interfaceC7845mM6 = interfaceC5317a.M6()) != null) {
                InterfaceC7845m.h(interfaceC7845mM6, context2, false, z7, false, 10);
            }
            dismiss();
        }
        InterfaceC5317a interfaceC5317a3 = this.f63350b;
        if (interfaceC5317a3 == null || (interfaceC7845mM62 = interfaceC5317a3.M6()) == null || (reporter = interfaceC7845mM62.getReporter()) == null) {
            return;
        }
        InterfaceC5317a interfaceC5317a4 = this.f63350b;
        ProjectionDeviceInternal device = (interfaceC5317a4 == null || (interfaceC7845mM64 = interfaceC5317a4.M6()) == null || (aVarS = interfaceC7845mM64.s()) == null) ? null : aVarS.getDevice();
        InterfaceC5317a interfaceC5317a5 = this.f63350b;
        IProjectionItem iProjectionItemN = (interfaceC5317a5 == null || (interfaceC7845mM63 = interfaceC5317a5.M6()) == null) ? null : interfaceC7845mM63.n(true);
        if (iProjectionItemN instanceof StandardProjectionItem) {
            standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
        }
        reporter.U(Float.valueOf(f7), device, standardProjectionItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r10, @org.jetbrains.annotations.Nullable android.view.ViewGroup r11, @org.jetbrains.annotations.Nullable android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionSpeedFullscreenPanel.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f63404d.dispose();
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment
    public final void onShow() {
        InterfaceC7845m interfaceC7845mM6;
        com.bilibili.lib.projection.internal.device.a aVarS;
        ProjectionDeviceInternal device;
        Observable<ge0.f> observableA;
        Disposable disposableSubscribe;
        super.onShow();
        InterfaceC5317a interfaceC5317a = this.f63350b;
        if (interfaceC5317a == null || (interfaceC7845mM6 = interfaceC5317a.M6()) == null || (aVarS = interfaceC7845mM6.s()) == null || (device = aVarS.getDevice()) == null || (observableA = device.A()) == null || (disposableSubscribe = observableA.subscribe(new a(this))) == null) {
            return;
        }
        this.f63404d.add(disposableSubscribe);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenAdjustUtilsKt.collectWindowSize$default(this, false, new Ie0.h(0, this, new EV.h(this, 3)), 1, (Object) null);
    }
}
