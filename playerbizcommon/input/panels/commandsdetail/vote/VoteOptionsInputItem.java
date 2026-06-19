package com.bilibili.playerbizcommon.input.panels.commandsdetail.vote;

import Fq0.b;
import Fq0.f;
import Fq0.g;
import Jq0.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C3259x;
import com.bilibili.playerbizcommon.input.panels.commandsdetail.vote.VoteOptionsInputItem;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsPanel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/vote/VoteOptionsInputItem.class */
public final class VoteOptionsInputItem extends FrameLayout implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f80164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f80165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CommandsPanel.Panel.Form f80166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final VoteInputType f80167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f80168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Jq0.a f80169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f80170g;

    @Nullable
    public final TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final TextView f80171i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final TextView f80172j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final ImageView f80173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final TextView f80174l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/commandsdetail/vote/VoteOptionsInputItem$VoteInputType.class */
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

    public VoteOptionsInputItem(@NotNull Context context, @NotNull f fVar, @NotNull CommandsPanel.Panel.Form form, @NotNull VoteInputType voteInputType, @Nullable Integer num) {
        super(context);
        this.f80164a = context;
        this.f80165b = fVar;
        this.f80166c = form;
        this.f80167d = voteInputType;
        this.f80168e = num;
        b bVarB = fVar.b();
        this.f80169f = bVarB instanceof Jq0.a ? (Jq0.a) bVarB : null;
        this.f80170g = "";
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.inflate(context, 2131496306, this);
        this.h = (TextView) findViewById(2131308958);
        this.f80171i = (TextView) findViewById(2131303711);
        this.f80172j = (TextView) findViewById(2131299492);
        this.f80173k = (ImageView) findViewById(2131301913);
        this.f80174l = (TextView) findViewById(2131301911);
    }

    @Override // Fq0.g
    public final void b(@Nullable CommandsPanel.Panel.Form form, @NotNull String str) {
        if (form == this.f80166c) {
            d(str);
        }
    }

    @Override // Fq0.g
    public final boolean c() {
        return !StringsKt.isBlank(this.f80170g);
    }

    public final void d(String str) {
        String strC = Sq0.a.c(this.f80166c.getLimit(), str);
        this.f80170g = strC;
        TextView textView = this.f80171i;
        if (textView != null) {
            textView.setText(strC);
        }
        TextView textView2 = this.f80172j;
        if (textView2 != null) {
            textView2.setText(this.f80164a.getString(2131827526, Integer.valueOf(Sq0.a.b(strC) / 2), Integer.valueOf(this.f80166c.getLimit())));
        }
    }

    @NotNull
    public final String getDraft$playerbizcommon_apinkRelease() {
        return this.f80170g;
    }

    @NotNull
    public final CommandsPanel.Panel.Form getForm$playerbizcommon_apinkRelease() {
        return this.f80166c;
    }

    @Override // Fq0.g
    public final void onAttach() {
        List<VoteOptionsInputItem> voteInputItems$playerbizcommon_apinkRelease;
        String strA;
        Jq0.a aVar = this.f80169f;
        if (aVar == null || (voteInputItems$playerbizcommon_apinkRelease = aVar.getVoteInputItems$playerbizcommon_apinkRelease()) == null) {
            return;
        }
        final CommandsPanel.Panel.Form form = this.f80166c;
        final int iIndexOf = voteInputItems$playerbizcommon_apinkRelease.indexOf(this);
        if (this.f80167d == VoteInputType.QUESTION) {
            ImageView imageView = this.f80173k;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.f80174l;
            if (textView != null) {
                textView.setVisibility(8);
            }
            form.setPlaceholder(this.f80164a.getString(2131845811, Integer.valueOf(form.getLimit())));
            strA = "问题";
        } else {
            if (iIndexOf > 2) {
                ImageView imageView2 = this.f80173k;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new h(this, 0));
                    imageView2.setVisibility(0);
                }
            } else {
                ImageView imageView3 = this.f80173k;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(null);
                    imageView3.setVisibility(4);
                }
            }
            if (iIndexOf != voteInputItems$playerbizcommon_apinkRelease.size() - 1 || 2 > iIndexOf || iIndexOf >= 4) {
                TextView textView2 = this.f80174l;
                if (textView2 != null) {
                    textView2.setOnClickListener(null);
                    textView2.setText(textView2.getContext().getString(2131846875, Integer.valueOf(iIndexOf)));
                    textView2.setVisibility(4);
                }
            } else {
                final TextView textView3 = this.f80174l;
                if (textView3 != null) {
                    textView3.setOnClickListener(new View.OnClickListener(textView3, this, iIndexOf) { // from class: Jq0.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final TextView f11624a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final VoteOptionsInputItem f11625b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final int f11626c;

                        {
                            this.f11624a = textView3;
                            this.f11625b = this;
                            this.f11626c = iIndexOf;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TextView textView4 = this.f11624a;
                            VoteOptionsInputItem voteOptionsInputItem = this.f11625b;
                            int i7 = this.f11626c;
                            Context context = textView4.getContext();
                            Fq0.f fVar = voteOptionsInputItem.f80165b;
                            new CommandsPanel.Panel.Form();
                            VoteOptionsInputItem.VoteInputType voteInputType = VoteOptionsInputItem.VoteInputType.QUESTION;
                            int px = NewPlayerUtilsKt.toPx(32.0f);
                            VoteOptionsInputItem.VoteInputType voteInputType2 = VoteOptionsInputItem.VoteInputType.CHOICE;
                            CommandsPanel.Panel.Form form2 = new CommandsPanel.Panel.Form();
                            form2.setLimit(6);
                            form2.setTips(textView4.getContext().getString(2131847434));
                            form2.setPlaceholder(textView4.getContext().getString(2131845866, Integer.valueOf(i7 + 1), Integer.valueOf(form2.getLimit())));
                            VoteOptionsInputItem voteOptionsInputItem2 = new VoteOptionsInputItem(context, fVar, form2, voteInputType2, Integer.valueOf(px));
                            if (!voteOptionsInputItem.f80169f.getCustomCheck$playerbizcommon_apinkRelease()) {
                                com.bilibili.playerbizcommon.input.panels.commandsdetail.vote.a aVar2 = voteOptionsInputItem.f80169f.f11605f;
                                if (aVar2 != null) {
                                    aVar2.d(true, voteOptionsInputItem2);
                                    return;
                                }
                                return;
                            }
                            voteOptionsInputItem.f80169f.d(false);
                            com.bilibili.playerbizcommon.input.panels.commandsdetail.vote.a aVar3 = voteOptionsInputItem.f80169f.f11605f;
                            if (aVar3 != null) {
                                aVar3.d(true, voteOptionsInputItem2);
                            }
                            voteOptionsInputItem.f80169f.d(true);
                        }
                    });
                    textView3.setText(textView3.getContext().getString(2131846875, Integer.valueOf(iIndexOf)));
                    textView3.setVisibility(0);
                }
            }
            strA = C3259x.a(RangesKt.coerceAtLeast(iIndexOf, 1), "选项");
            form.setPlaceholder(this.f80164a.getString(2131845866, Integer.valueOf(iIndexOf), Integer.valueOf(form.getLimit())));
        }
        TextView textView4 = this.h;
        if (textView4 != null) {
            ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
            int iIntValue = -2;
            layoutParams.height = -2;
            Integer num = this.f80168e;
            if (num != null) {
                iIntValue = num.intValue();
            }
            layoutParams.width = iIntValue;
            textView4.setLayoutParams(layoutParams);
            textView4.setText(strA);
        }
        TextView textView5 = this.f80171i;
        if (textView5 != null) {
            textView5.setHint(form.getTips());
        }
        d(Sq0.a.c(form.getLimit(), this.f80170g));
        TextView textView6 = this.f80172j;
        if (textView6 != null) {
            textView6.setVisibility(form.getLimit() > 0 ? 0 : 8);
        }
        TextView textView7 = this.f80171i;
        if (textView7 != null) {
            textView7.setOnClickListener(new View.OnClickListener(this, form) { // from class: Jq0.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VoteOptionsInputItem f11627a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CommandsPanel.Panel.Form f11628b;

                {
                    this.f11627a = this;
                    this.f11628b = form;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VoteOptionsInputItem voteOptionsInputItem = this.f11627a;
                    voteOptionsInputItem.f80165b.h(this.f11628b, voteOptionsInputItem.f80170g);
                }
            });
        }
    }

    @Override // Fq0.g
    public final void onDetach() {
    }
}
