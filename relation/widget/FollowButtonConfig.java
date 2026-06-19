package com.bilibili.relation.widget;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.relation.utils.FollowFlowHelper;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/widget/FollowButtonConfig.class */
@StabilityInferred(parameters = 0)
public final class FollowButtonConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f86220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public FollowFlowHelper.SimpleCallback f86223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f86224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f86225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f86226g;

    @Nullable
    public HashMap<String, String> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Boolean f86227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public HashMap<String, String> f86228j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/widget/FollowButtonConfig$Builder.class */
    @StabilityInferred(parameters = 0)
    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f86229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final FollowFlowHelper.SimpleCallback f86232d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f86233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f86234f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f86235g;

        @Nullable
        public HashMap<String, String> h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public Boolean f86236i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public HashMap<String, String> f86237j;

        public Builder(long j7, boolean z6, int i7, @NotNull FollowFlowHelper.SimpleCallback simpleCallback) {
            this.f86229a = j7;
            this.f86230b = z6;
            this.f86231c = i7;
            this.f86232d = simpleCallback;
        }

        @NotNull
        public final FollowButtonConfig build() {
            return new FollowButtonConfig(this.f86229a, this.f86230b, this.f86231c, this.f86232d, this, null);
        }

        @Nullable
        public final HashMap<String, String> getClickReportExtras() {
            return this.f86237j;
        }

        @Nullable
        public final HashMap<String, String> getExtendContent() {
            return this.h;
        }

        @Nullable
        public final String getFromScmid() {
            return this.f86235g;
        }

        @Nullable
        public final String getFromSpmid() {
            return this.f86234f;
        }

        @Nullable
        public final String getSpmid() {
            return this.f86233e;
        }

        @Nullable
        public final Boolean isGuestAttention() {
            return this.f86236i;
        }

        @NotNull
        public final Builder setClickReportExtras(@NotNull HashMap<String, String> map) {
            this.f86237j = map;
            return this;
        }

        @NotNull
        public final Builder setExtendContent(@NotNull HashMap<String, String> map) {
            this.h = map;
            return this;
        }

        @NotNull
        public final Builder setFromScmid(@NotNull String str) {
            this.f86235g = str;
            return this;
        }

        @NotNull
        public final Builder setFromSpmid(@NotNull String str) {
            this.f86234f = str;
            return this;
        }

        @NotNull
        public final Builder setIsGuestAttention(boolean z6) {
            this.f86236i = Boolean.valueOf(z6);
            return this;
        }

        @NotNull
        public final Builder setSpmid(@NotNull String str) {
            this.f86233e = str;
            return this;
        }
    }

    public FollowButtonConfig(long j7, boolean z6, int i7, FollowFlowHelper.SimpleCallback simpleCallback, Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this.f86220a = j7;
        this.f86221b = z6;
        this.f86222c = i7;
        this.f86223d = simpleCallback;
        this.f86224e = builder.getSpmid();
        this.f86225f = builder.getFromSpmid();
        this.f86226g = builder.getFromScmid();
        this.h = builder.getExtendContent();
        this.f86227i = builder.isGuestAttention();
        this.f86228j = builder.getClickReportExtras();
    }

    @NotNull
    public final FollowFlowHelper.SimpleCallback getCallback() {
        return this.f86223d;
    }

    @Nullable
    public final HashMap<String, String> getClickReportExtras() {
        return this.f86228j;
    }

    @Nullable
    public final HashMap<String, String> getExtendContent() {
        return this.h;
    }

    public final int getFrom() {
        return this.f86222c;
    }

    @Nullable
    public final String getFromScmid() {
        return this.f86226g;
    }

    @Nullable
    public final String getFromSpmid() {
        return this.f86225f;
    }

    public final long getMid() {
        return this.f86220a;
    }

    @Nullable
    public final String getSpmid() {
        return this.f86224e;
    }

    public final boolean isAttention() {
        return this.f86221b;
    }

    @Nullable
    public final Boolean isGuestAttention() {
        return this.f86227i;
    }

    public final void setAttention(boolean z6) {
        this.f86221b = z6;
    }

    public final void setCallback(@NotNull FollowFlowHelper.SimpleCallback simpleCallback) {
        this.f86223d = simpleCallback;
    }

    public final void setClickReportExtras(@Nullable HashMap<String, String> map) {
        this.f86228j = map;
    }

    public final void setExtendContent(@Nullable HashMap<String, String> map) {
        this.h = map;
    }

    public final void setFrom(int i7) {
        this.f86222c = i7;
    }

    public final void setFromScmid(@Nullable String str) {
        this.f86226g = str;
    }

    public final void setFromSpmid(@Nullable String str) {
        this.f86225f = str;
    }

    public final void setGuestAttention(@Nullable Boolean bool) {
        this.f86227i = bool;
    }

    public final void setMid(long j7) {
        this.f86220a = j7;
    }

    public final void setSpmid(@Nullable String str) {
        this.f86224e = str;
    }
}
