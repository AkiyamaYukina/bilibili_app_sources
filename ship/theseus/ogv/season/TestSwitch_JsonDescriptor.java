package com.bilibili.ship.theseus.ogv.season;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/TestSwitch_JsonDescriptor.class */
public final class TestSwitch_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94513a;

    static {
        Class cls = Boolean.TYPE;
        f94513a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("merge_position_section_for_cinema", new String[]{"was_merge_exp"}, cls, (Class) null, 5), new PojoPropertyDescriptor("reduce_short_title_spacing", new String[]{"short_space_title_exp"}, cls, (Class) null, 5), new PojoPropertyDescriptor("merge_preview_section", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("enable_show_vt_info", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("hide_ep_vv_vt_dm", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("hide_post_review", (String[]) null, cls, (Class) null, 7)};
    }

    public TestSwitch_JsonDescriptor() {
        super(TestSwitch.class, f94513a);
    }

    public final Object constructWith(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        Boolean bool3 = (Boolean) objArr[2];
        boolean zBooleanValue3 = bool3 == null ? false : bool3.booleanValue();
        Boolean bool4 = (Boolean) objArr[3];
        boolean zBooleanValue4 = bool4 == null ? false : bool4.booleanValue();
        Object obj = objArr[4];
        int i7 = obj == null ? 16 : 0;
        Boolean bool5 = (Boolean) obj;
        boolean zBooleanValue5 = bool5 == null ? false : bool5.booleanValue();
        Object obj2 = objArr[5];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 32;
        }
        Boolean bool6 = (Boolean) obj2;
        return new TestSwitch(zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, bool6 == null ? false : bool6.booleanValue(), i8);
    }

    public final Object get(Object obj, int i7) {
        boolean zC;
        TestSwitch testSwitch = (TestSwitch) obj;
        if (i7 == 0) {
            zC = testSwitch.c();
        } else if (i7 == 1) {
            zC = testSwitch.f();
        } else if (i7 == 2) {
            zC = testSwitch.d();
        } else if (i7 == 3) {
            zC = testSwitch.e();
        } else if (i7 == 4) {
            zC = testSwitch.a();
        } else {
            if (i7 != 5) {
                return null;
            }
            zC = testSwitch.b();
        }
        return Boolean.valueOf(zC);
    }
}
