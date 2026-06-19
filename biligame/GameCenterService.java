package com.bilibili.biligame;

import Fp.m;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.bean.GameCenterEntrance;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.biligame.card.GameCardButtonAttribute;
import com.bilibili.biligame.card.GameCardButtonStyle;
import com.bilibili.biligame.card.newcard.present.GameCardButtonPresent;
import com.bilibili.biligame.card2.GameCardButtonPresentV2;
import com.bilibili.biligame.detail.GameDetailLoadCallback;
import com.bilibili.biligame.detail.GameDetailParams;
import com.bilibili.biligame.videocard.GameRetUserCard;
import com.bilibili.common.webview.js.JsbProxy;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameCenterService.class */
public interface GameCenterService {

    @NotNull
    public static final a Companion = a.f62117a;
    public static final int TYPE_AUTO_DOWNLOAD_GAME_CENTER = 2;
    public static final int TYPE_AUTO_DOWNLOAD_MAIN_APP = 1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameCenterService$BookCallback.class */
    public interface BookCallback {
        void onError(@NotNull Throwable th);

        void onResult(@NotNull Bundle bundle);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameCenterService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f62117a = new Object();
    }

    void bookGame(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @Nullable BookCallback bookCallback);

    boolean canHandleSteamWebUrl(@NotNull String str);

    void clearGamePreRes();

    void downloadBookGame(@NotNull Context context, int i7);

    @NotNull
    Map<String, String> getDownloadBookGameParams();

    @NotNull
    LiveData<Integer> getDownloadCounts(@NotNull Context context);

    @NotNull
    default GameCardButton getGameButton(@NotNull Context context, @NotNull GameCardButtonAttribute gameCardButtonAttribute, @NotNull String str) {
        return getGameButton(context, gameCardButtonAttribute, str, "");
    }

    @NotNull
    GameCardButton getGameButton(@NotNull Context context, @NotNull GameCardButtonAttribute gameCardButtonAttribute, @NotNull String str, @NotNull String str2);

    @NotNull
    default GameCardButton getGameButton(@NotNull Context context, @NotNull GameCardButtonStyle gameCardButtonStyle, @NotNull String str) {
        return getGameButton(context, gameCardButtonStyle, str, "");
    }

    @NotNull
    GameCardButton getGameButton(@NotNull Context context, @NotNull GameCardButtonStyle gameCardButtonStyle, @NotNull String str, @NotNull String str2);

    @Nullable
    default GameCardButtonPresent getGameCardButtonPresent(@NotNull Activity activity, @NotNull String str) {
        return getGameCardButtonPresent(activity, str, "");
    }

    @Nullable
    GameCardButtonPresent getGameCardButtonPresent(@NotNull Activity activity, @NotNull String str, @NotNull String str2);

    @Nullable
    GameCardButtonPresentV2 getGameCardButtonPresentV2(@NotNull Activity activity, @NotNull String str, @NotNull String str2);

    @NotNull
    m getGameCenterEntryService(@Nullable List<GameCenterEntrance> list);

    @NotNull
    Fragment getGameDetailFragment(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z6, @Nullable JSONObject jSONObject, @Nullable GameDetailLoadCallback gameDetailLoadCallback);

    @Nullable
    Fragment getGameDetailFragmentNew(@NotNull GameDetailParams gameDetailParams);

    @NotNull
    Dialog getGameDownloadDialog(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void getGameInfo(@NotNull Lifecycle lifecycle, @NotNull String str, @NotNull BookCallback bookCallback);

    long getGamePreResLength();

    @NotNull
    StateFlow<Integer> getGameUpdateAndDownloadCounts(@NotNull Context context);

    @NotNull
    StateFlow<no.a> getGiftDetailInfo(@Nullable Context context, @Nullable String str);

    @NotNull
    Fragment getSteamWebFragment(@NotNull String str, @Nullable Map<String, String> map, @NotNull String str2);

    @NotNull
    GameRetUserCard getVideoGameRetUserCard(@NotNull String str, @Nullable String str2, @NotNull String str3);

    boolean isMiniGameReturnAnimEnabled();

    void pushLaterOnSmallGame(@Nullable JSONObject jSONObject);

    void registerGameJsBridge(@Nullable Activity activity, @Nullable JsbProxy jsbProxy);

    void registerGameWebJsBridge(@Nullable Activity activity, @Nullable JsbProxy jsbProxy);
}
