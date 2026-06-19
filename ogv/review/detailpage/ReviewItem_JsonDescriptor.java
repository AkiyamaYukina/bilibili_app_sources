package com.bilibili.ogv.review.detailpage;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.ogv.review.data.ReviewType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/ReviewItem_JsonDescriptor.class */
public final class ReviewItem_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72300a;

    static {
        Class cls = Long.TYPE;
        f72300a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("oid", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("stat", (String[]) null, ReviewLikeStat.class, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_PROGRESS, (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("type", (String[]) null, ReviewType.class, (Class) null, 7), new PojoPropertyDescriptor("author", (String[]) null, Author.class, (Class) null, 4), new PojoPropertyDescriptor("push_time_str", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("push_time", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("review_id", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("score", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor(TextSource.CFG_CONTENT, (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5)};
    }

    public ReviewItem_JsonDescriptor() {
        super(ReviewItem.class, f72300a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Long l7 = (Long) objArr[0];
        long jLongValue = 0;
        long jLongValue2 = l7 == null ? 0L : l7.longValue();
        ReviewLikeStat reviewLikeStat = (ReviewLikeStat) objArr[1];
        String str = (String) objArr[2];
        Object obj = objArr[3];
        char c7 = obj == null ? '\b' : (char) 0;
        ReviewType reviewType = (ReviewType) obj;
        Author author = (Author) objArr[4];
        String str2 = (String) objArr[5];
        Long l8 = (Long) objArr[6];
        long jLongValue3 = l8 == null ? 0L : l8.longValue();
        Long l9 = (Long) objArr[7];
        if (l9 != null) {
            jLongValue = l9.longValue();
        }
        Integer num = (Integer) objArr[8];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new ReviewItem(jLongValue2, reviewLikeStat, str, (c7 & '\b') != 0 ? ReviewType.SHORT_REVIEW : reviewType, author, str2, jLongValue3, jLongValue, iIntValue, (String) objArr[9], (String) objArr[10], (String) objArr[11]);
    }

    public final Object get(Object obj, int i7) {
        ReviewItem reviewItem = (ReviewItem) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(reviewItem.f72287a);
            case 1:
                return reviewItem.f72288b;
            case 2:
                return reviewItem.f72289c;
            case 3:
                return reviewItem.f72290d;
            case 4:
                return reviewItem.f72291e;
            case 5:
                return reviewItem.f72292f;
            case 6:
                return Long.valueOf(reviewItem.f72293g);
            case 7:
                return Long.valueOf(reviewItem.h);
            case 8:
                return Integer.valueOf(reviewItem.f72294i);
            case 9:
                return reviewItem.f72295j;
            case 10:
                return reviewItem.f72296k;
            case 11:
                return reviewItem.f72297l;
            default:
                return null;
        }
    }
}
