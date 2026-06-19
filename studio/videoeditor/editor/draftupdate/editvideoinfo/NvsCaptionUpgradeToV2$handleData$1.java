package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import com.bilibili.studio.editor.moudle.material.e;
import com.bilibili.studio.material.MaterialResult;
import com.bilibili.studio.material.Result;
import com.bilibili.studio.material.internal.EngineType;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/NvsCaptionUpgradeToV2$handleData$1.class */
final class NvsCaptionUpgradeToV2$handleData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final EditVideoInfo $data;
    final Function1<Boolean, Unit> $onNext;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NvsCaptionUpgradeToV2$handleData$1(EditVideoInfo editVideoInfo, j jVar, Function1<? super Boolean, Unit> function1, Continuation<? super NvsCaptionUpgradeToV2$handleData$1> continuation) {
        super(2, continuation);
        this.$data = editVideoInfo;
        this.this$0 = jVar;
        this.$onNext = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NvsCaptionUpgradeToV2$handleData$1(this.$data, this.this$0, this.$onNext, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EditVideoInfo editVideoInfo;
        j jVar;
        Function1<Boolean, Unit> function1;
        MaterialResult materialResult;
        List<Result> results;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                editVideoInfo = this.$data;
                jVar = this.this$0;
                function1 = this.$onNext;
                Result.Companion companion = kotlin.Result.Companion;
                BLog.i("NvsCaptionUpgradeToV2", "process editVideoInfo.engineType=" + editVideoInfo.getEngineType() + " engineType=" + jVar.f119750a);
                List<String> list = com.bilibili.studio.editor.moudle.material.e.f107890d;
                e.a.e();
                j.e(jVar, editVideoInfo);
                List listF = j.f(jVar, editVideoInfo);
                if (((ArrayList) listF).isEmpty()) {
                    BLog.e("NvsCaptionUpgradeToV2", "materialIdMap isEmpty engineType=" + jVar.f119750a);
                    j.h(jVar, true, function1);
                    return Unit.INSTANCE;
                }
                EngineType engineType = EngineType.Meicam;
                this.L$0 = editVideoInfo;
                this.L$1 = jVar;
                this.L$2 = function1;
                this.label = 1;
                obj = j.i(jVar, engineType, listF, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$2;
                jVar = (j) this.L$1;
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
            j.g(jVar, editVideoInfo, materialResult);
            j.h(jVar, true, function1);
            obj2 = kotlin.Result.constructor-impl(Unit.INSTANCE);
            j jVar2 = this.this$0;
            Function1<Boolean, Unit> function12 = this.$onNext;
            Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                M.b("onFailure ", th2.getMessage(), "NvsCaptionUpgradeToV2");
                j.h(jVar2, false, function12);
            }
            return Unit.INSTANCE;
        }
        BLog.e("NvsCaptionUpgradeToV2", "materialDownloadRst results isNullOrEmpty engineType=" + jVar.f119750a);
        j.h(jVar, false, function1);
        return Unit.INSTANCE;
    }
}
