package com.bilibili.ship.theseus.united.page.playingarea;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import com.bilibili.ship.theseus.united.widget.TheseusAncestorLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<Matrix> f102362a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<RectF> f102363b = new ThreadLocal<>();

    public static final void a(TheseusAncestorLayout theseusAncestorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != theseusAncestorLayout) {
            a(theseusAncestorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
