package com.bilibili.mini.player.common.manager;

import com.bilibili.lib.ui.theme.ThemeWatcher;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import uh0.C8734c;
import vh0.AbstractC8809a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/common/manager/d.class */
public final /* synthetic */ class d implements ThemeWatcher.Observer {
    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        AbstractC8809a abstractC8809a;
        C8734c c8734c = e.f66076m;
        if (c8734c != null && (abstractC8809a = c8734c.f127873g) != null) {
            abstractC8809a.r();
        }
        Iterator it = ((ConcurrentHashMap) e.f66071g.f128258b.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            ((AbstractC8809a) ((Map.Entry) it.next()).getValue()).r();
        }
    }
}
