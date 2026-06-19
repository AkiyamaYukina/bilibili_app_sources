package com.bilibili.pegasus.recommendlabel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.recommendlabel.data.Label;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/l0.class */
@StabilityInferred(parameters = 0)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<f0> f78757a = StateFlowKt.MutableStateFlow(new f0(0));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<InterfaceC5755y> f78758b = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 6, (Object) null);

    public static List b(List list) {
        List listEmptyList;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                listEmptyList = arrayList;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(((Label) it.next()).getName());
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    public static /* synthetic */ Object d(l0 l0Var, List list, List list2, String str, int i7, Function0 function0, Continuation continuation, int i8) {
        if ((i8 & 1) != 0) {
            list = null;
        }
        if ((i8 & 2) != 0) {
            list2 = null;
        }
        if ((i8 & 4) != 0) {
            str = null;
        }
        return l0Var.c(list, list2, str, i7, new RecommendLabelStateHolder$managerLabel$2(l0Var, null), function0, (ContinuationImpl) continuation);
    }

    public static List e(f0 f0Var, String str, boolean z6) {
        ArrayList arrayList;
        List<C5738g> list = f0Var.f78707c;
        if (list != null) {
            List<C5738g> list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                C5738g c5738g = (C5738g) it.next();
                List<Label> list3 = c5738g.f78716c;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (Label label : list3) {
                    Label labelCopy$default = label;
                    if (Intrinsics.areEqual(label.getName(), str)) {
                        labelCopy$default = Label.copy$default(label, null, null, z6 ? 1 : 0, null, 11, null);
                    }
                    arrayList3.add(labelCopy$default);
                }
                arrayList2.add(new C5738g(c5738g.f78714a, c5738g.f78715b, arrayList3));
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(final com.bilibili.pegasus.recommendlabel.f0 r15, final com.bilibili.pegasus.recommendlabel.InterfaceC5739h r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instruction units count: 3852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.l0.a(com.bilibili.pegasus.recommendlabel.f0, com.bilibili.pegasus.recommendlabel.h, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r7, java.util.List r8, java.lang.String r9, int r10, kotlin.jvm.functions.Function2 r11, kotlin.jvm.functions.Function0 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.l0.c(java.util.List, java.util.List, java.lang.String, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
