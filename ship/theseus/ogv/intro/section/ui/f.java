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
import zu0.i1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/f.class */
@StabilityInferred(parameters = 0)
public final class f extends DataBindingComponent<i1> implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final m f93831a;

    public f(@NotNull m mVar) {
        this.f93831a = mVar;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.section.ui.l
    @NotNull
    public final m a() {
        return this.f93831a;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        i1 i1Var = (i1) viewDataBinding;
        i1Var.q(this.f93831a);
        i1Var.executePendingBindings();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvEpisodeLongTitleUIComponent$bind$2(this, i1Var, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i1.inflate(layoutInflater, viewGroup, false);
    }
}
