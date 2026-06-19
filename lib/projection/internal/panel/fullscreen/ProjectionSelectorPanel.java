package com.bilibili.lib.projection.internal.panel.fullscreen;

import Te0.InterfaceC2894a;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.selector.ProjectionSelectorContainer;
import ie0.C7564c;
import le0.InterfaceC7845m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionSelectorPanel.class */
public final class ProjectionSelectorPanel extends ProjectionDialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ProjectionSelectorContainer f63401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f63402e = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/ProjectionSelectorPanel$a.class */
    public static final class a implements InterfaceC2894a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionSelectorPanel f63403a;

        public a(ProjectionSelectorPanel projectionSelectorPanel) {
            this.f63403a = projectionSelectorPanel;
        }

        @Override // Te0.InterfaceC2894a
        public final void hide() {
            this.f63403a.dismiss();
        }

        @Override // Te0.InterfaceC2894a
        public final void onClick(String str) {
            InterfaceC7845m interfaceC7845mM6;
            com.bilibili.lib.projection.internal.reporter.a reporter;
            InterfaceC7845m interfaceC7845mM62;
            com.bilibili.lib.projection.internal.device.a aVarS;
            ProjectionSelectorPanel projectionSelectorPanel = this.f63403a;
            InterfaceC5317a interfaceC5317a = projectionSelectorPanel.f63350b;
            ProjectionDeviceInternal device = (interfaceC5317a == null || (interfaceC7845mM62 = interfaceC5317a.M6()) == null || (aVarS = interfaceC7845mM62.s()) == null) ? null : aVarS.getDevice();
            if (device != null) {
                he0.j.c("player.player.devices.option-episode.click", device, null, C7564c.f121634k.f63524a, null, 20);
                InterfaceC5317a interfaceC5317a2 = projectionSelectorPanel.f63350b;
                if (interfaceC5317a2 == null || (interfaceC7845mM6 = interfaceC5317a2.M6()) == null || (reporter = interfaceC7845mM6.getReporter()) == null) {
                    return;
                }
                reporter.S(device, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        InterfaceC7845m interfaceC7845mM6;
        ProjectionClient.ClientCallback callback;
        InterfaceC5317a interfaceC5317a = this.f63350b;
        ProjectionSelectorContainer projectionSelectorContainerOnShowSelector = (interfaceC5317a == null || (interfaceC7845mM6 = interfaceC5317a.M6()) == null || (callback = interfaceC7845mM6.getCallback()) == null) ? null : callback.onShowSelector();
        this.f63401d = projectionSelectorContainerOnShowSelector;
        View viewOnCreateView = projectionSelectorContainerOnShowSelector != null ? projectionSelectorContainerOnShowSelector.onCreateView(layoutInflater, viewGroup, this.f63402e) : null;
        View viewFindViewById = null;
        if (viewOnCreateView != null) {
            viewFindViewById = viewOnCreateView.findViewById(2131309598);
        }
        if (viewOnCreateView != null) {
            viewOnCreateView.setOnClickListener(new WH0.f(this, 2));
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new Object());
        }
        if (viewFindViewById != null) {
            viewFindViewById.setClipToOutline(true);
        }
        this.f63351c = viewFindViewById;
        return viewOnCreateView;
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        kf();
        ProjectionSelectorContainer projectionSelectorContainer = this.f63401d;
        if (projectionSelectorContainer != null) {
            projectionSelectorContainer.onShow();
        }
    }

    @Override // com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionDialogFragment
    public final void onShow() {
        super.onShow();
        ProjectionSelectorContainer projectionSelectorContainer = this.f63401d;
        if (projectionSelectorContainer != null) {
            projectionSelectorContainer.onShow();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenAdjustUtilsKt.collectWindowSize$default(this, false, new Ie0.h(0, this, new EV.f(this, 7)), 1, (Object) null);
    }
}
