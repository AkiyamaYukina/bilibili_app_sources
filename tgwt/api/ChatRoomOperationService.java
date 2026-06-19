package com.bilibili.tgwt.api;

import androidx.core.app.NotificationCompat;
import com.bilibili.bangumi.module.chatroom.AccompanyShareInfoVo;
import com.bilibili.bangumi.module.chatroom.ChatRoomExtraInfo;
import com.bilibili.bangumi.module.chatroom.ChatShareCardInfo;
import com.bilibili.bangumi.module.chatroom.TogetherWatchAuthorizeInfo;
import com.bilibili.bangumi.module.chatroom.VoiceChannelInfo;
import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.chatroom.widget.userDialog.ChatUserInfo;
import com.bilibili.chatroomsdk.ChatMsgList;
import com.bilibili.chatroomsdk.ChatMsgResp;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.okretro.call.NoSchedulers;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.tgwt.chatroom.ActionData;
import com.bilibili.tgwt.chatroom.ChatGuestPureEnjoyMsgInfo;
import com.bilibili.tgwt.chatroom.ChatRoomFullInfo;
import com.bilibili.tgwt.chatroom.ChatRoomState;
import com.bilibili.tgwt.chatroom.FateMatchVo;
import com.bilibili.tgwt.emoticon.InteractEmote;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/ChatRoomOperationService.class */
@BaseUrl("http://api.bilibili.com")
public interface ChatRoomOperationService {
    @FormUrlEncoded
    @POST("/pgc/freya/room/active")
    @Nullable
    Object activeRoom(@Field("room_id") @Nullable Long l7, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/relation")
    @Nullable
    Object changeFreyaRoomRelation(@Field("fid") long j7, @Field("room_id") long j8, @Field("action") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/create")
    @Nullable
    Object createRoom(@Field("season_id") long j7, @Field("episode_id") long j8, @Field("is_open") int i7, @Field("vega_abtest") int i8, @Field("from_type") int i9, @Field("sex_type") @Nullable Integer num, @Field("ext") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<ChatRoomState>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/com/interact/pre/create_channel")
    @Nullable
    Object createVoiceChannel(@Field("room_id") long j7, @Field("biz_type") int i7, @Field("interact_sdk_version") int i8, @Field("extend") @Nullable String str, @NotNull Continuation<? super BiliApiResponse<VoiceChannelInfo>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/heartbeat")
    @Nullable
    Object doHeart(@Field("room_id") long j7, @Field(EditCustomizeSticker.TAG_MID) long j8, @Field("season_id") long j9, @Field("episode_id") long j10, @Field("type") int i7, @Field("play_status") int i8, @Field("vega_abtest") int i9, @Field("ts") long j11, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @GET("/pgc/freya/label/ban_accredit")
    @Nullable
    Object forbiddenTogetherWatchAuthorize(@Query("is_ban") int i7, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @GET("/pgc/freya/com/freya_emote/list")
    @Nullable
    Object getEmoteList(@Query("room_id") long j7, @Query("biz_type") int i7, @NotNull Continuation<? super BiliApiResponse<? extends List<InteractEmote>>> continuation);

    @GET("/pgc/freya/room/recommend/result")
    @Nullable
    Object getFateMatchResult(@Query("match_id") @Nullable String str, @NotNull Continuation<? super BiliApiResponse<ChatRoomState>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/im/pure/msg")
    @Nullable
    Object getGuestPureEnjoyMsg(@Field("room_id") long j7, @Field("seq_id") long j8, @Field("backward") boolean z6, @Field(TextSource.CFG_SIZE) int i7, @NotNull Continuation<? super BiliApiResponse<ChatGuestPureEnjoyMsgInfo>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/upos/sign")
    @Nullable
    Object getUposSignUrl(@Field("msg_id") long j7, @NotNull Continuation<? super BiliApiResponse<ChatMessageVo>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/im/action")
    @Nullable
    Object imAction(@FieldMap @NotNull Map<String, String> map, @NotNull Continuation<? super BiliApiResponse<ActionData>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/join")
    @Nullable
    Object joinRoom(@Field("room_id") long j7, @Field("vega_abtest") int i7, @Field(EditCustomizeSticker.TAG_MID) long j8, @Field("is_merge") int i8, @Field("from_type") int i9, @Field("season_id") long j9, @Field("episode_id") long j10, @Field("ext") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<ChatRoomState>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/com/interact/pre/join_channel")
    @Nullable
    Object joinVoiceChannel(@Field("room_id") long j7, @Field("biz_type") int i7, @Field("channel_id") @NotNull String str, @Field("interact_sdk_version") int i8, @Field("extend") @Nullable String str2, @NotNull Continuation<? super BiliApiResponse<VoiceChannelInfo>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/kickout")
    @Nullable
    Object kickOut(@Field("room_id") long j7, @Field(EditCustomizeSticker.TAG_MID) long j8, @Field("is_com") int i7, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/leave")
    @Nullable
    Object leaveRoom(@Field("room_id") long j7, @Field("is_com") int i7, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/com/interact/pre/leave_channel")
    @Nullable
    Object leaveVoiceChannel(@Field("room_id") long j7, @Field("biz_type") int i7, @Field("channel_id") @NotNull String str, @Field("interact_sdk_version") int i8, @Field("extend") @Nullable String str2, @NotNull Continuation<? super BiliApiResponse<VoiceChannelInfo>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/match")
    @Nullable
    Object matchRoom(@Field("season_id") @Nullable Long l7, @Field("episode_id") @Nullable Long l8, @Field("fail_fast") int i7, @Field("from_type") int i8, @Field("season_type") int i9, @Field("vega_abtest") int i10, @Field("ext") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<ChatRoomState>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/modify/progress")
    @Nullable
    Object modifyProgress(@Field("is_com") int i7, @Field("room_id") long j7, @Field(NotificationCompat.CATEGORY_STATUS) int i8, @Field(NotificationCompat.CATEGORY_PROGRESS) long j8, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/modify/info")
    @Nullable
    Object modifyRoomInfo(@Field("room_id") long j7, @Field("is_open") int i7, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/modify/season")
    @Nullable
    Object modifyRoomVideo(@Field("is_com") int i7, @Field("room_id") long j7, @Field("season_id") long j8, @Field("episode_id") long j9, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/report")
    @Nullable
    Object reportValidDau(@Field("room_id") long j7, @Field("event_id") @NotNull String str, @Field("biz_type") int i7, @Field("report") @Nullable String str2, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @GET("/pgc/freya/room/ext")
    @Nullable
    Object requestChatRoomExtraInfo(@Query("room_id") long j7, @NotNull Continuation<? super BiliApiResponse<ChatRoomExtraInfo>> continuation);

    @GET("/pgc/freya/room/info")
    @Nullable
    Object requestRoomSetting(@Query("room_id") long j7, @NotNull Continuation<? super BiliApiResponse<ChatRoomFullInfo>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/share/live/share/card")
    @Nullable
    Object requestShareCard(@Field("room_id") long j7, @NotNull Continuation<? super BiliApiResponse<ChatShareCardInfo>> continuation);

    @GET("/pgc/freya/label/user_dialog")
    @Nullable
    Object requestTogetherWatchAuthorize(@Query("age_type") int i7, @Query("version") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<TogetherWatchAuthorizeInfo>> continuation);

    @GET("/pgc/freya/label/info")
    @Nullable
    Object requestUserInfoWithLabel(@Query("room_id") long j7, @Query(EditCustomizeSticker.TAG_MID) long j8, @NotNull Continuation<? super BiliApiResponse<ChatUserInfo>> continuation);

    @GET("/pgc/freya/room/double/accompany/share")
    @Nullable
    Object requestVoiceRoomAccompanyInfo(@Query("room_id") long j7, @Query("the_other") long j8, @NotNull Continuation<? super BiliApiResponse<AccompanyShareInfoVo>> continuation);

    @NoSchedulers
    @GET("/pgc/freya/im/msg/first_tips")
    @Nullable
    Object retrieveImMsgs(@Query("room_id") long j7, @Query("start_seq_id") long j8, @NotNull Continuation<? super BiliApiResponse<ChatMsgList>> continuation);

    @NoSchedulers
    @GET("/pgc/freya/im/msg/pulls")
    @Nullable
    Object retrieveMsgs(@Query("room_id") long j7, @Query("start_seq_id") long j8, @Query("end_seq_id") long j9, @NotNull Continuation<? super BiliApiResponse<ChatMsgList>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/modify/notice")
    @Nullable
    Object roomModifyNotice(@Field("room_id") long j7, @Field(TextSource.CFG_CONTENT) @NotNull String str, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/im/msg/send")
    @Nullable
    Object sendChatRoomMessage(@Field("room_id") long j7, @Field("content_type") int i7, @Field(TextSource.CFG_CONTENT) @NotNull String str, @Field("req_id") long j8, @NotNull Continuation<? super BiliApiResponse<ChatMsgResp>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/com/freya_emote/send")
    @Nullable
    Object sendInteractEmote(@Field("room_id") long j7, @Field("emote_id") int i7, @Field("biz_type") int i8, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/room/recommend/match")
    @Nullable
    Object startFateMatch(@Field("season_type") int i7, @Field("from_type") int i8, @Field("vega_abtest") int i9, @Field("match_sex") int i10, @NotNull Continuation<? super BiliApiResponse<FateMatchVo>> continuation);

    @FormUrlEncoded
    @POST("/pgc/freya/im/msg/remove")
    @Nullable
    Object withdrawMsg(@Field("msg_id") long j7, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);
}
