package com.bilibili.studio.editor.moudle.caption.manager;

import Ny0.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/manager/BiliEditorCaptionTtsManager$updateProgress$1.class */
final class BiliEditorCaptionTtsManager$updateProgress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $interval;
    final float $processGap;
    final Ref.FloatRef $start;
    float F$0;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorCaptionTtsManager$updateProgress$1(long j7, Ref.FloatRef floatRef, float f7, e eVar, Continuation<? super BiliEditorCaptionTtsManager$updateProgress$1> continuation) {
        super(2, continuation);
        this.$interval = j7;
        this.$start = floatRef;
        this.$processGap = f7;
        this.this$0 = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(e eVar, Ref.FloatRef floatRef) {
        p.a aVar = eVar.f105783e;
        if (aVar != null) {
            int i7 = (int) floatRef.element;
            if (aVar.f17542a.f17539e) {
                ez0.b bVar = aVar.f17542a.f17536b.f13121a;
                bVar.j.setValue(Ey0.g.a(bVar.a(), 3, i7, null, 4));
            }
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorCaptionTtsManager$updateProgress$1(this.$interval, this.$start, this.$processGap, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00ae -> B:16:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.caption.manager.BiliEditorCaptionTtsManager$updateProgress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
