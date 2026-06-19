package com.bilibili.studio.videoeditor.capturev3.music.bean;

import B0.b;
import I.E;
import J1.z;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.media3.common.G;
import cf.l;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/bean/MusicInfo.class */
@Keep
public final class MusicInfo {

    @NotNull
    public static final a Companion = new Object();
    public static final int FROM_ACTIVITY = 0;
    public static final int FROM_MUSIC = 1;
    public static final int FROM_STICKER = 2;
    public static final int STATE_DOWNLOADED = 3;
    public static final int STATE_DOWNLOADING = 2;
    public static final int STATE_ERROR = 4;
    public static final int STATE_NONE = 1;
    public static final int TYPE_LOCAL = 0;
    public static final int TYPE_NET = 1;

    @Nullable
    private Bgm bgm;
    private long duration;
    private int from;
    private long id;
    private long initProgress;

    @NotNull
    private String localPath;

    @NotNull
    private String name;
    private long startTime;
    private int state;
    private int type;

    @NotNull
    private String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/bean/MusicInfo$a.class */
    public static final class a {
    }

    public MusicInfo() {
        this(0L, null, 0, null, null, 0L, 0L, 0L, 0, 0, null, 2047, null);
    }

    public MusicInfo(long j7, @NotNull String str, int i7, @NotNull String str2, @NotNull String str3, long j8, long j9, long j10, int i8, int i9, @Nullable Bgm bgm) {
        this.id = j7;
        this.name = str;
        this.type = i7;
        this.url = str2;
        this.localPath = str3;
        this.startTime = j8;
        this.initProgress = j9;
        this.duration = j10;
        this.state = i8;
        this.from = i9;
        this.bgm = bgm;
    }

