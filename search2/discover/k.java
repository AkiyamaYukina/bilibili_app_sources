package com.bilibili.search2.discover;

import Ps0.F;
import com.bilibili.search2.api.SearchReferral;
import com.bilibili.search2.api.SearchSquareType;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/k.class */
public interface k {
    void a(@Nullable List<F> list);

    void b(@Nullable List<SearchReferral.Guess> list);

    void c();

    boolean d();

    void e(@Nullable List<F> list);

    void f(@Nullable List<SearchSquareType> list);

    @Nullable
    List<F> getHistoryList();
}
