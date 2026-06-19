package com.bilibili.ogv.misc.timeline;

import com.bilibili.base.SharedPreferencesHelper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$pageViewModel$6.class */
public final /* synthetic */ class OgvTimelineFragment$pageViewModel$6 extends FunctionReferenceImpl implements Function0<Boolean> {
    public OgvTimelineFragment$pageViewModel$6(Object obj) {
        super(0, obj, OgvTimelineFragment.class, "checkShowTimelineNightTipSetting", "checkShowTimelineNightTipSetting()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m7412invoke() {
        return Boolean.valueOf(!new SharedPreferencesHelper(((OgvTimelineFragment) ((CallableReference) this).receiver).getContext()).optBoolean("pref_bangumi_timeline_guide_text_closed", false));
    }
}
