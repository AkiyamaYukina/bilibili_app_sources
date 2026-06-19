package com.bilibili.ogv.misc.follow.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/NewEp.class */
@StabilityInferred(parameters = 0)
@Bson
@Parcelize
public final class NewEp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NewEp> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("index_show")
    @Nullable
    private String f69144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("is_new")
    private boolean f69145c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/NewEp$a.class */
    public static final class a implements Parcelable.Creator<NewEp> {
        @Override // android.os.Parcelable.Creator
        public final NewEp createFromParcel(Parcel parcel) {
            return new NewEp(parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final NewEp[] newArray(int i7) {
            return new NewEp[i7];
        }
    }

    public NewEp() {
        this(0L, 7, null, false);
    }

    public /* synthetic */ NewEp(long j7, int i7, String str, boolean z6) {
        this((i7 & 1) != 0 ? -1L : j7, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? false : z6);
    }

    public NewEp(long j7, @Nullable String str, boolean z6) {
        this.f69143a = j7;
        this.f69144b = str;
        this.f69145c = z6;
    }

    @Nullable
    public final String a() {
        return this.f69144b;
    }

    public final boolean b() {
        return this.f69145c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f69143a);
        parcel.writeString(this.f69144b);
        parcel.writeInt(this.f69145c ? 1 : 0);
    }
}
