package com.bilibili.moduleservice.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/MainCommonService.class */
public interface MainCommonService {
    static /* synthetic */ boolean addToWatchLater$default(MainCommonService mainCommonService, Activity activity, String str, String str2, String str3, int i7, boolean z6, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToWatchLater");
        }
        if ((i9 & 16) != 0) {
            i7 = 0;
        }
        if ((i9 & 32) != 0) {
            z6 = true;
        }
        if ((i9 & 64) != 0) {
            i8 = 0;
        }
        return mainCommonService.addToWatchLater(activity, str, str2, str3, i7, z6, i8);
    }

    static /* synthetic */ boolean addToWatchLater$default(MainCommonService mainCommonService, Fragment fragment, String str, String str2, String str3, int i7, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addToWatchLater");
        }
        if ((i9 & 16) != 0) {
            i7 = 0;
        }
        if ((i9 & 32) != 0) {
            i8 = 0;
        }
        return mainCommonService.addToWatchLater(fragment, str, str2, str3, i7, i8);
    }

    static /* synthetic */ boolean batchAddToWatchLater$default(MainCommonService mainCommonService, Activity activity, String str, String str2, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: batchAddToWatchLater");
        }
        if ((i8 & 8) != 0) {
            i7 = 0;
        }
        return mainCommonService.batchAddToWatchLater(activity, str, str2, i7);
    }

    static /* synthetic */ void showModifyNicknameDialog$default(MainCommonService mainCommonService, Context context, String str, String str2, String str3, h hVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showModifyNicknameDialog");
        }
        if ((i7 & 2) != 0) {
            str = "";
        }
        if ((i7 & 8) != 0) {
            str3 = "";
        }
        mainCommonService.showModifyNicknameDialog(context, str, str2, str3, hVar);
    }

    static /* synthetic */ Object showNotificationSettingDialogSuspend$suspendImpl(MainCommonService mainCommonService, Activity activity, String str, Continuation<? super Boolean> continuation) {
        return mainCommonService.showNotificationSettingDialogSuspend(activity, str, null, continuation);
    }

    boolean addToWatchLater(@Nullable Activity activity, @Nullable String str, @Nullable String str2, @NotNull String str3, int i7, boolean z6, int i8);

    boolean addToWatchLater(@Nullable Fragment fragment, @Nullable String str, @Nullable String str2, @NotNull String str3, int i7, int i8);

    @Deprecated(message = "Use addToWatchLater instead.")
    boolean addWatchLater(@Nullable Context context, @Nullable String str, @Nullable String str2);

    boolean askFloatWindowPermission(@Nullable Context context);

    @Nullable
    Object awaitSystemPushDialogResult(@NotNull Continuation<? super Unit> continuation);

    boolean batchAddToWatchLater(@Nullable Activity activity, @Nullable String str, @NotNull String str2, int i7);

    boolean changeNightMode(@Nullable Context context, boolean z6);

    void changeTeenagersModeStatus(boolean z6);

    @Deprecated(message = "业务方不应该判断是否开启推送，应该无脑调showNotificationSettingDialogSuspend")
    default boolean checkNotification(@Nullable Activity activity, @Nullable String str) {
        return true;
    }

    void checkUpdate(@Nullable Activity activity);

    @Nullable
    Object getCheeseThemeSwitch();

    @NotNull
    JSONObject getFeedbackParams(@NotNull Context context);

    @Nullable
    Intent getFloatWindowSizeIntent(@Nullable Context context);

    @Nullable
    Intent getFreeDataEntranceActivityIntent(@Nullable Context context);

    @Nullable
    Object getLocation(@Nullable Context context, int i7, boolean z6);

    @NotNull
    String getSearchEasterEggUrl(@Nullable String str);

    @Nullable
    String getSuperMenuTitle(@Nullable String str);

    @NotNull
    Pair<Long, Long> getVideoCacheVolume(@Nullable Context context);

    void gotoCheesePlayerFeedBack(@Nullable Context context, @Nullable String str, @Nullable Long l7, @Nullable Long l8, @Nullable Long l9, @Nullable String str2, @Nullable String str3);

    boolean isAbandonCustomDir();

    boolean isBangumiAutoPlay(@Nullable Context context);

    boolean isDownloadMediaSourceUseDolby();

    boolean isNightTheme();

    boolean isSplashModLoaded();

    boolean isTeenagerModeEnable();

    boolean isUserNewUploadImageApi();

    void launchInit(@Nullable Context context);

    int obtainDownloadSourceQuality();

    void removeCustomTransfered(@Nullable Context context);

    @Deprecated(message = "use showNotificationSettingDialogSuspend")
    void removeNotificationSettingDialogInDialogQueue(@Nullable String str);

    void resetHdPreference(@Nullable Context context, @NotNull Fragment fragment);

    void resetPreference(@Nullable Context context);

    @Nullable
    Object saveImage(@Nullable Context context, boolean z6, @Nullable String str, @Nullable String str2);

    boolean setDownloadMediaSourceUseDolby(@Nullable Context context, boolean z6);

    boolean setDownloadSourceQuality(@Nullable Context context, int i7);

    void showAuthorityDialog(@Nullable Activity activity, @Nullable String str, int i7);

    void showModifyNicknameDialog(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable h hVar);

    default void showNotificationSettingDialog(@Nullable Context context, @Nullable String str) {
        showNotificationSettingDialog(context, str, null);
    }

    void showNotificationSettingDialog(@Nullable Context context, @Nullable String str, @Nullable String str2);

    @Nullable
    Object showNotificationSettingDialogSuspend(@NotNull Activity activity, @NotNull String str, @Nullable String str2, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    default Object showNotificationSettingDialogSuspend(@NotNull Activity activity, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        return showNotificationSettingDialogSuspend$suspendImpl(this, activity, str, continuation);
    }

    @Deprecated(message = "use showNotificationSettingDialogSuspend")
    void showPushSettingDialog(@Nullable Context context, @NotNull String str, @Nullable String str2);

    void uploadFeedbackLog(@NotNull Context context, @NotNull JSONObject jSONObject, @NotNull Function1<? super JSONObject, Unit> function1);
}
