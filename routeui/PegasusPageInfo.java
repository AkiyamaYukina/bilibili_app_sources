package com.bilibili.routeui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/PegasusPageInfo.class */
@StabilityInferred(parameters = 0)
public final class PegasusPageInfo implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f86270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f86271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f86272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Bundle f86273d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/PegasusPageInfo$a.class */
    public static final class a implements Parcelable.Creator<PegasusPageInfo> {
        @Override // android.os.Parcelable.Creator
        public final PegasusPageInfo createFromParcel(Parcel parcel) {
            return new PegasusPageInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PegasusPageInfo[] newArray(int i7) {
            return new PegasusPageInfo[i7];
        }
    }

    public PegasusPageInfo(Parcel parcel) {
        Object value = parcel.readValue(Integer.TYPE.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = parcel.readBundle(Bundle.class.getClassLoader());
        this.f86270a = num;
        this.f86271b = string;
        this.f86272c = string2;
        this.f86273d = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeValue(this.f86270a);
        parcel.writeString(this.f86271b);
        parcel.writeString(this.f86272c);
        parcel.writeBundle(this.f86273d);
    }
}
