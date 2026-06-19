package com.bilibili.live.streaming.gl;

import android.opengl.GLES20;
import androidx.compose.animation.core.C3346u;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.utils.BObjectPool;
import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import z.L;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLMatrix.class */
public class BGLMatrix {

    @NotNull
    private static String TAG;

    @NotNull
    private static float[] mIdentMatrix;

    @NotNull
    private float[] mData;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final BGLMatrixPool mPool = new BGLMatrixPool();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLMatrix$BGLMatrixPool.class */
    public static final class BGLMatrixPool extends BObjectPool<BGLMatrix> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bilibili.live.streaming.utils.BObjectPool
        @NotNull
        public BGLMatrix construct() {
            return new BGLMatrix(null);
        }

        @Override // com.bilibili.live.streaming.utils.BObjectPool
        public void onReuse(@NotNull BGLMatrix bGLMatrix) {
            bGLMatrix.setIdent();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/BGLMatrix$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        private final void applyToInternal(int i7, float[] fArr) throws BGLException {
            GLES20.glUniformMatrix4fv(i7, 1, false, fArr, 0);
            BGLUtil.logGLErrAndThrow(BGLMatrix.TAG, BGLException.ID.SHADER_ERROR, "fail to set uniform parameter.");
        }

        @JvmStatic
        private static /* synthetic */ void getMIdentMatrix$annotations() {
        }

        @JvmStatic
        private static /* synthetic */ void getTAG$annotations() {
        }

        private final void setIdent(float[] fArr) {
            for (int i7 = 0; i7 < 4; i7++) {
                for (int i8 = 0; i8 < 4; i8++) {
                    if (i7 == i8) {
                        Companion companion = BGLMatrix.Companion;
                        fArr[(i8 * 4) + i7] = 1.0f;
                    } else {
                        Companion companion2 = BGLMatrix.Companion;
                        fArr[(i8 * 4) + i7] = 0.0f;
                    }
                }
            }
        }

        public final void applyIdentTo(int i7) throws BGLException {
            GLES20.glUniformMatrix4fv(i7, 1, false, BGLMatrix.mIdentMatrix, 0);
            BGLUtil.logGLErrAndThrow(BGLMatrix.TAG, BGLException.ID.SHADER_ERROR, "fail to set uniform parameter.");
        }

        @JvmStatic
        @NotNull
        public final BGLMatrix create() {
            return BGLMatrix.mPool.getObject();
        }

        public final float get(@NotNull float[] fArr, int i7, int i8) {
            return fArr[(i8 * 4) + i7];
        }

        @JvmStatic
        @NotNull
        public final float[] getIdent() {
            return BGLMatrix.mIdentMatrix;
        }

        public final void multiply(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull float[] fArr3) {
            for (int i7 = 0; i7 < 4; i7++) {
                for (int i8 = 0; i8 < 4; i8++) {
                    float f7 = 0.0f;
                    for (int i9 = 0; i9 < 4; i9++) {
                        f7 += fArr2[(i9 * 4) + i7] * fArr3[(i8 * 4) + i9];
                    }
                    fArr[(i8 * 4) + i7] = f7;
                }
            }
        }

        public final void set(@NotNull float[] fArr, int i7, int i8, float f7) {
            fArr[(i8 * 4) + i7] = f7;
        }
    }

