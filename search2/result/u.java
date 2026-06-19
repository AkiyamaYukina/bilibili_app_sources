package com.bilibili.search2.result;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.search2.result.bangumi.SearchPgcFavoriteResult;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/u.class */
@StabilityInferred(parameters = 1)
public final class u implements IParser<GeneralResponse<SearchPgcFavoriteResult>> {
    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.bilibili.search2.result.bangumi.SearchPgcFavoriteResult] */
    @Override // com.bilibili.okretro.converter.IParser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GeneralResponse<SearchPgcFavoriteResult> convert(@NotNull ResponseBody responseBody) {
        JSONObject jSONObject;
        GeneralResponse<SearchPgcFavoriteResult> generalResponse = new GeneralResponse<>();
        ?? searchPgcFavoriteResult = new SearchPgcFavoriteResult();
        JSONObject object = JSON.parseObject(responseBody.string());
        if (object != null && (jSONObject = object.getJSONObject(ThirdPartyExtraBuilder.KEY_RESULT)) != null) {
            searchPgcFavoriteResult.setStatus(jSONObject.getIntValue(NotificationCompat.CATEGORY_STATUS));
            searchPgcFavoriteResult.setToast(jSONObject.getString("toast"));
            generalResponse.data = searchPgcFavoriteResult;
        }
        return generalResponse;
    }
}
