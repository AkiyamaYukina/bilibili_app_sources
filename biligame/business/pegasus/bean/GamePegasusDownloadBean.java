package com.bilibili.biligame.business.pegasus.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.game.service.bean.DownloadInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/bean/GamePegasusDownloadBean.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class GamePegasusDownloadBean implements Parcelable {

    @NotNull
    private DownloadInfo downloadInfo;
    private boolean isStartEd;
    private long time;

    @NotNull
    public static final Parcelable.Creator<GamePegasusDownloadBean> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/bean/GamePegasusDownloadBean$a.class */
    public static final class a implements Parcelable.Creator<GamePegasusDownloadBean> {
        @Override // android.os.Parcelable.Creator
        public final GamePegasusDownloadBean createFromParcel(Parcel parcel) {
            return new GamePegasusDownloadBean(parcel.readLong(), parcel.readParcelable(GamePegasusDownloadBean.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GamePegasusDownloadBean[] newArray(int i7) {
            return new GamePegasusDownloadBean[i7];
        }
    }

    public GamePegasusDownloadBean(long j7, @NotNull DownloadInfo downloadInfo) {
        this.time = j7;
        this.downloadInfo = downloadInfo;
    }

    public /* synthetic */ GamePegasusDownloadBean(long j7, DownloadInfo downloadInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, downloadInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        DownloadInfo downloadInfo = null;
        GamePegasusDownloadBean gamePegasusDownloadBean = obj instanceof GamePegasusDownloadBean ? (GamePegasusDownloadBean) obj : null;
        DownloadInfo downloadInfo2 = this.downloadInfo;
        if (gamePegasusDownloadBean != null) {
            downloadInfo = gamePegasusDownloadBean.downloadInfo;
        }
        return Intrinsics.areEqual(downloadInfo2, downloadInfo);
    }

    @NotNull
    public final DownloadInfo getDownloadInfo() {
        return this.downloadInfo;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.downloadInfo.hashCode();
    }

    public final boolean isStartEd() {
        return this.isStartEd;
    }

    public final void setDownloadInfo(@NotNull DownloadInfo downloadInfo) {
        this.downloadInfo = downloadInfo;
    }

    public final void setStartEd(boolean z6) {
        this.isStartEd = z6;
    }

    public final void setTime(long j7) {
        this.time = j7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.time);
        parcel.writeParcelable(this.downloadInfo, i7);
    }
}
