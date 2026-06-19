package com.bilibili.studio.comm.material.task;

import com.bilibili.studio.comm.material.bean.MaterialCollectBean;
import com.bilibili.studio.comm.material.bean.MaterialUploadBean;
import com.bilibili.studio.comm.material.db.MaterialColDbBean;
import com.bilibili.upos.videoupload.UploadTaskInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/task/MaterialCollectTask$createOrRecoveryUploadTask$2$1$onUploadStart$1.class */
public final class MaterialCollectTask$createOrRecoveryUploadTask$2$1$onUploadStart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MaterialColDbBean $dataToDbBean;
    final MaterialCollectBean.MaterialInfo $materialInfo;
    final UploadTaskInfo $taskInfo;
    final MaterialUploadBean $totalUploadBean;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialCollectTask$createOrRecoveryUploadTask$2$1$onUploadStart$1(MaterialCollectBean.MaterialInfo materialInfo, MaterialUploadBean materialUploadBean, UploadTaskInfo uploadTaskInfo, MaterialColDbBean materialColDbBean, a aVar, Continuation<? super MaterialCollectTask$createOrRecoveryUploadTask$2$1$onUploadStart$1> continuation) {
        super(2, continuation);
        this.$materialInfo = materialInfo;
        this.$totalUploadBean = materialUploadBean;
        this.$taskInfo = uploadTaskInfo;
        this.$dataToDbBean = materialColDbBean;
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MaterialCollectTask$createOrRecoveryUploadTask$2$1$onUploadStart$1(this.$materialInfo, this.$totalUploadBean, this.$taskInfo, this.$dataToDbBean, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r0 = r4
            int r0 = r0.label
            if (r0 != 0) goto La3
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            com.bilibili.studio.comm.material.bean.MaterialCollectBean$MaterialInfo r0 = r0.$materialInfo
            java.lang.String r0 = r0.materialId
            r6 = r0
            r0 = r4
            com.bilibili.studio.comm.material.bean.MaterialUploadBean r0 = r0.$totalUploadBean
            java.util.HashMap<java.lang.String, com.bilibili.studio.comm.material.bean.MaterialUploadBean$UploadData> r0 = r0.uploadDataMap
            r1 = r6
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L4c
            com.bilibili.studio.comm.material.bean.MaterialUploadBean$UploadData r0 = new com.bilibili.studio.comm.material.bean.MaterialUploadBean$UploadData
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r6
            r0.materialId = r1
            r0 = r5
            r1 = r4
            com.bilibili.studio.comm.material.bean.MaterialCollectBean$MaterialInfo r1 = r1.$materialInfo
            java.lang.String r1 = r1.filePath
            r0.filePath = r1
            r0 = r4
            com.bilibili.studio.comm.material.bean.MaterialUploadBean r0 = r0.$totalUploadBean
            java.util.HashMap<java.lang.String, com.bilibili.studio.comm.material.bean.MaterialUploadBean$UploadData> r0 = r0.uploadDataMap
            r1 = r6
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
        L4c:
            r0 = r4
            com.bilibili.studio.comm.material.bean.MaterialUploadBean r0 = r0.$totalUploadBean
            java.util.HashMap<java.lang.String, com.bilibili.studio.comm.material.bean.MaterialUploadBean$UploadData> r0 = r0.uploadDataMap
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            com.bilibili.studio.comm.material.bean.MaterialUploadBean$UploadData r0 = (com.bilibili.studio.comm.material.bean.MaterialUploadBean.UploadData) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L7b
            r0 = r4
            com.bilibili.upos.videoupload.UploadTaskInfo r0 = r0.$taskInfo
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L73
            r0 = r5
            java.lang.String r0 = r0.getId()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L76
        L73:
            java.lang.String r0 = ""
            r5 = r0
        L76:
            r0 = r7
            r1 = r5
            r0.taskId = r1
        L7b:
            r0 = r4
            com.bilibili.studio.comm.material.db.MaterialColDbBean r0 = r0.$dataToDbBean
            r1 = r4
            com.bilibili.studio.comm.material.bean.MaterialUploadBean r1 = r1.$totalUploadBean
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)
            r0.uploadData = r1
            r0 = r4
            com.bilibili.studio.comm.material.task.a r0 = r0.this$0
            lw0.b r0 = r0.f105441c
            r1 = r4
            com.bilibili.studio.comm.material.db.MaterialColDbBean r1 = r1.$dataToDbBean
            boolean r0 = r0.c(r1)
            java.lang.String r0 = "MaterialCollectTask"
            java.lang.String r1 = "onUploadStart 更新数据库"
            tv.danmaku.android.log.BLog.d(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.material.task.MaterialCollectTask$createOrRecoveryUploadTask$2$1$onUploadStart$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
