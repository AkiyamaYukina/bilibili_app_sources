package com.bilibili.playset.api;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.BaseResponse;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.Timeout;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playset.api.MultitypePlaylist;
import com.bilibili.playset.api.PlaySetGroups;
import com.bilibili.playset.note.RspNoteList;
import com.bilibili.playset.note.RspNoteListByOid;
import com.bilibili.playset.playlist.entity.MediaId;
import com.bilibili.playset.playlist.entity.PlaylistDetailBean;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.ArrayList;
import java.util.List;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetService.class */
@BaseUrl("https://api.bilibili.com")
public interface PlaySetService {
    @POST("/x/v3/fav/resource/batch-add")
    @Timeout(conn = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, read = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, write = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE)
    BiliCall<GeneralMsgResponse<String>> batchAddResource(@Query("resources") String str, @Query("media_id") String str2);

    @POST("/x/v3/fav/resource/copy")
    @Timeout(conn = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, read = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, write = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE)
    BiliCall<GeneralMsgResponse<String>> batchCopyResource(@Query(EditCustomizeSticker.TAG_MID) long j7, @Query("resources") String str, @Query("src_media_id") long j8, @Query("tar_media_id") long j9);

    @FormUrlEncoded
    @POST("/x/v2/history/toview/copy")
    @Timeout(conn = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, read = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, write = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE)
    BiliCall<GeneralResponse<Void>> batchCopyResourceFromWatchLater(@Field("resources") String str, @Field("tar_media_id") long j7);

    @POST("/x/v3/fav/resource/move")
    @Timeout(conn = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, read = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, write = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE)
    BiliCall<GeneralMsgResponse<String>> batchMoveResource(@Query("src_media_id") long j7, @Query("tar_media_id") long j8, @Query("resources") String str);

    @FormUrlEncoded
    @POST("/x/v2/history/toview/move")
    @Timeout(conn = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, read = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, write = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE)
    BiliCall<GeneralResponse<Void>> batchMoveResourceFromWatchLater(@Field("resources") String str, @Field("tar_media_id") long j7);

    @GET("/x/v3/fav/resource/infos")
    BiliCall<GeneralResponse<List<MultitypeMedia>>> batchQueryMediasInfo(@Query("resources") String str);

    @GET("/x/v3/fav/resource/infos")
    BiliCall<GeneralResponse<ArrayList<MultitypeMedia>>> batchQueryMediasInfo(@Query("resources") String str, @Query("folder_mid") long j7, @Query("folder_id") long j8);

    @FormUrlEncoded
    @POST("/x/v3/fav/tab/clean_invalid")
    BiliCall<GeneralResponse<BaseResponse>> cleanInvalid(@Field("fid") long j7);

    @POST("/x/v3/fav/resource/clean")
    BiliCall<GeneralMsgResponse<String>> clearOfflineMedias(@Query("media_id") long j7);

    @FormUrlEncoded
    @POST("/x/v3/fav/folder/add")
    BiliCall<GeneralResponse<PlaySet>> createPlaySet(@Field(Tm0.a.f24206c) String str, @Field("title") String str2, @Field("intro") String str3, @Field("cover") String str4, @Field("privacy") int i7, @Header("x-bili-gaia-vtoken") String str5);

    @POST("/x/v3/fav/tab/dels")
    BiliCall<GeneralResponse<BaseResponse>> deleteFavorites(@Query("resources") String str, @Query("media_id") Long l7);

    @POST("/x/v3/fav/resource/batch-del")
    BiliCall<GeneralResponse<String>> deleteMedia(@Query("resources") String str, @Query("media_id") String str2);

    @FormUrlEncoded
    @POST("/x/note/del")
    BiliCall<GeneralResponse<String>> deleteNotes(@Field("note_ids") long[] jArr);

    @POST("/x/v3/fav/folder/del")
    BiliCall<GeneralResponse<String>> deletePlaylist(@Query("media_ids") String str);

    @FormUrlEncoded
    @POST("/x/note/publish/del")
    BiliCall<GeneralResponse<String>> deletePublicNotes(@Field("cvids") long[] jArr);

