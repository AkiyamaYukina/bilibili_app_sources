package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import UC0.c;
import android.os.Handler;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6547a;
import dx0.InterfaceC6890a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/d.class */
public final class C6527d implements InterfaceC6890a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliEditorCaptionAnimationListV4Fragment f106615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptionListItem f106616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gx0.a f106617c;

    public C6527d(BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4Fragment, CaptionListItem captionListItem, gx0.a aVar) {
        this.f106615a = biliEditorCaptionAnimationListV4Fragment;
        this.f106616b = captionListItem;
        this.f106617c = aVar;
    }

    @Override // dx0.InterfaceC6890a
    public final void c(CaptionListItem captionListItem) {
        BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4Fragment = this.f106615a;
        if (biliEditorCaptionAnimationListV4Fragment.lf()) {
            CaptionListItem captionListItem2 = this.f106616b;
            captionListItem2.setDownloaded(true);
            biliEditorCaptionAnimationListV4Fragment.uf(captionListItem2);
            C6526c c6526c = biliEditorCaptionAnimationListV4Fragment.f106467l;
            if (c6526c != null) {
                c6526c.notifyDataSetChanged();
            }
            C6547a c6547aRf = biliEditorCaptionAnimationListV4Fragment.rf();
            gx0.a aVar = this.f106617c;
            com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar = c6547aRf.f106698d;
            Ny0.c cVar = bVar.f107164l;
            if (cVar.b("onSetAnim")) {
                CaptionInfo captionInfo = cVar.f17480f;
                if (captionInfo.captionAssetBean == null) {
                    captionInfo.captionAssetBean = new CaptionAssetBean();
                }
                int i7 = aVar.i;
                int i8 = aVar.c;
                int i9 = aVar.f;
                int i10 = i7;
                if (i7 < 0) {
                    i10 = 0;
                }
                int i11 = i8;
                if (i8 < 0) {
                    i11 = 0;
                }
                int i12 = i9;
                if (i9 < 0) {
                    i12 = 0;
                }
                CaptionInfo captionInfo2 = cVar.f17480f;
                int i13 = aVar.h;
                captionInfo2.circleAnimId = i13;
                int i14 = aVar.b;
                captionInfo2.inAnimId = i14;
                int i15 = aVar.e;
                captionInfo2.outAnimId = i15;
                CaptionAssetBean captionAssetBean = captionInfo2.captionAssetBean;
                if (captionAssetBean != null) {
                    captionAssetBean.captionAnimationPackagePath = aVar.j;
                }
                if (captionAssetBean != null) {
                    captionAssetBean.captionInAnimationPackagePath = aVar.d;
                }
                if (captionAssetBean != null) {
                    captionAssetBean.captionOutAnimationPackagePath = aVar.g;
                }
                captionInfo2.circleAnimDuration = i10;
                captionInfo2.inAnimDuration = i11;
                captionInfo2.outAnimDuration = i12;
                c.a aVar2 = UC0.c.f24618e;
                P50.p pVar = captionInfo2.timelineCaption;
                aVar2.getClass();
                if (captionAssetBean != null && pVar != null) {
                    c.a.c(captionAssetBean, pVar, i10);
                    c.a.d(captionAssetBean, pVar, i11);
                    c.a.e(captionAssetBean, pVar, i12);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("in_animation_id", String.valueOf(i14));
                    linkedHashMap.put("out_animation_id", String.valueOf(i15));
                    linkedHashMap.put("animation_id", String.valueOf(i13));
                    pVar.addStatsExtraInfo(linkedHashMap);
                }
                CaptionInfo captionInfo3 = cVar.f17480f;
                P50.p pVar2 = captionInfo3.timelineCaption;
                if (pVar2 != null) {
                    com.bilibili.studio.videoeditor.extension.h.c(pVar2, "caption_info", captionInfo3);
                }
                CaptionInfo captionInfo4 = cVar.f17480f;
                if (!bVar.f107169q.f27447g) {
                    int i16 = aVar.k;
                    int i17 = captionInfo4.circleAnimDuration;
                    int i18 = captionInfo4.inAnimDuration;
                    int i19 = captionInfo4.outAnimDuration;
                    Ny0.n nVar = bVar.h;
                    Ly0.t tVar = nVar.f17525b;
                    P50.p pVar3 = tVar.f14993o;
                    if (pVar3 == null) {
                        BLog.e("EditorCaptionSettingPlayUseCase", "mRunSeekCurrCaption: mCurrTimelineCaption cant be null");
                    } else {
                        tVar.f14996r = true;
                        Handler handler = nVar.f17526c;
                        handler.removeCallbacks(nVar.f17529f);
                        Ref.LongRef longRef = new Ref.LongRef();
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        Ref.LongRef longRef3 = new Ref.LongRef();
                        if (i16 == 0) {
                            longRef.element = pVar3.getInPoint();
                            long inPoint = pVar3.getInPoint() + ((long) (i18 * 1000));
                            longRef2.element = inPoint;
                            nVar.f17527d = inPoint;
                            nVar.f17528e = -1.0f;
                            longRef3.element = inPoint - longRef.element;
                        } else if (i16 == 1) {
                            longRef.element = pVar3.getOutPoint() - ((long) (i19 * 1000));
                            longRef2.element = pVar3.getOutPoint();
                            nVar.f17527d = longRef.element;
                            nVar.f17528e = 1.0f;
                            longRef3.element = (((long) i19) * 1000) + 500000;
                        } else if (i16 == 2) {
                            longRef.element = pVar3.getInPoint();
                            long outPoint = pVar3.getOutPoint();
                            longRef2.element = outPoint;
                            nVar.f17527d = outPoint;
                            nVar.f17528e = -1.0f;
                            longRef3.element = outPoint - longRef.element;
                        }
                        if (longRef3.element > 0) {
                            handler.post(new Ny0.k(nVar, longRef, longRef2, longRef3));
                        }
                    }
                }
            }
            BiliEditorCaptionBaseFragment.of(captionListItem2, "caption_anim");
        }
    }

    @Override // dx0.InterfaceC6890a
    public final void onCancel() {
        BiliEditorCaptionAnimationListV4Fragment biliEditorCaptionAnimationListV4Fragment = this.f106615a;
        if (biliEditorCaptionAnimationListV4Fragment.lf()) {
            C6526c c6526c = biliEditorCaptionAnimationListV4Fragment.f106467l;
            if (c6526c != null) {
                c6526c.notifyDataSetChanged();
            }
            BiliEditorCaptionBaseFragment.mf(this.f106616b, "caption_anim");
        }
    }
}
