package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.vote;

import Hz.e;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.vote.VoteOptionsInputItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr0.AbstractC8618a;
import sr0.InterfaceC8621d;
import sr0.InterfaceC8622e;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import wr0.C8918a;
import wr0.C8923f;
import xr0.C9003c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/vote/b.class */
@StabilityInferred(parameters = 0)
public final class b extends LinearLayout implements InterfaceC8622e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC8621d f81124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C8918a f81125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<VoteOptionsInputItem> f81126c;

    public b(@NotNull Context context, @NotNull InterfaceC8621d interfaceC8621d) {
        super(context);
        this.f81124a = interfaceC8621d;
        AbstractC8618a abstractC8618aB = interfaceC8621d.b();
        this.f81125b = abstractC8618aB instanceof C8918a ? (C8918a) abstractC8618aB : null;
        this.f81126c = new ArrayList();
        setOrientation(1);
    }

    @Override // sr0.InterfaceC8622e
    public final void a(@NotNull HashMap<String, Object> map) {
        int i7 = 0;
        for (Object obj : (ArrayList) this.f81126c) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            VoteOptionsInputItem voteOptionsInputItem = (VoteOptionsInputItem) obj;
            if (i7 == 0) {
                map.put("question", voteOptionsInputItem.getDraft$playerbizcommonv2_release());
            } else if (i7 == 1) {
                map.put("optionA", voteOptionsInputItem.getDraft$playerbizcommonv2_release());
            } else if (i7 == 2) {
                map.put("optionB", voteOptionsInputItem.getDraft$playerbizcommonv2_release());
            } else if (i7 == 3) {
                map.put("optionC", voteOptionsInputItem.getDraft$playerbizcommonv2_release());
            } else if (i7 == 4) {
                map.put("optionD", voteOptionsInputItem.getDraft$playerbizcommonv2_release());
            }
            i7++;
        }
    }

    @Override // sr0.InterfaceC8622e
    public final void b(@Nullable CommandsPanel.Panel.Form form, @NotNull String str) {
        C8923f c8923f;
        Iterator it = ((ArrayList) this.f81126c).iterator();
        while (it.hasNext()) {
            ((VoteOptionsInputItem) it.next()).b(form, str);
        }
        C8918a c8918a = this.f81125b;
        if (c8918a == null || (c8923f = c8918a.f128988i) == null) {
            return;
        }
        c8923f.f();
    }

    @Override // sr0.InterfaceC8622e
    public final boolean c() {
        Object next;
        Iterator<T> it = this.f81126c.iterator();
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
        C8918a c8918a;
        C8923f c8923f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, NewPlayerUtilsKt.toPx(10.0f));
        if (z6) {
            C8918a c8918a2 = this.f81125b;
            if (c8918a2 != null && c8918a2.getCustomCheck$playerbizcommonv2_release()) {
                this.f81125b.d(false);
            }
            addView(voteOptionsInputItem, layoutParams);
            ((ArrayList) this.f81126c).add(voteOptionsInputItem);
            int iIndexOf2 = ((ArrayList) this.f81126c).indexOf(voteOptionsInputItem);
            C8918a c8918a3 = this.f81125b;
            iIndexOf = iIndexOf2;
            if (c8918a3 != null) {
                c8918a3.d(c8918a3.getCustomCheck$playerbizcommonv2_release());
                iIndexOf = iIndexOf2;
            }
        } else {
            iIndexOf = ((ArrayList) this.f81126c).indexOf(voteOptionsInputItem);
            removeView(voteOptionsInputItem);
            if (iIndexOf == ((ArrayList) this.f81126c).size() - 1 && (c8918a = this.f81125b) != null && c8918a.getCustomCheck$playerbizcommonv2_release()) {
                this.f81125b.setCustomCheck$playerbizcommonv2_release(false);
                this.f81125b.d(false);
            }
            ((ArrayList) this.f81126c).remove(voteOptionsInputItem);
            voteOptionsInputItem.getClass();
        }
        if (iIndexOf > 2) {
            int i7 = 0;
            for (Object obj : (ArrayList) this.f81126c) {
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
        this.f81124a.d();
        C8918a c8918a4 = this.f81125b;
        if (c8918a4 == null || (c8923f = c8918a4.f128988i) == null) {
            return;
        }
        c8923f.f();
    }

    @NotNull
    public final List<VoteOptionsInputItem> getInputItems$playerbizcommonv2_release() {
        return this.f81126c;
    }

    @Override // sr0.InterfaceC8622e
    public final void onAttach() {
        removeAllViews();
        Context context = getContext();
        InterfaceC8621d interfaceC8621d = this.f81124a;
        new CommandsPanel.Panel.Form();
        VoteOptionsInputItem.VoteInputType voteInputType = VoteOptionsInputItem.VoteInputType.QUESTION;
        int px = NewPlayerUtilsKt.toPx(32.0f);
        VoteOptionsInputItem.VoteInputType voteInputType2 = VoteOptionsInputItem.VoteInputType.QUESTION;
        CommandsPanel.Panel.Form form = new CommandsPanel.Panel.Form();
        form.setKey("question");
        form.setLimit(12);
        form.setTips(getContext().getString(2131845554));
        form.setPlaceholder(getContext().getString(2131845811, Integer.valueOf(form.getLimit())));
        d(true, new VoteOptionsInputItem(context, interfaceC8621d, form, voteInputType2, Integer.valueOf(px)));
        Context context2 = getContext();
        InterfaceC8621d interfaceC8621d2 = this.f81124a;
        new CommandsPanel.Panel.Form();
        VoteOptionsInputItem.VoteInputType voteInputType3 = VoteOptionsInputItem.VoteInputType.QUESTION;
        int px2 = NewPlayerUtilsKt.toPx(32.0f);
        VoteOptionsInputItem.VoteInputType voteInputType4 = VoteOptionsInputItem.VoteInputType.CHOICE;
        CommandsPanel.Panel.Form form2 = new CommandsPanel.Panel.Form();
        form2.setKey("optionA");
        form2.setLimit(6);
        form2.setTips(getContext().getString(2131847434));
        form2.setPlaceholder(getContext().getString(2131845866, 1, Integer.valueOf(form2.getLimit())));
        d(true, new VoteOptionsInputItem(context2, interfaceC8621d2, form2, voteInputType4, Integer.valueOf(px2)));
        Context context3 = getContext();
        InterfaceC8621d interfaceC8621d3 = this.f81124a;
        new CommandsPanel.Panel.Form();
        VoteOptionsInputItem.VoteInputType voteInputType5 = VoteOptionsInputItem.VoteInputType.QUESTION;
        int px3 = NewPlayerUtilsKt.toPx(32.0f);
        CommandsPanel.Panel.Form form3 = new CommandsPanel.Panel.Form();
        form3.setKey("optionB");
        form3.setLimit(6);
        form3.setTips(getContext().getString(2131847434));
        form3.setPlaceholder(getContext().getString(2131845866, 2, Integer.valueOf(form3.getLimit())));
        d(true, new VoteOptionsInputItem(context3, interfaceC8621d3, form3, voteInputType4, Integer.valueOf(px3)));
    }

    @Override // sr0.InterfaceC8622e
    public final void onDetach() {
        C9003c.a(this, new e(2));
        ((ArrayList) this.f81126c).clear();
    }
}
