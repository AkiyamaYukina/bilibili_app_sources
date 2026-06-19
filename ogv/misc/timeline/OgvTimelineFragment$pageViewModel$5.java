package com.bilibili.ogv.misc.timeline;

import com.bilibili.base.SharedPreferencesHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yk0.C9061a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$pageViewModel$5.class */
public final /* synthetic */ class OgvTimelineFragment$pageViewModel$5 extends FunctionReferenceImpl implements Function0<Unit> {
    public OgvTimelineFragment$pageViewModel$5(Object obj) {
        super(0, obj, OgvTimelineFragment.class, "closeTimelineNightTip", "closeTimelineNightTip()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7411invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7411invoke() {
        OgvTimelineFragment ogvTimelineFragment = (OgvTimelineFragment) ((CallableReference) this).receiver;
        new SharedPreferencesHelper(ogvTimelineFragment.getContext()).setBoolean("pref_bangumi_timeline_guide_text_closed", true);
        C9061a c9061a = ogvTimelineFragment.f69438g;
        c9061a.f129726n.setValue(Boolean.FALSE);
    }
}
