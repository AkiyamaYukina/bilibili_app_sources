package com.bilibili.lib.projection.internal.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/CastFeedbackData.class */
@Keep
public final class CastFeedbackData implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @Nullable
    private List<CastFeedback> data;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/CastFeedbackData$CastFeedback.class */
    @Keep
    public static final class CastFeedback implements Parcelable {

        @NotNull
        public static final a CREATOR = new Object();

        @NotNull
        private String content;
        private int index;

        @NotNull
        private String name;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/CastFeedbackData$CastFeedback$a.class */
        public static final class a implements Parcelable.Creator<CastFeedback> {
            @Override // android.os.Parcelable.Creator
            public final CastFeedback createFromParcel(Parcel parcel) {
                return new CastFeedback(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CastFeedback[] newArray(int i7) {
                return new CastFeedback[i7];
            }
        }

        public CastFeedback() {
            this.name = "";
            this.content = "";
        }

        public CastFeedback(@NotNull Parcel parcel) {
            this();
            this.index = parcel.readInt();
            this.name = String.valueOf(parcel.readString());
            this.content = String.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final void setContent(@NotNull String str) {
            this.content = str;
        }

        public final void setIndex(int i7) {
            this.index = i7;
        }

        public final void setName(@NotNull String str) {
            this.name = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeInt(this.index);
            parcel.writeString(this.name);
            parcel.writeString(this.content);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/CastFeedbackData$a.class */
    public static final class a implements Parcelable.Creator<CastFeedbackData> {
        @Override // android.os.Parcelable.Creator
        public final CastFeedbackData createFromParcel(Parcel parcel) {
            return new CastFeedbackData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CastFeedbackData[] newArray(int i7) {
            return new CastFeedbackData[i7];
        }
    }

    public CastFeedbackData() {
    }

    public CastFeedbackData(@NotNull Parcel parcel) {
        this();
        this.data = parcel.createTypedArrayList(CastFeedback.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<CastFeedback> getData() {
        return this.data;
    }

    public final void setData(@Nullable List<CastFeedback> list) {
        this.data = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeTypedList(this.data);
    }
}
