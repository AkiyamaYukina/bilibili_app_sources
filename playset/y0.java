package com.bilibili.playset;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.main.MainCommonService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/y0.class */
public final class y0 {
    public static boolean a(int i7) {
        return i7 == 61001 || i7 == 61002;
    }

    public static void b(@NonNull Activity activity, int i7, @NonNull String str) {
        MainCommonService mainCommonService = (MainCommonService) BLRouter.INSTANCE.get(MainCommonService.class, "default");
        if (mainCommonService != null) {
            mainCommonService.showAuthorityDialog(activity, str, i7);
        }
    }
}
