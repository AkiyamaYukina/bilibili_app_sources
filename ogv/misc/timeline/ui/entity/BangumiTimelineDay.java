package com.bilibili.ogv.misc.timeline.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimelineDay.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiTimelineDay implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<BangumiTimelineDay> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("date")
    @Nullable
    private String f69544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("date_ts")
    private long f69545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("day_of_week")
    private int f69546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("is_today")
    private boolean f69547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("day_update_text")
    @Nullable
    private String f69548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("episodes")
    @Nullable
    private List<BangumiTimeline> f69549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f69550g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/entity/BangumiTimelineDay$a.class */
    public static final class a implements Parcelable.Creator<BangumiTimelineDay> {
        @Override // android.os.Parcelable.Creator
        public final BangumiTimelineDay createFromParcel(Parcel parcel) {
            return new BangumiTimelineDay(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BangumiTimelineDay[] newArray(int i7) {
            return new BangumiTimelineDay[i7];
        }
    }

    public BangumiTimelineDay() {
        this.f69550g = -1;
    }

    public BangumiTimelineDay(@NotNull Parcel parcel) {
        this.f69550g = -1;
        this.f69544a = parcel.readString();
        this.f69545b = parcel.readLong();
        this.f69546c = parcel.readInt();
        this.f69547d = parcel.readByte() != 0;
        this.f69549f = parcel.createTypedArrayList(BangumiTimeline.CREATOR);
        this.f69548e = parcel.readString();
        this.f69550g = parcel.readInt();
    }

    public final int a(int i7) {
        List<BangumiTimeline> list = this.f69549f;
        if (list == null) {
            return -1;
        }
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f69549f.get(i8) != null && this.f69549f.get(i8).h() && this.f69549f.get(i8).f69532m == i7) {
                return i8;
            }
        }
        return -1;
    }

    public final void b(long j7) {
        List<BangumiTimeline> list;
        if (this.f69550g != -1 || (list = this.f69549f) == null) {
            return;
        }
        this.f69550g = 0;
        Iterator<BangumiTimeline> it = list.iterator();
        long j8 = -1;
        while (true) {
            long j9 = j8;
            if (!it.hasNext()) {
                return;
            }
            BangumiTimeline next = it.next();
            long j10 = next.f69530k;
            boolean z6 = true;
            if (j10 <= j7) {
                this.f69550g++;
            }
            if (j10 == j9) {
                z6 = false;
            }
            next.f69540u = z6;
            j8 = j10;
        }
    }

    @Nullable
    public final String c() {
        return this.f69544a;
    }

    public final long d() {
        return this.f69545b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long h() {
        return this.f69545b * ((long) 1000);
    }

    public final int i() {
        return this.f69546c;
    }

    @Nullable
    public final String j() {
        return this.f69548e;
    }

    @Nullable
    public final List<BangumiTimeline> m() {
        return this.f69549f;
    }

    public final boolean n() {
        return this.f69547d;
    }

    public final void o(@Nullable String str) {
        this.f69544a = str;
    }

    public final void q(long j7) {
        this.f69545b = j7;
    }

    public final void r(int i7) {
        this.f69546c = i7;
    }

    public final void s(@Nullable String str) {
        this.f69548e = str;
    }

    public final void u(@Nullable List<BangumiTimeline> list) {
        this.f69549f = list;
    }

    public final void v(boolean z6) {
        this.f69547d = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f69544a);
        parcel.writeLong(this.f69545b);
        parcel.writeInt(this.f69546c);
        parcel.writeByte(this.f69547d ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f69549f);
        parcel.writeString(this.f69548e);
        parcel.writeInt(this.f69550g);
    }
}
