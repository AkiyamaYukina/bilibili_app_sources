package com.bilibili.search2.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.api.base.Config;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.crashreport.CrashReporter;
import com.bilibili.lib.image2.view.BiliImageView;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchRankInfoContainer.class */
@StabilityInferred(parameters = 0)
public final class SearchRankInfoContainer extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliImageView f88947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f88948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f88949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f88950d;

    @JvmOverloads
    public SearchRankInfoContainer(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public SearchRankInfoContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public SearchRankInfoContainer(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f88950d = ListExtentionsKt.toPx(11);
        View viewInflate = View.inflate(context, 2131494377, this);
        if (viewInflate != null) {
            this.f88947a = viewInflate.findViewById(2131309833);
            this.f88948b = (TextView) viewInflate.findViewById(2131309853);
            this.f88949c = (ImageView) viewInflate.findViewById(2131309824);
        }
    }

    public static int j0(String str) throws Exception {
        if (str == null) {
            return 0;
        }
        try {
            if (StringsKt.isBlank(str)) {
                return 0;
            }
            return Color.parseColor(str);
        } catch (Exception e7) {
            if (Config.isDebuggable()) {
                throw e7;
            }
            CrashReporter.INSTANCE.postCaughtException(e7);
            return 0;
        }
    }
}
