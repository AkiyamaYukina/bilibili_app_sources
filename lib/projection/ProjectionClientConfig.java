package com.bilibili.lib.projection;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClientConfig.class */
public final class ProjectionClientConfig {
    public static final int BUSINESS_TYPE_SEASON_VIDEO = 101;
    public static final int BUSINESS_TYPE_STORY = 102;
    public static final int CLIENT_GLOBALLINK = 6;
    public static final int CLIENT_LIVE = 4;
    public static final int CLIENT_OGV = 2;
    public static final int CLIENT_PLAYLIST = 5;
    public static final int CLIENT_PUGV = 3;
    public static final int CLIENT_ROOT = 0;
    public static final int CLIENT_STORY = 7;
    public static final int CLIENT_UGC = 1;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int INVALID = -1;
    public static final int OTYPE_MUSIC = 12;
    public static final int OTYPE_OGV = 24;
    public static final int OTYPE_UGC = 2;
    public static final int REMOTE = -2;
    public static final int RESOLVER_UNIT = 100;
    public static final int SHOPPING_VIDEO = 8;
    public static final int SHOPPING_VIDEO_BUSINESS_TYPE = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Long f62974b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f62977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f62978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f62979g;
    public int h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public ProjectionTheme f62975c = ProjectionTheme.PINK;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public ProjectionScreenType f62976d = ProjectionScreenType.HALF_SCREEN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f62980i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f62981j = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/ProjectionClientConfig$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProjectionClientConfig obtain(int i7) {
            return new ProjectionClientConfig(i7, null);
        }
    }

    public ProjectionClientConfig(int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this.f62973a = i7;
    }

    @NotNull
    public final ProjectionClientConfig avId(long j7) {
        if (this.f62973a == 1) {
            this.f62978f = j7;
        }
        return this;
    }

    @NotNull
    public final ProjectionClientConfig businessType(int i7) {
        if (this.f62973a == 1) {
            this.h = i7;
        }
        return this;
    }

    @NotNull
    public final ProjectionClientConfig enableGlobalLink(boolean z6) {
        this.f62980i = z6;
        return this;
    }

    public final long getAvId$biliscreencast_release() {
        return this.f62978f;
    }

    public final int getBusinessType$biliscreencast_release() {
        return this.h;
    }

    public final int getClientType$biliscreencast_release() {
        return this.f62973a;
    }

    public final boolean getEnableGlobalLink$biliscreencast_release() {
        return this.f62980i;
    }

    public final boolean getHasPanel$biliscreencast_release() {
        return this.f62981j;
    }

    @Nullable
    public final Long getOperationId() {
        return this.f62974b;
    }

    public final long getRoomID() {
        if (this.f62973a == 4) {
            return this.f62977e;
        }
        return 0L;
    }

    public final long getRoomId$biliscreencast_release() {
        return this.f62977e;
    }

    @NotNull
    public final ProjectionScreenType getScreenType$biliscreencast_release() {
        return this.f62976d;
    }

    public final long getSeasonId() {
        if (this.f62973a == 2) {
            return this.f62979g;
        }
        return 0L;
    }

    public final long getSeasonId$biliscreencast_release() {
        return this.f62979g;
    }

    @NotNull
    public final ProjectionTheme getTheme$biliscreencast_release() {
        return this.f62975c;
    }

    @NotNull
    public final ProjectionClientConfig roomId(long j7) {
        if (this.f62973a == 4) {
            this.f62977e = j7;
        }
        return this;
    }

    @NotNull
    public final ProjectionClientConfig screenType(@NotNull ProjectionScreenType projectionScreenType) {
        this.f62976d = projectionScreenType;
        return this;
    }

    @NotNull
    public final ProjectionClientConfig seasonId(long j7) {
        if (this.f62973a == 2) {
            this.f62979g = j7;
        }
        return this;
    }

    public final void setAvId$biliscreencast_release(long j7) {
        this.f62978f = j7;
    }

    public final void setBusinessType$biliscreencast_release(int i7) {
        this.h = i7;
    }

    public final void setEnableGlobalLink$biliscreencast_release(boolean z6) {
        this.f62980i = z6;
    }

    public final void setHasPanel$biliscreencast_release(boolean z6) {
        this.f62981j = z6;
    }

    public final void setOperationId(@Nullable Long l7) {
        this.f62974b = l7;
    }

    @NotNull
    public final ProjectionClientConfig setPanelEnable(boolean z6) {
        this.f62981j = z6;
        return this;
    }

    public final void setRoomId$biliscreencast_release(long j7) {
        this.f62977e = j7;
    }

    public final void setScreenType$biliscreencast_release(@NotNull ProjectionScreenType projectionScreenType) {
        this.f62976d = projectionScreenType;
    }

    public final void setSeasonId$biliscreencast_release(long j7) {
        this.f62979g = j7;
    }

    public final void setTheme$biliscreencast_release(@NotNull ProjectionTheme projectionTheme) {
        this.f62975c = projectionTheme;
    }

    @NotNull
    public final ProjectionClientConfig theme(@NotNull ProjectionTheme projectionTheme) {
        this.f62975c = projectionTheme;
        return this;
    }
}
