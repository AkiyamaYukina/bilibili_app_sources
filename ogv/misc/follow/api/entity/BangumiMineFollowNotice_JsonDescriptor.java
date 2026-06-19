package com.bilibili.ogv.misc.follow.api.entity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/BangumiMineFollowNotice_JsonDescriptor.class */
public final class BangumiMineFollowNotice_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69115a = {new PojoPropertyDescriptor("version", (String[]) null, Integer.TYPE, (Class) null, 3), new PojoPropertyDescriptor("tip", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("button_name", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("button_link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 2), new PojoPropertyDescriptor("order_report_params", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 6)};

    public BangumiMineFollowNotice_JsonDescriptor() {
        super(BangumiMineFollowNotice.class, f69115a);
    }

    public final Object constructWith(Object[] objArr) {
        BangumiMineFollowNotice bangumiMineFollowNotice = new BangumiMineFollowNotice();
        Object obj = objArr[0];
        if (obj != null) {
            bangumiMineFollowNotice.f69108a = ((Integer) obj).intValue();
        }
        Object obj2 = objArr[1];
        if (obj2 != null) {
            bangumiMineFollowNotice.f69109b = (String) obj2;
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            bangumiMineFollowNotice.f69110c = (String) obj3;
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            bangumiMineFollowNotice.f69111d = (String) obj4;
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            bangumiMineFollowNotice.f69112e = (String) obj5;
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            bangumiMineFollowNotice.f69113f = (ReportVo) obj6;
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            bangumiMineFollowNotice.f69114g = (Map) obj7;
        }
        return bangumiMineFollowNotice;
    }

    public final Object get(Object obj, int i7) {
        BangumiMineFollowNotice bangumiMineFollowNotice = (BangumiMineFollowNotice) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(bangumiMineFollowNotice.f69108a);
            case 1:
                return bangumiMineFollowNotice.f69109b;
            case 2:
                return bangumiMineFollowNotice.f69110c;
            case 3:
                return bangumiMineFollowNotice.f69111d;
            case 4:
                return bangumiMineFollowNotice.f69112e;
            case 5:
                return bangumiMineFollowNotice.f69113f;
            case 6:
                return bangumiMineFollowNotice.f69114g;
            default:
                return null;
        }
    }
}
