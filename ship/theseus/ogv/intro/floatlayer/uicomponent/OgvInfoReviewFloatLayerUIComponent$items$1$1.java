package com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent;

import com.bilibili.ship.theseus.ogv.intro.floatlayer.m;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/uicomponent/OgvInfoReviewFloatLayerUIComponent$items$1$1.class */
final /* synthetic */ class OgvInfoReviewFloatLayerUIComponent$items$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public OgvInfoReviewFloatLayerUIComponent$items$1$1(Object obj) {
        super(0, obj, s.class, "scrollToTop", "scrollToTop()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m9026invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9026invoke() {
        s sVar = (s) ((CallableReference) this).receiver;
        sVar.getClass();
        Pair<Integer, Integer> pair = new Pair<>(0, 0);
        m mVar = sVar.h;
        if (Intrinsics.areEqual(pair, mVar.f92950b)) {
            return;
        }
        mVar.f92950b = pair;
        mVar.notifyPropertyChanged(528);
    }
}
