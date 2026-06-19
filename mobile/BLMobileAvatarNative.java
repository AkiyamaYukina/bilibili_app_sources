package com.bilibili.mobile;

import android.content.res.AssetManager;
import com.bilibili.mobile.model.BLMobileFaceInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLMobileAvatarNative.class */
public class BLMobileAvatarNative {
    private static final String TAG = "BLMobileAvatarNative";
    private long nativeAvatarHandle;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLMobileAvatarNative$BLMobileAvatar.class */
    public enum BLMobileAvatar {
        BL_AVATAR_EYE_RIGHT_CLOSE(0),
        BL_AVATAR_EYE_RIGHT_DOWN(1),
        BL_AVATAR_EYE_RIGHT_INWARD(2),
        BL_AVATAR_EYE_RIGHT_OUTWARD(3),
        BL_AVATAR_EYE_RIGHT_UP(4),
        BL_AVATAR_EYE_RIGHT_NARROW(5),
        BL_AVATAR_EYE_RIGHT_WIDE(6),
        BL_AVATAR_EYE_LEFT_CLOSE(7),
        BL_AVATAR_EYE_LEFT_DOWN(8),
        BL_AVATAR_EYE_LEFT_INWARD(9),
        BL_AVATAR_EYE_LEFT_OUTWARD(10),
        BL_AVATAR_EYE_LEFT_UP(11),
        BL_AVATAR_EYE_LEFT_NARROW(12),
        BL_AVATAR_EYE_LEFT_WIDE(13),
        BL_AVATAR_JAW_FORWARD(14),
        BL_AVATAR_JAW_RIGHT(15),
        BL_AVATAR_JAW_LEFT(16),
        BL_AVATAR_JAW_OPEN(17),
        BL_AVATAR_MOUTH_CLOSE(18),
        BL_AVATAR_MOUTH_ROUND(19),
        BL_AVATAR_MOUTH_PUCKER(20),
        BL_AVATAR_MOUTH_BOTH_LIP_RIGHT(21),
        BL_AVATAR_MOUTH_BOTH_LIP_LEFT(22),
        BL_AVATAR_MOUTH_RIGHT_CORNER_UP(23),
        BL_AVATAR_MOUTH_LEFT_CORNER_UP(24),
        BL_AVATAR_MOUTH_RIGHT_CORNER_DOWN(25),
        BL_AVATAR_MOUTH_LEFT_CORNER_DOWN(26),
        BL_AVATAR_MOUTH_RIGHT_CORNER_BACKWARD(27),
        BL_AVATAR_MOUTH_LEFT_CORNER_BACKWARD(28),
        BL_AVATAR_MOUTH_RIGHT_CORNER_OUTWARD(29),
        BL_AVATAR_MOUTH_LEFT_CORNER_OUTWARD(30),
        BL_AVATAR_MOUTH_LOWER_LIP_INWARD(31),
        BL_AVATAR_MOUTH_UPPER_LIP_INWARD(32),
        BL_AVATAR_MOUTH_LOWER_LIP_OUTWARD(33),
        BL_AVATAR_MOUTH_UPPER_LIP_OUTWARD(34),
        BL_AVATAR_MOUTH_LOWER_LIP_RIGHT_UP(35),
        BL_AVATAR_MOUTH_LOWER_LIP_LEFT_UP(36),
        BL_AVATAR_MOUTH_LOWER_LIP_RIGHT_DOWN(37),
        BL_AVATAR_MOUTH_LOWER_LIP_LEFT_DOWN(38),
        BL_AVATAR_MOUTH_UPPER_LIP_RIGHT_UP(39),
        BL_AVATAR_MOUTH_UPPER_LIP_LEFT_UP(40),
        BL_AVATAR_MOUTH_LIP_PART(41),
        BL_AVATAR_EYEBROW_RIGHT_OUTER_DOWN(42),
        BL_AVATAR_EYEBROW_LEFT_OUTER_DOWN(43),
        BL_AVATAR_EYEBROW_BOTH_INNER_UP(44),
        BL_AVATAR_EYEBROW_RIGHT_OUTER_UP(45),
        BL_AVATAR_EYEBROW_LEFT_OUTER_UP(46),
        BL_AVATAR_CHEEK_BOTH_OUTWARD(47),
        BL_AVATAR_CHEEK_RIGHT_UP(48),
        BL_AVATAR_CHEEK_LEFT_UP(49),
        BL_AVATAR_NOSE_RIGHT_UP(50),
        BL_AVATAR_NOSE_LEFT_UP(51),
        BL_AVATAR_NOSE_BOTH_WIDE(52),
        BL_AVATAR_TONGUE_OUTWARD(53),
        BL_AVATAR_EXPRESSION_NUM(54);

        private final int eavatarCode;

        BLMobileAvatar(int i7) {
            this.eavatarCode = i7;
        }

        public int getAvatarCode() {
            return this.eavatarCode;
        }
    }

    static {
        BLLibraryLoader.loadBLLibrary();
    }

    public native int avatarExpressionDetect(int i7, int i8, int i9, BLMobileFaceInfo bLMobileFaceInfo, float[] fArr);

    public native int createInstance(String str);

    public native int createInstanceFromAssetFile(String str, AssetManager assetManager);

    public native void destroyInstance();

    public native long getAvatarDetectConfig();
}
