package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/r.class */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zy.e f106724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f106725b;

    public /* synthetic */ r(Zy.e eVar, u uVar) {
        this.f106724a = eVar;
        this.f106725b = uVar;
    }

    public final Object invoke(Object obj) {
        CaptionInfo captionInfo = (CaptionInfo) obj;
        this.f106724a.invoke(captionInfo);
        if (captionInfo != null) {
            this.f106725b.f106736k.setValue(new P(captionInfo, captionInfo.text.length()));
        }
        return Unit.INSTANCE;
    }
}
