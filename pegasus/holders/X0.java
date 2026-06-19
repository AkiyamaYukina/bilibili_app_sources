package com.bilibili.pegasus.holders;

import androidx.viewbinding.ViewBinding;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.reporter.AutoPlayTriggerType;
import com.bilibili.inline.reporter.InlinePlayReporterKt;
import com.bilibili.studio.editor.moudle.musicv3.ui.BiliEditorMusicChangeStartFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import op0.C8249a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/X0.class */
public final /* synthetic */ class X0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f77644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f77645c;

    public /* synthetic */ X0(int i7, Object obj, Object obj2) {
        this.f77643a = i7;
        this.f77644b = obj;
        this.f77645c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.f77643a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z6 = ((fp0.w) this.f77644b).f119101g1;
                c1 c1Var = (c1) this.f77645c;
                if (z6) {
                    InlinePlayReporterKt.reportTryAutoPlayEvent(AutoPlayTriggerType.BIND_VIEW_PLAY, "cover_v9", true);
                    IInlineControl inlineControl = c1Var.getInlineControl();
                    if (inlineControl != null) {
                        inlineControl.startPlay(c1Var, zBooleanValue);
                    }
                } else {
                    C8249a.f(c1Var, null, null, null, false, null, null, 255);
                }
                break;
            default:
                Long l7 = (Long) obj;
                BiliEditorMusicChangeStartFragment biliEditorMusicChangeStartFragment = (BiliEditorMusicChangeStartFragment) this.f77644b;
                Kz0.a aVar = biliEditorMusicChangeStartFragment.f107958r;
                ViewBinding viewBinding = (ViewBinding) this.f77645c;
                if (aVar != null) {
                    aVar.g(viewBinding, com.bilibili.studio.videoeditor.util.U.c(l7.longValue() / 1000));
                }
                Kz0.a aVar2 = biliEditorMusicChangeStartFragment.f107958r;
                if (aVar2 != null) {
                    aVar2.e(l7.longValue(), viewBinding);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
