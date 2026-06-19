package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.music.model.EditorMusicItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateMusicViewModel$onMusicResult$musicList$2.class */
public final /* synthetic */ class BiliEditorTemplateMusicViewModel$onMusicResult$musicList$2 extends FunctionReferenceImpl implements Function1<EditorMusicItem, EditorMusicItem> {
    public static final BiliEditorTemplateMusicViewModel$onMusicResult$musicList$2 INSTANCE = new BiliEditorTemplateMusicViewModel$onMusicResult$musicList$2();

    public BiliEditorTemplateMusicViewModel$onMusicResult$musicList$2() {
        super(1, EditorMusicItem.class, "clone", "clone()Lcom/bilibili/studio/editor/moudle/music/model/EditorMusicItem;", 0);
    }

    public final EditorMusicItem invoke(EditorMusicItem editorMusicItem) {
        return editorMusicItem.m10123clone();
    }
}
