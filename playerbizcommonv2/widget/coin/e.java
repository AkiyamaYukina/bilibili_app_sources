package com.bilibili.playerbizcommonv2.widget.coin;

import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/coin/e.class */
public final class e implements Continuation<Unit, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f82442a;

    public e(a aVar) {
        this.f82442a = aVar;
    }

    @Override // bolts.Continuation
    public final Unit then(Task<Unit> task) {
        if (task != null && !task.isCancelled() && !task.isFaulted()) {
            a aVar = this.f82442a;
            if (aVar.isShowing()) {
                AccountInfo accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache();
                String string = (accountInfoFromCache != null ? Float.valueOf(accountInfoFromCache.getCoins()) : 0).toString();
                IPlayerSettingService iPlayerSettingService = aVar.f82427p;
                IPlayerSettingService iPlayerSettingService2 = iPlayerSettingService;
                if (iPlayerSettingService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerSettingService");
                    iPlayerSettingService2 = null;
                }
                String string2 = iPlayerSettingService2.getPlayerParamsConfig().getTheme() == 3 ? aVar.getMContext().getString(2131857205, string) : aVar.getMContext().getString(2131857206, string);
                TextView textView = aVar.f82414b;
                if (textView != null) {
                    textView.setText(HtmlCompat.fromHtml(string2, 0));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
