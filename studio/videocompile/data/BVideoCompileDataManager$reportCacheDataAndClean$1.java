package com.bilibili.studio.videocompile.data;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.RawKV;
import com.bilibili.studio.videocompile.IBVideoCompileLogger;
import com.bilibili.studio.videocompile.util.BVideoCompileUtil;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videocompile/data/BVideoCompileDataManager$reportCacheDataAndClean$1.class */
public final class BVideoCompileDataManager$reportCacheDataAndClean$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BVideoCompileDataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BVideoCompileDataManager$reportCacheDataAndClean$1(BVideoCompileDataManager bVideoCompileDataManager, Continuation<? super BVideoCompileDataManager$reportCacheDataAndClean$1> continuation) {
        super(2, continuation);
        this.this$0 = bVideoCompileDataManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BVideoCompileDataManager$reportCacheDataAndClean$1(this.this$0, continuation);
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
        OA0.b.c(this.this$0, "reportCacheData start");
        Application application = BiliContext.application();
        if (application == null) {
            QA0.a.b("reportCacheData fail context is null", null);
            return Unit.INSTANCE;
        }
        String string$default = RawKV.getString$default(BLKV.getKvs$default(application, "BVideoCompileDataGroup", false, 0, 6, (Object) null), "BVideoCompileCancelData", (String) null, 2, (Object) null);
        if (TextUtils.isEmpty(string$default)) {
            OA0.b.c(this.this$0, "reportCacheData cache is empty just return");
            return Unit.INSTANCE;
        }
        OA0.b.c(this.this$0, "reportCacheData read cache success " + string$default);
        HashMap map = (HashMap) JSON.parseObject(string$default, new HashMap().getClass());
        if (map == null) {
            QA0.a.b("cancelData == null", null);
            return Unit.INSTANCE;
        }
        OA0.b.c(this.this$0, "reportCacheData parse data success");
        IBVideoCompileLogger iBVideoCompileLogger = QA0.b.f19715a;
        if (iBVideoCompileLogger != null) {
            iBVideoCompileLogger.upload();
        }
        QA0.a.d("cancel", map, true);
        String str = (String) map.get("sandboxedPath");
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        BVideoCompileDataManager bVideoCompileDataManager = this.this$0;
        bVideoCompileDataManager.getClass();
        OA0.b.c(bVideoCompileDataManager, "cleanRemainedFile");
        BVideoCompileUtil.deleteFile(str2);
        return Unit.INSTANCE;
    }
}
