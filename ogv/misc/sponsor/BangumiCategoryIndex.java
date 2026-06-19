package com.bilibili.ogv.misc.sponsor;

import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiCategoryIndex.class */
@Bson
public class BangumiCategoryIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Bangumi> f69313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69314b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiCategoryIndex$Bangumi.class */
    @Bson
    public static class Bangumi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f69315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f69316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("is_finish")
        public int f69317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SerializedName("newest_ep_index")
        public String f69318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("season_id")
        public String f69319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @SerializedName("pub_time")
        public long f69320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @SerializedName("update_time")
        public long f69321g;

        @SerializedName("title")
        public String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @SerializedName("total_count")
        public String f69322i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f69323j;
    }
}
