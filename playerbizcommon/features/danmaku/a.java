package com.bilibili.playerbizcommon.features.danmaku;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.videoliveplayer.net.beans.rank.BiliLiveMobileRank;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.RoundingParams;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.view.legacy.StaticImageView2;
import com.bilibili.playerbizcommon.features.danmaku.a;
import java.util.ArrayList;
import kntr.base.android.legacy.context.ContextUtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import q4.M;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dialog.BiliCommonDialog;
import tv.danmaku.bili.widget.dialog.CustomButtonInfo;
import tv.danmaku.biliplayerv2.service.interact.core.command.CommandsDanmaku;
import tv.danmaku.biliplayerv2.utils.TimeFormater;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/a.class */
public final class a extends RecyclerView.Adapter<C0517a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<CommandsDanmaku> f79629a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f79630b;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.danmaku.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/a$a.class */
    public final class C0517a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f79631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StaticImageView2 f79632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f79633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final View f79634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final View f79635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f79636f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0517a(@NotNull a aVar, View view) {
            super(view);
            this.f79636f = aVar;
            this.f79631a = (TextView) view.findViewById(2131299879);
            this.f79632b = view.findViewById(2131299177);
            this.f79633c = (TextView) view.findViewById(2131299180);
            this.f79634d = view.findViewById(2131299959);
            this.f79635e = view.findViewById(2131310159);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/a$b.class */
    public interface b {
        void H(@NotNull CommandsDanmaku commandsDanmaku);

        void b(@NotNull CommandsDanmaku commandsDanmaku);

        default void y(@NotNull CommandsDanmaku commandsDanmaku) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f79629a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        C0517a c0517a = (C0517a) viewHolder;
        if (i7 < 0 || i7 >= this.f79629a.size()) {
            return;
        }
        StaticImageView2 staticImageView2 = c0517a.f79632b;
        final a aVar = c0517a.f79636f;
        final CommandsDanmaku commandsDanmaku = aVar.f79629a.get(i7);
        c0517a.f79631a.setText(TimeFormater.INSTANCE.formatTime(commandsDanmaku.getProgress(), false, true));
        TextView textView = c0517a.f79633c;
        String content = commandsDanmaku.getContent();
        if (content == null) {
            content = "";
        }
        textView.setText(content);
        try {
            String extra = commandsDanmaku.getExtra();
            if (extra != null) {
                JSONObject jSONObject = new JSONObject(extra);
                if (jSONObject.has("icon")) {
                    ImageRequestBuilder.placeholderImageResId$default(BiliImageLoader.INSTANCE.with(staticImageView2.getContext()).roundingParams(RoundingParams.Companion.asCircle()), 2131233999, (ScaleType) null, 2, (Object) null).url(jSONObject.getString("icon")).into(staticImageView2);
                }
            }
        } catch (Exception e7) {
            M.b("parse command danmaku icon title error ", e7.getMessage(), "CommandDanmakuListAdapter");
        }
        if (commandsDanmaku.getMid() == BiliAccounts.get(c0517a.itemView.getContext()).mid()) {
            c0517a.f79634d.setVisibility(0);
            c0517a.f79635e.setVisibility(8);
        } else {
            c0517a.f79635e.setVisibility(0);
            c0517a.f79634d.setVisibility(8);
        }
        final int i8 = 0;
        c0517a.itemView.setOnClickListener(new View.OnClickListener(i8, aVar, commandsDanmaku) { // from class: oq0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f124888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f124889b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f124890c;

            {
                this.f124888a = i8;
                this.f124889b = aVar;
                this.f124890c = commandsDanmaku;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f124888a) {
                    case 0:
                        com.bilibili.playerbizcommon.features.danmaku.a aVar2 = (com.bilibili.playerbizcommon.features.danmaku.a) this.f124889b;
                        CommandsDanmaku commandsDanmaku2 = (CommandsDanmaku) this.f124890c;
                        a.b bVar = aVar2.f79630b;
                        if (bVar != null) {
                            bVar.b(commandsDanmaku2);
                        }
                        break;
                    default:
                        wH.d dVar = (wH.d) this.f124889b;
                        BiliLiveMobileRank.RankItem rankItem = (BiliLiveMobileRank.RankItem) this.f124890c;
                        LiveLog.Companion companion = LiveLog.Companion;
                        if (companion.matchLevel(3)) {
                            String str = "medal_info OnClick" == 0 ? "" : "medal_info OnClick";
                            LiveLogDelegate logDelegate = companion.getLogDelegate();
                            if (logDelegate != null) {
                                LiveLogDelegate.onLog$default(logDelegate, 3, "BaseCoinRankHolder", str, (Throwable) null, 8, (Object) null);
                            }
                            BLog.i("BaseCoinRankHolder", str);
                        }
                        dVar.c.invoke(Long.valueOf(rankItem.getUid()));
                        break;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i7) {
        final C0517a c0517a = new C0517a(this, p.a(viewGroup, 2131496298, viewGroup, false));
        c0517a.f79634d.setOnClickListener(new View.OnClickListener(c0517a, this) { // from class: oq0.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.C0517a f124882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.playerbizcommon.features.danmaku.a f124883b;

            {
                this.f124882a = c0517a;
                this.f124883b = this;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tv.danmaku.bili.widget.dialog.BiliCommonDialog$OnDialogTextClickListener] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentActivity fragmentActivityFindFragmentActivityOrNull;
                a.C0517a c0517a2 = this.f124882a;
                final com.bilibili.playerbizcommon.features.danmaku.a aVar = this.f124883b;
                final int adapterPosition = c0517a2.getAdapterPosition();
                if (adapterPosition < 0 || adapterPosition >= aVar.f79629a.size() || (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(c0517a2.itemView.getContext())) == null) {
                    return;
                }
                BiliCommonDialog.Builder builder = new BiliCommonDialog.Builder(fragmentActivityFindFragmentActivityOrNull);
                BiliCommonDialog.Builder.setPositiveButton$default(BiliCommonDialog.Builder.setNegativeButton$default(builder.setContentText(fragmentActivityFindFragmentActivityOrNull.getString(2131846755)).setCanceledOnTouchOutside(true), 2131841494, (BiliCommonDialog.OnDialogTextClickListener) new Object(), false, (CustomButtonInfo) null, 12, (Object) null), 2131841455, new BiliCommonDialog.OnDialogTextClickListener(aVar, adapterPosition) { // from class: oq0.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final com.bilibili.playerbizcommon.features.danmaku.a f124886a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final int f124887b;

                    {
                        this.f124886a = aVar;
                        this.f124887b = adapterPosition;
                    }

                    public final void onDialogTextClicked(View view2, BiliCommonDialog biliCommonDialog) {
                        biliCommonDialog.dismiss();
                        com.bilibili.playerbizcommon.features.danmaku.a aVar2 = this.f124886a;
                        a.b bVar = aVar2.f79630b;
                        if (bVar != null) {
                            bVar.H(aVar2.f79629a.get(this.f124887b));
                        }
                    }
                }, false, (CustomButtonInfo) null, 12, (Object) null);
                builder.build().show(fragmentActivityFindFragmentActivityOrNull.getSupportFragmentManager(), "deleteCommandDmConfirmDialog");
            }
        });
        c0517a.f79635e.setOnClickListener(new View.OnClickListener(c0517a, this) { // from class: oq0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.C0517a f124884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.playerbizcommon.features.danmaku.a f124885b;

            {
                this.f124884a = c0517a;
                this.f124885b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.b bVar;
                a.C0517a c0517a2 = this.f124884a;
                com.bilibili.playerbizcommon.features.danmaku.a aVar = this.f124885b;
                int adapterPosition = c0517a2.getAdapterPosition();
                if (adapterPosition < 0 || adapterPosition >= aVar.f79629a.size() || (bVar = aVar.f79630b) == null) {
                    return;
                }
                bVar.y(aVar.f79629a.get(adapterPosition));
            }
        });
        return c0517a;
    }
}
