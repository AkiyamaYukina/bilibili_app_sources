package com.bilibili.studio.editor.moudle.musicv3.ui;

import UC0.n;
import Xz0.i;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/o.class */
public final /* synthetic */ class o implements Function5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicListContentFragment f108050a;

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        com.bilibili.studio.editor.moudle.musicv3.logic.c cVar;
        EditorMusicItem editorMusicItem;
        EditorMusicItem editorMusicItem2;
        BiliEditorMusicTabListFragment biliEditorMusicTabListFragmentXf;
        EditorMusicItem editorMusicItem3;
        EditorMusicItem editorMusicItem4;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        EditorMusicItem editorMusicItem5 = (EditorMusicItem) obj2;
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        int iIntValue = ((Integer) obj4).intValue();
        ((Integer) obj5).getClass();
        Jz0.c cVar2 = this.f108050a.f107975m;
        if (cVar2 != null && (cVar = cVar2.h) != null) {
            Ez0.e eVar = cVar.f107942j;
            String str = (eVar == null || (editorMusicItem4 = eVar.f4914e) == null) ? null : editorMusicItem4.flag;
            if (eVar != null && (editorMusicItem3 = eVar.f4914e) != null) {
                editorMusicItem3.isSelect = false;
            }
            Hz0.a aVar = cVar.f107932d;
            if (eVar != null && (editorMusicItem2 = eVar.f4914e) != null && editorMusicItem2.isLocalMusic && ((editorMusicItem5 == null || !editorMusicItem5.isLocalMusic) && !zBooleanValue2)) {
                BiliEditorMusicListContentFragment biliEditorMusicListContentFragment = aVar instanceof BiliEditorMusicListContentFragment ? (BiliEditorMusicListContentFragment) aVar : null;
                if (biliEditorMusicListContentFragment != null && (biliEditorMusicTabListFragmentXf = biliEditorMusicListContentFragment.xf(0)) != null) {
                    BiliEditorMusicTabListFragment.hf(biliEditorMusicTabListFragmentXf, false, true, true, 1);
                }
            }
            Ez0.e eVar2 = cVar.f107942j;
            if (eVar2 != null && (editorMusicItem = eVar2.f4914e) != null) {
                editorMusicItem.downloadStatus = 1;
            }
            if (eVar2 != null) {
                eVar2.f4914e = zBooleanValue2 ? null : editorMusicItem5;
            }
            if (eVar2 != null) {
                eVar2.e(str);
            }
            if (zBooleanValue2) {
                BiliEditorMusicListContentFragment biliEditorMusicListContentFragment2 = cVar.f107945m;
                if (biliEditorMusicListContentFragment2 != null) {
                    biliEditorMusicListContentFragment2.Bf(false);
                }
                cVar.f107946n = null;
                if (aVar != null) {
                    aVar.p1();
                }
                cVar.i();
                Lazy<Xz0.i> lazy = Xz0.i.f28467f;
                i.a.a().a();
                i.a.a().getClass();
                if (editorMusicItem5 != null) {
                    Lazy<UC0.n> lazy2 = UC0.n.f24629b;
                    n.a.a().getClass();
                    Bgm bgm = editorMusicItem5.editBgm;
                    long j7 = bgm != null ? bgm.sid : editorMusicItem5.id;
                    Xz0.d dVar = Xz0.d.f28458a;
                    String str2 = editorMusicItem5.category;
                    int i7 = editorMusicItem5.aiRecType;
                    String name = editorMusicItem5.getName();
                    String str3 = name;
                    if (name == null) {
                        str3 = "";
                    }
                    dVar.getClass();
                    Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
                    Xz0.j.c("router_topic_id", Xz0.g.f28463b);
                    Map mapB = Xz0.j.b(Xz0.k.f28474a);
                    String str4 = str2;
                    if (str2 == null) {
                        str4 = "";
                    }
                    HashMap map = (HashMap) mapB;
                    map.put("type_name", str4);
                    P4.a.a(i7, "music_id", String.valueOf(j7), "is_rec", map);
                    P4.a.a(iIntValue, "music_name", str3, "position", map);
                    map.put("loading_time", String.valueOf(0L));
                    map.put("tag_name", "");
                    map.put("type", "0");
                    map.put("fast_video", "0");
                    Xz0.g.c(mapB);
                    Neurons.reportClick(false, "creation.new-video-editor.choose-music.music.click", mapB);
                    BLog.d("MusicReportHelper", "creation.new-video-editor.choose-music.music.click isSelect=false");
                }
            } else {
                cVar.l(zBooleanValue, editorMusicItem5, iIntValue);
            }
        }
        return Unit.INSTANCE;
    }
}
