package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.OgvClipInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchOgvClipInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchOgvClipInfo {
    public static final int $stable = 8;

    @JSONField(name = "play_end_time")
    private long playEndTime;

    @JSONField(name = "play_start_time")
    private long playStartTime;

    public SearchOgvClipInfo() {
        this(0L, 0L, 3, null);
    }

    public SearchOgvClipInfo(long j7, long j8) {
        this.playStartTime = j7;
        this.playEndTime = j8;
    }

    public /* synthetic */ SearchOgvClipInfo(long j7, long j8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? -1L : j7, (i7 & 2) != 0 ? -1L : j8);
    }

    public SearchOgvClipInfo(@NotNull OgvClipInfo ogvClipInfo) {
        this(ogvClipInfo.getPlayStartTime(), ogvClipInfo.getPlayEndTime());
    }

    public static /* synthetic */ SearchOgvClipInfo copy$default(SearchOgvClipInfo searchOgvClipInfo, long j7, long j8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = searchOgvClipInfo.playStartTime;
        }
        if ((i7 & 2) != 0) {
            j8 = searchOgvClipInfo.playEndTime;
        }
        return searchOgvClipInfo.copy(j7, j8);
    }

    public final long component1() {
        return this.playStartTime;
    }

    public final long component2() {
        return this.playEndTime;
    }

    @NotNull
    public final SearchOgvClipInfo copy(long j7, long j8) {
        return new SearchOgvClipInfo(j7, j8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchOgvClipInfo)) {
            return false;
        }
        SearchOgvClipInfo searchOgvClipInfo = (SearchOgvClipInfo) obj;
        return this.playStartTime == searchOgvClipInfo.playStartTime && this.playEndTime == searchOgvClipInfo.playEndTime;
    }

    @JSONField(serialize = false)
    public final long getEndTimeMills() {
        return this.playEndTime * ((long) 1000);
    }

    public final long getPlayEndTime() {
        return this.playEndTime;
    }

    public final long getPlayStartTime() {
        return this.playStartTime;
    }

    @JSONField(serialize = false)
    public final long getStartTimeMills() {
        return this.playStartTime * ((long) 1000);
    }

    public int hashCode() {
        return Long.hashCode(this.playEndTime) + (Long.hashCode(this.playStartTime) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @com.alibaba.fastjson.annotation.JSONField(deserialize = false, serialize = false)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isValid() {
        /*
            r5 = this;
            r0 = r5
            long r0 = r0.playStartTime
            r6 = r0
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2c
            r0 = r5
            long r0 = r0.playEndTime
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2c
            r0 = r6
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2c
            r0 = r8
            r1 = r6
            long r0 = r0 - r1
            r1 = 10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L2c
            r0 = 1
            r10 = r0
            goto L2f
        L2c:
            r0 = 0
            r10 = r0
        L2f:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchOgvClipInfo.isValid():boolean");
    }

    public final void setPlayEndTime(long j7) {
        this.playEndTime = j7;
    }

    public final void setPlayStartTime(long j7) {
        this.playStartTime = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.playStartTime;
        return android.support.v4.media.session.a.a(z.a(j7, "SearchOgvClipInfo(playStartTime=", ", playEndTime="), this.playEndTime, ")");
    }
}
