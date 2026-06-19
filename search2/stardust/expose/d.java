package com.bilibili.search2.stardust.expose;

import android.util.LongSparseArray;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/d.class */
@StabilityInferred(parameters = 0)
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LongSparseArray<View> f88747a = new LongSparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LongSparseArray<View> f88748b = new LongSparseArray<>();

    public final void a(@NotNull View view, @Nullable g gVar) {
        view.removeOnAttachStateChangeListener(this);
        if (gVar == null) {
            this.f88747a.remove(view.hashCode());
        } else {
            this.f88747a.remove(gVar.a(view));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View view) {
        view.removeOnAttachStateChangeListener(this);
        int iIndexOfValue = this.f88747a.indexOfValue(view);
        if (iIndexOfValue != -1) {
            this.f88747a.removeAt(iIndexOfValue);
        }
        Integer numValueOf = Integer.valueOf(this.f88748b.indexOfValue(view));
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.f88748b.removeAt(numValueOf.intValue());
        }
    }
}
