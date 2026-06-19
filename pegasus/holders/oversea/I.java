package com.bilibili.pegasus.holders.oversea;

import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/I.class */
public final class I implements PanelDetachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeCoverSingleV13Holder f77921a;

    public I(LargeCoverSingleV13Holder largeCoverSingleV13Holder) {
        this.f77921a = largeCoverSingleV13Holder;
    }

    public final void onDetach(InlinePanel inlinePanel) {
        LargeCoverSingleV13Holder largeCoverSingleV13Holder = this.f77921a;
        largeCoverSingleV13Holder.C0().resetProgress();
        largeCoverSingleV13Holder.C0().setVisibility(8);
        inlinePanel.removeOnDetachListener(this);
    }
}
