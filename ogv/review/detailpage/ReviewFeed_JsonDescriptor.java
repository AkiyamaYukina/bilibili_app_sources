package com.bilibili.ogv.review.detailpage;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ogv.pub.community.MediaInfo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewFeed_JsonDescriptor.class */
public final class ReviewFeed_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72286a = {new PojoPropertyDescriptor("id", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("media_info", (String[]) null, MediaInfo.class, (Class) null, 5), new PojoPropertyDescriptor("next_cursor", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("has_next", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("modules", (String[]) null, Types.parameterizedType(List.class, new Type[]{ReviewItem.class}), (Class) null, 23), new PojoPropertyDescriptor("topItem", (String[]) null, ReviewItem.class, (Class) null, 6)};

    public ReviewFeed_JsonDescriptor() {
        super(ReviewFeed.class, f72286a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        MediaInfo mediaInfo = (MediaInfo) objArr[1];
        String str = (String) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Object obj = objArr[4];
        if (obj == null) {
            i7 = 16;
        }
        List list = (List) obj;
        Object obj2 = objArr[5];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 32;
        }
        return new ReviewFeed(iIntValue, mediaInfo, str, zBooleanValue, list, (ReviewItem) obj2, i8);
    }

    public final Object get(Object obj, int i7) {
        ReviewFeed reviewFeed = (ReviewFeed) obj;
        if (i7 == 0) {
            return Integer.valueOf(reviewFeed.f72280a);
        }
        if (i7 == 1) {
            return reviewFeed.f72281b;
        }
        if (i7 == 2) {
            return reviewFeed.f72282c;
        }
        if (i7 == 3) {
            return Boolean.valueOf(reviewFeed.f72283d);
        }
        if (i7 == 4) {
            return reviewFeed.f72284e;
        }
        if (i7 != 5) {
            return null;
        }
        return reviewFeed.a();
    }
}
