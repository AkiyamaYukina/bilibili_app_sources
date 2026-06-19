package com.bilibili.search2.stardust.recommend;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/FeedbackSearchWord.class */
@StabilityInferred(parameters = 0)
@Parcelize
public final class FeedbackSearchWord implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FeedbackSearchWord> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f88767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f88768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final FeedbackSearchWordType f88769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88770d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/FeedbackSearchWord$a.class */
    public static final class a implements Parcelable.Creator<FeedbackSearchWord> {
        @Override // android.os.Parcelable.Creator
        public final FeedbackSearchWord createFromParcel(Parcel parcel) {
            return new FeedbackSearchWord(parcel.readString(), parcel.readString(), FeedbackSearchWordType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbackSearchWord[] newArray(int i7) {
            return new FeedbackSearchWord[i7];
        }
    }

    public FeedbackSearchWord(@Nullable String str, @Nullable String str2, @NotNull FeedbackSearchWordType feedbackSearchWordType, boolean z6) {
        this.f88767a = str;
        this.f88768b = str2;
        this.f88769c = feedbackSearchWordType;
        this.f88770d = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackSearchWord)) {
            return false;
        }
        FeedbackSearchWord feedbackSearchWord = (FeedbackSearchWord) obj;
        return Intrinsics.areEqual(this.f88767a, feedbackSearchWord.f88767a) && Intrinsics.areEqual(this.f88768b, feedbackSearchWord.f88768b) && this.f88769c == feedbackSearchWord.f88769c && this.f88770d == feedbackSearchWord.f88770d;
    }

    public final int hashCode() {
        String str = this.f88767a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f88768b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Boolean.hashCode(this.f88770d) + ((this.f88769c.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f88767a;
        String str2 = this.f88768b;
        FeedbackSearchWordType feedbackSearchWordType = this.f88769c;
        boolean z6 = this.f88770d;
        StringBuilder sbA = b.a("FeedbackSearchWord(showName=", str, ", trackId=", str2, ", type=");
        sbA.append(feedbackSearchWordType);
        sbA.append(", isSelected=");
        sbA.append(z6);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f88767a);
        parcel.writeString(this.f88768b);
        this.f88769c.writeToParcel(parcel, i7);
        parcel.writeInt(this.f88770d ? 1 : 0);
    }
}
