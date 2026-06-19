package com.bilibili.studio.editor.moudle.editormain.ui.toolbar;

import com.bilibili.studio.editor.moudle.editormain.ui.toolbar.beans.EditorToolBar;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/toolbar/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Stack<C1192a> f107088a = new Stack<>();

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.toolbar.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/toolbar/a$a.class */
    public static final class C1192a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final EditorToolBar f107089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f107090b;

        public C1192a(@NotNull EditorToolBar editorToolBar, int i7) {
            this.f107089a = editorToolBar;
            this.f107090b = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1192a)) {
                return false;
            }
            C1192a c1192a = (C1192a) obj;
            return Intrinsics.areEqual(this.f107089a, c1192a.f107089a) && this.f107090b == c1192a.f107090b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f107090b) + (this.f107089a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ToolBarRecord(toolBar=" + this.f107089a + ", scrollDistance=" + this.f107090b + ")";
        }
    }

    public final void a(@Nullable C1192a c1192a) {
        EditorToolBar editorToolBar;
        while (true) {
            boolean zIsEmpty = this.f107088a.isEmpty();
            editorToolBar = c1192a.f107089a;
            if (!zIsEmpty) {
                C1192a c1192aPeek = this.f107088a.peek();
                if (c1192aPeek.f107089a.getToolBarType() != editorToolBar.getToolBarType()) {
                    EditorToolBar editorToolBar2 = c1192aPeek.f107089a;
                    if (editorToolBar2.getToolBarLevel().getValue() < editorToolBar.getToolBarLevel().getValue()) {
                        BLog.e("EditorToolBarView", "recycleCheckAndRemoveTop finish,top=" + editorToolBar2.getToolBarLevel());
                        break;
                    }
                    BLog.e("EditorToolBarView", "recycleCheckAndRemoveTop pop=" + editorToolBar2.getToolBarType());
                    this.f107088a.pop();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        if (this.f107088a.isEmpty()) {
            this.f107088a.add(c1192a);
        } else if (this.f107088a.peek().f107089a.getToolBarType() != editorToolBar.getToolBarType()) {
            this.f107088a.add(c1192a);
        } else {
            BLog.e("EditorToolBarView", "addRecord fail,toolBarType is the same");
        }
    }
}
