package com.bilibili.studio.comm.material.task;

import Yv0.e;
import com.alibaba.fastjson.JSON;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.comm.material.MaterialCollection;
import com.bilibili.studio.comm.material.bean.MaterialCollectBean;
import com.bilibili.studio.comm.material.enums.MaterialCollectScene;
import com.bilibili.studio.comm.material.enums.MaterialCollectStep;
import com.bilibili.studio.comm.material.utils.DraftJsonUtils;
import java.util.HashMap;
import java.util.List;
import jw0.C7727a;
import jw0.b;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import lw0.C7895b;
import lw0.C7896c;
import lw0.C7898e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/task/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MaterialCollectBean f105439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MaterialCollectScene f105440b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f105445g;

    @Nullable
    public MaterialCollection.a h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final e f105444f = new e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public MaterialTaskStatus f105446i = MaterialTaskStatus.STATUS_INIT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C7895b f105441c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7896c f105442d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7898e f105443e = new Object();

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, lw0.b] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, lw0.c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, lw0.e] */
    public a(@NotNull MaterialCollectBean materialCollectBean, @NotNull MaterialCollectScene materialCollectScene) {
        this.f105439a = materialCollectBean;
        this.f105440b = materialCollectScene;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0389, code lost:
    
        com.bilibili.studio.comm.material.utils.a.a("【素材采集-任务执行】文件已经上传过,filePath=" + r0.filePath + ",uposUri=" + r0.uposUri);
        r16 = r15;
     */
    /* JADX WARN: Path cross not found for [B:44:0x020f, B:39:0x01d5], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.bilibili.upos.videoupload.UploadProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.bilibili.upos.videoupload.UploadProvider, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x027c -> B:58:0x0292). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.studio.comm.material.task.a r10, com.bilibili.studio.comm.material.db.MaterialColDbBean r11, com.bilibili.studio.comm.material.bean.MaterialUploadBean r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.material.task.a.a(com.bilibili.studio.comm.material.task.a, com.bilibili.studio.comm.material.db.MaterialColDbBean, com.bilibili.studio.comm.material.bean.MaterialUploadBean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(a aVar, MaterialCollectBean materialCollectBean) {
        aVar.f105442d.getClass();
        HashMap map = new HashMap();
        map.put("material_total", JSON.toJSONString(materialCollectBean));
        MaterialCollectBean.ProjectInfo projectInfo = materialCollectBean.projectInfo;
        map.put("video_num", String.valueOf(projectInfo != null ? Long.valueOf(projectInfo.videoNum) : null));
        MaterialCollectBean.ProjectInfo projectInfo2 = materialCollectBean.projectInfo;
        Long lValueOf = null;
        if (projectInfo2 != null) {
            lValueOf = Long.valueOf(projectInfo2.imageNum);
        }
        map.put("image_num", String.valueOf(lValueOf));
        map.put("fast_video", String.valueOf(materialCollectBean.fastVideo));
        MaterialCollectBean.CommonParam commonParam = materialCollectBean.commonParam;
        if (commonParam != null) {
            map.put("platform", commonParam.platform);
            map.put("product_name", commonParam.productName);
            map.put("first_entrance", commonParam.firstEntrance);
            map.put("send_channel", commonParam.sendChannel);
            map.put("send_type", commonParam.sendType);
            map.put("track_id", commonParam.trackId);
        }
        com.bilibili.studio.comm.material.utils.a.a("【素材采集-任务执行】采集信息上报，params=" + map);
        Neurons.reportExposure$default(false, "creation.new-publish.0.material-result.show", map, (List) null, 8, (Object) null);
    }

    public static final void c(a aVar, MaterialTaskStatus materialTaskStatus) {
        aVar.f105446i = materialTaskStatus;
        if (aVar.h != null) {
            com.bilibili.studio.comm.material.utils.a.a("【素材采集-采集中】状态变化 ,status=" + materialTaskStatus.getStatusStr());
            if (materialTaskStatus == MaterialTaskStatus.STATUS_FINISH) {
                MaterialCollection.f105430d = null;
            }
        }
    }

    public final void d(MaterialCollectStep materialCollectStep, MaterialCollectScene materialCollectScene, C7727a c7727a) {
        if (c7727a.f122665a > 0) {
            DraftJsonUtils.a(materialCollectStep.getValue());
        }
        this.f105442d.a(materialCollectStep, materialCollectScene, c7727a);
    }

    public final void e() {
        MaterialCollectStep materialCollectStep = MaterialCollectStep.STEP_START_COLLECT;
        C7727a c7727a = new C7727a(0, b.a(0));
        MaterialCollectScene materialCollectScene = this.f105440b;
        d(materialCollectStep, materialCollectScene, c7727a);
        if (this.f105446i == MaterialTaskStatus.STATUS_FINISH) {
            com.bilibili.studio.comm.material.utils.a.a("【素材采集-任务执行】状态异常,无需继续执行");
            d(MaterialCollectStep.STEP_END_COLLECT, materialCollectScene, new C7727a(12, b.a(12)));
        } else {
            this.f105445g = BuildersKt.launch$default(this.f105444f, Dispatchers.getIO(), (CoroutineStart) null, new MaterialCollectTask$runTaskImpl$1(this, null), 2, (Object) null);
        }
    }
}
