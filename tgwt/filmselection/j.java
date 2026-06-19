package com.bilibili.tgwt.filmselection;

import DD0.l0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import com.bilibili.app.gemini.ui.DataBindingComponent;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/j.class */
@StabilityInferred(parameters = 0)
public final class j extends DataBindingComponent<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f111192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f111193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f111194c;

    public j(@NotNull String str, boolean z6, @NotNull a aVar) {
        this.f111192a = str;
        this.f111193b = aVar;
        this.f111194c = StateFlowKt.MutableStateFlow(Boolean.valueOf(z6));
    }

    public final ViewDataBinding d(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l0.inflate(layoutInflater, viewGroup, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull DD0.l0 r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.KotlinNothingValueException {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.tgwt.filmselection.FilmTypeItemComponent$bind$1
            if (r0 == 0) goto L29
            r0 = r8
            com.bilibili.tgwt.filmselection.FilmTypeItemComponent$bind$1 r0 = (com.bilibili.tgwt.filmselection.FilmTypeItemComponent$bind$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L33
        L29:
            com.bilibili.tgwt.filmselection.FilmTypeItemComponent$bind$1 r0 = new com.bilibili.tgwt.filmselection.FilmTypeItemComponent$bind$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L33:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L5e
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9f
        L5e:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            android.view.View r0 = r0.getRoot()
            com.bilibili.tgwt.filmselection.h r1 = new com.bilibili.tgwt.filmselection.h
            r2 = r1
            r3 = r6
            r4 = 0
            r2.<init>(r3, r4)
            r0.setOnClickListener(r1)
            r0 = r7
            android.widget.TextView r0 = r0.f2565w
            r1 = r6
            java.lang.String r1 = r1.f111192a
            r0.setText(r1)
            com.bilibili.tgwt.filmselection.i r0 = new com.bilibili.tgwt.filmselection.i
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r7 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r6
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f111194c
            r1 = r7
            r2 = r8
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r10
            if (r0 != r1) goto L9f
            r0 = r10
            return r0
        L9f:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.filmselection.j.b(DD0.l0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
