package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/q.class */
public final class q implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicListFragment f108053a;

    public q(BiliEditorMusicListFragment biliEditorMusicListFragment) {
        this.f108053a = biliEditorMusicListFragment;
    }

    public final void onTabReselected(TabLayout.Tab tab) {
    }

    public final void onTabSelected(TabLayout.Tab tab) {
        Bgm bgm;
        BiliEditorMusicListFragment biliEditorMusicListFragment = this.f108053a;
        BiliEditorMusicListContentFragment biliEditorMusicListContentFragment = (BiliEditorMusicListContentFragment) biliEditorMusicListFragment.f107990o.get(0);
        if (tab != null && tab.getPosition() == 1 && biliEditorMusicListFragment.f107990o.size() > 1) {
            BMusic bMusicWf = biliEditorMusicListContentFragment.wf();
            BiliEditorMusicVolumeFragment biliEditorMusicVolumeFragment = (BiliEditorMusicVolumeFragment) biliEditorMusicListFragment.f107990o.get(1);
            if (biliEditorMusicListContentFragment.f107975m != null) {
                biliEditorMusicVolumeFragment.getClass();
                biliEditorMusicVolumeFragment.f108008o = bMusicWf;
                biliEditorMusicVolumeFragment.yf();
                biliEditorMusicVolumeFragment.zf();
            }
        }
        Xz0.d dVar = Xz0.d.f28458a;
        String strE = com.bilibili.studio.videoeditor.extension.l.e(biliEditorMusicListFragment.f105686c);
        String str = (tab == null || tab.getPosition() != 1) ? "1" : "2";
        BMusic bMusicWf2 = biliEditorMusicListContentFragment.wf();
        String strValueOf = String.valueOf((bMusicWf2 == null || (bgm = bMusicWf2.bgm) == null) ? null : Long.valueOf(bgm.sid));
        String strA = Jz0.f.a();
        dVar.getClass();
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        Map mapB = Xz0.j.b(Xz0.k.f28474a);
        HashMap map = (HashMap) mapB;
        map.put("fast_video", strE);
        map.put("tab", str);
        map.put("music_id", strValueOf);
        String str2 = strA;
        if (strA == null) {
            str2 = "";
        }
        map.put("sid", str2);
        Neurons.reportClick(false, "creation.new-video-editor.choose-music.top-tab.click", mapB);
    }

    public final void onTabUnselected(TabLayout.Tab tab) {
    }
}
