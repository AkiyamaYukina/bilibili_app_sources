package com.bilibili.pegasus.holders;

import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/H.class */
public final class H implements PanelDetachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeCoverSingleV7Holder f77525a;

    public H(LargeCoverSingleV7Holder largeCoverSingleV7Holder) {
        this.f77525a = largeCoverSingleV7Holder;
    }

    public final void onDetach(InlinePanel inlinePanel) {
        LargeCoverSingleV7Holder largeCoverSingleV7Holder = this.f77525a;
        largeCoverSingleV7Holder.C0().resetProgress();
        largeCoverSingleV7Holder.C0().setVisibility(8);
        inlinePanel.removeOnDetachListener(this);
    }
}
