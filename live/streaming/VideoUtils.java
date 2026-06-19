package com.bilibili.live.streaming;

import android.opengl.GLES20;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.BGLTransState;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.sources.SceneSource;
import com.tencent.bugly.BuglyStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/VideoUtils.class */
public final class VideoUtils {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/VideoUtils$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit getRenderCallback$lambda$4(long j7, IVideoSource iVideoSource, SceneSource.Item item) throws Throwable {
            if (((int) (j7 / ((long) BuglyStrategy.a.MAX_USERDATA_VALUE_LENGTH))) % 2 == 1) {
                SceneSource sceneSource = (SceneSource) iVideoSource;
                if (item != null && sceneSource != null) {
                    sceneSource.RenderItemBorder(item);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void renderSource$default(Companion companion, AVBaseContext aVBaseContext, int i7, int i8, int i9, int i10, IVideoSource iVideoSource, int i11, int i12, Function0 function0, int i13, Object obj) {
            if ((i13 & 256) != 0) {
                function0 = null;
            }
            companion.renderSource(aVBaseContext, i7, i8, i9, i10, iVideoSource, i11, i12, function0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void renderSource$default(Companion companion, AVBaseContext aVBaseContext, int i7, int i8, int i9, int i10, IVideoSource iVideoSource, int i11, Function0 function0, int i12, Object obj) {
            if ((i12 & 128) != 0) {
                function0 = null;
            }
            companion.renderSource(aVBaseContext, i7, i8, i9, i10, iVideoSource, i11, function0);
        }

        @NotNull
        public final Function0<Unit> getRenderCallback(@Nullable IVideoSource iVideoSource, long j7, @Nullable SceneSource.Item item) {
            return new Mp0.b(j7, iVideoSource, item);
        }

        public final void renderSource(@NotNull AVBaseContext aVBaseContext, int i7, int i8, int i9, int i10, @Nullable IVideoSource iVideoSource, int i11, int i12, @Nullable Function0<Unit> function0) {
            BGLTransState transState;
            float f7 = i9 * 1.0f;
            float f8 = i10 * 1.0f;
            BGLMatrix bGLMatrixVTransToFitRect = BGLUtil.vTransToFitRect(f7, f8, Float.valueOf(((iVideoSource != null ? iVideoSource.getWidth() : 1) * 1.0f) / (iVideoSource != null ? iVideoSource.getHeight() : 1)), i7 * 1.0f, i8 * 1.0f, f7, f8, i12);
            float[] fArrData = bGLMatrixVTransToFitRect.data();
            for (int i13 = 0; i13 < 4; i13++) {
                BGLMatrix.Companion companion = BGLMatrix.Companion;
                fArrData[i13] = fArrData[i13] * 1.0f;
                int i14 = 4 + i13;
                fArrData[i14] = fArrData[i14] * (-1.0f);
            }
            GLES20.glViewport(i7, i8, i9, i10);
            try {
                BGLUtil.clear(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                BEGLContext eglContext = aVBaseContext.getEglContext();
                if (eglContext != null && (transState = eglContext.getTransState()) != null) {
                    transState.pushVPreTrans(bGLMatrixVTransToFitRect);
                    try {
                        if (iVideoSource != null) {
                            try {
                                iVideoSource.render(i11);
                            } catch (BGLException e7) {
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        if (function0 != null) {
                            function0.invoke();
                            Unit unit2 = Unit.INSTANCE;
                        }
                    } finally {
                        transState.popVPreTrans();
                    }
                }
                bGLMatrixVTransToFitRect.release();
            } catch (BGLException e8) {
            }
        }

        public final void renderSource(@NotNull AVBaseContext aVBaseContext, int i7, int i8, int i9, int i10, @Nullable IVideoSource iVideoSource, int i11, @Nullable Function0<Unit> function0) {
            renderSource(aVBaseContext, i7, i8, i9, i10, iVideoSource, -1, i11, function0);
        }

        public final void tick(@Nullable IVideoSource iVideoSource, long j7) {
            if (iVideoSource != null) {
                iVideoSource.tick(j7 / ((long) 1000));
            }
        }
    }
}
