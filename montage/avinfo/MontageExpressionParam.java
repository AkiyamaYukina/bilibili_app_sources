package com.bilibili.montage.avinfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageExpressionParam.class */
public class MontageExpressionParam {
    public static final int TYPE_BOOLEAN = 2;
    public static final int TYPE_COLOR = 3;
    public static final int TYPE_FLOAT = 1;
    public static final int TYPE_INT = 0;
    private boolean mBoolean;
    private MontageColor mColor;
    private FloatParam mFloatParam;
    private IntParam mIntParam;
    private String name;
    private int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageExpressionParam$FloatParam.class */
    public static class FloatParam {
        private float defVal;
        private float maxVal;
        private float minVal;

        public float getDefVal() {
            return this.defVal;
        }

        public float getMaxVal() {
            return this.maxVal;
        }

        public float getMinVal() {
            return this.minVal;
        }

        public void setDefVal(float f7) {
            this.defVal = f7;
        }

        public void setMaxVal(float f7) {
            this.maxVal = f7;
        }

        public void setMinVal(float f7) {
            this.minVal = f7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageExpressionParam$IntParam.class */
    public static class IntParam {
        private int defVal;
        private int maxVal;
        private int minVal;

        public int getDefVal() {
            return this.defVal;
        }

        public int getMaxVal() {
            return this.maxVal;
        }

        public int getMinVal() {
            return this.minVal;
        }

        public void setDefVal(int i7) {
            this.defVal = i7;
        }

        public void setMaxVal(int i7) {
            this.maxVal = i7;
        }

        public void setMinVal(int i7) {
            this.minVal = i7;
        }
    }

    public MontageColor getColor() {
        return this.mColor;
    }

    public FloatParam getFloatParam() {
        return this.mFloatParam;
    }

    public IntParam getIntParam() {
        return this.mIntParam;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public boolean isBoolean() {
        return this.mBoolean;
    }

    public void setBoolean(boolean z6) {
        this.mBoolean = z6;
    }

    public void setColor(MontageColor montageColor) {
        this.mColor = montageColor;
    }

    public void setFloatParam(FloatParam floatParam) {
        this.mFloatParam = floatParam;
    }

    public void setIntParam(IntParam intParam) {
        this.mIntParam = intParam;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i7) {
        this.type = i7;
    }
}
