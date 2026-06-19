package com.bilibili.ship.theseus.united.page.view;

import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.foundation.FoundationAlias;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/e.class */
public final class e {
    public static final boolean a(@NotNull d dVar) {
        return dVar.f() > 0 && dVar.f() == BiliAccounts.get(FoundationAlias.getFapp().getApplicationContext()).mid();
    }
}
