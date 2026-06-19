package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import androidx.collection.A;
import androidx.compose.foundation.lazy.layout.J;
import androidx.compose.foundation.lazy.layout.T;
import androidx.compose.foundation.lazy.layout.V;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.bilibili.ship.theseus.united.page.intro.module.promptbar.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/v.class */
public final class v implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f100768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.a f100769b;

    public v(float f7, w.a aVar) {
        this.f100768a = f7;
        this.f100769b = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.foundation.lazy.layout.T
    public final MeasureResult a(V v7, long j7) {
        int i7;
        int i8;
        final ArrayList arrayList = new ArrayList();
        SubcomposeMeasureScope subcomposeMeasureScope = v7.f34815b;
        final int iMo1265roundToPx0680j_4 = subcomposeMeasureScope.mo1265roundToPx0680j_4(this.f100768a);
        long jM3835copyZbe2FdA$default = Constraints.m3835copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null);
        int itemCount = this.f100769b.getItemCount();
        int i9 = 0;
        int width = 0;
        int iMax = 0;
        loop0: while (true) {
            i7 = width;
            i8 = iMax;
            if (i9 >= itemCount) {
                break;
            }
            A<List<Placeable>> a7 = v7.f34817d;
            List<Placeable> listB = a7.b(i9);
            List<Placeable> list = listB;
            if (listB == null) {
                J j8 = v7.f34816c;
                Object objH = j8.h(i9);
                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(objH, v7.f34814a.a(i9, objH, j8.g(i9)));
                int size = listSubcompose.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(listSubcompose.get(i10).mo3163measureBRTryo0(jM3835copyZbe2FdA$default));
                }
                a7.i(i9, arrayList2);
                list = arrayList2;
            }
            for (Placeable placeable : list) {
                i7 = width;
                i8 = iMax;
                if (placeable.getWidth() + width > Constraints.m3844getMaxWidthimpl(j7)) {
                    break loop0;
                }
                arrayList.add(placeable);
                width += placeable.getWidth() + iMo1265roundToPx0680j_4;
                iMax = Math.max(iMax, placeable.getHeight());
            }
            i9++;
        }
        return MeasureScope.layout$default(v7, RangesKt.a(i7 - iMo1265roundToPx0680j_4, new IntRange(Constraints.m3846getMinWidthimpl(j7), Constraints.m3844getMaxWidthimpl(j7))), RangesKt.a(i8, new IntRange(Constraints.m3845getMinHeightimpl(j7), Constraints.m3843getMaxHeightimpl(j7))), null, new Function1(arrayList, iMo1265roundToPx0680j_4) { // from class: com.bilibili.ship.theseus.united.page.intro.module.promptbar.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f100766a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f100767b;

            {
                this.f100766a = arrayList;
                this.f100767b = iMo1265roundToPx0680j_4;
            }

            public final Object invoke(Object obj) {
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                Iterator it = this.f100766a.iterator();
                int width2 = 0;
                while (true) {
                    int i11 = width2;
                    if (!it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                    Placeable placeable2 = (Placeable) it.next();
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i11, 0, 0.0f, 4, null);
                    width2 = i11 + placeable2.getWidth() + this.f100767b;
                }
            }
        }, 4, null);
    }
}
