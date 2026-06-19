package com.bilibili.ship.theseus.ugc.endpage.qoe;

import android.animation.ValueAnimator;
import com.bilibili.app.gemini.ugc.view.ReviewRatingBar;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/k.class */
public final class k implements ReviewRatingBar.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcDmQoeComponent f96721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<ValueAnimator> f96722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.IntRef f96723c;

    public k(UgcDmQoeComponent ugcDmQoeComponent, Ref.ObjectRef<ValueAnimator> objectRef, Ref.IntRef intRef) {
        this.f96721a = ugcDmQoeComponent;
        this.f96722b = objectRef;
        this.f96723c = intRef;
    }

    public final void a(int i7, boolean z6) {
        UgcDmQoeComponent ugcDmQoeComponent = this.f96721a;
        MutableSharedFlow<UgcDmQoeComponent.a> mutableSharedFlow = ugcDmQoeComponent.f96612c;
        int i8 = i7 - 1;
        List<UgcDmQoeComponent.State.a> list = ugcDmQoeComponent.h;
        List<UgcDmQoeComponent.State.a> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewItems");
            list2 = null;
        }
        mutableSharedFlow.tryEmit(new UgcDmQoeComponent.a.f(i8, list2.get(i8)));
    }

    public final boolean b() {
        List<UgcDmQoeComponent.State.a> list = this.f96721a.h;
        List<UgcDmQoeComponent.State.a> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewItems");
            list2 = null;
        }
        boolean z6 = false;
        List<String> list3 = list2.get(0).f96632e;
        if (list3 == null || list3.isEmpty()) {
            z6 = true;
        }
        return z6;
    }

    public final void c(float f7) {
        UgcDmQoeComponent ugcDmQoeComponent = this.f96721a;
        List<UgcDmQoeComponent.State.a> list = ugcDmQoeComponent.h;
        List<UgcDmQoeComponent.State.a> list2 = list;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewItems");
            list2 = null;
        }
        int i7 = (int) f7;
        UgcDmQoeComponent.State.a aVar = list2.get(i7 - 1);
        if (aVar.f96632e == null || !(!r0.isEmpty())) {
            return;
        }
        Ref.ObjectRef<ValueAnimator> objectRef = this.f96722b;
        ValueAnimator valueAnimator = (ValueAnimator) objectRef.element;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) objectRef.element;
        this.f96723c.element = ((Integer) (valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null)).intValue();
        MutableSharedFlow<UgcDmQoeComponent.a> mutableSharedFlow = ugcDmQoeComponent.f96612c;
        String str = ugcDmQoeComponent.f96616g;
        List<UgcDmQoeComponent.State.a> list3 = ugcDmQoeComponent.h;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewItems");
            list3 = null;
        }
        mutableSharedFlow.tryEmit(new UgcDmQoeComponent.a.h(str, i7, list3, aVar.f96632e, aVar.f96628a));
    }
}
