package com.bilibili.ship.theseus.ogv.web.ui;

import YU.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.UIComponentKt;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import org.jetbrains.annotations.NotNull;
import zu0.P0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/web/ui/a.class */
@StabilityInferred(parameters = 0)
public final class a extends m<P0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusWebUIComponent f94921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AdaptedFunctionReference f94922b;

    public a(@NotNull TheseusWebUIComponent theseusWebUIComponent, @NotNull Function0 function0) {
        this.f94921a = theseusWebUIComponent;
        this.f94922b = (AdaptedFunctionReference) function0;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        P0 p02 = (P0) viewBinding;
        p02.f130547b.setOnClickListener(new b(this, 2));
        Object objB = UIComponentKt.b(this.f94921a, p02.f130548c.getContext(), p02.f130548c, new OgvPlayerFullScreenWebUIComponent$bind$3(p02, null), continuation, 4);
        if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objB = Unit.INSTANCE;
        }
        return objB;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return P0.inflate(layoutInflater, viewGroup, false);
    }

    @NotNull
    public final Object viewReusingKey() {
        return new Pair(this.f94921a.viewReusingKey(), super/*com.bilibili.app.gemini.ui.UIComponent*/.viewReusingKey());
    }
}
