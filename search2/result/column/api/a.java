package com.bilibili.search2.result.column.api;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.CacheControl;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.search2.api.Column;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/api/a.class */
@BaseUrl("https://api.bilibili.com")
public interface a {
    @GET("/x/article/categories")
    @CacheControl(3600000)
    @Nullable
    BiliCall<GeneralResponse<List<Column.Category>>> getArticleCategories();
}
