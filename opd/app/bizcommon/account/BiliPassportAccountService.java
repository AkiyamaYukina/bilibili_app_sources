package com.bilibili.opd.app.bizcommon.account;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.AccountException;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.router.Router;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.opd.app.core.accountservice.AccountObserver;
import com.bilibili.opd.app.core.accountservice.AccountTopic;
import com.bilibili.opd.app.core.accountservice.OAuthAccountService;
import fm0.C7128a;
import vn0.C8838b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/account/BiliPassportAccountService.class */
public class BiliPassportAccountService implements OAuthAccountService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliAccounts f73463a;

    public BiliPassportAccountService(Context context) {
        this.f73463a = BiliAccounts.get(context);
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    @Nullable
    public C8838b getAccessToken() {
        BiliAccounts biliAccounts = this.f73463a;
        if (biliAccounts.getAccessKey() == null) {
            return null;
        }
        long jMid = biliAccounts.mid();
        String accessKey = biliAccounts.getAccessKey();
        biliAccounts.getTokenExpires();
        return new C8838b(jMid, accessKey);
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public long getAccessTokenMid() {
        return this.f73463a.mid();
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    @Nullable
    public C7128a getLocalAccount() {
        AccountInfo accountInfoFromCache = BiliAccountInfo.get().getAccountInfoFromCache();
        if (accountInfoFromCache == null) {
            return null;
        }
        return new C7128a(accountInfoFromCache);
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public boolean isSignedIn() {
        return this.f73463a.isLogin();
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void redirectSignInPage(Context context, Bundle bundle, int i7) {
        Router.RouterProxy routerProxyWith = Router.global().with(context);
        if (i7 != -1) {
            routerProxyWith.forResult(i7);
        }
        if (!Activity.class.isInstance(context)) {
            routerProxyWith.add(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
        }
        routerProxyWith.open("activity://main/login/");
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    @Nullable
    public C7128a refreshAccount() {
        try {
            AccountInfo accountInfoRequestForMyAccountInfo = BiliAccountInfo.get().requestForMyAccountInfo();
            if (accountInfoRequestForMyAccountInfo == null) {
                return null;
            }
            return new C7128a(accountInfoRequestForMyAccountInfo);
        } catch (AccountException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void signIn(String str, String str2, String str3) throws AccountException {
        this.f73463a.loginWithVerify(str, str2, str3);
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void signOut() throws AccountException {
        this.f73463a.logout("BiliPassportAccountService_signOut");
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void subscribe(AccountObserver accountObserver, AccountTopic... accountTopicArr) {
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void subscribe(AccountTopic accountTopic, AccountObserver accountObserver) {
        AccountTopic accountTopic2 = AccountTopic.SIGN_IN;
        BiliAccounts biliAccounts = this.f73463a;
        if (accountTopic == accountTopic2) {
            biliAccounts.subscribe(accountObserver, new Topic[]{Topic.SIGN_IN, Topic.ACCOUNT_SWITCH});
        } else {
            biliAccounts.subscribe(accountTopic.convert(), accountObserver);
        }
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void subscribeAll(AccountObserver accountObserver) {
        this.f73463a.subscribeAllWithSwitch(accountObserver);
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void unsubscribe(AccountObserver accountObserver, AccountTopic... accountTopicArr) {
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void unsubscribe(AccountTopic accountTopic, AccountObserver accountObserver) {
        AccountTopic accountTopic2 = AccountTopic.SIGN_IN;
        BiliAccounts biliAccounts = this.f73463a;
        if (accountTopic == accountTopic2) {
            biliAccounts.unsubscribe(accountObserver, new Topic[]{Topic.SIGN_IN, Topic.ACCOUNT_SWITCH});
        } else {
            biliAccounts.unsubscribe(accountTopic.convert(), accountObserver);
        }
    }

    @Override // com.bilibili.opd.app.core.accountservice.OAuthAccountService
    public void unsubscribeAll(AccountObserver accountObserver) {
        this.f73463a.unsubscribeAllWithSwitch(accountObserver);
    }
}
