package com.bilibili.studio.kaleidoscope.adapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/Kaleidoscope.class */
public abstract class Kaleidoscope {
    public final Editor createEditor() {
        Editor editorNewEditor = newEditor();
        EditorManager.getInstance().f108360a = createManager(editorNewEditor);
        return editorNewEditor;
    }

    public abstract Manager createManager(Editor editor);

    public abstract Editor newEditor();
}
