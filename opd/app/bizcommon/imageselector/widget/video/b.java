package com.bilibili.opd.app.bizcommon.imageselector.widget.video;

import android.media.MediaPlayer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.opd.app.bizcommon.imageselector.page.w;
import org.jetbrains.annotations.Nullable;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/video/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final MallMediaVideoView f73980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public w f73981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f73982c;

    public b(@Nullable MallMediaVideoView mallMediaVideoView) {
        this.f73980a = mallMediaVideoView;
    }

    public static void a(b bVar, String str) {
        String playUrl;
        MediaPlayer mediaPlayer;
        MallMediaVideoView mallMediaVideoView = bVar.f73980a;
        if (mallMediaVideoView == null || str == null || str.length() == 0 || bVar.f73982c) {
            return;
        }
        boolean loop = false;
        MallVideoParams mallVideoParams = new MallVideoParams(str, false, false, null);
        mallMediaVideoView.setOnVideoPlayerListener(new a(false, bVar));
        mallMediaVideoView.setMediaPlayParams(mallVideoParams);
        if (mallMediaVideoView.f73973b == null || mallMediaVideoView.f73974c == null || mallMediaVideoView.f73975d != null) {
            return;
        }
        try {
            mallMediaVideoView.f73975d = new MediaPlayer();
            MallVideoParams mallVideoParams2 = mallMediaVideoView.f73974c;
            if (mallVideoParams2 != null && (playUrl = mallVideoParams2.getPlayUrl()) != null) {
                String str2 = null;
                if (playUrl.length() > 0) {
                    str2 = playUrl;
                }
                if (str2 != null && (mediaPlayer = mallMediaVideoView.f73975d) != null) {
                    mediaPlayer.setDataSource(str2);
                }
            }
            MediaPlayer mediaPlayer2 = mallMediaVideoView.f73975d;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setVideoScalingMode(2);
            }
            MediaPlayer mediaPlayer3 = mallMediaVideoView.f73975d;
            if (mediaPlayer3 != null) {
                MallVideoParams mallVideoParams3 = mallMediaVideoView.f73974c;
                if (mallVideoParams3 != null) {
                    loop = mallVideoParams3.getLoop();
                }
                mediaPlayer3.setLooping(loop);
            }
            MediaPlayer mediaPlayer4 = mallMediaVideoView.f73975d;
            if (mediaPlayer4 != null) {
                mediaPlayer4.prepareAsync();
            }
            mallMediaVideoView.b();
        } catch (Exception e7) {
            M.b("PlayerInit", e7.getMessage(), "VideoSplashView");
        }
    }
}
