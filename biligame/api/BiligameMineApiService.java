package com.bilibili.biligame.api;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.api.user.BiliGameMinePlayGame;
import com.bilibili.biligame.ui.gamedetail.data.PanelTab;
import com.bilibili.biligame.ui.minev3.bean.BiligameMineGrowthPlanBean;
import com.bilibili.biligame.ui.minev3.bean.BiligameUpdatePatchBean;
import com.bilibili.biligame.ui.minev3.bean.GameNewPlayedBean;
import com.bilibili.biligame.ui.minev3.bean.MineModuleBean;
import com.bilibili.biligame.ui.minev3.bean.PointMallEntranceList;
import com.bilibili.biligame.ui.steambind.bean.GameSteamEntranceInfoBean;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMineApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/")
public interface BiligameMineApiService {
    static /* synthetic */ BiliCall getMineNewPlayGamesV2$default(BiligameMineApiService biligameMineApiService, int i7, int i8, boolean z6, boolean z7, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMineNewPlayGamesV2");
        }
        if ((i9 & 8) != 0) {
            z7 = true;
        }
        return biligameMineApiService.getMineNewPlayGamesV2(i7, i8, z6, z7);
    }

    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @FormUrlEncoded
    @POST("game/center/h5/user/remove_downloaded")
    BiliCall<BiligameApiResponse<JSONObject>> deleteDownloadGame(@Field("game_base_id") int i7);

    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @FormUrlEncoded
    @POST("game/center/h5/user/remove/play")
    BiliCall<BiligameApiResponse<JSONObject>> deletePlayedGame(@Field("game_base_id") int i7);

    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @FormUrlEncoded
    @POST("game/center/h5/user/remove/play/v2")
    BiliCall<BiligameApiResponse<JSONObject>> deletePlayedGameV2(@Field("game_base_id") int i7);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("game/center/h5/user/downloaded")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<BiligameMainGame>>> getMineDownloadGames(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("game/center/h5/my/growthplan/base")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameMineGrowthPlanBean>> getMineGrowthPlanOne();

    @GET("game/center/h5/my/growthplan/benefits")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameMineGrowthPlanBean>> getMineGrowthPlanTwo();

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("game/center/h5/user/played")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<BiliGameMinePlayGame>>> getMineNewPlayGames(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("game/center/h5/user/played_game")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameNewPlayedBean>> getMineNewPlayGamesV2(@Query("page_num") int i7, @Query("page_size") int i8, @Query("user_applist_access_authority") boolean z6, @Query("filter_removed_played_game") boolean z7);

    @KeySign({KeySign.UID})
    @GET("game/center/h5/user/purchased/gamelist")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<BiliGameMinePlayGame>>> getMinePurchasedGamesV2();

    @GET("game/center/h5/my/get_mine_position_config/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<MineModuleBean>>> getMyCenterServiceV2();

    @GET("game/center/h5/currency_mall/user_page/query_entrance")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<PointMallEntranceList>> getPointMallEntrance();

    @GET("https://line3-h5-mobile-api.biligame.com/api/game/steam/entrance")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameSteamEntranceInfoBean>> getSteamEntrance();

    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @FormUrlEncoded
    @POST("game/center/h5/game/incpkg")
    BiliCall<BiligameApiResponse<List<BiligameUpdatePatchBean>>> getUpdatePatchInfo(@Field("game_base_ids") @NotNull String str);

    @GET("game/center/h5/my/game_tab_config")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<List<PanelTab>>> getUserPanel();

    @GET("game/center/h5/user/move/cps_game")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<JSONObject>> moveCpsGame(@Query("game_base_id") int i7, @Query("action") int i8);
}
