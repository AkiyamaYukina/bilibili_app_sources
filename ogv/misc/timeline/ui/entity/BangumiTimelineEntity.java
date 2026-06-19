package com.bilibili.ogv.misc.timeline.ui.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.misc.timeline.BangumiTimelinePagerAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimelineEntity.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiTimelineEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("filter")
    @Nullable
    private List<Filter> f69552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(BangumiTimelinePagerAdapter.BangumiTimelineFragment.BUNDLE_CURRENT_TIME_TEXT)
    @NotNull
    private String f69553b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("data")
    @Nullable
    private List<BangumiTimelineDay> f69554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("is_night_mode")
    private boolean f69555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("navigation_title")
    @Nullable
    private String f69556e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimelineEntity$Filter.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class Filter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("desc")
        @NotNull
        private String f69557a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("type")
        private int f69558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f69559c;

        @NotNull
        public final String a() {
            return this.f69557a;
        }

        public final int b() {
            return this.f69558b;
        }

        public final void c(@NotNull String str) {
            this.f69557a = str;
        }

        public final void d(int i7) {
            this.f69558b = i7;
        }
    }

    @NotNull
    public final String a() {
        return this.f69553b;
    }

    @Nullable
    public final List<BangumiTimelineDay> b() {
        return this.f69554c;
    }

    @Nullable
    public final List<Filter> c() {
        return this.f69552a;
    }

    @Nullable
    public final String d() {
        return this.f69556e;
    }

    public final boolean e() {
        return this.f69555d;
    }

    public final void f(@NotNull String str) {
        this.f69553b = str;
    }

    public final void g(@Nullable List<BangumiTimelineDay> list) {
        this.f69554c = list;
    }

    public final void h(@Nullable List<Filter> list) {
        this.f69552a = list;
    }

    public final void i(boolean z6) {
        this.f69555d = z6;
    }

    public final void j(@Nullable String str) {
        this.f69556e = str;
    }
}
