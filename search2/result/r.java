package com.bilibili.search2.result;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.search2.api.Episode;
import com.google.gson.Gson;
import java.util.List;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/r.class */
@StabilityInferred(parameters = 1)
public final class r implements IParser<GeneralResponse<List<? extends Episode>>> {
    @Override // com.bilibili.okretro.converter.IParser
    public final Object convert(Object obj) {
        return (GeneralResponse) new Gson().fromJson(((ResponseBody) obj).string(), new q().getType());
    }

    @Override // com.bilibili.okretro.converter.IParser
    public final GeneralResponse<List<? extends Episode>> convert(ResponseBody responseBody) {
        return (GeneralResponse) new Gson().fromJson(responseBody.string(), new q().getType());
    }
}
