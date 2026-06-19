package com.bilibili.search2.result.holder.author;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.search2.api.SearchAuthorNew;
import com.bilibili.search2.result.holder.author.g;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import kntr.home.history.mvi.HistoryStateHolder;
import kntr.home.history.mvi.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import tv.danmaku.bili.fullscreen.state.U;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/author/f.class */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87824b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f87823a = i7;
        this.f87824b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v4, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.holder.author.g, java.lang.Object] */
    public final Object invoke() throws NoWhenBranchMatchedException {
        switch (this.f87823a) {
            case 0:
                ?? r02 = (g) this.f87824b;
                return new g.d(r02, r02.itemView.getContext(), r02.f87845g, ((SearchAuthorNew) r02.getData()).isUpFollowUser(), new EH0.m(r02, 2));
            case 1:
                int i7 = KingPositionService.c.f100409a[((KingPositionService) this.f87824b).f100374d.ordinal()];
                int i8 = 2;
                if (i7 != 1) {
                    if (i7 == 2) {
                        i8 = 42;
                    } else {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i8 = 2;
                    }
                }
                return Integer.valueOf(i8);
            case 2:
                return (ConstraintLayout) ((View) this.f87824b).findViewById(2131306668);
            case 3:
                ((HistoryStateHolder) this.f87824b).b(a.h.a);
                return Unit.INSTANCE;
            case 4:
                ra.b bVar = (ra.b) this.f87824b;
                bVar.w.setAlpha(1.0f);
                bVar.x.setAlpha(0.0f);
                return Unit.INSTANCE;
            default:
                ((Function1) this.f87824b).invoke(new U.h(true));
                return Unit.INSTANCE;
        }
    }
}
