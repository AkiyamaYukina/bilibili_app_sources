package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import com.bilibili.ship.theseus.cheese.biz.intro.attendance.CheeseAttendanceToastService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/u.class */
public final class u implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseAttendanceToastService.a f89347a;

    public u(CheeseAttendanceToastService.a aVar) {
        this.f89347a = aVar;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        this.f89347a.f89282d.invoke();
    }

    public final void onDismiss() {
    }
}
