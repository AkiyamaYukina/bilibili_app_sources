package com.bilibili.ship.theseus.playlist.util;

import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.playlist.api.ListResponse;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.tencent.map.geolocation.TencentLocation;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/c.class */
@BaseUrl("https://api.bilibili.com")
public interface c {
    static /* synthetic */ Object a(c cVar, int i7, String str, long j7, long j8, boolean z6, boolean z7, boolean z8, int i8, Integer num, boolean z9, int i9, int i10, int i11, int i12, ContinuationImpl continuationImpl, int i13) {
        int iA = d.a();
        if ((i13 & 32768) != 0) {
            i12 = 0;
        }
        return cVar.getMediaList(i7, str, j7, j8, z6, z7, z8, Constant.SDK_OS, i8, num, z9, i9, i10, i11, iA, i12, continuationImpl);
    }

    @GET("x/v2/medialist/resource/list")
    @RequestInterceptor(Ou0.b.class)
    @Nullable
    Object getMediaList(@Query("type") int i7, @Query("biz_id") @NotNull String str, @Query("oid") long j7, @Query("offset") long j8, @Query("desc") boolean z6, @Query(TencentLocation.EXTRA_DIRECTION) boolean z7, @Query("with_current") boolean z8, @Query("from") @NotNull String str2, @Query("sort_field") int i8, @Query("otype") @Nullable Integer num, @Query("use_pn") boolean z9, @Query("pn") int i9, @Query("only_un_view") int i10, @Query("asc") int i11, @Query("ps") int i12, @Query("preview") int i13, @NotNull Continuation<? super BiliApiResponse<ListResponse>> continuation);

    @GET("x/v1/medialist/info")
    @RequestInterceptor(Ou0.b.class)
    @Nullable
    Object getPlaylistBasicInfo(@Query("media_id") long j7, @Query("type") int i7, @Query("biz_id") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<PlaylistInfo>> continuation);
}
