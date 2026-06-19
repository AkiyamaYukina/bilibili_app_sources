package com.bilibili.pegasus.widgets;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.ColorUtils;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.pegasus.PegasusVideoMode;
import com.bilibili.pegasus.PegasusVideoModeService;
import com.bilibili.pegasus.promo.setting.VideoModeConfig;
import com.bilibili.pegasus.promo.setting.VideoModeConfigItem;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/VideoModeSettingView.class */
@StabilityInferred(parameters = 0)
public final class VideoModeSettingView extends TintLinearLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f79204o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final View f79205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final View f79206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TextView f79207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextView f79208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TextView f79209g;

    @NotNull
    public final TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ImageView f79210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ImageView f79211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PegasusVideoMode f79212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f79213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f79214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Animator f79215n;

    @JvmOverloads
    public VideoModeSettingView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public VideoModeSettingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public VideoModeSettingView(Context context, AttributeSet attributeSet, int i7, int i8) {
        List<VideoModeConfigItem> items;
        List<VideoModeConfigItem> items2;
        List<VideoModeConfigItem> items3;
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f79213l = ListExtentionsKt.toPx(59);
        this.f79214m = Yc0.b.a;
        setOrientation(1);
        View viewInflate = LayoutInflater.from(context).inflate(2131496266, (ViewGroup) this, true);
        TextView textView = (TextView) viewInflate.findViewById(2131306052);
        this.f79205c = viewInflate.findViewById(2131303888);
        this.f79206d = viewInflate.findViewById(2131303889);
        this.f79207e = (TextView) viewInflate.findViewById(2131313445);
        this.f79208f = (TextView) viewInflate.findViewById(2131313446);
        this.f79209g = (TextView) viewInflate.findViewById(2131312548);
        this.h = (TextView) viewInflate.findViewById(2131312549);
        this.f79210i = (ImageView) viewInflate.findViewById(2131309878);
        this.f79211j = (ImageView) viewInflate.findViewById(2131309879);
        VideoModeConfig videoModeConfigA = com.bilibili.pegasus.promo.setting.f.a();
        PegasusVideoMode pegasusVideoModeA = Lh.r.a();
        this.f79212k = pegasusVideoModeA;
        setVisibility((videoModeConfigA == null || !videoModeConfigA.isValid() || pegasusVideoModeA == PegasusVideoMode.MODE_DEFAULT) ? 8 : 0);
        setItem1Content((videoModeConfigA == null || (items3 = videoModeConfigA.getItems()) == null) ? null : (VideoModeConfigItem) CollectionsKt.getOrNull(items3, 0));
        setItem2Content((videoModeConfigA == null || (items2 = videoModeConfigA.getItems()) == null) ? null : (VideoModeConfigItem) CollectionsKt.getOrNull(items2, 1));
        textView.setText(videoModeConfigA != null ? videoModeConfigA.getTitle() : null);
        if (videoModeConfigA != null && (items = videoModeConfigA.getItems()) != null) {
            List<VideoModeConfigItem> list = items;
            if ((list instanceof Collection) && list.isEmpty()) {
                this.f79213l = ListExtentionsKt.toPx(44);
            } else {
                for (VideoModeConfigItem videoModeConfigItem : list) {
                    String subTitle = videoModeConfigItem != null ? videoModeConfigItem.getSubTitle() : null;
                    if (subTitle != null && !StringsKt.isBlank(subTitle)) {
                        break;
                    }
                }
                this.f79213l = ListExtentionsKt.toPx(44);
            }
        }
        View view = this.f79205c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = this.f79213l;
        view.setLayoutParams(layoutParams);
        View view2 = this.f79206d;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = this.f79213l;
        view2.setLayoutParams(layoutParams2);
    }

    private final void setItem1Content(final VideoModeConfigItem videoModeConfigItem) {
        if (videoModeConfigItem == null) {
            return;
        }
        this.f79207e.setText(videoModeConfigItem.getTitle());
        TextView textView = this.f79209g;
        String subTitle = videoModeConfigItem.getSubTitle();
        boolean z6 = subTitle == null || StringsKt.isBlank(subTitle);
        if (textView != null) {
            textView.setVisibility(!z6 ? 0 : 8);
        }
        this.f79209g.setText(videoModeConfigItem.getSubTitle());
        if ((videoModeConfigItem.getType() == 1 && com.bilibili.pegasus.l.a(this.f79212k)) || (videoModeConfigItem.getType() == 2 && com.bilibili.pegasus.l.b(this.f79212k))) {
            this.f79210i.setVisibility(0);
        }
        this.f79205c.setOnClickListener(new View.OnClickListener(this, videoModeConfigItem) { // from class: com.bilibili.pegasus.widgets.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoModeSettingView f79272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VideoModeConfigItem f79273b;

            {
                this.f79272a = this;
                this.f79273b = videoModeConfigItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoModeSettingView videoModeSettingView = this.f79272a;
                VideoModeConfigItem videoModeConfigItem2 = this.f79273b;
                int i7 = VideoModeSettingView.f79204o;
                videoModeSettingView.c(videoModeConfigItem2);
                videoModeSettingView.f79211j.setVisibility(8);
                videoModeSettingView.f79210i.setVisibility(0);
            }
        });
    }

    private final void setItem2Content(final VideoModeConfigItem videoModeConfigItem) {
        if (videoModeConfigItem == null) {
            return;
        }
        this.f79208f.setText(videoModeConfigItem.getTitle());
        TextView textView = this.h;
        String subTitle = videoModeConfigItem.getSubTitle();
        boolean z6 = subTitle == null || StringsKt.isBlank(subTitle);
        if (textView != null) {
            textView.setVisibility(!z6 ? 0 : 8);
        }
        this.h.setText(videoModeConfigItem.getSubTitle());
        if ((videoModeConfigItem.getType() == 1 && com.bilibili.pegasus.l.a(this.f79212k)) || (videoModeConfigItem.getType() == 2 && com.bilibili.pegasus.l.b(this.f79212k))) {
            this.f79211j.setVisibility(0);
        }
        this.f79206d.setOnClickListener(new View.OnClickListener(this, videoModeConfigItem) { // from class: com.bilibili.pegasus.widgets.w

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VideoModeSettingView f79274a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final VideoModeConfigItem f79275b;

            {
                this.f79274a = this;
                this.f79275b = videoModeConfigItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoModeSettingView videoModeSettingView = this.f79274a;
                VideoModeConfigItem videoModeConfigItem2 = this.f79275b;
                int i7 = VideoModeSettingView.f79204o;
                videoModeSettingView.c(videoModeConfigItem2);
                videoModeSettingView.f79210i.setVisibility(8);
                videoModeSettingView.f79211j.setVisibility(0);
            }
        });
    }

    public final void c(VideoModeConfigItem videoModeConfigItem) {
        PegasusVideoMode pegasusVideoMode;
        this.f79214m = false;
        d();
        int i7 = 1;
        if (videoModeConfigItem.getType() == 2) {
            pegasusVideoMode = PegasusVideoMode.MODE_USER_STORY;
        } else if (videoModeConfigItem.getType() == 1) {
            pegasusVideoMode = PegasusVideoMode.MODE_USER_AUTO;
            i7 = 2;
        } else {
            i7 = 0;
            pegasusVideoMode = null;
        }
        if (pegasusVideoMode == null || pegasusVideoMode == Lh.r.a()) {
            return;
        }
        PegasusVideoModeService pegasusVideoModeService = (PegasusVideoModeService) BLRouter.get$default(BLRouter.INSTANCE, PegasusVideoModeService.class, (String) null, 2, (Object) null);
        if (pegasusVideoModeService != null) {
            pegasusVideoModeService.setVideoMode(pegasusVideoMode);
        }
        Neurons.reportClick(false, "main.detail-setting-layout.layoutstyle.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("layoutcontent", "play_mode"), TuplesKt.to("layoutstyle", String.valueOf(i7))}));
    }

    public final void d() {
        Animator animator = this.f79215n;
        if (animator != null) {
            animator.removeAllListeners();
        }
        Animator animator2 = this.f79215n;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.f79215n = null;
        this.f79205c.setBackgroundTintList(ColorStateList.valueOf(0));
        this.f79206d.setBackgroundTintList(ColorStateList.valueOf(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.animation.TimeInterpolator, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        BLog.i("[Pegasus]VideoModeSettingView", "onAttachedToWindow");
        if (this.f79214m) {
            final View view = this.f79205c;
            final View view2 = this.f79206d;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 38);
            valueAnimatorOfInt.setDuration(5000L);
            valueAnimatorOfInt.setRepeatCount(-1);
            valueAnimatorOfInt.setInterpolator(new Object());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, view, view2) { // from class: com.bilibili.pegasus.widgets.u

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VideoModeSettingView f79269a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final View f79270b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final View f79271c;

                {
                    this.f79269a = this;
                    this.f79270b = view;
                    this.f79271c = view2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    VideoModeSettingView videoModeSettingView = this.f79269a;
                    View view3 = this.f79270b;
                    View view4 = this.f79271c;
                    if (videoModeSettingView.f79214m) {
                        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        int alphaComponent = ColorUtils.setAlphaComponent(videoModeSettingView.getContext().getResources().getColor(R$color.Pi5), iIntValue & 255);
                        BLog.i("[Pegasus]VideoModeSettingView", "deeper, alpha = " + (iIntValue / 255) + ", color = " + Integer.toHexString(alphaComponent));
                        view3.setBackgroundTintList(ColorStateList.valueOf(alphaComponent));
                        view4.setBackgroundTintList(ColorStateList.valueOf(alphaComponent));
                    }
                }
            });
            valueAnimatorOfInt.start();
            this.f79215n = valueAnimatorOfInt;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BLog.i("[Pegasus]VideoModeSettingView", "onDetachedFromWindow");
        d();
    }
}
