package com.bilibili.ogv.misc.timeline;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$pageViewModel$2.class */
public final /* synthetic */ class OgvTimelineFragment$pageViewModel$2 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public OgvTimelineFragment$pageViewModel$2(Object obj) {
        super(1, obj, OgvTimelineFragment.class, "goToUrl", "goToUrl(Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        ((OgvTimelineFragment) ((CallableReference) this).receiver).jf(str);
    }
}
