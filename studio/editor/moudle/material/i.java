package com.bilibili.studio.editor.moudle.material;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.interceptor.SignOnUrlRequestInterceptor;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/i.class */
@BaseUrl("https://member.bilibili.com")
public interface i {
    @GET("/x/mvp/material/views/v3")
    @RequestInterceptor(SignOnUrlRequestInterceptor.class)
    @Nullable
    Object queryMaterialByIds(@Query("ids") @NotNull String str, @Query("apply_for") int i7, @Query("type") int i8, @Query(Tm0.a.f24206c) @NotNull String str2, @Query("sdk_type") @NotNull String str3, @Query("montage_version") @NotNull String str4, @Query("aurora_version") @NotNull String str5, @NotNull Continuation<? super GeneralResponse<ResourceResponse>> continuation);
}
