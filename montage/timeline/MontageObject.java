package com.bilibili.montage.timeline;

import android.os.Handler;
import android.os.Looper;
import com.bilibili.montage.avutil.LogSinker;
import com.bilibili.montage.utils.NativeObjectManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/timeline/MontageObject.class */
public class MontageObject {
    public static final String TEMPLATE_KEY_BEST_SEEK_TIME = "MSTemplate-BestSeekTime";
    public static final String TEMPLATE_KEY_CLIP_RAW_HEIGHT = "MSTemplate-ClipRawHeight";
    public static final String TEMPLATE_KEY_CLIP_RAW_WIDTH = "MSTemplate-ClipRawWidth";
    public static final String TEMPLATE_KEY_CURVE_SPEED_TYPE = "MSTemplate-CurveSpeedType";
    public static final String TEMPLATE_KEY_FOOTAGE_CAN_REPLACE = "MSTemplate-FootageCanReplace";
    public static final String TEMPLATE_KEY_FOOTAGE_ID = "MSTemplate-FootageId";
    public static final String TEMPLATE_KEY_FOOTAGE_M3U8_NAME = "MSTemplate-FootageM3U8Name";
    public static final String TEMPLATE_KEY_FOOTAGE_NAME = "MSTemplate-FootageName";
    public static final String TEMPLATE_KEY_FOOTAGE_NEED_REVERSE = "MSTemplate-FootageNeedReverse";
    public static final String TEMPLATE_KEY_FOOTAGE_TAGS = "MSTemplate-FootageTags";
    public static final String TEMPLATE_KEY_FOOTAGE_TYPE = "MSTemplate-FootageType";
    public static final String TEMPLATE_KEY_FX_GROUP = "MSTemplate-FxGroup";
    public static final String TEMPLATE_KEY_MASK_TYPE = "MSTemplate-MaskType";
    public static final String TEMPLATE_KEY_REPLACE_ID = "MSTemplate-ReplaceId";
    public static final String TEMPLATE_KEY_TRANS_TYPE_CUT = "MSTemplate-TransType-Cut";
    public static final String TEMPLATE_KEY_VOLUME_TYPE = "MSTemplate-VolumeType";
    public static final String TEMPLATE_VALUE_CURVE_SPEED_TYPE_BULLET = "MSTemplate-CurveSpeedType-bullet";
    public static final String TEMPLATE_VALUE_CURVE_SPEED_TYPE_CUSTOM = "MSTemplate-CurveSpeedType-Custom";
    public static final String TEMPLATE_VALUE_CURVE_SPEED_TYPE_HERO = "MSTemplate-CurveSpeedType-Hero";
    public static final String TEMPLATE_VALUE_CURVE_SPEED_TYPE_IN = "MSTemplate-CurveSpeedType-In";
    public static final String TEMPLATE_VALUE_CURVE_SPEED_TYPE_MONTAGE = "MSTemplate-CurveSpeedType-Montage";
    public static final String TEMPLATE_VALUE_CURVE_SPEED_TYPE_OUT = "MSTemplate-CurveSpeedType-Out";
    public static final String TEMPLATE_VALUE_CURVE_SPEED_TYPE_PLUS = "MSTemplate-CurveSpeedType-Plus";
    public static final String TEMPLATE_VALUE_MASK_TYPE_CIRCLE = "MSTemplate-MaskType-Circle";
    public static final String TEMPLATE_VALUE_MASK_TYPE_HEART = "MSTemplate-MaskType-Heart";
    public static final String TEMPLATE_VALUE_MASK_TYPE_LINE = "MSTemplate-MaskType-Line";
    public static final String TEMPLATE_VALUE_MASK_TYPE_MIRROR = "MSTemplate-MaskType-Mirror";
    public static final String TEMPLATE_VALUE_MASK_TYPE_RECT = "MSTemplate-MaskType-Rect";
    public static final String TEMPLATE_VALUE_MASK_TYPE_STAR = "MSTemplate-MaskType-Star";
    protected long mInternalObject = 0;
    private String TAG = "MontageObject";
    private Map<String, Object> mAttachmentMap = new HashMap();

    public static void nativeDestroy(long j7) {
        new Handler(Looper.getMainLooper()).post(new Runnable(j7) { // from class: com.bilibili.montage.timeline.MontageObject.1
            final long val$nativeRef;

            {
                this.val$nativeRef = j7;
            }

            @Override // java.lang.Runnable
            public void run() {
                MontageObject.nativeWeakenObject(this.val$nativeRef);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeWeakenObject(long j7);

    public void detachInternalObject() {
        LogSinker.i(this.TAG, "Mon.JAVA. let mInternalObject = 0");
        this.mInternalObject = 0L;
    }

    public Object getAttachment(String str) {
        return this.mAttachmentMap.get(str);
    }

    public long getBaseObject() {
        return this.mInternalObject;
    }

    public long getInternalObject() {
        return this.mInternalObject;
    }

    public String getTemplateAttachment(String str) {
        return "";
    }

    public long identity() {
        return this.mInternalObject;
    }

    public boolean isValid() {
        return getInternalObject() != 0;
    }

    public void setAttachment(String str, Object obj) {
        this.mAttachmentMap.put(str, obj);
    }

    public void setInternalObject(long j7) {
        this.mInternalObject = j7;
        NativeObjectManager.register(this, j7);
    }

    public void setTemplateAttachment(String str, String str2) {
    }
}
