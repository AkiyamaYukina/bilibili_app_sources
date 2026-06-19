package com.bilibili.music.podcast.view;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.SeekBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/x.class */
public final class x implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PodcastSpeedSeekBar f67334a;

    public x(PodcastSpeedSeekBar podcastSpeedSeekBar) {
        this.f67334a = podcastSpeedSeekBar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        PodcastSpeedSeekBar podcastSpeedSeekBar = this.f67334a;
        int progress = seekBar.getProgress();
        int i7 = PodcastSpeedSeekBar.f67167w;
        podcastSpeedSeekBar.getClass();
        int i8 = progress / 100;
        int i9 = i8;
        if (progress % 100 >= 50) {
            i9 = i8 + 1;
        }
        this.f67334a.setSelectIndex(i9);
        PodcastSpeedSeekBar podcastSpeedSeekBar2 = this.f67334a;
        if (podcastSpeedSeekBar2.f67184s == null) {
            Object systemService = podcastSpeedSeekBar2.getContext().getSystemService("vibrator");
            podcastSpeedSeekBar2.f67184s = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        }
        Vibrator vibrator = podcastSpeedSeekBar2.f67184s;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            podcastSpeedSeekBar2.f67184s.vibrate(VibrationEffect.createOneShot(5L, -1));
        } else {
            podcastSpeedSeekBar2.f67184s.vibrate(5L);
        }
    }
}
