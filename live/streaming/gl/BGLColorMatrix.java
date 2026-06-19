package com.bilibili.live.streaming.gl;

import kotlin.NotImplementedError;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLColorMatrix.class */
public final class BGLColorMatrix {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final float[] full_601 = {1.0f, 0.0f, 1.402f, -0.701f, 1.0f, -0.344136f, -0.714136f, 0.529136f, 1.0f, 1.772f, 0.0f, -0.886f, 0.0f, 0.0f, 0.0f, 1.0f};

    @NotNull
    private static final float[] full_709 = {1.0f, 0.0f, 1.5748f, -0.7874f, 1.0f, -0.187324f, -0.468124f, 0.327724f, 1.0f, 1.8556f, 0.0f, -0.9278f, 0.0f, 0.0f, 0.0f, 1.0f};

    @NotNull
    private static final float[] full_2020 = {1.0f, 0.0f, 1.4746f, -0.7373f, 1.0f, -0.164553f, -0.571353f, 0.367953f, 1.0f, 1.8814f, 0.0f, -0.9407f, 0.0f, 0.0f, 0.0f, 1.0f};

    @NotNull
    private static final float[] partial_601 = {1.164384f, 0.0f, 1.596027f, -0.871073f, 1.164384f, -0.391762f, -0.812968f, 0.529306f, 1.164384f, 2.017232f, 0.0f, -1.081675f, 0.0f, 0.0f, 0.0f, 1.0f};

    @NotNull
    private static final float[] partial_709 = {1.164384f, 0.0f, 1.792741f, -0.96943f, 1.164384f, -0.213249f, -0.532909f, 0.30002f, 1.164384f, 2.112402f, 0.0f, -1.12926f, 0.0f, 0.0f, 0.0f, 1.0f};

    @NotNull
    private static final float[] partial_2020 = {1.164384f, 0.0f, 1.678674f, -0.912396f, 1.164384f, -0.187326f, -0.650424f, 0.345816f, 1.164384f, 2.141772f, 0.0f, -1.143946f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLColorMatrix$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getFull_2020$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getFull_601$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getFull_709$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getPartial_2020$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getPartial_601$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getPartial_709$annotations() {
        }

        @NotNull
        public final float[] getFull_2020() {
            return BGLColorMatrix.full_2020;
        }

        @NotNull
        public final float[] getFull_601() {
            return BGLColorMatrix.full_601;
        }

        @NotNull
        public final float[] getFull_709() {
            return BGLColorMatrix.full_709;
        }

        @NotNull
        public final float[] getPartial_2020() {
            return BGLColorMatrix.partial_2020;
        }

        @NotNull
        public final float[] getPartial_601() {
            return BGLColorMatrix.partial_601;
        }

        @NotNull
        public final float[] getPartial_709() {
            return BGLColorMatrix.partial_709;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NotImplementedError */
        @JvmStatic
        @Nullable
        public final float[] getYuv2RgbMatrix(int i7, int i8) throws NotImplementedError {
            if (i7 != 601) {
                if (i7 != 709) {
                    if (i7 == 2020) {
                        if (i8 == 0) {
                            return getFull_2020();
                        }
                        if (i8 == 1) {
                            return getPartial_2020();
                        }
                    }
                } else {
                    if (i8 == 0) {
                        return getFull_709();
                    }
                    if (i8 == 1) {
                        return getPartial_709();
                    }
                }
            } else {
                if (i8 == 0) {
                    return getFull_601();
                }
                if (i8 == 1) {
                    return getPartial_601();
                }
            }
            throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
        }
    }

    @NotNull
    public static final float[] getFull_2020() {
        return Companion.getFull_2020();
    }

    @NotNull
    public static final float[] getFull_601() {
        return Companion.getFull_601();
    }

    @NotNull
    public static final float[] getFull_709() {
        return Companion.getFull_709();
    }

    @NotNull
    public static final float[] getPartial_2020() {
        return Companion.getPartial_2020();
    }

    @NotNull
    public static final float[] getPartial_601() {
        return Companion.getPartial_601();
    }

    @NotNull
    public static final float[] getPartial_709() {
        return Companion.getPartial_709();
    }

    @JvmStatic
    @Nullable
    public static final float[] getYuv2RgbMatrix(int i7, int i8) {
        return Companion.getYuv2RgbMatrix(i7, i8);
    }
}
