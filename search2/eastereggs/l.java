package com.bilibili.search2.eastereggs;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.search2.api.SearchEasterEggConfig;
import com.bilibili.search2.api.SearchEasterEggItem;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/l.class */
@StabilityInferred(parameters = 1)
public final class l implements IParser<GeneralResponse<SearchEasterEggConfig>> {
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.bilibili.search2.api.SearchEasterEggConfig] */
    @Override // com.bilibili.okretro.converter.IParser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GeneralResponse<SearchEasterEggConfig> convert(@NotNull ResponseBody responseBody) {
        GeneralResponse<SearchEasterEggConfig> generalResponse = new GeneralResponse<>();
        JSONObject object = JSON.parseObject(responseBody.string());
        generalResponse.code = object.getIntValue("code");
        generalResponse.message = object.getString("message");
        generalResponse.ttl = object.getIntValue("ttl");
        ?? searchEasterEggConfig = new SearchEasterEggConfig();
        searchEasterEggConfig.setVersion(object.getString("ver"));
        String string = object.getString("data");
        if (generalResponse.code == 0 && !TextUtils.isEmpty(string)) {
            searchEasterEggConfig.setList(JSON.parseArray(string, SearchEasterEggItem.class));
        }
        generalResponse.data = searchEasterEggConfig;
        return generalResponse;
    }
}
