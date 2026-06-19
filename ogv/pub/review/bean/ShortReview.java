package com.bilibili.ogv.pub.review.bean;

import I.E;
import O4.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.core.I;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ShortReview.class */
@Bson
@Parcelize
public final class ShortReview implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShortReview> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f71753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ReviewAuthor f71754d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ShortReview$a.class */
    public static final class a implements Parcelable.Creator<ShortReview> {
        @Override // android.os.Parcelable.Creator
        public final ShortReview createFromParcel(Parcel parcel) {
            return new ShortReview(parcel.readLong(), parcel.readInt(), parcel.readString(), ReviewAuthor.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortReview[] newArray(int i7) {
            return new ShortReview[i7];
        }
    }

    public ShortReview(long j7, int i7, @NotNull String str, @NotNull ReviewAuthor reviewAuthor) {
        this.f71751a = j7;
        this.f71752b = i7;
        this.f71753c = str;
        this.f71754d = reviewAuthor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortReview)) {
            return false;
        }
        ShortReview shortReview = (ShortReview) obj;
        return this.f71751a == shortReview.f71751a && this.f71752b == shortReview.f71752b && Intrinsics.areEqual(this.f71753c, shortReview.f71753c) && Intrinsics.areEqual(this.f71754d, shortReview.f71754d);
    }

    public final int hashCode() {
        return this.f71754d.hashCode() + E.a(I.a(this.f71752b, Long.hashCode(this.f71751a) * 31, 31), 31, this.f71753c);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f71751a;
        int i7 = this.f71752b;
        String str = this.f71753c;
        ReviewAuthor reviewAuthor = this.f71754d;
        StringBuilder sbB = c.b(i7, j7, "ShortReview(review_id=", ", score=");
        sbB.append(", content=");
        sbB.append(str);
        sbB.append(", author=");
        sbB.append(reviewAuthor);
        sbB.append(")");
        return sbB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f71751a);
        parcel.writeInt(this.f71752b);
        parcel.writeString(this.f71753c);
        this.f71754d.writeToParcel(parcel, i7);
    }
}
