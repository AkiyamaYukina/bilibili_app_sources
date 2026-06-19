package com.bilibili.studio.videoeditor.bgm.bgmlist.net;

import Tm0.a;
import androidx.annotation.Keep;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.bgmlist.model.BgmListQueryResultBean;
import com.bilibili.studio.videoeditor.bgm.bgmlist.model.BgmPageQueryResultBean;
import java.util.List;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/net/IBgmListService.class */
@Keep
@BaseUrl("https://member.bilibili.com")
public interface IBgmListService {
    public static final int FROM_CAPTURE = 1;
    public static final int FROM_DEFAULT = 0;

    @GET("/x/app/bgm/v2/pre")
    BiliCall<GeneralResponse<BgmListQueryResultBean>> queryBgmList(@Query(a.f24206c) String str, @Query("from") int i7);

    @GET("/x/app/bgm/check/state")
    BiliCall<GeneralResponse<List<Bgm>>> queryBySids(@Query(a.f24206c) String str, @Query("sids") String str2);

    @GET("/x/app/bgm/v2/list")
    BiliCall<GeneralResponse<BgmPageQueryResultBean>> queryPageData(@Query(a.f24206c) String str, @Query("tid") long j7, @Query("ps") int i7, @Query("pn") int i8, @Query("version") long j8);
}
