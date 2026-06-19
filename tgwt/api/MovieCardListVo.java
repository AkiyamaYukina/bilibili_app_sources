package com.bilibili.tgwt.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class MovieCardListVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Page f110836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<Item> f110837b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo$Item.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Item {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("season_id")
        private int f110838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f110839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f110840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @SerializedName("badge_info")
        @Nullable
        private BangumiBadgeInfo f110841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Rating f110842e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f110843f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f110844g;

        @Nullable
        public List<EP> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @SerializedName("time_length_show")
        @NotNull
        private String f110845i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public String f110846j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @SerializedName("search_info")
        @Nullable
        private SearchInfo f110847k;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo$Item$EP.class */
        @StabilityInferred(parameters = 0)
        @Bson
        public static final class EP {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public String f110848a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f110849b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @SerializedName("ep_id")
            private int f110850c;

            public final int a() {
                return this.f110850c;
            }

            public final void b(int i7) {
                this.f110850c = i7;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo$Item$Rating.class */
        @StabilityInferred(parameters = 0)
        @Bson
        public static final class Rating {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public float f110851a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f110852b;
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo$Item$SearchInfo.class */
        @StabilityInferred(parameters = 0)
        @Bson
        public static final class SearchInfo {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @SerializedName("season_id")
            private int f110853a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public String f110854b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public String f110855c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @Nullable
            public String f110856d;

            public final int a() {
                return this.f110853a;
            }

            public final void b(int i7) {
                this.f110853a = i7;
            }
        }

        @Nullable
        public final BangumiBadgeInfo a() {
            return this.f110841d;
        }

        @Nullable
        public final SearchInfo b() {
            return this.f110847k;
        }

        public final int c() {
            return this.f110838a;
        }

        @NotNull
        public final String d() {
            return this.f110845i;
        }

        public final void e(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
            this.f110841d = bangumiBadgeInfo;
        }

        public final void f(@Nullable SearchInfo searchInfo) {
            this.f110847k = searchInfo;
        }

        public final void g(int i7) {
            this.f110838a = i7;
        }

        public final void h(@NotNull String str) {
            this.f110845i = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/api/MovieCardListVo$Page.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Page {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f110857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("page_version")
        @Nullable
        private String f110858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f110859c;

        @Nullable
        public final String a() {
            return this.f110858b;
        }

        public final void b(@Nullable String str) {
            this.f110858b = str;
        }
    }
}
