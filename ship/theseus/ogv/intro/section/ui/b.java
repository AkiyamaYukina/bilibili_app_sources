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
import zu0.AbstractC9266z;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/b.class */
@StabilityInferred(parameters = 0)
public final class b extends DataBindingComponent<AbstractC9266z> implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final m f93821a;

    public b(@NotNull m mVar) {
        this.f93821a = mVar;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.ui.l
    @NotNull
    public final m a() {
        return this.f93821a;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        AbstractC9266z abstractC9266z = (AbstractC9266z) viewDataBinding;
        abstractC9266z.q(this.f93821a);
        abstractC9266z.executePendingBindings();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvEpisodeCoverUIComponentInLayer$bind$2(this, abstractC9266z, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AbstractC9266z.inflate(layoutInflater, viewGroup, false);
    }
}
