package com.bilibili.studio.editor.repository.entity;

import G0.b;
import J1.z;
import androidx.annotation.Keep;
import androidx.fragment.app.A;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/entity/BiliEditorMusicRhythmFilter.class */
@Keep
public final class BiliEditorMusicRhythmFilter implements Serializable {
    private long duration;
    private long end;

    @Nullable
    private String filterName;

    @Nullable
    private String filterPackageId;
    private long inPoint;

    @Nullable
    private String name;
    private long start;

    @Nullable
    private String type;

    public final long getDuration() {
        return this.duration;
    }

    public final long getEnd() {
        return this.end;
    }

    @Nullable
    public final String getFilterName() {
        return this.filterName;
    }

    @Nullable
    public final String getFilterPackageId() {
        return this.filterPackageId;
    }

    public final long getInPoint() {
        return this.inPoint;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getStart() {
        return this.start;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setEnd(long j7) {
        this.end = j7;
    }

    public final void setFilterName(@Nullable String str) {
        this.filterName = str;
    }

    public final void setFilterPackageId(@Nullable String str) {
        this.filterPackageId = str;
    }

    public final void setInPoint(long j7) {
        this.inPoint = j7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setStart(long j7) {
        this.start = j7;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.type;
        long j7 = this.start;
        long j8 = this.end;
        long j9 = this.inPoint;
        long j10 = this.duration;
        String str3 = this.filterPackageId;
        String str4 = this.filterName;
        StringBuilder sbA = b.a("BiliEditorMusicRhythmFilter(name=", str, ", type=", str2, ", start=");
        sbA.append(j7);
        z.a(j8, ", end=", ", inPoint=", sbA);
        sbA.append(j9);
        z.a(j10, ", duration=", ", filterPackageId=", sbA);
        return A.a(str3, ", filterName=", str4, ")", sbA);
    }
}
