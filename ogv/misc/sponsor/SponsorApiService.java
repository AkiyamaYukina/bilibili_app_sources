package com.bilibili.ogv.misc.sponsor;

import com.bilibili.api.base.util.ParamsMap;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/SponsorApiService.class */
public interface SponsorApiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SponsorApiService f69383a = (SponsorApiService) ServiceGenerator.createRetrofitBuilder().baseUrl("https://bangumi.bilibili.com").build().create(SponsorApiService.class);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/SponsorApiService$SponsorRankParamsMap.class */
    public static class SponsorRankParamsMap extends ParamsMap {
        public SponsorRankParamsMap(long j7, int i7) {
            super(5);
            putParams(new String[]{"aid", String.valueOf(j7)});
            putParams(new String[]{MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, String.valueOf(i7)});
            putParams(new String[]{"pagesize", String.valueOf(25)});
        }

        public SponsorRankParamsMap(String str, int i7, int i8) {
            super(5);
            putParams(new String[]{"season_id", str});
            putParams(new String[]{"season_type", String.valueOf(i7)});
            putParams(new String[]{MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, String.valueOf(i8)});
            putParams(new String[]{"pagesize", String.valueOf(25)});
        }
    }

    @GET("/sponsor/get_season_by_sponsor")
    @SplitGeneralResponse
    Single<BangumiCategoryIndex> getSeasonBySponsor(@Query(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE) int i7, @Query("page_size") int i8, @Query("index_type") int i9, @Query("index_sort") int i10);

    @GET("/sponsor/api/v2/rank/total")
    @SplitGeneralResponse
    Single<BangumiSponsorRank> getSponsorRankTotal(@QueryMap SponsorRankParamsMap sponsorRankParamsMap);

    @GET("/sponsor/api/v2/rank/week")
    @SplitGeneralResponse
    Single<BangumiSponsorRank> getSponsorRankWeek(@QueryMap SponsorRankParamsMap sponsorRankParamsMap);
}
