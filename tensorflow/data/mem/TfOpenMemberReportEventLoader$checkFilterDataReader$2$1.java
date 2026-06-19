package com.bilibili.tensorflow.data.mem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tensorflow/data/mem/TfOpenMemberReportEventLoader$checkFilterDataReader$2$1.class */
final class TfOpenMemberReportEventLoader$checkFilterDataReader$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;

    public TfOpenMemberReportEventLoader$checkFilterDataReader$2$1(Continuation<? super TfOpenMemberReportEventLoader$checkFilterDataReader$2$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TfOpenMemberReportEventLoader$checkFilterDataReader$2$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TfOpenMemberReportEventLoader tfOpenMemberReportEventLoader = TfOpenMemberReportEventLoader.f110745a;
        File file = TfOpenMemberReportEventLoader.f110747c;
        if (file == null) {
            return Boxing.boxBoolean(false);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
        xD0.a aVar = new xD0.a(inputStreamReader);
        try {
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                while (true) {
                    String[] strArrB = aVar.b();
                    objectRef.element = strArrB;
                    if (strArrB == null) {
                        aVar.a.close();
                        inputStreamReader.close();
                        return Boxing.boxBoolean(true);
                    }
                    TfOpenMemberReportEventLoader.f110749e.put(new Regex("\\n").replace(StringsKt.trim(strArrB[0]).toString(), ""), new Regex("\\n").replace(StringsKt.trim(strArrB[1]).toString(), ""));
                }
            } catch (Exception e7) {
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                aVar.a.close();
                inputStreamReader.close();
                return boolBoxBoolean;
            }
        } catch (Throwable th) {
            aVar.a.close();
            inputStreamReader.close();
            throw th;
        }
    }
}
