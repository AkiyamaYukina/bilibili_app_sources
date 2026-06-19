package com.bilibili.lib.tribe.core.internal3.bundle;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleManager3$doBoostrapInit$initMillis$1$1$5.class */
public final /* synthetic */ class BundleManager3$doBoostrapInit$initMillis$1$1$5 extends FunctionReferenceImpl implements Function0<Boolean> {
    public BundleManager3$doBoostrapInit$initMillis$1$1$5(Object obj) {
        super(0, obj, BundleManager3.class, "ensureLatest", "ensureLatest()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m6868invoke() {
        return Boolean.valueOf(((BundleManager3) ((CallableReference) this).receiver).m());
    }
}
