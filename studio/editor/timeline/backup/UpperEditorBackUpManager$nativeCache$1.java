package com.bilibili.studio.editor.timeline.backup;

import H0.e;
import androidx.compose.runtime.C4277b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/timeline/backup/UpperEditorBackUpManager$nativeCache$1.class */
public final class UpperEditorBackUpManager$nativeCache$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final b $node;
    private Object L$0;
    int label;
    final UpperEditorBackUpManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperEditorBackUpManager$nativeCache$1(UpperEditorBackUpManager upperEditorBackUpManager, b bVar, Continuation<? super UpperEditorBackUpManager$nativeCache$1> continuation) {
        super(2, continuation);
        this.this$0 = upperEditorBackUpManager;
        this.$node = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpperEditorBackUpManager$nativeCache$1 upperEditorBackUpManager$nativeCache$1 = new UpperEditorBackUpManager$nativeCache$1(this.this$0, this.$node, continuation);
        upperEditorBackUpManager$nativeCache$1.L$0 = obj;
        return upperEditorBackUpManager$nativeCache$1;
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
        UpperEditorBackUpManager upperEditorBackUpManager = this.this$0;
        b bVar = this.$node;
        try {
            Result.Companion companion = Result.Companion;
            upperEditorBackUpManager.getClass();
            int iHashCode = bVar.hashCode();
            StringBuilder sb = new StringBuilder();
            e.b(iHashCode, upperEditorBackUpManager.f108270d, "/file_", "_", sb);
            String strA = C4277b.a(bVar.f108278b, ".txt", sb);
            bVar.f108281e = strA;
            if (!new File(strA).exists()) {
                PB0.c.e(strA, JSON.toJSONString(bVar.f108277a.f108275a, SerializerFeature.WriteMapNullValue));
            }
            obj2 = Result.constructor-impl(Boxing.boxBoolean(true));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj3 = obj2;
        if (Result.isFailure-impl(obj2)) {
            obj3 = null;
        }
        UpperEditorBackUpManager upperEditorBackUpManager2 = this.this$0;
        b bVar2 = this.$node;
        Boolean bool = (Boolean) obj3;
        eA0.c.b(upperEditorBackUpManager2, "【从内存备份到本地】备份完成 node:" + bVar2.f108278b);
        if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
            b bVar3 = upperEditorBackUpManager2.f108269c;
            int i7 = 0;
            int i8 = 0;
            while (!Intrinsics.areEqual(bVar3, bVar2) && i8 < 3) {
                i8++;
                bVar3 = bVar3 != null ? bVar3.f108279c : null;
            }
            b bVar4 = upperEditorBackUpManager2.f108269c;
            while (true) {
                b bVar5 = bVar4;
                if (Intrinsics.areEqual(bVar5, bVar2) || i7 >= 3) {
                    break;
                }
                i7++;
                bVar4 = bVar5 != null ? bVar5.f108280d : null;
            }
            if (i8 >= 3 || i7 >= 3) {
                bVar2.f108277a.f108275a = null;
            }
        }
        return Unit.INSTANCE;
    }
}
