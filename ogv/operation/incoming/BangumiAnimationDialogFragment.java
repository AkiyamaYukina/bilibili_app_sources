package com.bilibili.ogv.operation.incoming;

import Ak0.d;
import G.p;
import Lk0.c;
import Lk0.g;
import Nl0.h;
import Nl0.i;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.infra.account.a;
import com.bilibili.ogv.infra.util.e;
import com.bilibili.ogv.opbase.BangumiFragmentAnimStoreVo;
import com.bilibili.ogv.opbase.InComing;
import com.bilibili.ogv.operation.incoming.BangumiAnimationDialogFragment;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.JsonParseException;
import com.opensource.svgaplayer.SVGAImageView;
import com.opensource.svgaplayer.SVGAParser;
import j5.C7642d;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/incoming/BangumiAnimationDialogFragment.class */
@StabilityInferred(parameters = 0)
public final class BangumiAnimationDialogFragment extends DialogFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ImageView f70204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public StaticImageView2 f70205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public SVGAImageView f70206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public FrameLayout f70207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ConstraintLayout f70208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ConstraintLayout f70209g;

    @Nullable
    public Rect h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public InComing f70210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public SVGAParser f70211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f70212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f70213l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f70215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f70216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f70217p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f70214m = "fade";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f70218q = true;

    public static final void hf(BangumiAnimationDialogFragment bangumiAnimationDialogFragment, String str) {
        BangumiFragmentAnimStoreVo bangumiFragmentAnimStoreVo;
        bangumiAnimationDialogFragment.getClass();
        String strValueOf = String.valueOf(a.f67852b.mid());
        String strA = p.a(strValueOf, str);
        String strHex = ByteString.Companion.encodeUtf8(strA).md5().hex();
        Lazy lazy = i.f17294a;
        try {
            bangumiFragmentAnimStoreVo = (BangumiFragmentAnimStoreVo) JsonUtilKt.parseJson((String) i.a("tab_resource_anim_" + strHex, ""), new d().getType());
        } catch (JsonParseException e7) {
            e.b(e7);
            bangumiFragmentAnimStoreVo = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (bangumiFragmentAnimStoreVo == null) {
            bangumiFragmentAnimStoreVo = new BangumiFragmentAnimStoreVo();
            bangumiFragmentAnimStoreVo.f69673a = Long.valueOf(jCurrentTimeMillis);
            bangumiFragmentAnimStoreVo.f69674b = Long.valueOf(jCurrentTimeMillis);
            bangumiFragmentAnimStoreVo.f69675c = 1;
        } else {
            bangumiFragmentAnimStoreVo.f69674b = Long.valueOf(jCurrentTimeMillis);
            bangumiFragmentAnimStoreVo.f69675c++;
        }
        String strHex2 = ByteString.Companion.encodeUtf8(strA).md5().hex();
        String json = JsonUtilKt.toJson(bangumiFragmentAnimStoreVo);
        Lazy lazy2 = i.f17294a;
        i.c("tab_resource_anim_" + strHex2, json);
        String strA2 = p.a(bangumiAnimationDialogFragment.f70213l, strValueOf);
        if (jCurrentTimeMillis <= 0) {
            return;
        }
        i.c(C4496a.a("tab_resource_anim_", strA2), Long.valueOf(jCurrentTimeMillis));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f70217p = jCurrentTimeMillis;
        long j7 = this.f70216o;
        long j8 = jCurrentTimeMillis - j7;
        long j9 = 0;
        if (j7 > 0 && jCurrentTimeMillis > 0 && j8 > 0 && (str = this.f70212k) != null && str.length() != 0) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            InComing inComing = this.f70210i;
            mapCreateMapBuilder.put("tab_id", String.valueOf(inComing != null ? Long.valueOf(inComing.f69849e) : null));
            InComing inComing2 = this.f70210i;
            mapCreateMapBuilder.put("page_id", String.valueOf(inComing2 != null ? inComing2.f69850f : null));
            InComing inComing3 = this.f70210i;
            mapCreateMapBuilder.put("item_id", String.valueOf(inComing3 != null ? Long.valueOf(inComing3.f69851g) : null));
            mapCreateMapBuilder.put("type", this.f70214m);
            mapCreateMapBuilder.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(j8));
            Neurons.reportExposure$default(false, android.support.v4.media.a.a("pgc.", this.f70212k, ".pop.0.show"), MapsKt.build(mapCreateMapBuilder), (List) null, 8, (Object) null);
        }
        long j10 = this.f70216o;
        if (j10 > 0) {
            j9 = this.f70217p - j10;
        }
        Pair pair = TuplesKt.to(EditCustomizeSticker.TAG_DURATION, String.valueOf(j9));
        Pair pair2 = TuplesKt.to("close_type", this.f70214m);
        InComing inComing4 = this.f70210i;
        Long lValueOf = null;
        if (inComing4 != null) {
            lValueOf = Long.valueOf(inComing4.f69849e);
        }
        HashMap mapHashMapOf = MapsKt.hashMapOf(new Pair[]{pair, pair2, TuplesKt.to("tab_id", String.valueOf(lValueOf))});
        Neurons neurons = Neurons.INSTANCE;
        Tj0.a.b("ogv.incoming_animation_show.report", mapHashMapOf);
        super.dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final void m7492if() {
        if (getView() != null) {
            if (this.h == null) {
                dismissAllowingStateLoss();
                return;
            }
            if (this.f70215n) {
                return;
            }
            ImageView imageView = this.f70204b;
            if (imageView != null) {
                imageView.setOnClickListener(null);
            }
            FrameLayout frameLayout = this.f70207e;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(null);
            }
            this.f70215n = true;
            float width = r0.getWidth() / 2.0f;
            float height = r0.getHeight() / 2.0f;
            Rect rect = this.h;
            int i7 = rect.right;
            int i8 = rect.left;
            int i9 = rect.bottom;
            int i10 = rect.top;
            float f7 = i8;
            float f8 = (i7 - i8) / 2;
            float f9 = i10;
            float f10 = (i9 - i10) / 2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(240L);
            final float f11 = (f7 - width) + f8;
            final float f12 = ((f9 - height) + f10) - 30;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, f11, f12) { // from class: Lk0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiAnimationDialogFragment f14724a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final float f14725b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final float f14726c;

                {
                    this.f14724a = this;
                    this.f14725b = f11;
                    this.f14726c = f12;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ConstraintLayout constraintLayout;
                    BangumiAnimationDialogFragment bangumiAnimationDialogFragment = this.f14724a;
                    float f13 = this.f14725b;
                    float f14 = this.f14726c;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    float f15 = 1 - animatedFraction;
                    ConstraintLayout constraintLayout2 = bangumiAnimationDialogFragment.f70208f;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setScaleX(f15);
                    }
                    ConstraintLayout constraintLayout3 = bangumiAnimationDialogFragment.f70208f;
                    if (constraintLayout3 != null) {
                        constraintLayout3.setScaleY(f15);
                    }
                    ConstraintLayout constraintLayout4 = bangumiAnimationDialogFragment.f70208f;
                    if (constraintLayout4 != null) {
                        constraintLayout4.setTranslationX(f13 * animatedFraction);
                    }
                    ConstraintLayout constraintLayout5 = bangumiAnimationDialogFragment.f70208f;
                    if (constraintLayout5 != null) {
                        constraintLayout5.setTranslationY(animatedFraction * f14);
                    }
                    if (f15 <= 0.1d || (constraintLayout = bangumiAnimationDialogFragment.f70209g) == null) {
                        return;
                    }
                    constraintLayout.setAlpha(f15);
                }
            });
            valueAnimatorOfFloat.addListener(new c(this));
            valueAnimatorOfFloat.start();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        SVGAImageView sVGAImageView;
        SVGAImageView sVGAImageView2;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2131302903) {
            this.f70214m = "close";
            this.f70218q = false;
            SVGAImageView sVGAImageView3 = this.f70206d;
            if (sVGAImageView3 != null && sVGAImageView3.isAnimating() && (sVGAImageView2 = this.f70206d) != null) {
                sVGAImageView2.stopAnimation();
            }
            dismissAllowingStateLoss();
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2131303460) {
            this.f70214m = "click";
            this.f70218q = false;
            InComing inComing = this.f70210i;
            if (inComing != null && inComing.f69848d == 1) {
                SVGAImageView sVGAImageView4 = this.f70206d;
                if (sVGAImageView4 != null && sVGAImageView4.isAnimating() && (sVGAImageView = this.f70206d) != null) {
                    sVGAImageView.stopAnimation();
                }
                m7492if();
                return;
            }
            if (inComing == null || inComing.f69848d != 2) {
                return;
            }
            Context context = view.getContext();
            InComing inComing2 = this.f70210i;
            h.c(context, inComing2 != null ? inComing2.h : null, 0, SearchBangumiItem.TYPE_FULLNET_VARIETY, null);
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.requestFeature(1);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: Lk0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiAnimationDialogFragment f14723a;

                {
                    this.f14723a = this;
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
                    boolean z6;
                    BangumiAnimationDialogFragment bangumiAnimationDialogFragment = this.f14723a;
                    if (i7 == 4) {
                        bangumiAnimationDialogFragment.f70214m = "close";
                        bangumiAnimationDialogFragment.dismissAllowingStateLoss();
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    return z6;
                }
            });
        }
        return layoutInflater.inflate(2131501210, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        Window window2;
        Window window3;
        Window window4;
        super.onStart();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams attributes = (dialog == null || (window4 = dialog.getWindow()) == null) ? null : window4.getAttributes();
        if (attributes != null) {
            attributes.gravity = 17;
        }
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window3 = dialog2.getWindow()) != null) {
            window3.setLayout(-1, -1);
        }
        if (attributes != null) {
            attributes.dimAmount = 0.0f;
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window2 = dialog3.getWindow()) != null) {
            C7642d.a(window2, 0);
        }
        Dialog dialog4 = getDialog();
        if (dialog4 == null || (window = dialog4.getWindow()) == null) {
            return;
        }
        window.setAttributes(attributes);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f70205c = view.findViewById(2131312064);
        this.f70206d = view.findViewById(2131312739);
        this.f70207e = (FrameLayout) view.findViewById(2131303460);
        this.f70204b = (ImageView) view.findViewById(2131302903);
        this.f70209g = (ConstraintLayout) view.findViewById(2131298805);
        this.f70208f = (ConstraintLayout) view.findViewById(2131296770);
        ConstraintLayout constraintLayout = this.f70209g;
        if (constraintLayout != null) {
            constraintLayout.setBackground(new ColorDrawable(1711276032));
        }
        InComing inComing = this.f70210i;
        if (inComing != null) {
            String str = inComing.f69845a;
            if (str.length() > 0) {
                StaticImageView2 staticImageView2 = this.f70205c;
                if (staticImageView2 != null) {
                    staticImageView2.setVisibility(8);
                }
                SVGAImageView sVGAImageView = this.f70206d;
                if (sVGAImageView != null) {
                    sVGAImageView.setVisibility(0);
                }
                if (this.f70211j == null) {
                    this.f70211j = new SVGAParser(requireContext());
                }
                this.f70211j.parse(new URL(str), new Lk0.d(this, inComing));
                SVGAImageView sVGAImageView2 = this.f70206d;
                if (sVGAImageView2 != null) {
                    sVGAImageView2.setCallback(new Lk0.e(this));
                }
            } else {
                String str2 = inComing.f69846b;
                if (str2.length() > 0) {
                    StaticImageView2 staticImageView22 = this.f70205c;
                    if (staticImageView22 != null) {
                        staticImageView22.setVisibility(0);
                    }
                    SVGAImageView sVGAImageView3 = this.f70206d;
                    if (sVGAImageView3 != null) {
                        sVGAImageView3.setVisibility(8);
                    }
                    StaticImageView2 staticImageView23 = this.f70205c;
                    if (staticImageView23 != null) {
                        BiliImageLoader.INSTANCE.with(staticImageView23.getContext()).thumbnailUrlTransformStrategy(ThumbUrlTransformStrategyUtils.stylingStrategy$default("common-ogv", (IThumbnailSizeController) null, 2, (Object) null)).url(str2).imageLoadingListener(new g(this, inComing)).into(staticImageView23);
                    }
                } else {
                    dismissAllowingStateLoss();
                }
            }
        }
        ImageView imageView = this.f70204b;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        FrameLayout frameLayout = this.f70207e;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
    }
}
