package com.bilibili.studio.editor.moudle.home.presenter;

import androidx.core.app.o;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/IntervlPreheart$newCreateAITask$2.class */
final class IntervlPreheart$newCreateAITask$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function2<Boolean, String, Unit> $onResult;
    final JSONObject $paramsJson;
    int label;
    final k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IntervlPreheart$newCreateAITask$2(k kVar, JSONObject jSONObject, Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super IntervlPreheart$newCreateAITask$2> continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$paramsJson = jSONObject;
        this.$onResult = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function2 function2, String str, String str2, String str3) {
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, "taskId " + str2);
        }
        M.b("[Intervl-Preheart] create-onSuccess taskId = ", str2, "IntervlPreheart");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Function2 function2, int i7, String str) {
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, o.a(i7, "errorCode=", " errorMsg=", str));
        }
        androidx.constraintlayout.widget.a.b(i7, "[Intervl-Preheart] create-onError errorCode = ", " errorMsg = ", str, "IntervlPreheart");
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IntervlPreheart$newCreateAITask$2(this.this$0, this.$paramsJson, this.$onResult, continuation);
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
        BiliTemplateEngineManager biliTemplateEngineManager = this.this$0.f107253b;
        if (biliTemplateEngineManager != null) {
            String string = this.$paramsJson.toString();
            final Function2<Boolean, String, Unit> function2 = this.$onResult;
            biliTemplateEngineManager.l("content_understanding_video_pink", string, "", String.class, new Function3(function2) { // from class: com.bilibili.studio.editor.moudle.home.presenter.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function2 f107254a;

                {
                    this.f107254a = function2;
                }

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return IntervlPreheart$newCreateAITask$2.invokeSuspend$lambda$0(this.f107254a, (String) obj2, (String) obj3, (String) obj4);
                }
            }, new Function2(function2) { // from class: com.bilibili.studio.editor.moudle.home.presenter.m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Function2 f107255a;

                {
                    this.f107255a = function2;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    return IntervlPreheart$newCreateAITask$2.invokeSuspend$lambda$1(this.f107255a, ((Integer) obj2).intValue(), (String) obj3);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
