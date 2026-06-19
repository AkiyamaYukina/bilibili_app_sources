package com.bilibili.ship.theseus.ugc.intro.commentguide;

import Vu0.C2971j;
import Wu0.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.framework.exposure.core.ExposureEntry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/f.class */
@StabilityInferred(parameters = 0)
public final class f implements UIComponent<n<C2971j>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f96996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f96997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96998c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ValueAnimator f97000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ValueAnimator f97001f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f96999d = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f97002g = new ExposureEntry(com.bilibili.ship.theseus.united.page.report.a.f102493a, new j(this, 3));

    public f(@NotNull g gVar, @NotNull StateFlow stateFlow) {
        this.f96996a = gVar;
        this.f96997b = stateFlow;
    }

    public static final void a(f fVar, final C2971j c2971j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(fVar.f96998c, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(c2971j) { // from class: com.bilibili.ship.theseus.ugc.intro.commentguide.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C2971j f96987a;

            {
                this.f96987a = c2971j;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ConstraintLayout constraintLayout = this.f96987a.f25915a;
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                constraintLayout.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.addListener(new e(fVar));
        valueAnimatorOfInt.start();
        fVar.f97000e = valueAnimatorOfInt;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        C2971j c2971j = (C2971j) ((n) viewEntry).a;
        ConstraintLayout constraintLayout = c2971j.f25915a;
        Context context = constraintLayout.getContext();
        g gVar = this.f96996a;
        String strA = gVar.a();
        String string = gVar.f97003a.f97007b;
        if (string == null || StringsKt.isBlank(string)) {
            string = gVar.f97004b.f96981b.getString(2131848991);
        }
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CommentGuideComponent$bindToView$2(this, constraintLayout, c2971j, context.getString(2131848999, strA), string, strA, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(C2971j.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
