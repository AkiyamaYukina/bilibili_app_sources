package com.bilibili.ship.theseus.ugc.endpage.aifeedback;

import Vu0.C2963b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import com.bilibili.ship.theseus.ugc.intro.ai.g;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/aifeedback/c.class */
@StabilityInferred(parameters = 0)
public final class c implements UIComponent<n<C2963b>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f96595e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g f96599d;

    @Inject
    public c(@NotNull MutableStateFlow mutableStateFlow, @NotNull MutableStateFlow mutableStateFlow2, boolean z6, @NotNull g gVar) {
        this.f96596a = mutableStateFlow;
        this.f96597b = mutableStateFlow2;
        this.f96598c = z6;
        this.f96599d = gVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        C2963b c2963b = (C2963b) ((n) viewEntry).a;
        ConstraintLayout constraintLayout = c2963b.f25882g;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UgcAiFeedbackComponent$bindToView$2(c2963b, this, new Ref.BooleanRef(), new Ref.ObjectRef(), new Ref.ObjectRef(), objectRef, constraintLayout, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(C2963b.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
