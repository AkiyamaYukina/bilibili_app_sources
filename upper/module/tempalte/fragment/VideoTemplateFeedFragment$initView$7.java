package com.bilibili.upper.module.tempalte.fragment;

import II0.s;
import KI0.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/fragment/VideoTemplateFeedFragment$initView$7.class */
final /* synthetic */ class VideoTemplateFeedFragment$initView$7 extends FunctionReferenceImpl implements Function0<Boolean> {
    public VideoTemplateFeedFragment$initView$7(Object obj) {
        super(0, obj, VideoTemplateFeedFragment.class, "isCurrentFragment", "isCurrentFragment()Z", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Boolean m10691invoke() {
        VideoTemplateFeedFragment videoTemplateFeedFragment = (VideoTemplateFeedFragment) ((CallableReference) this).receiver;
        d dVar = (d) videoTemplateFeedFragment.f113968o.getValue();
        int i7 = videoTemplateFeedFragment.f113958d;
        s sVar = dVar.f12773a;
        return Boolean.valueOf(sVar != null ? ((Boolean) sVar.invoke(Integer.valueOf(i7))).booleanValue() : false);
    }
}
