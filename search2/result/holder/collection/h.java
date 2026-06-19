package com.bilibili.search2.result.holder.collection;

import com.bilibili.app.comm.list.common.inline.view.InlineGestureSeekBarContainer;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/collection/h.class */
public final class h implements PanelDetachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f88076a;

    public h(g gVar) {
        this.f88076a = gVar;
    }

    public final void onDetach(InlinePanel inlinePanel) {
        InlineGestureSeekBarContainer inlineGestureSeekBarContainerE = this.f88076a.e();
        inlineGestureSeekBarContainerE.resetProgress();
        inlineGestureSeekBarContainerE.setVisibility(4);
        inlinePanel.removeOnDetachListener(this);
    }
}
