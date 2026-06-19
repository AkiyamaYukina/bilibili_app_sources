package com.bilibili.studio.editor.timeline.backup;

import com.alibaba.fastjson.JSON;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/backup/UpperEditorBackUpManager$nativeRecover$2.class */
public final class UpperEditorBackUpManager$nativeRecover$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final b $node;
    private Object L$0;
    int label;
    final UpperEditorBackUpManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperEditorBackUpManager$nativeRecover$2(b bVar, UpperEditorBackUpManager upperEditorBackUpManager, Continuation<? super UpperEditorBackUpManager$nativeRecover$2> continuation) {
        super(2, continuation);
        this.$node = bVar;
        this.this$0 = upperEditorBackUpManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpperEditorBackUpManager$nativeRecover$2 upperEditorBackUpManager$nativeRecover$2 = new UpperEditorBackUpManager$nativeRecover$2(this.$node, this.this$0, continuation);
        upperEditorBackUpManager$nativeRecover$2.L$0 = obj;
        return upperEditorBackUpManager$nativeRecover$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        b bVar = this.$node;
        try {
            Result.Companion companion = Result.Companion;
            obj2 = Result.constructor-impl((EditVideoInfo) JSON.parseObject(PB0.c.d(bVar.f108281e), EditVideoInfo.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj3 = obj2;
        if (Result.isFailure-impl(obj2)) {
            obj3 = null;
        }
        b bVar2 = this.$node;
        UpperEditorBackUpManager upperEditorBackUpManager = this.this$0;
        EditVideoInfo editVideoInfo = (EditVideoInfo) obj3;
        a aVar = bVar2.f108277a;
        EditVideoInfo editVideoInfo2 = aVar.f108275a;
        if (editVideoInfo2 == null) {
            editVideoInfo2 = editVideoInfo;
        }
        aVar.f108275a = editVideoInfo2;
        List<Function1<EditVideoInfo, Unit>> list = upperEditorBackUpManager.h.get(bVar2);
        Integer numBoxInt = list != null ? Boxing.boxInt(list.size()) : null;
        EditVideoInfo editVideoInfo3 = bVar2.f108277a.f108275a;
        eA0.c.b(upperEditorBackUpManager, "【从本地恢复到内存】恢复完成 node:" + bVar2.f108278b + " list:" + numBoxInt + " editInfo:" + (editVideoInfo3 != null ? editVideoInfo3.hashCode() : 0));
        BuildersKt.launch$default(coroutineScope, Dispatchers.getMain(), (CoroutineStart) null, new UpperEditorBackUpManager$nativeRecover$2$2$1(upperEditorBackUpManager, bVar2, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
