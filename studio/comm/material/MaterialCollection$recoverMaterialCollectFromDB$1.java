package com.bilibili.studio.comm.material;

import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.comm.ab.d;
import com.bilibili.studio.comm.material.bean.MaterialCollectBean;
import com.bilibili.studio.comm.material.db.MaterialColDbBean;
import com.bilibili.studio.comm.material.enums.MaterialCollectScene;
import com.bilibili.studio.comm.material.utils.a;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jw0.C7727a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import lw0.C7894a;
import lw0.C7895b;
import zw0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/MaterialCollection$recoverMaterialCollectFromDB$1.class */
public final class MaterialCollection$recoverMaterialCollectFromDB$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public MaterialCollection$recoverMaterialCollectFromDB$1(Continuation<? super MaterialCollection$recoverMaterialCollectFromDB$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MaterialCollection$recoverMaterialCollectFromDB$1(continuation);
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
        MaterialCollectScene materialCollectScene = MaterialCollectScene.SCENE_APP_INI;
        MaterialCollection.f105427a.getClass();
        if (!b.k()) {
            a.a("【素材采集-恢复任务】总开关关闭，不进行素材采集");
            MaterialCollection.e(materialCollectScene, MaterialCollection.a(1));
            return Unit.INSTANCE;
        }
        MaterialCollection.f105428b.getClass();
        CopyOnWriteArrayList<MaterialColDbBean> copyOnWriteArrayListB = C7895b.b();
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayListB != null) {
            for (MaterialColDbBean materialColDbBean : copyOnWriteArrayListB) {
                if (MaterialCollection.f105427a.a(materialColDbBean.createTime)) {
                    a.a("cleanExpiredRecord 清理过期数据，materialColDbBean=" + materialColDbBean);
                    MaterialCollection.f105428b.a(materialColDbBean);
                } else {
                    arrayList.add(materialColDbBean);
                }
            }
        }
        a.a("【素材采集-恢复任务】，数据库查询，dbSize=" + (copyOnWriteArrayListB != null ? Boxing.boxInt(copyOnWriteArrayListB.size()) : null) + ",validSize=" + arrayList.size());
        if (!V.e(arrayList)) {
            C7895b c7895b = MaterialCollection.f105428b;
            c7895b.getClass();
            Application application = BiliContext.application();
            long jOptLong = application != null ? BiliGlobalPreferenceHelper.getInstance(application).optLong("upper_material_collection", 0L) : 0L;
            C7894a c7894a = MaterialCollection.f105427a;
            if (c7894a.b(jOptLong)) {
                a.a("【素材采集-恢复任务】采样周期内已经采集过数据，清除所有记录，size=" + arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MaterialCollection.f105428b.a((MaterialColDbBean) it.next());
                }
                MaterialCollection.e(materialCollectScene, MaterialCollection.a(3));
                return Unit.INSTANCE;
            }
            MaterialColDbBean materialColDbBean2 = (MaterialColDbBean) arrayList.get(0);
            a.a("【素材采集-恢复任务】恢复时间最近的任务，bean=" + materialColDbBean2);
            MaterialCollectBean materialCollectBean = (MaterialCollectBean) JSON.parseObject(materialColDbBean2.mainData, MaterialCollectBean.class);
            c7894a.getClass();
            if (!ABManager.f(d.f105355f)) {
                a.a("【素材采集-恢复任务】用户权限校验失败,不恢复任务");
                MaterialCollection.e(materialCollectScene, MaterialCollection.a(2));
                return Unit.INSTANCE;
            }
            C7727a c7727aD = c7894a.d(materialCollectBean);
            if (c7727aD.f122665a != 0) {
                a.a("【素材采集-恢复任务】素材校验异常，删除记录，time=" + materialColDbBean2.createTime);
                c7895b.a(materialColDbBean2);
                MaterialCollection.e(materialCollectScene, c7727aD);
                return Unit.INSTANCE;
            }
            a.a("【素材采集-恢复任务】开始素材采集，time=" + materialColDbBean2.createTime);
            MaterialCollection.f(materialCollectBean, MaterialCollectScene.SCENE_APP_INI);
        }
        return Unit.INSTANCE;
    }
}
