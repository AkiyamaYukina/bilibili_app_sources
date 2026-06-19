package com.bilibili.ogv.opbase;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogv.opbase.CommonCard;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard_Skin_JsonDescriptor.class */
public final class CommonCard_Skin_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69815a;

    static {
        Class cls = Integer.TYPE;
        f69815a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("top_bg_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("top_status_bar_bg_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("top_status_bar_color_type", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("top_search_bar_bg_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("top_tab_bar_bg_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("top_tab_text_highlight_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("top_upper_bg_img", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("top_lower_bg_img", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("bg_start_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("bg_end_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("bg_img", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("item_tab_bar_bg_start_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("item_tab_bar_bg_end_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12)};
    }

    public CommonCard_Skin_JsonDescriptor() {
        super(CommonCard.Skin.class, f69815a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[1];
        Integer num3 = (Integer) objArr[2];
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        return new CommonCard.Skin(iIntValue2, num2, iIntValue, (Integer) objArr[3], (Integer) objArr[4], (Integer) objArr[5], (String) objArr[6], (String) objArr[7], (Integer) objArr[8], (Integer) objArr[9], (String) objArr[10], (Integer) objArr[11], (Integer) objArr[12]);
    }

    public final Object get(Object obj, int i7) {
        CommonCard.Skin skin = (CommonCard.Skin) obj;
        switch (i7) {
            case 0:
                return Integer.valueOf(skin.f69799a);
            case 1:
                return skin.f69800b;
            case 2:
                return Integer.valueOf(skin.f69801c);
            case 3:
                return skin.f69802d;
            case 4:
                return skin.f69803e;
            case 5:
                return skin.f69804f;
            case 6:
                return skin.f69805g;
            case 7:
                return skin.h;
            case 8:
                return skin.f69806i;
            case 9:
                return skin.f69807j;
            case 10:
                return skin.f69808k;
            case 11:
                return skin.f69809l;
            case 12:
                return skin.f69810m;
            default:
                return null;
        }
    }
}
