package com.bilibili.playerbizcommonv2.guideBubble;

import android.widget.PopupWindow;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.popupwindow.TheseusPopupWindowService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<BiliGuideBubble> f81770a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TheseusPopupWindowService.b f81771b;

    public final void a(@NotNull final BiliGuideBubble biliGuideBubble, int i7, int i8) {
        if (this.f81770a.size() >= 5) {
            T7.a.a(this.f81770a.size(), "current showing bubble is up to maximum limit, can't show any more, max size: ", "BiliGuideBubbleHelper");
            return;
        }
        int i9 = biliGuideBubble.f81755v;
        boolean zIsEmpty = true;
        if (i9 != -1) {
            Iterator<BiliGuideBubble> it = this.f81770a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zIsEmpty = false;
                    break;
                } else if (it.next().f81755v == i9) {
                    break;
                }
            }
        } else {
            zIsEmpty = true ^ this.f81770a.isEmpty();
        }
        if (zIsEmpty) {
            BLog.i("BiliGuideBubbleHelper", "this type window is already show");
            return;
        }
        biliGuideBubble.c(new PopupWindow.OnDismissListener(this, biliGuideBubble) { // from class: com.bilibili.playerbizcommonv2.guideBubble.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final g f81768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final BiliGuideBubble f81769b;

            {
                this.f81768a = this;
                this.f81769b = biliGuideBubble;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                g gVar = this.f81768a;
                BiliGuideBubble biliGuideBubble2 = this.f81769b;
                TheseusPopupWindowService.b bVar = gVar.f81771b;
                if (bVar != null) {
                    bVar.a(biliGuideBubble2.f81755v);
                }
                gVar.f81770a.remove(biliGuideBubble2);
            }
        });
        if (!this.f81770a.contains(biliGuideBubble)) {
            TheseusPopupWindowService.b bVar = this.f81771b;
            if (bVar != null) {
                bVar.f102431a.f102423c.f102420k.add(Integer.valueOf(biliGuideBubble.f81755v));
            }
            this.f81770a.add(biliGuideBubble);
        }
        biliGuideBubble.e(i7, i8);
    }
}
