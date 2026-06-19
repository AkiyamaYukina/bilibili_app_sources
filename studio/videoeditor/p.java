package com.bilibili.studio.videoeditor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/p.class */
public final class p {
    public static List a(long j7, @NonNull List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BClip bClip = (BClip) it.next();
            long inPoint = bClip.getInPoint();
            if (UpperTimeline.MIN_CLIP_DURATION + inPoint <= j7) {
                float f7 = bClip.playRate;
                float f8 = f7;
                if (f7 <= 0.0f) {
                    f8 = 1.0f;
                }
                long trimOut = ((long) ((bClip.getTrimOut() - bClip.getTrimIn()) / f8)) + inPoint;
                if (trimOut < inPoint) {
                    StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(inPoint, "appendOtherClip out < in ,inPoint=", ",outPoint=");
                    sbA.append(trimOut);
                    BLog.e("EditUtil", sbA.toString());
                    EditVideoInfoUtils.throwDebugException("EditNvsVideoTrack-appendOtherClip outPoint < inPoint");
                } else {
                    BClip bClipM10399clone = bClip.m10399clone();
                    long j8 = trimOut;
                    if (trimOut > j7) {
                        j8 = j7;
                    }
                    bClipM10399clone.setInPoint(inPoint);
                    bClipM10399clone.setOutPoint(j8);
                    bClipM10399clone.setTrimOut(bClip.getTrimIn() + ((long) ((j8 - inPoint) * bClipM10399clone.playRate)));
                    arrayList.add(bClipM10399clone);
                }
            }
        }
        return arrayList;
    }

    public static List<CaptionInfo> b(List<CaptionInfo> list, List<BClip> list2) {
        long j7;
        if (list == null || list.size() == 0 || list2 == null || list2.size() == 0) {
            return null;
        }
        ArrayList<CaptionInfo> arrayList = new ArrayList();
        for (CaptionInfo captionInfo : list) {
            Iterator<BClip> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    BClip next = it.next();
                    String str = captionInfo.bClipID;
                    if (str != null && str.equals(next.id) && captionInfo.capTimeInVideo >= next.getTrimIn() && captionInfo.capTimeInVideo <= next.getTrimOut()) {
                        arrayList.add(captionInfo);
                        break;
                    }
                }
            }
        }
        Iterator<BClip> it2 = list2.iterator();
        long duration = 0;
        while (true) {
            j7 = duration;
            if (!it2.hasNext()) {
                break;
            }
            duration = j7 + it2.next().getDuration(true);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            CaptionInfo captionInfo2 = (CaptionInfo) arrayList.get(i7);
            Iterator<BClip> it3 = list2.iterator();
            long duration2 = 0;
            while (true) {
                long j8 = duration2;
                if (it3.hasNext()) {
                    BClip next2 = it3.next();
                    if (next2.id.equals(captionInfo2.bClipID)) {
                        long trimIn = j8 + ((long) ((captionInfo2.capTimeInVideo - next2.getTrimIn()) / next2.playRate));
                        long jMin = Math.min(captionInfo2.capTimeDuration + trimIn, j7);
                        if (trimIn < 0 || jMin <= trimIn) {
                            arrayList2.add(captionInfo2);
                        } else {
                            captionInfo2.inPoint = trimIn;
                            captionInfo2.outPoint = jMin;
                            captionInfo2.capTimeDuration = jMin - trimIn;
                        }
                    } else {
                        duration2 = j8 + next2.getDuration(true);
                    }
                }
            }
        }
        ArrayList<Long> arrayList3 = new ArrayList();
        for (CaptionInfo captionInfo3 : arrayList) {
            arrayList3.add(Long.valueOf(captionInfo3.inPoint));
            arrayList3.add(Long.valueOf(captionInfo3.outPoint));
        }
        ArrayList arrayList4 = new ArrayList();
        long j9 = 0;
        for (Long l7 : arrayList3) {
            arrayList4.clear();
            Iterator it4 = arrayList.iterator();
            int i8 = 0;
            long j10 = j9;
            while (true) {
                j9 = j10;
                if (it4.hasNext()) {
                    CaptionInfo captionInfo4 = (CaptionInfo) it4.next();
                    int i9 = i8;
                    if (l7.longValue() >= captionInfo4.inPoint) {
                        i9 = i8;
                        if (l7.longValue() <= captionInfo4.outPoint) {
                            int i10 = i8 + 1;
                            arrayList4.add(captionInfo4);
                            i9 = i10;
                            if (i10 > 8) {
                                Iterator it5 = arrayList4.iterator();
                                CaptionInfo captionInfo5 = null;
                                while (true) {
                                    long j11 = j10;
                                    if (!it5.hasNext()) {
                                        break;
                                    }
                                    CaptionInfo captionInfo6 = (CaptionInfo) it5.next();
                                    long j12 = captionInfo6.id;
                                    j10 = j11;
                                    if (j12 > j11) {
                                        j10 = j12;
                                        captionInfo5 = captionInfo6;
                                    }
                                }
                                i9 = i10;
                                if (captionInfo5 != null) {
                                    arrayList2.add(captionInfo5);
                                    i9 = i10;
                                }
                            }
                        }
                    }
                    j10 = 0;
                    i8 = i9;
                }
            }
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList.remove((CaptionInfo) it6.next());
        }
        return arrayList;
    }

    public static List<EditorDanmakuInfo> c(List<EditorDanmakuInfo> list, List<BClip> list2) {
        long j7;
        if (list == null || list.size() == 0) {
            return new ArrayList();
        }
        if (list2 == null || list2.size() == 0) {
            return new ArrayList();
        }
        ArrayList<EditorDanmakuInfo> arrayList = new ArrayList();
        for (EditorDanmakuInfo editorDanmakuInfo : list) {
            Iterator<BClip> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    BClip next = it.next();
                    String str = editorDanmakuInfo.bClipID;
                    if (str != null && str.equals(next.id) && editorDanmakuInfo.capTimeInVideo >= next.getTrimIn() && editorDanmakuInfo.capTimeInVideo <= next.getTrimOut()) {
                        arrayList.add(editorDanmakuInfo);
                        break;
                    }
                }
            }
        }
        Iterator<BClip> it2 = list2.iterator();
        long duration = 0;
        while (true) {
            j7 = duration;
            if (!it2.hasNext()) {
                break;
            }
            duration = j7 + it2.next().getDuration(true);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            EditorDanmakuInfo editorDanmakuInfo2 = (EditorDanmakuInfo) arrayList.get(i7);
            Iterator<BClip> it3 = list2.iterator();
            long duration2 = 0;
            while (true) {
                long j8 = duration2;
                if (it3.hasNext()) {
                    BClip next2 = it3.next();
                    if (next2.id.equals(editorDanmakuInfo2.bClipID)) {
                        long trimIn = j8 + ((long) ((editorDanmakuInfo2.capTimeInVideo - next2.getTrimIn()) / next2.playRate));
                        long j9 = editorDanmakuInfo2.capTimeDuration + trimIn;
                        long j10 = j9;
                        if (j9 - trimIn < TransitionInfo.DEFAULT_DURATION) {
                            j10 = trimIn + TransitionInfo.DEFAULT_DURATION;
                        }
                        long jMin = Math.min(j10, j7);
                        if (jMin - trimIn < TransitionInfo.DEFAULT_DURATION) {
                            arrayList2.add(editorDanmakuInfo2);
                        } else {
                            editorDanmakuInfo2.inPoint = trimIn;
                            editorDanmakuInfo2.outPoint = jMin;
                        }
                    } else {
                        duration2 = j8 + next2.getDuration(true);
                    }
                }
            }
        }
        ArrayList<Long> arrayList3 = new ArrayList();
        for (EditorDanmakuInfo editorDanmakuInfo3 : arrayList) {
            arrayList3.add(Long.valueOf(editorDanmakuInfo3.inPoint));
            arrayList3.add(Long.valueOf(editorDanmakuInfo3.outPoint));
        }
        ArrayList<EditorDanmakuInfo> arrayList4 = new ArrayList();
        for (Long l7 : arrayList3) {
            arrayList4.clear();
            int i8 = 0;
            for (EditorDanmakuInfo editorDanmakuInfo4 : arrayList) {
                if (l7.longValue() >= editorDanmakuInfo4.inPoint && l7.longValue() <= editorDanmakuInfo4.outPoint) {
                    int i9 = i8 + 1;
                    arrayList4.add(editorDanmakuInfo4);
                    i8 = i9;
                    if (i9 > 8) {
                        EditorDanmakuInfo editorDanmakuInfo5 = null;
                        long j11 = 0;
                        for (EditorDanmakuInfo editorDanmakuInfo6 : arrayList4) {
                            long j12 = editorDanmakuInfo6.id;
                            if (j12 > j11) {
                                j11 = j12;
                                editorDanmakuInfo5 = editorDanmakuInfo6;
                            }
                        }
                        i8 = i9;
                        if (editorDanmakuInfo5 != null) {
                            arrayList2.add(editorDanmakuInfo5);
                            i8 = i9;
                        }
                    }
                }
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList.remove((EditorDanmakuInfo) it4.next());
        }
        return arrayList;
    }

    public static List<RecordInfo> d(List<RecordInfo> list, List<BClip> list2) {
        long j7;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BClip> it = list2.iterator();
        long duration = 0;
        while (true) {
            j7 = duration;
            if (!it.hasNext()) {
                break;
            }
            duration = j7 + it.next().getDuration(true);
        }
        for (RecordInfo recordInfo : list) {
            if (recordInfo.outPoint >= j7) {
                if (recordInfo.inPoint >= j7) {
                    break;
                }
                recordInfo.outPoint = j7;
                arrayList.add(recordInfo);
            } else {
                arrayList.add(recordInfo);
            }
        }
        return arrayList;
    }

    public static ArrayList<BiliEditorStickerInfo> e(ArrayList<BiliEditorStickerInfo> arrayList, List<BClip> list, long j7) {
        if (V.e(arrayList) || V.e(list)) {
            return new ArrayList<>();
        }
        BLog.e("EditUtil", "adjustStickerInfoByClipId start size: " + arrayList.size());
        ArrayList<BiliEditorStickerInfo> arrayList2 = new ArrayList<>();
        for (BiliEditorStickerInfo biliEditorStickerInfo : arrayList) {
            for (BClip bClip : list) {
                if (!TextUtils.isEmpty(bClip.id) && bClip.id.equals(biliEditorStickerInfo.getClipId()) && biliEditorStickerInfo.getTrimInClip() >= bClip.getTrimIn() && biliEditorStickerInfo.getTrimInClip() <= bClip.getTrimOut()) {
                    arrayList2.add(biliEditorStickerInfo);
                }
            }
        }
        BLog.e("EditUtil", "adjustStickerInfoByClipId end size: " + arrayList2.size());
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            BiliEditorStickerInfo biliEditorStickerInfo2 = arrayList2.get(size);
            Iterator<BClip> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    BClip next = it.next();
                    if (!TextUtils.isEmpty(next.id) && next.id.equals(biliEditorStickerInfo2.getClipId())) {
                        long duration = biliEditorStickerInfo2.getDuration();
                        if (next.playRate <= 0.0f) {
                            continue;
                        } else {
                            long inPoint = next.getInPoint() + ((long) ((biliEditorStickerInfo2.getTrimInClip() - next.getTrimIn()) / next.playRate));
                            biliEditorStickerInfo2.inPoint = inPoint;
                            if (j7 - inPoint < TransitionInfo.DEFAULT_DURATION) {
                                arrayList2.remove(size);
                                break;
                            }
                            biliEditorStickerInfo2.outPoint = Math.min(j7, inPoint + duration);
                        }
                    }
                }
            }
        }
        ArrayList<Long> arrayList3 = new ArrayList();
        for (BiliEditorStickerInfo biliEditorStickerInfo3 : arrayList2) {
            arrayList3.add(Long.valueOf(biliEditorStickerInfo3.inPoint));
            arrayList3.add(Long.valueOf(biliEditorStickerInfo3.outPoint));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList<BiliEditorStickerInfo> arrayList5 = new ArrayList();
        for (Long l7 : arrayList3) {
            arrayList5.clear();
            int i7 = 0;
            for (BiliEditorStickerInfo biliEditorStickerInfo4 : arrayList2) {
                if (l7.longValue() >= biliEditorStickerInfo4.inPoint && l7.longValue() <= biliEditorStickerInfo4.outPoint) {
                    int i8 = i7 + 1;
                    arrayList5.add(biliEditorStickerInfo4);
                    i7 = i8;
                    if (i8 > 8) {
                        BiliEditorStickerInfo biliEditorStickerInfo5 = null;
                        long createTime = 0;
                        for (BiliEditorStickerInfo biliEditorStickerInfo6 : arrayList5) {
                            if (biliEditorStickerInfo6.getCreateTime() > createTime) {
                                createTime = biliEditorStickerInfo6.getCreateTime();
                                biliEditorStickerInfo5 = biliEditorStickerInfo6;
                            }
                        }
                        i7 = i8;
                        if (biliEditorStickerInfo5 != null) {
                            arrayList4.add(biliEditorStickerInfo5);
                            i7 = i8;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList2.remove((BiliEditorStickerInfo) it2.next());
        }
        return arrayList2;
    }

    public static List f(long j7, List list, List list2) {
        if (V.e(list) || V.e(list2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EditTtsInfo editTtsInfo = (EditTtsInfo) it.next();
            if (editTtsInfo.getCaptionId() <= 0) {
                BLog.e("EditUtil", "wtf editTtsInfo.captionId is Error " + editTtsInfo.getCaptionId());
            } else {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        CaptionInfo captionInfo = (CaptionInfo) it2.next();
                        if (editTtsInfo.getCaptionId() == captionInfo.id) {
                            if (captionInfo.inPoint != editTtsInfo.getInPoint()) {
                                editTtsInfo.setInPoint(captionInfo.inPoint);
                            }
                            if (editTtsInfo.getInPoint() <= j7) {
                                long jMin = Math.min(captionInfo.outPoint - captionInfo.inPoint, editTtsInfo.getDuration());
                                long trimIn = editTtsInfo.getTrimIn() + jMin;
                                long inPoint = editTtsInfo.getInPoint() + jMin;
                                long j8 = inPoint;
                                if (inPoint > j7) {
                                    trimIn = editTtsInfo.getTrimIn() + (j7 - editTtsInfo.getInPoint());
                                    j8 = j7;
                                }
                                editTtsInfo.setTrimOut(trimIn);
                                editTtsInfo.setOutPoint(j8);
                                arrayList.add(editTtsInfo);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [UC0.b, UC0.i] */
    public static boolean g(P50.n nVar, ArrayList<BiliEditorStickerInfo> arrayList, boolean z6) {
        BLog.e("EditUtil", "setFxStickerToTimeline: " + arrayList.size());
        if (nVar == null) {
            return false;
        }
        ?? iVar = new UC0.i(nVar, "sticker_track");
        if (z6) {
            iVar.j();
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            iVar.l((BiliEditorStickerInfo) it.next());
        }
        return true;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = str;
        if (str.length() > 14) {
            str2 = str.substring(0, 14) + "...";
        }
        return str2;
    }
}
