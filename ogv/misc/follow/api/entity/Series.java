package com.bilibili.ogv.misc.follow.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Series.class */
@StabilityInferred(parameters = 0)
@Bson
@Parcelize
public final class Series implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Series> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f69152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("list")
    @NotNull
    private List<SeriesItem> f69153c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/Series$a.class */
    public static final class a implements Parcelable.Creator<Series> {
        @Override // android.os.Parcelable.Creator
        public final Series createFromParcel(Parcel parcel) {
            int i7 = parcel.readInt();
            String string = parcel.readString();
            int i8 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                arrayList.add(parcel.readParcelable(Series.class.getClassLoader()));
            }
            return new Series(i7, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Series[] newArray(int i7) {
            return new Series[i7];
        }
    }

    public Series() {
        this(null, null, 0, 7);
    }

    public Series(int i7, @Nullable String str, @NotNull List<SeriesItem> list) {
        this.f69151a = i7;
        this.f69152b = str;
        this.f69153c = list;
    }

    public /* synthetic */ Series(String str, List list, int i7, int i8) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? "" : str, (i8 & 4) != 0 ? Collections.emptyList() : list);
    }

    @NotNull
    public final List<SeriesItem> a() {
        return this.f69153c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f69151a);
        parcel.writeString(this.f69152b);
        List<SeriesItem> list = this.f69153c;
        parcel.writeInt(list.size());
        Iterator<SeriesItem> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i7);
        }
    }
}
