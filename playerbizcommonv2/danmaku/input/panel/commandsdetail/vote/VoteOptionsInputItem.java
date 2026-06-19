package com.bilibili.playerbizcommonv2.danmaku.input.panel.commandsdetail.vote;

import Bp0.c;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.ScreenUtil;
import com.mall.ui.widget.comment.t;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sr0.AbstractC8618a;
import sr0.InterfaceC8621d;
import sr0.InterfaceC8622e;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;
import wr0.C8918a;
import xr0.C9002b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/vote/VoteOptionsInputItem.class */
@StabilityInferred(parameters = 0)
public final class VoteOptionsInputItem extends FrameLayout implements InterfaceC8622e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f81107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC8621d f81108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CommandsPanel.Panel.Form f81109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final VoteInputType f81110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f81111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final C8918a f81112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f81113g;

    @Nullable
    public final TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final TextView f81114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final TextView f81115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final ImageView f81116k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/commandsdetail/vote/VoteOptionsInputItem$VoteInputType.class */
    public static final class VoteInputType {
        private static final EnumEntries $ENTRIES;
        private static final VoteInputType[] $VALUES;
        public static final VoteInputType QUESTION = new VoteInputType("QUESTION", 0);
        public static final VoteInputType CHOICE = new VoteInputType("CHOICE", 1);

        private static final /* synthetic */ VoteInputType[] $values() {
            return new VoteInputType[]{QUESTION, CHOICE};
        }

        static {
            VoteInputType[] voteInputTypeArr$values = $values();
            $VALUES = voteInputTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(voteInputTypeArr$values);
        }

        private VoteInputType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<VoteInputType> getEntries() {
            return $ENTRIES;
        }

        public static VoteInputType valueOf(String str) {
            return (VoteInputType) Enum.valueOf(VoteInputType.class, str);
        }

        public static VoteInputType[] values() {
            return (VoteInputType[]) $VALUES.clone();
        }
    }

    public VoteOptionsInputItem(@NotNull Context context, @NotNull InterfaceC8621d interfaceC8621d, @NotNull CommandsPanel.Panel.Form form, @NotNull VoteInputType voteInputType, @Nullable Integer num) {
        super(context);
        this.f81107a = context;
        this.f81108b = interfaceC8621d;
        this.f81109c = form;
        this.f81110d = voteInputType;
        this.f81111e = num;
        AbstractC8618a abstractC8618aB = interfaceC8621d.b();
        this.f81112f = abstractC8618aB instanceof C8918a ? (C8918a) abstractC8618aB : null;
        this.f81113g = "";
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.inflate(context, 2131496307, this);
        this.h = (TextView) findViewById(2131308958);
        this.f81114i = (TextView) findViewById(2131303711);
        this.f81115j = (TextView) findViewById(2131299492);
        this.f81116k = (ImageView) findViewById(2131301913);
    }

    @Override // sr0.InterfaceC8622e
    public final void b(@Nullable CommandsPanel.Panel.Form form, @NotNull String str) {
        if (form == this.f81109c) {
            d(str);
        }
    }

    @Override // sr0.InterfaceC8622e
    public final boolean c() {
        return !StringsKt.isBlank(this.f81113g);
    }

    public final void d(String str) {
        String strC = C9002b.c(this.f81109c.getLimit(), str);
        this.f81113g = strC;
        TextView textView = this.f81114i;
        if (textView != null) {
            textView.setText(strC);
        }
        TextView textView2 = this.f81115j;
        if (textView2 != null) {
            textView2.setText(this.f81107a.getString(2131827526, Integer.valueOf(C9002b.b(strC) / 2), Integer.valueOf(this.f81109c.getLimit())));
        }
    }

    @NotNull
    public final String getDraft$playerbizcommonv2_release() {
        return this.f81113g;
    }

    @NotNull
    public final CommandsPanel.Panel.Form getForm$playerbizcommonv2_release() {
        return this.f81109c;
    }

    @Override // sr0.InterfaceC8622e
    public final void onAttach() {
        List<VoteOptionsInputItem> voteInputItems$playerbizcommonv2_release;
        String strA;
        C8918a c8918a = this.f81112f;
        if (c8918a == null || (voteInputItems$playerbizcommonv2_release = c8918a.getVoteInputItems$playerbizcommonv2_release()) == null) {
            return;
        }
        CommandsPanel.Panel.Form form = this.f81109c;
        int iIndexOf = voteInputItems$playerbizcommonv2_release.indexOf(this);
        if (this.f81110d == VoteInputType.QUESTION) {
            ImageView imageView = this.f81116k;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            setPadding(0, 0, 0, 0);
            form.setPlaceholder(this.f81107a.getString(2131845811, Integer.valueOf(form.getLimit())));
            strA = "问题";
        } else {
            setPadding(0, 0, ScreenUtil.dip2px(this.f81107a, 107.0f), 0);
            if (iIndexOf > 2) {
                ImageView imageView2 = this.f81116k;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new c(this, 5));
                    imageView2.setVisibility(0);
                }
            } else {
                ImageView imageView3 = this.f81116k;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(null);
                    imageView3.setVisibility(4);
                }
            }
            strA = C3259x.a(RangesKt.coerceAtLeast(iIndexOf, 1), "选项");
            form.setPlaceholder(this.f81107a.getString(2131845866, Integer.valueOf(iIndexOf), Integer.valueOf(form.getLimit())));
        }
        TextView textView = this.h;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            int iIntValue = -2;
            layoutParams.height = -2;
            Integer num = this.f81111e;
            if (num != null) {
                iIntValue = num.intValue();
            }
            layoutParams.width = iIntValue;
            textView.setLayoutParams(layoutParams);
            textView.setText(strA);
        }
        TextView textView2 = this.f81114i;
        if (textView2 != null) {
            textView2.setHint(form.getTips());
        }
        d(C9002b.c(form.getLimit(), this.f81113g));
        TextView textView3 = this.f81115j;
        if (textView3 != null) {
            int i7 = 8;
            if (form.getLimit() > 0) {
                i7 = 0;
            }
            textView3.setVisibility(i7);
        }
        TextView textView4 = this.f81114i;
        if (textView4 != null) {
            textView4.setOnClickListener(new t(1, this, form));
        }
    }

    @Override // sr0.InterfaceC8622e
    public final void onDetach() {
    }
}
