package com.bilibili.studio.editor.moudle.musicv3.ui;

import androidx.viewbinding.ViewBinding;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicListContentFragment;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/p.class */
public final class p implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicListContentFragment f108051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewBinding f108052b;

    public p(BiliEditorMusicListContentFragment biliEditorMusicListContentFragment, ViewBinding viewBinding) {
        this.f108051a = biliEditorMusicListContentFragment;
        this.f108052b = viewBinding;
    }

    public final void onTabReselected(TabLayout.Tab tab) {
    }

    public final void onTabSelected(TabLayout.Tab tab) {
        if (tab != null) {
            CharSequence text = tab.getText();
            Lazy<String> lazy = BiliEditorMusicListContentFragment.f107971x;
            int i7 = (Intrinsics.areEqual(text, BiliEditorMusicListContentFragment.a.a()) || Intrinsics.areEqual(tab.getText(), BiliEditorMusicListContentFragment.a.b())) ? 8 : 0;
            BiliEditorMusicListContentFragment biliEditorMusicListContentFragment = this.f108051a;
            Kz0.f fVar = biliEditorMusicListContentFragment.f107985w;
            if (fVar != null) {
                fVar.i(this.f108052b, i7);
            }
            biliEditorMusicListContentFragment.f107979q = tab.getPosition();
            if (biliEditorMusicListContentFragment.f107981s) {
                biliEditorMusicListContentFragment.f107981s = false;
                return;
            }
            Xz0.d dVar = Xz0.d.f28458a;
            String strValueOf = String.valueOf(tab.getText());
            String strE = com.bilibili.studio.videoeditor.extension.l.e(biliEditorMusicListContentFragment.f105686c);
            dVar.getClass();
            Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
            Xz0.j.c("router_topic_id", Xz0.g.f28463b);
            Map mapB = Xz0.j.b(Xz0.k.f28474a);
            HashMap map = (HashMap) mapB;
            map.put("type_name", strValueOf);
            map.put("fast_video", strE);
            Neurons.reportClick(false, "creation.new-video-editor.choose-music.tab.click", mapB);
        }
    }

    public final void onTabUnselected(TabLayout.Tab tab) {
    }
}
