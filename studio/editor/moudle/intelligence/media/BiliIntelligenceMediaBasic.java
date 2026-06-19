package com.bilibili.studio.editor.moudle.intelligence.media;

import Xz0.g;
import Yv0.e;
import android.text.TextUtils;
import bolts.Continuation;
import bolts.Task;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.neuron.util.SamplesKt;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.studio.comm.manager.j;
import com.bilibili.studio.editor.moudle.intelligence.media.strategy.d;
import com.bilibili.studio.editor.moudle.intelligence.trace.AlbumIntelligenceTrace;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import com.bvc.bilimusicrmdjni.BLMobileMusicRecommender;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sz0.c;
import tv.danmaku.android.log.BLog;
import yw0.C9104b;
import zw0.C9269a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/BiliIntelligenceMediaBasic.class */
public class BiliIntelligenceMediaBasic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f107363c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile int f107366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f107367g;
    public volatile boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f107368i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f107371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f107372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f107373n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f107374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f107375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final d f107376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f107377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.intelligence.media.strategy.b f107378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final AlbumIntelligenceTrace f107379t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final Lazy f107380u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final e f107364d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final xz0.a f107365e = new xz0.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IntelligenceModDownloadLogic f107369j = new IntelligenceModDownloadLogic();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public String f107370k = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/BiliIntelligenceMediaBasic$FilterState.class */
    public static final class FilterState {
        private static final EnumEntries $ENTRIES;
        private static final FilterState[] $VALUES;

        @NotNull
        private final String des;
        public static final FilterState FILTER_STATE_RIGHT = new FilterState("FILTER_STATE_RIGHT", 0, "符合要求");
        public static final FilterState FILTER_STATE_DURATION = new FilterState("FILTER_STATE_DURATION", 1, "时长不符合");
        public static final FilterState FILTER_STATE_8G = new FilterState("FILTER_STATE_8G", 2, "超过8GB");
        public static final FilterState FILTER_STATE_2K = new FilterState("FILTER_STATE_2K", 3, "分辨率超过2K");
        public static final FilterState FILTER_STATE_HDR = new FilterState("FILTER_STATE_HDR", 4, "HDR素材-不支持");
        public static final FilterState FILTER_INVALID = new FilterState("FILTER_INVALID", 5, "无效素材");
        public static final FilterState FILTER_SIZE_0 = new FilterState("FILTER_SIZE_0", 6, "宽或高为0");

        private static final /* synthetic */ FilterState[] $values() {
            return new FilterState[]{FILTER_STATE_RIGHT, FILTER_STATE_DURATION, FILTER_STATE_8G, FILTER_STATE_2K, FILTER_STATE_HDR, FILTER_INVALID, FILTER_SIZE_0};
        }

        static {
            FilterState[] filterStateArr$values = $values();
            $VALUES = filterStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(filterStateArr$values);
        }

        private FilterState(String str, int i7, String str2) {
            this.des = str2;
        }

        @NotNull
        public static EnumEntries<FilterState> getEntries() {
            return $ENTRIES;
        }

        public static FilterState valueOf(String str) {
            return (FilterState) Enum.valueOf(FilterState.class, str);
        }

        public static FilterState[] values() {
            return (FilterState[]) $VALUES.clone();
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/BiliIntelligenceMediaBasic$a.class */
    public static final class a implements IntelligenceModDownloadLogic.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliIntelligenceMediaBasic f107381a;

        public a(BiliIntelligenceMediaBasic biliIntelligenceMediaBasic) {
            this.f107381a = biliIntelligenceMediaBasic;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a
        public final void a(long j7, String str) {
            this.f107381a.f107366f = 2;
            this.f107381a.l();
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a
        public final void b(long j7, String str, String str2) {
            this.f107381a.f107366f = 1;
            BiliIntelligenceMediaBasic biliIntelligenceMediaBasic = this.f107381a;
            biliIntelligenceMediaBasic.f107370k = str2;
            j jVarB = biliIntelligenceMediaBasic.f107369j.b();
            if (biliIntelligenceMediaBasic.h) {
                return;
            }
            Task.callInBackground(new sz0.a(biliIntelligenceMediaBasic, jVarB)).continueWith((Continuation) new sz0.b(biliIntelligenceMediaBasic, jVarB), Task.UI_THREAD_EXECUTOR);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/BiliIntelligenceMediaBasic$b.class */
    public static final class b implements IntelligenceModDownloadLogic.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliIntelligenceMediaBasic f107382a;

        public b(BiliIntelligenceMediaBasic biliIntelligenceMediaBasic) {
            this.f107382a = biliIntelligenceMediaBasic;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a
        public final void a(long j7, String str) {
            this.f107382a.f107367g = 2;
        }

        @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a
        public final void b(long j7, String str, String str2) {
            if (str.length() > 0) {
                BiliIntelligenceMediaBasic biliIntelligenceMediaBasic = this.f107382a;
                Task.callInBackground(new c(biliIntelligenceMediaBasic, str)).continueWith((Continuation) new sz0.d(biliIntelligenceMediaBasic, str), Task.UI_THREAD_EXECUTOR);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BiliIntelligenceMediaBasic() {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.BiliIntelligenceMediaBasic.<init>():void");
    }

    @NotNull
    public static List a(@Nullable List list) {
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int iCoerceAtMost = RangesKt.coerceAtMost(12, list.size());
            int i7 = 0;
            while (true) {
                if (i7 >= iCoerceAtMost) {
                    break;
                }
                ImageItem imageItem = (ImageItem) list.get(i7);
                if (new File(imageItem.path).exists()) {
                    if (imageItem.isVideo()) {
                        boolean z6 = (b(imageItem) || d(imageItem) || !e(imageItem)) ? false : true;
                        if (z6 && imageItem.getDuration() > 8000 && imageItem.getDuration() < 1200000) {
                            arrayList2.add(imageItem);
                            break;
                        }
                        if (z6) {
                            arrayList3.add(imageItem);
                        }
                    } else if (imageItem.isImage() && arrayList4.size() < 3) {
                        arrayList4.add(imageItem);
                    }
                }
                i7++;
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(o(arrayList2));
                return arrayList;
            }
            if (arrayList4.size() == 3) {
                arrayList.addAll(arrayList4);
                return arrayList;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(o(arrayList3));
                return arrayList;
            }
            if (!arrayList4.isEmpty()) {
                arrayList.addAll(arrayList4);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(com.bilibili.studio.videoeditor.loader.ImageItem r5) {
        /*
            r0 = r5
            java.lang.String r0 = r0.path
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L39
            r0 = r9
            int r0 = r0.length()
            if (r0 != 0) goto L16
            goto L39
        L16:
            r0 = r5
            java.lang.String r0 = r0.path
            r5 = r0
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L3d
            r9 = r0
            r0 = r9
            r1 = r5
            r0.<init>(r1)     // Catch: java.lang.Exception -> L3d
            r0 = r9
            long r0 = r0.length()     // Catch: java.lang.Exception -> L3d
            r7 = r0
            r0 = r7
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L39
            r0 = 1
            r6 = r0
            goto L3b
        L39:
            r0 = 0
            r6 = r0
        L3b:
            r0 = r6
            return r0
        L3d:
            r5 = move-exception
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.BiliIntelligenceMediaBasic.b(com.bilibili.studio.videoeditor.loader.ImageItem):boolean");
    }

    public static boolean d(ImageItem imageItem) throws Throwable {
        boolean zG;
        int i7 = imageItem.width;
        if (i7 <= 0 || imageItem.height <= 0) {
            zG = false;
            if (imageItem.isVideo()) {
                zG = false;
                if (!TextUtils.isEmpty(imageItem.path)) {
                    try {
                        zG = C9104b.g(imageItem.path);
                    } catch (Exception e7) {
                        zG = false;
                    }
                }
            }
        } else {
            zG = false;
            if (i7 >= 2000) {
                zG = true;
            }
        }
        return zG;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(com.bilibili.studio.videoeditor.loader.ImageItem r3) {
        /*
            boolean r0 = zw0.b.e()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L48
            r0 = r3
            java.lang.String r0 = r0.path
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L7b
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto L1d
            goto L7b
        L1d:
            r0 = r3
            boolean r0 = r0.isVideo()
            if (r0 != 0) goto L29
            r0 = r5
            r4 = r0
            goto L7d
        L29:
            kotlin.Lazy<com.bilibili.studio.comm.manager.hdr.a> r0 = com.bilibili.studio.comm.manager.hdr.a.f105396e
            r6 = r0
            com.bilibili.studio.comm.manager.hdr.a r0 = com.bilibili.studio.comm.manager.hdr.a.C1185a.a()
            boolean r0 = r0.g()
            if (r0 == 0) goto L3b
            r0 = r5
            r4 = r0
            goto L7d
        L3b:
            r0 = 1
            r1 = r3
            java.lang.String r1 = r1.path
            boolean r1 = yw0.C9104b.d(r1)
            r0 = r0 ^ r1
            r4 = r0
            goto L7d
        L48:
            r0 = r3
            java.lang.String r0 = r0.path
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L70
            r0 = r6
            int r0 = r0.length()
            if (r0 != 0) goto L5b
            goto L70
        L5b:
            r0 = r3
            boolean r0 = r0.isVideo()
            if (r0 != 0) goto L65
            goto L70
        L65:
            r0 = r3
            java.lang.String r0 = r0.path
            boolean r0 = yw0.C9104b.c(r0)
            r4 = r0
            goto L72
        L70:
            r0 = 0
            r4 = r0
        L72:
            r0 = r4
            if (r0 != 0) goto L7b
            r0 = r5
            r4 = r0
            goto L7d
        L7b:
            r0 = 0
            r4 = r0
        L7d:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.BiliIntelligenceMediaBasic.e(com.bilibili.studio.videoeditor.loader.ImageItem):boolean");
    }

    public static void n(@NotNull String str) {
        BLog.e("intelligence_rec_tag", str);
    }

    public static ImageItem o(List list) {
        ArrayList arrayList = (ArrayList) list;
        return (ImageItem) arrayList.get(SamplesKt.randInt(0, arrayList.size() - 1));
    }

    public static void p(@NotNull ImageItem imageItem, long j7, @Nullable String str, @NotNull String str2, boolean z6, boolean z7) {
        String str3 = imageItem.isImage() ? "image" : z7 ? "video_cover" : "video";
        boolean z8 = str == null || str.length() == 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long duration = imageItem.getDuration();
        HashMap mapC = O4.b.c("type", str3);
        mapC.put(ThirdPartyExtraBuilder.KEY_RESULT, !z8 ? "1" : "0");
        mapC.put("cost_time", String.valueOf(jCurrentTimeMillis - j7));
        String str4 = str2;
        if (str2 == null) {
            str4 = "";
        }
        mapC.put("error_msg", str4);
        mapC.put("is_cache", z6 ? "1" : "0");
        mapC.put(EditCustomizeSticker.TAG_DURATION, String.valueOf(duration));
        mapC.put("material_page_ab", ((Boolean) com.bilibili.studio.comm.manager.d.f105389a.getValue()).booleanValue() ? "1" : "0");
        g.c(mapC);
        Neurons.trackT(false, "creation.matter.smart.analysis.image.rec.tracker", mapC, 1, new AT0.c(8));
    }

    @NotNull
    public static List q(@Nullable List list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        int iCoerceAtMost = RangesKt.coerceAtMost(list.size(), 12);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i7 = 0;
        while (true) {
            if (i7 >= iCoerceAtMost) {
                break;
            }
            ImageItem imageItem = (ImageItem) list.get(i7);
            if (new File(imageItem.path).exists()) {
                boolean z6 = imageItem.isVideo() && !b(imageItem) && !d(imageItem) && e(imageItem);
                if (z6 && imageItem.getDuration() > 8000 && imageItem.getDuration() < 1200000) {
                    arrayList2.add(imageItem);
                    break;
                }
                if (z6) {
                    arrayList3.add(imageItem);
                }
            }
            i7++;
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(o(arrayList2));
            return arrayList;
        }
        if (!arrayList3.isEmpty()) {
            arrayList.add(o(arrayList3));
        }
        return arrayList;
    }

    public final boolean c() {
        if (this.h) {
            return true;
        }
        if (this.f107366f != 1 || this.f107367g != 1) {
            j();
            return false;
        }
        if (this.h) {
            return true;
        }
        j jVarB = this.f107369j.b();
        if (!jVarB.a() || this.f107365e.e(jVarB.f105404a) != 0) {
            return false;
        }
        this.f107365e.b(jVarB.f105405b);
        this.h = true;
        BLMobileMusicRecommender bLMobileMusicRecommender = this.f107365e.a;
        n("[素材页] [模型]同步初始化成功，version=" + (bLMobileMusicRecommender != null ? bLMobileMusicRecommender.getVersion() : null) + ", " + jVarB);
        return true;
    }

    public final int f(int i7, boolean z6) {
        Pair pair = (Pair) this.f107380u.getValue();
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        int iH = i7 == 1 ? iIntValue : h(i7);
        int iMin = iH;
        if (z6) {
            iMin = Math.min(iIntValue2, iH);
        }
        return iMin;
    }

    public final int g(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : this.f107371l : this.f107372m : this.f107373n;
    }

    public final int h(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : this.f107361a : this.f107362b : this.f107363c;
    }

    @NotNull
    public final List<ImageItem> i(@Nullable List<? extends ImageItem> list) {
        ArrayList arrayList = new ArrayList();
        List<? extends ImageItem> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            int iCoerceAtMost = RangesKt.coerceAtMost(list.size(), this.f107372m);
            for (int i7 = 0; i7 < iCoerceAtMost; i7++) {
                ImageItem imageItem = list.get(i7);
                if (new File(imageItem.path).exists() && imageItem.isImage()) {
                    arrayList.add(imageItem);
                    if (arrayList.size() >= 3) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public final void j() {
        this.f107369j.c("", this.f107364d, new a(this));
        if (C9269a.f130942c != null) {
            this.f107367g = 1;
        } else {
            this.f107369j.d(this.f107364d, new b(this));
        }
    }

    @NotNull
    public final FilterState k(@NotNull ImageItem imageItem) {
        FilterState filterState = imageItem.isVideo() ? (imageItem.width <= 0 || imageItem.height <= 0) ? FilterState.FILTER_SIZE_0 : (imageItem.getDuration() >= this.f107375p && imageItem.getDuration() <= this.f107374o) ? b(imageItem) ? FilterState.FILTER_STATE_8G : d(imageItem) ? FilterState.FILTER_STATE_2K : !e(imageItem) ? FilterState.FILTER_STATE_HDR : FilterState.FILTER_STATE_RIGHT : FilterState.FILTER_STATE_DURATION : (imageItem.width <= 0 || imageItem.height <= 0) ? FilterState.FILTER_SIZE_0 : FilterState.FILTER_STATE_RIGHT;
        return filterState;
    }

    public void l() {
    }

    public void m() {
    }
}
