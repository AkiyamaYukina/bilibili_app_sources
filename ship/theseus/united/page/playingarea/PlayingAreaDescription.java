package com.bilibili.ship.theseus.united.page.playingarea;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.ship.theseus.united.bean.VideoDimension;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaDescription.class */
@StabilityInferred(parameters = 1)
@Parcelize
public final class PlayingAreaDescription implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlayingAreaDescription> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f102326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Direction f102327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final VideoDimension f102328c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaDescription$Direction.class */
    public static final class Direction {
        private static final EnumEntries $ENTRIES;
        private static final Direction[] $VALUES;
        public static final Direction Horizontal = new Direction(TextSource.STR_SCROLL_HORIZONTAL, 0);
        public static final Direction Vertical = new Direction(TextSource.STR_SCROLL_VERTICAL, 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{Horizontal, Vertical};
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(directionArr$values);
        }

        private Direction(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaDescription$a.class */
    public static final class a {
        @NotNull
        public static PlayingAreaDescription a(@NotNull VideoDimension videoDimension) {
            return new PlayingAreaDescription(videoDimension.a(), videoDimension.a() >= 1.0f ? Direction.Horizontal : Direction.Vertical, videoDimension);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaDescription$b.class */
    public static final class b implements Parcelable.Creator<PlayingAreaDescription> {
        @Override // android.os.Parcelable.Creator
        public final PlayingAreaDescription createFromParcel(Parcel parcel) {
            return new PlayingAreaDescription(parcel.readFloat(), Direction.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : VideoDimension.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PlayingAreaDescription[] newArray(int i7) {
            return new PlayingAreaDescription[i7];
        }
    }

    public /* synthetic */ PlayingAreaDescription(float f7) {
        this(f7, f7 >= 1.0f ? Direction.Horizontal : Direction.Vertical, null);
    }

    public PlayingAreaDescription(float f7, @NotNull Direction direction, @Nullable VideoDimension videoDimension) {
        this.f102326a = f7;
        this.f102327b = direction;
        this.f102328c = videoDimension;
    }

    public final boolean a() {
        return this.f102327b == Direction.Vertical;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayingAreaDescription)) {
            return false;
        }
        PlayingAreaDescription playingAreaDescription = (PlayingAreaDescription) obj;
        return Float.compare(this.f102326a, playingAreaDescription.f102326a) == 0 && this.f102327b == playingAreaDescription.f102327b && Intrinsics.areEqual(this.f102328c, playingAreaDescription.f102328c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f102326a);
        int iHashCode2 = this.f102327b.hashCode();
        VideoDimension videoDimension = this.f102328c;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (videoDimension == null ? 0 : videoDimension.hashCode());
    }

    @NotNull
    public final String toString() {
        return "PlayingAreaDescription(aspectRatio=" + this.f102326a + ", direction=" + this.f102327b + ", videoDimension=" + this.f102328c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeFloat(this.f102326a);
        parcel.writeString(this.f102327b.name());
        VideoDimension videoDimension = this.f102328c;
        if (videoDimension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoDimension.writeToParcel(parcel, i7);
        }
    }
}
