package com.bilibili.studio.editor.moudle.aistory.processor;

import android.content.Context;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryProcessorBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AiFrameResultBean;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.upos.videoupload.UpOSTask;
import com.bilibili.upper.module.aistory.model.l;
import com.bilibili.upper.module.aistory.model.m;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor.class */
public final class AIStoryGenTagProcessor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Map<String, List<AiFrameResultBean>> f105707f = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Context f105708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f105709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d f105710c = new com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d(ec.a.a(com.bilibili.adcommon.utils.a.a(), System.currentTimeMillis(), "_"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f105711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105712e;

    public static final void a(AIStoryGenTagProcessor aIStoryGenTagProcessor, AIStoryFrameBean aIStoryFrameBean) {
        aIStoryGenTagProcessor.getClass();
        String filePath = aIStoryFrameBean.getFilePath();
        if (filePath != null) {
            Map<String, List<AiFrameResultBean>> map = f105707f;
            synchronized (map) {
                map.put(filePath, aIStoryFrameBean.getFrameResult());
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor r6, java.util.List r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$cacheLocalFrameTag$1
            if (r0 == 0) goto L2e
            r0 = r8
            com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$cacheLocalFrameTag$1 r0 = (com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$cacheLocalFrameTag$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L38
        L2e:
            com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$cacheLocalFrameTag$1 r0 = new com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$cacheLocalFrameTag$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L38:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6b
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L61
            r0 = r8
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            r7 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9c
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r11 = r0
            com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$cacheLocalFrameTag$2 r0 = new com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$cacheLocalFrameTag$2
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = 0
            r1.<init>(r2, r3, r4)
            r6 = r0
            r0 = r8
            r1 = r7
            r0.L$0 = r1
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r6
            r2 = r8
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r1 = r10
            if (r0 != r1) goto L9c
            r0 = r10
            r6 = r0
            goto L9e
        L9c:
            r0 = r7
            r6 = r0
        L9e:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor.b(com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor r5, java.util.List r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$checkSensitiveFrames$1
            if (r0 == 0) goto L2e
            r0 = r7
            com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$checkSensitiveFrames$1 r0 = (com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$checkSensitiveFrames$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L38
        L2e:
            com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$checkSensitiveFrames$1 r0 = new com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$checkSensitiveFrames$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L38:
            r0 = r7
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L74
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L6a
            r0 = r7
            java.lang.Object r0 = r0.L$1
            java.util.Iterator r0 = (java.util.Iterator) r0
            r9 = r0
            r0 = r7
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            r6 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L84
        L6a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L74:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L84:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lbc
            r0 = r9
            java.lang.Object r0 = r0.next()
            com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean r0 = (com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean) r0
            r11 = r0
            r0 = r7
            r1 = r6
            r0.L$0 = r1
            r0 = r7
            r1 = r9
            r0.L$1 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r11
            r2 = r7
            java.lang.Object r0 = r0.e(r1, r2)
            r1 = r10
            if (r0 != r1) goto L84
            r0 = r10
            r6 = r0
            goto Lbc
        Lbc:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor.c(com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor r6, com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$initFrameResult$1
            if (r0 == 0) goto L2e
            r0 = r8
            com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$initFrameResult$1 r0 = (com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$initFrameResult$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L38
        L2e:
            com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$initFrameResult$1 r0 = new com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$initFrameResult$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L38:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6b
            r0 = r9
            r1 = 1
            if (r0 != r1) goto L61
            r0 = r8
            java.lang.Object r0 = r0.L$0
            com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean r0 = (com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean) r0
            r7 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9c
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r11 = r0
            com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$initFrameResult$2 r0 = new com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$initFrameResult$2
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = 0
            r1.<init>(r2, r3, r4)
            r6 = r0
            r0 = r8
            r1 = r7
            r0.L$0 = r1
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r11
            r1 = r6
            r2 = r8
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r1 = r10
            if (r0 != r1) goto L9c
            r0 = r10
            r6 = r0
            goto L9e
        L9c:
            r0 = r7
            r6 = r0
        L9e:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor.d(com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor, com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Type inference failed for: r0v38, types: [com.bilibili.studio.editor.moudle.aistory.sensitive.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor.e(com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Unit f(@NotNull Context context, @NotNull AIStoryProcessorBean aIStoryProcessorBean, @Nullable l lVar, @NotNull m mVar, int i7) {
        this.f105711d = false;
        this.f105708a = context;
        this.f105712e = i7;
        if (ConnectivityMonitor.getInstance().isNetworkActive()) {
            BuildersKt.runBlocking$default((CoroutineContext) null, new AIStoryGenTagProcessor$process$2(aIStoryProcessorBean, this, lVar, mVar, null), 1, (Object) null);
            return Unit.INSTANCE;
        }
        Result.Companion companion = Result.Companion;
        mVar.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("network is not active")))));
        return Unit.INSTANCE;
    }

    public final void g() {
        this.f105711d = true;
        Map<String, List<AiFrameResultBean>> map = f105707f;
        synchronized (map) {
            ((LinkedHashMap) map).clear();
            Unit unit = Unit.INSTANCE;
        }
        com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d dVar = this.f105710c;
        UpOSTask upOSTask = dVar.f107343b;
        if (upOSTask != null) {
            upOSTask.clearUploadCallback();
            dVar.f107343b.pause();
            dVar.f107343b.delete();
            dVar.f107343b = null;
        }
        BiliTemplateEngineManager biliTemplateEngineManager = this.f105709b;
        if (biliTemplateEngineManager != null) {
            biliTemplateEngineManager.k();
        }
        this.f105709b = null;
        BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new AIStoryGenTagProcessor$release$1(null), 2, (Object) null);
    }
}