    @POST("/x/v3/fav/season/unfav")
    BiliCall<GeneralResponse<String>> deleteSeason(@Query("season_id") String str);

    @FormUrlEncoded
    @POST("/x/tag/subscribe/cancel")
    BiliCall<GeneralResponse<String>> deleteTag(@Field("tag_id") long j7);

    @FormUrlEncoded
    @POST("/x/v3/fav/folder/edit")
    BiliCall<GeneralResponse<PlaySet>> editPlaySet(@Field(Tm0.a.f24206c) String str, @Field("title") String str2, @Field("intro") String str3, @Field("cover") String str4, @Field("privacy") int i7, @Field("media_id") long j7, @Header("x-bili-gaia-vtoken") String str5);

    @POST("/x/v3/fav/resource/batch-deal")
    BiliCall<GeneralResponse<JSONObject>> favBatchVideo(@Query(Tm0.a.f24206c) String str, @Query("resources") String str2, @Query("add_media_ids") String str3, @Query("del_media_ids") String str4, @Query("from") String str5, @Query(CaptureSchema.JUMP_PARAMS_EXTRA) String str6, @Query("from_spmid") String str7, @Query("spmid") String str8, @Query("action_id") String str9, @Header("x-bili-gaia-vtoken") String str10);

    @POST("/x/v3/fav/folder/fav")
    BiliCall<GeneralResponse<String>> favPlaylist(@Query("media_id") long j7, @Query("from_spmid") String str, @Query("spmid") String str2, @Query("action_id") String str3, @Header("x-bili-gaia-vtoken") String str4);

    @POST("/x/v3/fav/resource/deal")
    BiliCall<GeneralResponse<JSONObject>> favVideo(@Query(Tm0.a.f24206c) String str, @Query("rid") long j7, @Query("type") int i7, @Query("add_media_ids") String str2, @Query("del_media_ids") String str3, @Query("from_spmid") String str4, @Query("spmid") String str5, @Query("action_id") String str6);

    @GET("/x/v3/fav/folder/created/list")
    BiliCall<GeneralResponse<PlaySetPageData>> getCreatedPlaySet(@Query(Tm0.a.f24206c) String str, @Query("up_mid") long j7, @Query("pn") int i7, @Query("ps") int i8, @Query("rid") String str2, @Query("type") String str3);

    @GET("/x/v3/fav/folder/created/list-all")
    @Timeout(conn = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, read = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, write = PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE)
    BiliCall<GeneralMsgResponse<PlaySetPageData>> getCreatedPlaySetAll(@Query("pn") int i7, @Query("ps") int i8, @Query("is_space") String str, @Query("up_mid") long j7);

    @GET("/x/v3/fav/folder/created/list-all")
    BiliCall<GeneralResponse<PlaySetPageData>> getCreatedPlaySetAll(@Query(Tm0.a.f24206c) String str, @Query("up_mid") long j7, @Query("rid") String str2, @Query("type") String str3, @Query("show_season") Boolean bool, @Query(CaptureSchema.JUMP_PARAMS_EXTRA) String str4);

    @GET("/x/v3/fav/folder/collected/list")
    BiliCall<GeneralResponse<PlaySetPageData>> getFavPlaySet(@Query(Tm0.a.f24206c) String str, @Query("up_mid") long j7, @Query("pn") int i7, @Query("ps") int i8);

    @GET("/x/v3/fav/folder/resources")
    BiliCall<GeneralResponse<d>> getFolderFullInfo(@Query("media_id") long j7, @Query("pn") int i7);

    @GET("/x/v3/fav/resource/ids")
    BiliCall<GeneralResponse<List<MediaId>>> getFullAmountIds(@Query("media_id") long j7, @Query("pn") int i7);

    @GET("/x/v3/fav/resource/ids")
    BiliCall<GeneralMsgResponse<List<MediaId>>> getFullAmountIds(@Query("media_id") long j7, @Query("pn") int i7, @Query("sort") int i8);

    @GET("/x/v3/fav/folder/space/v2")
    BiliCall<GeneralResponse<PlaySetGroups>> getGroupList(@Query("up_mid") long j7);

