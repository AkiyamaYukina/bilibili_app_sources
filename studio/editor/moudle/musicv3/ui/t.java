package com.bilibili.studio.editor.moudle.musicv3.ui;

import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/ui/t.class */
public final /* synthetic */ class t implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorMusicTabListFragment f108058a;

    public /* synthetic */ t(BiliEditorMusicTabListFragment biliEditorMusicTabListFragment) {
        this.f108058a = biliEditorMusicTabListFragment;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        EditorMusicItem editorMusicItem = (EditorMusicItem) obj2;
        Boolean bool2 = (Boolean) obj3;
        bool2.getClass();
        Integer num = (Integer) obj4;
        num.getClass();
        BiliEditorMusicTabListFragment biliEditorMusicTabListFragment = this.f108058a;
        o oVar = biliEditorMusicTabListFragment.m10129if().f11735d;
        if (oVar != null) {
            oVar.invoke(bool, editorMusicItem, bool2, num, Integer.valueOf(biliEditorMusicTabListFragment.f107998f));
        }
        return Unit.INSTANCE;
    }
}
