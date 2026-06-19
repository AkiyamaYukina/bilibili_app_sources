package com.bilibili.ship.theseus.united.page.floatlayer.video;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ugc.weblayer.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/video/TransparentVideoCoverFloatLayerComponent.class */
@StabilityInferred(parameters = 1)
public final class TransparentVideoCoverFloatLayerComponent implements UIComponent<UIComponent.b<View>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final o f99857a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.video.TransparentVideoCoverFloatLayerComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/video/TransparentVideoCoverFloatLayerComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final TransparentVideoCoverFloatLayerComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransparentVideoCoverFloatLayerComponent transparentVideoCoverFloatLayerComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = transparentVideoCoverFloatLayerComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    public TransparentVideoCoverFloatLayerComponent(@NotNull o oVar) {
        this.f99857a = oVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.app.gemini.ui.UIComponent$b] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.UIComponent.b<android.view.View> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.floatlayer.video.TransparentVideoCoverFloatLayerComponent.AnonymousClass1
            if (r0 == 0) goto L26
            r0 = r8
            com.bilibili.ship.theseus.united.page.floatlayer.video.TransparentVideoCoverFloatLayerComponent$bindToView$1 r0 = (com.bilibili.ship.theseus.united.page.floatlayer.video.TransparentVideoCoverFloatLayerComponent.AnonymousClass1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L26
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            goto L31
        L26:
            com.bilibili.ship.theseus.united.page.floatlayer.video.TransparentVideoCoverFloatLayerComponent$bindToView$1 r0 = new com.bilibili.ship.theseus.united.page.floatlayer.video.TransparentVideoCoverFloatLayerComponent$bindToView$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r10 = r0
        L31:
            r0 = r10
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6d
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r10
            java.lang.Object r0 = r0.L$0
            com.bilibili.app.gemini.ui.UIComponent$b r0 = (com.bilibili.app.gemini.ui.UIComponent.b) r0
            r7 = r0
            r0 = r7
            r8 = r0
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L69
            goto La1
        L69:
            r7 = move-exception
            goto Lb4
        L6d:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            android.view.View r0 = r0.a
            com.bilibili.ship.theseus.united.page.floatlayer.video.a r1 = new com.bilibili.ship.theseus.united.page.floatlayer.video.a
            r2 = r1
            r3 = r6
            r4 = 0
            r2.<init>(r3, r4)
            r0.setOnClickListener(r1)
            r0 = r7
            r8 = r0
            r0 = r10
            r1 = r7
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L69
            r0 = r7
            r8 = r0
            r0 = r10
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L69
            r0 = r7
            r8 = r0
            r0 = r10
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L69
            r1 = r11
            if (r0 != r1) goto La1
            r0 = r11
            return r0
        La1:
            r0 = r7
            r8 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L69
            r10 = r0
            r0 = r7
            r8 = r0
            r0 = r10
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            r0 = r7
            r8 = r0
            r0 = r10
            throw r0     // Catch: java.lang.Throwable -> L69
        Lb4:
            r0 = r8
            android.view.View r0 = r0.a
            r1 = 0
            r0.setOnClickListener(r1)
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.video.TransparentVideoCoverFloatLayerComponent.bindToView(com.bilibili.app.gemini.ui.UIComponent$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new UIComponent.b(view);
    }
}
