package com.bilibili.ogv.misc.timeline;

import com.bilibili.lib.neuron.api.Neurons;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$pageViewModel$3.class */
public final /* synthetic */ class OgvTimelineFragment$pageViewModel$3 extends FunctionReferenceImpl implements Function0<Unit> {
    public OgvTimelineFragment$pageViewModel$3(Object obj) {
        super(0, obj, OgvTimelineFragment.class, "goToMyFollow", "goToMyFollow()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7409invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7409invoke() {
        OgvTimelineFragment ogvTimelineFragment = (OgvTimelineFragment) ((CallableReference) this).receiver;
        ogvTimelineFragment.getClass();
        if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
            ogvTimelineFragment.jf("activity://main/login/");
        } else {
            ogvTimelineFragment.jf("bilibili://main/favorite?tab=bangumi");
            Neurons.reportClick(false, G.p.a(ogvTimelineFragment.f69434c, ".myfollow.0.click"), MapsKt.emptyMap());
        }
    }
}
