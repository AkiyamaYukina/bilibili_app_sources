package com.bilibili.ogvcommon.play.vo;

import com.bapis.bilibili.pgc.gateway.player.v2.Coupon;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogvcommon.play.vo.PopWinVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/PopWinVo_JsonDescriptor.class */
public final class PopWinVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73338a = {new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 2), new PojoPropertyDescriptor("desc", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("coupons", (String[]) null, Types.parameterizedType(List.class, new Type[]{Coupon.class}), (Class) null, 17), new PojoPropertyDescriptor("buttons", (String[]) null, Types.parameterizedType(List.class, new Type[]{TextVo.class}), (Class) null, 17), new PojoPropertyDescriptor("bottom_text", (String[]) null, TextVo.class, (Class) null, 6), new PojoPropertyDescriptor("pop_type", (String[]) null, PopWinVo.Type.class, (Class) null, 7)};

    public PopWinVo_JsonDescriptor() {
        super(PopWinVo.class, f73338a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    public final Object constructWith(Object[] objArr) {
        ?? r13 = false;
        Object obj = objArr[0];
        if (obj == null) {
            r13 = true;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        ?? r12 = r13;
        if (obj2 == null) {
            r12 = (r13 == true ? 1 : 0) | 2;
        }
        TextVo textVo = (TextVo) obj2;
        Object obj3 = objArr[2];
        ?? r132 = r12 == true ? 1 : 0;
        if (obj3 == null) {
            r132 = (r12 == true ? 1 : 0) | 4;
        }
        TextVo textVo2 = (TextVo) obj3;
        List list = (List) objArr[3];
        List list2 = (List) objArr[4];
        Object obj4 = objArr[5];
        ?? r122 = r132 == true ? 1 : 0;
        if (obj4 == null) {
            r122 = (r132 == true ? 1 : 0) | 32;
        }
        TextVo textVo3 = (TextVo) obj4;
        Object obj5 = objArr[6];
        ?? r133 = r122 == true ? 1 : 0;
        if (obj5 == null) {
            r133 = (r122 == true ? 1 : 0) | 64;
        }
        PopWinVo.Type type = (PopWinVo.Type) obj5;
        String str2 = str;
        if (((r133 == true ? 1 : 0) & 1) != 0) {
            str2 = null;
        }
        if (((r133 == true ? 1 : 0) & 2) != 0) {
            textVo = null;
        }
        if (((r133 == true ? 1 : 0) & 4) != 0) {
            textVo2 = null;
        }
        if (((r133 == true ? 1 : 0) & 32) != 0) {
            textVo3 = null;
        }
        if (((r133 == true ? 1 : 0) & 64) != 0) {
            type = PopWinVo.Type.COMMON;
        }
        return new PopWinVo(str2, textVo, textVo2, list, list2, textVo3, type);
    }

    public final Object get(Object obj, int i7) {
        PopWinVo popWinVo = (PopWinVo) obj;
        switch (i7) {
            case 0:
                return popWinVo.f73331a;
            case 1:
                return popWinVo.f73332b;
            case 2:
                return popWinVo.c();
            case 3:
                return popWinVo.f73334d;
            case 4:
                return popWinVo.f73335e;
            case 5:
                return popWinVo.a();
            case 6:
                return popWinVo.b();
            default:
                return null;
        }
    }
}
