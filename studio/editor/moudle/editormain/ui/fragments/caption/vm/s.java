package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/s.class */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.biligame.ui.feed.panel.n f106726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f106727b;

    public /* synthetic */ s(com.bilibili.biligame.ui.feed.panel.n nVar, u uVar) {
        this.f106726a = nVar;
        this.f106727b = uVar;
    }

    public final Object invoke(Object obj) {
        CaptionInfo captionInfo = (CaptionInfo) obj;
        this.f106726a.invoke(captionInfo);
        if (captionInfo != null) {
            this.f106727b.f106736k.setValue(new P(captionInfo, captionInfo.text.length()));
        }
        return Unit.INSTANCE;
    }
}
