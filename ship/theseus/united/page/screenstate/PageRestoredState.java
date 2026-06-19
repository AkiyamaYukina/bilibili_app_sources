package com.bilibili.ship.theseus.united.page.screenstate;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.AutoFullscreenService;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/PageRestoredState.class */
@StabilityInferred(parameters = 1)
@Parcelize
public final class PageRestoredState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PageRestoredState> CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f102945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f102946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f102947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Long f102948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AutoFullscreenService.FullscreenMode f102949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final PlayingAreaDescription f102950g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/screenstate/PageRestoredState$a.class */
    public static final class a implements Parcelable.Creator<PageRestoredState> {
        @Override // android.os.Parcelable.Creator
        public final PageRestoredState createFromParcel(Parcel parcel) {
            return new PageRestoredState(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), AutoFullscreenService.FullscreenMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : PlayingAreaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PageRestoredState[] newArray(int i7) {
            return new PageRestoredState[i7];
        }
    }

    public PageRestoredState(long j7, long j8, long j9, @NotNull String str, @Nullable Long l7, @NotNull AutoFullscreenService.FullscreenMode fullscreenMode, @Nullable PlayingAreaDescription playingAreaDescription) {
        this.f102944a = j7;
        this.f102945b = j8;
        this.f102946c = j9;
        this.f102947d = str;
        this.f102948e = l7;
        this.f102949f = fullscreenMode;
        this.f102950g = playingAreaDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f102944a);
        parcel.writeLong(this.f102945b);
        parcel.writeLong(this.f102946c);
        parcel.writeString(this.f102947d);
        Long l7 = this.f102948e;
        if (l7 == null) {
            parcel.writeInt(0);
        } else {
            cf.d.a(parcel, 1, l7);
        }
        parcel.writeString(this.f102949f.name());
        PlayingAreaDescription playingAreaDescription = this.f102950g;
        if (playingAreaDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            playingAreaDescription.writeToParcel(parcel, i7);
        }
    }
}
