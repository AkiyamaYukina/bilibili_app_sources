package com.bilibili.tgwt.im.ui;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bilibili.app.gemini.ui.UIComponent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/x.class */
public final class x extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TogetherWatchChangeRoomFragment f111328a;

    public x(TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment) {
        this.f111328a = togetherWatchChangeRoomFragment;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        UIComponent<?> uIComponent = this.f111328a.f111279e.get(i7);
        return ((uIComponent instanceof com.bilibili.tgwt.square.i) || (uIComponent instanceof com.bilibili.tgwt.square.b) || (uIComponent instanceof com.bilibili.tgwt.square.n) || (uIComponent instanceof com.bilibili.tgwt.square.l) || (uIComponent instanceof com.bilibili.tgwt.square.u) || (uIComponent instanceof com.bilibili.tgwt.square.y)) ? 2 : 1;
    }
}
