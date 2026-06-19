package com.bilibili.lib.projection.internal.widget;

import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogSeekTextWidget;
import com.bilibili.lib.projection.internal.widget.dialog.ProjectionDialogSeekWidget;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Pair;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/l.class */
public final class l<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f64101a;

    public l(o oVar) {
        this.f64101a = oVar;
    }

    public final void accept(Object obj) {
        Pair pair = (Pair) obj;
        if (((Number) pair.getFirst()).intValue() < 0 || ((Number) pair.getSecond()).intValue() < 0) {
            return;
        }
        o oVar = this.f64101a;
        ProjectionDialogSeekWidget projectionDialogSeekWidget = oVar.f64115m;
        if (projectionDialogSeekWidget != null) {
            projectionDialogSeekWidget.o(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue(), true);
        }
        ProjectionDialogSeekTextWidget projectionDialogSeekTextWidget = oVar.f64116n;
        if (projectionDialogSeekTextWidget != null) {
            projectionDialogSeekTextWidget.J(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        }
    }
}
