package com.bilibili.ogv.review.detailpage;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.bilibili.ogv.review.data.ReviewType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/j.class */
@StabilityInferred(parameters = 0)
public final class j extends BaseViewHolder implements View.OnClickListener {
    public static final int h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BangumiReviewFragment f72356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f72358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final FragmentManager f72359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f72360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f72361g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/j$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f72362a;

        static {
            int[] iArr = new int[ReviewType.values().length];
            try {
                iArr[ReviewType.SHORT_REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ReviewType.LONG_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f72362a = iArr;
        }
    }

    public j(@NotNull View view, @Nullable b bVar, @NotNull BangumiReviewFragment bangumiReviewFragment, @NotNull String str, @NotNull Map map, @NotNull FragmentManager fragmentManager, int i7, @NotNull String str2) {
        super(view, bVar);
        this.f72356b = bangumiReviewFragment;
        this.f72357c = str;
        this.f72358d = map;
        this.f72359e = fragmentManager;
        this.f72360f = i7;
        this.f72361g = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
    }
}
