package com.bilibili.tgwt.player.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.AnimationListener;
import com.bilibili.lib.image2.bean.BiliAnimatable;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/a.class */
@StabilityInferred(parameters = 0)
public final class a extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f111791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BiliImageView f111792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f111793c;

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/a$a.class */
    @StabilityInferred(parameters = 0)
    public static final class C1221a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f111794a;

        public C1221a() {
            this("");
        }

        public C1221a(@NotNull String str) {
            this.f111794a = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/a$b.class */
    public static final class b implements ImageLoadingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f111795a;

        public b(a aVar) {
            this.f111795a = aVar;
        }

        public final void onImageLoadFailed(Throwable th) {
            a aVar = this.f111795a;
            AbsFunctionWidgetService absFunctionWidgetService = aVar.f111791a;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            absFunctionWidgetService2.hideWidget(aVar.getToken());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/a$c.class */
    public static final class c implements AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f111796a;

        public c(a aVar) {
            this.f111796a = aVar;
        }

        public final void onAnimationLastFrame(BiliAnimatable biliAnimatable) {
            a aVar = this.f111796a;
            AbsFunctionWidgetService absFunctionWidgetService = aVar.f111791a;
            AbsFunctionWidgetService absFunctionWidgetService2 = absFunctionWidgetService;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService2 = null;
            }
            absFunctionWidgetService2.hideWidget(aVar.getToken());
        }

        public final void onAnimationStart(BiliAnimatable biliAnimatable) {
        }

        public final void onAnimationStop(BiliAnimatable biliAnimatable) {
        }
    }

    public a(@NotNull Context context) {
        super(context);
        this.f111793c = "PgcChatVoiceModeEmoteAnimFunctionWidget";
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(2131500202, (ViewGroup) null, false);
        this.f111792b = viewInflate.findViewById(2131304204);
        return viewInflate;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builder = new FunctionWidgetConfig.Builder();
        builder.dismissWhenActivityStop(true);
        builder.dismissWhenScreenModeChange(true);
        builder.dismissWhenVideoChange(true);
        builder.dismissWhenVideoCompleted(true);
        builder.persistent(true);
        return builder.build();
    }

    @NotNull
    public final String getTag() {
        return this.f111793c;
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration instanceof C1221a) {
            ImageView imageView = this.f111792b;
            ImageView imageView2 = imageView;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivEmote");
                imageView2 = null;
            }
            ImageRequestBuilder imageRequestBuilderAnimationListener = BiliImageLoader.INSTANCE.with(imageView2.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(((C1221a) configuration).f111794a).imageLoadingListener(new b(this)).enableAnimate(true, Boolean.FALSE).enableAutoPlayAnimation(true, false).animationPlayLoopCount(1).animationListener(new c(this));
            BiliImageView biliImageView = this.f111792b;
            if (biliImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivEmote");
                biliImageView = null;
            }
            imageRequestBuilderAnimationListener.into(biliImageView);
        }
    }

    public final void onRelease() {
    }
}
