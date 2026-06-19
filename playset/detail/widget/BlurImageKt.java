package com.bilibili.playset.detail.widget;

import android.graphics.Bitmap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/BlurImageKt.class */
public final class BlurImageKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/BlurImageKt$a.class */
    public static final class a implements DisposableEffectResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableState f84582a;

        public a(MutableState mutableState) {
            this.f84582a = mutableState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.compose.runtime.DisposableEffectResult
        public final void dispose() {
            try {
                Bitmap bitmap = (Bitmap) this.f84582a.getValue();
                if (bitmap != null) {
                    if (bitmap.isRecycled()) {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            } catch (Exception e7) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x030d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(@org.jetbrains.annotations.NotNull final java.lang.String r14, final float r15, final float r16, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r17, final int r18) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.widget.BlurImageKt.a(java.lang.String, float, float, androidx.compose.runtime.Composer, int):void");
    }
}
