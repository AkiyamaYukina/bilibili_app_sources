package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2;

import Vn.A;
import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.gson.GsonKt;
import java.io.File;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v2/StrategyManagerImpl$saveCurSortedItems$1.class */
final class StrategyManagerImpl$saveCurSortedItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final i<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyManagerImpl$saveCurSortedItems$1(i<Object> iVar, Continuation<? super StrategyManagerImpl$saveCurSortedItems$1> continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyManagerImpl$saveCurSortedItems$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        TreeSet treeSet;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        c cVar = this.this$0.f107437e;
        if (cVar == null) {
            return Unit.INSTANCE;
        }
        synchronized (cVar.f107424f) {
            treeSet = new TreeSet((SortedSet) cVar.f107424f);
        }
        int i7 = this.this$0.f107433a.f107407a;
        Application application = BiliContext.application();
        File file = null;
        if (application != null) {
            File file2 = new File(application.getCacheDir(), "upper_album_intelligence");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (i7 == 1) {
                file = new File(file2, "last_sorted_item_all");
            } else if (i7 == 2) {
                file = new File(file2, "last_sorted_item_image");
            } else if (i7 == 3) {
                file = new File(file2, "last_sorted_item_video");
            }
        }
        if (file == null) {
            return Unit.INSTANCE;
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FilesKt.l(file, GsonKt.toJsonString(treeSet));
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        Os.f.b(A.b(this.this$0.f107433a.f107407a, treeSet.size(), "[存储分析成功的数据] ", ", 数量：", "，耗时："), System.currentTimeMillis() - jCurrentTimeMillis, "intelligence_rec_tag");
        return Unit.INSTANCE;
    }
}
