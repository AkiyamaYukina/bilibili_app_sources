package com.bilibili.ship.theseus.ugc.ad;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$onCreateViews$1.class */
final /* synthetic */ class DetailAdService$onCreateViews$1 extends FunctionReferenceImpl implements Function0<Integer> {
    public DetailAdService$onCreateViews$1(Object obj) {
        super(0, obj, DetailAdService.class, "underViewCurrentLocationY", "underViewCurrentLocationY()I", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Integer m9265invoke() {
        int[] iArr = new int[2];
        ((DetailAdService) ((CallableReference) this).receiver).a().getLocationOnScreen(iArr);
        return Integer.valueOf(iArr[1]);
    }
}
