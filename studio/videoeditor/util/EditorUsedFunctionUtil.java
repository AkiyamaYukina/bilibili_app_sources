package com.bilibili.studio.videoeditor.util;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.repository.data.BiliEditorStickerInfo;
import com.bilibili.studio.videoeditor.bean.BMusic;
import com.bilibili.studio.videoeditor.editbase.visualeffects.model.EditVisualEffectClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditTtsInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.ms.record.RecordInfo;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil.class */
public final class EditorUsedFunctionUtil {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$ClipBehavior.class */
    public static final class ClipBehavior {
        private static final EnumEntries $ENTRIES;
        private static final ClipBehavior[] $VALUES;

        @NotNull
        private final String value;
        public static final ClipBehavior SORT = new ClipBehavior("SORT", 0, "排序");
        public static final ClipBehavior SPEED = new ClipBehavior("SPEED", 1, "变速");
        public static final ClipBehavior CUT = new ClipBehavior("CUT", 2, "切割");
        public static final ClipBehavior DELETE = new ClipBehavior("DELETE", 3, "删除");
        public static final ClipBehavior ROTATE = new ClipBehavior("ROTATE", 4, "旋转");
        public static final ClipBehavior ZOOM = new ClipBehavior("ZOOM", 5, "变焦");
        public static final ClipBehavior ADD = new ClipBehavior("ADD", 6, "增加片段");
        public static final ClipBehavior TRIM = new ClipBehavior("TRIM", 7, "trim");
        public static final ClipBehavior CLIP_VOLUME = new ClipBehavior("CLIP_VOLUME", 8, "视频音量");
        public static final ClipBehavior SCALE = new ClipBehavior("SCALE", 9, "缩放");
        public static final ClipBehavior TRANS = new ClipBehavior("TRANS", 10, "位移");

        private static final /* synthetic */ ClipBehavior[] $values() {
            return new ClipBehavior[]{SORT, SPEED, CUT, DELETE, ROTATE, ZOOM, ADD, TRIM, CLIP_VOLUME, SCALE, TRANS};
        }

        static {
            ClipBehavior[] clipBehaviorArr$values = $values();
            $VALUES = clipBehaviorArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(clipBehaviorArr$values);
        }

