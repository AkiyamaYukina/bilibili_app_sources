package com.bilibili.pegasus.holders;

import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/l0.class */
public final class C5669l0 implements PanelDetachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeCoverV7Holder f77891a;

    public C5669l0(LargeCoverV7Holder largeCoverV7Holder) {
        this.f77891a = largeCoverV7Holder;
    }

    public final void onDetach(InlinePanel inlinePanel) {
        LargeCoverV7Holder largeCoverV7Holder = this.f77891a;
        largeCoverV7Holder.C0().resetProgress();
        largeCoverV7Holder.C0().setVisibility(8);
        inlinePanel.removeOnDetachListener(this);
    }
}
