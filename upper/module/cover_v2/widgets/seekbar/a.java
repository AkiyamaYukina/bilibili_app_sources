package com.bilibili.upper.module.cover_v2.widgets.seekbar;

import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.upper.module.cover_v2.widgets.seekbar.MultiCoverSeekBar;
import com.bilibili.upper.widget.thumb.HScrollView;
import eJ0.C6931i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/widgets/seekbar/a.class */
public final class a implements HScrollView.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverSeekBar f113069a;

    public a(MultiCoverSeekBar multiCoverSeekBar) {
        this.f113069a = multiCoverSeekBar;
    }

    @Override // com.bilibili.upper.widget.thumb.HScrollView.b
    public final void a() {
        MultiCoverSeekBar multiCoverSeekBar = this.f113069a;
        multiCoverSeekBar.setMCurrentRecyclerX(multiCoverSeekBar.f113045e.getScrollX());
        if (multiCoverSeekBar.f113057r >= 0) {
            int iA = 0;
            if (C6931i.a(multiCoverSeekBar.getContext(), 46.0f) != 0 && multiCoverSeekBar.f113057r / C6931i.a(multiCoverSeekBar.getContext(), 46.0f) > 0) {
                iA = multiCoverSeekBar.f113057r / C6931i.a(multiCoverSeekBar.getContext(), 46.0f);
            }
            multiCoverSeekBar.f113060u = iA;
        }
        MultiCoverSeekBar.b(multiCoverSeekBar);
        multiCoverSeekBar.f113052m = ((long) (multiCoverSeekBar.getPerS() * multiCoverSeekBar.f113060u)) * TransitionInfo.DEFAULT_DURATION;
        if (!multiCoverSeekBar.f113051l) {
        }
        MultiCoverSeekBar.a onSeekBarChangeListener = multiCoverSeekBar.getOnSeekBarChangeListener();
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.a(multiCoverSeekBar.f113052m, multiCoverSeekBar.f113051l, true);
        }
    }

    @Override // com.bilibili.upper.widget.thumb.HScrollView.b
    public final void onStop() {
        MultiCoverSeekBar multiCoverSeekBar = this.f113069a;
        multiCoverSeekBar.f113052m = ((long) (multiCoverSeekBar.getPerS() * multiCoverSeekBar.f113060u)) * TransitionInfo.DEFAULT_DURATION;
        if (!multiCoverSeekBar.f113051l) {
        }
        MultiCoverSeekBar.a onSeekBarChangeListener = multiCoverSeekBar.getOnSeekBarChangeListener();
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.a(multiCoverSeekBar.f113052m, multiCoverSeekBar.f113051l, false);
        }
        multiCoverSeekBar.f113051l = false;
    }
}
