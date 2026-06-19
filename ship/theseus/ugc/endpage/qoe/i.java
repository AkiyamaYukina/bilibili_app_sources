package com.bilibili.ship.theseus.ugc.endpage.qoe;

import Vu0.C2967f;
import android.animation.ValueAnimator;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcDmQoeComponent f96713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<ValueAnimator> f96714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2967f f96715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ref.IntRef f96716d;

    public i(UgcDmQoeComponent ugcDmQoeComponent, Ref.ObjectRef<ValueAnimator> objectRef, C2967f c2967f, Ref.IntRef intRef) {
        this.f96713a = ugcDmQoeComponent;
        this.f96714b = objectRef;
        this.f96715c = c2967f;
        this.f96716d = intRef;
    }

    public final void a(int i7, UgcDmQoeComponent.State.a aVar) {
        try {
            List<String> list = aVar.f96632e;
            UgcDmQoeComponent ugcDmQoeComponent = this.f96713a;
            if (list == null || !(!list.isEmpty())) {
                ugcDmQoeComponent.f96612c.tryEmit(new UgcDmQoeComponent.a.f(i7, aVar));
                return;
            }
            boolean z6 = ugcDmQoeComponent.f96611b.f102987a;
            Ref.ObjectRef<ValueAnimator> objectRef = this.f96714b;
            if (!z6) {
                ValueAnimator valueAnimator = (ValueAnimator) objectRef.element;
                if (valueAnimator != null) {
                    valueAnimator.pause();
                }
                ugcDmQoeComponent.b(this.f96715c, i7, aVar);
                return;
            }
            ValueAnimator valueAnimator2 = (ValueAnimator) objectRef.element;
            if (valueAnimator2 != null) {
                valueAnimator2.pause();
            }
            ValueAnimator valueAnimator3 = (ValueAnimator) objectRef.element;
            if ((valueAnimator3 != null ? valueAnimator3.getAnimatedValue() : null) != null) {
                Ref.IntRef intRef = this.f96716d;
                ValueAnimator valueAnimator4 = (ValueAnimator) objectRef.element;
                Object animatedValue = valueAnimator4 != null ? valueAnimator4.getAnimatedValue() : null;
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                intRef.element = num != null ? num.intValue() : 0;
            }
            if (aVar.f96632e == null || !(!r0.isEmpty())) {
                return;
            }
            String str = ugcDmQoeComponent.f96616g;
            List<UgcDmQoeComponent.State.a> list2 = ugcDmQoeComponent.h;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewItems");
                list2 = null;
            }
            ugcDmQoeComponent.f96612c.tryEmit(new UgcDmQoeComponent.a.h(str, i7, list2, aVar.f96632e, aVar.f96628a));
        } catch (Exception e7) {
            defpackage.a.b("[theseus-ugc-UgcDmQoeComponent$bindToView$2-onClickItem] ", N4.a.a("e: ", e7), "UgcDmQoeComponent$bindToView$2-onClickItem");
        }
    }

    public final void b() {
        BLog.i("UgcDmQoeComponent$bindToView$2-onLongClickCancel", "[theseus-ugc-UgcDmQoeComponent$bindToView$2-onLongClickCancel] onLongClickCancel");
    }

    public final void c() {
        ValueAnimator valueAnimator = (ValueAnimator) this.f96714b.element;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }
}
