package com.bilibili.ogv.misc.timeline;

import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/e.class */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BangumiTimelineActivity f69447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f69448b;

    public /* synthetic */ e(BangumiTimelineActivity bangumiTimelineActivity, c cVar) {
        this.f69447a = bangumiTimelineActivity;
        this.f69448b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BangumiTimelineActivity bangumiTimelineActivity = this.f69447a;
        c cVar = this.f69448b;
        int i7 = BangumiTimelineActivity.f69394W;
        a.a(bangumiTimelineActivity);
        cVar.dismiss();
    }
}
