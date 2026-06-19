package com.bilibili.ogv.misc.follow.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/ItemData.class */
@StabilityInferred(parameters = 0)
@Bson
public class ItemData implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("season_id")
    private long f69127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("season_type")
    private int f69128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("season_type_name")
    @Nullable
    private String f69129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f69130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f69131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("badge_type")
    private int f69132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("badge_info")
    @Nullable
    private BangumiBadgeInfo f69133g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("square_cover")
    @Nullable
    private String f69134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("areas")
    @NotNull
    private List<Areas> f69135j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("new_ep")
    @Nullable
    private NewEp f69136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public Progress f69137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f69138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f69139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient boolean f69140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient int f69141p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/ItemData$a.class */
    public static final class a implements Parcelable.Creator<ItemData> {
        @Override // android.os.Parcelable.Creator
        public final ItemData createFromParcel(Parcel parcel) {
            return new ItemData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemData[] newArray(int i7) {
            return new ItemData[i7];
        }
    }

    public ItemData() {
        this.f69127a = -1L;
        this.f69128b = -1;
        this.f69129c = "";
        this.f69130d = "";
        this.f69131e = "";
        this.f69132f = -1;
        this.h = "";
        this.f69134i = "";
        this.f69135j = Collections.emptyList();
        this.f69138m = "";
        this.f69141p = 1;
    }

    public ItemData(@NotNull Parcel parcel) throws IllegalAccessException {
        this();
        this.f69127a = parcel.readLong();
        this.f69128b = parcel.readInt();
        this.f69129c = parcel.readString();
        this.f69130d = parcel.readString();
        this.f69131e = parcel.readString();
        this.f69132f = parcel.readInt();
        this.f69133g = (BangumiBadgeInfo) parcel.readParcelable(BangumiBadgeInfo.class.getClassLoader());
        this.h = parcel.readString();
        this.f69134i = parcel.readString();
        Parcelable.Creator creator = null;
        Object obj = Areas.class.getDeclaredField("CREATOR").get(null);
        creator = obj instanceof Parcelable.Creator ? (Parcelable.Creator) obj : creator;
        if (creator == null) {
            throw new IllegalArgumentException("Could not access CREATOR field in class " + Reflection.getOrCreateKotlinClass(Areas.class).getSimpleName());
        }
        this.f69135j = parcel.createTypedArrayList(creator);
        this.f69136k = (NewEp) parcel.readParcelable(NewEp.class.getClassLoader());
        this.f69137l = (Progress) parcel.readParcelable(Progress.class.getClassLoader());
        this.f69138m = parcel.readString();
        this.f69139n = parcel.readByte() != 0;
        this.f69140o = parcel.readByte() != 0;
        this.f69141p = parcel.readInt();
    }

    @NotNull
    public final List<Areas> a() {
        return this.f69135j;
    }

    public final int b() {
        return this.f69132f;
    }

    @Nullable
    public final NewEp c() {
        return this.f69136k;
    }

    public final long d() {
        return this.f69127a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int h() {
        return this.f69128b;
    }

    @Nullable
    public final String i() {
        return this.f69129c;
    }

    @Nullable
    public final String j() {
        return this.f69134i;
    }

    @Nullable
    public final BangumiBadgeInfo m() {
        return this.f69133g;
    }

    public final void n(@NotNull List<Areas> list) {
        this.f69135j = list;
    }

    public final void o(int i7) {
        this.f69132f = i7;
    }

    public final void q(@Nullable NewEp newEp) {
        this.f69136k = newEp;
    }

    public final void r(long j7) {
        this.f69127a = j7;
    }

    public final void s(int i7) {
        this.f69128b = i7;
    }

    public final void u(@Nullable String str) {
        this.f69129c = str;
    }

    public final void v(@Nullable String str) {
        this.f69134i = str;
    }

    public final void w(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f69133g = bangumiBadgeInfo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f69127a);
        parcel.writeInt(this.f69128b);
        parcel.writeString(this.f69129c);
        parcel.writeString(this.f69130d);
        parcel.writeString(this.f69131e);
        parcel.writeInt(this.f69132f);
        parcel.writeParcelable(this.f69133g, i7);
        parcel.writeString(this.h);
        parcel.writeString(this.f69134i);
        parcel.writeTypedList(this.f69135j);
        parcel.writeParcelable(this.f69136k, i7);
        parcel.writeParcelable(this.f69137l, i7);
        parcel.writeString(this.f69138m);
        parcel.writeByte(this.f69139n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f69140o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f69141p);
    }
}
