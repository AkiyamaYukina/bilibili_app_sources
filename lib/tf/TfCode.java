package com.bilibili.lib.tf;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfCode.class */
public enum TfCode implements Internal.EnumLite {
    OK(0),
    TF_SWITCH_DISABLED(7001),
    ACTIVATE_STAUTS_INVALID(7000),
    ACTIVATE_STAUTS_FAILED(7003),
    ACTIVATE_STAUTS_CACHE_EXPIRE(7002),
    RESOURCE_INVALID(6000),
    UNICOM_IP_INVALIDE(2000),
    MOBILE_IP_INVALIDE(20000),
    TELECOM_IP_INVALIDE(4004),
    UNICOM_CDN_MEDIA_URL_EMPTY(UNICOM_CDN_MEDIA_URL_EMPTY_VALUE),
    UNICOM_CDN_RTMP_URL_EMPTY(UNICOM_CDN_RTMP_URL_EMPTY_VALUE),
    UNICOM_CDN_FILE_URL_EMPTY(UNICOM_CDN_FILE_URL_EMPTY_VALUE),
    UNICOM_CDN_USERID_CHANGED(2004),
    UNICOM_CDN_QUOTA_EXCEEDED(UNICOM_CDN_QUOTA_EXCEEDED_VALUE),
    UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR(UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR_VALUE),
    UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR(UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR_VALUE),
    UNICOM_CDN_RTMP_BIZ_ERROR(2008),
    UNICOM_CDN_RTMP_NETWORK_ERROR(UNICOM_CDN_RTMP_NETWORK_ERROR_VALUE),
    UNICOM_CDN_FILE_BIZ_ERROR(UNICOM_CDN_FILE_BIZ_ERROR_VALUE),
    UNICOM_CDN_FILE_NETWORK_ERROR(UNICOM_CDN_FILE_NETWORK_ERROR_VALUE),
    URL_EMPTY(5001),
    UNICOM_CDN_URL_EMPTY(UNICOM_CDN_URL_EMPTY_VALUE),
    UNICOM_CDN_NETWORK_ERROR(UNICOM_CDN_NETWORK_ERROR_VALUE),
    UNICOM_CDN_BIZ_ERROR(UNICOM_CDN_BIZ_ERROR_VALUE),
    UNICOM_TF_RULES_NO_MATCH(UNICOM_TF_RULES_NO_MATCH_VALUE),
    UNICOM_TF_RULES_INVALID(UNICOM_TF_RULES_INVALID_VALUE),
    MOBILE_TF_RULES_NO_MATCH(5000),
    MOBILE_TF_RULES_INVALID(5002),
    TELECOM_TF_RULES_NO_MATCH(4000),
    TELECOM_TF_RULES_INVALID(4002),
    BVC_CONVERT_NETWORK_ERROR(BVC_CONVERT_NETWORK_ERROR_VALUE),
    BVC_CONVERT_BIZ_ERROR(BVC_CONVERT_BIZ_ERROR_VALUE),
    TF_RULES_INVALID(TF_RULES_INVALID_VALUE),
    TF_RULES_NO_MATCH(TF_RULES_NO_MATCH_VALUE),
    ACTIVATE_STAUTS_EXPIRE(ACTIVATE_STAUTS_EXPIRE_VALUE),
    MANUAL_TRANSFORM_ONLY(10100),
    BILICR_TF_MARKED(BILICR_TF_MARKED_VALUE),
    UNRECOGNIZED(-1);


    @Deprecated
    public static final int ACTIVATE_STAUTS_CACHE_EXPIRE_VALUE = 7002;
    public static final int ACTIVATE_STAUTS_EXPIRE_VALUE = 10012;

    @Deprecated
    public static final int ACTIVATE_STAUTS_FAILED_VALUE = 7003;
    public static final int ACTIVATE_STAUTS_INVALID_VALUE = 7000;

