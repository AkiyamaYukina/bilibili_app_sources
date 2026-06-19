package com.bilibili.ogv.misc.timeline;

import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/OgvTimelineFragment$pageViewModel$8.class */
public final /* synthetic */ class OgvTimelineFragment$pageViewModel$8 extends FunctionReferenceImpl implements Function0<Pair<? extends Integer, ? extends Integer>> {
    public OgvTimelineFragment$pageViewModel$8(Object obj) {
        super(0, obj, OgvTimelineFragment.class, "getThemeColor", "getThemeColor()Lkotlin/Pair;", 0);
    }

    public final Pair<Integer, Integer> invoke() {
        OgvTimelineFragment ogvTimelineFragment = (OgvTimelineFragment) ((CallableReference) this).receiver;
        ogvTimelineFragment.getClass();
        Garb curGarb = GarbManager.getCurGarb();
        int colorById = ThemeUtils.getColorById(ogvTimelineFragment.requireContext(), 2131103971);
        int colorById2 = ThemeUtils.getColorById(ogvTimelineFragment.requireContext(), 2131103914);
        if (!curGarb.isPure()) {
            colorById = curGarb.getSecondaryPageColor();
            colorById2 = curGarb.getFontColor();
        }
        return new Pair<>(Integer.valueOf(colorById), Integer.valueOf(colorById2));
    }
}
