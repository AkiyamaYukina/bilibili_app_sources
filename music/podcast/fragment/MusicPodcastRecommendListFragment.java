package com.bilibili.music.podcast.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.pvtracker.IPvTracker;
import gi0.C7309M;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastRecommendListFragment.class */
public final class MusicPodcastRecommendListFragment extends AbsMusicPodcastRecommendFragment implements IPvTracker {
    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        String str = this.f66538o.f66493f.f66425d;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        MusicPagerReportData musicPagerReportData = this.f66538o.f66493f;
        Bundle bundle = this.f66539p;
        String str = musicPagerReportData.f66426e;
        String string = bundle.getString("content_session_id", "");
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(string, str)) {
            bundle.putString("content_session_id", str);
        }
        return this.f66539p;
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastRecommendFragment
    @NotNull
    public final C7309M jf() {
        return new C7309M();
    }
}
