package com.bilibili.ogv.pub.review.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/review/bean/ReviewAuthor_JsonDescriptor.class */
public final class ReviewAuthor_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f71702a = {new PojoPropertyDescriptor(EditCustomizeSticker.TAG_MID, (String[]) null, Long.TYPE, (Class) null, 7), new PojoPropertyDescriptor("uname", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("avatar", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("vip", (String[]) null, UserVip.class, (Class) null, 6)};

    public ReviewAuthor_JsonDescriptor() {
        super(ReviewAuthor.class, f71702a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    public final Object constructWith(Object[] objArr) {
        ?? r10 = false;
        Object obj = objArr[0];
        if (obj == null) {
            r10 = true;
        }
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Object obj2 = objArr[3];
        ?? r11 = r10;
        if (obj2 == null) {
            r11 = (r10 == true ? 1 : 0) | 8;
        }
        UserVip userVip = (UserVip) obj2;
        if (((r11 == true ? 1 : 0) & 1) != 0) {
            jLongValue = 0;
        }
        if (((r11 == true ? 1 : 0) & 8) != 0) {
            userVip = null;
        }
        return new ReviewAuthor(jLongValue, str, str2, userVip);
    }

    public final Object get(Object obj, int i7) {
        ReviewAuthor reviewAuthor = (ReviewAuthor) obj;
        if (i7 == 0) {
            return Long.valueOf(reviewAuthor.f71698a);
        }
        if (i7 == 1) {
            return reviewAuthor.f71699b;
        }
        if (i7 == 2) {
            return reviewAuthor.f71700c;
        }
        if (i7 != 3) {
            return null;
        }
        return reviewAuthor.f71701d;
    }
}
