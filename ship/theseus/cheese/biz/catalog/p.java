package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import fu0.V;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/p.class */
@StabilityInferred(parameters = 0)
public final class p extends DataBindingComponent<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f89192a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/p$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends androidx.databinding.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f89193a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f89194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ColorStateList f89195c;
    }

    public p(@NotNull a aVar) {
        this.f89192a = aVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        V v7 = (V) viewDataBinding;
        a aVar = this.f89192a;
        v7.q(aVar);
        ColorStateList colorStateList = aVar.f89195c;
        if (colorStateList != null) {
            v7.f119509w.setTextColor(colorStateList);
        }
        v7.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return V.inflate(layoutInflater, viewGroup, false);
    }
}
