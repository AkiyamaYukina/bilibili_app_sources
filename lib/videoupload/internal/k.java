package com.bilibili.lib.videoupload.internal;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.lib.videoupload.internal.o;
import com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/k.class */
public final /* synthetic */ class k implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f65084a;

    public void a(long j7) {
        l lVar = (l) this.f65084a;
        o.a aVar = lVar.f65089e;
        if (aVar != null) {
            long j8 = j7 - lVar.h;
            if (j8 > 0) {
                synchronized (aVar.f65108a) {
                    o oVar = aVar.f65108a;
                    Thread.currentThread().getName();
                    oVar.f65059d.s();
                    ng0.g gVar = aVar.f65108a.f65059d;
                    synchronized (gVar) {
                        gVar.f124213s += j8;
                        gVar.d();
                    }
                }
            }
        }
        lVar.h = j7;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        KProperty<Object>[] kPropertyArr = ChannelBaikeSelectFragment.f75056t;
        ((ChannelBaikeSelectFragment) this.f65084a).of().L0();
    }
}
