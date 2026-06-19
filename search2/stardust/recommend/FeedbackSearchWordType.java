package com.bilibili.search2.stardust.recommend;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/FeedbackSearchWordType.class */
@Parcelize
public final class FeedbackSearchWordType implements Parcelable {
    private static final EnumEntries $ENTRIES;
    private static final FeedbackSearchWordType[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<FeedbackSearchWordType> CREATOR;
    public static final FeedbackSearchWordType SEARCH_DEFAULT = new FeedbackSearchWordType("SEARCH_DEFAULT", 0, "search_default");
    public static final FeedbackSearchWordType SEARCH_RECOMMEND = new FeedbackSearchWordType("SEARCH_RECOMMEND", 1, "search_recommend");

    @NotNull
    private final String value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/recommend/FeedbackSearchWordType$a.class */
    public static final class a implements Parcelable.Creator<FeedbackSearchWordType> {
        @Override // android.os.Parcelable.Creator
        public final FeedbackSearchWordType createFromParcel(Parcel parcel) {
            return FeedbackSearchWordType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeedbackSearchWordType[] newArray(int i7) {
            return new FeedbackSearchWordType[i7];
        }
    }

    private static final /* synthetic */ FeedbackSearchWordType[] $values() {
        return new FeedbackSearchWordType[]{SEARCH_DEFAULT, SEARCH_RECOMMEND};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.os.Parcelable$Creator<com.bilibili.search2.stardust.recommend.FeedbackSearchWordType>, java.lang.Object] */
    static {
        FeedbackSearchWordType[] feedbackSearchWordTypeArr$values = $values();
        $VALUES = feedbackSearchWordTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(feedbackSearchWordTypeArr$values);
        CREATOR = new Object();
    }

    private FeedbackSearchWordType(String str, int i7, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<FeedbackSearchWordType> getEntries() {
        return $ENTRIES;
    }

    public static FeedbackSearchWordType valueOf(String str) {
        return (FeedbackSearchWordType) Enum.valueOf(FeedbackSearchWordType.class, str);
    }

    public static FeedbackSearchWordType[] values() {
        return (FeedbackSearchWordType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(name());
    }
}
