package com.bilibili.studio.comm.material.task;

import com.bilibili.studio.comm.material.bean.MaterialCollectBean;
import com.bilibili.studio.comm.material.bean.MaterialUploadBean;
import com.bilibili.studio.comm.material.db.MaterialColDbBean;
import com.bilibili.upos.videoupload.UploadTaskInfo;
import kotlin.Result;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/task/MaterialCollectTask$createOrRecoveryUploadTask$2$1.class */
public final class MaterialCollectTask$createOrRecoveryUploadTask$2$1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.BooleanRef f105432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f105433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialCollectBean.MaterialInfo f105434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MaterialUploadBean f105435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MaterialColDbBean f105436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ref.BooleanRef f105437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CancellableContinuationImpl f105438g;

    public MaterialCollectTask$createOrRecoveryUploadTask$2$1(Ref.BooleanRef booleanRef, a aVar, MaterialCollectBean.MaterialInfo materialInfo, MaterialUploadBean materialUploadBean, MaterialColDbBean materialColDbBean, Ref.BooleanRef booleanRef2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105432a = booleanRef;
        this.f105433b = aVar;
        this.f105434c = materialInfo;
        this.f105435d = materialUploadBean;
        this.f105436e = materialColDbBean;
        this.f105437f = booleanRef2;
        this.f105438g = cancellableContinuationImpl;
    }

    public final void a() {
        Ref.BooleanRef booleanRef = this.f105437f;
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        this.f105438g.resumeWith(Result.constructor-impl((Object) null));
    }

    public final void b(UploadTaskInfo uploadTaskInfo) {
        Ref.BooleanRef booleanRef = this.f105432a;
        if (booleanRef.element) {
            BLog.e("MaterialCollectTask", "多次调用start了");
            return;
        }
        booleanRef.element = true;
        BuildersKt.launch$default(this.f105433b.f105444f, Dispatchers.getIO(), (CoroutineStart) null, new MaterialCollectTask$createOrRecoveryUploadTask$2$1$onUploadStart$1(this.f105434c, this.f105435d, uploadTaskInfo, this.f105436e, this.f105433b, null), 2, (Object) null);
    }
}
