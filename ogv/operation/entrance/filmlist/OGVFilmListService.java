package com.bilibili.ogv.operation.entrance.filmlist;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListService.class */
@BaseUrl("https://api.bilibili.com")
public interface OGVFilmListService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f70027a = a.f70028a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListService$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70028a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final OGVFilmListService f70029b = (OGVFilmListService) ServiceGenerator.createService(OGVFilmListService.class);
    }

    @POST("/pgc/web/playlist/fav/add")
    @SplitGeneralResponse
    @NotNull
    aY0.a addToFavorite(@Query("pid") int i7);

    @GET("/pgc/web/playlist/v2")
    @SplitGeneralResponse
    @Nullable
    Object getFilmListPageData(@Query("id") int i7, @Query("action_id") @Nullable String str, @NotNull Continuation<? super BiliApiResponse<OGVFilmListPage>> continuation);

    @POST("/pgc/web/playlist/fav/del")
    @SplitGeneralResponse
    @NotNull
    aY0.a removeFromFavorite(@Query("pid") int i7);
}
