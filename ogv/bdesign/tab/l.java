package com.bilibili.ogv.bdesign.tab;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.ogv.activity.dialog.OgvActivityImageDialog;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.BiliEditorCaptionFontV4Fragment;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6541s;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6542t;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6560n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/tab/l.class */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f67476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f67477c;

    public /* synthetic */ l(int i7, Object obj, Object obj2) {
        this.f67475a = i7;
        this.f67476b = obj;
        this.f67477c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67475a) {
            case 0:
                List list = (List) this.f67477c;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1199562609, iIntValue, -1, "com.bilibili.ogv.bdesign.tab.XXScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (XXScrollableTabRow.kt:150)");
                    }
                    ((Function3) this.f67476b).invoke(list, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                CaptionListItem captionListItem = (CaptionListItem) obj2;
                Iterable<CaptionListItem> iterable = ((C6541s) this.f67476b).f54261a;
                if (iterable != null) {
                    for (CaptionListItem captionListItem2 : iterable) {
                        captionListItem2.setSelected(Intrinsics.areEqual(captionListItem2, captionListItem));
                    }
                }
                BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment = (BiliEditorCaptionFontV4Fragment) this.f67477c;
                C6541s c6541s = biliEditorCaptionFontV4Fragment.f106488i;
                if (c6541s != null) {
                    c6541s.notifyDataSetChanged();
                }
                BiliEditorCaptionBaseFragment.nf(captionListItem, "caption_font");
                ((C6560n) biliEditorCaptionFontV4Fragment.f106492m.getValue()).f106719c.f17486a.e(captionListItem, new C6542t(biliEditorCaptionFontV4Fragment, captionListItem));
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(364908727, iIntValue2, -1, "com.bilibili.ship.theseus.ogv.activity.dialog.OgvActivityImageDialog.<anonymous>.<anonymous> (OgvActivityImageDialog.kt:59)");
                    }
                    ThemeStrategy themeStrategy = ThemeStrategy.ForceDay;
                    final ExposureEntry exposureEntry = (ExposureEntry) this.f67477c;
                    final OgvActivityImageDialog ogvActivityImageDialog = (OgvActivityImageDialog) this.f67476b;
                    BiliThemeKt.BiliTheme(themeStrategy, false, ComposableLambdaKt.rememberComposableLambda(-1278453761, true, new Function2(ogvActivityImageDialog, exposureEntry) { // from class: com.bilibili.ship.theseus.ogv.activity.dialog.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final OgvActivityImageDialog f91550a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final ExposureEntry f91551b;

                        {
                            this.f91550a = ogvActivityImageDialog;
                            this.f91551b = exposureEntry;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
                            /*
                                Method dump skipped, instruction units count: 307
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.dialog.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer2, 54), composer2, 390, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
