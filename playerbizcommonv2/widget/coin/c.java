package com.bilibili.playerbizcommonv2.widget.coin;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import bolts.Task;
import com.bilibili.api.BiliApiException;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.playerbizcommonv2.widget.coin.a;
import dq0.d;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/coin/c.class */
public final class c implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f82440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82441b;

    public c(a aVar, int i7) {
        this.f82440a = aVar;
        this.f82441b = i7;
    }

    @Override // dq0.d.a
    public final void a(String str, String str2, String str3, boolean z6, boolean z7) {
        a aVar = this.f82440a;
        a.h(aVar, aVar.getMContext().getString(2131845739));
        a.b bVar = aVar.h;
        if (bVar != null) {
            bVar.a(this.f82441b, z7);
        }
        Task.callInBackground(b.f82439a);
    }

    @Override // dq0.d.a
    public final boolean isCancel() {
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(this.f82440a.getMContext());
        if (fragmentActivityFindFragmentActivityOrNull == null) {
            return true;
        }
        boolean z6 = true;
        if (!fragmentActivityFindFragmentActivityOrNull.isFinishing()) {
            z6 = fragmentActivityFindFragmentActivityOrNull.isDestroyed();
        }
        return z6;
    }

    @Override // dq0.d.a
    public final void onRequestFailed(Throwable th) {
        String str;
        boolean z6 = th instanceof BiliApiException;
        a aVar = this.f82440a;
        if (z6) {
            BiliApiException biliApiException = (BiliApiException) th;
            String message = biliApiException.getMessage();
            str = message;
            if (biliApiException.mCode == -110) {
                aVar.getClass();
                AccountService accountService = (AccountService) w8.d.a(BLRouter.INSTANCE, AccountService.class, "default");
                str = message;
                if (accountService != null) {
                    accountService.bindPhone(aVar.getMContext());
                    str = message;
                }
            }
        } else {
            str = null;
        }
        String string = aVar.getMContext().getString(2131845422);
        String str2 = str;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        }
        a.h(aVar, string + str2);
    }

    @Override // dq0.d.a
    public final void onResponseIllegal() {
    }
}
