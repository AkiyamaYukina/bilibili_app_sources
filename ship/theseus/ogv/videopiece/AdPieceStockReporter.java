package com.bilibili.ship.theseus.ogv.videopiece;

import F3.C1691a6;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.FragmentInfo;
import com.bapis.bilibili.playershared.FragmentPosition;
import com.bapis.bilibili.playershared.FragmentVideo;
import com.bapis.bilibili.playershared.FragmentVideoInfo;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.adcommon.utils.AdMossHelper;
import com.bilibili.gripper.api.ad.biz.videodetail.piece.IAdPieceReport;
import com.bilibili.gripper.api.ad.biz.videodetail.piece.PieceReportData;
import com.bilibili.ship.theseus.keel.player.j;
import com.google.protobuf.Any;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter.class */
@StabilityInferred(parameters = 0)
public final class AdPieceStockReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f94776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f94777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayViewUniteReply f94778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.videopiece.b f94779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f94780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f94781g;

    @NotNull
    public final Lazy h = LazyKt.lazy(new C1691a6(5));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f94794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f94795b;

        @Inject
        public a() {
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f94796a;

        static {
            int[] iArr = new int[FragmentPosition.values().length];
            try {
                iArr[FragmentPosition.PRE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FragmentPosition.POST.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f94796a = iArr;
        }
    }

    @Inject
    public AdPieceStockReporter(@NotNull CoroutineScope coroutineScope, @NotNull a aVar, @NotNull j jVar, @NotNull PlayViewUniteReply playViewUniteReply, @NotNull com.bilibili.ship.theseus.united.page.videopiece.b bVar, long j7, long j8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        SourceContent sourceContentB;
        SourceContent sourceContentB2;
        List videosList;
        List videosList2;
        this.f94775a = coroutineScope;
        this.f94776b = aVar;
        this.f94777c = jVar;
        this.f94778d = playViewUniteReply;
        this.f94779e = bVar;
        this.f94780f = j7;
        this.f94781g = j8;
        FragmentVideo fragmentVideo = playViewUniteReply.getFragmentVideo();
        if (fragmentVideo != null && (videosList2 = fragmentVideo.getVideosList()) != null) {
            List list = videosList2;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                arrayList = arrayList3;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((FragmentVideoInfo) next).getFragmentInfo().getFragmentPosition() == FragmentPosition.PRE) {
                    arrayList3.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        if (fragmentVideo != null && (videosList = fragmentVideo.getVideosList()) != null) {
            List list2 = videosList;
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (true) {
                arrayList2 = arrayList4;
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((FragmentVideoInfo) next2).getFragmentInfo().getFragmentPosition() == FragmentPosition.POST) {
                    arrayList4.add(next2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList != null && (sourceContentB2 = b(arrayList)) != null) {
            BuildersKt.launch$default(this.f94775a, (CoroutineContext) null, (CoroutineStart) null, new AdPieceStockReporter$1$1(this, arrayList, sourceContentB2, null), 3, (Object) null);
        }
        if (arrayList2 == null || (sourceContentB = b(arrayList2)) == null) {
            return;
        }
        BuildersKt.launch$default(this.f94775a, (CoroutineContext) null, (CoroutineStart) null, new AdPieceStockReporter$2$1(this, arrayList2, sourceContentB, null), 3, (Object) null);
    }

    public static final void a(AdPieceStockReporter adPieceStockReporter, FragmentVideoInfo fragmentVideoInfo, SourceContent sourceContent) {
        FragmentInfo fragmentInfo;
        FragmentInfo fragmentInfo2;
        FragmentInfo fragmentInfo3;
        IAdPieceReport iAdPieceReport = (IAdPieceReport) adPieceStockReporter.h.getValue();
        Long lValueOf = (fragmentVideoInfo == null || (fragmentInfo3 = fragmentVideoInfo.getFragmentInfo()) == null) ? null : Long.valueOf(fragmentInfo3.getAid());
        Long l7 = lValueOf;
        if (lValueOf == null) {
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Long.class);
            if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                l7 = (Long) Double.valueOf(0.0d);
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                l7 = (Long) Float.valueOf(0.0f);
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                l7 = 0L;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                l7 = (Long) 0;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Character.TYPE))) {
                l7 = (Long) (char) 0;
            } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
                l7 = (Long) (short) 0;
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
                    throw new RuntimeException("not primitive number type");
                }
                l7 = (Long) (byte) 0;
            }
        }
        long jLongValue = l7.longValue();
        Long lValueOf2 = (fragmentVideoInfo == null || (fragmentInfo2 = fragmentVideoInfo.getFragmentInfo()) == null) ? null : Long.valueOf(fragmentInfo2.getCid());
        Long l8 = lValueOf2;
        if (lValueOf2 == null) {
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Long.class);
            if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                l8 = (Long) Double.valueOf(0.0d);
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                l8 = (Long) Float.valueOf(0.0f);
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                l8 = 0L;
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                l8 = (Long) 0;
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Character.TYPE))) {
                l8 = (Long) (char) 0;
            } else if (Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Short.TYPE))) {
                l8 = (Long) (short) 0;
            } else {
                if (!Intrinsics.areEqual(orCreateKotlinClass2, Reflection.getOrCreateKotlinClass(Byte.TYPE))) {
                    throw new RuntimeException("not primitive number type");
                }
                l8 = (Long) (byte) 0;
            }
        }
        long jLongValue2 = l8.longValue();
        Long lValueOf3 = fragmentVideoInfo != null ? Long.valueOf(fragmentVideoInfo.getTimelength()) : null;
        PlayViewUniteReply playViewUniteReply = adPieceStockReporter.f94778d;
        long aid = playViewUniteReply.getPlayArc().getAid();
        long cid = playViewUniteReply.getPlayArc().getCid();
        FragmentPosition fragmentPosition = null;
        if (fragmentVideoInfo != null) {
            FragmentInfo fragmentInfo4 = fragmentVideoInfo.getFragmentInfo();
            fragmentPosition = null;
            if (fragmentInfo4 != null) {
                fragmentPosition = fragmentInfo4.getFragmentPosition();
            }
        }
        int i7 = fragmentPosition == null ? -1 : b.f94796a[fragmentPosition.ordinal()];
        iAdPieceReport.initWithReportData(new PieceReportData(jLongValue, jLongValue2, lValueOf3, aid, cid, adPieceStockReporter.f94780f, adPieceStockReporter.f94781g, i7 != 1 ? i7 != 2 ? "" : "surfix" : "prefix", sourceContent, (fragmentVideoInfo == null || (fragmentInfo = fragmentVideoInfo.getFragmentInfo()) == null) ? -1 : fragmentInfo.getIndex(), (String) null, 1024, (DefaultConstructorMarker) null));
        ((IAdPieceReport) adPieceStockReporter.h.getValue()).reportShow();
    }

    public static SourceContent b(List list) {
        Object obj;
        ArrayList<SourceContent> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FragmentVideoInfo fragmentVideoInfo = (FragmentVideoInfo) it.next();
            AdMossHelper adMossHelper = AdMossHelper.INSTANCE;
            Any report = null;
            if (fragmentVideoInfo != null) {
                FragmentInfo fragmentInfo = fragmentVideoInfo.getFragmentInfo();
                report = null;
                if (fragmentInfo != null) {
                    report = fragmentInfo.getReport();
                }
            }
            arrayList.add(adMossHelper.createSourceContent(report));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Object objFirst = CollectionsKt.first(arrayList);
        if (arrayList.isEmpty()) {
            obj = objFirst;
        } else {
            for (SourceContent sourceContent : arrayList) {
                obj = null;
                if ((sourceContent != null ? sourceContent.getAdContent() : null) != null) {
                    break;
                }
            }
            obj = objFirst;
        }
        return (SourceContent) obj;
    }
}
