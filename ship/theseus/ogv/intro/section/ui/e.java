package com.bilibili.ship.theseus.ogv.intro.section.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import zu0.g1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/e.class */
@StabilityInferred(parameters = 0)
public final class e extends DataBindingComponent<g1> implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final m f93830a;

    public e(@NotNull m mVar) {
        this.f93830a = mVar;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.ui.l
    @NotNull
    public final m a() {
        return this.f93830a;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        g1 g1Var = (g1) viewDataBinding;
        g1Var.q(this.f93830a);
        g1Var.executePendingBindings();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvEpisodeLongAndShortTitleUIComponent$bind$2(this, g1Var, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g1.inflate(layoutInflater, viewGroup, false);
    }
}