    static {
        float[] fArr = new float[16];
        mIdentMatrix = fArr;
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                if (i7 == i8) {
                    fArr[(i8 * 4) + i7] = 1.0f;
                } else {
                    fArr[(i8 * 4) + i7] = 0.0f;
                }
            }
        }
        TAG = "LIVEGL-BGLMatrix";
    }

    private BGLMatrix() {
        this.mData = (float[]) mIdentMatrix.clone();
    }

    public /* synthetic */ BGLMatrix(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    private static final void applyToInternal(int i7, float[] fArr) throws BGLException {
        super/*com.bilibili.live.streaming.gl.BGLMatrix.Companion*/.applyToInternal(i7, fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float computeCofactors(int i7, int i8) {
        float[] fArr = new float[3];
        for (int i9 = 0; i9 < 3; i9++) {
            fArr[i9] = new float[3];
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= 4) {
                Object[] objArr = fArr[0];
                byte b7 = objArr[0];
                Object[] objArr2 = fArr[1];
                byte b8 = objArr2[1];
                Object[] objArr3 = fArr[2];
                byte b9 = objArr3[2];
                byte b10 = objArr[1];
                byte b11 = objArr2[2];
                byte b12 = objArr3[0];
                byte b13 = objArr[2];
                byte b14 = objArr2[0];
                byte b15 = objArr3[1];
                return (((b13 * b14) * b15) + (((b10 * b11) * b12) + ((b7 * b8) * b9))) - (((b7 * b11) * b15) + C3346u.a(b10, b14, b9, (b13 * b8) * b12));
            }
            int i13 = i12;
            if (i10 != i7) {
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = i15;
                    if (i14 >= 4) {
                        break;
                    }
                    int i17 = i16;
                    if (i14 != i8) {
                        fArr[i12][i16] = this.mData[(i14 * 4) + i10];
                        i17 = i16 + 1;
                    }
                    i14++;
                    i15 = i17;
                }
                i13 = i12 + 1;
            }
            i10++;
            i11 = i13;
        }
    }

    private final BGLMatrix computeCofactorsMatrix() {
        BGLMatrix bGLMatrixCreate = Companion.create();
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                bGLMatrixCreate.mData[(i8 * 4) + i7] = computeCofactors(i7, i8);
            }
        }
        return bGLMatrixCreate;
    }

    private final float computeDeterminant() {
        float[] fArr = new float[25];
        for (int i7 = 1; i7 < 5; i7++) {
            for (int i8 = 1; i8 < 5; i8++) {
                fArr[(i8 * 4) + i7] = this.mData[L.a(i8, 1, 4, i7 - 1)];
            }
        }
        float f7 = fArr[5];
        float f8 = fArr[10];
        float f9 = fArr[15];
        float f10 = fArr[20];
        float f11 = fArr[19];
        float f12 = fArr[16];
        float f13 = fArr[14];
        float f14 = fArr[11];
        float f15 = fArr[12];
        float f16 = fArr[18];
        float f17 = fArr[9];
        float f18 = fArr[6];
        float f19 = fArr[7];
        float fA = C3346u.a(f17 * f13, f19, f10, (f17 * f18 * f11 * f12) + ((((((f7 * f16) * f14) * f12) + ((((f7 * f13) * f11) * f15) + (((((f7 * f8) * f9) * f10) - (((f7 * f8) * f11) * f12)) - (((f7 * f13) * f14) * f10)))) - (((f7 * f16) * f9) * f15)) - (((f17 * f18) * f9) * f10)));
        float f20 = fArr[8];
        float f21 = fArr[13];
        float f22 = fArr[17];
        return (f22 * f13 * f14 * f20) + ((((((f22 * f8) * f19) * f12) + ((((f18 * f22) * f9) * f15) + ((((((f21 * f16) * f19) * f15) + ((((f21 * f8) * f11) * f20) + ((((((f21 * f18) * f14) * f10) + ((((f17 * f16) * f9) * f20) + ((fA - (((f17 * f13) * f11) * f20)) - (((f17 * f16) * f19) * f12)))) - (((f21 * f18) * f11) * f15)) - (((f21 * f8) * f19) * f10)))) - (((f21 * f16) * f14) * f20)) - (((f22 * f18) * f14) * f12)))) - (((f8 * f22) * f9) * f20)) - (((f22 * f13) * f19) * f15));
    }

    @JvmStatic
    @NotNull
    public static final BGLMatrix create() {
        return Companion.create();
    }

    @JvmStatic
    @NotNull
    public static final float[] getIdent() {
        return Companion.getIdent();
    }

    private final float get_(int i7, int i8) {
        return this.mData[(i8 * 4) + i7];
    }

    private final void set_(int i7, int i8, float f7) {
        this.mData[(i8 * 4) + i7] = f7;
    }

    public final void applyTo(int i7) throws BGLException {
        GLES20.glUniformMatrix4fv(i7, 1, false, data(), 0);
        BGLUtil.logGLErrAndThrow(TAG, BGLException.ID.SHADER_ERROR, "fail to set uniform parameter.");
    }

    @NotNull
    public final BGLMatrix clone() {
        BGLMatrix bGLMatrixCreate = Companion.create();
        float[] fArr = this.mData;
        System.arraycopy(fArr, 0, bGLMatrixCreate.mData, 0, fArr.length);
        return bGLMatrixCreate;
    }

    @NotNull
    public final BGLMatrix computeInverse() {
        BGLMatrix bGLMatrixComputeCofactorsMatrix = computeCofactorsMatrix();
        float fComputeDeterminant = computeDeterminant();
        float[] fArrData = bGLMatrixComputeCofactorsMatrix.data();
        BGLMatrix bGLMatrixClone = bGLMatrixComputeCofactorsMatrix.clone();
        float[] fArrData2 = bGLMatrixClone.data();
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                fArrData[(i8 * 4) + i7] = fArrData2[(i7 * 4) + i8];
            }
        }
        bGLMatrixClone.release();
        for (int i9 = 0; i9 < 16; i9++) {
            float[] fArr = bGLMatrixComputeCofactorsMatrix.mData;
            fArr[i9] = fArr[i9] / fComputeDeterminant;
        }
        return bGLMatrixComputeCofactorsMatrix;
    }

    @NotNull
    public final float[] data() {
        return this.mData;
    }

    @NotNull
    public final BGLMatrix doRotate90() {
        BGLMatrix bGLMatrixCreate = Companion.create();
        float[] fArrData = bGLMatrixCreate.data();
        fArrData[0] = 0.0f;
        fArrData[4] = 1.0f;
        fArrData[1] = -1.0f;
        fArrData[5] = 0.0f;
        BGLMatrix bGLMatrixClone = clone();
        float[] fArrData2 = data();
        float[] fArrData3 = bGLMatrixClone.data();
        float[] fArrData4 = bGLMatrixCreate.data();
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                float f7 = 0.0f;
                for (int i9 = 0; i9 < 4; i9++) {
                    f7 += fArrData3[(i9 * 4) + i7] * fArrData4[(i8 * 4) + i9];
                }
                fArrData2[(i8 * 4) + i7] = f7;
            }
        }
        bGLMatrixClone.release();
        bGLMatrixCreate.release();
        return this;
    }

    @NotNull
    public final BGLMatrix doScale(float f7, float f8) {
        float[] fArrData = data();
        for (int i7 = 0; i7 < 4; i7++) {
            fArrData[i7] = fArrData[i7] * f7;
            int i8 = 4 + i7;
            fArrData[i8] = fArrData[i8] * f8;
        }
        return this;
    }

    @NotNull
    public final BGLMatrix doTranslate(float f7, float f8) {
        float[] fArrData = data();
        for (int i7 = 0; i7 < 4; i7++) {
            float f9 = fArrData[12 + i7];
            if (f9 != 0.0f) {
                fArrData[i7] = (f7 * f9) + fArrData[i7];
                int i8 = 4 + i7;
                fArrData[i8] = (f9 * f8) + fArrData[i8];
            }
        }
        return this;
    }

    @NotNull
    public final BGLMatrix doTranspose() {
        float[] fArrData = data();
        BGLMatrix bGLMatrixClone = clone();
        float[] fArrData2 = bGLMatrixClone.data();
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                fArrData[(i8 * 4) + i7] = fArrData2[(i7 * 4) + i8];
            }
        }
        bGLMatrixClone.release();
        return this;
    }

    public final float get(int i7, int i8) {
        return this.mData[(i8 * 4) + i7];
    }

    @NotNull
    public final BGLMatrix multiply(@NotNull BGLMatrix bGLMatrix) {
        BGLMatrix bGLMatrixClone = clone();
        float[] fArrData = data();
        float[] fArrData2 = bGLMatrixClone.data();
        float[] fArrData3 = bGLMatrix.data();
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                float f7 = 0.0f;
                for (int i9 = 0; i9 < 4; i9++) {
                    f7 += fArrData2[(i9 * 4) + i7] * fArrData3[(i8 * 4) + i9];
                }
                fArrData[(i8 * 4) + i7] = f7;
            }
        }
        bGLMatrixClone.release();
        return this;
    }

    public final void release() {
        mPool.releaseObject(this);
    }

    public final void set(int i7, int i8, float f7) {
        this.mData[(i8 * 4) + i7] = f7;
    }

    @NotNull
    public final BGLMatrix setIdent() {
        float[] fArr = this.mData;
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                if (i7 == i8) {
                    fArr[(i8 * 4) + i7] = 1.0f;
                } else {
                    fArr[(i8 * 4) + i7] = 0.0f;
                }
            }
        }
        return this;
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("[%.2g;%.2g;%.2g;%.2g][%.2g;%.2g;%.2g;%.2g][%.2g;%.2g;%.2g;%.2g][%.2g;%.2g;%.2g;%.2g]", Arrays.copyOf(new Object[]{Float.valueOf(this.mData[0]), Float.valueOf(this.mData[4]), Float.valueOf(this.mData[8]), Float.valueOf(this.mData[12]), Float.valueOf(this.mData[1]), Float.valueOf(this.mData[5]), Float.valueOf(this.mData[9]), Float.valueOf(this.mData[13]), Float.valueOf(this.mData[2]), Float.valueOf(this.mData[6]), Float.valueOf(this.mData[10]), Float.valueOf(this.mData[14]), Float.valueOf(this.mData[3]), Float.valueOf(this.mData[7]), Float.valueOf(this.mData[11]), Float.valueOf(this.mData[15])}, 16));
    }
}
