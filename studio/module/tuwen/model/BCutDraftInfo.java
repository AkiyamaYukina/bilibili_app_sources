package com.bilibili.studio.module.tuwen.model;

import G0.b;
import I.E;
import J1.z;
import androidx.compose.foundation.C3554n0;
import androidx.exifinterface.media.a;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/model/BCutDraftInfo.class */
public final class BCutDraftInfo implements Serializable {

    @NotNull
    private String cover;
    private long createTime;
    private long duration;

    @NotNull
    private String id;
    private long size;

    @NotNull
    private String title;
    private long updateTime;

    public BCutDraftInfo(@NotNull String str, @NotNull String str2, long j7, long j8, @NotNull String str3, long j9, long j10) {
        this.id = str;
        this.title = str2;
        this.createTime = j7;
        this.updateTime = j8;
        this.cover = str3;
        this.duration = j9;
        this.size = j10;
    }

    public static /* synthetic */ BCutDraftInfo copy$default(BCutDraftInfo bCutDraftInfo, String str, String str2, long j7, long j8, String str3, long j9, long j10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = bCutDraftInfo.id;
        }
        if ((i7 & 2) != 0) {
            str2 = bCutDraftInfo.title;
        }
        if ((i7 & 4) != 0) {
            j7 = bCutDraftInfo.createTime;
        }
        if ((i7 & 8) != 0) {
            j8 = bCutDraftInfo.updateTime;
        }
        if ((i7 & 16) != 0) {
            str3 = bCutDraftInfo.cover;
        }
        if ((i7 & 32) != 0) {
            j9 = bCutDraftInfo.duration;
        }
        if ((i7 & 64) != 0) {
            j10 = bCutDraftInfo.size;
        }
        return bCutDraftInfo.copy(str, str2, j7, j8, str3, j9, j10);
    }

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    public final long component3() {
        return this.createTime;
    }

    public final long component4() {
        return this.updateTime;
    }

    @NotNull
    public final String component5() {
        return this.cover;
    }

    public final long component6() {
        return this.duration;
    }

    public final long component7() {
        return this.size;
    }

    @NotNull
    public final BCutDraftInfo copy(@NotNull String str, @NotNull String str2, long j7, long j8, @NotNull String str3, long j9, long j10) {
        return new BCutDraftInfo(str, str2, j7, j8, str3, j9, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCutDraftInfo)) {
            return false;
        }
        BCutDraftInfo bCutDraftInfo = (BCutDraftInfo) obj;
        return Intrinsics.areEqual(this.id, bCutDraftInfo.id) && Intrinsics.areEqual(this.title, bCutDraftInfo.title) && this.createTime == bCutDraftInfo.createTime && this.updateTime == bCutDraftInfo.updateTime && Intrinsics.areEqual(this.cover, bCutDraftInfo.cover) && this.duration == bCutDraftInfo.duration && this.size == bCutDraftInfo.size;
    }

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + C3554n0.a(E.a(C3554n0.a(C3554n0.a(E.a(this.id.hashCode() * 31, 31, this.title), 31, this.createTime), 31, this.updateTime), 31, this.cover), 31, this.duration);
    }

    public final void setCover(@NotNull String str) {
        this.cover = str;
    }

    public final void setCreateTime(long j7) {
        this.createTime = j7;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    public final void setSize(long j7) {
        this.size = j7;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setUpdateTime(long j7) {
        this.updateTime = j7;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        long j7 = this.createTime;
        long j8 = this.updateTime;
        String str3 = this.cover;
        long j9 = this.duration;
        long j10 = this.size;
        StringBuilder sbA = b.a("BCutDraftInfo(id=", str, ", title=", str2, ", createTime=");
        sbA.append(j7);
        z.a(j8, ", updateTime=", ", cover=", sbA);
        v.a(j9, str3, ", duration=", sbA);
        return a.a(j10, ", size=", ")", sbA);
    }
}
