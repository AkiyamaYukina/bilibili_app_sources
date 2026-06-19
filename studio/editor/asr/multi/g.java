package com.bilibili.studio.editor.asr.multi;

import android.view.ViewGroup;
import com.bili.rvext.ThreadLayoutInflater;
import com.bilibili.module.vip.combine.j;
import com.bilibili.studio.editor.asr.bean.AsrExtraMsg;
import com.bilibili.studio.editor.asr.bean.AsrResultWrapper;
import com.bilibili.studio.editor.asr.bean.CaptionRecognition;
import com.bilibili.studio.editor.asr.core.exception.AsrBaseException;
import com.bilibili.studio.editor.asr.l;
import com.bilibili.video.story.player.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function2<? super List<CaptionRecognition>, ? super AsrExtraMsg, Unit> f105638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<? super Integer, Unit> f105639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<? super AsrExtraMsg, Unit> f105640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f105641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function2<? super Bw0.d, ? super AsrExtraMsg, Unit> f105642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f105643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f105644g;
    public long h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f105645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final l f105646j;

    /* JADX WARN: Type inference failed for: r1v9, types: [com.bilibili.studio.editor.asr.l, java.lang.Object] */
    public g(Function2 function2, Function1 function1, Function1 function12, Function0 function0, Function2 function22, int i7) {
        function2 = (i7 & 1) != 0 ? new com.bilibili.bililive.biz.config.b(1) : function2;
        if ((i7 & 2) != 0) {
            final int i8 = 0;
            function1 = new Function1(i8) { // from class: com.bilibili.studio.editor.asr.multi.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f105631a;

                {
                    this.f105631a = i8;
                }

                public final Object invoke(Object obj) {
                    switch (this.f105631a) {
                        case 0:
                            ((Integer) obj).intValue();
                            return Unit.INSTANCE;
                        case 1:
                            return ((T21.e) obj).a;
                        case 2:
                            ((Boolean) obj).booleanValue();
                            KProperty[] kPropertyArr = com.bilibili.ad.adview.story.twist.b.c;
                            return Unit.INSTANCE;
                        default:
                            ViewGroup viewGroup = (ViewGroup) obj;
                            return new u9.d(M.a(viewGroup, ThreadLayoutInflater.Companion, 2131493579, viewGroup, false));
                    }
                }
            };
        }
        function12 = (i7 & 4) != 0 ? new j(1) : function12;
        function22 = (i7 & 16) != 0 ? null : function22;
        this.f105638a = function2;
        this.f105639b = function1;
        this.f105640c = function12;
        this.f105641d = function0;
        this.f105642e = function22;
        this.f105646j = new Object();
    }

    public static List a(List list) {
        List listEmptyList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AsrBaseException exception = ((AsrResultWrapper) it.next()).getException();
                if (exception != null) {
                    arrayList.add(exception);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (true) {
                listEmptyList = arrayList2;
                if (!it2.hasNext()) {
                    break;
                }
                AsrBaseException asrBaseException = (AsrBaseException) it2.next();
                arrayList2.add("code:" + asrBaseException.getCode() + " " + asrBaseException.getMessage());
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bilibili.studio.editor.asr.bean.AsrExtraMsg b(java.util.List r9, java.util.List r10, int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.multi.g.b(java.util.List, java.util.List, int, int, int, int):com.bilibili.studio.editor.asr.bean.AsrExtraMsg");
    }
}
