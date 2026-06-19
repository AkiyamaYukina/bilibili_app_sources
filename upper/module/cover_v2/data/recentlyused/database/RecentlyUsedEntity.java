package com.bilibili.upper.module.cover_v2.data.recentlyused.database;

import G0.d;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import cf.l;
import com.bilibili.live.streaming.source.TextSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/recentlyused/database/RecentlyUsedEntity.class */
@StabilityInferred(parameters = 0)
@Entity(tableName = "recently_used")
@Keep
public final class RecentlyUsedEntity {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();

    @ColumnInfo(name = TextSource.CFG_CONTENT)
    @NotNull
    private String content;

    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "resource_id")
    @NotNull
    private String resourceId;

    @ColumnInfo(name = "timestamp")
    private long timestamp;

    @ColumnInfo(name = "type")
    private int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/recentlyused/database/RecentlyUsedEntity$a.class */
    public static final class a {
    }

    public RecentlyUsedEntity() {
        this(0L, 0L, null, 0, null, 31, null);
    }

    public RecentlyUsedEntity(long j7, long j8, @NotNull String str, int i7, @NotNull String str2) {
        this.id = j7;
        this.timestamp = j8;
        this.resourceId = str;
        this.type = i7;
        this.content = str2;
    }

    public /* synthetic */ RecentlyUsedEntity(long j7, long j8, String str, int i7, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? 0L : j8, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? 0 : i7, (i8 & 16) != 0 ? "" : str2);
    }

    public static /* synthetic */ RecentlyUsedEntity copy$default(RecentlyUsedEntity recentlyUsedEntity, long j7, long j8, String str, int i7, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = recentlyUsedEntity.id;
        }
        if ((i8 & 2) != 0) {
            j8 = recentlyUsedEntity.timestamp;
        }
        if ((i8 & 4) != 0) {
            str = recentlyUsedEntity.resourceId;
        }
        if ((i8 & 8) != 0) {
            i7 = recentlyUsedEntity.type;
        }
        if ((i8 & 16) != 0) {
            str2 = recentlyUsedEntity.content;
        }
        return recentlyUsedEntity.copy(j7, j8, str, i7, str2);
    }

    public final long component1() {
        return this.id;
    }

    public final long component2() {
        return this.timestamp;
    }

    @NotNull
    public final String component3() {
        return this.resourceId;
    }

    public final int component4() {
        return this.type;
    }

    @NotNull
    public final String component5() {
        return this.content;
    }

    @NotNull
    public final RecentlyUsedEntity copy(long j7, long j8, @NotNull String str, int i7, @NotNull String str2) {
        return new RecentlyUsedEntity(j7, j8, str, i7, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyUsedEntity)) {
            return false;
        }
        RecentlyUsedEntity recentlyUsedEntity = (RecentlyUsedEntity) obj;
        return this.id == recentlyUsedEntity.id && this.timestamp == recentlyUsedEntity.timestamp && Intrinsics.areEqual(this.resourceId, recentlyUsedEntity.resourceId) && this.type == recentlyUsedEntity.type && Intrinsics.areEqual(this.content, recentlyUsedEntity.content);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getResourceId() {
        return this.resourceId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content.hashCode() + I.a(this.type, E.a(C3554n0.a(Long.hashCode(this.id) * 31, 31, this.timestamp), 31, this.resourceId), 31);
    }

    public final void setContent(@NotNull String str) {
        this.content = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setResourceId(@NotNull String str) {
        this.resourceId = str;
    }

    public final void setTimestamp(long j7) {
        this.timestamp = j7;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        long j8 = this.timestamp;
        String str = this.resourceId;
        int i7 = this.type;
        String str2 = this.content;
        StringBuilder sbA = z.a(j7, "RecentlyUsedEntity(id=", ", timestamp=");
        d.a(j8, ", resourceId=", str, sbA);
        l.a(i7, ", type=", ", content=", str2, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
