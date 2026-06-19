package com.bilibili.ship.theseus.ogv.activity.countdown;

import Qj0.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.provider.UtilKt;
import com.bilibili.biligame.story.widget.button.StoryGameActionButton;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.ship.theseus.ogv.activity.VipWatchingCountdownTaskVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.video.story.StoryDetail;
import com.bilibili.video.story.X;
import com.bilibili.video.story.action.widget.StoryRouterWidget;
import com.bilibili.video.story.helper.I;
import com.bilibili.video.story.helper.J;
import com.bilibili.video.story.helper.O;
import com.bilibili.video.story.player.m;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/b.class */
@StabilityInferred(parameters = 0)
public final class b extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f91535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final VipWatchingCountdownTaskVo f91536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f91538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f91539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Group f91540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Group f91541g;

    @NotNull
    public final TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ProgressBar f91542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TextView f91543j;

    public b(@NotNull Context context, @NotNull VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo, boolean z6, @NotNull PageReportService pageReportService) {
        super(context);
        this.f91535a = context;
        this.f91536b = vipWatchingCountdownTaskVo;
        this.f91537c = z6;
        this.f91538d = pageReportService;
        View viewInflate = LayoutInflater.from(context).inflate(z6 ? 2131500343 : 2131500342, (ViewGroup) null);
        this.f91539e = viewInflate;
        this.f91540f = (Group) viewInflate.findViewById(2131302385);
        this.f91541g = (Group) viewInflate.findViewById(2131302383);
        this.h = (TextView) viewInflate.findViewById(2131313938);
        this.f91542i = (ProgressBar) viewInflate.findViewById(2131309301);
        TextView textView = (TextView) viewInflate.findViewById(2131313935);
        this.f91543j = textView;
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        a(0L, vipWatchingCountdownTaskVo.e());
        final int i7 = 0;
        textView.setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.ship.theseus.ogv.activity.countdown.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f91533a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f91534b;

            {
                this.f91533a = i7;
                this.f91534b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m player;
                switch (this.f91533a) {
                    case 0:
                        b bVar = (b) this.f91534b;
                        if (bVar.f91536b.c().length() > 0) {
                            PageReportService.g(bVar.f91538d, "united.player-video-detail.taskcountdown-off.0.click", null, 6);
                            g.c(view.getContext(), RouteRequestKt.toRouteRequest(bVar.f91536b.c()));
                        }
                        break;
                    case 1:
                        StoryRouterWidget storyRouterWidget = (StoryRouterWidget) this.f91534b;
                        int i8 = StoryRouterWidget.r;
                        Context context2 = storyRouterWidget.getContext();
                        com.bilibili.video.story.action.g gVar = storyRouterWidget.m;
                        boolean z7 = storyRouterWidget.o;
                        FragmentActivity fragmentActivityFindFragmentActivityOrNull = UtilKt.findFragmentActivityOrNull(context2);
                        if (fragmentActivityFindFragmentActivityOrNull != null && gVar != null && (player = gVar.getPlayer()) != null) {
                            O.a commonReportInfo = gVar.getCommonReportInfo();
                            StoryDetail data = gVar.getData();
                            long materialId = data != null ? data.getMaterialId() : 0L;
                            HashMap mapB = X.b(commonReportInfo);
                            if (materialId > 0) {
                                mapB.put("highlight_cut_id", String.valueOf(materialId));
                            }
                            Neurons.reportClick(false, "main.ugc-video-detail-vertical.detail-button.0.click", mapB);
                            Pattern pattern = KJ0.a.a;
                            if (KJ0.a.f(fragmentActivityFindFragmentActivityOrNull.getIntent().getExtras()) != 2) {
                                int iW0 = player.w0();
                                if (com.bilibili.player.tangram.basic.a.b(iW0, SearchBangumiItem.TYPE_FULLNET_DOCUMENTARY) || com.bilibili.player.tangram.basic.a.b(iW0, 129) || com.bilibili.player.tangram.basic.a.b(iW0, SearchBangumiItem.TYPE_FULLNET_MOVIE)) {
                                    J.F(fragmentActivityFindFragmentActivityOrNull, gVar, z7, context2, false, 0L, (Bitmap) null);
                                } else {
                                    player.z(new I(fragmentActivityFindFragmentActivityOrNull, gVar, z7, context2, false, 0L));
                                }
                            } else {
                                player.Q(MapsKt.mapOf(new Pair[]{TuplesKt.to("from_story_bottom_drag", "0"), TuplesKt.to("tab_name", "introduction"), TuplesKt.to("exposed_comment_ids", "[0]"), TuplesKt.to("force_horizon_ratio", "false"), TuplesKt.to("from_spmid", "main.ugc-video-detail-vertical.0.0")}));
                                fragmentActivityFindFragmentActivityOrNull.finish();
                                fragmentActivityFindFragmentActivityOrNull.overridePendingTransition(0, 2130772359);
                            }
                        }
                        break;
                    default:
                        StoryGameActionButton storyGameActionButton = (StoryGameActionButton) this.f91534b;
                        storyGameActionButton.b.cardButtonClick(storyGameActionButton.e, storyGameActionButton.f);
                        break;
                }
            }
        });
    }

    public final void a(long j7, long j8) {
        String string;
        this.f91540f.setVisibility(0);
        this.f91541g.setVisibility(8);
        this.f91542i.setProgress((int) j7);
        this.f91542i.setMax((int) j8);
        TextView textView = this.h;
        String strB = this.f91536b.b();
        long j9 = j8 - j7;
        if (j9 <= 0) {
            string = this.f91535a.getString(2131854850, "00");
        } else {
            DecimalFormat decimalFormat = new DecimalFormat("#00");
            long j10 = j9 / ((long) 1000);
            long j11 = 60;
            long j12 = j10 / j11;
            long j13 = j10 % j11;
            string = j12 > 0 ? this.f91535a.getString(2131854846, decimalFormat.format(j12), decimalFormat.format(j13)) : this.f91535a.getString(2131854850, decimalFormat.format(j13));
        }
        textView.setText(StringsKt.L(strB, "${time}", string));
    }
}
