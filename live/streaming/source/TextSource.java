package com.bilibili.live.streaming.source;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/TextSource.class */
public final class TextSource extends FilterBase {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_DEFAULT = 1;
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 2;

    @NotNull
    public static final String CFG_COLOR = "color";

    @NotNull
    public static final String CFG_CONTENT = "content";

    @NotNull
    public static final String CFG_SCROLL_ORIENTATION = "scroll_orientation";

    @NotNull
    public static final String CFG_SCROLL_SPEED = "scroll_speed";
    public static final double CFG_SCROLL_SPEED_DEFAULT = 60.0d;

    @NotNull
    public static final String CFG_SIZE = "size";

    @NotNull
    public static final String CFG_STROKE_COLOR = "stroke_color";

    @NotNull
    public static final String CFG_STROKE_WIDTH = "stroke_width";

    @NotNull
    public static final String CFG_TEXT_ALIGN = "text_align";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "TextSource";
    public static final int SCROLL_HORIZONTAL = 1;
    public static final int SCROLL_NONE = 0;
    public static final int SCROLL_VERTICAL = 2;

    @NotNull
    public static final String STR_ALIGN_CENTER = "Center";

    @NotNull
    public static final String STR_ALIGN_DEFAULT = "Center";

    @NotNull
    public static final String STR_ALIGN_LEFT = "Left";

    @NotNull
    public static final String STR_ALIGN_RIGHT = "Right";

    @NotNull
    public static final String STR_SCROLL_HORIZONTAL = "Horizontal";

    @NotNull
    public static final String STR_SCROLL_NONE = "None";

    @NotNull
    public static final String STR_SCROLL_VERTICAL = "Vertical";

    @NotNull
    private final Object lock;

    @Nullable
    private final AssetManager mAssertManager;
    private int mCycleMs;
    private int mHeight;
    private float mOffset;
    private int mScrollOrientation;
    private double mScrollSpeed;

    @NotNull
    private String mStrokeColor;
    private int mStrokeWidth;
    private int mTextAlign;

    @NotNull
    private String mTextColor;
    private int mTextSize;

    @Nullable
    private BGLTexture mTextTexture;

    @NotNull
    private String mTextTypeface;

    @NotNull
    private String mTextWord;

    @Nullable
    private BGLMatrix mUVTransMatrix;
    private int mWidth;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/TextSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/TextSource$ComputeResult.class */
    public static final class ComputeResult {

        @Nullable
        private Line[] lines;
        private int topMost = Integer.MAX_VALUE;
        private int leftMost = Integer.MAX_VALUE;
        private int rightMost = Integer.MIN_VALUE;
        private int bottomMost = Integer.MIN_VALUE;
        private int maxWidth = Integer.MIN_VALUE;
        private int maxHeight = Integer.MIN_VALUE;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/TextSource$ComputeResult$Line.class */
        public static final class Line {
            private int baseOffset;
            private int height;

            @Nullable
            private String text;
            private int width;

            public final int getBaseOffset() {
                return this.baseOffset;
            }

            public final int getHeight() {
                return this.height;
            }

            @Nullable
            public final String getText() {
                return this.text;
            }

            public final int getWidth() {
                return this.width;
            }

            public final void setBaseOffset(int i7) {
                this.baseOffset = i7;
            }

            public final void setHeight(int i7) {
                this.height = i7;
            }

            public final void setText(@Nullable String str) {
                this.text = str;
            }

            public final void setWidth(int i7) {
                this.width = i7;
            }
        }

        public final int getBottomMost() {
            return this.bottomMost;
        }

        public final int getLeftMost() {
            return this.leftMost;
        }

        @Nullable
        public final Line[] getLines() {
            return this.lines;
        }

        public final int getMaxHeight() {
            return this.maxHeight;
        }

        public final int getMaxWidth() {
            return this.maxWidth;
        }

        public final int getRightMost() {
            return this.rightMost;
        }

        public final int getTopMost() {
            return this.topMost;
        }

        public final void setBottomMost(int i7) {
            this.bottomMost = i7;
        }

        public final void setLeftMost(int i7) {
            this.leftMost = i7;
        }

        public final void setLines(@Nullable Line[] lineArr) {
            this.lines = lineArr;
        }

        public final void setMaxHeight(int i7) {
            this.maxHeight = i7;
        }

        public final void setMaxWidth(int i7) {
            this.maxWidth = i7;
        }

        public final void setRightMost(int i7) {
            this.rightMost = i7;
        }

        public final void setTopMost(int i7) {
            this.topMost = i7;
        }
    }

    public TextSource() {
        this(null, 1, null);
    }

    public TextSource(@Nullable AssetManager assetManager) {
        this.mTextColor = "";
        this.mTextTypeface = "";
        this.mStrokeColor = "";
        this.mTextAlign = 1;
        this.mWidth = 1;
        this.mHeight = 1;
        this.mScrollSpeed = 60.0d;
        this.mCycleMs = 1;
        this.mAssertManager = assetManager;
        this.lock = new Object();
        this.mTextWord = "";
    }

