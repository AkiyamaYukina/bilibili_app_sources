package com.bilibili.ogv.misc.roledetail.roledetailapi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/PersonRelateContentVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PersonRelateContentVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f69275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f69276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("has_next")
    private boolean f69278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("module_title")
    @Nullable
    private String f69279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public List<Season> f69280f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/roledetail/roledetailapi/PersonRelateContentVo$Season.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Season {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f69281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("season_id")
        private int f69282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f69283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f69284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("badge_info")
        @Nullable
        private BangumiBadgeInfo f69285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @SerializedName("index_show")
        @Nullable
        private String f69286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @SerializedName("season_type")
        private int f69287g;

        @Nullable
        public String h;

        @Nullable
        public final BangumiBadgeInfo a() {
            return this.f69285e;
        }

        @Nullable
        public final String b() {
            return this.f69286f;
        }

        public final int c() {
            return this.f69282b;
        }

        public final int d() {
            return this.f69287g;
        }

        public final void e(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
            this.f69285e = bangumiBadgeInfo;
        }

        public final void f(@Nullable String str) {
            this.f69286f = str;
        }

        public final void g(int i7) {
            this.f69282b = i7;
        }

        public final void h(int i7) {
            this.f69287g = i7;
        }
    }

    public final boolean a() {
        return this.f69278d;
    }

    @Nullable
    public final String b() {
        return this.f69279e;
    }

    public final void c(boolean z6) {
        this.f69278d = z6;
    }

    public final void d(@Nullable String str) {
        this.f69279e = str;
    }
}
