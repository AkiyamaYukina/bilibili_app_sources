package com.bilibili.ogvcommon.play.vo;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.play.vo.base.GradientColorVo;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/BangumiVipBarVo_JsonDescriptor.class */
public final class BangumiVipBarVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73302a = {new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("sub_title", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("sub_title_icon", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("bg_gradient_color", (String[]) null, GradientColorVo.class, (Class) null, 4), new PojoPropertyDescriptor("buttons", (String[]) null, Types.parameterizedType(List.class, new Type[]{TextVo.class}), (Class) null, 23), new PojoPropertyDescriptor("report", (String[]) null, ReportVo.class, (Class) null, 2), new PojoPropertyDescriptor("full_screen_ip_icon", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("full_screen_bg_gradient_color", (String[]) null, GradientColorVo.class, (Class) null, 4)};

    public BangumiVipBarVo_JsonDescriptor() {
        super(BangumiVipBarVo.class, f73302a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    public final Object constructWith(Object[] objArr) {
        ?? r15 = false;
        Object obj = objArr[0];
        if (obj == null) {
            r15 = true;
        }
        TextVo textVo = (TextVo) obj;
        Object obj2 = objArr[1];
        ?? r14 = r15;
        if (obj2 == null) {
            r14 = (r15 == true ? 1 : 0) | 2;
        }
        TextVo textVo2 = (TextVo) obj2;
        Object obj3 = objArr[2];
        ?? r16 = r14 == true ? 1 : 0;
        if (obj3 == null) {
            r16 = (r14 == true ? 1 : 0) | 4;
        }
        String str = (String) obj3;
        Object obj4 = objArr[3];
        ?? r152 = r16 == true ? 1 : 0;
        if (obj4 == null) {
            r152 = (r16 == true ? 1 : 0) | 8;
        }
        String str2 = (String) obj4;
        GradientColorVo gradientColorVo = (GradientColorVo) objArr[4];
        Object obj5 = objArr[5];
        ?? r142 = r152 == true ? 1 : 0;
        if (obj5 == null) {
            r142 = (r152 == true ? 1 : 0) | 32;
        }
        List arrayList = (List) obj5;
        Object obj6 = objArr[6];
        ?? r153 = r142 == true ? 1 : 0;
        if (obj6 == null) {
            r153 = (r142 == true ? 1 : 0) | 64;
        }
        ReportVo reportVo = (ReportVo) obj6;
        String str3 = (String) objArr[7];
        GradientColorVo gradientColorVo2 = (GradientColorVo) objArr[8];
        TextVo textVo3 = textVo;
        if (((r153 == true ? 1 : 0) & 1) != 0) {
            textVo3 = null;
        }
        if (((r153 == true ? 1 : 0) & 2) != 0) {
            textVo2 = null;
        }
        if (((r153 == true ? 1 : 0) & 4) != 0) {
            str = null;
        }
        if (((r153 == true ? 1 : 0) & 8) != 0) {
            str2 = null;
        }
        if (((r153 == true ? 1 : 0) & 32) != 0) {
            arrayList = new ArrayList();
        }
        if (((r153 == true ? 1 : 0) & 64) != 0) {
            reportVo = null;
        }
        return new BangumiVipBarVo(textVo3, textVo2, str, str2, gradientColorVo, arrayList, reportVo, str3, gradientColorVo2);
    }

    public final Object get(Object obj, int i7) {
        BangumiVipBarVo bangumiVipBarVo = (BangumiVipBarVo) obj;
        switch (i7) {
            case 0:
                return bangumiVipBarVo.h();
            case 1:
                return bangumiVipBarVo.f();
            case 2:
                return bangumiVipBarVo.g();
            case 3:
                return bangumiVipBarVo.b();
            case 4:
                return bangumiVipBarVo.a();
            case 5:
                return bangumiVipBarVo.c();
            case 6:
                return bangumiVipBarVo.f73298g;
            case 7:
                return bangumiVipBarVo.e();
            case 8:
                return bangumiVipBarVo.d();
            default:
                return null;
        }
    }
}
