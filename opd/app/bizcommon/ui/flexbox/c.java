package com.bilibili.opd.app.bizcommon.ui.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C3259x;
import androidx.collection.C3269h;
import androidx.core.view.MarginLayoutParamsCompat;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.opd.app.bizcommon.ui.flexbox.a f74642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f74643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public int[] f74644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public long[] f74645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public long[] f74646e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/c$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> f74647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74648b;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/c$b.class */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74650b;

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull b bVar) {
            b bVar2 = bVar;
            int i7 = this.f74650b;
            int i8 = bVar2.f74650b;
            return i7 != i8 ? i7 - i8 : this.f74649a - bVar2.f74649a;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.f74650b);
            sb.append(", index=");
            return C3269h.a(sb, this.f74649a, '}');
        }
    }

    public c(com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar) {
        this.f74642a = aVar;
    }

    public static List e(int i7, int i8, List list) {
        ArrayList arrayList = new ArrayList();
        com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar = new com.bilibili.opd.app.bizcommon.ui.flexbox.b();
        bVar.f74631g = (i7 - i8) / 2;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add((com.bilibili.opd.app.bizcommon.ui.flexbox.b) list.get(i9));
            if (i9 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i7, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i7];
        int i8 = 0;
        for (b bVar : (ArrayList) list) {
            int i9 = bVar.f74649a;
            iArr[i8] = i9;
            sparseIntArray.append(i9, bVar.f74650b);
            i8++;
        }
        return iArr;
    }

    public final void a(List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> list, com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar, int i7, int i8) {
        bVar.f74636m = i8;
        this.f74642a.onNewFlexLineAdded(bVar);
        bVar.f74639p = i7;
        list.add(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x075e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.bilibili.opd.app.bizcommon.ui.flexbox.c.a r8, int r9, int r10, int r11, int r12, int r13, @androidx.annotation.Nullable java.util.List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> r14) {
        /*
            Method dump skipped, instruction units count: 1931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.c.b(com.bilibili.opd.app.bizcommon.ui.flexbox.c$a, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r7, android.view.View r8) {
        /*
            r6 = this;
            r0 = r8
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem r0 = (com.bilibili.opd.app.bizcommon.ui.flexbox.FlexItem) r0
            r14 = r0
            r0 = r8
            int r0 = r0.getMeasuredWidth()
            r10 = r0
            r0 = r8
            int r0 = r0.getMeasuredHeight()
            r12 = r0
            r0 = r14
            int r0 = r0.getMinWidth()
            r9 = r0
            r0 = 1
            r11 = r0
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L3a
            r0 = r14
            int r0 = r0.getMinWidth()
            r9 = r0
        L2e:
            r0 = 1
            r13 = r0
            r0 = r9
            r10 = r0
            r0 = r13
            r9 = r0
            goto L53
        L3a:
            r0 = r10
            r1 = r14
            int r1 = r1.getMaxWidth()
            if (r0 <= r1) goto L51
            r0 = r14
            int r0 = r0.getMaxWidth()
            r9 = r0
            goto L2e
        L51:
            r0 = 0
            r9 = r0
        L53:
            r0 = r12
            r1 = r14
            int r1 = r1.getMinHeight()
            if (r0 >= r1) goto L6a
            r0 = r14
            int r0 = r0.getMinHeight()
            r9 = r0
            goto L87
        L6a:
            r0 = r12
            r1 = r14
            int r1 = r1.getMaxHeight()
            if (r0 <= r1) goto L81
            r0 = r14
            int r0 = r0.getMaxHeight()
            r9 = r0
            goto L87
        L81:
            r0 = r9
            r11 = r0
            r0 = r12
            r9 = r0
        L87:
            r0 = r11
            if (r0 == 0) goto Lb7
            r0 = r10
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r10 = r0
            r0 = r9
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r0
            r0 = r8
            r1 = r10
            r2 = r9
            r0.measure(r1, r2)
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = r9
            r4 = r8
            r0.v(r1, r2, r3, r4)
            r0 = r6
            com.bilibili.opd.app.bizcommon.ui.flexbox.a r0 = r0.f74642a
            r1 = r7
            r2 = r8
            r0.updateViewCache(r1, r2)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.ui.flexbox.c.c(int, android.view.View):void");
    }

    public final void d(int i7, List list) {
        int i8 = this.f74644c[i7];
        int i9 = i8;
        if (i8 == -1) {
            i9 = 0;
        }
        if (list.size() > i9) {
            list.subList(i9, list.size()).clear();
        }
        int[] iArr = this.f74644c;
        int length = iArr.length - 1;
        if (i7 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i7, length, -1);
        }
        long[] jArr = this.f74645d;
        int length2 = jArr.length - 1;
        if (i7 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i7, length2, 0L);
        }
    }

    @NonNull
    public final List<b> f(int i7) {
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            FlexItem flexItem = (FlexItem) this.f74642a.getFlexItemAt(i8).getLayoutParams();
            b bVar = new b();
            bVar.f74650b = flexItem.getOrder();
            bVar.f74649a = i8;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void g(int i7, int i8, int i9) {
        int size;
        int mode;
        float f7;
        int i10;
        com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
        int flexDirection = aVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i8);
            size = View.MeasureSpec.getSize(i8);
            mode = mode2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(C3259x.a(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i7);
            size = View.MeasureSpec.getSize(i7);
        }
        List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> flexLinesInternal = aVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = aVar.getSumOfCrossSize() + i9;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f74631g = size - i9;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = aVar.getAlignContent();
                if (alignContent == 1) {
                    com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar = new com.bilibili.opd.app.bizcommon.ui.flexbox.b();
                    bVar.f74631g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, bVar);
                    return;
                }
                if (alignContent == 2) {
                    aVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f8 = 0.0f;
                    int i11 = 0;
                    while (i11 < size3) {
                        arrayList.add(flexLinesInternal.get(i11));
                        float f9 = f8;
                        if (i11 != flexLinesInternal.size() - 1) {
                            com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar2 = new com.bilibili.opd.app.bizcommon.ui.flexbox.b();
                            if (i11 == flexLinesInternal.size() - 2) {
                                bVar2.f74631g = Math.round(f8 + size2);
                                f8 = 0.0f;
                            } else {
                                bVar2.f74631g = Math.round(size2);
                            }
                            int i12 = bVar2.f74631g;
                            float f10 = (size2 - i12) + f8;
                            if (f10 > 1.0f) {
                                bVar2.f74631g = i12 + 1;
                                f7 = f10 - 1.0f;
                            } else {
                                f7 = f10;
                                if (f10 < -1.0f) {
                                    bVar2.f74631g = i12 - 1;
                                    f7 = f10 + 1.0f;
                                }
                            }
                            arrayList.add(bVar2);
                            f9 = f7;
                        }
                        i11++;
                        f8 = f9;
                    }
                    aVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        aVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar3 = new com.bilibili.opd.app.bizcommon.ui.flexbox.b();
                    bVar3.f74631g = size4;
                    for (com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar4 : flexLinesInternal) {
                        arrayList2.add(bVar3);
                        arrayList2.add(bVar4);
                        arrayList2.add(bVar3);
                    }
                    aVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    for (int i13 = 0; i13 < size6; i13++) {
                        com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar5 = flexLinesInternal.get(i13);
                        float f12 = bVar5.f74631g + size5;
                        float f13 = f11;
                        float f14 = f12;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f14 = f12 + f11;
                            f13 = 0.0f;
                        }
                        int iRound = Math.round(f14);
                        float f15 = (f14 - iRound) + f13;
                        if (f15 > 1.0f) {
                            i10 = iRound + 1;
                            f11 = f15 - 1.0f;
                        } else {
                            f11 = f15;
                            i10 = iRound;
                            if (f15 < -1.0f) {
                                i10 = iRound - 1;
                                f11 = f15 + 1.0f;
                            }
                        }
                        bVar5.f74631g = i10;
                    }
                }
            }
        }
    }

    public final void h(int i7, int i8, int i9) {
        int paddingLeft;
        int paddingRight;
        int i10;
        com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
        int flexItemCount = aVar.getFlexItemCount();
        boolean[] zArr = this.f74643b;
        if (zArr == null) {
            this.f74643b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f74643b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i9 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        int flexDirection2 = aVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            int largestMainSize = aVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = aVar.getPaddingLeft();
            paddingRight = aVar.getPaddingRight();
            i10 = size;
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(C3259x.a(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i8);
            if (mode2 != 1073741824) {
                size2 = aVar.getLargestMainSize();
            }
            paddingLeft = aVar.getPaddingTop();
            paddingRight = aVar.getPaddingBottom();
            i10 = size2;
        }
        int i11 = paddingRight + paddingLeft;
        int[] iArr = this.f74644c;
        int i12 = 0;
        if (iArr != null) {
            i12 = iArr[i9];
        }
        List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> flexLinesInternal = aVar.getFlexLinesInternal();
        int size3 = flexLinesInternal.size();
        while (i12 < size3) {
            com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar = flexLinesInternal.get(i12);
            int i13 = bVar.f74629e;
            if (i13 < i10 && bVar.f74640q) {
                l(i7, i8, bVar, i10, i11, false);
            } else if (i13 > i10 && bVar.f74641r) {
                q(i7, i8, bVar, i10, i11, false);
            }
            i12++;
        }
    }

    public final void i(int i7) {
        int[] iArr = this.f74644c;
        if (iArr == null) {
            this.f74644c = new int[Math.max(i7, 10)];
        } else if (iArr.length < i7) {
            this.f74644c = Arrays.copyOf(this.f74644c, Math.max(iArr.length * 2, i7));
        }
    }

    public final void j(int i7) {
        long[] jArr = this.f74645d;
        if (jArr == null) {
            this.f74645d = new long[Math.max(i7, 10)];
        } else if (jArr.length < i7) {
            this.f74645d = Arrays.copyOf(this.f74645d, Math.max(jArr.length * 2, i7));
        }
    }

    public final void k(int i7) {
        long[] jArr = this.f74646e;
        if (jArr == null) {
            this.f74646e = new long[Math.max(i7, 10)];
        } else if (jArr.length < i7) {
            this.f74646e = Arrays.copyOf(this.f74646e, Math.max(jArr.length * 2, i7));
        }
    }

    public final void l(int i7, int i8, com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar, int i9, int i10, boolean z6) {
        int i11;
        int iMax;
        int maxWidth;
        double d7;
        int maxHeight;
        double d8;
        float f7 = bVar.f74633j;
        if (f7 <= 0.0f || i9 < (i11 = bVar.f74629e)) {
            return;
        }
        float f8 = (i9 - i11) / f7;
        bVar.f74629e = i10 + bVar.f74630f;
        if (!z6) {
            bVar.f74631g = Integer.MIN_VALUE;
        }
        boolean z7 = false;
        int i12 = 0;
        float f9 = 0.0f;
        for (int i13 = 0; i13 < bVar.h; i13++) {
            int i14 = bVar.f74638o + i13;
            com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
            View reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i14);
            if (reorderedFlexItemAt != null && reorderedFlexItemAt.getVisibility() != 8) {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = aVar.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.f74646e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i14];
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.f74646e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i14] >> 32);
                    }
                    if (!this.f74643b[i14] && flexItem.getFlexGrow() > 0.0f) {
                        float flexGrow = (flexItem.getFlexGrow() * f8) + measuredWidth;
                        float f10 = flexGrow;
                        float f11 = f9;
                        if (i13 == bVar.h - 1) {
                            f10 = flexGrow + f9;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f10);
                        if (iRound > flexItem.getMaxWidth()) {
                            maxWidth = flexItem.getMaxWidth();
                            this.f74643b[i14] = true;
                            bVar.f74633j -= flexItem.getFlexGrow();
                            z7 = true;
                        } else {
                            float f12 = (f10 - iRound) + f11;
                            double d9 = f12;
                            if (d9 > 1.0d) {
                                maxWidth = iRound + 1;
                                d7 = d9 - 1.0d;
                            } else {
                                maxWidth = iRound;
                                if (d9 < -1.0d) {
                                    maxWidth = iRound - 1;
                                    d7 = d9 + 1.0d;
                                }
                                f11 = f12;
                            }
                            f12 = (float) d7;
                            f11 = f12;
                        }
                        int iM = m(i8, flexItem, bVar.f74636m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(maxWidth, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, iM);
                        measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                        measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                        v(i14, iMakeMeasureSpec, iM, reorderedFlexItemAt);
                        aVar.updateViewCache(i14, reorderedFlexItemAt);
                        f9 = f11;
                    }
                    int iMax2 = Math.max(i12, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom());
                    bVar.f74629e = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + bVar.f74629e;
                    iMax = iMax2;
                } else {
                    int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.f74646e;
                    if (jArr3 != null) {
                        measuredHeight2 = (int) (jArr3[i14] >> 32);
                    }
                    int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.f74646e;
                    if (jArr4 != null) {
                        measuredWidth2 = (int) jArr4[i14];
                    }
                    if (!this.f74643b[i14] && flexItem.getFlexGrow() > 0.0f) {
                        float flexGrow2 = (flexItem.getFlexGrow() * f8) + measuredHeight2;
                        float f13 = flexGrow2;
                        float f14 = f9;
                        if (i13 == bVar.h - 1) {
                            f13 = flexGrow2 + f9;
                            f14 = 0.0f;
                        }
                        int iRound2 = Math.round(f13);
                        if (iRound2 > flexItem.getMaxHeight()) {
                            maxHeight = flexItem.getMaxHeight();
                            this.f74643b[i14] = true;
                            bVar.f74633j -= flexItem.getFlexGrow();
                            z7 = true;
                        } else {
                            float f15 = (f13 - iRound2) + f14;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                maxHeight = iRound2 + 1;
                                d8 = d10 - 1.0d;
                            } else {
                                maxHeight = iRound2;
                                if (d10 < -1.0d) {
                                    maxHeight = iRound2 - 1;
                                    d8 = d10 + 1.0d;
                                }
                                f14 = f15;
                            }
                            f15 = (float) d8;
                            f14 = f15;
                        }
                        int iN = n(i7, flexItem, bVar.f74636m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(maxHeight, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
                        reorderedFlexItemAt.measure(iN, iMakeMeasureSpec2);
                        measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i14, iN, iMakeMeasureSpec2, reorderedFlexItemAt);
                        aVar.updateViewCache(i14, reorderedFlexItemAt);
                        f9 = f14;
                    }
                    iMax = Math.max(i12, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + measuredWidth2 + flexItem.getMarginLeft() + flexItem.getMarginRight());
                    bVar.f74629e = measuredHeight2 + flexItem.getMarginTop() + flexItem.getMarginBottom() + bVar.f74629e;
                }
                bVar.f74631g = Math.max(bVar.f74631g, iMax);
                i12 = iMax;
            }
        }
        if (!z7 || i11 == bVar.f74629e) {
            return;
        }
        l(i7, i8, bVar, i9, i10, true);
    }

    public final int m(int i7, FlexItem flexItem, int i8) {
        int iMakeMeasureSpec;
        com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
        int childHeightMeasureSpec = aVar.getChildHeightMeasureSpec(i7, aVar.getPaddingBottom() + aVar.getPaddingTop() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i8, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        if (size > flexItem.getMaxHeight()) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        } else {
            iMakeMeasureSpec = childHeightMeasureSpec;
            if (size < flexItem.getMinHeight()) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
            }
        }
        return iMakeMeasureSpec;
    }

    public final int n(int i7, FlexItem flexItem, int i8) {
        int iMakeMeasureSpec;
        com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
        int childWidthMeasureSpec = aVar.getChildWidthMeasureSpec(i7, aVar.getPaddingRight() + aVar.getPaddingLeft() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i8, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        if (size > flexItem.getMaxWidth()) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        } else {
            iMakeMeasureSpec = childWidthMeasureSpec;
            if (size < flexItem.getMinWidth()) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
            }
        }
        return iMakeMeasureSpec;
    }

    public final void o(View view, com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar, int i7, int i8, int i9, int i10) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
        int alignItems = aVar.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i11 = bVar.f74631g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (aVar.getFlexWrap() == 2) {
                    view.layout(i7, view.getMeasuredHeight() + (i8 - i11) + flexItem.getMarginTop(), i9, view.getMeasuredHeight() + (i10 - i11) + flexItem.getMarginTop());
                    return;
                } else {
                    int i12 = i8 + i11;
                    view.layout(i7, (i12 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i9, i12 - flexItem.getMarginBottom());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i11 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                if (aVar.getFlexWrap() != 2) {
                    int i13 = i8 + measuredHeight;
                    view.layout(i7, i13, i9, view.getMeasuredHeight() + i13);
                    return;
                } else {
                    int i14 = i8 - measuredHeight;
                    view.layout(i7, i14, i9, view.getMeasuredHeight() + i14);
                    return;
                }
            }
            if (alignItems == 3) {
                if (aVar.getFlexWrap() != 2) {
                    int iMax = Math.max(bVar.f74635l - view.getBaseline(), flexItem.getMarginTop());
                    view.layout(i7, i8 + iMax, i9, i10 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (bVar.f74635l - view.getMeasuredHeight()), flexItem.getMarginBottom());
                    view.layout(i7, i8 - iMax2, i9, i10 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (aVar.getFlexWrap() != 2) {
            view.layout(i7, i8 + flexItem.getMarginTop(), i9, i10 + flexItem.getMarginTop());
        } else {
            view.layout(i7, i8 - flexItem.getMarginBottom(), i9, i10 - flexItem.getMarginBottom());
        }
    }

    public final void p(View view, com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar, boolean z6, int i7, int i8, int i9, int i10) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f74642a.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i11 = bVar.f74631g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z6) {
                    view.layout(view.getMeasuredWidth() + (i7 - i11) + flexItem.getMarginLeft(), i8, view.getMeasuredWidth() + (i9 - i11) + flexItem.getMarginLeft(), i10);
                    return;
                } else {
                    view.layout(((i7 + i11) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i8, ((i9 + i11) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i10);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + (i11 - view.getMeasuredWidth())) - MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams)) / 2;
                if (z6) {
                    view.layout(i7 - marginStart, i8, i9 - marginStart, i10);
                    return;
                } else {
                    view.layout(i7 + marginStart, i8, i9 + marginStart, i10);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z6) {
            view.layout(i7 - flexItem.getMarginRight(), i8, i9 - flexItem.getMarginRight(), i10);
        } else {
            view.layout(i7 + flexItem.getMarginLeft(), i8, i9 + flexItem.getMarginLeft(), i10);
        }
    }

    public final void q(int i7, int i8, com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar, int i9, int i10, boolean z6) {
        int i11;
        int minWidth;
        boolean z7;
        int minHeight;
        int i12 = bVar.f74629e;
        float f7 = bVar.f74634k;
        if (f7 <= 0.0f || i9 > i12) {
            return;
        }
        float f8 = (i12 - i9) / f7;
        bVar.f74629e = i10 + bVar.f74630f;
        if (!z6) {
            bVar.f74631g = Integer.MIN_VALUE;
        }
        int i13 = 0;
        boolean z8 = false;
        int i14 = 0;
        float f9 = 0.0f;
        while (i13 < bVar.h) {
            int i15 = bVar.f74638o + i13;
            com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
            View reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i15);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                i11 = i14;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = aVar.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    float f10 = f9;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.f74646e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i15];
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.f74646e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i15] >> 32);
                    }
                    if (this.f74643b[i15] || flexItem.getFlexShrink() <= 0.0f) {
                        f9 = f10;
                    } else {
                        float flexShrink = measuredWidth - (flexItem.getFlexShrink() * f8);
                        float f11 = flexShrink;
                        f9 = f10;
                        if (i13 == bVar.h - 1) {
                            f11 = flexShrink + f10;
                            f9 = 0.0f;
                        }
                        int iRound = Math.round(f11);
                        if (iRound < flexItem.getMinWidth()) {
                            minWidth = flexItem.getMinWidth();
                            this.f74643b[i15] = true;
                            bVar.f74634k -= flexItem.getFlexShrink();
                            z8 = true;
                        } else {
                            float f12 = (f11 - iRound) + f9;
                            double d7 = f12;
                            if (d7 > 1.0d) {
                                minWidth = iRound + 1;
                                f9 = f12 - 1.0f;
                            } else {
                                f9 = f12;
                                minWidth = iRound;
                                if (d7 < -1.0d) {
                                    minWidth = iRound - 1;
                                    f9 = f12 + 1.0f;
                                }
                            }
                        }
                        int iM = m(i8, flexItem, bVar.f74636m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(minWidth, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, iM);
                        measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                        measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                        v(i15, iMakeMeasureSpec, iM, reorderedFlexItemAt);
                        aVar.updateViewCache(i15, reorderedFlexItemAt);
                    }
                    int iMax = Math.max(i14, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom());
                    bVar.f74629e = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + bVar.f74629e;
                    i11 = iMax;
                } else {
                    int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.f74646e;
                    if (jArr3 != null) {
                        measuredHeight2 = (int) (jArr3[i15] >> 32);
                    }
                    int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.f74646e;
                    if (jArr4 != null) {
                        measuredWidth2 = (int) jArr4[i15];
                    }
                    if (!this.f74643b[i15] && flexItem.getFlexShrink() > 0.0f) {
                        float flexShrink2 = measuredHeight2 - (flexItem.getFlexShrink() * f8);
                        if (i13 == bVar.h - 1) {
                            flexShrink2 += f9;
                            f9 = 0.0f;
                        }
                        int iRound2 = Math.round(flexShrink2);
                        if (iRound2 < flexItem.getMinHeight()) {
                            minHeight = flexItem.getMinHeight();
                            this.f74643b[i15] = true;
                            bVar.f74634k -= flexItem.getFlexShrink();
                            z7 = true;
                        } else {
                            float f13 = (flexShrink2 - iRound2) + f9;
                            double d8 = f13;
                            if (d8 > 1.0d) {
                                minHeight = iRound2 + 1;
                                f9 = f13 - 1.0f;
                                z7 = z8;
                            } else {
                                z7 = z8;
                                f9 = f13;
                                minHeight = iRound2;
                                if (d8 < -1.0d) {
                                    minHeight = iRound2 - 1;
                                    f9 = f13 + 1.0f;
                                    z7 = z8;
                                }
                            }
                        }
                        int iN = n(i7, flexItem, bVar.f74636m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(minHeight, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
                        reorderedFlexItemAt.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                        measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        v(i15, iN, iMakeMeasureSpec2, reorderedFlexItemAt);
                        aVar.updateViewCache(i15, reorderedFlexItemAt);
                        z8 = z7;
                        measuredWidth2 = measuredWidth3;
                    }
                    int iMax2 = Math.max(i14, aVar.getDecorationLengthCrossAxis(reorderedFlexItemAt) + measuredWidth2 + flexItem.getMarginLeft() + flexItem.getMarginRight());
                    bVar.f74629e = measuredHeight2 + flexItem.getMarginTop() + flexItem.getMarginBottom() + bVar.f74629e;
                    i11 = iMax2;
                }
                bVar.f74631g = Math.max(bVar.f74631g, i11);
            }
            i13++;
            i14 = i11;
        }
        if (!z8 || i12 == bVar.f74629e) {
            return;
        }
        q(i7, i8, bVar, i9, i10, true);
    }

    public final void s(int i7, int i8, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int marginLeft = flexItem.getMarginLeft();
        int marginRight = flexItem.getMarginRight();
        com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
        int iMin = Math.min(Math.max(((i7 - marginLeft) - marginRight) - aVar.getDecorationLengthCrossAxis(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.f74646e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i8] >> 32) : view.getMeasuredHeight(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        v(i8, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        aVar.updateViewCache(i8, view);
    }

    public final void t(int i7, int i8, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int marginTop = flexItem.getMarginTop();
        int marginBottom = flexItem.getMarginBottom();
        com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
        int iMin = Math.min(Math.max(((i7 - marginTop) - marginBottom) - aVar.getDecorationLengthCrossAxis(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.f74646e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i8] : view.getMeasuredWidth(), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        v(i8, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        aVar.updateViewCache(i8, view);
    }

    public final void u(int i7) {
        View reorderedFlexItemAt;
        com.bilibili.opd.app.bizcommon.ui.flexbox.a aVar = this.f74642a;
        if (i7 >= aVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = aVar.getFlexDirection();
        if (aVar.getAlignItems() != 4) {
            for (com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar : aVar.getFlexLinesInternal()) {
                for (Integer num : (ArrayList) bVar.f74637n) {
                    View reorderedFlexItemAt2 = aVar.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(bVar.f74631g, num.intValue(), reorderedFlexItemAt2);
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(C3259x.a(flexDirection, "Invalid flex direction: "));
                        }
                        s(bVar.f74631g, num.intValue(), reorderedFlexItemAt2);
                    }
                }
            }
            return;
        }
        int[] iArr = this.f74644c;
        List<com.bilibili.opd.app.bizcommon.ui.flexbox.b> flexLinesInternal = aVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i8 = iArr != null ? iArr[i7] : 0; i8 < size; i8++) {
            com.bilibili.opd.app.bizcommon.ui.flexbox.b bVar2 = flexLinesInternal.get(i8);
            int i9 = bVar2.h;
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = bVar2.f74638o + i10;
                if (i10 < aVar.getFlexItemCount() && (reorderedFlexItemAt = aVar.getReorderedFlexItemAt(i11)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(bVar2.f74631g, i11, reorderedFlexItemAt);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(C3259x.a(flexDirection, "Invalid flex direction: "));
                            }
                            s(bVar2.f74631g, i11, reorderedFlexItemAt);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i7, int i8, int i9, View view) {
        long[] jArr = this.f74645d;
        if (jArr != null) {
            jArr[i7] = (((long) i8) & 4294967295L) | (((long) i9) << 32);
        }
        long[] jArr2 = this.f74646e;
        if (jArr2 != null) {
            jArr2[i7] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
