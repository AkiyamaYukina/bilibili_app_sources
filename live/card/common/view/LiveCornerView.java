package com.bilibili.live.card.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.infra.log.LiveLogger;
import com.bilibili.bililive.infra.util.app.AppKt;
import com.bilibili.bililive.infra.util.string.StringUtilKt;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.view.BiliImageView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/common/view/LiveCornerView.class */
public final class LiveCornerView extends FrameLayout implements LiveLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final BiliImageView f65140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextView f65141b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/common/view/LiveCornerView$a.class */
    public static final class a extends BaseImageDataSubscriber<DrawableHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LiveCornerView f65142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliImageView f65143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65144c;

        public a(LiveCornerView liveCornerView, BiliImageView biliImageView, String str) {
            this.f65142a = liveCornerView;
            this.f65143b = biliImageView;
            this.f65144c = str;
        }

        public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            LiveCornerView liveCornerView = this.f65142a;
            liveCornerView.setVisibility(8);
            Throwable failureCause = imageDataSource != null ? imageDataSource.getFailureCause() : null;
            LiveLog.Companion companion = LiveLog.Companion;
            String logTag = liveCornerView.getLogTag();
            if (companion.matchLevel(1)) {
                String str = "showCorner fail" == 0 ? "" : "showCorner fail";
                LiveLogDelegate logDelegate = companion.getLogDelegate();
                if (logDelegate != null) {
                    logDelegate.onLog(1, logTag, str, failureCause);
                }
                if (failureCause == null) {
                    BLog.e(logTag, str);
                } else {
                    BLog.e(logTag, str, failureCause);
                }
            }
        }

        public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
            DrawableHolder drawableHolder;
            Drawable drawable;
            if (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null || (drawable = drawableHolder.get()) == null) {
                return;
            }
            LiveCornerView liveCornerView = this.f65142a;
            liveCornerView.setVisibility(0);
            this.f65143b.getGenericProperties().setImage(drawable);
            TextView textView = liveCornerView.f65141b;
            if (textView != null) {
                textView.setText(StringUtilKt.substringWithLimit(this.f65144c, 16));
            }
        }
    }

    @JvmOverloads
    public LiveCornerView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public LiveCornerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public LiveCornerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        LayoutInflater.from(context).inflate(2131494339, (ViewGroup) this, true);
        this.f65140a = findViewById(2131305195);
        this.f65141b = (TextView) findViewById(2131299480);
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        String str3;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            BiliImageView biliImageView = this.f65140a;
            if (biliImageView == null) {
                return;
            }
            BiliImageLoader.INSTANCE.acquire(biliImageView).with(AppKt.dp2px(20.0f), AppKt.dp2px(20.0f)).asDrawable().url(str).submit().subscribe(new a(this, biliImageView, str2));
            return;
        }
        setVisibility(8);
        LiveLog.Companion companion = LiveLog.Companion;
        String logTag = getLogTag();
        if (companion.matchLevel(3)) {
            try {
                str3 = "corner info error: cornerUrl: " + str + "  cornerName: " + str2;
            } catch (Exception e7) {
                BLog.e("LiveLog", "getLogMessage", e7);
                str3 = null;
            }
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            LiveLogDelegate logDelegate = companion.getLogDelegate();
            if (logDelegate != null) {
                LiveLogDelegate.onLog$default(logDelegate, 3, logTag, str4, (Throwable) null, 8, (Object) null);
            }
            BLog.i(logTag, str4);
        }
    }

    @NotNull
    public String getLogTag() {
        return "LiveCornerView";
    }
}
