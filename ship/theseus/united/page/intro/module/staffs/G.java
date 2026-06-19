package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.app.Application;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.relation.utils.FollowFlowHelper;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/G.class */
public final class G extends FollowFlowHelper.SimpleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StaffsService f101772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Staff f101773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef<InterfaceC6365b> f101774c;

    public G(Staff staff, StaffsService staffsService, Ref.ObjectRef objectRef) {
        this.f101772a = staffsService;
        this.f101773b = staff;
        this.f101774c = objectRef;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isCancel() {
        return !CoroutineScopeKt.isActive(this.f101772a.f101833b);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean isLogin() {
        Application fapp = FoundationAlias.getFapp();
        return sh1.o.b(fapp, fapp.getString(2131846702), (String) null, 28, (String) null);
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowError(Throwable th) {
        Application fapp = FoundationAlias.getFapp();
        Staff staff = this.f101773b;
        long j7 = staff.f101786a;
        Boolean bool = Boolean.FALSE;
        StaffsService.a(staff, this.f101772a, this.f101774c, j7, bool);
        if (!sh1.h.a(th)) {
            return false;
        }
        sh1.o.e(fapp, "StaffsService_onFollowError");
        return true;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onFollowSuccess() {
        this.f101772a.f101836e.i(true);
        Staff staff = this.f101773b;
        long j7 = staff.f101786a;
        Boolean bool = Boolean.TRUE;
        StaffsService staffsService = this.f101772a;
        Ref.ObjectRef<InterfaceC6365b> objectRef = this.f101774c;
        StaffsService.a(staff, staffsService, objectRef, j7, bool);
        InterfaceC6365b interfaceC6365b = (InterfaceC6365b) objectRef.element;
        if (interfaceC6365b == null) {
            return false;
        }
        interfaceC6365b.a();
        return false;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onUnFollowError(Throwable th) {
        Application fapp = FoundationAlias.getFapp();
        Staff staff = this.f101773b;
        long j7 = staff.f101786a;
        Boolean bool = Boolean.FALSE;
        StaffsService.a(staff, this.f101772a, this.f101774c, j7, bool);
        if (!sh1.h.a(th)) {
            return false;
        }
        sh1.o.e(fapp, "StaffsService_onUnFollowError");
        return true;
    }

    @Override // com.bilibili.relation.utils.FollowFlowHelper.SimpleCallback, com.bilibili.relation.utils.FollowFlowHelper.FollowFlowCallback
    public final boolean onUnFollowSuccess() {
        Staff staff = this.f101773b;
        long j7 = staff.f101786a;
        Boolean bool = Boolean.FALSE;
        StaffsService staffsService = this.f101772a;
        Ref.ObjectRef<InterfaceC6365b> objectRef = this.f101774c;
        StaffsService.a(staff, staffsService, objectRef, j7, bool);
        InterfaceC6365b interfaceC6365b = (InterfaceC6365b) objectRef.element;
        if (interfaceC6365b == null) {
            return false;
        }
        interfaceC6365b.a();
        return false;
    }
}
