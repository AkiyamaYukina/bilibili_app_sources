package com.bilibili.studio.editor.moudle.editormain.track.drag;

import Mx0.g;
import android.animation.Animator;
import android.animation.ValueAnimator;
import by0.C5172a;
import by0.C5173b;
import com.bilibili.base.MainThread;
import com.bilibili.studio.editor.moudle.editormain.track.drag.DragService;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/drag/DragService.class */
public final class DragService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5173b.a f106161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f106162b = new a(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ScrollAnimator f106163c = new ScrollAnimator(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f106165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f106166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f106167g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f106168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f106169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lx0.a f106170k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/drag/DragService$ScrollAnimator.class */
    public final class ScrollAnimator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final b f106171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DragService f106172b;

        public ScrollAnimator(DragService dragService) {
            this.f106172b = dragService;
            b bVar = new b(dragService);
            this.f106171a = bVar;
            bVar.addListener(new Animator.AnimatorListener(this) { // from class: com.bilibili.studio.editor.moudle.editormain.track.drag.DragService.ScrollAnimator.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ScrollAnimator f106173a;

                {
                    this.f106173a = this;
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    MainThread.postOnMainThread(new DragService$ScrollAnimator$1$onAnimationEnd$1(this.f106173a));
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }

        public final void a() {
            int iG;
            b bVar = this.f106171a;
            if (bVar.isRunning()) {
                return;
            }
            DragService dragService = this.f106172b;
            if (dragService.f106161a.f57187a.getMMediaClipList().size() <= 1) {
                return;
            }
            int i7 = Lx0.b.f14863a;
            C5173b.a aVar = dragService.f106161a;
            int iF = aVar.f57187a.getMMediaClipList().size() == 1 ? i7 / 2 : dragService.f106165e != 0 ? dragService.f(0) : dragService.f(1) - Lx0.b.f14865c;
            C5173b c5173b = aVar.f57187a;
            if (c5173b.getMMediaClipList().size() == 1) {
                iG = i7 / 2;
            } else {
                int lastIndex = CollectionsKt.getLastIndex(c5173b.getMMediaClipList());
                iG = dragService.f106165e != lastIndex ? dragService.g(lastIndex) : dragService.g(lastIndex - 1) + Lx0.b.f14865c;
            }
            double d7 = dragService.f106167g;
            double d8 = Lx0.b.f14866d;
            boolean z6 = d7 <= d8;
            boolean z7 = iF < 0;
            if (z6 && z7) {
                bVar.a(Lx0.b.f14867e);
            }
            boolean z8 = ((double) dragService.f106167g) >= ((double) i7) - d8;
            boolean z9 = iG > i7;
            if (z8 && z9) {
                bVar.a(-Lx0.b.f14867e);
            }
            int i8 = dragService.f106167g;
            int i9 = i7 / 3;
            if (i8 - iG > i9) {
                bVar.a(Lx0.b.f14867e);
            }
            if (iF - dragService.f106167g > i9) {
                bVar.a(-Lx0.b.f14867e);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/drag/DragService$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ValueAnimator f106174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f106175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DragService f106176c;

        public a(final DragService dragService) {
            this.f106176c = dragService;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f106174a = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, dragService) { // from class: Lx0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DragService.a f14868a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DragService f14869b;

                {
                    this.f14868a = this;
                    this.f14869b = dragService;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DragService.a aVar = this.f14868a;
                    DragService dragService2 = this.f14869b;
                    aVar.f106175b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    dragService2.i();
                }
            });
            valueAnimatorOfFloat.setDuration(400L);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/track/drag/DragService$b.class */
    public final class b extends ValueAnimator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DragService f106177a;

        public b(DragService dragService) {
            this.f106177a = dragService;
            setFloatValues(0.0f, 1.0f);
            setDuration(300L);
        }

        public final void a(final int i7) {
            if (isRunning()) {
                cancel();
            }
            removeAllUpdateListeners();
            final Ref.IntRef intRef = new Ref.IntRef();
            final DragService dragService = this.f106177a;
            addUpdateListener(new ValueAnimator.AnimatorUpdateListener(i7, intRef, dragService) { // from class: Lx0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f14870a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.IntRef f14871b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final DragService f14872c;

                {
                    this.f14870a = i7;
                    this.f14871b = intRef;
                    this.f14872c = dragService;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i8 = this.f14870a;
                    Ref.IntRef intRef2 = this.f14871b;
                    DragService dragService2 = this.f14872c;
                    int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * i8);
                    int i9 = intRef2.element;
                    if (iFloatValue != i9) {
                        dragService2.f106166f = (iFloatValue - i9) + dragService2.f106166f;
                        intRef2.element = iFloatValue;
                        dragService2.i();
                    }
                }
            });
            start();
        }
    }

    public DragService(@NotNull C5173b.a aVar) {
        this.f106161a = aVar;
        this.f106170k = new Lx0.a(this, aVar);
    }

    public final int a(int i7, int i8) {
        return !this.f106164d ? i7 : i7 + ((int) ((i8 - i7) * this.f106162b.f106175b));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r6, int r7) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.track.drag.DragService.b(int, int):int");
    }

    public final int c(int i7, int i8) {
        int i9;
        boolean z6 = this.f106164d;
        int iA = i8;
        if (z6) {
            if (this.f106165e != i7) {
                iA = i8;
            } else {
                int i10 = g.h;
                int i11 = g.f16487g;
                int i12 = i10 + i11;
                int i13 = (i10 * 2) + i11;
                if (z6) {
                    if (i13 == 0) {
                        i9 = i8;
                    } else {
                        i9 = 0;
                        if (i10 != i12) {
                            i9 = (int) ((((((double) i13) * 1.0d) / ((double) (i12 - i10))) * ((double) (i8 - i10))) + ((double) 0));
                        }
                    }
                    iA = a(i8, i9);
                } else {
                    iA = i8;
                }
            }
        }
        return iA;
    }

    public final int d(int i7) {
        if (i7 <= this.f106165e) {
            int i8 = Lx0.b.f14863a;
            return (Lx0.b.f14864b * i7) + this.f106166f;
        }
        int i9 = Lx0.b.f14863a;
        int i10 = Lx0.b.f14864b;
        return (((i7 * i10) + this.f106166f) + Lx0.b.f14865c) - i10;
    }

    public final int e(int i7) {
        int i8;
        int i9;
        if (this.f106168i && (i8 = this.h) != (i9 = this.f106165e) && i7 >= Math.min(i8, i9) && i7 <= Math.max(this.h, this.f106165e) && this.f106165e < this.f106161a.f57187a.getMMediaClipList().size()) {
            int i10 = this.f106165e;
            if (i7 != i10) {
                return i10 < this.h ? this.f106169j - h(i10) : this.f106169j + h(i10);
            }
            int i11 = this.h;
            return i10 < i11 ? j(new IntRange(this.f106165e + 1, this.h)) + this.f106169j : this.f106169j - j(RangesKt.until(i11, i10));
        }
        return this.f106169j;
    }

    public final int f(int i7) {
        int i8;
        int i9;
        int i10 = this.f106165e;
        if (i7 == i10) {
            i8 = this.f106167g;
            int i11 = Lx0.b.f14863a;
            i9 = Lx0.b.f14865c / 2;
        } else {
            if (i7 < i10 && i7 < this.h) {
                int i12 = Lx0.b.f14863a;
                return (Lx0.b.f14864b * i7) + this.f106166f;
            }
            if (i7 > i10 && i7 > this.h) {
                int i13 = Lx0.b.f14863a;
                int i14 = Lx0.b.f14864b;
                return (((i7 * i14) + this.f106166f) + Lx0.b.f14865c) - i14;
            }
            int i15 = this.h;
            if (i10 < i15) {
                int i16 = Lx0.b.f14863a;
                int i17 = Lx0.b.f14864b;
                return ((i7 * i17) + this.f106166f) - i17;
            }
            if (i10 > i15) {
                int i18 = Lx0.b.f14863a;
                return (Lx0.b.f14864b * i7) + this.f106166f + Lx0.b.f14865c;
            }
            i8 = this.f106167g;
            int i19 = Lx0.b.f14863a;
            i9 = Lx0.b.f14865c / 2;
        }
        return i8 - i9;
    }

    public final int g(int i7) {
        int iF;
        int i8;
        if (i7 == this.f106165e) {
            iF = f(i7);
            int i9 = Lx0.b.f14863a;
            i8 = Lx0.b.f14865c;
        } else {
            iF = f(i7);
            int i10 = Lx0.b.f14863a;
            i8 = Lx0.b.f14864b;
        }
        return iF + i8;
    }

    public final int h(int i7) {
        C5173b c5173b = this.f106161a.f57187a;
        return ((C5172a) c5173b.getMMediaClipList().get(i7)).f57151r - ((C5172a) c5173b.getMMediaClipList().get(i7)).f57150q;
    }

    public final void i() {
        this.f106161a.f57187a.invalidate();
    }

    public final int j(IntRange intRange) {
        int first = intRange.getFirst();
        int last = intRange.getLast();
        int i7 = 0;
        int iH = 0;
        if (first <= last) {
            while (true) {
                int i8 = iH;
                iH = i8;
                if (first >= 0) {
                    iH = i8;
                    if (first < this.f106161a.f57187a.getMMediaClipList().size()) {
                        iH = h(first) + i8;
                    }
                }
                i7 = iH;
                if (first == last) {
                    break;
                }
                first++;
            }
        }
        return i7;
    }
}