        private ClipBehavior(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<ClipBehavior> getEntries() {
            return $ENTRIES;
        }

        public static ClipBehavior valueOf(String str) {
            return (ClipBehavior) Enum.valueOf(ClipBehavior.class, str);
        }

        public static ClipBehavior[] values() {
            return (ClipBehavior[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$a.class */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(((EditVisualEffectClip) t7).getAppendClipId(), ((EditVisualEffectClip) t8).getAppendClipId());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$b.class */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(((EditVisualEffectClip) t7).getAppendClipId(), ((EditVisualEffectClip) t8).getAppendClipId());
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$c.class */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Long.valueOf(((BMusic) t7).inPoint), Long.valueOf(((BMusic) t8).inPoint));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$d.class */
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Long.valueOf(((BMusic) t7).inPoint), Long.valueOf(((BMusic) t8).inPoint));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$e.class */
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Long.valueOf(((BiliEditorStickerInfo) t7).inPoint), Long.valueOf(((BiliEditorStickerInfo) t8).inPoint));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$f.class */
    public static final class f<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Long.valueOf(((BiliEditorStickerInfo) t7).inPoint), Long.valueOf(((BiliEditorStickerInfo) t8).inPoint));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$g.class */
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(((TransitionInfo) t7).preBClipId, ((TransitionInfo) t8).preBClipId);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/EditorUsedFunctionUtil$h.class */
    public static final class h<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(((TransitionInfo) t7).preBClipId, ((TransitionInfo) t8).preBClipId);
        }
    }

    public static void a(@Nullable EditVideoInfo editVideoInfo, @Nullable String str) {
        if (editVideoInfo == null || str == null || str.length() == 0) {
            return;
        }
        String usedFunction = editVideoInfo.getUsedFunction();
        String str2 = usedFunction;
        if (usedFunction == null) {
            str2 = "";
        }
        if (str2.length() != 0) {
            str = "，".concat(str);
        }
        String strA = G.p.a(str2, str);
        BLog.i("EditorUsedFunctionUtil", "usedFunction = " + strA);
        editVideoInfo.setUsedFunction(strA);
    }

    public static void b(@Nullable EditVideoInfo editVideoInfo, @Nullable String str) {
        if (editVideoInfo == null || str == null || str.length() == 0) {
            return;
        }
        String usedFunction = editVideoInfo.getUsedFunction();
        String str2 = usedFunction;
        if (usedFunction == null) {
            str2 = "";
        }
        if (StringsKt.n(str2, str)) {
            return;
        }
        if (str2.length() != 0) {
            str = "，".concat(str);
        }
        String strA = G.p.a(str2, str);
        BLog.i("EditorUsedFunctionUtil", "usedFunction = " + strA);
        editVideoInfo.setUsedFunction(strA);
    }

    public static void c(@Nullable EditVideoInfo editVideoInfo, @NotNull Set set) {
        if (editVideoInfo == null || ((HashSet) set).isEmpty()) {
            return;
        }
        String usedFunction = editVideoInfo.getUsedFunction();
        String strA = usedFunction;
        if (usedFunction == null) {
            strA = "";
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ClipBehavior clipBehavior = (ClipBehavior) it.next();
            if (!StringsKt.n(strA, clipBehavior.getValue())) {
                int length = strA.length();
                String value = clipBehavior.getValue();
                if (length != 0) {
                    value = C4496a.a("，", value);
                }
                strA = N1.p.a(strA, value);
            }
        }
        BLog.d("EditorUsedFunctionUtil", "Append functions: " + ((Object) strA));
        editVideoInfo.setUsedFunction(strA);
    }

    public static boolean d(@Nullable EditVideoInfo editVideoInfo, @Nullable String str) {
        if (str.length() == 0) {
            return false;
        }
        boolean zN = false;
        if (editVideoInfo != null) {
            String usedFunction = editVideoInfo.getUsedFunction();
            zN = false;
            if (usedFunction != null) {
                zN = StringsKt.n(usedFunction, str);
            }
        }
        return zN;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Comparator] */
    public static boolean e(@Nullable List list, @Nullable List list2) {
        boolean z6;
        BLog.i("EditorUsedFunctionUtil", "开始判断是否使用文字功能");
        if (list == null || list2 == null) {
            BLog.i("EditorUsedFunctionUtil", "字幕数量不一致");
            z6 = false;
            if (list == null) {
                z6 = false;
                if (list2 == null) {
                    z6 = true;
                }
            }
        } else if (list.size() != list2.size()) {
            BLog.i("EditorUsedFunctionUtil", "字幕数量不一致");
            z6 = false;
        } else {
            List listSortedWith = CollectionsKt.sortedWith(list, (Comparator) new Object());
            List listSortedWith2 = CollectionsKt.sortedWith(list2, (Comparator) new Object());
            int i7 = 0;
            for (Object obj : listSortedWith) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((CaptionInfo) obj).equalsIgnoreId(listSortedWith2.get(i7))) {
                    bilibili.live.app.service.resolver.c.a(i7, "字幕有修改：", "EditorUsedFunctionUtil");
                    z6 = false;
                    break;
                }
                i7++;
            }
            BLog.i("EditorUsedFunctionUtil", "未修改字幕");
            z6 = true;
        }
        return !z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x03f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c8 A[EDGE_INSN: B:316:0x02c8->B:81:0x02c8 BREAK  A[LOOP:5: B:75:0x028f->B:80:0x02c1], PHI: r28
  0x02c8: PHI (r28v8 java.util.List<com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo>) = 
  (r28v7 java.util.List<com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo>)
  (r28v10 java.util.List<com.bilibili.studio.videoeditor.ms.picture.SceneFxInfo>)
 binds: [B:73:0x0280, B:316:0x02c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0301  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Set f(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r7, @org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r8) {
        /*
            Method dump skipped, instruction units count: 2375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil.f(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):java.util.Set");
    }

    public static boolean g(@Nullable List list, @Nullable List list2) {
        BLog.i("EditorUsedFunctionUtil", "开始判断是否使用互动工具功能");
        if (list == null || list2 == null) {
            BLog.i("EditorUsedFunctionUtil", "互动工具数量不一致");
            return (list == null && list2 == null) ? false : true;
        }
        if (list.size() != list2.size()) {
            BLog.i("EditorUsedFunctionUtil", "互动工具数量不一致");
            return true;
        }
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((EditorDanmakuInfo) obj).equalsIgnoreTypeItem(list2.get(i7))) {
                BLog.i("EditorUsedFunctionUtil", "使用了互动工具功能");
                return true;
            }
            i7++;
        }
        BLog.i("EditorUsedFunctionUtil", "未使用互动工具功能");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198  */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Comparator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r5, @org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo r6) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil.h(com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo, com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Comparator] */
    public static boolean i(@Nullable List list, @Nullable List list2) {
        BLog.i("EditorUsedFunctionUtil", "开始判断是否使用音乐功能");
        if (list == null || list2 == null) {
            BLog.i("EditorUsedFunctionUtil", "音乐数量不一致");
            return (list == null && list2 == null) ? false : true;
        }
        if (list.size() != list2.size()) {
            BLog.i("EditorUsedFunctionUtil", "音乐数量不一致");
            return true;
        }
        List listSortedWith = CollectionsKt.sortedWith(list, (Comparator) new Object());
        List listSortedWith2 = CollectionsKt.sortedWith(list2, (Comparator) new Object());
        int i7 = 0;
        for (Object obj : listSortedWith) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((BMusic) obj).equalsIgnoreTime(listSortedWith2.get(i7))) {
                bilibili.live.app.service.resolver.c.a(i7, "音乐有修改：", "EditorUsedFunctionUtil");
                return true;
            }
            i7++;
        }
        BLog.i("EditorUsedFunctionUtil", "未使用音乐功能");
        return false;
    }

    public static boolean j(@Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoInfo editVideoInfo2) {
        BLog.i("EditorUsedFunctionUtil", "开始判断是否使用录音功能");
        if (!Intrinsics.areEqual(editVideoInfo != null ? Float.valueOf(editVideoInfo.getUserTrackNativeVolume()) : null, editVideoInfo2 != null ? Float.valueOf(editVideoInfo2.getUserTrackNativeVolume()) : null)) {
            BLog.i("EditorUsedFunctionUtil", "修改了原声");
            return true;
        }
        List<RecordInfo> recordInfoList = editVideoInfo != null ? editVideoInfo.getRecordInfoList() : null;
        List<RecordInfo> recordInfoList2 = null;
        if (editVideoInfo2 != null) {
            recordInfoList2 = editVideoInfo2.getRecordInfoList();
        }
        if (Intrinsics.areEqual(recordInfoList, recordInfoList2) || recordInfoList == null || recordInfoList2 == null) {
            BLog.i("EditorUsedFunctionUtil", "未使用录音功能");
            return false;
        }
        BLog.i("EditorUsedFunctionUtil", "使用了录音功能");
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Comparator] */
    public static boolean k(@Nullable List list, @Nullable List list2) {
        BLog.i("EditorUsedFunctionUtil", "开始判断是否使用贴纸功能");
        if (list == null || list2 == null) {
            BLog.i("EditorUsedFunctionUtil", "贴纸数量不一致");
            return (list == null && list2 == null) ? false : true;
        }
        if (list.size() != list2.size()) {
            BLog.i("EditorUsedFunctionUtil", "贴纸数量不一致");
            return true;
        }
        List listSortedWith = CollectionsKt.sortedWith(list, (Comparator) new Object());
        List listSortedWith2 = CollectionsKt.sortedWith(list2, (Comparator) new Object());
        int i7 = 0;
        for (Object obj : listSortedWith) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((BiliEditorStickerInfo) obj).equalsIgnoreTime(listSortedWith2.get(i7))) {
                bilibili.live.app.service.resolver.c.a(i7, "贴纸有修改：", "EditorUsedFunctionUtil");
                return true;
            }
            i7++;
        }
        BLog.i("EditorUsedFunctionUtil", "未修改贴纸");
        return false;
    }

    public static boolean l(@Nullable EditVideoInfo editVideoInfo, @Nullable EditVideoInfo editVideoInfo2) {
        BLog.i("EditorUsedFunctionUtil", "开始判断是否使用模板功能");
        EditorTemplateTabItemBean editTemplateInfo = null;
        EditorTemplateTabItemBean editTemplateInfo2 = editVideoInfo != null ? editVideoInfo.getEditTemplateInfo() : null;
        if (editVideoInfo2 != null) {
            editTemplateInfo = editVideoInfo2.getEditTemplateInfo();
        }
        if ((editTemplateInfo2 == null && editTemplateInfo != null && editTemplateInfo.isOriginalFilm()) || Intrinsics.areEqual(editTemplateInfo2, editTemplateInfo)) {
            return false;
        }
        BLog.i("EditorUsedFunctionUtil", "模板不一致");
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    public static boolean m(@Nullable List list, @Nullable List list2) {
        BLog.i("EditorUsedFunctionUtil", "开始判断是否使用转场功能");
        boolean z6 = false;
        if (list == null || list2 == null) {
            BLog.i("EditorUsedFunctionUtil", "转场数量不一致");
            if (list != null || list2 != null) {
                z6 = true;
            }
            return z6;
        }
        if (list.size() != list2.size()) {
            BLog.i("EditorUsedFunctionUtil", "转场数量不一致");
            return true;
        }
        if (Intrinsics.areEqual(CollectionsKt.sortedWith(list, (Comparator) new Object()), CollectionsKt.sortedWith(list2, (Comparator) new Object()))) {
            BLog.i("EditorUsedFunctionUtil", "未使用转场功能");
            return false;
        }
        BLog.i("EditorUsedFunctionUtil", "使用了转场功能");
        return true;
    }

    public static boolean n(@Nullable List list, @Nullable List list2) {
        boolean z6;
        BLog.i("EditorUsedFunctionUtil", "开始判断是否使用文本朗读");
        if (list == null || list2 == null) {
            BLog.i("EditorUsedFunctionUtil", "tts数量不一致");
            z6 = false;
            if (list == null) {
                z6 = false;
                if (list2 == null) {
                    z6 = true;
                }
            }
        } else if (list.size() != list2.size()) {
            BLog.i("EditorUsedFunctionUtil", "字幕数量不一致");
            z6 = false;
        } else {
            List listSortedWith = CollectionsKt.sortedWith(list, new E(0));
            List listSortedWith2 = CollectionsKt.sortedWith(list2, new F(0));
            int i7 = 0;
            for (Object obj : listSortedWith) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((EditTtsInfo) obj).equalsIgnoreId(listSortedWith2.get(i7))) {
                    bilibili.live.app.service.resolver.c.a(i7, "Tts有修改：", "EditorUsedFunctionUtil");
                    z6 = false;
                    break;
                }
                i7++;
            }
            BLog.i("EditorUsedFunctionUtil", "未修改Tts");
            z6 = true;
        }
        return !z6;
    }
}
