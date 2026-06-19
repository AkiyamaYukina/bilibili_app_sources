package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.viewbinding.ViewBinding;
import com.bilibili.inline.panel.InlinePanel;
import com.bilibili.inline.panel.listeners.PanelDetachListener;
import wo0.AbstractC8906a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/c.class */
public final class c implements PanelDetachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<AbstractC8906a, ViewBinding, InlinePanel> f75296a;

    public c(d<AbstractC8906a, ViewBinding, InlinePanel> dVar) {
        this.f75296a = dVar;
    }

    public final void onDetach(InlinePanel inlinePanel) {
        this.f75296a.r0(null);
    }
}
