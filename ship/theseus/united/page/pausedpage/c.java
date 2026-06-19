package com.bilibili.ship.theseus.united.page.pausedpage;

import androidx.compose.foundation.text.selection.C3751q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/c.class */
public final class c<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102204a;

    public c(PausedPageService pausedPageService) {
        this.f102204a = pausedPageService;
    }

    public final Object emit(Object obj, Continuation continuation) {
        Long l7 = (Long) obj;
        this.f102204a.y(C3751q.a(l7 != null ? l7.longValue() : 0L, "episode_changed cid="));
        return Unit.INSTANCE;
    }
}
