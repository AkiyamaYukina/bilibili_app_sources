package com.bilibili.studio.comm.material.utils;

import com.bilibili.commons.io.FileUtils;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/utils/DraftJsonUtils$deleteJsonDirectory$1.class */
public final class DraftJsonUtils$deleteJsonDirectory$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final File $draftDirectory;
    final String $scene;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftJsonUtils$deleteJsonDirectory$1(File file, String str, Continuation<? super DraftJsonUtils$deleteJsonDirectory$1> continuation) {
        super(2, continuation);
        this.$draftDirectory = file;
        this.$scene = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DraftJsonUtils$deleteJsonDirectory$1(this.$draftDirectory, this.$scene, continuation);
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
        File file = this.$draftDirectory;
        try {
            Result.Companion companion = Result.Companion;
            FileUtils.deleteDirectory(file);
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        a.a(this.$scene + " 删除本地draftjson目录 result= " + Result.isSuccess-impl(obj2) + ", error = " + Result.exceptionOrNull-impl(obj2));
        return Unit.INSTANCE;
    }
}