    public /* synthetic */ MusicInfo(long j7, String str, int i7, String str2, String str3, long j8, long j9, long j10, int i8, int i9, Bgm bgm, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j7, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? 0 : i7, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? "" : str3, (i10 & 32) != 0 ? 0L : j8, (i10 & 64) != 0 ? 0L : j9, (i10 & 128) != 0 ? 0L : j10, (i10 & 256) != 0 ? 1 : i8, (i10 & 512) != 0 ? 1 : i9, (i10 & 1024) != 0 ? null : bgm);
    }

    public static /* synthetic */ MusicInfo copy$default(MusicInfo musicInfo, long j7, String str, int i7, String str2, String str3, long j8, long j9, long j10, int i8, int i9, Bgm bgm, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j7 = musicInfo.id;
        }
        if ((i10 & 2) != 0) {
            str = musicInfo.name;
        }
        if ((i10 & 4) != 0) {
            i7 = musicInfo.type;
        }
        if ((i10 & 8) != 0) {
            str2 = musicInfo.url;
        }
        if ((i10 & 16) != 0) {
            str3 = musicInfo.localPath;
        }
        if ((i10 & 32) != 0) {
            j8 = musicInfo.startTime;
        }
        if ((i10 & 64) != 0) {
            j9 = musicInfo.initProgress;
        }
        if ((i10 & 128) != 0) {
            j10 = musicInfo.duration;
        }
        if ((i10 & 256) != 0) {
            i8 = musicInfo.state;
        }
        if ((i10 & 512) != 0) {
            i9 = musicInfo.from;
        }
        if ((i10 & 1024) != 0) {
            bgm = musicInfo.bgm;
        }
        return musicInfo.copy(j7, str, i7, str2, str3, j8, j9, j10, i8, i9, bgm);
    }

    @NotNull
    public final MusicInfo clone() {
        MusicInfo musicInfo = new MusicInfo(0L, null, 0, null, null, 0L, 0L, 0L, 0, 0, null, 2047, null);
        musicInfo.id = this.id;
        musicInfo.name = this.name;
        musicInfo.type = this.type;
        musicInfo.url = this.url;
        musicInfo.localPath = this.localPath;
        musicInfo.duration = this.duration;
        musicInfo.startTime = this.startTime;
        musicInfo.initProgress = this.initProgress;
        musicInfo.duration = this.duration;
        musicInfo.state = this.state;
        musicInfo.from = this.from;
        musicInfo.from = this.from;
        Bgm bgm = this.bgm;
        musicInfo.bgm = bgm != null ? bgm.m10406clone() : null;
        return musicInfo;
    }

    public final long component1() {
        return this.id;
    }

    public final int component10() {
        return this.from;
    }

    @Nullable
    public final Bgm component11() {
        return this.bgm;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.type;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final String component5() {
        return this.localPath;
    }

    public final long component6() {
        return this.startTime;
    }

    public final long component7() {
        return this.initProgress;
    }

    public final long component8() {
        return this.duration;
    }

    public final int component9() {
        return this.state;
    }

    @NotNull
    public final MusicInfo copy(long j7, @NotNull String str, int i7, @NotNull String str2, @NotNull String str3, long j8, long j9, long j10, int i8, int i9, @Nullable Bgm bgm) {
        return new MusicInfo(j7, str, i7, str2, str3, j8, j9, j10, i8, i9, bgm);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicInfo)) {
            return false;
        }
        MusicInfo musicInfo = (MusicInfo) obj;
        return this.id == musicInfo.id && Intrinsics.areEqual(this.name, musicInfo.name) && this.type == musicInfo.type && Intrinsics.areEqual(this.url, musicInfo.url) && Intrinsics.areEqual(this.localPath, musicInfo.localPath) && this.startTime == musicInfo.startTime && this.initProgress == musicInfo.initProgress && this.duration == musicInfo.duration && this.state == musicInfo.state && this.from == musicInfo.from && Intrinsics.areEqual(this.bgm, musicInfo.bgm);
    }

    @Nullable
    public final Bgm getBgm() {
        return this.bgm;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getFrom() {
        return this.from;
    }

    public final long getId() {
        return this.id;
    }

    public final long getInitProgress() {
        return this.initProgress;
    }

    @NotNull
    public final String getLocalPath() {
        return this.localPath;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getState() {
        return this.state;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iA = I.a(this.from, I.a(this.state, C3554n0.a(C3554n0.a(C3554n0.a(E.a(E.a(I.a(this.type, E.a(Long.hashCode(this.id) * 31, 31, this.name), 31), 31, this.url), 31, this.localPath), 31, this.startTime), 31, this.initProgress), 31, this.duration), 31), 31);
        Bgm bgm = this.bgm;
        return iA + (bgm == null ? 0 : bgm.hashCode());
    }

    public final void setBgm(@Nullable Bgm bgm) {
        this.bgm = bgm;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setFrom(int i7) {
        this.from = i7;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setInitProgress(long j7) {
        this.initProgress = j7;
    }

    public final void setLocalPath(@NotNull String str) {
        this.localPath = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setStartTime(long j7) {
        this.startTime = j7;
    }

    public final void setState(int i7) {
        this.state = i7;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUrl(@NotNull String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.id;
        String str = this.name;
        int i7 = this.type;
        String str2 = this.url;
        String str3 = this.localPath;
        long j8 = this.startTime;
        long j9 = this.initProgress;
        long j10 = this.duration;
        int i8 = this.state;
        int i9 = this.from;
        Bgm bgm = this.bgm;
        StringBuilder sbA = n.a(j7, "MusicInfo(id=", ", name=", str);
        l.a(i7, ", type=", ", url=", str2, sbA);
        b.b(", localPath=", str3, ", startTime=", sbA);
        sbA.append(j8);
        z.a(j9, ", initProgress=", ", duration=", sbA);
        G.a(i8, j10, ", state=", sbA);
        sbA.append(", from=");
        sbA.append(i9);
        sbA.append(", bgm=");
        sbA.append(bgm);
        sbA.append(")");
        return sbA.toString();
    }
}