    @Deprecated
    public static final int BILICR_TF_MARKED_VALUE = 10101;
    public static final int BVC_CONVERT_BIZ_ERROR_VALUE = 10002;
    public static final int BVC_CONVERT_NETWORK_ERROR_VALUE = 10001;
    public static final int MANUAL_TRANSFORM_ONLY_VALUE = 10100;

    @Deprecated
    public static final int MOBILE_IP_INVALIDE_VALUE = 20000;

    @Deprecated
    public static final int MOBILE_TF_RULES_INVALID_VALUE = 5002;

    @Deprecated
    public static final int MOBILE_TF_RULES_NO_MATCH_VALUE = 5000;
    public static final int OK_VALUE = 0;
    public static final int RESOURCE_INVALID_VALUE = 6000;

    @Deprecated
    public static final int TELECOM_IP_INVALIDE_VALUE = 4004;

    @Deprecated
    public static final int TELECOM_TF_RULES_INVALID_VALUE = 4002;

    @Deprecated
    public static final int TELECOM_TF_RULES_NO_MATCH_VALUE = 4000;
    public static final int TF_RULES_INVALID_VALUE = 10010;
    public static final int TF_RULES_NO_MATCH_VALUE = 10011;
    public static final int TF_SWITCH_DISABLED_VALUE = 7001;
    public static final int UNICOM_CDN_BIZ_ERROR_VALUE = 9002;

    @Deprecated
    public static final int UNICOM_CDN_FILE_BIZ_ERROR_VALUE = 2016;

    @Deprecated
    public static final int UNICOM_CDN_FILE_NETWORK_ERROR_VALUE = 2018;

    @Deprecated
    public static final int UNICOM_CDN_FILE_URL_EMPTY_VALUE = 2042;

    @Deprecated
    public static final int UNICOM_CDN_MEDIA_URL_EMPTY_VALUE = 2044;
    public static final int UNICOM_CDN_NETWORK_ERROR_VALUE = 9001;
    public static final int UNICOM_CDN_QUOTA_EXCEEDED_VALUE = 2036;

    @Deprecated
    public static final int UNICOM_CDN_RTMP_BIZ_ERROR_VALUE = 2008;

    @Deprecated
    public static final int UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR_VALUE = 2012;

    @Deprecated
    public static final int UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR_VALUE = 2014;

    @Deprecated
    public static final int UNICOM_CDN_RTMP_NETWORK_ERROR_VALUE = 2010;

    @Deprecated
    public static final int UNICOM_CDN_RTMP_URL_EMPTY_VALUE = 2040;

    @Deprecated
    public static final int UNICOM_CDN_URL_EMPTY_VALUE = 9000;

    @Deprecated
    public static final int UNICOM_CDN_USERID_CHANGED_VALUE = 2004;

    @Deprecated
    public static final int UNICOM_IP_INVALIDE_VALUE = 2000;

    @Deprecated
    public static final int UNICOM_TF_RULES_INVALID_VALUE = 3036;

    @Deprecated
    public static final int UNICOM_TF_RULES_NO_MATCH_VALUE = 3010;
    public static final int URL_EMPTY_VALUE = 5001;
    private static final Internal.EnumLiteMap<TfCode> internalValueMap = new Internal.EnumLiteMap<TfCode>() { // from class: com.bilibili.lib.tf.TfCode.1
        /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
        public TfCode m6810findValueByNumber(int i7) {
            return TfCode.forNumber(i7);
        }
    };
    private final int value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfCode$TfCodeVerifier.class */
    public static final class TfCodeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new TfCodeVerifier();

        private TfCodeVerifier() {
        }

