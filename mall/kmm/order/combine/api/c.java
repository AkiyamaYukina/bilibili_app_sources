package com.bilibili.mall.kmm.order.combine.api;

import androidx.compose.runtime.ComposerKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import fh0.H0;
import fh0.I0;
import fh0.J0;
import fh0.K0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/api/c.class */
public final class c {
    public static final Map a(H0 h02) {
        Object objEmptyList;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        List<J0> list = h02.f117838a;
        if (list != null) {
            List<J0> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (true) {
                objEmptyList = arrayList;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(d((J0) it.next()));
            }
        } else {
            objEmptyList = CollectionsKt.emptyList();
        }
        mapCreateMapBuilder.put("inputList", objEmptyList);
        return MapsKt.build(mapCreateMapBuilder);
    }

    public static String b(int i7) {
        if (i7 == 0) {
            return "没有错误";
        }
        switch (i7) {
            case 101:
                return "预检查错误，文件路径为空";
            case 102:
                return "预检查错误，文件不存在";
            case 103:
                return "预检查错误，文件大小为0";
            case 104:
                return "预检查错误，没有网络";
            default:
                switch (i7) {
                    case 201:
                        return "过程错误，没有网络";
                    case 202:
                        return "过程错误，文件不存在";
                    case 203:
                        return "过程错误，服务器异常";
                    case ComposerKt.providerMapsKey /* 204 */:
                        return "过程错误，网络call为空";
                    case 205:
                        return "过程错误，抛异常";
                    case ComposerKt.referenceKey /* 206 */:
                        return "过程错误，重试次数达上限";
                    case ComposerKt.reuseKey /* 207 */:
                        return "过程错误，服务器异常，重试次数达上限";
                    case 208:
                        return "过程错误，服务器异常，业务错误";
                    default:
                        switch (i7) {
                            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE /* 210 */:
                                return "连接超时";
                            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_CAM_FOVX /* 211 */:
                                return "JSON异常";
                            case 212:
                                return "SOCKET连接异常";
                            case 213:
                                return "其他IO异常";
                            case 214:
                                return "非法状态异常";
                            case 215:
                                return "其他异常";
                            case 216:
                                return "TCP连接异常";
                            case 217:
                                return "SSL连接异常";
                            case 218:
                                return "response为空";
                            default:
                                return "";
                        }
                }
        }
    }

    public static String c(int i7) {
        if (i7 == 0) {
            return "NO_ERROR";
        }
        switch (i7) {
            case 101:
                return "PRE_ERROR_FILE_PATH_EMPTY";
            case 102:
                return "PRE_ERROR_FILE_NOT_FOUND";
            case 103:
                return "PRE_ERROR_FILE_INVALID";
            case 104:
                return "PRE_ERROR_NO_NET";
            default:
                switch (i7) {
                    case 201:
                        return "UPLOAD_ERROR_NO_NET";
                    case 202:
                        return "UPLOAD_ERROR_FILE_NOT_FOUND";
                    case 203:
                        return "UPLOAD_ERROR_SERVER";
                    case ComposerKt.providerMapsKey /* 204 */:
                        return "UPLOAD_ERROR_INNER_CALL";
                    case 205:
                        return "UPLOAD_ERROR_INNER_EXCEPTION";
                    case ComposerKt.referenceKey /* 206 */:
                        return "UPLOAD_ERROR_INNER_RETRY";
                    case ComposerKt.reuseKey /* 207 */:
                        return "UPLOAD_ERROR_SERVER_RETRY";
                    case 208:
                        return "UPLOAD_ERROR_SERVER_DATA";
                    default:
                        switch (i7) {
                            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_BODY_STATURE /* 210 */:
                                return "UPLOAD_ERROR_INNER_SOCKET_TIMEOUT_EXCEPTION";
                            case BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_CAM_FOVX /* 211 */:
                                return "UPLOAD_ERROR_INNER_JSON_EXCEPTION";
                            case 212:
                                return "UPLOAD_ERROR_INNER_SOCKET_EXCEPTION";
                            case 213:
                                return "UPLOAD_ERROR_INNER_OTHER_IO_EXCEPTION";
                            case 214:
                                return "UPLOAD_ERROR_INNER_ILLEGAL_STATE_EXCEPTION";
                            case 215:
                                return "UPLOAD_ERROR_INNER_OTHER_EXCEPTION";
                            case 216:
                                return "UPLOAD_ERROR_SSL_HANDS_EXCEPTION";
                            case 217:
                                return "UPLOAD_ERROR_SSL_CONNECT_EXCEPTION";
                            case 218:
                                return "UPLOAD_ERROR_RESPONSE_NULL";
                            case 219:
                                return "UPLOAD_ERROR_INNER_CHUNK_NO_CHANGE_EXCEPTION";
                            default:
                                return "";
                        }
                }
        }
    }

    public static final Map d(J0 j02) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String str = j02.f117848a;
        if (str != null) {
            mapCreateMapBuilder.put("inputType", str);
        }
        String str2 = j02.f117849b;
        if (str2 != null) {
            mapCreateMapBuilder.put("label", str2);
        }
        String str3 = j02.f117850c;
        if (str3 != null) {
            mapCreateMapBuilder.put("name", str3);
        }
        String str4 = j02.f117857k;
        if (str4 != null) {
            mapCreateMapBuilder.put("value", str4);
        }
        Boolean bool = j02.f117854g;
        if (bool != null) {
            mapCreateMapBuilder.put("required", bool);
        }
        String str5 = j02.h;
        if (str5 != null) {
            mapCreateMapBuilder.put("errMsg", str5);
        }
        String str6 = j02.f117853f;
        if (str6 != null) {
            mapCreateMapBuilder.put("placeholder", str6);
        }
        Boolean bool2 = j02.f117851d;
        if (bool2 != null) {
            mapCreateMapBuilder.put("containInnerInput", bool2);
        }
        String str7 = j02.f117856j;
        if (str7 != null) {
            mapCreateMapBuilder.put("selectTitle", str7);
        }
        I0 i02 = j02.f117855i;
        if (i02 != null) {
            Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
            Integer num = i02.f117841a;
            if (num != null) {
                mapCreateMapBuilder2.put("maxLen", Integer.valueOf(num.intValue()));
            }
            Integer num2 = i02.f117842b;
            if (num2 != null) {
                mapCreateMapBuilder2.put("minLen", Integer.valueOf(num2.intValue()));
            }
            String str8 = i02.f117843c;
            if (str8 != null) {
                mapCreateMapBuilder2.put("pattern", str8);
            }
            String str9 = i02.f117844d;
            if (str9 != null) {
                mapCreateMapBuilder2.put("desc", str9);
            }
            Unit unit = Unit.INSTANCE;
            mapCreateMapBuilder.put("rule", MapsKt.build(mapCreateMapBuilder2));
        }
        List<K0> list = j02.f117852e;
        if (list != null) {
            List<K0> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (K0 k02 : list2) {
                Map mapCreateMapBuilder3 = MapsKt.createMapBuilder();
                String str10 = k02.f117860a;
                if (str10 != null) {
                    mapCreateMapBuilder3.put("label", str10);
                }
                String str11 = k02.f117861b;
                if (str11 != null) {
                    mapCreateMapBuilder3.put("value", str11);
                }
                J0 j03 = k02.f117862c;
                if (j03 != null) {
                    mapCreateMapBuilder3.put("innerInput", d(j03));
                }
                arrayList.add(MapsKt.build(mapCreateMapBuilder3));
            }
            mapCreateMapBuilder.put("options", arrayList);
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
