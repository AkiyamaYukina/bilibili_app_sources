package com.bilibili.upper.module.cover_v2.ui;

import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import com.google.android.material.tabs.TabLayout;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/k.class */
public final class k implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverMenuFragment f112965a;

    public k(MultiCoverMenuFragment multiCoverMenuFragment) {
        this.f112965a = multiCoverMenuFragment;
    }

    public final void onTabReselected(TabLayout.Tab tab) {
    }

    public final void onTabSelected(TabLayout.Tab tab) {
        KH0.i iVarJf;
        KH0.f fVar;
        MultiCoverDraft multiCoverDraft;
        if (tab.getPosition() == 0) {
            Neurons.reportClick(false, "creation.publish.cover-service.6.click", new LinkedHashMap());
        } else if (tab.getPosition() == 1) {
            MultiCoverMenuFragment multiCoverMenuFragment = this.f112965a;
            KH0.i iVarJf2 = multiCoverMenuFragment.jf();
            List<CaptionInfo> captionList = (iVarJf2 == null || (multiCoverDraft = iVarJf2.f12747e) == null) ? null : multiCoverDraft.getCaptionList();
            if ((captionList == null || captionList.isEmpty()) && (iVarJf = multiCoverMenuFragment.jf()) != null && (fVar = iVarJf.f12753l) != null) {
                final int i7 = 0;
                fVar.a(new Function1(i7) { // from class: com.bilibili.upper.module.cover_v2.ui.j

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f112964a;

                    {
                        this.f112964a = i7;
                    }

                    public final Object invoke(Object obj) {
                        switch (this.f112964a) {
                            case 0:
                                ((KH0.b) obj).e(null, false);
                                return Unit.INSTANCE;
                            default:
                                return Boolean.FALSE;
                        }
                    }
                });
            }
        }
        int i8 = SH0.b.f22895a;
        SH0.b.f22895a = tab.getPosition();
    }

    public final void onTabUnselected(TabLayout.Tab tab) {
    }
}
