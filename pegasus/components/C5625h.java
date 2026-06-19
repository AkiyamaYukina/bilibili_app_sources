package com.bilibili.pegasus.components;

import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusVisibleState;
import com.bilibili.pegasus.data.ToastConfig;
import com.bilibili.pegasus.vm.C5769d;
import com.bilibili.pegasus.vm.PegasusViewModel;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/h.class */
public final class C5625h implements com.bilibili.pegasus.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasePegasusComponent f76264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CommonConfigComponent f76265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ToastConfig f76266c;

    public C5625h(BasePegasusComponent basePegasusComponent, CommonConfigComponent commonConfigComponent, ToastConfig toastConfig) {
        this.f76264a = basePegasusComponent;
        this.f76265b = commonConfigComponent;
        this.f76266c = toastConfig;
    }

    /* JADX INFO: renamed from: onVisibleStateChanged-9haIX0A, reason: not valid java name */
    public final void m8023onVisibleStateChanged9haIX0A(int i7, int i8) {
        if (PegasusVisibleState.isVisible-impl(i8)) {
            CommonConfigComponent commonConfigComponent = this.f76265b;
            PromoToast.showTopToast(commonConfigComponent.getContext(), this.f76266c.getToastMessage());
            PegasusViewModel pegasusViewModel = (PegasusViewModel) commonConfigComponent.f75718l.getValue();
            pegasusViewModel.getClass();
            pegasusViewModel.z(pegasusViewModel, new C5769d(0));
            this.f76264a.removeVisibleStateChangeListener(this);
        }
    }
}
