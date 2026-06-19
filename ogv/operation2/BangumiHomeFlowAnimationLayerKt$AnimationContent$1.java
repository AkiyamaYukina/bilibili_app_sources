package com.bilibili.ogv.operation2;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.opensource.svgaplayer.SVGAVideoEntity;
import kotlin.Unit;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowAnimationLayerKt$AnimationContent$1.class */
public final class BangumiHomeFlowAnimationLayerKt$AnimationContent$1 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableState f70794a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompletableDeferred<Unit> f70795b = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SVGAVideoEntity f70796c;

    public BangumiHomeFlowAnimationLayerKt$AnimationContent$1(SVGAVideoEntity sVGAVideoEntity) {
        this.f70796c = sVGAVideoEntity;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.bilibili.ogv.operation2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ogv.operation2.BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.ogv.operation2.BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1 r0 = (com.bilibili.ogv.operation2.BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.ogv.operation2.BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1 r0 = new com.bilibili.ogv.operation2.BangumiHomeFlowAnimationLayerKt$AnimationContent$1$run$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r5
            androidx.compose.runtime.MutableState r0 = r0.f70794a
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L63
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L59
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L55
            goto L8e
        L55:
            r6 = move-exception
            goto L9b
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L63:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L55
            r0.setValue(r1)     // Catch: java.lang.Throwable -> L55
            r0 = r5
            kotlinx.coroutines.CompletableDeferred<kotlin.Unit> r0 = r0.f70795b     // Catch: java.lang.Throwable -> L55
            r10 = r0
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L55
            r0 = r10
            r1 = r6
            java.lang.Object r0 = r0.await(r1)     // Catch: java.lang.Throwable -> L55
            r6 = r0
            r0 = r6
            r1 = r9
            if (r0 != r1) goto L8e
            r0 = r9
            return r0
        L8e:
            r0 = r8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9b:
            r0 = r8
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.BangumiHomeFlowAnimationLayerKt$AnimationContent$1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    @Override // com.bilibili.ogv.operation2.a
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.runtime.Composer r8, androidx.compose.ui.Modifier r9) {
        /*
            r7 = this;
            r0 = r8
            r1 = -1628644020(0xffffffff9eecdd4c, float:-2.5078998E-20)
            r0.startReplaceGroup(r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L17
            r0 = -1628644020(0xffffffff9eecdd4c, float:-2.5078998E-20)
            r1 = 0
            r2 = -1
            java.lang.String r3 = "com.bilibili.ogv.operation2.AnimationContent.<no name provided>.UI (BangumiHomeFlowAnimationLayer.kt:163)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
        L17:
            r0 = r7
            com.opensource.svgaplayer.SVGAVideoEntity r0 = r0.f70796c
            r14 = r0
            r0 = r8
            r1 = r14
            boolean r0 = r0.changedInstance(r1)
            r10 = r0
            r0 = r8
            r1 = r7
            boolean r0 = r0.changedInstance(r1)
            r11 = r0
            r0 = r8
            java.lang.Object r0 = r0.rememberedValue()
            r13 = r0
            r0 = r10
            r1 = r11
            r0 = r0 | r1
            if (r0 != 0) goto L4d
            r0 = r13
            r12 = r0
            r0 = r13
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L61
        L4d:
            com.bilibili.ogv.operation2.k r0 = new com.bilibili.ogv.operation2.k
            r1 = r0
            r2 = r14
            r3 = r7
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r8
            r1 = r12
            r0.updateRememberedValue(r1)
        L61:
            r0 = r12
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r14 = r0
            r0 = r8
            r1 = r7
            boolean r0 = r0.changedInstance(r1)
            r10 = r0
            r0 = r8
            java.lang.Object r0 = r0.rememberedValue()
            r13 = r0
            r0 = r10
            if (r0 != 0) goto L8b
            r0 = r13
            r12 = r0
            r0 = r13
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L9e
        L8b:
            Fc1.f r0 = new Fc1.f
            r1 = r0
            r2 = r7
            r3 = 3
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r8
            r1 = r12
            r0.updateRememberedValue(r1)
        L9e:
            r0 = r14
            r1 = r9
            r2 = r12
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r3 = r8
            r4 = 0
            r5 = 0
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(r0, r1, r2, r3, r4, r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto Lb5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lb5:
            r0 = r8
            r0.endReplaceGroup()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.BangumiHomeFlowAnimationLayerKt$AnimationContent$1.b(androidx.compose.runtime.Composer, androidx.compose.ui.Modifier):void");
    }
}
