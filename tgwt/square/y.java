package com.bilibili.tgwt.square;

import DD0.T;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/y.class */
@StabilityInferred(parameters = 0)
public final class y extends DataBindingComponent<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final z f112210a;

    public y(@NotNull z zVar) {
        this.f112210a = zVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        ((T) viewDataBinding).q(this.f112210a);
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return T.inflate(layoutInflater, viewGroup, false);
    }
}
