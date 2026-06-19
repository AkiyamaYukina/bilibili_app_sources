package com.bilibili.lib.projection.internal.widget.fullscreen.newui;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionSeekBarWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/fullscreen/newui/a.class */
public final class a implements ProjectionDeviceInternal.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionSeekBarWidget f64049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64050b;

    public a(ProjectionSeekBarWidget projectionSeekBarWidget, int i7) {
        this.f64049a = projectionSeekBarWidget;
        this.f64050b = i7;
    }

    @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
    public final void a() {
    }

    @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
    public final void b(boolean z6) {
        ProjectionSeekBarWidget projectionSeekBarWidget = this.f64049a;
        com.bilibili.lib.projection.internal.device.a aVar = projectionSeekBarWidget.h;
        int i7 = this.f64050b;
        if (aVar != null) {
            aVar.seekTo(i7, 2);
        }
        projectionSeekBarWidget.f64041g = i7 > projectionSeekBarWidget.f64039e ? ProjectionSeekBarWidget.SeekStatus.SeekRight : ProjectionSeekBarWidget.SeekStatus.SeekLeft;
        projectionSeekBarWidget.f64040f = i7;
    }
}
