package com.bilibili.ship.theseus.united.page.intro;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.united.widget.UnitedRecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/g.class */
public final class g {
    public static final void a(@NotNull IntroRecycleViewService introRecycleViewService, int i7, int i8) {
        UnitedRecyclerView unitedRecyclerView = introRecycleViewService.f100039e;
        if (unitedRecyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = unitedRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        unitedRecyclerView.stopScroll();
        linearLayoutManager.scrollToPositionWithOffset(i7, i8);
    }
}
