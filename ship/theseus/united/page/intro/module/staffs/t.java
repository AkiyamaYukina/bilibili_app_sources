package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/t.class */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StaffsNewComponent f101896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f101897b;

    public t(StaffsNewComponent staffsNewComponent, RecyclerView recyclerView) {
        this.f101896a = staffsNewComponent;
        this.f101897b = recyclerView;
    }

    public final void a() {
        StaffsNewComponent staffsNewComponent = this.f101896a;
        for (Staff staff : staffsNewComponent.f101801a.f101860a.f101855y) {
            StaffsNewComponent.FollowButtonState followButtonState = staffsNewComponent.f101810k.get(Long.valueOf(staff.f101786a));
            StaffsNewComponent.FollowButtonState followButtonState2 = StaffsNewComponent.FollowButtonState.CHANGE_TO_HIDDEN;
            long j7 = staff.f101786a;
            if (followButtonState != followButtonState2) {
                staffsNewComponent.f101810k.remove(Long.valueOf(j7));
            } else if (!staff.c()) {
                staffsNewComponent.f101810k.put(Long.valueOf(j7), StaffsNewComponent.FollowButtonState.CHANGE_TO_SHOW);
            }
        }
        StaffsNewComponent.c(staffsNewComponent, this.f101897b);
    }

    public final void b(int i7, long j7) {
        RecyclerView recyclerView = this.f101897b;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            StaffsNewComponent staffsNewComponent = this.f101896a;
            if (iFindFirstVisibleItemPosition > i7 || i7 > iFindLastVisibleItemPosition) {
                staffsNewComponent.f101810k.put(Long.valueOf(j7), StaffsNewComponent.FollowButtonState.CHANGE_TO_HIDDEN);
            } else {
                staffsNewComponent.f101810k.put(Long.valueOf(j7), StaffsNewComponent.FollowButtonState.ANIMATION);
            }
            StaffsNewComponent.c(staffsNewComponent, recyclerView);
        }
    }
}
