package com.bilibili.studio.editor.moudle.clip.player;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bilibili.studio.editor.moudle.clip.player.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/i.class */
public final class i implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Job f106051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f106052e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MediaPlayer f106048a = new MediaPlayer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<j.b> f106049b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<j.a> f106050c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f106053f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f106054g = 1000;

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void a(@NotNull j.b bVar) {
        if (((ArrayList) this.f106049b).contains(bVar)) {
            return;
        }
        ((ArrayList) this.f106049b).add(bVar);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void b(long j7) {
        this.f106054g = j7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.media.MediaPlayer$OnErrorListener, java.lang.Object] */
    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.Nullable final com.bilibili.studio.editor.moudle.clip.player.j.c r8) throws java.io.IOException {
        /*
            r6 = this;
            r0 = r6
            android.media.MediaPlayer r0 = r0.f106048a
            r10 = r0
            r0 = r7
            boolean r0 = vg0.C8807a.a(r0)
            if (r0 == 0) goto L2f
            r0 = r7
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r0 = vg0.C8807a.c(r0, r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L20
            r0 = r9
            java.io.FileDescriptor r0 = r0.getFileDescriptor()
            r9 = r0
            goto L22
        L20:
            r0 = 0
            r9 = r0
        L22:
            r0 = r9
            if (r0 == 0) goto L2f
            r0 = r10
            r1 = r9
            r0.setDataSource(r1)
            goto L35
        L2f:
            r0 = r10
            r1 = r7
            r0.setDataSource(r1)
        L35:
            r0 = r10
            r0.prepareAsync()
            r0 = r10
            com.bilibili.studio.editor.moudle.clip.player.e r1 = new com.bilibili.studio.editor.moudle.clip.player.e
            r2 = r1
            r3 = r8
            r4 = r6
            r2.<init>(r3, r4)
            r0.setOnPreparedListener(r1)
            r0 = r10
            com.bilibili.studio.editor.moudle.clip.player.f r1 = new com.bilibili.studio.editor.moudle.clip.player.f
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.setOnCompletionListener(r1)
            r0 = r10
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.setOnErrorListener(r1)
            r0 = r10
            com.bilibili.studio.editor.moudle.clip.player.h r1 = new com.bilibili.studio.editor.moudle.clip.player.h
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.setOnSeekCompleteListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.clip.player.i.d(java.lang.String, com.bilibili.studio.editor.moudle.clip.player.j$c):void");
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void e(@NotNull j.a aVar) {
        if (((ArrayList) this.f106050c).contains(aVar)) {
            return;
        }
        ((ArrayList) this.f106050c).add(aVar);
    }

    public final void f() {
        long currentPosition = getCurrentPosition();
        Iterator it = ((ArrayList) this.f106049b).iterator();
        while (it.hasNext()) {
            ((j.b) it.next()).a(currentPosition);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final long getCurrentPosition() {
        return ((long) this.f106048a.getCurrentPosition()) * ((long) 1000);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final long getDuration() {
        return ((long) this.f106048a.getDuration()) * ((long) 1000);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final int getVideoHeight() {
        return this.f106048a.getVideoHeight();
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final int getVideoWidth() {
        return this.f106048a.getVideoWidth();
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final boolean isPlaying() {
        boolean zIsPlaying;
        try {
            zIsPlaying = this.f106048a.isPlaying();
        } catch (Exception e7) {
            zIsPlaying = false;
        }
        return zIsPlaying;
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void pause() {
        if (this.f106048a.isPlaying()) {
            this.f106048a.pause();
        }
        f();
        Job job = this.f106051d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f106051d = null;
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void release() {
        f();
        Job job = this.f106051d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f106051d = null;
        this.f106048a.release();
        ((ArrayList) this.f106049b).clear();
        ((ArrayList) this.f106050c).clear();
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void seekTo(long j7) {
        if (getCurrentPosition() == j7) {
            return;
        }
        if (this.f106052e) {
            this.f106053f = j7;
            return;
        }
        this.f106052e = true;
        long j8 = j7 / ((long) 1000);
        if (Build.VERSION.SDK_INT > 26) {
            this.f106048a.seekTo(j8, 3);
        } else {
            this.f106048a.seekTo((int) j8);
        }
        this.f106053f = -1L;
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void setDisplay(@Nullable SurfaceHolder surfaceHolder) {
        this.f106048a.setDisplay(surfaceHolder);
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final void setSurfaceTexture(@Nullable SurfaceTexture surfaceTexture) {
        this.f106048a.setSurface(new Surface(surfaceTexture));
    }

    @Override // com.bilibili.studio.editor.moudle.clip.player.j
    public final boolean start() {
        if (this.f106048a.isPlaying()) {
            return false;
        }
        this.f106048a.start();
        Job job = this.f106051d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f106051d = BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new SystemMediaPlayerImpl$startRecord$job$1(this, null), 3, (Object) null);
        return true;
    }
}
