package com.bilibili.search2.utils;

import android.content.Context;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.account.AccountService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/x.class */
public final class x {
    public static float a(float f7, Context context) {
        return (com.bilibili.search2.component.e.e(ScreenUtil.getScreenWidth(context), context) - ListExtentionsKt.toPx((8 * f7) + ((com.bilibili.search2.component.e.b(context).f86404e * 2) + 8))) / f7;
    }

    public static void b(Context context) {
        AccountService accountService;
        if (context == null || (accountService = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default")) == null) {
            return;
        }
        accountService.bindPhone(context);
    }
}
