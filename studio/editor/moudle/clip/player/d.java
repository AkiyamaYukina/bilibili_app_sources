package com.bilibili.studio.editor.moudle.clip.player;

import L50.a;
import R50.r;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.studio.editor.moudle.clip.player.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/d.class */
public final class d implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Job f106042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f106043f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IjkMediaPlayer f106038a = new IjkMediaPlayer(BiliContext.application());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<j.b> f106039b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<j.a> f106040c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<j.d> f106041d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f106044g = 30;

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void a(@NotNull j.b bVar) {
        if (((ArrayList) this.f106039b).contains(bVar)) {
            return;
        }
        ((ArrayList) this.f106039b).add(bVar);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void b(long j7) {
        this.f106044g = j7;
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void c(@NotNull j.d dVar) {
        this.f106041d.add(dVar);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void d(@NotNull String str, @Nullable final j.c cVar) {
        IjkMediaPlayer ijkMediaPlayer = this.f106038a;
        ijkMediaPlayer.setOption(4, "mediacodec", 1L);
        ijkMediaPlayer.setOption(4, "mediacodec-hevc", 1L);
        ijkMediaPlayer.setOption(4, "mediacodec-auto-rotate", 1L);
        ijkMediaPlayer.setOption(4, "max-fps", 120L);
        ijkMediaPlayer.setOption(4, "framedrop", 1L);
        ijkMediaPlayer.setDataSource(str);
        ijkMediaPlayer.prepareAsync();
        R50.a aVarS = null;
        r rVarU = a.a.a.a != null ? r.u() : null;
        if (rVarU != null) {
            aVarS = rVarU.s(str);
        }
        int videoStreamRotation = 0;
        if (aVarS != null) {
            videoStreamRotation = aVarS.a.getVideoStreamRotation(0);
        }
        final int i7 = videoStreamRotation;
        ijkMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener(this, i7, cVar) { // from class: com.bilibili.studio.editor.moudle.clip.player.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f106033a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f106034b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final j.c f106035c;

            {
                this.f106033a = this;
                this.f106034b = i7;
                this.f106035c = cVar;
            }

            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                d dVar = this.f106033a;
                dVar.getClass();
                int i8 = this.f106034b;
                int i9 = i8 != 1 ? i8 != 2 ? i8 != 3 ? 0 : 270 : 180 : 90;
                Iterator<j.d> it = dVar.f106041d.iterator();
                while (it.hasNext()) {
                    it.next().a(i9);
                }
                Job job = dVar.f106042e;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                dVar.f106042e = BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new IjkMediaPlayerImpl$startRecord$job$1(dVar, null), 3, (Object) null);
                this.f106035c.onPrepared();
            }
        });
        ijkMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener(this) { // from class: com.bilibili.studio.editor.moudle.clip.player.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f106036a;

            {
                this.f106036a = this;
            }

            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                d dVar = this.f106036a;
                long currentPosition = dVar.getCurrentPosition();
                Iterator it = ((ArrayList) dVar.f106039b).iterator();
                while (it.hasNext()) {
                    ((j.b) it.next()).a(currentPosition);
                }
                Job job = dVar.f106042e;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                dVar.f106042e = null;
                Iterator it2 = ((ArrayList) dVar.f106040c).iterator();
                while (it2.hasNext()) {
                    ((j.a) it2.next()).onComplete();
                }
            }
        });
        ijkMediaPlayer.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener(this) { // from class: com.bilibili.studio.editor.moudle.clip.player.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f106037a;

            {
                this.f106037a = this;
            }

            public final void onSeekComplete(IMediaPlayer iMediaPlayer) {
                this.f106037a.f106043f = false;
            }
        });
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void e(@NotNull j.a aVar) {
        if (((ArrayList) this.f106040c).contains(aVar)) {
            return;
        }
        ((ArrayList) this.f106040c).add(aVar);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final long getCurrentPosition() {
        return this.f106038a.getCurrentPosition() * ((long) 1000);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final long getDuration() {
        return this.f106038a.getDuration() * ((long) 1000);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final int getVideoHeight() {
        return this.f106038a.getVideoHeight();
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final int getVideoWidth() {
        return this.f106038a.getVideoWidth();
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final boolean isPlaying() {
        boolean zIsPlaying;
        try {
            zIsPlaying = this.f106038a.isPlaying();
        } catch (Exception e7) {
            zIsPlaying = false;
        }
        return zIsPlaying;
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void pause() {
        this.f106038a.pause();
        long currentPosition = getCurrentPosition();
        Iterator it = ((ArrayList) this.f106039b).iterator();
        while (it.hasNext()) {
            ((j.b) it.next()).a(currentPosition);
        }
        Job job = this.f106042e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f106042e = null;
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void release() {
        long currentPosition = getCurrentPosition();
        Iterator it = ((ArrayList) this.f106039b).iterator();
        while (it.hasNext()) {
            ((j.b) it.next()).a(currentPosition);
        }
        Job job = this.f106042e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f106042e = null;
        Lazy lazy = zw0.b.f130950a;
        DeviceDecision.INSTANCE.getBoolean("uper.enable_disable_external_render_before_release", true);
        this.f106038a.release();
        ((ArrayList) this.f106039b).clear();
        ((ArrayList) this.f106040c).clear();
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void seekTo(long j7) {
        if (this.f106043f) {
            return;
        }
        this.f106043f = true;
        this.f106038a.seekTo(j7 / ((long) 1000));
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void setDisplay(@Nullable SurfaceHolder surfaceHolder) {
        this.f106038a.setDisplay(surfaceHolder);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void setSurfaceTexture(@Nullable SurfaceTexture surfaceTexture) {
        this.f106038a.setSurface(new Surface(surfaceTexture));
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final boolean start() {
        this.f106038a.start();
        Job job = this.f106042e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f106042e = BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new IjkMediaPlayerImpl$startRecord$job$1(this, null), 3, (Object) null);
        return true;
    }
}
