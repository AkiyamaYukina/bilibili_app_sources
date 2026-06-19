package com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo;

import android.app.Application;
import com.bilibili.base.MainThread;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.foundation.Foundation;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.material.MaterialRequest;
import com.bilibili.studio.material.MaterialResult;
import com.bilibili.studio.material.MaterialSdk;
import com.bilibili.studio.material.MaterialType;
import com.bilibili.studio.material.Request;
import com.bilibili.studio.material.Result;
import com.bilibili.studio.material.internal.EngineType;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editor/draftupdate/editvideoinfo/j.class */
public final class j extends gC0.b<EditVideoInfo> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<String> f109461c = CollectionsKt.listOf(new String[]{"-4", CaptureSchema.OLD_INVALID_ID_STRING, "-10086", "-10087", "0", "NA", ""});

    public static final void e(j jVar, EditVideoInfo editVideoInfo) {
        jVar.getClass();
        for (CaptionInfo captionInfo : CollectionsKt.filterNotNull(CollectionsKt.plus(CollectionsKt.plus(editVideoInfo.getCaptionInfoList(), editVideoInfo.getDerivedCaptionInfo()), editVideoInfo.getAsrDerivedCaptionInfo()))) {
            if (DeviceDecision.INSTANCE.getBoolean("upper.caption_smart_video_anim_renderer_enable", true)) {
                CaptionAssetBean captionAssetBean = captionInfo.captionAssetBean;
                if (captionAssetBean != null) {
                    captionAssetBean.captionStylePackagePath = "";
                }
                if (captionAssetBean != null) {
                    captionAssetBean.captionStylePackageId = "";
                }
            } else {
                if (k(String.valueOf(captionInfo.flowerId))) {
                    captionInfo.flowerId = -1;
                    CaptionAssetBean captionAssetBean2 = captionInfo.captionAssetBean;
                    if (captionAssetBean2 != null) {
                        captionAssetBean2.captionRendererPackagePath = "";
                    }
                    if (captionAssetBean2 != null) {
                        captionAssetBean2.captionRendererPackageId = "";
                    }
                }
                if (k(String.valueOf(captionInfo.inAnimId))) {
                    captionInfo.inAnimId = -1;
                    CaptionAssetBean captionAssetBean3 = captionInfo.captionAssetBean;
                    if (captionAssetBean3 != null) {
                        captionAssetBean3.captionInAnimationPackagePath = "";
                    }
                    if (captionAssetBean3 != null) {
                        captionAssetBean3.captionInAnimationPackageId = "";
                    }
                }
                if (k(String.valueOf(captionInfo.outAnimId))) {
                    captionInfo.outAnimId = -1;
                    CaptionAssetBean captionAssetBean4 = captionInfo.captionAssetBean;
                    if (captionAssetBean4 != null) {
                        captionAssetBean4.captionOutAnimationPackagePath = "";
                    }
                    if (captionAssetBean4 != null) {
                        captionAssetBean4.captionOutAnimationPackageId = "";
                    }
                }
                if (k(String.valueOf(captionInfo.circleAnimId))) {
                    captionInfo.circleAnimId = -1;
                    CaptionAssetBean captionAssetBean5 = captionInfo.captionAssetBean;
                    if (captionAssetBean5 != null) {
                        captionAssetBean5.captionAnimationPackagePath = "";
                    }
                    if (captionAssetBean5 != null) {
                        captionAssetBean5.captionAnimationPackageId = "";
                    }
                }
            }
        }
    }

    public static final List f(j jVar, EditVideoInfo editVideoInfo) {
        jVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (CaptionInfo captionInfo : CollectionsKt.filterNotNull(CollectionsKt.plus(CollectionsKt.plus(editVideoInfo.getCaptionInfoList(), editVideoInfo.getDerivedCaptionInfo()), editVideoInfo.getAsrDerivedCaptionInfo()))) {
            String strValueOf = String.valueOf(captionInfo.idTmp);
            if (k(strValueOf)) {
                Request request = new Request(strValueOf, null, MaterialType.CaptionTemplate.INSTANCE, 2, null);
                request.setEngineType(EngineType.Meicam);
                Application app2 = Foundation.Companion.instance().getApp();
                String str = OC0.h.f17810a;
                request.setFilePath(OC0.h.i(app2) + "template");
                arrayList.add(request);
            } else {
                OC0.h.a(captionInfo.captionAssetBean);
            }
        }
        return arrayList;
    }

    public static final void g(j jVar, EditVideoInfo editVideoInfo, MaterialResult materialResult) {
        Object objEmptyList;
        File[] fileArrListFiles;
        Object next;
        jVar.getClass();
        for (CaptionInfo captionInfo : CollectionsKt.filterNotNull(CollectionsKt.plus(CollectionsKt.plus(editVideoInfo.getCaptionInfoList(), editVideoInfo.getDerivedCaptionInfo()), editVideoInfo.getAsrDerivedCaptionInfo()))) {
            String strValueOf = String.valueOf(captionInfo.idTmp);
            if (k(strValueOf)) {
                captionInfo.captionAssetBean = new CaptionAssetBean();
                Result result = null;
                if (strValueOf != null) {
                    if (strValueOf.length() == 0) {
                        result = null;
                    } else {
                        Iterator<T> it = materialResult.getResults().iterator();
                        do {
                            next = null;
                            if (!it.hasNext()) {
                                break;
                            } else {
                                next = it.next();
                            }
                        } while (!Intrinsics.areEqual(((Result) next).getId(), strValueOf));
                        result = (Result) next;
                    }
                }
                if (result != null && result.getFilePath() != null) {
                    File file = new File(result.getFilePath());
                    if (file.exists() && file.isDirectory()) {
                        ArrayList arrayList = new ArrayList();
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(file);
                        while (true) {
                            objEmptyList = arrayList;
                            if (linkedList.isEmpty()) {
                                break;
                            }
                            File file2 = (File) linkedList.remove(0);
                            if (file2.exists()) {
                                arrayList.add(file2.getAbsolutePath());
                            }
                            if (file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null) {
                                for (File file3 : fileArrListFiles) {
                                    linkedList.add(file3);
                                }
                            }
                        }
                    } else {
                        objEmptyList = CollectionsKt.emptyList();
                    }
                    Iterator it2 = ((Iterable) objEmptyList).iterator();
                    while (it2.hasNext()) {
                        OC0.h.N(captionInfo.captionAssetBean, (String) it2.next());
                    }
                }
            }
        }
    }

    public static final void h(j jVar, final boolean z6, final Function1 function1) {
        jVar.getClass();
        List<String> list = com.bilibili.studio.editor.moudle.material.e.f107890d;
        MaterialSdk materialSdk = MaterialSdk.INSTANCE;
        if (materialSdk.isInitialized()) {
            materialSdk.reset();
        }
        MainThread.runOnMainThread(new Function0(function1, z6) { // from class: com.bilibili.studio.videoeditor.editor.draftupdate.editvideoinfo.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function1 f109458a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f109459b;

            {
                this.f109458a = function1;
                this.f109459b = z6;
            }

            public final Object invoke() {
                this.f109458a.invoke(Boolean.valueOf(this.f109459b));
                return Unit.INSTANCE;
            }
        });
    }

    public static final Object i(j jVar, EngineType engineType, List list, Continuation continuation) {
        jVar.getClass();
        MaterialRequest materialRequest = new MaterialRequest();
        materialRequest.setEngineType(engineType);
        materialRequest.getRequests().addAll(list);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        MaterialSdk.INSTANCE.downloadMultiMaterial(CoroutineScopeKt.CoroutineScope(JobKt.Job$default((Job) null, 1, (Object) null)), materialRequest, new i(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static boolean k(String str) {
        return (str == null || str.length() == 0 || f109461c.contains(str)) ? false : true;
    }

    @Override // gC0.b
    public final void b(Object obj, gC0.a aVar) {
        defpackage.a.b("start process engineType=", this.f119750a, "NvsCaptionUpgradeToV2");
        BuildersKt.launch$default(com.bilibili.adcommon.utils.ext.c.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)), (CoroutineContext) null, (CoroutineStart) null, new NvsCaptionUpgradeToV2$handleData$1((EditVideoInfo) obj, this, aVar, null), 3, (Object) null);
    }

    @Override // gC0.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean c(@NotNull EditVideoInfo editVideoInfo, @Nullable String str) {
        Object next;
        String str2;
        if (str == null || str.length() == 0 || Intrinsics.areEqual(editVideoInfo.getEngineType(), "StudioMon") || Intrinsics.areEqual(str, "StudioMon")) {
            return false;
        }
        Iterator<T> it = editVideoInfo.getCaptionInfoList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CaptionAssetBean captionAssetBean = ((CaptionInfo) next).captionAssetBean;
            if (captionAssetBean != null && (str2 = captionAssetBean.captionStylePackagePath) != null && StringsKt.w(str2, ".captionstyle")) {
                break;
            }
        }
        boolean z6 = next != null;
        if (z6 && DeviceDecision.INSTANCE.getBoolean("upper.caption_smart_video_anim_renderer_enable", true)) {
            return true;
        }
        return (z6 || DeviceDecision.INSTANCE.getBoolean("upper.caption_smart_video_anim_renderer_enable", true)) ? false : true;
    }
}
