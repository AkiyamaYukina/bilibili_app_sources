package com.bilibili.ogv.review.detailpage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.review.data.ReviewType;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/v.class */
@StabilityInferred(parameters = 0)
public final class v extends BaseViewHolder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f72420d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public BangumiReviewFragment f72421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public y f72422c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/v$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.ogv.review.detailpage.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/v$a$a.class */
        public static final /* synthetic */ class C0455a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f72423a;

            static {
                int[] iArr = new int[ReviewType.values().length];
                try {
                    iArr[ReviewType.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[ReviewType.SHORT_REVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[ReviewType.LONG_REVIEW.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                f72423a = iArr;
            }
        }

        @NotNull
        public static ReviewType a(int i7) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? ReviewType.ALL : ReviewType.LONG_REVIEW : ReviewType.SHORT_REVIEW : ReviewType.ALL;
        }

        public static int b(@NotNull ReviewType reviewType) {
            int i7 = C0455a.f72423a[reviewType.ordinal()];
            int i8 = 1;
            if (i7 == 1) {
                i8 = 0;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i8 = 2;
            }
            return i8;
        }
    }
}
