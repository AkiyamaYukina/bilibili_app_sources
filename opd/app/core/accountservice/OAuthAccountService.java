package com.bilibili.opd.app.core.accountservice;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.bilibili.lib.accounts.AccountException;
import vn0.C8838b;
import vn0.InterfaceC8837a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/core/accountservice/OAuthAccountService.class */
public interface OAuthAccountService {
    C8838b getAccessToken();

    long getAccessTokenMid();

    @WorkerThread
    /* synthetic */ InterfaceC8837a getLocalAccount();

    boolean isSignedIn();

    void redirectSignInPage(Context context, Bundle bundle, int i7);

    @WorkerThread
    /* synthetic */ InterfaceC8837a refreshAccount();

    @WorkerThread
    /* synthetic */ void signIn(String str, String str2, String str3) throws AccountException;

    @WorkerThread
    /* synthetic */ void signOut() throws AccountException;

    /* synthetic */ void subscribe(AccountObserver accountObserver, AccountTopic... accountTopicArr);

    /* synthetic */ void subscribe(AccountTopic accountTopic, AccountObserver accountObserver);

    /* synthetic */ void subscribeAll(AccountObserver accountObserver);

    /* synthetic */ void unsubscribe(AccountObserver accountObserver, AccountTopic... accountTopicArr);

    /* synthetic */ void unsubscribe(AccountTopic accountTopic, AccountObserver accountObserver);

    /* synthetic */ void unsubscribeAll(AccountObserver accountObserver);
}
