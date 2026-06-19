package com.bilibili.ogv.misc.timeline.ui;

import androidx.compose.runtime.MutableState;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/n.class */
public final class n implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BangumiTimeline f69582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState<Boolean> f69583b;

    public n(BangumiTimeline bangumiTimeline, MutableState<Boolean> mutableState) {
        this.f69582a = bangumiTimeline;
        this.f69583b = mutableState;
    }

    public final Object invoke() {
        BangumiTimeline bangumiTimeline = this.f69582a;
        boolean z6 = !bangumiTimeline.f69526f;
        bangumiTimeline.f69526f = z6;
        this.f69583b.setValue(Boolean.valueOf(z6));
        return Unit.INSTANCE;
    }
}
