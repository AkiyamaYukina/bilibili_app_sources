package com.bilibili.module.vip.mall;

import com.bilibili.okretro.BiliApiDataCallback;

/* JADX INFO: renamed from: com.bilibili.module.vip.mall.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/b.class */
public final class C5419b extends BiliApiDataCallback<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VipBuyResultDialogViewModel f66248b;

    public C5419b(VipBuyResultDialogViewModel vipBuyResultDialogViewModel) {
        this.f66248b = vipBuyResultDialogViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return !((Boolean) this.f66248b.f66207b.getValue()).booleanValue();
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final /* bridge */ /* synthetic */ void onDataSuccess(Void r32) {
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
    }
}
