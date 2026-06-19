package com.bilibili.studio.comm.material;

import Yv0.e;
import android.app.Application;
import com.alibaba.fastjson.JSON;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.comm.ab.d;
import com.bilibili.studio.comm.material.bean.MaterialCollectBean;
import com.bilibili.studio.comm.material.db.MaterialColDbBean;
import com.bilibili.studio.comm.material.enums.MaterialCollectScene;
import com.bilibili.studio.comm.material.enums.MaterialCollectStep;
import com.bilibili.studio.comm.material.utils.DraftJsonUtils;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.upos.videoupload.UpOSTask;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import jw0.C7727a;
import jw0.b;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import lw0.C7894a;
import lw0.C7895b;
import lw0.C7896c;
import lw0.C7898e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/MaterialCollection.class */
public final class MaterialCollection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static com.bilibili.studio.comm.material.task.a f105430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final e f105431e = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C7894a f105427a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C7895b f105428b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C7896c f105429c = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/MaterialCollection$a.class */
    public static final class a {
    }

    public static C7727a a(int i7) {
        return new C7727a(i7, b.a(i7));
    }

    public static void b(@NotNull MaterialCollectBean materialCollectBean, @NotNull MaterialCollectScene materialCollectScene) {
        C7894a c7894a = f105427a;
        c7894a.getClass();
        if (!zw0.b.k()) {
            com.bilibili.studio.comm.material.utils.a.a("【素材采集-新建任务】总开关关闭，不进行素材采集");
            e(materialCollectScene, a(1));
            return;
        }
        c7894a.getClass();
        if (materialCollectBean.archiveType != MaterialCollectBean.NORMAL) {
            com.bilibili.studio.comm.material.utils.a.a("【素材采集-新建任务】投稿类型不通过，不进行素材采集");
            e(materialCollectScene, a(14));
            return;
        }
        c7894a.getClass();
        if (!ABManager.f(d.f105355f)) {
            com.bilibili.studio.comm.material.utils.a.a("【素材采集-新建任务】 用户权限检查不通过，不进行素材采集");
            e(materialCollectScene, a(2));
            return;
        }
        C7895b c7895b = f105428b;
        c7895b.getClass();
        Application application = BiliContext.application();
        long jOptLong = 0;
        if (application != null) {
            jOptLong = BiliGlobalPreferenceHelper.getInstance(application).optLong("upper_material_collection", 0L);
        }
        if (c7894a.b(jOptLong)) {
            com.bilibili.studio.comm.material.utils.a.a("【素材采集-新建任务】采集周期内(3天)已经采集过，不再进行采集");
            e(materialCollectScene, a(3));
            return;
        }
        C7727a c7727aD = c7894a.d(materialCollectBean);
        if (c7727aD.f122665a != 0) {
            com.bilibili.studio.comm.material.utils.a.a("【素材采集-新建任务】素材检查不通过，不进行素材采集,".concat(c7727aD.f122666b));
            e(materialCollectScene, c7727aD);
            return;
        }
        c7895b.getClass();
        CopyOnWriteArrayList copyOnWriteArrayListB = C7895b.b();
        MaterialColDbBean materialColDbBean = null;
        if (!V.e(copyOnWriteArrayListB) && copyOnWriteArrayListB != null) {
            materialColDbBean = (MaterialColDbBean) copyOnWriteArrayListB.get(0);
        }
        if (materialColDbBean != null) {
            MaterialCollectBean materialCollectBean2 = (MaterialCollectBean) JSON.parseObject(materialColDbBean.mainData, MaterialCollectBean.class);
            if (!c7894a.a(materialColDbBean.createTime) && materialCollectBean2 != null) {
                com.bilibili.studio.comm.material.utils.a.a("【素材采集-新建任务】恢复上一条未采集完记录，开始素材采集～～,createTime=" + materialColDbBean.createTime);
                f(materialCollectBean2, materialCollectScene);
                return;
            }
            c7895b.a(materialColDbBean);
        }
        com.bilibili.studio.comm.material.utils.a.a("【素材采集-新建任务】开始素材采集~~");
        f(materialCollectBean, materialCollectScene);
    }

    public static void c() {
        f105427a.getClass();
        if (zw0.b.k()) {
            com.bilibili.studio.comm.material.utils.a.a("【素材采集-暂停任务】暂停素材采集任务,currentTask=" + f105430d);
            com.bilibili.studio.comm.material.task.a aVar = f105430d;
            if (aVar != null) {
                C7898e c7898e = aVar.f105443e;
                UpOSTask upOSTask = c7898e.f123405a;
                if (upOSTask != null) {
                    upOSTask.pause();
                }
                c7898e.f123405a = null;
                Job job = aVar.f105445g;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
            }
        }
    }

    public static void d() {
        BuildersKt.launch$default(f105431e, Dispatchers.getIO(), (CoroutineStart) null, new MaterialCollection$recoverMaterialCollectFromDB$1(null), 2, (Object) null);
    }

    public static void e(MaterialCollectScene materialCollectScene, C7727a c7727a) {
        if (c7727a.f122665a > 0) {
            DraftJsonUtils.a("【素材采集-权限校验】不通过 ");
        }
        f105429c.a(MaterialCollectStep.STEP_PRE_CHECK, materialCollectScene, c7727a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bilibili.studio.comm.material.MaterialCollection$a, java.lang.Object] */
    public static void f(MaterialCollectBean materialCollectBean, MaterialCollectScene materialCollectScene) {
        e(materialCollectScene, a(0));
        com.bilibili.studio.comm.material.task.a aVar = new com.bilibili.studio.comm.material.task.a(materialCollectBean, materialCollectScene);
        f105430d = aVar;
        aVar.h = new Object();
        aVar.e();
    }
}
