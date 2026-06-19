package com.bilibili.ship.theseus.united.page;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/e.class */
public final class e extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.FloatRef f99562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f99563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f99564c;

    public e(Ref.FloatRef floatRef, float f7, View view) {
        this.f99562a = floatRef;
        this.f99563b = f7;
        this.f99564c = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
        Ref.FloatRef floatRef = this.f99562a;
        float f7 = floatRef.element + i8;
        floatRef.element = f7;
        View view = this.f99564c;
        float fCoerceIn = RangesKt.coerceIn(1 - (f7 / this.f99563b), 0.0f, 1.0f);
        if (view.getAlpha() == fCoerceIn) {
            return;
        }
        view.setAlpha(fCoerceIn);
    }
}
