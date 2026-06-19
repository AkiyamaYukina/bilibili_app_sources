package com.bilibili.ship.theseus.united.page.intro.module.relate.bangumi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import com.bilibili.ship.theseus.united.page.intro.module.relate.z0;
import dv0.AbstractC6882t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/bangumi/e.class */
@StabilityInferred(parameters = 0)
public final class e extends DataBindingComponent<AbstractC6882t> implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f101130a;

    public e(@NotNull f fVar) {
        this.f101130a = fVar;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC6882t abstractC6882t = (AbstractC6882t) viewDataBinding;
        abstractC6882t.q(this.f101130a);
        abstractC6882t.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC6882t.inflate(layoutInflater, viewGroup, false);
    }
}