        public boolean isInRange(int i7) {
            return TfCode.forNumber(i7) != null;
        }
    }

    TfCode(int i7) {
        this.value = i7;
    }

    public static TfCode forNumber(int i7) {
        switch (i7) {
            case 0:
                return OK;
            case 2000:
                return UNICOM_IP_INVALIDE;
            case 2004:
                return UNICOM_CDN_USERID_CHANGED;
            case 2008:
                return UNICOM_CDN_RTMP_BIZ_ERROR;
            case UNICOM_CDN_RTMP_NETWORK_ERROR_VALUE:
                return UNICOM_CDN_RTMP_NETWORK_ERROR;
            case UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR_VALUE:
                return UNICOM_CDN_RTMP_MEDIA_BIZ_ERROR;
            case UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR_VALUE:
                return UNICOM_CDN_RTMP_MEDIA_NETWORK_ERROR;
            case UNICOM_CDN_FILE_BIZ_ERROR_VALUE:
                return UNICOM_CDN_FILE_BIZ_ERROR;
            case UNICOM_CDN_FILE_NETWORK_ERROR_VALUE:
                return UNICOM_CDN_FILE_NETWORK_ERROR;
            case UNICOM_CDN_QUOTA_EXCEEDED_VALUE:
                return UNICOM_CDN_QUOTA_EXCEEDED;
            case UNICOM_CDN_RTMP_URL_EMPTY_VALUE:
                return UNICOM_CDN_RTMP_URL_EMPTY;
            case UNICOM_CDN_FILE_URL_EMPTY_VALUE:
                return UNICOM_CDN_FILE_URL_EMPTY;
            case UNICOM_CDN_MEDIA_URL_EMPTY_VALUE:
                return UNICOM_CDN_MEDIA_URL_EMPTY;
            case UNICOM_TF_RULES_NO_MATCH_VALUE:
                return UNICOM_TF_RULES_NO_MATCH;
            case UNICOM_TF_RULES_INVALID_VALUE:
                return UNICOM_TF_RULES_INVALID;
            case 4000:
                return TELECOM_TF_RULES_NO_MATCH;
            case 4002:
                return TELECOM_TF_RULES_INVALID;
            case 4004:
                return TELECOM_IP_INVALIDE;
            case 5000:
                return MOBILE_TF_RULES_NO_MATCH;
            case 5001:
                return URL_EMPTY;
            case 5002:
                return MOBILE_TF_RULES_INVALID;
            case 6000:
                return RESOURCE_INVALID;
            case 7000:
                return ACTIVATE_STAUTS_INVALID;
            case 7001:
                return TF_SWITCH_DISABLED;
            case 7002:
                return ACTIVATE_STAUTS_CACHE_EXPIRE;
            case 7003:
                return ACTIVATE_STAUTS_FAILED;
            case UNICOM_CDN_URL_EMPTY_VALUE:
                return UNICOM_CDN_URL_EMPTY;
            case UNICOM_CDN_NETWORK_ERROR_VALUE:
                return UNICOM_CDN_NETWORK_ERROR;
            case UNICOM_CDN_BIZ_ERROR_VALUE:
                return UNICOM_CDN_BIZ_ERROR;
            case BVC_CONVERT_NETWORK_ERROR_VALUE:
                return BVC_CONVERT_NETWORK_ERROR;
            case BVC_CONVERT_BIZ_ERROR_VALUE:
                return BVC_CONVERT_BIZ_ERROR;
            case TF_RULES_INVALID_VALUE:
                return TF_RULES_INVALID;
            case TF_RULES_NO_MATCH_VALUE:
                return TF_RULES_NO_MATCH;
            case ACTIVATE_STAUTS_EXPIRE_VALUE:
                return ACTIVATE_STAUTS_EXPIRE;
            case 10100:
                return MANUAL_TRANSFORM_ONLY;
            case BILICR_TF_MARKED_VALUE:
                return BILICR_TF_MARKED;
            case 20000:
                return MOBILE_IP_INVALIDE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<TfCode> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return TfCodeVerifier.INSTANCE;
    }

    @Deprecated
    public static TfCode valueOf(int i7) {
        return forNumber(i7);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
