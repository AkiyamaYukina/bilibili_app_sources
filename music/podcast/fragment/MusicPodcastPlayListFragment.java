package com.bilibili.music.podcast.fragment;

import Li0.d;
import Li0.r;
import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.j;
import com.bilibili.music.podcast.data.q;
import com.bilibili.pvtracker.IPvTracker;
import gi0.AbstractC7320a;
import gi0.C7306J;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/MusicPodcastPlayListFragment.class */
public final class MusicPodcastPlayListFragment extends AbsMusicPodcastListFragment implements IPvTracker {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final C7306J f66692v = new AbstractC7320a(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final q f66693w = new q();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final r f66694x = new d();

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        String str = this.f66693w.f66486c.f66425d;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        MusicPagerReportData musicPagerReportData = this.f66693w.f66486c;
        Bundle bundle = this.f66503i;
        String str = musicPagerReportData.f66426e;
        String string = bundle.getString("content_session_id", "");
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(string, str)) {
            bundle.putString("content_session_id", str);
        }
        return this.f66503i;
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment
    @NotNull
    public final AbstractC7320a kf() {
        return this.f66692v;
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment
    @NotNull
    public final j lf() {
        return this.f66693w;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    @Override // com.bilibili.music.podcast.fragment.BaseLoadFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void loadData() {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.fragment.MusicPodcastPlayListFragment.loadData():void");
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment
    @NotNull
    public final d mf() {
        return this.f66694x;
    }
}
