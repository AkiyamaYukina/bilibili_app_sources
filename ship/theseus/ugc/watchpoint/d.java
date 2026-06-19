package com.bilibili.ship.theseus.ugc.watchpoint;

import androidx.lifecycle.Observer;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/d.class */
public final /* synthetic */ class d implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchPointLayerRepository f98586a;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f98586a.f98573b.tryEmit((List) obj);
    }
}
