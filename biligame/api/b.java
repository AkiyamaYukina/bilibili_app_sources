package com.bilibili.biligame.api;

import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.api.call.BiliGameCall;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/b.class */
@BaseUrl("https://line3-statics-h5-mobile-api.biligame.net")
public interface b {
    @GET("/disaster/game/center/h5/user/download/v2/{game_base_id}")
    @NotNull
    BiliGameCall<BiligameApiResponse<List<BiligameMainGame>>> getDownloadGameInfo(@Path("game_base_id") @NotNull String str);

    @GET("/disaster/game/center/h5/detail/gameinfo/v2/1/{game_base_id}")
    @NotNull
    BiliGameCall<BiligameApiResponse<GameDetailInfo>> getStaticGameInfo(@Path("game_base_id") @NotNull String str);
}
