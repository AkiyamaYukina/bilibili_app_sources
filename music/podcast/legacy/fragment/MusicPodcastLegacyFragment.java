package com.bilibili.music.podcast.legacy.fragment;

import Li0.d;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.j;
import com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment;
import com.bilibili.pvtracker.IPvTracker;
import gi0.AbstractC7320a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ri0.C8525a;
import ti0.C8666b;
import yi0.C9059a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/MusicPodcastLegacyFragment.class */
public final class MusicPodcastLegacyFragment extends AbsMusicPodcastListFragment implements IPvTracker {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final C8525a f66851v = new AbstractC7320a(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final C9059a f66852w = new d();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final C8666b f66853x = new C8666b();

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        String str = this.f66853x.f127522b.f66425d;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return str2;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        MusicPagerReportData musicPagerReportData = this.f66853x.f127522b;
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
        return this.f66851v;
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment
    @NotNull
    public final j lf() {
        return this.f66853x;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    @Override // com.bilibili.music.podcast.fragment.BaseLoadFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void loadData() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.legacy.fragment.MusicPodcastLegacyFragment.loadData():void");
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment
    @NotNull
    public final d mf() {
        return this.f66852w;
    }

    @Override // com.bilibili.music.podcast.fragment.AbsMusicPodcastListFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Bundle bundleP;
        super.onViewCreated(view, bundle);
        this.f66501f.h = this.f66853x.f127523c;
        Ki0.j jVarG = this.f66852w.g();
        if (jVarG == null || (bundleP = jVarG.p()) == null) {
            return;
        }
        bundleP.remove("show_comment");
    }
}
