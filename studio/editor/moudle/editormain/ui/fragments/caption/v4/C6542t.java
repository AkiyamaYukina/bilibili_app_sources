package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import ak0.C3230b;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6560n;
import dx0.InterfaceC6890a;
import fk0.C7117a;
import fk0.C7119c;
import it0.C7615a;
import java.util.Map;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ml0.InterfaceC8012c;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/t.class */
public final class C6542t implements InterfaceC6890a, InterfaceC8012c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f106629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f106630b;

    public C6542t(BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment, CaptionListItem captionListItem) {
        this.f106629a = biliEditorCaptionFontV4Fragment;
        this.f106630b = captionListItem;
    }

    public C6542t(final C7119c c7119c, final C7615a c7615a, final Map map, final KomponentScope komponentScope, final boolean z6) {
        this.f106629a = new C7117a(0, c7615a, map, c7119c, komponentScope);
        this.f106630b = new ExposureEntry(C3230b.f31310a, new Function0(c7119c, c7615a, map, komponentScope, z6) { // from class: fk0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C7615a f118416a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f118417b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Map f118418c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final C7119c f118419d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final KomponentScope f118420e;

            {
                this.f118416a = c7615a;
                this.f118417b = z6;
                this.f118418c = map;
                this.f118419d = c7119c;
                this.f118420e = komponentScope;
            }

            public final Object invoke() {
                Function0 onExposure;
                Map<String, String> map2 = this.f118418c;
                ExposureEntry exposureEntry = (ExposureEntry) this.f118416a.f122206b;
                if (exposureEntry != null && (onExposure = exposureEntry.getOnExposure()) != null) {
                    onExposure.invoke();
                }
                if (this.f118417b && !map2.isEmpty()) {
                    this.f118419d.f118421a.a(this.f118420e, 1, map2);
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // dx0.InterfaceC6890a
    public void c(CaptionListItem captionListItem) {
        BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment = (BiliEditorCaptionFontV4Fragment) this.f106629a;
        if (biliEditorCaptionFontV4Fragment.lf()) {
            C6541s c6541s = biliEditorCaptionFontV4Fragment.f106488i;
            if (c6541s != null) {
                c6541s.notifyDataSetChanged();
            }
            C6560n c6560n = (C6560n) biliEditorCaptionFontV4Fragment.f106492m.getValue();
            c6560n.getClass();
            String assetPath = captionListItem.getAssetPath();
            c6560n.f106720d.l(captionListItem.getId(), assetPath, false);
            BiliEditorCaptionBaseFragment.of((CaptionListItem) this.f106630b, "caption_font");
        }
    }

    @Override // ml0.InterfaceC8012c
    public ExposureEntry e() {
        return (ExposureEntry) this.f106630b;
    }

    @Override // ml0.InterfaceC8012c
    public Function0 getOnClick() {
        return (C7117a) this.f106629a;
    }

    @Override // dx0.InterfaceC6890a
    public void onCancel() {
        BiliEditorCaptionFontV4Fragment biliEditorCaptionFontV4Fragment = (BiliEditorCaptionFontV4Fragment) this.f106629a;
        if (biliEditorCaptionFontV4Fragment.lf()) {
            C6541s c6541s = biliEditorCaptionFontV4Fragment.f106488i;
            if (c6541s != null) {
                c6541s.notifyDataSetChanged();
            }
            BiliEditorCaptionBaseFragment.mf((CaptionListItem) this.f106630b, "caption_font");
        }
    }
}