    @GET("/x/note/list")
    BiliCall<GeneralResponse<RspNoteList>> getNoteList(@Query("ps") int i7, @Query("pn") int i8);

    @GET("/x/note/publish/list/archive")
    BiliCall<GeneralResponse<RspNoteListByOid>> getNoteListByOid(@Query("oid") long j7, @Query("oid_type") int i7, @Query("ps") int i8, @Query("pn") int i9);

    @GET("/x/v3/fav/folder/space")
    BiliCall<GeneralResponse<List<PlaySetGroup>>> getPlaySetGroup(@Query(Tm0.a.f24206c) String str, @Query("up_mid") long j7);

    @GET("/x/v3/fav/folder/info")
    BiliCall<GeneralResponse<MultitypePlaylist.Info>> getPlaylistBasicInfo(@Query("media_id") long j7);

    @GET("/x/note/publish/list/user")
    BiliCall<GeneralResponse<RspNoteList>> getPublicNoteList(@Query("ps") int i7, @Query("pn") int i8);

    @GET("/x/v3/fav/folder/whitelist")
    BiliCall<GeneralResponse<Integer>> isInWhiteList(@Query(Tm0.a.f24206c) String str);

    @POST("/x/v3/fav/thump/up")
    BiliCall<GeneralResponse<String>> likePlaylist(@Query("rid") long j7, @Query("thumb_type") int i7, @Query("type") int i8, @Query("up_mid") long j8, @Query("from_spmid") String str, @Query("spmid") String str2, @Query("action_id") String str3, @Header("x-bili-gaia-vtoken") String str4);

    @FormUrlEncoded
    @POST("/x/relation/modify")
    BiliCall<GeneralResponse<String>> modify(@Field("fid") long j7, @Field("act") int i7, @Field("re_src") int i8);

    @GET("/x/v3/fav/folder/clean-state")
    BiliCall<GeneralMsgResponse<Integer>> queryClearOfflineState(@Query("media_id") long j7);

    @GET("/x/v3/fav/resource/list")
    BiliCall<GeneralResponse<PlaySetGroups.DefaultFolderGroup>> queryMedias(@Query("media_id") String str, @Query("pn") String str2, @Query("ps") String str3);

    @GET("/x/v3/fav/resource/list")
    BiliCall<GeneralResponse<PlaylistDetailBean>> queryPlaylistDetail(@Query("media_id") String str, @Query("pn") String str2, @Query("ps") String str3, @Query("type") int i7);

    @POST("/x/v3/fav/statistics/count")
    BiliCall<GeneralResponse<String>> reportShareCount(@Query("rid") long j7, @Query("r_type") int i7, @Query("cnt_type") int i8);

    @GET("/x/v3/fav/resource/list")
    BiliCall<GeneralResponse<PlaylistDetailBean>> search(@Query("media_id") long j7, @Query("pn") int i7, @Query("ps") int i8, @Query("keyword") String str, @Query("type") int i9);

    @GET("/x/v3/fav/tab/fav/search")
    BiliCall<GeneralResponse<rs0.b>> searchFavorites(@Query("keyword") String str, @Query("start_oid") long j7, @Query("start_otype") int i7, @Query("search_count") int i8, @Query("pn") int i9, @Query("count") int i10, @Query("media_id") Long l7);

    @POST("/x/v3/fav/resource/sort")
    BiliCall<GeneralMsgResponse<String>> sortPlaysetMedias(@Query("sort") String str, @Query("media_id") Long l7);

    @FormUrlEncoded
    @POST("/x/v3/fav/folder/add_top")
    BiliCall<GeneralResponse<String>> toTop(@Field("fid") long j7, @Field("add_top") boolean z6);

    @POST("x/v3/fav/folder/unfav")
    BiliCall<GeneralResponse<String>> unFavPlaySet(@Query("media_id") long j7, @Query("from_spmid") String str, @Query("spmid") String str2, @Query("action_id") String str3);

    @POST("x/v3/fav/folder/unfav")
    BiliCall<GeneralResponse<String>> unFavPlaySet(@Query(Tm0.a.f24206c) String str, @Query("media_id") long j7);
}
