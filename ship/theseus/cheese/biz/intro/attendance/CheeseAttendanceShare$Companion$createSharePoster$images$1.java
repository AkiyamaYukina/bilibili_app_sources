package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.compose.ui.graphics.painter.Painter;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceShare$Companion$createSharePoster$images$1.class */
final class CheeseAttendanceShare$Companion$createSharePoster$images$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Painter>>, Object> {
    final FragmentActivity $activity;
    final CheeseAttendanceShareMaterial $model;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceShare$Companion$createSharePoster$images$1(CheeseAttendanceShareMaterial cheeseAttendanceShareMaterial, FragmentActivity fragmentActivity, Continuation<? super CheeseAttendanceShare$Companion$createSharePoster$images$1> continuation) {
        super(2, continuation);
        this.$model = cheeseAttendanceShareMaterial;
        this.$activity = fragmentActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseAttendanceShare$Companion$createSharePoster$images$1 cheeseAttendanceShare$Companion$createSharePoster$images$1 = new CheeseAttendanceShare$Companion$createSharePoster$images$1(this.$model, this.$activity, continuation);
        cheeseAttendanceShare$Companion$createSharePoster$images$1.L$0 = obj;
        return cheeseAttendanceShare$Companion$createSharePoster$images$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Painter>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            List listListOf = CollectionsKt.listOf(new String[]{this.$model.b(), this.$model.a(), this.$model.c(), this.$model.e()});
            FragmentActivity fragmentActivity = this.$activity;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheeseAttendanceShare$Companion$createSharePoster$images$1$1$1(fragmentActivity, (String) it.next(), null), 3, (Object) null));
            }
            this.label = 1;
            Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
            obj = objAwaitAll;
            if (objAwaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
