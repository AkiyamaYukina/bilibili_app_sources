package com.bilibili.ogv.operation2.inlinevideo;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/r.class */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f70970a = ViewCompat.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f70971b = 2131303684;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/r$a.class */
    public static final class a implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final D f70972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C f70973b;

        public a(D d7, C c7) {
            this.f70972a = d7;
            this.f70973b = c7;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            View viewA = this.f70972a.a();
            if (viewA != null) {
                C5491a c5491a = (C5491a) viewA.getTag(2131308206);
                l lVarI0 = this.f70973b.I0();
                if (lVarI0 != null) {
                    lVarI0.n(c5491a);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(@org.jetbrains.annotations.NotNull final com.bilibili.ogv.kmm.operation.inlinevideo.k r9, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r10, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r11, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.inlinevideo.r.f(com.bilibili.ogv.kmm.operation.inlinevideo.k, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean g(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult h(D d7, C c7, DisposableEffectScope disposableEffectScope) {
        return new a(d7, c7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View i(m mVar, C c7, Function0 function0, D d7, Context context) {
        View viewC = mVar.c(context);
        viewC.setTag(2131308206, new C5491a((Fragment) c7.K0().invoke(), viewC, c7.M0(), null, c7.L0(), function0));
        d7.b(viewC);
        return viewC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(C c7, View view) {
        C5491a c5491a = (C5491a) view.getTag(2131308206);
        l lVarI0 = c7.I0();
        if (lVarI0 != null) {
            lVarI0.n(c5491a);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(m mVar, s sVar, C c7, com.bilibili.ogv.kmm.operation.inlinevideo.k kVar, State state, View view) {
        l lVarI0;
        mVar.d(view);
        C5491a c5491a = (C5491a) view.getTag(2131308206);
        if (c5491a.A() != null && !Intrinsics.areEqual(c5491a.A(), sVar) && (lVarI0 = c7.I0()) != null) {
            lVarI0.n(c5491a);
        }
        c5491a.Q(sVar);
        c5491a.M(kVar);
        if (kVar.b() && g(state)) {
            l lVarI02 = c7.I0();
            if (lVarI02 != null) {
                lVarI02.l(c5491a);
            }
        } else {
            l lVarI03 = c7.I0();
            if (lVarI03 != null) {
                lVarI03.n(c5491a);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(com.bilibili.ogv.kmm.operation.inlinevideo.k kVar, Function0 function0, Modifier modifier, int i7, int i8, Composer composer, int i9) {
        f(kVar, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i8);
        return Unit.INSTANCE;
    }

    public static final int n() {
        return f70970a;
    }
}
