package com.bilibili.upper.module.template.fragment;

import NI0.a;
import Xz0.j;
import androidx.viewpager2.widget.ViewPager2;
import bF0.E1;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.template.data.Author;
import com.bilibili.studio.template.data.VideoTemplateBean;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/fragment/f.class */
public final class f extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateDetailFragment f114004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<VideoTemplateBean> f114005b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(TemplateDetailFragment templateDetailFragment, List<? extends VideoTemplateBean> list) {
        this.f114004a = templateDetailFragment;
        this.f114005b = list;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i7) {
        VideoTemplateBean videoTemplateBean;
        super.onPageScrollStateChanged(i7);
        Integer numValueOf = null;
        TemplateDetailFragment templateDetailFragment = this.f114004a;
        if (i7 != 0) {
            if (i7 != 1) {
                return;
            }
            E1 e12 = templateDetailFragment.f113994d;
            if (e12 != null) {
                numValueOf = Integer.valueOf(e12.f54716f.getCurrentItem());
            }
            templateDetailFragment.f113997g = numValueOf.intValue();
            return;
        }
        E1 e13 = templateDetailFragment.f113994d;
        if (e13 == null || e13.f54716f.getCurrentItem() != templateDetailFragment.f113997g) {
            E1 e14 = templateDetailFragment.f113994d;
            boolean z6 = (e14 != null ? Integer.valueOf(e14.f54716f.getCurrentItem()) : null).intValue() > templateDetailFragment.f113997g;
            E1 e15 = templateDetailFragment.f113994d;
            Integer numValueOf2 = null;
            if (e15 != null) {
                numValueOf2 = Integer.valueOf(e15.f54716f.getCurrentItem());
            }
            int iIntValue = numValueOf2.intValue();
            List<VideoTemplateBean> value = templateDetailFragment.nf().f114020b.getValue();
            if (value == null || (videoTemplateBean = (VideoTemplateBean) CollectionsKt.getOrNull(value, iIntValue)) == null) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("template_name", videoTemplateBean.name);
            linkedHashMap.put(EditCustomizeSticker.TAG_TEMPLATE_ID, String.valueOf(videoTemplateBean.id));
            linkedHashMap.put("template_page_from", j.a("template_page_from"));
            linkedHashMap.put("type", z6 ? "up" : "down");
            linkedHashMap.put("track_id", Xz0.g.d());
            Neurons.reportClick(false, "creation.creation-template-selection.detail.slide.click", linkedHashMap);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i7, float f7, int i8) {
        TemplateDetailFragment templateDetailFragment = this.f114004a;
        if (!templateDetailFragment.nf().f114027j) {
            templateDetailFragment.nf().f114027j = true;
        }
        super.onPageScrolled(i7, f7, i8);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        E1 e12;
        VideoTemplateBean videoTemplateBean;
        int size = this.f114005b.size();
        TemplateDetailFragment templateDetailFragment = this.f114004a;
        if (i7 >= size) {
            if (this.f114005b.isEmpty() || (e12 = templateDetailFragment.f113994d) == null) {
                return;
            }
            e12.f54716f.setCurrentItem(this.f114005b.size() - 1);
            return;
        }
        TemplateDetailFragment.jf(templateDetailFragment, i7);
        List<VideoTemplateBean> value = templateDetailFragment.nf().f114020b.getValue();
        if (value != null && (videoTemplateBean = (VideoTemplateBean) CollectionsKt.getOrNull(value, i7)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("first_entrance", j.a("first_entrance"));
            linkedHashMap.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, templateDetailFragment.nf().h);
            linkedHashMap.put("part_name", templateDetailFragment.nf().f114028k);
            linkedHashMap.put("template_name", videoTemplateBean.name);
            linkedHashMap.put(EditCustomizeSticker.TAG_TEMPLATE_ID, String.valueOf(videoTemplateBean.id));
            linkedHashMap.put("template_location", String.valueOf(i7));
            linkedHashMap.put("templates_up_from", EA0.b.h(videoTemplateBean) ? "ugc" : (videoTemplateBean.type == 46 && videoTemplateBean.upFrom == 0) ? "meishe" : EA0.b.g(videoTemplateBean) ? "图文模版" : "未知类型");
            Author author = videoTemplateBean.author;
            linkedHashMap.put("ugc_creator", author != null ? author.getName() : null);
            linkedHashMap.put("template_page_from", j.a("template_page_from"));
            linkedHashMap.put("is_slide", templateDetailFragment.nf().f114027j ? "1" : "0");
            linkedHashMap.put("track_id", Xz0.g.d());
            linkedHashMap.put("subscript", EA0.b.c(videoTemplateBean));
            tw0.f.e("creation.creation-template-selection.detail.0.show", linkedHashMap);
        }
        if (i7 == this.f114005b.size() - 1) {
            Map<Long, a.b> map = NI0.a.f17097a;
            NI0.a.c(templateDetailFragment.nf().I0(), false);
        }
    }
}
