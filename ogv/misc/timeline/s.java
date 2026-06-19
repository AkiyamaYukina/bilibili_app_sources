package com.bilibili.ogv.misc.timeline;

import com.bilibili.ogv.misc.timeline.BangumiTimelinePagerAdapter;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineEntity;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import io.reactivex.rxjava3.core.Single;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/s.class */
public interface s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f69481a = a.f69482a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/s$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f69482a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final s f69483b = (s) ServiceGenerator.createRetrofitBuilder().baseUrl("https://api.bilibili.com").build().create(s.class);
    }

    @GET("/pgc/app/timeline")
    @SplitGeneralResponse
    @NotNull
    Single<BangumiTimelineEntity> getTimeline(@Query("type") @Nullable String str, @Query(BangumiTimelinePagerAdapter.BangumiTimelineFragment.BUNDLE_NIGHT_MODE) int i7, @Query("filter_type") int i8, @Query("is_new") int i9);
}
