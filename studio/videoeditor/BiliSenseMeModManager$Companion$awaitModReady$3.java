package com.bilibili.studio.videoeditor;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/BiliSenseMeModManager$Companion$awaitModReady$3.class */
public final class BiliSenseMeModManager$Companion$awaitModReady$3 extends SuspendLambda implements Function2<t, Continuation<? super Boolean>, Object> {
    final BiliSenseMeModManager $manager;
    final Set<s> $modList;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliSenseMeModManager$Companion$awaitModReady$3(BiliSenseMeModManager biliSenseMeModManager, Set<s> set, Continuation<? super BiliSenseMeModManager$Companion$awaitModReady$3> continuation) {
        super(2, continuation);
        this.$manager = biliSenseMeModManager;
        this.$modList = set;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BiliSenseMeModManager$Companion$awaitModReady$3 biliSenseMeModManager$Companion$awaitModReady$3 = new BiliSenseMeModManager$Companion$awaitModReady$3(this.$manager, this.$modList, continuation);
        biliSenseMeModManager$Companion$awaitModReady$3.L$0 = obj;
        return biliSenseMeModManager$Companion$awaitModReady$3;
    }

    public final Object invoke(t tVar, Continuation<? super Boolean> continuation) {
        return create(tVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z6;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        t tVar = (t) this.L$0;
        u uVar = this.$manager.f108843e;
        Set<s> set = this.$modList;
        uVar.getClass();
        Set<s> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<T> it = set2.iterator();
            while (true) {
                z6 = true;
                if (!it.hasNext()) {
                    break;
                }
                s sVar = (s) it.next();
                if (!tVar.f109902b.contains(sVar) && !tVar.f109903c.contains(sVar)) {
                    z6 = false;
                    break;
                }
            }
        } else {
            z6 = true;
        }
        return Boxing.boxBoolean(z6);
    }
}
