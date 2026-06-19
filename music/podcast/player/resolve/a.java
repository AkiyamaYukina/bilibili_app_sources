package com.bilibili.music.podcast.player.resolve;

import com.bapis.bilibili.app.listener.v1.PlayInfo;
import com.bilibili.lib.media.resolver.exception.ResolveMediaSourceException;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.music.podcast.player.resolve.MusicPodcastResolver;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.C8397q;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.resolve.AbsMediaResourceResolveTask;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/player/resolve/a.class */
public final class a extends AbsMediaResourceResolveTask {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MusicPodcastResolverParams f66893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final PlayInfo f66894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public AbsMediaResourceResolveTask.ErrorInfo f66895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public MediaResource f66896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public AbsMediaResourceResolveTask.IHistoryProgressReader f66897q;

    public a(@Nullable PlayInfo playInfo, @NotNull MusicPodcastResolverParams musicPodcastResolverParams) {
        this.f66893m = musicPodcastResolverParams;
        this.f66894n = playInfo;
    }

    public final void cancel() {
    }

    @NotNull
    public final String getDescription() {
        return "MusicPodcastFlashMediaResourceResolveTask";
    }

    public final Object getError() {
        return this.f66895o;
    }

    public final Object getResult() {
        MediaResource mediaResource = this.f66896p;
        MediaResource backupResult = mediaResource;
        if (mediaResource == null) {
            backupResult = getBackupResult();
        }
        return backupResult;
    }

    public final boolean isAsynchronous() {
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.bilibili.lib.media.resolver.exception.ResolveMediaSourceException$ResolveInvalidCodeException */
    public final void run() throws ResolveMediaSourceException.ResolveInvalidCodeException {
        long expireTime;
        MediaResource mediaResourceB;
        BLog.i("MusicPodcastFlashMediaResourceResolveTask", "flash start resolve playUrl");
        doProfile("start_resolve_play_url", (Map) null);
        dispatchTaskStart();
        PlayInfo playInfo = this.f66894n;
        if (playInfo != null) {
            try {
                expireTime = playInfo.getExpireTime();
            } catch (Exception e7) {
                C8397q.a("resolve has err=", "MusicPodcastFlashMediaResourceResolveTask", e7);
            }
        } else {
            expireTime = 0;
        }
        if (expireTime <= 0 || System.currentTimeMillis() / ((long) 1000) < expireTime) {
            MusicPodcastResolver.a aVar = MusicPodcastResolver.Companion;
            MusicPodcastResolverParams musicPodcastResolverParams = this.f66893m;
            aVar.getClass();
            mediaResourceB = MusicPodcastResolver.a.b(playInfo, musicPodcastResolverParams);
        } else {
            BLog.i("MusicPodcastFlashMediaResourceResolveTask", "flash media resource is out of time");
            mediaResourceB = null;
        }
        this.f66896p = mediaResourceB;
        MediaResource mediaResource = this.f66896p;
        if (mediaResource == null || !mediaResource.isPlayable()) {
            BLog.w("MusicPodcastFlashMediaResourceResolveTask", "flash video not available");
            if (hasBackupTask()) {
                dispatchToBackupTask();
                return;
            }
            AbsMediaResourceResolveTask.ErrorInfo errorInfo = new AbsMediaResourceResolveTask.ErrorInfo();
            errorInfo.setHint(this.f66896p == null ? "MediaResource is null" : "MediaResource is not playable");
            errorInfo.setActionType(AbsMediaResourceResolveTask.ActionType.RELOAD);
            this.f66895o = errorInfo;
            dispatchTaskError();
            doProfile("end_resolve_play_url", (Map) null);
            BLog.i("MusicPodcastFlashMediaResourceResolveTask", "flash end resolve playUrl");
            return;
        }
        MediaResource mediaResource2 = this.f66896p;
        if (mediaResource2 != null) {
            mediaResource2.sourceForm(1);
        }
        MediaResource mediaResource3 = this.f66896p;
        boolean zIsForceAccurateSeek = false;
        if (mediaResource3 != null) {
            AbsMediaResourceResolveTask.IHistoryProgressReader iHistoryProgressReader = this.f66897q;
            mediaResource3.startPosition = iHistoryProgressReader != null ? iHistoryProgressReader.read(mediaResource3) : 0;
        }
        MediaResource mediaResource4 = this.f66896p;
        if (mediaResource4 != null) {
            AbsMediaResourceResolveTask.IHistoryProgressReader iHistoryProgressReader2 = this.f66897q;
            if (iHistoryProgressReader2 != null) {
                zIsForceAccurateSeek = iHistoryProgressReader2.isForceAccurateSeek();
            }
            mediaResource4.isForceStartAccurateSeek = zIsForceAccurateSeek;
        }
        BLog.i("MusicPodcastFlashMediaResourceResolveTask", "flash end resolve playUrl");
        doProfile("end_resolve_play_url", (Map) null);
        dispatchTaskSucceed();
    }

    public final void setBackupTaskProperty() {
        AbsMediaResourceResolveTask.IHistoryProgressReader iHistoryProgressReader;
        super/*tv.danmaku.biliplayerv2.service.resolve.Task*/.setBackupTaskProperty();
        AbsMediaResourceResolveTask backupTask = getBackupTask();
        if (!(backupTask instanceof AbsMediaResourceResolveTask) || (iHistoryProgressReader = this.f66897q) == null) {
            return;
        }
        backupTask.setHistoryProgressReader(iHistoryProgressReader);
    }

    public final void setHistoryProgressReader(@NotNull AbsMediaResourceResolveTask.IHistoryProgressReader iHistoryProgressReader) {
        this.f66897q = iHistoryProgressReader;
    }
}
