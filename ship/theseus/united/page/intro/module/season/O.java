package com.bilibili.ship.theseus.united.page.intro.module.season;

import android.content.DialogInterface;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AlertDialog;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlinx.coroutines.CoroutineScopeKt;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/O.class */
public final class O extends BiliApiDataCallback<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnitedSeasonPanelService f101497b;

    public O(UnitedSeasonPanelService unitedSeasonPanelService) {
        this.f101497b = unitedSeasonPanelService;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        return !CoroutineScopeKt.isActive(this.f101497b.f101591a);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    @Override // com.bilibili.okretro.BiliApiDataCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDataSuccess(com.alibaba.fastjson.JSONObject r9) {
        /*
            r8 = this;
            r0 = r9
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0
            r13 = r0
            java.lang.String r0 = ""
            r12 = r0
            r0 = r13
            if (r0 == 0) goto L1d
            r0 = r13
            java.lang.String r1 = "toast_msg"
            java.lang.String r0 = r0.getString(r1)
            r11 = r0
            r0 = r11
            r9 = r0
            r0 = r11
            if (r0 != 0) goto L20
        L1d:
            java.lang.String r0 = ""
            r9 = r0
        L20:
            r0 = r12
            r11 = r0
            r0 = r13
            if (r0 == 0) goto L3a
            r0 = r13
            java.lang.String r1 = "jump_link"
            java.lang.String r0 = r0.getString(r1)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L3a
            r0 = r12
            r11 = r0
            goto L3a
        L3a:
            r0 = r8
            com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService r0 = r0.f101497b
            r13 = r0
            r0 = r13
            com.bilibili.ship.theseus.united.page.intro.module.season.Y r0 = r0.f101596f
            boolean r0 = r0.a()
            if (r0 != 0) goto L53
            r0 = 2131845692(0x7f11623c, float:1.9324812E38)
            com.bilibili.ship.theseus.united.utils.q.b(r0)
            goto Lab
        L53:
            r0 = r9
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            r10 = r0
            r0 = r13
            androidx.activity.ComponentActivity r0 = r0.f101592b
            r12 = r0
            r0 = r10
            if (r0 != 0) goto L87
            r0 = r11
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L6d
            goto L87
        L6d:
            r0 = r9
            r1 = r12
            r2 = 2131851606(0x7f117956, float:1.9336807E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = r12
            com.bilibili.ship.theseus.united.page.intro.module.season.P r3 = new com.bilibili.ship.theseus.united.page.intro.module.season.P
            r4 = r3
            r5 = r11
            r6 = r13
            r4.<init>(r5, r6)
            com.bilibili.playset.widget.favorite.FavSnackBarUtil.b(r0, r1, r2, r3)
            goto L8c
        L87:
            r0 = 2131846661(0x7f116605, float:1.9326778E38)
            com.bilibili.ship.theseus.united.utils.q.b(r0)
        L8c:
            com.bilibili.lib.blrouter.BLRouter r0 = com.bilibili.lib.blrouter.BLRouter.INSTANCE
            java.lang.Class<com.bilibili.moduleservice.main.MainCommonService> r1 = com.bilibili.moduleservice.main.MainCommonService.class
            r2 = 0
            r3 = 2
            r4 = 0
            java.lang.Object r0 = com.bilibili.lib.blrouter.BLRouter.get$default(r0, r1, r2, r3, r4)
            com.bilibili.moduleservice.main.MainCommonService r0 = (com.bilibili.moduleservice.main.MainCommonService) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Lab
            r0 = r9
            r1 = r12
            java.lang.String r2 = "20"
            java.lang.String r3 = "united.player-video-detail.drama-float.button"
            r0.showNotificationSettingDialog(r1, r2, r3)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.season.O.onDataSuccess(java.lang.Object):void");
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        int i7;
        final UnitedSeasonPanelService unitedSeasonPanelService = this.f101497b;
        unitedSeasonPanelService.getClass();
        boolean z6 = th instanceof BiliApiException;
        ComponentActivity componentActivity = unitedSeasonPanelService.f101592b;
        if (z6 && ((i7 = ((BiliApiException) th).mCode) == -2 || i7 == -101)) {
            PlayerRouteUris.Routers.INSTANCE.logout(componentActivity, "UgcSeasonPanelService_handleSubscribeError");
            return;
        }
        if (z6) {
            int i8 = ((BiliApiException) th).mCode;
            String message = th.getMessage();
            if (message != null && message.length() != 0) {
                com.bilibili.ship.theseus.united.utils.q.c(message);
            } else if (i8 == -106) {
                unitedSeasonPanelService.b();
                AlertDialog alertDialogCreate = new AlertDialog.Builder(componentActivity).setMessage(componentActivity.getString(2131846926)).setNegativeButton(2131841464, (DialogInterface.OnClickListener) null).setPositiveButton(2131847182, new DialogInterface.OnClickListener(unitedSeasonPanelService) { // from class: com.bilibili.ship.theseus.united.page.intro.module.season.F

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UnitedSeasonPanelService f101471a;

                    {
                        this.f101471a = unitedSeasonPanelService;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        UnitedSeasonPanelService unitedSeasonPanelService2 = this.f101471a;
                        AccountService accountService = (AccountService) BLRouter.INSTANCE.get(AccountService.class, "default");
                        if (accountService != null) {
                            accountService.bindPhone(unitedSeasonPanelService2.f101592b);
                        }
                        dialogInterface.cancel();
                    }
                }).create();
                unitedSeasonPanelService.f101608s = alertDialogCreate;
                if (alertDialogCreate != null) {
                    alertDialogCreate.show();
                }
            } else if (i8 != -102) {
                com.bilibili.ship.theseus.united.utils.q.b(2131841734);
            } else {
                unitedSeasonPanelService.b();
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(componentActivity).setMessage(componentActivity.getString(2131846723)).create();
                unitedSeasonPanelService.f101608s = alertDialogCreate2;
                if (alertDialogCreate2 != null) {
                    alertDialogCreate2.show();
                }
            }
        } else {
            com.bilibili.ship.theseus.united.utils.q.b(2131841734);
        }
        unitedSeasonPanelService.f101596f.b(!r0.a());
    }
}
