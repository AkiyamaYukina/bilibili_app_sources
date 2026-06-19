package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.relation.FollowStateManager;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/H.class */
public final class H implements FollowStateManager.FollowChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Staff f101775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StaffsService f101776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef<InterfaceC6365b> f101777c;

    public H(Staff staff, StaffsService staffsService, Ref.ObjectRef<InterfaceC6365b> objectRef) {
        this.f101775a = staff;
        this.f101776b = staffsService;
        this.f101777c = objectRef;
    }

    @Override // com.bilibili.relation.FollowStateManager.FollowChangeListener
    public final void onFollowChange(boolean z6) {
        Staff staff = this.f101775a;
        long j7 = staff.f101786a;
        StaffsService.a(staff, this.f101776b, this.f101777c, j7, Boolean.valueOf(z6));
    }
}
