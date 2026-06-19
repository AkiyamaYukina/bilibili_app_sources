package com.bilibili.upper.module.cover_v2.ui.template;

import Jf1.h;
import android.view.View;
import android.view.ViewGroup;
import bF0.N3;
import bG0.g;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverTemplate;
import com.bilibili.upper.module.cover_v2.ui.template.MultiCoverTemplateListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/template/MultiCoverTemplateListFragment$initView$1$1.class */
final /* synthetic */ class MultiCoverTemplateListFragment$initView$1$1 extends FunctionReferenceImpl implements Function3<View, MultiCoverTemplate, Integer, Unit> {
    public MultiCoverTemplateListFragment$initView$1$1(Object obj) {
        super(3, obj, MultiCoverTemplateListFragment.class, "onBindTemplateView", "onBindTemplateView(Landroid/view/View;Lcom/bilibili/upper/module/cover_v2/model/template/MultiCoverTemplate;I)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((View) obj, (MultiCoverTemplate) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(View view, MultiCoverTemplate multiCoverTemplate, int i7) {
        MultiCoverTemplateListFragment multiCoverTemplateListFragment = (MultiCoverTemplateListFragment) ((CallableReference) this).receiver;
        MultiCoverTemplateListFragment.a aVar = MultiCoverTemplateListFragment.f112981g;
        multiCoverTemplateListFragment.getClass();
        N3 n3Bind = N3.bind(view);
        int iD = (h.d(multiCoverTemplateListFragment.requireContext()) - h.b(52.0f)) / 3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (((double) iD) * 0.625d);
        view.setLayoutParams(layoutParams);
        String coverUrl = multiCoverTemplate.getCoverUrl();
        if (coverUrl != null && !Intrinsics.areEqual(coverUrl, view.getTag())) {
            BiliImageLoader.INSTANCE.with(multiCoverTemplateListFragment.requireContext()).url(coverUrl).into(n3Bind.f54994c);
            view.setTag(multiCoverTemplate.getCoverUrl());
        }
        if (multiCoverTemplate.isDownloading()) {
            g.c(n3Bind.f54995d, true);
            LottieAnimationView lottieAnimationView = n3Bind.f54995d;
            lottieAnimationView.setAnimation("cover_lottie_loading.json");
            lottieAnimationView.playAnimation();
            n3Bind.f54996e.setVisibility(8);
        } else if (multiCoverTemplate.isFailed()) {
            n3Bind.f54995d.cancelAnimation();
            n3Bind.f54995d.setVisibility(8);
            g.c(n3Bind.f54996e, true);
            n3Bind.f54996e.setImageResource(2131242522);
        } else if (multiCoverTemplate.isDownloaded()) {
            n3Bind.f54995d.cancelAnimation();
            n3Bind.f54995d.setVisibility(8);
            n3Bind.f54996e.setVisibility(8);
        } else {
            n3Bind.f54995d.cancelAnimation();
            n3Bind.f54995d.setVisibility(8);
            g.c(n3Bind.f54996e, true);
            n3Bind.f54996e.setImageResource(2131242521);
        }
        view.setSelected(multiCoverTemplate.getId() == multiCoverTemplateListFragment.f112985e);
        n3Bind.f54993b.setSelected(multiCoverTemplate.getId() == multiCoverTemplateListFragment.f112985e);
    }
}
