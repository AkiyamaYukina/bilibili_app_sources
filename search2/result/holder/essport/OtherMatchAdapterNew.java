package com.bilibili.search2.result.holder.essport;

import HD0.L;
import Ps0.C2790k;
import Ps0.C2793n;
import Xs0.b;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bililive.room.ui.matchcard.views.N;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.SearchSportItem;
import com.bilibili.search2.result.all.AbstractC6048b;
import dt0.AbstractC6839b;
import dt0.AbstractC6843f;
import ec.c;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kt0.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/essport/OtherMatchAdapterNew.class */
@StabilityInferred(parameters = 0)
public final class OtherMatchAdapterNew extends AbstractC6048b<MatchHolder, SearchSportItem.MatchInfoObj> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SearchSportItem f88143b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/essport/OtherMatchAdapterNew$MatchHolder.class */
    @StabilityInferred(parameters = 0)
    public static final class MatchHolder extends AbstractC6843f<SearchSportItem.MatchInfoObj> {
        public static final int $stable = 8;

        @NotNull
        public static final a Companion = new Object();

        @Nullable
        private TintTextView leftTeamName;

        @NotNull
        private final TintTextView[] mClickStatusArray;

        @Nullable
        private TintTextView matchBtn;

        @Nullable
        private View matchBtnContainer;

        @Nullable
        private BiliImageView matchBtnIcon;

        @Nullable
        private final SearchSportItem matchData;

        @Nullable
        private TintTextView matchTimeView;

        @Nullable
        private TintTextView rightTeamName;

        @Nullable
        private TintTextView scoreTextView;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/essport/OtherMatchAdapterNew$MatchHolder$a.class */
        public static final class a {
        }

        public MatchHolder(@NotNull View view, @Nullable SearchSportItem searchSportItem) {
            super(view);
            this.matchData = searchSportItem;
            this.matchTimeView = (TintTextView) view.findViewById(2131307261);
            this.matchBtn = (TintTextView) view.findViewById(2131301093);
            this.matchBtnContainer = view.findViewById(2131301094);
            this.matchBtnIcon = view.findViewById(2131304102);
            this.leftTeamName = (TintTextView) view.findViewById(2131313035);
            this.rightTeamName = (TintTextView) view.findViewById(2131313036);
            TintTextView tintTextView = (TintTextView) view.findViewById(2131307259);
            this.scoreTextView = tintTextView;
            this.mClickStatusArray = new TintTextView[]{this.matchTimeView, this.leftTeamName, this.rightTeamName, tintTextView};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$1$0(MatchHolder matchHolder) {
            matchHolder.clickWithRefreshStatusViews(matchHolder.mClickStatusArray);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void bind$lambda$6(MatchHolder matchHolder, View view) {
            String jumpUri;
            SearchSportItem.MatchInfoObj.MatchButton matchButton = ((SearchSportItem.MatchInfoObj) matchHolder.getData()).getMatchButton();
            if (matchButton == null || (jumpUri = matchButton.getJumpUri()) == null) {
                return;
            }
            matchHolder.clickWithRefreshStatusViews(matchHolder.mClickStatusArray);
            BLRouter.routeTo(c.a(jumpUri), matchHolder.itemView.getContext());
            String linkType = ((SearchSportItem.MatchInfoObj) matchHolder.getData()).getLinkType();
            SearchSportItem searchSportItem = matchHolder.matchData;
            long id = ((SearchSportItem.MatchInfoObj) matchHolder.getData()).getId();
            int adapterPosition = matchHolder.getAdapterPosition();
            String strD = b.d(matchHolder.matchData, "more", null, 2);
            f fVar = f.f122981a;
            C2790k matchGuess = matchHolder.matchData.getMatchGuess();
            C2793n playerGrade = matchHolder.matchData.getPlayerGrade();
            fVar.getClass();
            b.i("search.search-result.search-card.all.click", null, linkType, searchSportItem, String.valueOf(id), String.valueOf(adapterPosition + 1), strD, null, null, MapsKt.mapOf(TuplesKt.to("text_type", (matchGuess == null || !matchGuess.a()) ? playerGrade != null ? "1" : "0" : "2")), false, null, 7040);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dt0.AbstractC6839b
        public void bind() {
            if (this.matchData == null) {
                return;
            }
            TintTextView tintTextView = this.matchTimeView;
            String scoreStr = null;
            if (tintTextView != null) {
                SearchSportItem.MatchInfoObj.MatchLabel matchTime = ((SearchSportItem.MatchInfoObj) getData()).getMatchTime();
                tintTextView.setText(matchTime != null ? matchTime.getText() : null);
            }
            TintTextView tintTextView2 = this.matchBtn;
            if (tintTextView2 != null) {
                f fVar = f.f122981a;
                View view = this.matchBtnContainer;
                BiliImageView biliImageView = this.matchBtnIcon;
                SearchSportItem.MatchInfoObj matchInfoObj = (SearchSportItem.MatchInfoObj) getData();
                int adapterPosition = getAdapterPosition();
                SearchSportItem searchSportItem = this.matchData;
                L l7 = new L(this, 5);
                fVar.getClass();
                f.j(view, tintTextView2, biliImageView, matchInfoObj, false, adapterPosition + 1, searchSportItem, l7);
            }
            TintTextView tintTextView3 = this.leftTeamName;
            if (tintTextView3 != null) {
                SearchSportItem.MatchInfoObj.Team teamOne = ((SearchSportItem.MatchInfoObj) getData()).getTeamOne();
                tintTextView3.setText(teamOne != null ? teamOne.getTitle() : null);
            }
            TintTextView tintTextView4 = this.rightTeamName;
            if (tintTextView4 != null) {
                SearchSportItem.MatchInfoObj.Team teamTwo = ((SearchSportItem.MatchInfoObj) getData()).getTeamTwo();
                tintTextView4.setText(teamTwo != null ? teamTwo.getTitle() : null);
            }
            if (((SearchSportItem.MatchInfoObj) getData()).isPreView()) {
                TintTextView tintTextView5 = this.scoreTextView;
                if (tintTextView5 != null) {
                    Context context = tintTextView5.getContext();
                    String string = null;
                    if (context != null) {
                        string = context.getString(2131834325);
                    }
                    tintTextView5.setText(string);
                    tintTextView5.setTextColorById(R$color.Ga10);
                }
            } else {
                TintTextView tintTextView6 = this.scoreTextView;
                if (tintTextView6 != null) {
                    Context context2 = tintTextView6.getContext();
                    String string2 = null;
                    if (context2 != null) {
                        SearchSportItem.MatchInfoObj.Team teamOne2 = ((SearchSportItem.MatchInfoObj) getData()).getTeamOne();
                        String scoreStr2 = teamOne2 != null ? teamOne2.getScoreStr() : null;
                        SearchSportItem.MatchInfoObj.Team teamTwo2 = ((SearchSportItem.MatchInfoObj) getData()).getTeamTwo();
                        if (teamTwo2 != null) {
                            scoreStr = teamTwo2.getScoreStr();
                        }
                        string2 = context2.getString(2131834324, scoreStr2, scoreStr);
                    }
                    tintTextView6.setText(string2);
                    tintTextView6.setTextColorById(R$color.Ga10);
                }
            }
            this.itemView.setOnClickListener(new N(this, 1));
        }

        @Override // dt0.AbstractC6843f
        @Nullable
        public View[] getClickStatusViewArray() {
            return this.mClickStatusArray;
        }
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    public final AbstractC6839b P(int i7, ViewGroup viewGroup) {
        MatchHolder.a aVar = MatchHolder.Companion;
        SearchSportItem searchSportItem = this.f88143b;
        aVar.getClass();
        return new MatchHolder(p.a(viewGroup, 2131494768, viewGroup, false), searchSportItem);
    }
}
