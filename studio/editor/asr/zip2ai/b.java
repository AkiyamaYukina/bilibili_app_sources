package com.bilibili.studio.editor.asr.zip2ai;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/b.class */
@BaseUrl("https://member.bilibili.com")
public interface b {
    @POST("/x/vupre/app/archive/tag/topic/asr_upload")
    @NotNull
    BiliCall<GeneralResponse<String>> asrNotifyAi(@Body @NotNull RequestBody requestBody);
}