    public /* synthetic */ TextSource(AssetManager assetManager, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : assetManager);
    }

    private final void attachTexture() throws BGLException {
        Bitmap bitmapDrawText = drawText(this.mTextWord);
        if (bitmapDrawText == null) {
            return;
        }
        this.mWidth = bitmapDrawText.getWidth();
        this.mHeight = bitmapDrawText.getHeight();
        BGLTexture bGLTexture = this.mTextTexture;
        if (bGLTexture != null) {
            bGLTexture.destroy();
        }
        BGLTexture repeatWrap = BGLTexture.createTex2D().setRepeatWrap();
        this.mTextTexture = repeatWrap;
        if (repeatWrap != null) {
            repeatWrap.loadBmp(bitmapDrawText);
        }
        BGLTexture bGLTexture2 = this.mTextTexture;
        if (bGLTexture2 != null) {
            bGLTexture2.setSize(this.mWidth, this.mHeight);
        }
        bitmapDrawText.recycle();
    }

    private final void createSource() {
        BEGLContext eglContext;
        try {
            AVContext aVContext = this.mCtx;
            if (aVContext != null && (eglContext = aVContext.getEglContext()) != null) {
                eglContext.makeCurrent();
            }
            if (this.mUVTransMatrix == null) {
                this.mUVTransMatrix = BGLMatrix.Companion.create();
            }
            attachTexture();
        } catch (BGLException e7) {
            LivePusherLog.e(ID, "createSource exception: ", e7);
            destroy();
        }
    }

    private final Bitmap drawText(String str) {
        Bitmap bitmapCreateBitmap;
        BEGLContext eglContext;
        AVContext aVContext = this.mCtx;
        int textureMaxResolution = (aVContext == null || (eglContext = aVContext.getEglContext()) == null) ? 1024 : eglContext.getTextureMaxResolution();
        TextPaint textPaint = new TextPaint();
        initStroke(textPaint);
        int i7 = this.mTextAlign;
        Layout.Alignment alignment = i7 != 0 ? i7 != 1 ? i7 != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
        int desiredWidth = (int) StaticLayout.getDesiredWidth(str, textPaint);
        int length = str.length();
        int iMin = Math.min(desiredWidth, textureMaxResolution);
        int i8 = 0;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, length, textPaint, iMin).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
        int height = staticLayoutBuild.getHeight();
        int width = staticLayoutBuild.getWidth();
        if (width > 0 && height > 0) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap2);
            while (true) {
                bitmapCreateBitmap = bitmapCreateBitmap2;
                if (i8 >= 2) {
                    break;
                }
                if (i8 == 0) {
                    initStroke(textPaint);
                } else {
                    initText(textPaint);
                }
                staticLayoutBuild.draw(canvas);
                i8++;
            }
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        return bitmapCreateBitmap;
    }

    private final void initStroke(Paint paint) {
        paint.setTextSize(this.mTextSize);
        paint.setColor(Color.parseColor(this.mStrokeColor));
        paint.setStrokeWidth(this.mStrokeWidth);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        AssetManager assetManager = this.mAssertManager;
        if (assetManager != null) {
            paint.setTypeface(Typeface.createFromAsset(assetManager, this.mTextTypeface));
        }
        paint.setFlags(1);
    }

    private final void initText(Paint paint) {
        paint.setColor(Color.parseColor(this.mTextColor));
        paint.setTextSize(this.mTextSize);
        paint.setStrokeWidth(0.0f);
        paint.setStyle(Paint.Style.FILL);
        AssetManager assetManager = this.mAssertManager;
        if (assetManager != null) {
            paint.setTypeface(Typeface.createFromAsset(assetManager, this.mTextTypeface));
        }
        paint.setFlags(1);
    }

    private final String strFromAlign(int i7) {
        String str;
        if (i7 != 0) {
            str = "Center";
            if (i7 != 1) {
                str = i7 != 2 ? "Center" : STR_ALIGN_RIGHT;
            }
        } else {
            str = STR_ALIGN_LEFT;
        }
        return str;
    }

    private final String strFromScroll(int i7) {
        String str = STR_SCROLL_NONE;
        if (i7 != 0) {
            str = i7 != 1 ? i7 != 2 ? STR_SCROLL_NONE : STR_SCROLL_VERTICAL : STR_SCROLL_HORIZONTAL;
        }
        return str;
    }

    private final int strToAlign(String str) {
        int iHashCode = str.hashCode();
        int i7 = 1;
        if (iHashCode != 2364455) {
            if (iHashCode != 78959100) {
                if (iHashCode == 2014820469) {
                    str.equals("Center");
                }
            } else if (str.equals(STR_ALIGN_RIGHT)) {
                i7 = 2;
            }
        } else if (str.equals(STR_ALIGN_LEFT)) {
            i7 = 0;
        }
        return i7;
    }

    private final int strToScroll(String str) {
        int iHashCode = str.hashCode();
        int i7 = 0;
        if (iHashCode != -1919497322) {
            if (iHashCode != -913872828) {
                if (iHashCode == 2433880) {
                    str.equals(STR_SCROLL_NONE);
                }
            } else if (str.equals(STR_SCROLL_HORIZONTAL)) {
                i7 = 1;
            }
        } else if (str.equals(STR_SCROLL_VERTICAL)) {
            i7 = 2;
        }
        return i7;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        LivePusherLog.i$default(ID, this + ", destroy!!", null, 4, null);
        synchronized (this.lock) {
            BGLTexture bGLTexture = this.mTextTexture;
            if (bGLTexture != null) {
                bGLTexture.destroy();
            }
            this.mTextTexture = null;
            this.mUVTransMatrix = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void finalize() {
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        BGLTexture bGLTexture = this.mTextTexture;
        return bGLTexture != null ? bGLTexture.getHeight() : 0;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @NotNull
    public final String getMTextWord() {
        return this.mTextWord;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        BGLTexture bGLTexture = this.mTextTexture;
        return bGLTexture != null ? bGLTexture.getWidth() : 0;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mTextWord = jSONObject.optString(CFG_CONTENT);
            this.mTextColor = jSONObject.optString("color");
            this.mTextSize = jSONObject.optInt(CFG_SIZE);
            this.mStrokeColor = jSONObject.optString(CFG_STROKE_COLOR);
            this.mStrokeWidth = jSONObject.optInt(CFG_STROKE_WIDTH);
            this.mTextAlign = strToAlign(jSONObject.optString(CFG_TEXT_ALIGN, "Center"));
            this.mScrollOrientation = strToScroll(jSONObject.optString(CFG_SCROLL_ORIENTATION, STR_SCROLL_NONE));
            this.mScrollSpeed = jSONObject.optDouble(CFG_SCROLL_SPEED, 60.0d);
            createSource();
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public int preferFitMode() {
        int i7 = this.mScrollOrientation;
        return i7 != 1 ? i7 != 2 ? super.preferFitMode() : 5 : 6;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() {
        synchronized (this.lock) {
            BEGLContext eglContext = this.mCtx.getEglContext();
            if (eglContext == null) {
                return true;
            }
            BGLDrawer inputTexDrawer = eglContext.getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB);
            if (inputTexDrawer == null) {
                return true;
            }
            BGLTexture bGLTexture = this.mTextTexture;
            if (bGLTexture == null) {
                return true;
            }
            BGLMatrix bGLMatrix = this.mUVTransMatrix;
            if (bGLMatrix != null) {
                eglContext.getTransState().pushUVPreTrans(bGLMatrix);
            }
            try {
                inputTexDrawer.drawTex(bGLTexture);
                return true;
            } finally {
                if (this.mUVTransMatrix != null) {
                    eglContext.getTransState().popUVPreTrans();
                }
            }
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public JSONObject saveConfig() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CFG_CONTENT, this.mTextWord);
            jSONObject.put("color", this.mTextColor);
            jSONObject.put(CFG_SIZE, this.mTextSize);
            jSONObject.put(CFG_STROKE_COLOR, this.mStrokeColor);
            jSONObject.put(CFG_STROKE_WIDTH, this.mStrokeWidth);
            jSONObject.put(CFG_TEXT_ALIGN, strFromAlign(this.mTextAlign));
            jSONObject.put(CFG_SCROLL_ORIENTATION, strFromScroll(this.mScrollOrientation));
            jSONObject.put(CFG_SCROLL_SPEED, this.mScrollSpeed);
        } catch (Exception e7) {
            LivePusherLog.e(ID, "saveConfig: fail to generate json: " + e7.getMessage(), e7);
        }
        return jSONObject;
    }

    public final void setMTextWord(@NotNull String str) {
        this.mTextWord = str;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) {
        BGLMatrix bGLMatrix;
        BGLMatrix ident;
        if (this.mScrollOrientation == 0 || (bGLMatrix = this.mUVTransMatrix) == null) {
            return;
        }
        int i7 = (int) ((((double) (this.mWidth * 1.0f)) / this.mScrollSpeed) * ((double) 1000.0f));
        this.mCycleMs = i7;
        if (i7 == 0) {
            return;
        }
        this.mOffset = ((j7 % ((long) i7)) * 1.0f) / i7;
        if (bGLMatrix == null || (ident = bGLMatrix.setIdent()) == null) {
            return;
        }
        int i8 = this.mScrollOrientation;
        float f7 = i8 == 1 ? this.mOffset : 0.0f;
        float f8 = i8 == 2 ? this.mOffset : 0.0f;
        float[] fArrData = ident.data();
        for (int i9 = 0; i9 < 4; i9++) {
            BGLMatrix.Companion companion = BGLMatrix.Companion;
            float f9 = fArrData[12 + i9];
            if (f9 != 0.0f) {
                fArrData[i9] = (f7 * f9) + fArrData[i9];
                int i10 = 4 + i9;
                fArrData[i10] = (f9 * f8) + fArrData[i10];
            }
        }
    }

    public final void updateText(@NotNull String str) {
        this.mTextWord = str;
        try {
            attachTexture();
        } catch (BGLException e7) {
            LivePusherLog.w(ID, "update text fail, exception: ", e7);
        }
    }
}
