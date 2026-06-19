package com.bilibili.lib.projection.internal.widget;

import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogSeekTextWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/g.class */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f64051a;

    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        ProjectionDialogSeekTextWidget projectionDialogSeekTextWidget = this.f64051a.f64116n;
        if (projectionDialogSeekTextWidget != null) {
            projectionDialogSeekTextWidget.J(iIntValue, iIntValue2);
        }
        return Unit.INSTANCE;
    }
}
