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
import zu0.D;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/i.class */
@StabilityInferred(parameters = 0)
public final class i extends DataBindingComponent<D> implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final m f93834a;

    public i(@NotNull m mVar) {
        this.f93834a = mVar;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.ui.l
    @NotNull
    public final m a() {
        return this.f93834a;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        D d7 = (D) viewDataBinding;
        d7.q(this.f93834a);
        d7.executePendingBindings();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvEpisodeShortAndLongTitleUIComponentInLayer$bind$2(this, d7, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return D.inflate(layoutInflater, viewGroup, false);
    }
}
