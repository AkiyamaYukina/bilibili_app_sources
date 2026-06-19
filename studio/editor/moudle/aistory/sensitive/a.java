package com.bilibili.studio.editor.moudle.aistory.sensitive;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.editor.moudle.aistory.sensitive.bean.SensitiveCheckResponse;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/sensitive/a.class */
@BaseUrl("https://member.bilibili.com")
public interface a {
    @POST("x/creative-tool/sensitive-word/check")
    @Nullable
    BiliCall<GeneralResponse<SensitiveCheckResponse>> getTemplateEntrance(@Body @NotNull RequestBody requestBody);
}
