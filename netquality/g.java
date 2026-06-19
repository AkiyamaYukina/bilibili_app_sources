package com.bilibili.netquality;

import TB0.C2874f;
import android.view.MotionEvent;
import com.bilibili.playerbizcommon.gesture.OnUpListener;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.batchedit.BiliEditorStickerBatchEditFragmentV3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/netquality/g.class */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f67362b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f67361a = i7;
        this.f67362b = obj;
    }

    public final Object invoke(Object obj) {
        Triple<Integer, Long, Long> triple;
        switch (this.f67361a) {
            case 0:
                List list = (List) obj;
                int size = list.size();
                h hVar = (h) this.f67362b;
                if (size > 20) {
                    List list2 = list;
                    int i7 = 0;
                    int i8 = 0;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            i7 = i8;
                            if (it.hasNext()) {
                                if (((f) it.next()).f67360b) {
                                    int i9 = i8 + 1;
                                    i8 = i9;
                                    if (i9 < 0) {
                                        CollectionsKt.throwCountOverflow();
                                        i8 = i9;
                                    }
                                }
                            }
                        }
                    }
                    hVar.f67363e = (i7 * 1.0f) / list.size();
                    System.currentTimeMillis();
                }
                BLog.d("QualityAnalyse", "report: successRate " + hVar.f67363e + " " + list.size());
                return Unit.INSTANCE;
            case 1:
                Long l7 = (Long) obj;
                if (l7 != null) {
                    long jLongValue = l7.longValue();
                    BiliEditorStickerBatchEditFragmentV3 biliEditorStickerBatchEditFragmentV3 = (BiliEditorStickerBatchEditFragmentV3) this.f67362b;
                    int i10 = 0;
                    biliEditorStickerBatchEditFragmentV3.lf().f106681f.n("BiliEditorStickerBatchEditFragment.onVideoPlaying", false);
                    if (!biliEditorStickerBatchEditFragmentV3.f106358o && (((Number) biliEditorStickerBatchEditFragmentV3.f106359p.getFirst()).intValue() == -1 || jLongValue < ((Number) biliEditorStickerBatchEditFragmentV3.f106359p.getSecond()).longValue() || jLongValue > ((Number) biliEditorStickerBatchEditFragmentV3.f106359p.getThird()).longValue())) {
                        Iterator<BiliEditorStickerBatchEditFragmentV3.b> it2 = biliEditorStickerBatchEditFragmentV3.f106356m.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                BiliEditorStickerBatchEditFragmentV3.b next = it2.next();
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                BiliEditorStickerBatchEditFragmentV3.b bVar = next;
                                CaptionInfo captionInfo = bVar.f106370a;
                                if (captionInfo == null || captionInfo.inPoint > jLongValue || captionInfo.outPoint < jLongValue) {
                                    i10++;
                                } else {
                                    CaptionInfo captionInfo2 = bVar.f106370a;
                                    triple = new Triple<>(Integer.valueOf(i10), Long.valueOf(captionInfo2.inPoint), Long.valueOf(captionInfo2.outPoint));
                                }
                            } else {
                                triple = new Triple<>(-1, -1L, -1L);
                            }
                        }
                        if (((Number) triple.getFirst()).intValue() != -1) {
                            biliEditorStickerBatchEditFragmentV3.f106359p = triple;
                            int iIntValue = ((Number) triple.getFirst()).intValue();
                            int i11 = biliEditorStickerBatchEditFragmentV3.f106360q;
                            if (iIntValue != i11) {
                                if (i11 != -1) {
                                    biliEditorStickerBatchEditFragmentV3.f106362s = null;
                                    Xw0.c<BiliEditorStickerBatchEditFragmentV3.b> cVar = biliEditorStickerBatchEditFragmentV3.f106352i;
                                    Xw0.c<BiliEditorStickerBatchEditFragmentV3.b> cVar2 = cVar;
                                    if (cVar == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                                        cVar2 = null;
                                    }
                                    cVar2.notifyItemChanged(biliEditorStickerBatchEditFragmentV3.f106360q);
                                }
                                biliEditorStickerBatchEditFragmentV3.f106362s = biliEditorStickerBatchEditFragmentV3.f106356m.get(((Number) biliEditorStickerBatchEditFragmentV3.f106359p.getFirst()).intValue());
                                C2874f c2874f = biliEditorStickerBatchEditFragmentV3.f106351g;
                                C2874f c2874f2 = c2874f;
                                if (c2874f == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    c2874f2 = null;
                                }
                                c2874f2.f23776c.scrollToPosition(((Number) biliEditorStickerBatchEditFragmentV3.f106359p.getFirst()).intValue());
                                Xw0.c<BiliEditorStickerBatchEditFragmentV3.b> cVar3 = biliEditorStickerBatchEditFragmentV3.f106352i;
                                if (cVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                                    cVar3 = null;
                                }
                                cVar3.notifyItemChanged(((Number) biliEditorStickerBatchEditFragmentV3.f106359p.getFirst()).intValue());
                                biliEditorStickerBatchEditFragmentV3.f106360q = ((Number) biliEditorStickerBatchEditFragmentV3.f106359p.getFirst()).intValue();
                            }
                        } else if (biliEditorStickerBatchEditFragmentV3.f106360q != -1) {
                            biliEditorStickerBatchEditFragmentV3.f106362s = null;
                            Xw0.c<BiliEditorStickerBatchEditFragmentV3.b> cVar4 = biliEditorStickerBatchEditFragmentV3.f106352i;
                            if (cVar4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("editionsAdapter");
                                cVar4 = null;
                            }
                            cVar4.notifyItemChanged(biliEditorStickerBatchEditFragmentV3.f106360q);
                            biliEditorStickerBatchEditFragmentV3.f106360q = -1;
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                ((OnUpListener) obj).onUp((MotionEvent) this.f67362b);
                return Boolean.FALSE;
        }
    }
}
