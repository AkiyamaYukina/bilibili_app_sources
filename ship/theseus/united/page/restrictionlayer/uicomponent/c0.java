package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import dv0.y0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/c0.class */
@StabilityInferred(parameters = 0)
public final class c0 extends DataBindingComponent<y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.M f102845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.J f102846b;

    public c0(@NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.M m7, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.J j7) {
        this.f102845a = m7;
        this.f102846b = j7;
    }

    public final Object b(ViewDataBinding viewDataBinding, Continuation continuation) {
        y0 y0Var = (y0) viewDataBinding;
        y0Var.r(this.f102845a);
        y0Var.q(this.f102846b);
        y0Var.f117185y.setContent(ComposableLambdaKt.composableLambdaInstance(-50616620, true, new Function2(this) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.b0

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c0 f102844a;

            {
                this.f102844a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-50616620, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionVerticalTextHorizontalUIComponent.bind.<anonymous> (RestrictionVerticalTextHorizontalUIComponent.kt:31)");
                    }
                    RestrictionLayerButtonBarKt.a(this.f102844a.f102845a.n(), Dp.m3880constructorimpl(40), null, composer, 48, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        y0Var.executePendingBindings();
        return Unit.INSTANCE;
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y0.inflate(layoutInflater, viewGroup, false);
    }
}
