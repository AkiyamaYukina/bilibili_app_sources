package com.bilibili.ship.theseus.ogv.intro.download.service;

import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/d.class */
public interface d {
    @NotNull
    StateFlow<c> a();

    void d(@NotNull String str);

    boolean e();

    void g(@NotNull List<a> list);
}
