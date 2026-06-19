package com.bilibili.studio.comm.ab;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/ab/ABManager$getDataFromNet$1.class */
public final class ABManager$getDataFromNet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final a[] $abs;
    final List<String> $emptyKeys;
    final List<String> $keys;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ABManager$getDataFromNet$1(List<String> list, List<String> list2, a[] aVarArr, Continuation<? super ABManager$getDataFromNet$1> continuation) {
        super(2, continuation);
        this.$keys = list;
        this.$emptyKeys = list2;
        this.$abs = aVarArr;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ABManager$getDataFromNet$1(this.$keys, this.$emptyKeys, this.$abs, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Application application;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                List listPlus = CollectionsKt.plus(this.$keys, this.$emptyKeys);
                this.label = 1;
                Object objA = c.a(listPlus, this);
                obj = objA;
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map map = (Map) obj;
            for (a aVar : this.$abs) {
                String strA = aVar.a();
                String str = aVar.f105342a;
                Map<String, String> map2 = ABManager.f105341a;
                String str2 = (String) map.get(str);
                Map<String, String> map3 = ABManager.f105341a;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                map3.put(strA, str3);
                String str4 = (String) map.get(str);
                if (str4 != null && (application = BiliContext.application()) != null) {
                    BiliGlobalPreferenceHelper.getInstance(application).edit().putString(strA, str4).apply();
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
