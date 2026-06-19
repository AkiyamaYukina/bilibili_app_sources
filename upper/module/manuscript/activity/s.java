package com.bilibili.upper.module.manuscript.activity;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bilibili.inline.biz.live.LiveContainer;
import com.bilibili.search2.api.SearchLiveInline;
import com.bilibili.search2.api.SearchLiveInlineData;
import com.bilibili.search2.inline.Avatar;
import kotlin.jvm.internal.Intrinsics;
import ot0.C8265d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/s.class */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f113557b;

    public /* synthetic */ s(Object obj, int i7) {
        this.f113556a = i7;
        this.f113557b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView = null;
        switch (this.f113556a) {
            case 0:
                ManuscriptProgressDetailsActivity manuscriptProgressDetailsActivity = (ManuscriptProgressDetailsActivity) this.f113557b;
                int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                boolean z6 = manuscriptProgressDetailsActivity.P6().f113693p;
                TE0.b bVar = TE0.b.f24088a;
                long j7 = manuscriptProgressDetailsActivity.f113486w1;
                long j8 = manuscriptProgressDetailsActivity.y1;
                int iR6 = manuscriptProgressDetailsActivity.R6();
                boolean z7 = !z6;
                bVar.getClass();
                TE0.b.s0(j7, j8, iR6, z7, "稿件转码");
                manuscriptProgressDetailsActivity.d7(z7);
                break;
            case 1:
                eI0.d dVar = (eI0.d) this.f113557b;
                dVar.dismiss();
                TE0.b bVar2 = TE0.b.f24088a;
                TextView textView2 = dVar.f117247f;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOneMoreTextView");
                } else {
                    textView = textView2;
                }
                String string = textView.getText().toString();
                boolean z8 = dVar.f117246e;
                bVar2.getClass();
                TE0.b.k0(string, z8);
                break;
            default:
                LiveContainer liveContainer = (C8265d) this.f113557b;
                Context context = liveContainer.itemView.getContext();
                SearchLiveInlineData inlineLive = ((SearchLiveInline) liveContainer.getData()).getInlineLive();
                String uri = null;
                if (inlineLive != null) {
                    Avatar avatar = inlineLive.getAvatar();
                    uri = null;
                    if (avatar != null) {
                        uri = avatar.getUri();
                    }
                }
                com.bilibili.search2.utils.B.r(context, uri);
                liveContainer.t0();
                break;
        }
    }
}
