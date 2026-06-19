package com.bilibili.studio.videoeditor.capturev3.music;

import android.net.Uri;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.editor.moudle.clip.player.j;
import com.bilibili.studio.videoeditor.capturev3.music.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/r.class */
public final class r implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public IjkMediaPlayer f109292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f109293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public o.a f109294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f109295d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<j.a> f109296e = new ArrayList();

    @Override // com.bilibili.studio.videoeditor.capturev3.music.o
    public final void b(final long j7, final long j8, @NotNull String str, final boolean z6) {
        try {
            if (this.f109292a != null) {
                c();
            }
            this.f109293b = j7;
            final IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer(BiliContext.application());
            ijkMediaPlayer.setAudioStreamType(3);
            ijkMediaPlayer.setOption(1, "user_agent", "Bilibili Freedoooooom/MarkII");
            if (StringsKt.Z(str, "http") || StringsKt.Z(str, "https")) {
                ijkMediaPlayer.setDataSource(BiliContext.application(), Uri.parse(str));
            } else {
                ijkMediaPlayer.setDataSource(str);
            }
            ijkMediaPlayer.prepareAsync();
            ijkMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener(this, z6, ijkMediaPlayer, j8, j7) { // from class: com.bilibili.studio.videoeditor.capturev3.music.p

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final r f109285a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f109286b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final IjkMediaPlayer f109287c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final long f109288d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final long f109289e;

                {
                    this.f109285a = this;
                    this.f109286b = z6;
                    this.f109287c = ijkMediaPlayer;
                    this.f109288d = j8;
                    this.f109289e = j7;
                }

                public final void onPrepared(IMediaPlayer iMediaPlayer) {
                    o.a aVar = this.f109285a.f109294c;
                    if (aVar != null) {
                        aVar.onPrepared();
                    }
                    IjkMediaPlayer ijkMediaPlayer2 = this.f109287c;
                    if (!this.f109286b) {
                        ijkMediaPlayer2.pause();
                    }
                    long j9 = this.f109288d;
                    if (j9 > 0) {
                        ijkMediaPlayer2.seekTo(j9);
                        return;
                    }
                    long j10 = this.f109289e;
                    if (j10 > 0) {
                        ijkMediaPlayer2.seekTo(j10);
                    }
                }
            });
            ijkMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener(this, ijkMediaPlayer) { // from class: com.bilibili.studio.videoeditor.capturev3.music.q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final r f109290a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final IjkMediaPlayer f109291b;

                {
                    this.f109290a = this;
                    this.f109291b = ijkMediaPlayer;
                }

                public final void onCompletion(IMediaPlayer iMediaPlayer) {
                    r rVar = this.f109290a;
                    Iterator it = ((ArrayList) rVar.f109296e).iterator();
                    while (it.hasNext()) {
                        ((j.a) it.next()).onComplete();
                    }
                    if (rVar.f109295d) {
                        long j9 = rVar.f109293b;
                        IjkMediaPlayer ijkMediaPlayer2 = this.f109291b;
                        ijkMediaPlayer2.seekTo(j9);
                        ijkMediaPlayer2.start();
                    }
                }
            });
            this.f109292a = ijkMediaPlayer;
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public final void c() {
        IjkMediaPlayer ijkMediaPlayer = this.f109292a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            ijkMediaPlayer.release();
        }
        this.f109292a = null;
        ((ArrayList) this.f109296e).clear();
    }

    public final long d() {
        IjkMediaPlayer ijkMediaPlayer = this.f109292a;
        return ijkMediaPlayer != null ? ijkMediaPlayer.getCurrentPosition() : 0L;
    }

    public final void e() {
        IjkMediaPlayer ijkMediaPlayer = this.f109292a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.pause();
        }
    }

    public final void f() {
        IjkMediaPlayer ijkMediaPlayer = this.f109292a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.start();
        }
    }

    public final void g(long j7) {
        try {
            IjkMediaPlayer ijkMediaPlayer = this.f109292a;
            if (ijkMediaPlayer != null) {
                ijkMediaPlayer.seekTo(j7);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
