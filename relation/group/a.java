package com.bilibili.relation.group;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bilibili.api.BiliApiException;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.relation.group.AttentionGroupDialog;
import w8.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/group/a.class */
public final class a extends BiliApiDataCallback<Void> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AttentionGroupDialog f86092c;

    public a(AttentionGroupDialog attentionGroupDialog, boolean z6) {
        this.f86092c = attentionGroupDialog;
        this.f86091b = z6;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        AttentionGroupDialog attentionGroupDialog = this.f86092c;
        return attentionGroupDialog.isStateSaved() || attentionGroupDialog.isDetached() || attentionGroupDialog.isRemoving() || attentionGroupDialog.p3() == null;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(@Nullable Void r62) {
        MainCommonService mainCommonService;
        AttentionGroupDialog attentionGroupDialog = this.f86092c;
        ToastHelper.showToast(attentionGroupDialog.getContext(), 2131847618, 0);
        attentionGroupDialog.dismiss();
        boolean z6 = this.f86091b;
        if (z6 && attentionGroupDialog.getContext() != null && (mainCommonService = (MainCommonService) d.a(BLRouter.INSTANCE, MainCommonService.class, "default")) != null) {
            mainCommonService.showNotificationSettingDialog(attentionGroupDialog.p3(), "4", attentionGroupDialog.f86077j);
        }
        AttentionGroupDialog.b bVar = attentionGroupDialog.f86083p;
        if (bVar != null) {
            bVar.a(z6);
        }
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        String message = th instanceof BiliApiException ? th.getMessage() : null;
        boolean zIsEmpty = TextUtils.isEmpty(message);
        AttentionGroupDialog attentionGroupDialog = this.f86092c;
        if (zIsEmpty) {
            message = attentionGroupDialog.getString(2131847644);
        }
        ToastHelper.showToastShort(attentionGroupDialog.getContext(), message);
        attentionGroupDialog.dismiss();
    }
}
