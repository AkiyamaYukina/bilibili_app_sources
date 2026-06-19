package com.bilibili.studio.editor.question.manager;

import com.bilibili.studio.editor.question.bean.EditorQuestionEvent;
import com.bilibili.studio.editor.question.bean.QuestionConfig;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/manager/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f108213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f108214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f108215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f108216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f108217e;

    public static EditorQuestionEvent a(EditorQuestionEvent editorQuestionEvent) {
        Map<String, QuestionConfig> map = a.f108211a;
        if (!a.d(editorQuestionEvent.getEditorEventKey())) {
            editorQuestionEvent = null;
        }
        return editorQuestionEvent;
    }
}
