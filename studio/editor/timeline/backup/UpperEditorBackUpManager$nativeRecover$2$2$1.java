package com.bilibili.studio.editor.timeline.backup;

import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.util.SimpleUtilKt;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/backup/UpperEditorBackUpManager$nativeRecover$2$2$1.class */
public final class UpperEditorBackUpManager$nativeRecover$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final b $node;
    int label;
    final UpperEditorBackUpManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperEditorBackUpManager$nativeRecover$2$2$1(UpperEditorBackUpManager upperEditorBackUpManager, b bVar, Continuation<? super UpperEditorBackUpManager$nativeRecover$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = upperEditorBackUpManager;
        this.$node = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(b bVar, Function1 function1) {
        if (function1 != null) {
            function1.invoke(bVar.f108277a.f108275a);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperEditorBackUpManager$nativeRecover$2$2$1(this.this$0, this.$node, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<Function1<EditVideoInfo, Unit>> list = this.this$0.h.get(this.$node);
        if (list != null) {
            final b bVar = this.$node;
            SimpleUtilKt.safeForEach(list, new Function1(bVar) { // from class: com.bilibili.studio.editor.timeline.backup.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f108282a;

                {
                    this.f108282a = bVar;
                }

                public final Object invoke(Object obj2) {
                    return UpperEditorBackUpManager$nativeRecover$2$2$1.invokeSuspend$lambda$0(this.f108282a, (Function1) obj2);
                }
            });
        }
        this.this$0.h.remove(this.$node);
        return Unit.INSTANCE;
    }
}
