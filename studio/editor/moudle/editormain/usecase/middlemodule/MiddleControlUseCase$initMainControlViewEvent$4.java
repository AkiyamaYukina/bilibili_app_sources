package com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule;

import Pb1.o;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.editor.timeline.backup.UpperEditorBackUpManager;
import com.bilibili.studio.editor.timeline.backup.a;
import com.bilibili.studio.editor.timeline.backup.b;
import com.bilibili.studio.editor.timeline.i;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import eA0.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/middlemodule/MiddleControlUseCase$initMainControlViewEvent$4.class */
public final /* synthetic */ class MiddleControlUseCase$initMainControlViewEvent$4 extends FunctionReferenceImpl implements Function0<Unit> {
    public MiddleControlUseCase$initMainControlViewEvent$4(Object obj) {
        super(0, obj, MiddleControlUseCase.class, "onUndoClick", "onUndoClick()V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m10092invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m10092invoke() {
        BackUpTag backUpTag;
        a aVar;
        EditVideoInfo editVideoInfo;
        b bVar;
        i iVar = ((MiddleControlUseCase) ((CallableReference) this).receiver).f107183a.f4833c;
        if (iVar != null) {
            UpperEditorBackUpManager upperEditorBackUpManager = iVar.f108310m;
            if (upperEditorBackUpManager != null) {
                boolean zB = upperEditorBackUpManager.b();
                b bVar2 = upperEditorBackUpManager.f108269c;
                Integer numValueOf = bVar2 != null ? Integer.valueOf(bVar2.f108278b) : null;
                b bVar3 = upperEditorBackUpManager.f108269c;
                c.b(upperEditorBackUpManager, "【undo】" + zB + " currentNode:" + numValueOf + " preNode:" + ((bVar3 == null || (bVar = bVar3.f108279c) == null) ? null : Integer.valueOf(bVar.f108278b)));
                if (upperEditorBackUpManager.b()) {
                    b bVar4 = upperEditorBackUpManager.f108269c;
                    if (bVar4 == null || (editVideoInfo = (aVar = bVar4.f108277a).f108275a) == null) {
                        backUpTag = BackUpTag.EMPTY;
                    } else {
                        b bVar5 = bVar4.f108279c;
                        EditVideoInfo editVideoInfo2 = null;
                        if (bVar5 != null) {
                            editVideoInfo2 = bVar5.f108277a.f108275a;
                        }
                        BackUpTag backUpTag2 = aVar.f108276b;
                        if (backUpTag2 == null) {
                            backUpTag = BackUpTag.EMPTY;
                        } else {
                            upperEditorBackUpManager.f108268b = 2;
                            if (editVideoInfo2 != null) {
                                c.b(upperEditorBackUpManager, "【undo】直接内存恢复");
                                upperEditorBackUpManager.g(editVideoInfo, editVideoInfo2.m10450clone());
                            } else {
                                upperEditorBackUpManager.i(bVar5, new o(1, upperEditorBackUpManager, editVideoInfo));
                            }
                            backUpTag = backUpTag2;
                        }
                    }
                } else {
                    c.a(upperEditorBackUpManager, "can not undo");
                    backUpTag = BackUpTag.EMPTY;
                }
                if (backUpTag != null) {
                    return;
                }
            }
            BackUpTag backUpTag3 = BackUpTag.EMPTY;
        }
    }
}
