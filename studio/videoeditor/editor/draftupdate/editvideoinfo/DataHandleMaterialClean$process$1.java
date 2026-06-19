package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import com.bilibili.studio.editor.moudle.material.e;
import com.bilibili.studio.material.MaterialResult;
import com.bilibili.studio.material.Result;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q4.M;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/DataHandleMaterialClean$process$1.class */
final class DataHandleMaterialClean$process$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final EditVideoInfo $editVideoInfo;
    final String $engineType;
    final Function1<Boolean, Unit> $onFinish;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataHandleMaterialClean$process$1(EditVideoInfo editVideoInfo, String str, d dVar, Function1<? super Boolean, Unit> function1, Continuation<? super DataHandleMaterialClean$process$1> continuation) {
        super(2, continuation);
        this.$editVideoInfo = editVideoInfo;
        this.$engineType = str;
        this.this$0 = dVar;
        this.$onFinish = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataHandleMaterialClean$process$1(this.$editVideoInfo, this.$engineType, this.this$0, this.$onFinish, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EditVideoInfo editVideoInfo;
        String str;
        d dVar;
        Function1<Boolean, Unit> function1;
        MaterialResult materialResult;
        List<Result> results;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                editVideoInfo = this.$editVideoInfo;
                str = this.$engineType;
                dVar = this.this$0;
                function1 = this.$onFinish;
                Result.Companion companion = kotlin.Result.Companion;
                BLog.i("DataHandleMaterialClean", "process editVideoInfo.engineType=" + editVideoInfo.getEngineType() + " engineType=" + str);
                editVideoInfo.setOriginEngineType(editVideoInfo.getEngineType());
                editVideoInfo.setEngineType(str);
                List<String> list = com.bilibili.studio.editor.moudle.material.e.f107890d;
                e.a.e();
                d.h(dVar, editVideoInfo);
                List listE = d.e(dVar, editVideoInfo);
                if (((ArrayList) listE).isEmpty()) {
                    BLog.e("DataHandleMaterialClean", "materialIdMap isEmpty engineType=" + str);
                    d.g(dVar, true, function1);
                    return Unit.INSTANCE;
                }
                this.L$0 = editVideoInfo;
                this.L$1 = str;
                this.L$2 = dVar;
                this.L$3 = function1;
                this.label = 1;
                obj = d.i(dVar, listE, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$3;
                dVar = (d) this.L$2;
                str = (String) this.L$1;
                editVideoInfo = (EditVideoInfo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            materialResult = (MaterialResult) obj;
            results = materialResult != null ? materialResult.getResults() : null;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (results != null && !results.isEmpty()) {
            d.f(dVar, editVideoInfo, materialResult);
            d.g(dVar, true, function1);
            obj2 = kotlin.Result.constructor-impl(Unit.INSTANCE);
            d dVar2 = this.this$0;
            Function1<Boolean, Unit> function12 = this.$onFinish;
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                M.b("onFailure ", th2.getMessage(), "DataHandleMaterialClean");
                d.g(dVar2, false, function12);
            }
            return Unit.INSTANCE;
        }
        BLog.e("DataHandleMaterialClean", "materialDownloadRst results isNullOrEmpty engineType=" + str);
        d.g(dVar, false, function1);
        return Unit.INSTANCE;
    }
}
