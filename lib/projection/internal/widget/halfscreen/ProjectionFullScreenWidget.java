package com.bilibili.lib.projection.internal.widget.halfscreen;

import M8.r;
import Qe0.C2823e;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.projection.internal.control.NewBubbleHelper;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionFullScreenActivity;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.reporter.ProjectionReporter;
import com.bilibili.mobile.BLMobileHumanActionNative;
import he0.C7435d;
import he0.j;
import ie0.C7564c;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.a;
import ke0.InterfaceC7756d;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/halfscreen/ProjectionFullScreenWidget.class */
public final class ProjectionFullScreenWidget extends AppCompatImageView implements InterfaceC7756d, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public InterfaceC7845m f64057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ProjectionDeviceInternal f64058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Disposable f64059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f64060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64062f;

    public ProjectionFullScreenWidget(@NotNull Context context) {
        super(context);
        this.f64061e = -1;
        this.f64062f = true;
    }

    public ProjectionFullScreenWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64061e = -1;
        this.f64062f = true;
    }

    @Override // ke0.InterfaceC7753a
    public final void b(InterfaceC7845m.a aVar) {
        this.f64057a = null;
        Disposable disposable = this.f64059c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f64059c = null;
    }

    @Override // ke0.InterfaceC7753a
    public final void i(InterfaceC7845m.a aVar) {
        a aVarF;
        setOnClickListener(this);
        InterfaceC7845m client = aVar.getContainer().getClient();
        this.f64057a = client;
        this.f64059c = (client == null || (aVarF = client.f()) == null) ? null : aVarF.subscribe(new C2823e(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        IProjectionPlayableItem mediaSource;
        ProjectionDeviceInternal projectionDeviceInternal = this.f64058b;
        IProjectionItem iProjectionItemN = null;
        IProjectionItem rawItem = (projectionDeviceInternal == null || (mediaSource = projectionDeviceInternal.getMediaSource()) == null) ? null : mediaSource.getRawItem();
        com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
        ProjectionDeviceInternal projectionDeviceInternal2 = this.f64058b;
        aVar.getClass();
        j.i("projection.show.fullscreen.panel", projectionDeviceInternal2, true, rawItem instanceof StandardProjectionItem ? (StandardProjectionItem) rawItem : null, aVar.f63524a, null, 32);
        if (C7435d.f120839d != null) {
            NewBubbleHelper.f63022m.onNext(NewBubbleHelper.NeedShowNewBubble.HALF_TO_FULL_SCREEN);
        }
        int i7 = ProjectionFullScreenActivity.f63352c1;
        getContext();
        InterfaceC7845m interfaceC7845m = this.f64057a;
        boolean z6 = false;
        int clientId = interfaceC7845m != null ? interfaceC7845m.getClientId() : 0;
        boolean z7 = this.f64060d;
        int i8 = this.f64061e;
        boolean z8 = this.f64062f;
        if (C7435d.f120839d != null) {
            z6 = true;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("bundle_client_id", clientId);
        bundle.putBoolean("bundle_need_show_bubble", z7);
        bundle.putInt("bundle_need_show_bubble_type", i8);
        bundle.putBoolean("bundle_dynamic_icon_need_show", z8);
        bundle.putBoolean("bundle_new_ui_control", z6);
        BLRouter.routeTo(new RouteRequest.Builder("bilibili://projection/controller-full").extras(new r(bundle, 3)).flags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE).build(), getContext());
        InterfaceC7845m interfaceC7845m2 = this.f64057a;
        if (interfaceC7845m2 == null || (reporter = interfaceC7845m2.getReporter()) == null) {
            return;
        }
        ProjectionReporter.PanelMode panelMode = ProjectionReporter.PanelMode.Half;
        ProjectionReporter.ControlPageButtonType controlPageButtonType = ProjectionReporter.ControlPageButtonType.HalfFullControlButton;
        InterfaceC7845m interfaceC7845m3 = this.f64057a;
        ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m interfaceC7845m4 = this.f64057a;
        if (interfaceC7845m4 != null) {
            iProjectionItemN = interfaceC7845m4.n(true);
        }
        reporter.o(panelMode, controlPageButtonType, device, iProjectionItemN);
    }

    public final void setBubbleParams(boolean z6) {
        this.f64060d = z6;
    }

    public final void setDynamicIconNeedShow(boolean z6) {
        this.f64062f = z6;
    }
}
