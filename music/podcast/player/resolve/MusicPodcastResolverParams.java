package com.bilibili.music.podcast.player.resolve;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.lib.media.resolver2.IResolveParams;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/player/resolve/MusicPodcastResolverParams.class */
public final class MusicPodcastResolverParams implements IResolveParams {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f66885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f66886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f66887d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f66889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66890g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f66891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f66892j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f66884a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66888e = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/player/resolve/MusicPodcastResolverParams$a.class */
    public static final class a implements Parcelable.Creator<MusicPodcastResolverParams> {
        @Override // android.os.Parcelable.Creator
        public final MusicPodcastResolverParams createFromParcel(Parcel parcel) {
            MusicPodcastResolverParams musicPodcastResolverParams = new MusicPodcastResolverParams();
            musicPodcastResolverParams.f66886c = parcel.readLong();
            musicPodcastResolverParams.f66887d = parcel.readLong();
            musicPodcastResolverParams.f66888e = parcel.readInt();
            musicPodcastResolverParams.f66889f = parcel.readInt();
            musicPodcastResolverParams.f66890g = parcel.readInt();
            musicPodcastResolverParams.h = parcel.readInt();
            musicPodcastResolverParams.f66891i = parcel.readLong();
            musicPodcastResolverParams.f66892j = parcel.readLong();
            return musicPodcastResolverParams;
        }

        @Override // android.os.Parcelable.Creator
        public final MusicPodcastResolverParams[] newArray(int i7) {
            return new MusicPodcastResolverParams[i7];
        }
    }

    public MusicPodcastResolverParams() {
        this.f66892j = IjkOptionsHelper.getVolumeBalance() ? 1L : 0L;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: getCodecType-eY-7Wcs, reason: not valid java name */
    public final int m7183getCodecTypeeY7Wcs() {
        return this.f66884a;
    }

    public final int getDomainParams() {
        return this.h;
    }

    public final int getFormat() {
        return this.f66885b;
    }

    @NotNull
    public final String getFrom() {
        return "podcast";
    }

    @NotNull
    public final String getId() {
        return ec.a.a(this.f66886c, this.f66887d, "+");
    }

    /* JADX INFO: renamed from: setCodecType-N6j8eWo, reason: not valid java name */
    public final void m7184setCodecTypeN6j8eWo(int i7) {
        this.f66884a = i7;
    }

    public final void setDomainParams(int i7) {
        this.h = i7;
    }

    public final void setFormat(int i7) {
        this.f66885b = i7;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.f66886c);
        parcel.writeLong(this.f66887d);
        parcel.writeInt(this.f66888e);
        parcel.writeInt(this.f66889f);
        parcel.writeInt(this.f66890g);
        parcel.writeInt(this.h);
        parcel.writeLong(this.f66891i);
        parcel.writeLong(this.f66892j);
    }
}
