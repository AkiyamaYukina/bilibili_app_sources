package com.bilibili.playerbizcommon.input.panels.commandsdetail.vote;

import Fq0.b;
import Fq0.f;
import Fq0.g;
import Jq0.e;
import Jq0.k;
import android.content.Context;
import android.widget.LinearLayout;
import com.bilibili.base.MainThread;
import com.bilibili.playerbizcommon.input.panels.commandsdetail.vote.VoteOptionsInputItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/vote/a.class */
public final class a extends LinearLayout implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f80175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Jq0.a f80176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<VoteOptionsInputItem> f80177c;

    public a(@NotNull Context context, @NotNull f fVar) {
        super(context);
        this.f80175a = fVar;
        b bVarB = fVar.b();
        this.f80176b = bVarB instanceof Jq0.a ? (Jq0.a) bVarB : null;
        this.f80177c = new ArrayList();
        setOrientation(1);
    }

    @Override // Fq0.g
    public final void a(@NotNull HashMap<String, Object> map) {
        int i7 = 0;
        for (Object obj : (ArrayList) this.f80177c) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            VoteOptionsInputItem voteOptionsInputItem = (VoteOptionsInputItem) obj;
            if (i7 == 0) {
                map.put("question", voteOptionsInputItem.getDraft$playerbizcommon_apinkRelease());
            } else if (i7 == 1) {
                map.put("optionA", voteOptionsInputItem.getDraft$playerbizcommon_apinkRelease());
            } else if (i7 == 2) {
                map.put("optionB", voteOptionsInputItem.getDraft$playerbizcommon_apinkRelease());
            } else if (i7 == 3) {
                map.put("optionC", voteOptionsInputItem.getDraft$playerbizcommon_apinkRelease());
            } else if (i7 == 4) {
                map.put("optionD", voteOptionsInputItem.getDraft$playerbizcommon_apinkRelease());
            }
            i7++;
        }
    }

    @Override // Fq0.g
    public final void b(@Nullable CommandsPanel.Panel.Form form, @NotNull String str) {
        Jq0.f fVar;
        Iterator it = ((ArrayList) this.f80177c).iterator();
        while (it.hasNext()) {
            ((VoteOptionsInputItem) it.next()).b(form, str);
        }
        Jq0.a aVar = this.f80176b;
        if (aVar == null || (fVar = aVar.h) == null) {
            return;
        }
        MainThread.postOnMainThread(new e(fVar, 0));
    }

    @Override // Fq0.g
    public final boolean c() {
        Object next;
        Iterator<T> it = this.f80177c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((VoteOptionsInputItem) next).c()) {
                break;
            }
        }
        return next == null;
    }

    public final void d(boolean z6, @NotNull VoteOptionsInputItem voteOptionsInputItem) {
        int iIndexOf;
        Jq0.f fVar;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, NewPlayerUtilsKt.toPx(10.0f));
        if (z6) {
            addView(voteOptionsInputItem, layoutParams);
            ((ArrayList) this.f80177c).add(voteOptionsInputItem);
            iIndexOf = ((ArrayList) this.f80177c).indexOf(voteOptionsInputItem);
        } else {
            removeView(voteOptionsInputItem);
            int iIndexOf2 = ((ArrayList) this.f80177c).indexOf(voteOptionsInputItem);
            ((ArrayList) this.f80177c).remove(voteOptionsInputItem);
            voteOptionsInputItem.getClass();
            Jq0.a aVar = this.f80176b;
            iIndexOf = iIndexOf2;
            if (aVar != null) {
                iIndexOf = iIndexOf2;
                if (aVar.getCustomCheck$playerbizcommon_apinkRelease()) {
                    if (((ArrayList) this.f80177c).size() > 3) {
                        this.f80176b.d(true);
                        iIndexOf = iIndexOf2;
                    } else {
                        this.f80176b.setCustomCheck$playerbizcommon_apinkRelease(false);
                        iIndexOf = iIndexOf2;
                    }
                }
            }
        }
        if (iIndexOf > 2) {
            int i7 = 0;
            for (Object obj : (ArrayList) this.f80177c) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                VoteOptionsInputItem voteOptionsInputItem2 = (VoteOptionsInputItem) obj;
                if (i7 > 1) {
                    voteOptionsInputItem2.onAttach();
                }
                i7++;
            }
        } else {
            voteOptionsInputItem.onAttach();
        }
        this.f80175a.d();
        Jq0.a aVar2 = this.f80176b;
        if (aVar2 == null || (fVar = aVar2.h) == null) {
            return;
        }
        MainThread.postOnMainThread(new e(fVar, 0));
    }

    @NotNull
    public final List<VoteOptionsInputItem> getInputItems$playerbizcommon_apinkRelease() {
        return this.f80177c;
    }

    @Override // Fq0.g
    public final void onAttach() {
        removeAllViews();
        new LinearLayout.LayoutParams(-1, -2).setMargins(0, 0, 0, NewPlayerUtilsKt.toPx(10.0f));
        Context context = getContext();
        f fVar = this.f80175a;
        new CommandsPanel.Panel.Form();
        VoteOptionsInputItem.VoteInputType voteInputType = VoteOptionsInputItem.VoteInputType.QUESTION;
        int px = NewPlayerUtilsKt.toPx(32.0f);
        VoteOptionsInputItem.VoteInputType voteInputType2 = VoteOptionsInputItem.VoteInputType.QUESTION;
        CommandsPanel.Panel.Form form = new CommandsPanel.Panel.Form();
        form.setKey("question");
        form.setLimit(12);
        form.setTips(getContext().getString(2131845554));
        form.setPlaceholder(getContext().getString(2131845811, Integer.valueOf(form.getLimit())));
        d(true, new VoteOptionsInputItem(context, fVar, form, voteInputType2, Integer.valueOf(px)));
        Context context2 = getContext();
        f fVar2 = this.f80175a;
        new CommandsPanel.Panel.Form();
        VoteOptionsInputItem.VoteInputType voteInputType3 = VoteOptionsInputItem.VoteInputType.QUESTION;
        int px2 = NewPlayerUtilsKt.toPx(32.0f);
        VoteOptionsInputItem.VoteInputType voteInputType4 = VoteOptionsInputItem.VoteInputType.CHOICE;
        CommandsPanel.Panel.Form form2 = new CommandsPanel.Panel.Form();
        form2.setKey("optionA");
        form2.setLimit(6);
        form2.setTips(getContext().getString(2131847434));
        form2.setPlaceholder(getContext().getString(2131845866, 1, Integer.valueOf(form2.getLimit())));
        d(true, new VoteOptionsInputItem(context2, fVar2, form2, voteInputType4, Integer.valueOf(px2)));
        Context context3 = getContext();
        f fVar3 = this.f80175a;
        new CommandsPanel.Panel.Form();
        VoteOptionsInputItem.VoteInputType voteInputType5 = VoteOptionsInputItem.VoteInputType.QUESTION;
        int px3 = NewPlayerUtilsKt.toPx(32.0f);
        CommandsPanel.Panel.Form form3 = new CommandsPanel.Panel.Form();
        form3.setKey("optionB");
        form3.setLimit(6);
        form3.setTips(getContext().getString(2131847434));
        form3.setPlaceholder(getContext().getString(2131845866, 2, Integer.valueOf(form3.getLimit())));
        d(true, new VoteOptionsInputItem(context3, fVar3, form3, voteInputType4, Integer.valueOf(px3)));
    }

    @Override // Fq0.g
    public final void onDetach() {
        Sq0.b.a(this, new k(0));
        ((ArrayList) this.f80177c).clear();
    }
}
