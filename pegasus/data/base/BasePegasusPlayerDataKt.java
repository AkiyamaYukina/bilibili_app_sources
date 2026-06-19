package com.bilibili.pegasus.data.base;

import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/base/BasePegasusPlayerDataKt.class */
public final class BasePegasusPlayerDataKt {
    @Nullable
    public static final InlineThreePointPanel.ButtonMeta getFavIcon(@NotNull InlineThreePointPanel inlineThreePointPanel, boolean z6) {
        InlineThreePointPanel.ShareButtonItem shareButtonItem;
        InlineThreePointPanel.ButtonMeta buttonMeta;
        Object next;
        Object next2;
        Object next3;
        List list = inlineThreePointPanel.items;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it.next();
                if (((InlineThreePointPanel.ShareButtonItem) next3).type == 3) {
                    break;
                }
            }
            shareButtonItem = (InlineThreePointPanel.ShareButtonItem) next3;
        } else {
            shareButtonItem = null;
        }
        if (z6) {
            buttonMeta = null;
            if (shareButtonItem != null) {
                List list2 = shareButtonItem.buttonMetas;
                buttonMeta = null;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    do {
                        next2 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.areEqual(((InlineThreePointPanel.ButtonMeta) next2).status, "collected"));
                    buttonMeta = (InlineThreePointPanel.ButtonMeta) next2;
                }
            }
        } else {
            buttonMeta = null;
            if (shareButtonItem != null) {
                List list3 = shareButtonItem.buttonMetas;
                buttonMeta = null;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    do {
                        next = null;
                        if (!it3.hasNext()) {
                            break;
                        }
                        next = it3.next();
                    } while (!Intrinsics.areEqual(((InlineThreePointPanel.ButtonMeta) next).status, "collect"));
                    buttonMeta = (InlineThreePointPanel.ButtonMeta) next;
                }
            }
        }
        return buttonMeta;
    }

    @Nullable
    public static final InlineThreePointPanel.ButtonMeta getSpeedSetIcon(@NotNull InlineThreePointPanel inlineThreePointPanel, float f7) {
        Object next;
        Object next2;
        String str;
        String strL;
        Float floatOrNull;
        float f8 = f7;
        if (f7 <= 0.0f) {
            f8 = 1.0f;
        }
        List list = inlineThreePointPanel.items;
        InlineThreePointPanel.ButtonMeta buttonMeta = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InlineThreePointPanel.ShareButtonItem) next).type == 4) {
                    break;
                }
            }
            InlineThreePointPanel.ShareButtonItem shareButtonItem = (InlineThreePointPanel.ShareButtonItem) next;
            buttonMeta = null;
            if (shareButtonItem != null) {
                List list2 = shareButtonItem.buttonMetas;
                buttonMeta = null;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    do {
                        next2 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next2 = it2.next();
                        str = ((InlineThreePointPanel.ButtonMeta) next2).status;
                    } while (((str == null || (strL = StringsKt.L(str, "x", "")) == null || (floatOrNull = StringsKt.toFloatOrNull(strL)) == null) ? -1.0f : floatOrNull.floatValue()) != f8);
                    buttonMeta = (InlineThreePointPanel.ButtonMeta) next2;
                }
            }
        }
        return buttonMeta;
    }
}
