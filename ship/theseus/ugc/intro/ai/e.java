package com.bilibili.ship.theseus.ugc.intro.ai;

import Vu0.C2970i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.droid.DimenUtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/e.class */
@StabilityInferred(parameters = 0)
public final class e implements UIComponent<n<C2970i>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f96970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Wu0.f f96971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f96972e = DimenUtilsKt.dpToPx(51.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ValueAnimator f96973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ValueAnimator f96974g;
    public boolean h;

    public e(@NotNull MutableStateFlow mutableStateFlow, @NotNull MutableStateFlow mutableStateFlow2, @NotNull StateFlow stateFlow, @NotNull Wu0.f fVar) {
        this.f96968a = mutableStateFlow;
        this.f96969b = mutableStateFlow2;
        this.f96970c = stateFlow;
        this.f96971d = fVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        C2970i c2970i = (C2970i) ((n) viewEntry).a;
        ConstraintLayout constraintLayout = c2970i.f25911a;
        constraintLayout.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = 0;
        constraintLayout.setLayoutParams(layoutParams);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AiComponent$bindToView$3(this, constraintLayout, c2970i, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(C2970i.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
