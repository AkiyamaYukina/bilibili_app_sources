package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import com.bilibili.upper.widget.input.MentionEditText;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/g.class */
public final /* synthetic */ class RunnableC6553g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f106706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f106707b;

    public /* synthetic */ RunnableC6553g(Object obj, int i7) {
        this.f106706a = i7;
        this.f106707b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f106706a) {
            case 0:
                ((C6554h) this.f106707b).f106710e.B();
                break;
            default:
                MentionEditText mentionEditText = (MentionEditText) this.f106707b;
                int i7 = MentionEditText.f114517j;
                mentionEditText.setSelection(mentionEditText.getText().length());
                break;
        }
    }
}
