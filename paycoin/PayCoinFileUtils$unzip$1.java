package com.bilibili.paycoin;

import com.bilibili.commons.compress.ZipUtils;
import com.bilibili.commons.io.FileUtils;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q4.C8397q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/PayCoinFileUtils$unzip$1.class */
final class PayCoinFileUtils$unzip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $fileName;
    final String $parent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayCoinFileUtils$unzip$1(String str, String str2, Continuation<? super PayCoinFileUtils$unzip$1> continuation) {
        super(2, continuation);
        this.$parent = str;
        this.$fileName = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PayCoinFileUtils$unzip$1(this.$parent, this.$fileName, continuation);
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
        try {
            String str = this.$parent;
            String str2 = File.separator;
            if (!ZipUtils.unzip(str + str2 + this.$fileName, this.$parent + str2)) {
                FileUtils.deleteDirectory(new File(this.$parent + str2 + this.$fileName));
            }
        } catch (Exception e7) {
            C8397q.a("unzip: ", "PayCoinFileUtils", e7);
        }
        return Unit.INSTANCE;
    }
}
