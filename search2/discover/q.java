package com.bilibili.search2.discover;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.converter.IParser;
import com.bilibili.search2.api.NegativeFeedback;
import com.bilibili.search2.api.SearchRank;
import com.bilibili.search2.api.SearchRankingMeta;
import com.bilibili.search2.api.SearchReferral;
import com.bilibili.search2.api.SearchSquareType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/q.class */
@StabilityInferred(parameters = 1)
public final class q implements IParser<GeneralResponse<List<? extends SearchSquareType>>> {
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.util.ArrayList] */
    @Override // com.bilibili.okretro.converter.IParser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GeneralResponse<List<SearchSquareType>> convert(@NotNull ResponseBody responseBody) {
        Object[] array;
        JSONObject object = JSON.parseObject(responseBody.string());
        GeneralResponse<List<SearchSquareType>> generalResponse = new GeneralResponse<>();
        generalResponse.code = object.getIntValue("code");
        generalResponse.message = object.getString("message");
        if (generalResponse.code == 0) {
            JSONArray jSONArray = object.getJSONArray("data");
            ?? arrayList = new ArrayList();
            if (jSONArray != null && (array = jSONArray.toArray()) != null) {
                for (Object obj : array) {
                    JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
                    if (jSONObject == null) {
                        break;
                    }
                    SearchSquareType searchSquareType = new SearchSquareType();
                    searchSquareType.setType(jSONObject.getString("type"));
                    searchSquareType.setTitle(jSONObject.getString("title"));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    try {
                        searchSquareType.setSearchRankingMeta((SearchRankingMeta) jSONObject.getObject("search_ranking_meta", SearchRankingMeta.class));
                        Boolean bool = jSONObject.getBoolean("search_button_opt_with_sort");
                        searchSquareType.setSearchButtonOptWithSort(bool != null ? bool.booleanValue() : false);
                    } catch (Exception e7) {
                        BLog.e("SearchSquareParser", "search_button_opt_with_sort error");
                    }
                    if (jSONObject2 != null) {
                        searchSquareType.setExpStr(jSONObject2.getString("exp_str"));
                        searchSquareType.setTrackId(jSONObject2.getString("trackid"));
                        try {
                            Result.Companion companion = Result.Companion;
                            Long l7 = jSONObject2.getLong("board_expand_time_milli");
                            searchSquareType.setBoardExpandTimeMs(l7 != null ? l7.longValue() : 0L);
                            Long l8 = jSONObject2.getLong("board_close_time_milli");
                            searchSquareType.setBoardCloseTimeMs(l8 != null ? l8.longValue() : 0L);
                            Result.constructor-impl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("list");
                        String type = searchSquareType.getType();
                        if (Intrinsics.areEqual(type, SquareTypes.TRENDING.getType())) {
                            List<?> array2 = JSON.parseArray(jSONArray2 != null ? jSONArray2.toJSONString() : null, SearchRank.class);
                            if (array2 != null) {
                                Iterator<T> it = array2.iterator();
                                while (it.hasNext()) {
                                    SearchRank searchRank = (SearchRank) it.next();
                                    searchRank.mExpStr = searchSquareType.getExpStr();
                                    searchRank.mTrackId = searchSquareType.getTrackId();
                                }
                            }
                            searchSquareType.setList(array2);
                        } else if (Intrinsics.areEqual(type, SquareTypes.RECOMMEND.getType())) {
                            List<?> array3 = JSON.parseArray(jSONArray2 != null ? jSONArray2.toJSONString() : null, SearchReferral.Guess.class);
                            if (array3 != null) {
                                Iterator<T> it2 = array3.iterator();
                                while (it2.hasNext()) {
                                    SearchReferral.Guess guess = (SearchReferral.Guess) it2.next();
                                    guess.abtestId = searchSquareType.getExpStr();
                                    guess.trackId = searchSquareType.getTrackId();
                                }
                            }
                            searchSquareType.setList(array3);
                            try {
                                searchSquareType.setNegativeFeedback((NegativeFeedback) jSONObject2.getObject("negative_feedback", NegativeFeedback.class));
                            } catch (Exception e8) {
                                BLog.e("SearchSquareParser", "negative_feedback error");
                            }
                        } else {
                            Intrinsics.areEqual(type, SquareTypes.HISTORY.getType());
                        }
                    }
                    arrayList.add(searchSquareType);
                }
            }
            generalResponse.data = arrayList;
        }
        return generalResponse;
    }
}
