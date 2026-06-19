package com.bilibili.ship.theseus.united.page.story;

import com.bilibili.ship.theseus.united.di.BusinessType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/e.class */
public final class e {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/story/e$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f103086a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.CHEESE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BusinessType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BusinessType.UGC.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f103086a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final String a(BusinessType businessType) throws NoWhenBranchMatchedException {
        String str;
        int i7 = a.f103086a[businessType.ordinal()];
        if (i7 == 1) {
            str = "vertical_course";
        } else if (i7 == 2) {
            str = "vertical_pgc";
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "vertical_av";
        }
        return str;
    }
}
