package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.montage.avinfo.MontageExpressionParam;
import com.bilibili.studio.kaleidoscope.sdk.Color;
import com.bilibili.studio.kaleidoscope.sdk.ExpressionParam;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonExpressionParamImpl.class */
public final class MonExpressionParamImpl implements ExpressionParam {
    private MontageExpressionParam mMontageExpressionParam;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonExpressionParamImpl$MonFloatParamImpl.class */
    public static final class MonFloatParamImpl implements ExpressionParam.a {
        private MontageExpressionParam.FloatParam mFloatParam;

        private MonFloatParamImpl(@NonNull MontageExpressionParam.FloatParam floatParam) {
            this.mFloatParam = floatParam;
        }

        @NonNull
        public static ExpressionParam.a box(@NonNull MontageExpressionParam.FloatParam floatParam) {
            return new MonFloatParamImpl(floatParam);
        }

        @NonNull
        public static MontageExpressionParam.FloatParam unbox(@NonNull ExpressionParam.a aVar) {
            return (MontageExpressionParam.FloatParam) aVar.getFloatParam();
        }

        public float getDefVal() {
            return this.mFloatParam.getDefVal();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam.a
        public Object getFloatParam() {
            return this.mFloatParam;
        }

        public float getMaxVal() {
            return this.mFloatParam.getMaxVal();
        }

        public float getMinVal() {
            return this.mFloatParam.getMinVal();
        }

        public void setFloatParam(Object obj) {
            this.mFloatParam = (MontageExpressionParam.FloatParam) obj;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonExpressionParamImpl$MonIntParamImpl.class */
    public static final class MonIntParamImpl implements ExpressionParam.b {
        private MontageExpressionParam.IntParam mIntParam;

        private MonIntParamImpl(@NonNull MontageExpressionParam.IntParam intParam) {
            this.mIntParam = intParam;
        }

        @NonNull
        public static ExpressionParam.b box(@NonNull MontageExpressionParam.IntParam intParam) {
            return new MonIntParamImpl(intParam);
        }

        @NonNull
        public static MontageExpressionParam.IntParam unbox(@NonNull ExpressionParam.b bVar) {
            return (MontageExpressionParam.IntParam) bVar.getIntParam();
        }

        public int getDefVal() {
            return this.mIntParam.getDefVal();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam.b
        public Object getIntParam() {
            return this.mIntParam;
        }

        public int getMaxVal() {
            return this.mIntParam.getMaxVal();
        }

        public int getMinVal() {
            return this.mIntParam.getMinVal();
        }

        public void setIntParam(Object obj) {
            this.mIntParam = (MontageExpressionParam.IntParam) obj;
        }
    }

    private MonExpressionParamImpl(@NonNull MontageExpressionParam montageExpressionParam) {
        this.mMontageExpressionParam = montageExpressionParam;
    }

    @NonNull
    public static ExpressionParam box(@NonNull MontageExpressionParam montageExpressionParam) {
        return new MonExpressionParamImpl(montageExpressionParam);
    }

    @NonNull
    public static MontageExpressionParam unbox(@NonNull ExpressionParam expressionParam) {
        return (MontageExpressionParam) expressionParam.getExpressionParam();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam
    public Color getColor() {
        MontageColor color = this.mMontageExpressionParam.getColor();
        return color != null ? MonColorImpl.box(color) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam
    public Object getExpressionParam() {
        return this.mMontageExpressionParam;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam
    public ExpressionParam.a getFloatParam() {
        MontageExpressionParam.FloatParam floatParam = this.mMontageExpressionParam.getFloatParam();
        return floatParam != null ? MonFloatParamImpl.box(floatParam) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam
    public ExpressionParam.b getIntParam() {
        MontageExpressionParam.IntParam intParam = this.mMontageExpressionParam.getIntParam();
        return intParam != null ? MonIntParamImpl.box(intParam) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam
    public String getName() {
        return this.mMontageExpressionParam.getName();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam
    public int getType() {
        return this.mMontageExpressionParam.getType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ExpressionParam
    public void setExpressionParam(Object obj) {
        this.mMontageExpressionParam = (MontageExpressionParam) obj;
    }
}
