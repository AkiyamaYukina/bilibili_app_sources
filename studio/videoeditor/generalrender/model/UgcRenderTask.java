package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import L50.a;
import R50.r;
import android.os.Build;
import androidx.compose.foundation.text.C0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.z;
import bolts.Task;
import com.bilibili.base.MainThread;
import com.bilibili.bplus.followinglist.service.G0;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.studio.module.tuwen.model.BCutCodecInfo;
import com.bilibili.studio.videoeditor.annual.api.CodecInfo;
import com.bilibili.studio.videoeditor.generalrender.bean.GRRenderTaskStatusResult;
import com.bilibili.studio.videoeditor.generalrender.bean.GRXmlBean;
import com.bilibili.studio.videoeditor.generalrender.model.d;
import com.bilibili.studio.videoeditor.generalrender.model.f;
import com.bilibili.studio.videoeditor.generalrender.ugcbridge.a;
import com.bilibili.studio.videoeditor.ms.EditorEngineSDKLoadManager;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.template.util.BiliTemplateEnvironment;
import fD0.InterfaceC7041a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/UgcRenderTask.class */
public final class UgcRenderTask implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public FragmentActivity f109577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public GRXmlBean f109578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public d.a f109579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public InterfaceC2297a f109580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public GRRenderTaskStatusResult f109581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CodecInfo f109582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f109583g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f109584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f109585j;

    /* JADX INFO: renamed from: com.bilibili.studio.videoeditor.generalrender.model.UgcRenderTask$run$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/UgcRenderTask$run$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final UgcRenderTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcRenderTask ugcRenderTask, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcRenderTask;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            UgcRenderTask ugcRenderTask;
            final String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String scene = this.this$0.f109578b.getScene();
                if (scene != null && scene.length() != 0) {
                    ugcRenderTask = this.this$0;
                    String str2 = f.f109601c;
                    f fVarF = f.a.f();
                    UgcRenderTask ugcRenderTask2 = this.this$0;
                    FragmentActivity fragmentActivity = ugcRenderTask2.f109577a;
                    String scene2 = ugcRenderTask2.f109578b.getScene();
                    this.L$0 = ugcRenderTask;
                    this.label = 1;
                    fVarF.getClass();
                    if (scene2 == null || scene2.length() == 0) {
                        obj = null;
                    } else {
                        obj = (CodecInfo) ((LinkedHashMap) fVarF.f109603a).get(scene2);
                        if (obj == null) {
                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                            cancellableContinuationImpl.initCancellability();
                            ((TA0.a) ServiceGenerator.createService(TA0.a.class)).getCodecInfo(BiliAccounts.get(fragmentActivity.getApplicationContext()).getAccessKey(), Build.MODEL, scene2).enqueue(new h(cancellableContinuationImpl, scene2, fVarF));
                            Object result = cancellableContinuationImpl.getResult();
                            obj = result;
                            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(this);
                                obj = result;
                            }
                        }
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Lazy<com.bilibili.studio.videoeditor.generalrender.ugcbridge.a> lazy = com.bilibili.studio.videoeditor.generalrender.ugcbridge.a.f109659g;
                List list = (List) ((LinkedHashMap) a.b.a().f109661b).get(Long.valueOf(this.this$0.f109578b.getTemplateId()));
                str = (String) ((LinkedHashMap) a.b.a().f109662c).get(Long.valueOf(this.this$0.f109578b.getTemplateId()));
                if (str != null || str.length() == 0) {
                    this.this$0.f109580d.a(k.e(-901, -1L, "templatePath isNullOrEmpty"));
                    UgcRenderTask ugcRenderTask3 = this.this$0;
                    ugcRenderTask3.f109581e = new GRRenderTaskStatusResult(Boxing.boxLong(ugcRenderTask3.f109578b.getTemplateId()), "error", Boxing.boxFloat(this.this$0.f109584i), "", Boxing.boxInt(-901), "templatePath isNullOrEmpty", null, 64, null);
                    this.this$0.f109579c.a();
                    return Unit.INSTANCE;
                }
                UgcRenderTask ugcRenderTask4 = this.this$0;
                ugcRenderTask4.f109580d.a(k.e(0, ugcRenderTask4.f109578b.getTemplateId(), ""));
                UgcRenderTask ugcRenderTask5 = this.this$0;
                CodecInfo codecInfo = ugcRenderTask5.f109582f;
                ugcRenderTask5.f109583g = System.currentTimeMillis();
                v vVar = v.f109656a;
                FragmentActivity fragmentActivity2 = ugcRenderTask5.f109577a;
                vVar.getClass();
                v.a(fragmentActivity2, false);
                com.bilibili.studio.videoeditor.generalrender.ugcbridge.a aVarA = a.b.a();
                final FragmentActivity fragmentActivity3 = ugcRenderTask5.f109577a;
                final String strValueOf = String.valueOf(ugcRenderTask5.f109578b.getTemplateId());
                G0 g02 = new G0(1, ugcRenderTask5, codecInfo);
                final KH.h hVar = new KH.h(ugcRenderTask5, 2);
                final KH.i iVar = new KH.i(ugcRenderTask5, 3);
                final E50.g gVar = new E50.g(ugcRenderTask5, 7);
                aVarA.getClass();
                BLog.ifmt("UGCTemplateRenderManager", z.a("renderVideo templateId:", strValueOf, " templateLocalPath:", str), new Object[0]);
                BCutCodecInfo bCutCodecInfo = null;
                if (codecInfo != null) {
                    bCutCodecInfo = new BCutCodecInfo(codecInfo.bitRate / 1000000.0f, codecInfo.frameRate, codecInfo.gop, codecInfo.resolution, codecInfo.fixGop);
                }
                final BiliTemplateEngineManager biliTemplateEngineManagerD = aVarA.d(fragmentActivity3);
                final BCutCodecInfo bCutCodecInfo2 = bCutCodecInfo;
                final ArrayList arrayListA = hD0.a.a(list);
                final zC0.d dVar = new zC0.d(aVarA, fragmentActivity3, g02, hVar);
                BiliTemplateEngineManager.c(biliTemplateEngineManagerD, false, false, false, new Function1(gVar, hVar, iVar, fragmentActivity3, bCutCodecInfo2, biliTemplateEngineManagerD, strValueOf, str, arrayListA, dVar) { // from class: com.bilibili.studio.videoeditor.template.Y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final E50.g f110017a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final BiliTemplateEngineManager f110018b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final FragmentActivity f110019c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final String f110020d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final String f110021e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final BCutCodecInfo f110022f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final List f110023g;
                    public final zC0.d h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final KH.h f110024i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final KH.i f110025j;

                    {
                        this.f110017a = gVar;
                        this.f110018b = biliTemplateEngineManagerD;
                        this.f110019c = fragmentActivity3;
                        this.f110020d = strValueOf;
                        this.f110021e = str;
                        this.f110022f = bCutCodecInfo2;
                        this.f110023g = arrayListA;
                        this.h = dVar;
                        this.f110024i = hVar;
                        this.f110025j = iVar;
                    }

                    public final Object invoke(Object obj2) {
                        Unit unit;
                        final List list2 = this.f110023g;
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        final E50.g gVar2 = this.f110017a;
                        if (zBooleanValue) {
                            final BiliTemplateEngineManager biliTemplateEngineManager = this.f110018b;
                            final zC0.d dVar2 = this.h;
                            final KH.h hVar2 = this.f110024i;
                            final KH.i iVar2 = this.f110025j;
                            final FragmentActivity fragmentActivity4 = this.f110019c;
                            final String str3 = this.f110020d;
                            final String str4 = this.f110021e;
                            final BCutCodecInfo bCutCodecInfo3 = this.f110022f;
                            biliTemplateEngineManager.e(false, false, new Function1(gVar2, hVar2, iVar2, fragmentActivity4, bCutCodecInfo3, biliTemplateEngineManager, str3, str4, list2, dVar2) { // from class: com.bilibili.studio.videoeditor.template.Z

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final E50.g f110026a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final FragmentActivity f110027b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final BiliTemplateEngineManager f110028c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final String f110029d;

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                public final String f110030e;

                                /* JADX INFO: renamed from: f, reason: collision with root package name */
                                public final BCutCodecInfo f110031f;

                                /* JADX INFO: renamed from: g, reason: collision with root package name */
                                public final List f110032g;
                                public final zC0.d h;

                                /* JADX INFO: renamed from: i, reason: collision with root package name */
                                public final KH.h f110033i;

                                /* JADX INFO: renamed from: j, reason: collision with root package name */
                                public final KH.i f110034j;

                                {
                                    this.f110026a = gVar2;
                                    this.f110027b = fragmentActivity4;
                                    this.f110028c = biliTemplateEngineManager;
                                    this.f110029d = str3;
                                    this.f110030e = str4;
                                    this.f110031f = bCutCodecInfo3;
                                    this.f110032g = list2;
                                    this.h = dVar2;
                                    this.f110033i = hVar2;
                                    this.f110034j = iVar2;
                                }

                                public final Object invoke(Object obj3) {
                                    final FragmentActivity fragmentActivity5;
                                    Unit unit2;
                                    final List list3 = this.f110032g;
                                    boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                                    E50.g gVar3 = this.f110026a;
                                    if (!zBooleanValue2 || (fragmentActivity5 = this.f110027b) == null || fragmentActivity5.isFinishing()) {
                                        gVar3.invoke(Boolean.FALSE);
                                        unit2 = Unit.INSTANCE;
                                    } else {
                                        gVar3.invoke(Boolean.TRUE);
                                        final BiliTemplateEngineManager biliTemplateEngineManager2 = this.f110028c;
                                        final zC0.d dVar3 = this.h;
                                        final KH.h hVar3 = this.f110033i;
                                        final KH.i iVar3 = this.f110034j;
                                        final String str5 = this.f110029d;
                                        final String str6 = this.f110030e;
                                        final BCutCodecInfo bCutCodecInfo4 = this.f110031f;
                                        MainThread.runOnMainThread(new Function0(biliTemplateEngineManager2, fragmentActivity5, str5, str6, bCutCodecInfo4, list3, dVar3, hVar3, iVar3) { // from class: com.bilibili.studio.videoeditor.template.a0

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final BiliTemplateEngineManager f110039a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final FragmentActivity f110040b;

                                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                                            public final String f110041c;

                                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                                            public final String f110042d;

                                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                                            public final BCutCodecInfo f110043e;

                                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                                            public final List f110044f;

                                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                                            public final zC0.d f110045g;
                                            public final KH.h h;

                                            /* JADX INFO: renamed from: i, reason: collision with root package name */
                                            public final KH.i f110046i;

                                            {
                                                this.f110039a = biliTemplateEngineManager2;
                                                this.f110040b = fragmentActivity5;
                                                this.f110041c = str5;
                                                this.f110042d = str6;
                                                this.f110043e = bCutCodecInfo4;
                                                this.f110044f = list3;
                                                this.f110045g = dVar3;
                                                this.h = hVar3;
                                                this.f110046i = iVar3;
                                            }

                                            public final Object invoke() {
                                                List list4 = this.f110044f;
                                                BiliTemplateEngineManager biliTemplateEngineManager3 = this.f110039a;
                                                L50.a aVar = a.a.a;
                                                r.f fVarV = null;
                                                if ((aVar.a != null ? R50.r.u() : null) != null) {
                                                    R50.r rVarU = aVar.a != null ? R50.r.u() : null;
                                                    if (!(rVarU != null ? rVarU.b.isSdkAuthorised() : false)) {
                                                        R50.r rVarU2 = aVar.a != null ? R50.r.u() : null;
                                                        if (rVarU2 != null) {
                                                            fVarV = rVarU2.v();
                                                        }
                                                        Xz0.d.F("one_click_submit", fVarV, "");
                                                    }
                                                }
                                                InterfaceC7041a interfaceC7041a = biliTemplateEngineManager3.f109914e;
                                                if (interfaceC7041a != null) {
                                                    interfaceC7041a.e(this.f110040b, this.f110041c, this.f110042d, this.f110043e, list4, EditorEngineSDKLoadManager.getAuroraResourcesDirPath(), this.f110045g, this.h, this.f110046i);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        });
                                        unit2 = Unit.INSTANCE;
                                    }
                                    return unit2;
                                }
                            });
                            unit = Unit.INSTANCE;
                        } else {
                            gVar2.invoke(Boolean.FALSE);
                            unit = Unit.INSTANCE;
                        }
                        return unit;
                    }
                }, 4);
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ugcRenderTask = (UgcRenderTask) this.L$0;
            ResultKt.throwOnFailure(obj);
            ugcRenderTask.f109582f = (CodecInfo) obj;
            Lazy<com.bilibili.studio.videoeditor.generalrender.ugcbridge.a> lazy2 = com.bilibili.studio.videoeditor.generalrender.ugcbridge.a.f109659g;
            List list2 = (List) ((LinkedHashMap) a.b.a().f109661b).get(Long.valueOf(this.this$0.f109578b.getTemplateId()));
            str = (String) ((LinkedHashMap) a.b.a().f109662c).get(Long.valueOf(this.this$0.f109578b.getTemplateId()));
            if (str != null) {
            }
            this.this$0.f109580d.a(k.e(-901, -1L, "templatePath isNullOrEmpty"));
            UgcRenderTask ugcRenderTask32 = this.this$0;
            ugcRenderTask32.f109581e = new GRRenderTaskStatusResult(Boxing.boxLong(ugcRenderTask32.f109578b.getTemplateId()), "error", Boxing.boxFloat(this.this$0.f109584i), "", Boxing.boxInt(-901), "templatePath isNullOrEmpty", null, 64, null);
            this.this$0.f109579c.a();
            return Unit.INSTANCE;
        }
    }

    public static void a(UgcRenderTask ugcRenderTask) {
        Integer errCode;
        Integer errCode2;
        GRRenderTaskStatusResult gRRenderTaskStatusResult = ugcRenderTask.f109581e;
        double d7 = 0.0d;
        if (Intrinsics.areEqual(gRRenderTaskStatusResult != null ? gRRenderTaskStatusResult.getStatus() : null, "success")) {
            long templateId = ugcRenderTask.f109578b.getTemplateId();
            if (((Boolean) zw0.b.f130963o.getValue()).booleanValue()) {
                Task.callInBackground(new CC0.e(String.valueOf(templateId), "", 1));
            }
            String name = ugcRenderTask.f109578b.getName();
            String scene = ugcRenderTask.f109578b.getScene();
            if (ugcRenderTask.h != 0) {
                d7 = ((r0 - ugcRenderTask.f109583g) * 1.0d) / ((double) 1000);
            }
            GRRenderTaskStatusResult gRRenderTaskStatusResult2 = ugcRenderTask.f109581e;
            wC0.a.c(name, scene, d7, "success", (gRRenderTaskStatusResult2 == null || (errCode2 = gRRenderTaskStatusResult2.getErrCode()) == null) ? 0 : errCode2.intValue(), (String) null, Long.valueOf(ugcRenderTask.f109578b.getTemplateId()), 32);
            return;
        }
        String name2 = ugcRenderTask.f109578b.getName();
        String scene2 = ugcRenderTask.f109578b.getScene();
        if (ugcRenderTask.h != 0) {
            d7 = ((r0 - ugcRenderTask.f109583g) * 1.0d) / ((double) 1000);
        }
        GRRenderTaskStatusResult gRRenderTaskStatusResult3 = ugcRenderTask.f109581e;
        int iIntValue = (gRRenderTaskStatusResult3 == null || (errCode = gRRenderTaskStatusResult3.getErrCode()) == null) ? -700 : errCode.intValue();
        GRRenderTaskStatusResult gRRenderTaskStatusResult4 = ugcRenderTask.f109581e;
        String message = null;
        if (gRRenderTaskStatusResult4 != null) {
            message = gRRenderTaskStatusResult4.getMessage();
        }
        wC0.a.b(name2, scene2, d7, "failure", iIntValue, message, Long.valueOf(ugcRenderTask.f109578b.getTemplateId()));
    }

    @Override // com.bilibili.studio.videoeditor.generalrender.model.s
    public final void release() {
        BiliTemplateEnvironment biliTemplateEnvironment;
        InterfaceC7041a interfaceC7041a;
        this.f109585j = false;
        Lazy<com.bilibili.studio.videoeditor.generalrender.ugcbridge.a> lazy = com.bilibili.studio.videoeditor.generalrender.ugcbridge.a.f109659g;
        BiliTemplateEngineManager biliTemplateEngineManager = a.b.a().f109663d;
        if (biliTemplateEngineManager == null || (biliTemplateEnvironment = biliTemplateEngineManager.f109913d) == null) {
            return;
        }
        boolean zIsEditorEngineModAvailable = biliTemplateEnvironment.isEditorEngineModAvailable();
        Boolean boolValueOf = Boolean.valueOf(zIsEditorEngineModAvailable);
        if (!zIsEditorEngineModAvailable) {
            boolValueOf = null;
        }
        if (boolValueOf == null || (interfaceC7041a = biliTemplateEngineManager.f109914e) == null) {
            return;
        }
        interfaceC7041a.releaseTemplate();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0.c(this.f109578b.getTemplateId(), "run taskId:", "GRResultFactory");
        if (this.f109585j) {
            return;
        }
        this.f109585j = true;
        Job jobLaunch$default = BuildersKt.launch$default(CoroutineScopeKt.MainScope(), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        if (t.f109653a == null) {
            t.f109653a = new ConcurrentHashMap<>();
        }
        CopyOnWriteArrayList<Job> copyOnWriteArrayList = t.f109653a.get("GR_JOB");
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(jobLaunch$default);
        } else {
            t.f109653a.put("GR_JOB", new CopyOnWriteArrayList<>());
        }
    }

    @Override // com.bilibili.studio.videoeditor.generalrender.model.s
    public final long x() {
        return this.f109578b.getTemplateId();
    }

    @Override // com.bilibili.studio.videoeditor.generalrender.model.s
    @Nullable
    public final GRRenderTaskStatusResult y() {
        return this.f109581e;
    }
}
