package com.bilibili.playset;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.collection.C3269h;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.bilibili.api.base.Config;
import com.bilibili.playset.C5898c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.playset.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/c.class */
public final class C5898c extends SimpleItemAnimator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static TimeInterpolator f84112o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f84123l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f84113a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f84114b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<g> f84115c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<f> f84116d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> f84117e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<ArrayList<g>> f84118f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<ArrayList<f>> f84119g = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f84120i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f84121j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<RecyclerView.ViewHolder> f84122k = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f84124m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f84125n = new a(this);

    /* JADX INFO: renamed from: com.bilibili.playset.c$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/c$a.class */
    public final class a extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5898c f84126a;

        public a(C5898c c5898c) {
            this.f84126a = c5898c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i7, int i8) {
            this.f84126a.f84124m = i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i7, int i8) {
            this.f84126a.f84124m = i7;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.c$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/c$b.class */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f84127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5898c f84128b;

        public b(C5898c c5898c, ArrayList arrayList) {
            this.f84128b = c5898c;
            this.f84127a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (g gVar : this.f84127a) {
                C5898c c5898c = this.f84128b;
                RecyclerView.ViewHolder viewHolder = gVar.f84143a;
                c5898c.getClass();
                View view = viewHolder.itemView;
                int i7 = gVar.f84146d - gVar.f84144b;
                int i8 = gVar.f84147e - gVar.f84145c;
                if (i7 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i8 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c5898c.f84120i.add(viewHolder);
                viewPropertyAnimatorAnimate.setDuration(c5898c.getMoveDuration()).setListener(new C5978g(c5898c, viewHolder, i7, view, i8, viewPropertyAnimatorAnimate)).start();
            }
            this.f84127a.clear();
            this.f84128b.f84118f.remove(this.f84127a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.c$c, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/c$c.class */
    public final class RunnableC0562c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f84129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5898c f84130b;

        public RunnableC0562c(C5898c c5898c, ArrayList arrayList) {
            this.f84130b = c5898c;
            this.f84129a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (f fVar : this.f84129a) {
                C5898c c5898c = this.f84130b;
                c5898c.getClass();
                RecyclerView.ViewHolder viewHolder = fVar.f84137a;
                View view = viewHolder == null ? null : viewHolder.itemView;
                RecyclerView.ViewHolder viewHolder2 = fVar.f84138b;
                View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(c5898c.getChangeDuration());
                    c5898c.f84122k.add(fVar.f84137a);
                    duration.translationX(fVar.f84141e - fVar.f84139c);
                    duration.translationY(fVar.f84142f - fVar.f84140d);
                    duration.alpha(0.0f).setListener(new C5980h(c5898c, fVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    c5898c.f84122k.add(fVar.f84138b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c5898c.getChangeDuration()).alpha(1.0f).setListener(new C5982i(c5898c, fVar, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
            this.f84129a.clear();
            this.f84130b.f84119g.remove(this.f84129a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.c$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/c$d.class */
    public final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f84131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C5898c f84132b;

        public d(C5898c c5898c, ArrayList arrayList) {
            this.f84132b = c5898c;
            this.f84131a = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0100 A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Comparator] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 279
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.C5898c.d.run():void");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.c$e */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/c$e.class */
    public final class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f84133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView.ViewHolder f84134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnimationSet f84135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C5898c f84136d;

        public e(View view, AnimationSet animationSet, RecyclerView.ViewHolder viewHolder, C5898c c5898c) {
            this.f84136d = c5898c;
            this.f84133a = view;
            this.f84134b = viewHolder;
            this.f84135c = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            View view = this.f84133a;
            final AnimationSet animationSet = this.f84135c;
            final RecyclerView.ViewHolder viewHolder = this.f84134b;
            view.post(new Runnable(this, animationSet, viewHolder) { // from class: com.bilibili.playset.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C5898c.e f85062a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final AnimationSet f85063b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final RecyclerView.ViewHolder f85064c;

                {
                    this.f85062a = this;
                    this.f85063b = animationSet;
                    this.f85064c = viewHolder;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5898c.e eVar = this.f85062a;
                    AnimationSet animationSet2 = this.f85063b;
                    RecyclerView.ViewHolder viewHolder2 = this.f85064c;
                    eVar.getClass();
                    animationSet2.setAnimationListener(null);
                    eVar.f84136d.dispatchAddFinished(viewHolder2);
                    eVar.f84136d.h.remove(viewHolder2);
                    eVar.f84136d.dispatchFinishedWhenDone();
                }
            });
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            this.f84133a.setAlpha(1.0f);
            this.f84136d.dispatchAddStarting(this.f84134b);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.c$f */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/c$f.class */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f84137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.ViewHolder f84138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f84139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f84140d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f84141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f84142f;

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f84137a);
            sb.append(", newHolder=");
            sb.append(this.f84138b);
            sb.append(", fromX=");
            sb.append(this.f84139c);
            sb.append(", fromY=");
            sb.append(this.f84140d);
            sb.append(", toX=");
            sb.append(this.f84141e);
            sb.append(", toY=");
            return C3269h.a(sb, this.f84142f, '}');
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playset.c$g */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/c$g.class */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f84143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f84144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f84145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f84146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f84147e;
    }

    public final void a(float f7, RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        this.h.add(viewHolder);
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(getAddDuration());
        animationSet.addAnimation(alphaAnimation);
        if (f7 != 0.0f) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f7, 0.0f);
            translateAnimation.setDuration(getAddDuration());
            animationSet.addAnimation(translateAnimation);
        }
        animationSet.setAnimationListener(new e(view, animationSet, viewHolder, this));
        view.startAnimation(animationSet);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        d(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.f84114b.add(viewHolder);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [com.bilibili.playset.c$f, java.lang.Object] */
    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i7, int i8, int i9, int i10) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i7, i8, i9, i10);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        d(viewHolder);
        int i11 = (int) ((i9 - i7) - translationX);
        int i12 = (int) ((i10 - i8) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            d(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i11);
            viewHolder2.itemView.setTranslationY(-i12);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        ArrayList<f> arrayList = this.f84116d;
        ?? obj = new Object();
        obj.f84137a = viewHolder;
        obj.f84138b = viewHolder2;
        obj.f84139c = i7;
        obj.f84140d = i8;
        obj.f84141e = i9;
        obj.f84142f = i10;
        arrayList.add((f) obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.bilibili.playset.c$g, java.lang.Object] */
    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateMove(RecyclerView.ViewHolder viewHolder, int i7, int i8, int i9, int i10) {
        View view = viewHolder.itemView;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) viewHolder.itemView.getTranslationY());
        d(viewHolder);
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
        ArrayList<g> arrayList = this.f84115c;
        ?? obj = new Object();
        obj.f84143a = viewHolder;
        obj.f84144b = translationX;
        obj.f84145c = translationY;
        obj.f84146d = i9;
        obj.f84147e = i10;
        arrayList.add((g) obj);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        d(viewHolder);
        this.f84113a.add(viewHolder);
        return true;
    }

    public final void b(RecyclerView.ViewHolder viewHolder, List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            f fVar = (f) list.get(size);
            if (c(fVar, viewHolder) && fVar.f84137a == null && fVar.f84138b == null) {
                list.remove(fVar);
            }
        }
    }

    public final boolean c(f fVar, RecyclerView.ViewHolder viewHolder) {
        boolean z6 = false;
        if (fVar.f84138b == viewHolder) {
            fVar.f84138b = null;
        } else {
            if (fVar.f84137a != viewHolder) {
                return false;
            }
            fVar.f84137a = null;
            z6 = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z6);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list);
    }

    public final void cancelAll(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        if (f84112o == null) {
            f84112o = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f84112o);
        endAnimation(viewHolder);
    }

    public final void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
            view.clearAnimation();
        }
        view.animate().cancel();
        for (int size = this.f84115c.size() - 1; size >= 0; size--) {
            if (this.f84115c.get(size).f84143a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.f84115c.remove(size);
            }
        }
        b(viewHolder, this.f84116d);
        if (this.f84113a.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.f84114b.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.f84119g.size() - 1; size2 >= 0; size2--) {
            ArrayList<f> arrayList = this.f84119g.get(size2);
            b(viewHolder, arrayList);
            if (arrayList.isEmpty()) {
                this.f84119g.remove(size2);
            }
        }
        for (int size3 = this.f84118f.size() - 1; size3 >= 0; size3--) {
            ArrayList<g> arrayList2 = this.f84118f.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f84143a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f84118f.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f84117e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f84117e.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f84117e.remove(size5);
                }
            }
        }
        if (this.f84121j.remove(viewHolder) && Config.isDebuggable()) {
            Log.e("CustomItemAnimator", "after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.h.remove(viewHolder) && Config.isDebuggable()) {
            Log.e("CustomItemAnimator", "after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.f84122k.remove(viewHolder) && Config.isDebuggable()) {
            Log.e("CustomItemAnimator", "after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f84120i.remove(viewHolder) && Config.isDebuggable()) {
            Log.e("CustomItemAnimator", "after animation is cancelled, item should not be in mMoveAnimations list");
        }
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void endAnimations() {
        for (int size = this.f84115c.size() - 1; size >= 0; size--) {
            g gVar = this.f84115c.get(size);
            View view = gVar.f84143a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(gVar.f84143a);
            this.f84115c.remove(size);
        }
        for (int size2 = this.f84113a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f84113a.get(size2));
            this.f84113a.remove(size2);
        }
        for (int size3 = this.f84114b.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.f84114b.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.f84114b.remove(size3);
        }
        for (int size4 = this.f84116d.size() - 1; size4 >= 0; size4--) {
            f fVar = this.f84116d.get(size4);
            RecyclerView.ViewHolder viewHolder2 = fVar.f84137a;
            if (viewHolder2 != null) {
                c(fVar, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = fVar.f84138b;
            if (viewHolder3 != null) {
                c(fVar, viewHolder3);
            }
        }
        this.f84116d.clear();
        if (isRunning()) {
            for (int size5 = this.f84118f.size() - 1; size5 >= 0; size5--) {
                ArrayList<g> arrayList = this.f84118f.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    g gVar2 = arrayList.get(size6);
                    View view2 = gVar2.f84143a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(gVar2.f84143a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f84118f.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f84117e.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f84117e.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = arrayList2.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    dispatchAddFinished(viewHolder4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f84117e.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f84119g.size() - 1; size9 >= 0; size9--) {
                ArrayList<f> arrayList3 = this.f84119g.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    f fVar2 = arrayList3.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = fVar2.f84137a;
                    if (viewHolder5 != null) {
                        c(fVar2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = fVar2.f84138b;
                    if (viewHolder6 != null) {
                        c(fVar2, viewHolder6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f84119g.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.f84121j);
            cancelAll(this.f84120i);
            cancelAll(this.h);
            cancelAll(this.f84122k);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean isRunning() {
        return (this.f84114b.isEmpty() && this.f84116d.isEmpty() && this.f84115c.isEmpty() && this.f84113a.isEmpty() && this.f84120i.isEmpty() && this.f84121j.isEmpty() && this.h.isEmpty() && this.f84122k.isEmpty() && this.f84118f.isEmpty() && this.f84117e.isEmpty() && this.f84119g.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.Comparator] */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    @RequiresApi(api = 19)
    public final void runPendingAnimations() {
        boolean zIsEmpty = this.f84113a.isEmpty();
        boolean zIsEmpty2 = this.f84115c.isEmpty();
        boolean zIsEmpty3 = this.f84116d.isEmpty();
        boolean zIsEmpty4 = this.f84114b.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        if (!zIsEmpty) {
            ArrayList<RecyclerView.ViewHolder> arrayList = this.f84113a;
            Collections.sort(arrayList, new Object());
            float y6 = arrayList.get(0).itemView.getY();
            for (RecyclerView.ViewHolder viewHolder : arrayList) {
                float y7 = y6 - viewHolder.itemView.getY();
                View view = viewHolder.itemView;
                this.f84121j.add(viewHolder);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(getRemoveDuration());
                animationSet.addAnimation(alphaAnimation);
                if (y7 != 0.0f) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, y7);
                    translateAnimation.setDuration(getRemoveDuration());
                    animationSet.addAnimation(translateAnimation);
                }
                animationSet.setAnimationListener(new AnimationAnimationListenerC5932e(view, animationSet, viewHolder, this));
                view.startAnimation(animationSet);
            }
        }
        this.f84113a.clear();
        if (!zIsEmpty2) {
            ArrayList<g> arrayList2 = new ArrayList<>(this.f84115c);
            this.f84118f.add(arrayList2);
            this.f84115c.clear();
            b bVar = new b(this, arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                ViewCompat.postOnAnimationDelayed(arrayList2.get(0).f84143a.itemView, bVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<f> arrayList3 = new ArrayList<>(this.f84116d);
            this.f84119g.add(arrayList3);
            this.f84116d.clear();
            RunnableC0562c runnableC0562c = new RunnableC0562c(this, arrayList3);
            if (zIsEmpty) {
                runnableC0562c.run();
            } else {
                ViewCompat.postOnAnimationDelayed(arrayList3.get(0).f84137a.itemView, runnableC0562c, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.ViewHolder> arrayList4 = new ArrayList<>(this.f84114b);
        this.f84117e.add(arrayList4);
        this.f84114b.clear();
        d dVar = new d(this, arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            dVar.run();
            return;
        }
        ViewCompat.postOnAnimationDelayed(arrayList4.get(0).itemView, dVar, Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()) + (!zIsEmpty ? getRemoveDuration() : 0L));
    }
}
