package com.bilibili.moduleservice.account;

import android.app.Activity;
import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/account/AccountService.class */
public interface AccountService {
    void bindPhone(@Nullable Context context);

    @Nullable
    String getAccessToken();

    @Nullable
    String getAvatar();

    @Nullable
    String getBuvid();

    long getMid();

    @Nullable
    String getUserInfo(@Nullable String str);

    @Nullable
    String getUserInfoLegacy();

    @Nullable
    String getUserName();

    boolean isNewVipLabel();

    void logout(@NotNull String str);

    void logoutWithBack(@Nullable Activity activity, @NotNull String str);

    void updateUserInfo();
}
