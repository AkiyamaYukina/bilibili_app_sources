package com.bilibili.playerbizcommon.features.interactvideo.model;

import G0.d;
import I.E;
import N1.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.snapshots.z;
import cf.i;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/Story.class */
@Keep
public final class Story implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @JSONField(name = "cid")
    private long cid;

    @JSONField(name = "cover")
    @NotNull
    private String cover;

    @JSONField(name = "is_current")
    private int current;

    @JSONField(name = "cursor")
    private int cursor;

    @JSONField(name = "edge_id")
    private long id;

    @JSONField(name = "start_pos")
    private long startPosition;

    @JSONField(name = "title")
    @NotNull
    private String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/Story$a.class */
    public static final class a implements Parcelable.Creator<Story> {
        @Override // android.os.Parcelable.Creator
        public final Story createFromParcel(Parcel parcel) {
            return new Story(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Story[] newArray(int i7) {
            return new Story[i7];
        }
    }

    public Story() {
        this(0L, 0L, null, 0, 0L, null, 0, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public Story(long j7, long j8, @NotNull String str, int i7, long j9, @NotNull String str2, int i8) {
        this.id = j7;
        this.cid = j8;
        this.title = str;
        this.current = i7;
        this.startPosition = j9;
        this.cover = str2;
        this.cursor = i8;
    }

    public /* synthetic */ Story(long j7, long j8, String str, int i7, long j9, String str2, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0L : j7, (i9 & 2) != 0 ? 0L : j8, (i9 & 4) != 0 ? "" : str, (i9 & 8) != 0 ? 0 : i7, (i9 & 16) != 0 ? 0L : j9, (i9 & 32) != 0 ? "" : str2, (i9 & 64) != 0 ? 0 : i8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Story(@NotNull Parcel parcel) {
        long j7 = parcel.readLong();
        long j8 = parcel.readLong();
        String string = parcel.readString();
        string = string == null ? "" : string;
        int i7 = parcel.readInt();
        long j9 = parcel.readLong();
        String string2 = parcel.readString();
        this(j7, j8, string, i7, j9, string2 == null ? "" : string2, parcel.readInt());
    }

    public static /* synthetic */ Story copy$default(Story story, long j7, long j8, String str, int i7, long j9, String str2, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j7 = story.id;
        }
        if ((i9 & 2) != 0) {
            j8 = story.cid;
        }
        if ((i9 & 4) != 0) {
            str = story.title;
        }
        if ((i9 & 8) != 0) {
            i7 = story.current;
        }
        if ((i9 & 16) != 0) {
            j9 = story.startPosition;
        }
        if ((i9 & 32) != 0) {
            str2 = story.cover;
        }
        if ((i9 & 64) != 0) {
            i8 = story.cursor;
        }
        return story.copy(j7, j8, str, i7, j9, str2, i8);
    }

    public final long component1() {
        return this.id;
    }

    public final long component2() {
        return this.cid;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.current;
    }

    public final long component5() {
        return this.startPosition;
    }

    @NotNull
    public final String component6() {
        return this.cover;
    }

    public final int component7() {
        return this.cursor;
    }

    @NotNull
    public final Story copy(long j7, long j8, @NotNull String str, int i7, long j9, @NotNull String str2, int i8) {
        return new Story(j7, j8, str, i7, j9, str2, i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Story)) {
            return false;
        }
        Story story = (Story) obj;
        return this.id == story.id && this.cid == story.cid && Intrinsics.areEqual(this.title, story.title) && this.current == story.current && this.startPosition == story.startPosition && Intrinsics.areEqual(this.cover, story.cover) && this.cursor == story.cursor;
    }

    public final long getCid() {
        return this.cid;
    }

    @NotNull
    public final String getCover() {
        return this.cover;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final long getId() {
        return this.id;
    }

    public final long getStartPosition() {
        return this.startPosition;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.cursor) + E.a(C3554n0.a(I.a(this.current, E.a(C3554n0.a(Long.hashCode(this.id) * 31, 31, this.cid), 31, this.title), 31), 31, this.startPosition), 31, this.cover);
    }

    public final void setCid(long j7) {
        this.cid = j7;
    }

    public final void setCover(@NotNull String str) {
        this.cover = str;
    }

    public final void setCurrent(int i7) {
        this.current = i7;
    }

    public final void setCursor(int i7) {
        this.cursor = i7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setStartPosition(long j7) {
        this.startPosition = j7;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        long j8 = this.cid;
        String str = this.title;
        int i7 = this.current;
        long j9 = this.startPosition;
        String str2 = this.cover;
        int i8 = this.cursor;
        StringBuilder sbA = z.a(j7, "Story(id=", ", cid=");
        d.a(j8, ", title=", str, sbA);
        c.a(i7, ", current=", ", startPosition=", sbA);
        d.a(j9, ", cover=", str2, sbA);
        return i.a(i8, ", cursor=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeLong(this.cid);
        parcel.writeString(this.title);
        parcel.writeInt(this.current);
        parcel.writeLong(this.startPosition);
        parcel.writeString(this.cover);
        parcel.writeInt(this.cursor);
    }
}
