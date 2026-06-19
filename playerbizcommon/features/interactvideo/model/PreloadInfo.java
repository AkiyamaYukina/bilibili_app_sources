package com.bilibili.playerbizcommon.features.interactvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.account.interfaces.v1.k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/PreloadInfo.class */
@Keep
public final class PreloadInfo implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @JSONField(name = "video")
    @Nullable
    private List<Video> videos;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/PreloadInfo$a.class */
    public static final class a implements Parcelable.Creator<PreloadInfo> {
        @Override // android.os.Parcelable.Creator
        public final PreloadInfo createFromParcel(Parcel parcel) {
            return new PreloadInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PreloadInfo[] newArray(int i7) {
            return new PreloadInfo[i7];
        }
    }

    public PreloadInfo() {
        this(null, 1, null);
    }

    public PreloadInfo(@NotNull Parcel parcel) {
        this(parcel.createTypedArrayList(Video.CREATOR));
    }

    public PreloadInfo(@Nullable List<Video> list) {
        this.videos = list;
    }

    public /* synthetic */ PreloadInfo(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<Video>) ((i7 & 1) != 0 ? null : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreloadInfo copy$default(PreloadInfo preloadInfo, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = preloadInfo.videos;
        }
        return preloadInfo.copy(list);
    }

    @Nullable
    public final List<Video> component1() {
        return this.videos;
    }

    @NotNull
    public final PreloadInfo copy(@Nullable List<Video> list) {
        return new PreloadInfo(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreloadInfo) && Intrinsics.areEqual(this.videos, ((PreloadInfo) obj).videos);
    }

    @Nullable
    public final List<Video> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        List<Video> list = this.videos;
        return list == null ? 0 : list.hashCode();
    }

    public final void setVideos(@Nullable List<Video> list) {
        this.videos = list;
    }

    @NotNull
    public String toString() {
        return k.a("PreloadInfo(videos=", ")", this.videos);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeTypedList(this.videos);
    }
}
