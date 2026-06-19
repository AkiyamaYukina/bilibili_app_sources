package com.bilibili.ogv.pub.review.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.JvmField;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/SimpleRating.class */
@Bson
@Parcelize
public final class SimpleRating implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SimpleRating> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JvmField
    public int f71756a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/SimpleRating$a.class */
    public static final class a implements Parcelable.Creator<SimpleRating> {
        @Override // android.os.Parcelable.Creator
        public final SimpleRating createFromParcel(Parcel parcel) {
            return new SimpleRating(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleRating[] newArray(int i7) {
            return new SimpleRating[i7];
        }
    }

    public SimpleRating() {
        this(0, 1);
    }

    public SimpleRating(int i7) {
        this.f71756a = i7;
    }

    public /* synthetic */ SimpleRating(int i7, int i8) {
        this((i8 & 1) != 0 ? 0 : i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f71756a);
    }
}
