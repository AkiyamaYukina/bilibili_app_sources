package com.bilibili.ogv.misc.topicplaylist;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/topicplaylist/h.class */
public final class h extends Nl0.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavoTopicPlayListSubFragment f69658b;

    public h(FavoTopicPlayListSubFragment favoTopicPlayListSubFragment) {
        this.f69658b = favoTopicPlayListSubFragment;
    }

    @Override // Nl0.e
    public final void onLastItemVisible() {
        c cVar;
        FavoTopicPlayListSubFragment favoTopicPlayListSubFragment = this.f69658b;
        if (!favoTopicPlayListSubFragment.h) {
            c cVar2 = favoTopicPlayListSubFragment.f69621d;
            if ((cVar2 != null ? cVar2.h.size() : 0) > 0 && (cVar = favoTopicPlayListSubFragment.f69621d) != null) {
                cVar.showFooterEmpty();
            }
        }
        if (favoTopicPlayListSubFragment.h) {
            favoTopicPlayListSubFragment.kf(true);
        }
    }
}
