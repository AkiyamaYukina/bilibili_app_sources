package com.bilibili.search2.result.widget;

import E80.H;
import Sw.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import com.bilibili.search2.result.widget.h;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/h.class */
@StabilityInferred(parameters = 0)
public final class h extends Fi.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public static TimeInterpolator f88608n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final H f88609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<RecyclerView.ViewHolder> f88610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<RecyclerView.ViewHolder> f88611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList<b> f88612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f88613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> f88614g;

    @NotNull
    public final ArrayList<ArrayList<b>> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ArrayList<ArrayList<a>> f88615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ArrayList<RecyclerView.ViewHolder> f88616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ArrayList<RecyclerView.ViewHolder> f88617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ArrayList<RecyclerView.ViewHolder> f88618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayList<RecyclerView.ViewHolder> f88619m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/h$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public RecyclerView.ViewHolder f88620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public RecyclerView.ViewHolder f88621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f88622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f88623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f88624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f88625f;

        @NotNull
        public final String toString() {
            RecyclerView.ViewHolder viewHolder = this.f88621b;
            RecyclerView.ViewHolder viewHolder2 = this.f88620a;
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(viewHolder);
            sb.append(", newHolder=");
            sb.append(viewHolder2);
            sb.append(", fromX=");
            sb.append(this.f88622c);
            sb.append(", fromY=");
            sb.append(this.f88623d);
            sb.append(", toX=");
            sb.append(this.f88624e);
            sb.append(", toY=");
            return C4277b.a(this.f88625f, ReporterMap.RIGHT_BRACES, sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/h$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public RecyclerView.ViewHolder f88626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f88627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f88628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f88629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f88630e;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/widget/h$c.class */
    public final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f88631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView.ViewHolder f88632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewPropertyAnimator f88633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f88634d;

        public c(View view, ViewPropertyAnimator viewPropertyAnimator, RecyclerView.ViewHolder viewHolder, h hVar) {
            this.f88631a = hVar;
            this.f88632b = viewHolder;
            this.f88633c = viewPropertyAnimator;
            this.f88634d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f88633c.setListener(null);
            this.f88634d.setAlpha(1.0f);
            this.f88631a.dispatchRemoveFinished(this.f88632b);
            this.f88631a.f88618l.remove(this.f88632b);
            this.f88631a.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f88631a.dispatchRemoveStarting(this.f88632b);
        }
    }

    public h(@NotNull H h) {
        this.f88609b = h;
        a(new g(this));
        this.f88610c = new ArrayList<>();
        this.f88611d = new ArrayList<>();
        this.f88612e = new ArrayList<>();
        this.f88613f = new ArrayList<>();
        this.f88614g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.f88615i = new ArrayList<>();
        this.f88616j = new ArrayList<>();
        this.f88617k = new ArrayList<>();
        this.f88618l = new ArrayList<>();
        this.f88619m = new ArrayList<>();
    }

    public static void b(List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i7 = size - 1;
            ((RecyclerView.ViewHolder) ((ArrayList) list).get(size)).itemView.animate().cancel();
            if (i7 < 0) {
                return;
            } else {
                size = i7;
            }
        }
    }

    public final boolean animateAdd(@NotNull RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f88611d.add(viewHolder);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [com.bilibili.search2.result.widget.h$a, java.lang.Object] */
    public final boolean animateChange(@NotNull RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ViewHolder viewHolder2, int i7, int i8, int i9, int i10) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i7, i8, i9, i10);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i11 = (int) ((i9 - i7) - translationX);
        int i12 = (int) ((i10 - i8) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i11);
            viewHolder2.itemView.setTranslationY(-i12);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        ArrayList<a> arrayList = this.f88613f;
        ?? obj = new Object();
        obj.f88620a = viewHolder2;
        obj.f88621b = viewHolder;
        obj.f88622c = i7;
        obj.f88623d = i8;
        obj.f88624e = i9;
        obj.f88625f = i10;
        arrayList.add((a) obj);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.bilibili.search2.result.widget.h$b, java.lang.Object] */
    public final boolean animateMove(@NotNull RecyclerView.ViewHolder viewHolder, int i7, int i8, int i9, int i10) {
        View view = viewHolder.itemView;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) viewHolder.itemView.getTranslationY());
        resetAnimation(viewHolder);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        ArrayList<b> arrayList = this.f88612e;
        ?? obj = new Object();
        obj.f88626a = viewHolder;
        obj.f88627b = translationX;
        obj.f88628c = translationY;
        obj.f88629d = i9;
        obj.f88630e = i10;
        arrayList.add((b) obj);
        return true;
    }

    public final boolean animateRemove(@NotNull RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        this.f88610c.add(viewHolder);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(a aVar, RecyclerView.ViewHolder viewHolder) {
        boolean z6 = false;
        if (aVar.f88620a == viewHolder) {
            aVar.f88620a = null;
        } else {
            if (aVar.f88621b != viewHolder) {
                return false;
            }
            aVar.f88621b = null;
            z6 = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z6);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean canReuseUpdatedViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull List<? extends Object> list) {
        return !list.isEmpty() || super/*androidx.recyclerview.widget.DefaultItemAnimator*/.canReuseUpdatedViewHolder(viewHolder, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void endAnimation(@NotNull RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.f88612e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                if (this.f88612e.get(size).f88626a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    this.f88612e.remove(size);
                }
                if (i7 < 0) {
                    break;
                } else {
                    size = i7;
                }
            }
        }
        endChangeAnimation(this.f88613f, viewHolder);
        if (this.f88610c.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.f88611d.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        int size2 = this.f88615i.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i8 = size2 - 1;
                ArrayList<a> arrayList = this.f88615i.get(size2);
                endChangeAnimation(arrayList, viewHolder);
                if (arrayList.isEmpty()) {
                    this.f88615i.remove(size2);
                }
                if (i8 < 0) {
                    break;
                } else {
                    size2 = i8;
                }
            }
        }
        int size3 = this.h.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i9 = size3 - 1;
                ArrayList<b> arrayList2 = this.h.get(size3);
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i10 = size4 - 1;
                        if (arrayList2.get(size4).f88626a == viewHolder) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            dispatchMoveFinished(viewHolder);
                            arrayList2.remove(size4);
                            if (arrayList2.isEmpty()) {
                                this.h.remove(size3);
                            }
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size4 = i10;
                        }
                    }
                }
                if (i9 < 0) {
                    break;
                } else {
                    size3 = i9;
                }
            }
        }
        int size5 = this.f88614g.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i11 = size5 - 1;
                ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f88614g.get(size5);
                if (arrayList3.remove(viewHolder)) {
                    view.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder);
                    if (arrayList3.isEmpty()) {
                        this.f88614g.remove(size5);
                    }
                }
                if (i11 < 0) {
                    break;
                } else {
                    size5 = i11;
                }
            }
        }
        dispatchFinishedWhenDone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void endAnimations() {
        for (int size = this.f88612e.size() - 1; -1 < size; size--) {
            b bVar = this.f88612e.get(size);
            View view = bVar.f88626a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(bVar.f88626a);
            this.f88612e.remove(size);
        }
        for (int size2 = this.f88610c.size() - 1; -1 < size2; size2--) {
            dispatchRemoveFinished(this.f88610c.get(size2));
            this.f88610c.remove(size2);
        }
        for (int size3 = this.f88611d.size() - 1; -1 < size3; size3--) {
            RecyclerView.ViewHolder viewHolder = this.f88611d.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.f88611d.remove(size3);
        }
        for (int size4 = this.f88613f.size() - 1; -1 < size4; size4--) {
            a aVar = this.f88613f.get(size4);
            RecyclerView.ViewHolder viewHolder2 = aVar.f88621b;
            if (viewHolder2 != null) {
                c(aVar, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = aVar.f88620a;
            if (viewHolder3 != null) {
                c(aVar, viewHolder3);
            }
        }
        this.f88613f.clear();
        if (isRunning()) {
            for (int size5 = this.h.size() - 1; -1 < size5; size5--) {
                ArrayList<b> arrayList = this.h.get(size5);
                for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f88626a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(bVar2.f88626a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.h.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f88614g.size() - 1; -1 < size7; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f88614g.get(size7);
                for (int size8 = arrayList2.size() - 1; -1 < size8; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = arrayList2.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f88614g.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f88615i.size() - 1; -1 < size9; size9--) {
                ArrayList<a> arrayList3 = this.f88615i.get(size9);
                for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                    a aVar2 = arrayList3.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = aVar2.f88621b;
                    if (viewHolder5 != null) {
                        c(aVar2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = aVar2.f88620a;
                    if (viewHolder6 != null) {
                        c(aVar2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f88615i.remove(arrayList3);
                    }
                }
            }
            b(this.f88618l);
            b(this.f88617k);
            b(this.f88616j);
            b(this.f88619m);
            dispatchAnimationsFinished();
        }
    }

    public final void endChangeAnimation(List<a> list, RecyclerView.ViewHolder viewHolder) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i7 = size - 1;
            a aVar = list.get(size);
            if (c(aVar, viewHolder) && aVar.f88621b == null && aVar.f88620a == null) {
                list.remove(aVar);
            }
            if (i7 < 0) {
                return;
            } else {
                size = i7;
            }
        }
    }

    public final boolean isRunning() {
        return (this.f88611d.isEmpty() && this.f88613f.isEmpty() && this.f88612e.isEmpty() && this.f88610c.isEmpty() && this.f88617k.isEmpty() && this.f88618l.isEmpty() && this.f88616j.isEmpty() && this.f88619m.isEmpty() && this.h.isEmpty() && this.f88614g.isEmpty() && this.f88615i.isEmpty()) ? false : true;
    }

    public final void resetAnimation(RecyclerView.ViewHolder viewHolder) {
        if (f88608n == null) {
            f88608n = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f88608n);
        endAnimation(viewHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void runPendingAnimations() {
        boolean zIsEmpty = this.f88610c.isEmpty();
        boolean zIsEmpty2 = this.f88612e.isEmpty();
        boolean zIsEmpty3 = this.f88613f.isEmpty();
        boolean zIsEmpty4 = this.f88611d.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (RecyclerView.ViewHolder viewHolder : this.f88610c) {
            View view = viewHolder.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f88618l.add(viewHolder);
            viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new c(view, viewPropertyAnimatorAnimate, viewHolder, this)).start();
        }
        this.f88610c.clear();
        if (!zIsEmpty2) {
            ArrayList<b> arrayList = new ArrayList<>();
            arrayList.addAll(this.f88612e);
            this.h.add(arrayList);
            this.f88612e.clear();
            x xVar = new x(1, arrayList, this);
            if (zIsEmpty) {
                xVar.run();
            } else {
                ViewCompat.postOnAnimationDelayed(arrayList.get(0).f88626a.itemView, xVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            final ArrayList<a> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f88613f);
            this.f88615i.add(arrayList2);
            this.f88613f.clear();
            Runnable runnable = new Runnable(arrayList2, this) { // from class: com.bilibili.search2.result.widget.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ArrayList f88603a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final h f88604b;

                {
                    this.f88603a = arrayList2;
                    this.f88604b = this;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$ItemAnimator, com.bilibili.search2.result.widget.h, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList<h.a> arrayList3 = this.f88603a;
                    ?? r02 = this.f88604b;
                    for (h.a aVar : arrayList3) {
                        r02.getClass();
                        RecyclerView.ViewHolder viewHolder2 = aVar.f88621b;
                        View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
                        RecyclerView.ViewHolder viewHolder3 = aVar.f88620a;
                        View view3 = viewHolder3 != null ? viewHolder3.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(r02.getChangeDuration());
                            r02.f88619m.add(aVar.f88621b);
                            duration.translationX(aVar.f88624e - aVar.f88622c);
                            duration.translationY(aVar.f88625f - aVar.f88623d);
                            duration.alpha(0.0f).setListener(new j(r02, aVar, duration, view2)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            r02.f88619m.add(aVar.f88620a);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(r02.getChangeDuration()).alpha(1.0f).setListener(new k(r02, aVar, viewPropertyAnimatorAnimate2, view3)).start();
                        }
                    }
                    arrayList3.clear();
                    r02.f88615i.remove(arrayList3);
                }
            };
            if (zIsEmpty) {
                runnable.run();
            } else {
                ViewCompat.postOnAnimationDelayed(arrayList2.get(0).f88621b.itemView, runnable, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f88611d);
        this.f88614g.add(arrayList3);
        this.f88611d.clear();
        Runnable runnable2 = new Runnable(arrayList3, this) { // from class: com.bilibili.search2.result.widget.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f88605a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final h f88606b;

            {
                this.f88605a = arrayList3;
                this.f88606b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$ItemAnimator, com.bilibili.search2.result.widget.h, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList<RecyclerView.ViewHolder> arrayList4 = this.f88605a;
                ?? r02 = this.f88606b;
                for (RecyclerView.ViewHolder viewHolder2 : arrayList4) {
                    r02.getClass();
                    View view2 = viewHolder2.itemView;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                    r02.f88616j.add(viewHolder2);
                    viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(r02.getAddDuration()).setListener(new i(view2, viewPropertyAnimatorAnimate2, viewHolder2, r02)).start();
                }
                arrayList4.clear();
                r02.f88614g.remove(arrayList4);
            }
        };
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnable2.run();
            return;
        }
        long removeDuration = !zIsEmpty ? getRemoveDuration() : 0L;
        Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration());
        ViewCompat.postOnAnimationDelayed(arrayList3.get(0).itemView, runnable2, removeDuration);
    }
}
