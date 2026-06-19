package com.bilibili.lib.projection.internal.search;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import ge0.InterfaceC7274d;
import ie0.C7564c;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;
import me0.InterfaceC7969a;

/* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/g.class */
public final class C5328g<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionGlobalLinkFragmentV2 f63724a;

    public C5328g(ProjectionGlobalLinkFragmentV2 projectionGlobalLinkFragmentV2) {
        this.f63724a = projectionGlobalLinkFragmentV2;
    }

    public final void accept(Object obj) {
        int i7;
        Ed0.b bVar;
        IProjectionItem iProjectionItemN;
        T next;
        ProjectionGlobalLinkFragmentV2 projectionGlobalLinkFragmentV2 = this.f63724a;
        projectionGlobalLinkFragmentV2.getClass();
        ArrayList arrayList = new ArrayList();
        List list = (List) obj;
        ArrayList<InterfaceC7274d> arrayList2 = new ArrayList();
        for (T t7 : list) {
            InterfaceC7274d interfaceC7274d = (InterfaceC7274d) t7;
            if (interfaceC7274d instanceof InterfaceC7969a) {
                Iterator<T> it = list.iterator();
                while (true) {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    InterfaceC7274d interfaceC7274d2 = (InterfaceC7274d) next;
                    if (Intrinsics.areEqual(interfaceC7274d2.getUuid(), interfaceC7274d.getUuid()) && (interfaceC7274d2 instanceof se0.f)) {
                        break;
                    }
                }
                if (next == null) {
                }
            }
            arrayList2.add(t7);
        }
        InterfaceC7845m interfaceC7845mH = C7564c.f121625a.h(projectionGlobalLinkFragmentV2.f63555f);
        if (((interfaceC7845mH == null || (iProjectionItemN = interfaceC7845mH.n(false)) == null) ? 1 : iProjectionItemN.getClientType()) != 1) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (!StringsKt.n(((InterfaceC7274d) obj2).getUuid(), "mirror")) {
                    arrayList3.add(obj2);
                }
            }
        }
        for (InterfaceC7274d interfaceC7274d3 : arrayList2) {
            ProjectionDeviceInternal projectionDeviceInternal = interfaceC7274d3 instanceof ProjectionDeviceInternal ? (ProjectionDeviceInternal) interfaceC7274d3 : null;
            if (projectionDeviceInternal != null && StringsKt.n(projectionDeviceInternal.getName(), "我的小电视")) {
                NirvanaEngine.a aVar = projectionDeviceInternal instanceof NirvanaEngine.a ? (NirvanaEngine.a) projectionDeviceInternal : null;
                if (aVar == null || (bVar = aVar.f63247a) == null || !StringsKt.n(bVar.getUuid(), "_sdk")) {
                    if (Integer.parseInt(projectionDeviceInternal.getVersion()) >= 104001 && ((projectionDeviceInternal instanceof InterfaceC7969a) || (projectionDeviceInternal instanceof se0.f))) {
                        arrayList.add(projectionDeviceInternal);
                    }
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        ProjectionDeviceInternal projectionDeviceInternal2 = (ProjectionDeviceInternal) C7564c.f121640q.f63106g.e();
        if (projectionDeviceInternal2 == null || (projectionDeviceInternal2 instanceof ProjectionDeviceInternal.b)) {
            projectionGlobalLinkFragmentV2.kf(null, arrayList4, false);
            return;
        }
        String uuid = projectionDeviceInternal2.getUuid();
        if (uuid.length() == 0) {
            i7 = -1;
        } else {
            int size = arrayList4.size();
            int i8 = 0;
            while (true) {
                i7 = -1;
                if (i8 >= size) {
                    break;
                }
                if (Intrinsics.areEqual(uuid, ((ProjectionDeviceInternal) arrayList4.get(i8)).getUuid())) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
        }
        if (i7 >= 0) {
            projectionDeviceInternal2.l(((ProjectionDeviceInternal) arrayList4.remove(i7)).getDisplayName());
        }
        projectionGlobalLinkFragmentV2.kf(Ie0.d.d(projectionDeviceInternal2), arrayList4, true);
    }
}
