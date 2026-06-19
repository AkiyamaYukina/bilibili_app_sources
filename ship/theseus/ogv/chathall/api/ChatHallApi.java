package com.bilibili.ship.theseus.ogv.chathall.api;

import com.bilibili.chatroom.widget.userDialog.ChatUserInfo;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.ogv.chathall.bean.ActionData;
import com.bilibili.ship.theseus.ogv.chathall.bean.ChatHallInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/api/ChatHallApi.class */
@BaseUrl("http://api.bilibili.com")
public interface ChatHallApi {
    @FormUrlEncoded
    @POST("/pgc/freya/chat/greeting")
    @Nullable
    Object hallAction(@FieldMap @NotNull Map<String, String> map, @NotNull Continuation<? super BiliApiResponse<ActionData>> continuation);

    @GET("/pgc/freya/chat/room/ext")
    @Nullable
    Object requestChatHallInfo(@Query("room_id") long j7, @Query("oid") long j8, @NotNull Continuation<? super BiliApiResponse<ChatHallInfo>> continuation);

    @GET("/pgc/freya/chat/user/info")
    @Nullable
    Object requestHallUserInfoWithLabel(@Query("chat_id") long j7, @Query(EditCustomizeSticker.TAG_MID) long j8, @NotNull Continuation<? super BiliApiResponse<ChatUserInfo>> continuation);
}
