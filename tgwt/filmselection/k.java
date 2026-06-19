package com.bilibili.tgwt.filmselection;

import DD0.AbstractC1549w;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/k.class */
@StabilityInferred(parameters = 0)
public final class k extends DataBindingComponent<AbstractC1549w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final n f111195a;

    public k(@NotNull n nVar) {
        this.f111195a = nVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC1549w abstractC1549w = (AbstractC1549w) viewDataBinding;
        abstractC1549w.q(this.f111195a);
        abstractC1549w.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC1549w abstractC1549wInflate = AbstractC1549w.inflate(layoutInflater, viewGroup, false);
        TextView textView = abstractC1549wInflate.f2674y;
        float fA = Uj0.c.a(2, context);
        KProperty<Object>[] kPropertyArr = Jj0.n.f11493a;
        textView.setClipToOutline(true);
        textView.setOutlineProvider(new Jj0.m(fA));
        return abstractC1549wInflate;
    }
}
