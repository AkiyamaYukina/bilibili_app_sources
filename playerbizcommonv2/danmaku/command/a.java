package com.bilibili.playerbizcommonv2.danmaku.command;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bplus.im.conversation.s0;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.playerbizcommonv2.danmaku.command.a;
import com.bilibili.playerbizcommonv2.danmaku.widget.A;
import java.util.ArrayList;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import q4.M;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.utils.TimeFormater;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/command/a.class */
@StabilityInferred(parameters = 0)
public final class a extends RecyclerView.Adapter<C0526a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<CommandsDanmaku> f80830a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f80831b;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.command.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/command/a$a.class */
    public final class C0526a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f80832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StaticImageView2 f80833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f80834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final View f80835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final View f80836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f80837f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0526a(@NotNull a aVar, View view) {
            super(view);
            this.f80837f = aVar;
            this.f80832a = (TextView) view.findViewById(2131299879);
            this.f80833b = view.findViewById(2131299177);
            this.f80834c = (TextView) view.findViewById(2131299180);
            this.f80835d = view.findViewById(2131299959);
            this.f80836e = view.findViewById(2131310159);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/command/a$b.class */
    public interface b {
        void H(@NotNull CommandsDanmaku commandsDanmaku);

        void b(@NotNull CommandsDanmaku commandsDanmaku);

        default void y(@NotNull CommandsDanmaku commandsDanmaku) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f80830a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        C0526a c0526a = (C0526a) viewHolder;
        if (i7 < 0 || i7 >= this.f80830a.size()) {
            return;
        }
        StaticImageView2 staticImageView2 = c0526a.f80833b;
        a aVar = c0526a.f80837f;
        CommandsDanmaku commandsDanmaku = aVar.f80830a.get(i7);
        c0526a.f80832a.setText(TimeFormater.INSTANCE.formatTime(commandsDanmaku.getProgress(), false, true));
        TextView textView = c0526a.f80834c;
        String content = commandsDanmaku.getContent();
        if (content == null) {
            content = "";
        }
        textView.setText(content);
        try {
            String extra = commandsDanmaku.getExtra();
            if (extra == null) {
                extra = "";
            }
            JSONObject jSONObject = new JSONObject(extra);
            if (jSONObject.has("icon")) {
                ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(staticImageView2.getContext()).roundingParams(RoundingParams.Companion.asCircle()), 2131233999, (ScaleType) null, 2, (Object) null).url(jSONObject.getString("icon")).into(staticImageView2);
            }
        } catch (Exception e7) {
            M.b("parse command danmaku icon title error ", e7.getMessage(), "CommandDanmakuListAdapter");
        }
        if (commandsDanmaku.getMid() == BiliAccounts.get(c0526a.itemView.getContext()).mid()) {
            c0526a.f80835d.setVisibility(0);
            c0526a.f80836e.setVisibility(8);
        } else {
            c0526a.f80836e.setVisibility(0);
            c0526a.f80835d.setVisibility(8);
        }
        c0526a.itemView.setOnClickListener(new s0(1, aVar, commandsDanmaku));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        final C0526a c0526a = new C0526a(this, p.a(viewGroup, 2131496299, viewGroup, false));
        c0526a.f80835d.setOnClickListener(new View.OnClickListener(c0526a, this) { // from class: mr0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.C0526a f123856a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.playerbizcommonv2.danmaku.command.a f123857b;

            {
                this.f123856a = c0526a;
                this.f123857b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentActivity fragmentActivityFindFragmentActivityOrNull;
                a.C0526a c0526a2 = this.f123856a;
                final com.bilibili.playerbizcommonv2.danmaku.command.a aVar = this.f123857b;
                int adapterPosition = c0526a2.getAdapterPosition();
                if (adapterPosition < 0 || adapterPosition >= aVar.f80830a.size()) {
                    return;
                }
                Context context = c0526a2.itemView.getContext();
                final CommandsDanmaku commandsDanmaku = (CommandsDanmaku) CollectionsKt.getOrNull(aVar.f80830a, adapterPosition);
                if (commandsDanmaku == null || (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(context)) == null) {
                    return;
                }
                String extra = commandsDanmaku.getExtra();
                String str = null;
                if (extra != null) {
                    String str2 = !StringsKt.isBlank(extra) ? extra : null;
                    if (str2 == null) {
                        str = null;
                    } else {
                        try {
                            String string = StringsKt.trim(new JSONObject(str2).optString("delete_desc")).toString();
                            str = null;
                            if (!StringsKt.isBlank(string)) {
                                str = string;
                            }
                        } catch (Exception e7) {
                            M.b("parse command danmaku delete desc error ", e7.getMessage(), "CommandDanmakuListAdapter");
                            str = null;
                        }
                    }
                }
                if (str == null) {
                    str = "";
                }
                new A(fragmentActivityFindFragmentActivityOrNull, fragmentActivityFindFragmentActivityOrNull.getString(2131846755), str, fragmentActivityFindFragmentActivityOrNull.getString(2131841494), fragmentActivityFindFragmentActivityOrNull.getString(2131858312), 0, 0, 0, new Function0(aVar, commandsDanmaku) { // from class: mr0.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final com.bilibili.playerbizcommonv2.danmaku.command.a f123860a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final CommandsDanmaku f123861b;

                    {
                        this.f123860a = aVar;
                        this.f123861b = commandsDanmaku;
                    }

                    public final Object invoke() {
                        a.b bVar = this.f123860a.f80831b;
                        if (bVar != null) {
                            bVar.H(this.f123861b);
                        }
                        return Unit.INSTANCE;
                    }
                }, null, 3040).show();
            }
        });
        c0526a.f80836e.setOnClickListener(new View.OnClickListener(c0526a, this) { // from class: mr0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.C0526a f123858a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.playerbizcommonv2.danmaku.command.a f123859b;

            {
                this.f123858a = c0526a;
                this.f123859b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.b bVar;
                a.C0526a c0526a2 = this.f123858a;
                com.bilibili.playerbizcommonv2.danmaku.command.a aVar = this.f123859b;
                int adapterPosition = c0526a2.getAdapterPosition();
                if (adapterPosition < 0 || adapterPosition >= aVar.f80830a.size() || (bVar = aVar.f80831b) == null) {
                    return;
                }
                bVar.y(aVar.f80830a.get(adapterPosition));
            }
        });
        return c0526a;
    }
}
