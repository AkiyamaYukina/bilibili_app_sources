package com.bilibili.mobile;

import android.content.res.AssetManager;
import com.bilibili.mobile.model.BLDeviceInfo;
import com.bilibili.mobile.model.BLHATime;
import com.bilibili.mobile.model.BLHumanAction;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLMobileHumanActionNative.class */
public class BLMobileHumanActionNative {
    public static final long BL_MOBILE_BODY_ACTION1 = 4294967296L;
    public static final long BL_MOBILE_BODY_ACTION2 = 8589934592L;
    public static final long BL_MOBILE_BODY_ACTION3 = 17179869184L;
    public static final long BL_MOBILE_BODY_ACTION4 = 34359738368L;
    public static final long BL_MOBILE_BODY_ACTION5 = 68719476736L;
    public static final long BL_MOBILE_BODY_CONTOUR = 268435456;
    public static final int BL_MOBILE_BODY_DETECT_FULL = 402653184;
    public static final long BL_MOBILE_BODY_KEYPOINTS = 134217728;
    public static final long BL_MOBILE_BROW_JUMP = 32;
    public static final long BL_MOBILE_DETECT_AVATAR_HELPINFO = 140737488355328L;
    public static final long BL_MOBILE_DETECT_DYNAMIC_GESTURE = 35184372088832L;
    public static final long BL_MOBILE_DETECT_EXTRA_FACE_POINTS = 16777216;
    public static final long BL_MOBILE_DETECT_EYEBALL_CENTER = 33554432;
    public static final long BL_MOBILE_DETECT_EYEBALL_CONTOUR = 67108864;
    public static final long BL_MOBILE_DETECT_GAZE = 17592186044416L;
    public static final long BL_MOBILE_DETECT_HAND_SKELETON_KEYPOINTS = 2199023255552L;
    public static final int BL_MOBILE_DETECT_MODE_IMAGE = 262144;
    public static final int BL_MOBILE_DETECT_MODE_VIDEO = 131072;
    public static final long BL_MOBILE_DETECT_MOUTH_PARSE = 36028797018963968L;
    public static final int BL_MOBILE_DETECT_TONGUE = 1073741824;
    public static final int BL_MOBILE_ENABLE_AVATAR_HELPER = 536870912;
    public static final int BL_MOBILE_ENABLE_BODY_CONTOUR = 16384;
    public static final int BL_MOBILE_ENABLE_BODY_KEYPOINTS = 4096;
    public static final int BL_MOBILE_ENABLE_DYNAMIC_GESTURE = 268435456;
    public static final int BL_MOBILE_ENABLE_EYEBALL_CENTER_DETECT = 1024;
    public static final int BL_MOBILE_ENABLE_EYEBALL_CONTOUR_DETECT = 2048;
    public static final int BL_MOBILE_ENABLE_FACE_DETECT = 64;
    public static final int BL_MOBILE_ENABLE_FACE_EXTRA_DETECT = 512;
    public static final int BL_MOBILE_ENABLE_GAZE_DETECT = 134217728;
    public static final int BL_MOBILE_ENABLE_HAIR_SEGMENT = 32768;
    public static final int BL_MOBILE_ENABLE_HAND_DETECT = 128;
    public static final int BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS = 16777216;
    public static final int BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D = 33554432;
    public static final long BL_MOBILE_ENABLE_HEAD_SEGMENT = 8589934592L;
    public static final long BL_MOBILE_ENABLE_MOUTH_PARSE_DETECT = 34359738368L;
    public static final int BL_MOBILE_ENABLE_MULTI_SEGMENT = 67108864;
    public static final int BL_MOBILE_ENABLE_SEGMENT_DETECT = 256;
    public static final long BL_MOBILE_ENABLE_SKIN_SEGMENT = 17179869184L;
    public static final long BL_MOBILE_EYE_BLINK = 2;
    public static final long BL_MOBILE_FACE_DETECT = 1;
    public static final int BL_MOBILE_FACE_DETECT_FULL = 255;
    public static final long BL_MOBILE_FACE_LIPS_POUTED = 128;
    public static final long BL_MOBILE_FACE_LIPS_UPWARD = 64;
    public static final long BL_MOBILE_HAND_666 = 4194304;
    public static final long BL_MOBILE_HAND_BLESS = 8388608;
    public static final long BL_MOBILE_HAND_CONGRATULATE = 131072;
    public static final long BL_MOBILE_HAND_DETECT = 256;
    public static final long BL_MOBILE_HAND_DETECT_FULL = 71468272516864L;
    public static final long BL_MOBILE_HAND_FINGER_HEART = 262144;
    public static final long BL_MOBILE_HAND_FINGER_INDEX = 1048576;
    public static final long BL_MOBILE_HAND_FIST = 2097152;
    public static final long BL_MOBILE_HAND_GOOD = 2048;
    public static final long BL_MOBILE_HAND_HOLDUP = 32768;
    public static final long BL_MOBILE_HAND_ILOVEYOU = 1099511627776L;
    public static final long BL_MOBILE_HAND_LOVE = 16384;
    public static final long BL_MOBILE_HAND_OK = 512;
    public static final long BL_MOBILE_HAND_PALM = 4096;
    public static final long BL_MOBILE_HAND_PISTOL = 8192;
    public static final long BL_MOBILE_HAND_SCISSOR = 1024;
    public static final long BL_MOBILE_HEAD_PITCH = 16;
    public static final long BL_MOBILE_HEAD_YAW = 8;
    public static final long BL_MOBILE_HUMAN_ACTION_DEFAULT_CONFIG_DETECT = 101177407;
    public static final int BL_MOBILE_HUMAN_ACTION_DEFAULT_CONFIG_IMAGE = 328128;
    public static final int BL_MOBILE_HUMAN_ACTION_DEFAULT_CONFIG_VIDEO = 131568;
    public static final long BL_MOBILE_MOUTH_AH = 4;
    public static final long BL_MOBILE_SEG_BACKGROUND = 65536;
    public static final long BL_MOBILE_SEG_BACKGROUND_VIDEO = 4611686018427387904L;
    public static final long BL_MOBILE_SEG_FACE_OCCLUSION = 17179869184L;
    public static final long BL_MOBILE_SEG_HAIR = 536870912;
    public static final long BL_MOBILE_SEG_HEAD = 4294967296L;
    public static final long BL_MOBILE_SEG_MULTI = 8796093022208L;
    public static final long BL_MOBILE_SEG_SKIN = 8589934592L;
    public static final String FEATURE_TAG_NEURO_PILOT = "neuro_pilot";
    private static final String TAG = "BLMobileHumanActionNative";
    private long nativeHumanActionHandle;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/BLMobileHumanActionNative$BLMobileExpression.class */
    public enum BLMobileExpression {
        BL_MOBILE_EXPRESSION_EYE_BLINK(1),
        BL_MOBILE_EXPRESSION_MOUTH_AH(2),
        BL_MOBILE_EXPRESSION_HEAD_YAW(3),
        BL_MOBILE_EXPRESSION_HEAD_PITCH(4),
        BL_MOBILE_EXPRESSION_BROW_JUMP(5),
        BL_MOBILE_EXPRESSION_HAND_OK(9),
        BL_MOBILE_EXPRESSION_HAND_SCISSOR(10),
        BL_MOBILE_EXPRESSION_HAND_GOOD(11),
        BL_MOBILE_EXPRESSION_HAND_PALM(12),
        BL_MOBILE_EXPRESSION_HAND_PISTOL(13),
        BL_MOBILE_EXPRESSION_HAND_LOVE(14),
        BL_MOBILE_EXPRESSION_HAND_HOLDUP(15),
        BL_MOBILE_EXPRESSION_HAND_CONGRATULATE(17),
        BL_MOBILE_EXPRESSION_HAND_FINGER_HEART(18),
        BL_MOBILE_EXPRESSION_HAND_FINGER_INDEX(20),
        BL_MOBILE_EXPRESSION_HEAD_NORMAL(65),
        BL_MOBILE_EXPRESSION_SIDE_FACE_LEFT(66),
        BL_MOBILE_EXPRESSION_SIDE_FACE_RIGHT(67),
        BL_MOBILE_EXPRESSION_TILTED_FACE_LEFT(68),
        BL_MOBILE_EXPRESSION_TILTED_FACE_RIGHT(69),
        BL_MOBILE_EXPRESSION_HEAD_RISE(70),
        BL_MOBILE_EXPRESSION_HEAD_LOWER(71),
        BL_MOBILE_EXPRESSION_TWO_EYE_CLOSE(85),
        BL_MOBILE_EXPRESSION_TWO_EYE_OPEN(86),
        BL_MOBILE_EXPRESSION_LEFTEYE_OPEN_RIGHTEYE_CLOSE(87),
        BL_MOBILE_EXPRESSION_LEFTEYE_CLOSE_RIGHTEYE_OPEN(88),
        BL_MOBILE_EXPRESSION_MOUTH_OPEN(105),
        BL_MOBILE_EXPRESSION_MOUTH_CLOSE(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD),
        BL_MOBILE_EXPRESSION_FACE_LIPS_UPWARD(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_TRACK_SCORE_THRESHOLD),
        BL_MOBILE_EXPRESSION_FACE_LIPS_POUTED(108),
        BL_MOBILE_EXPRESSION_FACE_LIPS_CURL_LEFT(109),
        BL_MOBILE_EXPRESSION_FACE_LIPS_CURL_RIGHT(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_SKELETON_THRESHOLD),
        BL_MOBILE_EXPRESSION_COUNT(128),
        BL_MOBILE_EXPRESSION_FACE_ALL(257),
        BL_MOBILE_EXPRESSION_HAND_ALL(258);

        private final int expressionCode;

        BLMobileExpression(int i7) {
            this.expressionCode = i7;
        }

        public int getExpressionCode() {
            return this.expressionCode;
        }
    }

    static {
        BLLibraryLoader.loadBLLibrary();
    }

    public native int addSubModel(String str);

    public native int addSubModelFromAssetFile(String str, AssetManager assetManager);

    public native int createInstance(String str, long j7);

    public native int createInstanceFromAssetFile(String str, long j7, AssetManager assetManager);

    public native int createInstanceWithSubModels(String[] strArr, int i7, int i8);

    public native void destroyInstance();

    public native BLDeviceInfo getDeviceInfo();

    public native int getFaceActionThreshold(long j7, float[] fArr);

    public native int getParam(int i7, float[] fArr);

    public native BLHATime getPerfInfo();

    public native BLHumanAction humanActionDetect(byte[] bArr, int i7, long j7, int i8, int i9, int i10);

    public native int removeSubModelByConfig(int i7);

    public native int reset();

    public native int setFaceActionThreshold(long j7, float f7);

    public native int setParam(int i7, float f7);
}
