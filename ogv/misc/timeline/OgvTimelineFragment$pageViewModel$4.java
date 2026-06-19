package com.bilibili.ogv.misc.timeline;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$pageViewModel$4.class */
public final /* synthetic */ class OgvTimelineFragment$pageViewModel$4 extends FunctionReferenceImpl implements Function0<Unit> {
    public OgvTimelineFragment$pageViewModel$4(Object obj) {
        super(0, obj, OgvTimelineFragment.class, "goToTimelinePreference", "goToTimelinePreference()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7410invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7410invoke() {
        ((OgvTimelineFragment) ((CallableReference) this).receiver).jf("bilibili://pgc/timeline-preference");
    }
}
